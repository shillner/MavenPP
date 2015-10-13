package de.itemis.mpp.util

import com.google.common.base.MoreObjects
import com.google.common.base.Strings
import de.itemis.mpp.pom.ArtifactDefinition
import de.itemis.mpp.pom.Coordinates
import de.itemis.mpp.pom.ExtendedCoordinates
import de.itemis.mpp.pom.Version
import java.util.List
import org.apache.maven.settings.Repository
import de.itemis.mpp.pom.POM
import com.google.common.collect.Lists
import de.itemis.mpp.pom.RepositoryPolicy
import de.itemis.mpp.pom.RepositoryUpdatePolicy

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

  def public List<Repository> getProjectRepositories(POM pom) {
    val List<Repository> repositories = Lists.newArrayList
    pom.repositories.forEach [ repo |
      val repository = new Repository => [
        id = repo.id
        if(repo.name != null) {
          name = repo.name
        }
        url = repo.url
        if(repo.layout != null) {
          layout = repo.layout
        }
        for (RepositoryPolicy policy : repo.policies) {
          val org.apache.maven.settings.RepositoryPolicy mvnPolicy = new org.apache.maven.settings.RepositoryPolicy => [
            enabled = !policy.disabled
            checksumPolicy = policy.checksumPolicy.literal

            // TODO add validator rule for update policy -> interval must be set if the interval policy is set
            var configuredUpdatePolicy = policy.updatePolicy.literal
            if(RepositoryUpdatePolicy.INTERVAL == policy.updatePolicy) {
              configuredUpdatePolicy += ":" + policy.updateInterval
            }
            updatePolicy = configuredUpdatePolicy
          ]
          if(policy.isSnapshots) {
            snapshots = mvnPolicy
          } else {
            releases = mvnPolicy
          }
        }
      ]
      repositories += repository
    ]
    return repositories
  }
}