package de.itemis.mpp.standalone;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import de.itemis.mpp.generator.MppMultiOutputConfigurationProvider;

public class Generator {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  @Inject
  private IResourceValidator validator;
  @Inject
  private IGenerator generator;
  @Inject
  private JavaIoFileSystemAccess fileAccess;

  public void generate(File inputFile) {
    // load the resource
    ResourceSet set = this.resourceSetProvider.get();
    Resource resource = set.getResource(URI.createFileURI(inputFile.getAbsolutePath()), true);

    // validate the resource
    List<Issue> list = this.validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
    if (!list.isEmpty()) {
      for (Issue issue : list) {
        System.err.println(issue);
      }
      return;
    }

    // configure and start the generator
    Map<String, OutputConfiguration> outputConfigs = new HashMap<String, OutputConfiguration>();
    outputConfigs.put(MppMultiOutputConfigurationProvider.OUTPUT_CONFIGURATION_POM,
        new MppMultiOutputConfigurationProvider().getOutputConfigurations().iterator().next());
    this.fileAccess.setOutputConfigurations(outputConfigs);
    this.generator.doGenerate(resource, this.fileAccess);
  }
}
