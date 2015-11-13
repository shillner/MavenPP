package de.itemis.mpp.generator.processors

import com.google.common.base.Optional
import com.google.common.collect.Maps
import com.google.common.io.Closeables
import com.google.inject.Inject
import de.itemis.mpp.aether.ArtifactResolver
import de.itemis.mpp.generator.MppModelProcessor
import de.itemis.mpp.pom.FilePropertyInclusion
import de.itemis.mpp.pom.ImportPropertyInclusion
import de.itemis.mpp.pom.POM
import de.itemis.mpp.pom.Property
import de.itemis.mpp.pom.PropertyInclusion
import de.itemis.mpp.util.EMFUtil
import de.itemis.mpp.util.MavenModelUtil
import de.itemis.mpp.util.MppModelUtil
import java.io.File
import java.io.InputStream
import java.util.List
import java.util.Map
import java.util.Properties
import org.apache.maven.model.Model

//TODO preprocess first backed with a cache so that overrides can be achieved (locally specified properties should override imcluded ones!)
class MppPropertiesProcessor implements MppModelProcessor {
  @Inject
  var extension MppModelUtil modelUtil

  var Model model
  var POM pom
  var Map<String, String> propertiesCache;

  override process(POM pom, Model model) {
    this.model = model
    this.pom = pom
    this.propertiesCache = Maps.newHashMap

    //preprocessing of properties in the correct order
    val properties = pom.properties
    if(properties != null) {
      //processes the property inclusions first since the properties of the project must override them
      processPropertyInclusions(properties.inclusions)
      processProperties(pom.properties.properties)
    }
    
    //postprocessing of the properties (addition to the generated model)
    this.propertiesCache.entrySet.forEach[model.addProperty(it.key, it.value)]
  }

  def private void processPropertyInclusions(List<PropertyInclusion> inclusions) {
    if(inclusions != null) {
      inclusions.forEach[processPropertyInclusion]
    }
  }

  def private dispatch processPropertyInclusion(ImportPropertyInclusion inclusion) {
    val coordinates = inclusion.pomRef.coordinates
    includeProperties(coordinates.groupId, coordinates.artifactId, coordinates.version.convertToString)
  }

  def private dispatch processPropertyInclusion(FilePropertyInclusion inclusion) {
    var InputStream is;
    try {
      val Optional<InputStream> optionalIS = EMFUtil.createInputStream(inclusion.path, pom)
      if(optionalIS.present) {
        is = optionalIS.get
        val props = new Properties
        props.load(is)
        props.entrySet.forEach[propertiesCache.put(it.key.toString, it.value.toString)]
      // TODO remove
//        props.entrySet.forEach[model.addProperty(it.key.toString, it.value.toString)]
      } else {
        // TODO log error!
      }
    } finally {
      Closeables.closeQuietly(is)
    }
  }

  def private void processProperties(List<Property> properties) {
    if(properties != null) {
      properties.forEach[propertiesCache.put(it.name, it.value)]
    }
  }

  // TODO Needs to be refactored because of really bad structure!
  def private void includeProperties(String groupId, String artifactId, String version) {
    val Optional<File> resolvedArtifact = ArtifactResolver.resolveArtifact(groupId, artifactId, version,
      Optional.of("pom"), Optional.<String>absent(), Optional.of(pom.projectRepositories))
      
    if(resolvedArtifact.present) {
      val Optional<Model> importedModel = MavenModelUtil.loadModel(resolvedArtifact.get.absolutePath)
      
      if(importedModel.present) {
        //compute parent properties first from top to bottom! since the more specific build description overrides the more general ones!
        val parent = importedModel.get.getParent()
        if(parent != null) {
          includeProperties(parent.groupId, parent.artifactId, parent.version)
        }
        importedModel.get.properties.entrySet.forEach[propertiesCache.put(it.key.toString, it.value.toString)]
//TODO remove        
//        for (Object propertyKey : properties.keySet) {
//          model.addProperty(propertyKey as String, properties.get(propertyKey) as String)
//        }
      } else {
        // TODO error handling!
      }
    } else {
      // TODO error handling -> throw exception!
    }
  }
}