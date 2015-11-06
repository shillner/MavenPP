package de.itemis.mpp.generator.processors

import com.google.common.base.Optional
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
import java.util.Properties
import org.apache.maven.model.Model

class MppPropertiesProcessor implements MppModelProcessor {
  @Inject
  var extension MppModelUtil modelUtil

  var Model model
  var POM pom

  override process(POM pom, Model model) {
    this.model = model
    this.pom = pom

    // Property inclusions have to be processed before the properties since local properties must override included ones.
    // TODO maybe preprocess properties and inclusions (create a map) and resolve overriding this way before adding the properties to the model
    val properties = pom.properties
    if(properties != null) {
      processPropertyInclusions(properties.inclusions)
      processProperties(pom.properties.properties)
    }
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
      val Optional<InputStream> isOptional = EMFUtil.createInputStream(inclusion.path, pom)
      if(isOptional.present) {
        is = isOptional.get
        val props = new Properties
        props.load(is)
        props.entrySet.forEach[model.addProperty(it.key.toString, it.value.toString)]
      } else {
        // TODO log error!
      }
    } finally {
      Closeables.closeQuietly(is)
    }
  }

  def private void processProperties(List<Property> properties) {
    if(properties != null) {
      properties.forEach[model.addProperty(it.name, it.value)]
    }
  }

  // TODO Needs to be refactored because fo really bad structure!
  def private void includeProperties(String groupId, String artifactId, String version) {
    val Optional<File> resolvedArtifact = ArtifactResolver.resolveArtifact(groupId, artifactId, version,
      Optional.of("pom"), Optional.<String>absent(), Optional.of(pom.projectRepositories))
    if(resolvedArtifact.present) {
      val Optional<Model> importedModel = MavenModelUtil.loadModel(resolvedArtifact.get.absolutePath)
      if(importedModel.present) {
        val properties = importedModel.get.properties
        for (Object propertyKey : properties.keySet) {
          model.addProperty(propertyKey as String, properties.get(propertyKey) as String)
        }
        val parent = importedModel.get.getParent()
        if(parent != null) {
          includeProperties(parent.groupId, parent.artifactId, parent.version)
        }
      } else {
        // TODO error handling!
      }
    } else {
      // TODO error handling -> throw exception!
    }
  }
}