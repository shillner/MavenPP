package de.itemis.mpp.generator

import org.eclipse.xtext.generator.IOutputConfigurationProvider
import java.util.Set
import org.eclipse.xtext.generator.OutputConfiguration
import com.google.common.collect.Sets

class MppMultiOutputConfigurationProvider implements IOutputConfigurationProvider{
  val public static String FILE_EXTENSION_MAVEN = "xml"
  val public static String FILE_EXTENSION_MPP = "mpp"

  val public static String OUTPUT_CONFIGURATION_POM = "POM"
  
  override getOutputConfigurations() {
    val Set<OutputConfiguration> configurations = Sets.newHashSet()

    val pom = new OutputConfiguration(OUTPUT_CONFIGURATION_POM)
    pom.canClearOutputDirectory = false
    pom.cleanUpDerivedResources = true
    pom.createOutputDirectory = false
    pom.description = "The output location for generated pom files."
    pom.keepLocalHistory = false
    pom.outputDirectory = ""
    pom.overrideExistingResources = true
    pom.setDerivedProperty = true
    configurations+=pom

    return configurations
  }
}
