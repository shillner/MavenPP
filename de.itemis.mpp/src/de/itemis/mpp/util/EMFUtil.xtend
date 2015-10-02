package de.itemis.mpp.util

import org.eclipse.emf.ecore.resource.Resource
import de.itemis.mpp.generator.MppMultiOutputConfigurationProvider

class EMFUtil {
  def static String getOutputFileName(Resource resource) {
    val uri = resource.URI
    if(uri != null) {
      if(uri.file) {
        val inputFilePath = uri.toFileString
        return inputFilePath.replace("." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MPP,
          "." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MAVEN)
      } else if(uri.platform) {
        var startIndex = 1
        if(uri.isPlatformResource) {
          startIndex = 2
        }
        val platformPath = uri.segmentsList.subList(startIndex, uri.segmentsList.size).reduce[a, b|a + "/" + b]
        return platformPath.replace("." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MPP,
          "." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MAVEN)
      }
    }
    return "pom.xml"
  }
}