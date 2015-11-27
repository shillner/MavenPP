package de.itemis.mpp.util

import com.google.common.base.MoreObjects
import com.google.common.base.Objects
import com.google.common.base.Optional
import com.google.common.base.Strings
import de.itemis.mpp.pom.DependencyScope
import de.itemis.mpp.pom.Phase
import de.itemis.mpp.pom.PluginConfiguration
import de.itemis.mpp.pom.PluginConfigurationItem
import de.itemis.mpp.pom.PluginConfigurationParameter
import de.itemis.mpp.pom.PluginConfigurationParameterList
import de.itemis.mpp.pom.PluginConfigurationParameterProperties
import java.io.File
import java.io.FileInputStream
import org.apache.maven.model.Build
import org.apache.maven.model.Dependency
import org.apache.maven.model.Model
import org.apache.maven.model.Plugin
import org.apache.maven.model.PluginExecution
import org.apache.maven.model.PluginManagement
import org.apache.maven.model.building.DefaultModelBuilderFactory
import org.apache.maven.model.building.DefaultModelBuildingRequest
import org.apache.maven.model.building.FileModelSource
import org.apache.maven.model.io.xpp3.MavenXpp3Reader
import org.codehaus.plexus.util.xml.Xpp3Dom
import de.itemis.mpp.aether.ModelResolver

class MavenModelUtil {
  def public static Optional<Model> loadModel(String path) {
    val reader = new MavenXpp3Reader
    var Model model = null
    try {
      model = reader.read(new FileInputStream(path))
    } catch(Exception e) {
      // FIXME error handling!
    }

    return Optional.fromNullable(model)
  }

  def public static Optional<Build> getBuildConfig(Model model) {
    return Optional.fromNullable(model.build)
  }

  def public static Build getOrCreateBuildConfig(Model model) {
    val Optional<Build> build = getBuildConfig(model)
    if(build.present) {
      return build.get()
    }

    model.build = new Build
    return model.build
  }

  def public static Optional<PluginManagement> getPluginManagement(Model model) {
    var PluginManagement pluginManagement = null
    val Optional<Build> build = getBuildConfig(model)
    if(build.present) {
      pluginManagement = build.get().pluginManagement
    }
    return Optional.fromNullable(pluginManagement)
  }

  def public static PluginManagement getOrCreatePluginManagement(Model model) {
    val Optional<PluginManagement> pluginManagement = getPluginManagement(model)
    if(pluginManagement.present) {
      return pluginManagement.get()
    }

    val build = getOrCreateBuildConfig(model)
    if(build.pluginManagement == null) {
      build.pluginManagement = new PluginManagement
    }
    return build.pluginManagement
  }

  def public String getDependencyScope(Dependency dependency) {
    val scope = Strings.emptyToNull(dependency.scope)
    return MoreObjects.firstNonNull(scope, DependencyScope.COMPILE.literal)
  }

  def public static Optional<Plugin> getPlugin(Model model, String groupId, String artifactId) {
    val Optional<Build> build = getBuildConfig(model)
    if(build.present) {
      val plugins = build.get().plugins
      if(plugins != null) {
        for (Plugin plugin : plugins) {
          // checks for artifact id first since the group id is more likely to match!
          if(Objects.equal(artifactId, plugin.artifactId)) {
            // TODO need to handle default groups such as the default maven plugins (are groups null there?)
            if(Objects.equal(groupId, plugin.groupId)) {
              return Optional.of(plugin)
            }
          }
        }
      }
    }
    return Optional.absent()
  }

  def public static String getPluginVersion(Optional<Plugin> plugin, Optional<Plugin> managedPlugin) {
    var String version

    if(managedPlugin.present) {
      version = managedPlugin.get.version
    }

    if(version == null && plugin.present) {
      version = plugin.get.version
    }

    return version
  }

  def public static Optional<Plugin> getManagedPlugin(Model model, String groupId, String artifactId) {
    val Optional<PluginManagement> pluginManagement = getPluginManagement(model)
    if(pluginManagement.present) {
      val plugins = pluginManagement.get().plugins
      if(plugins != null) {
        for (Plugin plugin : plugins) {
          // checks for artifact id first since the group id is more likely to match!
          if(Objects.equal(artifactId, plugin.artifactId)) {
            // TODO need to handle default groups such as the default maven plugins (are groups null there?)
            if(Objects.equal(groupId, plugin.groupId)) {
              return Optional.of(plugin)
            }
          }
        }
      }
    }
    return Optional.absent()
  }

