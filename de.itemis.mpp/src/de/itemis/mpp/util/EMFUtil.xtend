package de.itemis.mpp.util

import com.google.common.base.Optional
import de.itemis.mpp.generator.MppMultiOutputConfigurationProvider
import de.itemis.mpp.pom.POM
import java.io.IOException
import java.io.InputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

class EMFUtil {
  def static String getOutputFileName(Resource resource) {
    val uri = resource.URI
    if(uri != null) {
      val inputFileName = uri.segment(uri.segmentCount() - 1)
      return inputFileName.replace("." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MPP,
        "." + MppMultiOutputConfigurationProvider.FILE_EXTENSION_MAVEN)
    }
    return "pom.xml"
  }

  def public static Optional<InputStream> createInputStream(String path, POM pom) {
    var InputStream is
    var URI uri
    val uriConverter = pom.eResource.resourceSet.getURIConverter
    try {
      uri = URI.createFileURI(path);
      is = uriConverter.createInputStream(uri)
    } catch(IOException e) {
      //TODO handle!
    }
    
    if(is == null) {
      var baseUri = pom.eResource.URI.trimSegments(1).toPlatformString(false)
      uri = URI.createPlatformResourceURI(baseUri + "/" + path, false)
      is = uriConverter.createInputStream(uri)
    }
    
    return Optional.fromNullable(is)
  }
}