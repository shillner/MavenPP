package de.itemis.mpp.util

import org.eclipse.emf.ecore.resource.Resource
import de.itemis.mpp.generator.MppMultiOutputConfigurationProvider

class EMFUtil {
  def static String getOutputFileName(Resource resource) {
    val uri = resource.URI
    if (uri != null) {
      val inputFileName = uri.segment(uri.segmentCount() - 1)
      return inputFileName.replace("."+MppMultiOutputConfigurationProvider.FILE_EXTENSION_MPP, "."+MppMultiOutputConfigurationProvider.FILE_EXTENSION_MAVEN)
    }
    return "pom.xml"
  }}