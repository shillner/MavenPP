package de.itemis.mpp.util

import com.google.common.base.Strings
import de.itemis.mpp.pom.ArtifactDefinition
import de.itemis.mpp.pom.Version
import de.itemis.mpp.pom.Coordinates
import de.itemis.mpp.pom.ExtendedCoordinates
import com.google.common.base.MoreObjects

class MppModelUtil {
  def public String convertToString(Version version) {
    if(version.propertyRef != null) {
      return version.propertyRef
    }
    
    val sb = new StringBuilder(version.major)
    if(version.minor != null) {
      sb.append('.').append(version.minor)
      if(version.incremental != null) {
        sb.append('.').append(version.incremental)
      }
    }

    if(version.qualifier != null) {
      sb.append('-').append(version.qualifier)
    }
    return sb.toString
  }

  def public String convertToString(Coordinates coordinates) {
    val sb = new StringBuilder(coordinates.groupId).append(':').append(coordinates.artifactId).append(':').append(
      coordinates.version.convertToString)
    return sb.toString
  }

  def public String convertToString(ExtendedCoordinates coordinates) {
    val sb = new StringBuilder(coordinates.groupId).append(':').append(coordinates.artifactId).append(':')
    sb.append(MoreObjects.firstNonNull(Strings.emptyToNull(coordinates.type), "jar"))
    if(coordinates.classifier != null && !coordinates.classifier.empty) {
      sb.append(':').append(coordinates.classifier)
    }
    sb.append(':').append(coordinates.version.convertToString)
    return sb.toString
  }

  def public String resolveArtifactId(ArtifactDefinition artifactDefinition) {
    var artifactId = Strings.emptyToNull(artifactDefinition.artifactId)
    if(artifactId == null) {
      artifactId = artifactDefinition.eResource.URI.segment(1)
    }
    return artifactId
  }
}