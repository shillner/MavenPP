package de.itemis.mpp.generator.processors

import com.google.common.base.Optional
import com.google.common.collect.Maps
import com.google.inject.Inject
import de.itemis.mpp.aether.ArtifactResolver
import de.itemis.mpp.generator.MppModelProcessor
import de.itemis.mpp.pom.BuildStep
import de.itemis.mpp.pom.POM
import de.itemis.mpp.pom.PluginInclusion
import de.itemis.mpp.util.MavenModelUtil
import de.itemis.mpp.util.MppModelUtil
import java.util.List
import java.util.Map
import org.apache.maven.model.Model
import org.apache.maven.model.PluginExecution
import de.itemis.mpp.pom.Plugin
import org.apache.maven.model.building.DefaultModelBuilderFactory
import org.apache.maven.model.building.DefaultModelBuildingRequest
import org.apache.maven.model.building.ModelSource
import org.apache.maven.model.building.FileModelSource

class MppBuildStepProcessor implements MppModelProcessor {
  @Inject
  var extension MppModelUtil modelUtil
  var Model model
  var POM pom
  var Map<String, Plugin> pluginCache

  override process(POM pom, Model model) {
    this.model = model
    this.pom = pom
    this.pluginCache = Maps.newHashMap

    if(pom.buildSteps != null) {
      processBuildSteps(pom.buildSteps)
    }
  }

  def void processBuildSteps(List<BuildStep> steps) {
    // TODO create plugin-management section for all default configurations!
    steps.filter[it instanceof PluginInclusion].forEach[processStep]
    steps.filter[it instanceof Plugin].forEach[processStep]
//    steps.forEach[processStep]
  }

  def dispatch private void processStep(Plugin plugin) {
  }

  def dispatch private void processStep(PluginInclusion pluginInclusion) {
    val coordinates = pluginInclusion.pomRef.coordinates
    val resolvedArtifact = ArtifactResolver.resolveArtifact(coordinates.groupId, coordinates.artifactId,
      coordinates.version.convertToString, Optional.of("pom"), Optional.<String>absent,
      Optional.of(pom.projectRepositories))

    val model = MavenModelUtil.loadEffectiveModel(resolvedArtifact)

    if(resolvedArtifact.isPresent) {
      val importedModel = MavenModelUtil.loadModel(resolvedArtifact.get.absolutePath)
      if(importedModel.isPresent) {
        val pluginCoordinates = pluginInclusion.pluginCoordinates

      }
    }
  }

//  def dispatch void processStep(Plugin plugin) {
//    // TODO use cache to hold all plugins for further config
//    val coordinates = plugin.coordinates
//
//    // common plugin config -> into pluginManagement section
//    val pluginManagement = MavenModelUtil.getOrCreatePluginManagement(model)
//    val managedPlugin = new org.apache.maven.model.Plugin => [
//      groupId = coordinates.groupId
//      artifactId = coordinates.artifactId
//      version = coordinates.version.convertToString
//      if(plugin.configuration != null) {
//        configuration = MavenModelUtil.createPluginConfiguration(plugin.configuration)
//      }
//    ]
//    pluginManagement.addPlugin(managedPlugin)
//
//    if(plugin.executions != null && !plugin.executions.empty) {
//      val mavenPlugin = new org.apache.maven.model.Plugin => [
//        groupId = coordinates.groupId
//        artifactId = coordinates.artifactId
//        for (PluginExecution execution : plugin.executions) {
//          val Optional<PluginExecution> mavenPluginExecution = MavenModelUtil.createPluginExecution(execution)
//          if(mavenPluginExecution.isPresent) {
//            addExecution(mavenPluginExecution.get)
//          }
//        }
//      ]
//      MavenModelUtil.getOrCreateBuildConfig(model).addPlugin(mavenPlugin)
//    }
//  }
//  def dispatch private void processStep(PluginInclusion pluginInclusion) {
//    val coordinates = pluginInclusion.pomRef.coordinates
//    val resolvedArtifact = ArtifactResolver.resolveArtifact(coordinates.groupId, coordinates.artifactId,
//      coordinates.version.convertToString, Optional.of("pom"), Optional.<String>absent,
//      Optional.of(pom.projectRepositories))
//
//    if(resolvedArtifact.isPresent) {
//      val importedModel = MavenModelUtil.loadModel(resolvedArtifact.get.absolutePath)
//      if(importedModel.isPresent) {
//        val pluginCoordinates = pluginInclusion.pluginCoordinates
//        val managedPlugin = MavenModelUtil.getManagedPlugin(importedModel.get, pluginCoordinates.groupId,
//          pluginCoordinates.artifactId);
//        val plugin = MavenModelUtil.getPlugin(importedModel.get, pluginCoordinates.groupId,
//          pluginCoordinates.artifactId)
//        val pluginVersion = MavenModelUtil.getPluginVersion(plugin, managedPlugin)
//        // global config is always included
//        // TODO do not merge pluginManagement config with plugin config but include management and plugin
//        val config = MavenModelUtil.getMergedPluginConfiguration(managedPlugin, plugin)
//        if(config.isPresent) {
//          val pluginManagement = MavenModelUtil.getOrCreatePluginManagement(model)
//          val mavenPlugin = new org.apache.maven.model.Plugin => [
//            groupId = pluginCoordinates.groupId
//            artifactId = pluginCoordinates.artifactId
//            version = pluginVersion
//            configuration = config.get
//          ]
//          pluginManagement.addPlugin(mavenPlugin)
//        }
//        if(!pluginInclusion.isConfig && pluginInclusion.executionId == null) {
//          // TODO include whole plugin settings
//        } else if(pluginInclusion.executionId != null) {
//          // TODO include execution
//        }
//      } else {
//        // TODO error handling
//      }
//    } else {
//      // TODO error handling!
//    }
//  }
}