  def public String convertToString(Dependency dependency) {
    val sb = new StringBuilder(dependency.groupId).append(':').append(dependency.artifactId).append(':')
    sb.append(MoreObjects.firstNonNull(Strings.emptyToNull(dependency.type), "jar"))
    if(dependency.classifier != null && !dependency.classifier.empty) {
      sb.append(':').append(dependency.classifier)
    }
    sb.append(':').append(dependency.version)
    return sb.toString
  }

  def public static Optional<Object> getMergedPluginConfiguration(Optional<Plugin> managedPlugin,
    Optional<Plugin> plugin) {
    // TODO merge configurations from managed plugin and specific plugin inclusion
    var Xpp3Dom managedConfig = null
    var Xpp3Dom config = null
    if(managedPlugin.present) {
      managedConfig = managedPlugin.get.configuration as Xpp3Dom
    }
    if(plugin.present) {
      config = plugin.get.getConfiguration as Xpp3Dom
    }

    if(managedConfig != null) {
      if(config != null) {
        // TODO merge!
        val dom = new Xpp3Dom(managedConfig)
        return null;
//        dom.mergeXpp3Dom(dominant, recessive)
      } else {
        return Optional.of(managedConfig)
      }
    } else {
      return Optional.fromNullable(config)
    }
  }

  def public static Optional<PluginExecution> createPluginExecution(de.itemis.mpp.pom.PluginExecution pluginExecution) {
    if(pluginExecution.isDefault) {
      // the default execution skips the creation of a plugin execution since it is enough to add the plugin to
      // the build cycle
      return Optional.absent
    }

    val execution = new PluginExecution => [
      id = pluginExecution.id
      if(Phase.DEFAULT != pluginExecution.phase) {
        phase = pluginExecution.phase.literal
      }
      pluginExecution.goals.forEach[goal|addGoal(goal)]
      if(pluginExecution.configuration != null) {
        configuration = createPluginConfiguration(pluginExecution.configuration)
      }
    ]
    return Optional.of(execution)
  }

  def public static Xpp3Dom createPluginConfiguration(PluginConfiguration pluginConfiguration) {
    val cfg = new Xpp3Dom("configuration") => [
      pluginConfiguration.configurationItems.forEach [ item |
        val child = createPluginConfigParameter(item)
        if(child.present) {
          addChild(child.get)
        }
      ]
    ]
    return cfg
  }

  def private static dispatch Optional<Xpp3Dom> createPluginConfigParameter(PluginConfigurationParameter parameter) {
    val param = new Xpp3Dom(parameter.key) => [
      if(parameter.value != null) {
        value = parameter.value
      } else {
        parameter.children.forEach [ child |
          val childParam = createPluginConfigParameter(child)
          if(childParam.present) {
            addChild(childParam.get)
          }
        ]
      }
    ]
    return Optional.of(param)
  }

  def private static dispatch Optional<Xpp3Dom> createPluginConfigParameter(
    PluginConfigurationParameterList paramList) {
    val param = new Xpp3Dom(paramList.key) => [
      paramList.values.forEach [ v |
        addChild(new Xpp3Dom("value") => [value = v])
      ]
    ]
    return Optional.of(param)
  }

  def private static dispatch Optional<Xpp3Dom> createPluginConfigParameter(
    PluginConfigurationParameterProperties paramProps) {
    val param = new Xpp3Dom(paramProps.key) => [
      paramProps.entries.forEach [ e |
        val property = new Xpp3Dom("property") => [
          addChild(new Xpp3Dom("name") => [value = e.key])
          addChild(new Xpp3Dom("value") => [value = e.value])
        ]
        addChild(property)
      ]
    ]
    return Optional.of(param)
  }

  def private static dispatch Optional<Xpp3Dom> createPluginConfigParameter(PluginConfigurationItem item) {
    return Optional.absent
  }

  def public static Optional<Model> loadEffectiveModel(Optional<File> pomFile) {
    var Model model = null
    if(pomFile.isPresent) {
      val request = new DefaultModelBuildingRequest => [
        modelSource = new FileModelSource(pomFile.get)
        modelResolver = new ModelResolver
      ]
      val result = new DefaultModelBuilderFactory().newInstance.build(request)
      model = result.effectiveModel
    }
    return Optional.fromNullable(model)
  }
//
//public static PluginExecution getPluginExecution(Plugin plugin, String executionId) {
//    for (PluginExecution execution : plugin.getExecutions()) {
//      // TODO handle default ids!
//      if (Objects.equal(executionId, execution.getId())) {
//        return execution;
//      }
//    }
//    return null;
//  }
}