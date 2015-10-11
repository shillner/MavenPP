package de.itemis.mpp.generator;

import org.apache.maven.model.Model;

import de.itemis.mpp.pom.POM;

public interface MppModelProcessor {
  public static final String ARTIFACT = "ArtifactProcessor";
  public static final String BUILD_STEP = "BuildStepProcessor";
  public static final String DEPENDENCIES = "DependencyProcessor";
  public static final String PROPERTIES = "PropertiesProcessor";
  public static final String REPOSITORIES = "RepositoryProcessor";

  void process(POM pom, Model model);
}
