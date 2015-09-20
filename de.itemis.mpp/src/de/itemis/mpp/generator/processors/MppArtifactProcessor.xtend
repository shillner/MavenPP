package de.itemis.mpp.generator.processors

import com.google.inject.Inject
import de.itemis.mpp.generator.MppModelProcessor
import de.itemis.mpp.pom.ArtifactDefinition
import de.itemis.mpp.pom.Modules
import de.itemis.mpp.pom.POM
import de.itemis.mpp.pom.ParentRef
import de.itemis.mpp.pom.SCM
import de.itemis.mpp.util.MppModelUtil
import org.apache.maven.model.Model
import org.apache.maven.model.Parent
import org.apache.maven.model.Scm

class MppArtifactProcessor implements MppModelProcessor{
  @Inject
  var extension MppModelUtil modelUtil
  var Model model
  
  override process(POM pom, Model model) {
    this.model = model
    
    consume(pom.parent)
    consume(pom.artifactDefinition)
    consume(pom.modules)
    consume(pom.scm)
  }
  
  def private void consume(ParentRef pRef) {
    if(pRef != null) {
      val coordinates = pRef.coordinates
      val Parent parent = new Parent => [
        groupId = coordinates.groupId
        artifactId = coordinates.artifactId
        version = coordinates.version.convertToString
        if(pRef.relativePath != null) {
          relativePath = pRef.relativePath
        }
      ]
      model.parent = parent
    }
  }

  def private void consume(ArtifactDefinition artifactDefinition) {
    model.groupId = artifactDefinition.groupId
    model.artifactId = artifactDefinition.resolveArtifactId
    if(artifactDefinition.version != null) {
      model.version = artifactDefinition.version.convertToString
    } else {
      model.version = null
    }
    model.packaging = artifactDefinition.type
    model.name = artifactDefinition.artifactName
    model.description = artifactDefinition.description
  }

  def private void consume(Modules modules) {
    if(modules != null) {
      model.modules = modules.names
    }
  }

  def private void consume(SCM scm) {
    if(scm != null) {
      val Scm mvnSCM = new Scm => [
        connection = scm.connection
        developerConnection = scm.developerConncetion
        tag = scm.tag
        url = scm.url
      ]
      model.scm = mvnSCM
    }
  }
}