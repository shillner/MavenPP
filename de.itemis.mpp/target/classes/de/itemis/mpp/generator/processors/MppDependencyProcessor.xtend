package de.itemis.mpp.generator.processors

import com.google.common.base.Objects
import com.google.common.base.Optional
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.itemis.mpp.aether.ArtifactResolver
import de.itemis.mpp.generator.MppModelProcessor
import de.itemis.mpp.pom.Dependencies
import de.itemis.mpp.pom.Dependency
import de.itemis.mpp.pom.DependencyGroup
import de.itemis.mpp.pom.DependencyInclusion
import de.itemis.mpp.pom.DependencyScope
import de.itemis.mpp.pom.POM
import de.itemis.mpp.pom.UngroupedDependency
import de.itemis.mpp.util.MavenModelUtil
import de.itemis.mpp.util.MppModelUtil
import java.util.Set
import org.apache.maven.model.Model

class MppDependencyProcessor implements MppModelProcessor {
  @Inject
  var extension MppModelUtil modelUtil

  @Inject
  var extension MavenModelUtil mavenModelUtil

  var Model model

  override process(POM pom, Model model) {
    this.model = model;
    processDependencies(pom.dependencies)
  }

  def void processDependencies(Dependencies dependencies) {
    val Set<String> projectDependencies = Sets.newHashSet();
    // TODO synchronize dependencies in another way (check also scopes and remove redundant ones)
    if(dependencies != null) {
      for (UngroupedDependency dep : dependencies.ungroupedDependencies) {
        val coordinates = dep.dependency.coordinates.convertToString
        if(!projectDependencies.contains(coordinates)) {
          addDependencyToModel(dep.dependency, dep.scope)
          projectDependencies += coordinates
        }
      }

      for (DependencyGroup group : dependencies.dependencyGroups) {
        for (Dependency d : group.dependecies) {
          val coordinates = d.coordinates.convertToString
          if(!projectDependencies.contains(coordinates)) {
            addDependencyToModel(d, group.scope)
            projectDependencies += coordinates
          }
        }
      }

      for (DependencyInclusion inclusion : dependencies.includes) {
        val coordinates = inclusion.pomRef.coordinates
        val resolvedArtifact = ArtifactResolver.resolveArtifact(coordinates.groupId, coordinates.artifactId,
          coordinates.version.convertToString, Optional.of("pom"), Optional.<String>absent)

        if(resolvedArtifact.present) {
          val importedModel = MavenModelUtil.loadModel(resolvedArtifact.get.absolutePath);
          if(importedModel.present) {
            for (org.apache.maven.model.Dependency d : importedModel.get.dependencies) {
              if(Objects.equal(inclusion.scope.literal, d.dependencyScope)) {
                val dependencyCoordinates = d.convertToString
                if(!projectDependencies.contains(dependencyCoordinates)) {
                  model.addDependency(d)
                  projectDependencies += dependencyCoordinates
                }
              }
            }
          }
        } else {
          // TODO error handling!
        }
      }
    }
  }

  def void addDependencyToModel(Dependency dependency, DependencyScope dependencyScope) {
    val coordinates = dependency.coordinates
    val mavenDependency = new org.apache.maven.model.Dependency => [
      groupId = coordinates.groupId
      artifactId = coordinates.artifactId
      version = coordinates.version.convertToString
      classifier = coordinates.classifier
      if(dependencyScope != DependencyScope.COMPILE) {
        scope = dependencyScope.literal
      }
      if(dependency.optional) {
        optional = true
      }
    ]
    model.addDependency(mavenDependency)
  }
}