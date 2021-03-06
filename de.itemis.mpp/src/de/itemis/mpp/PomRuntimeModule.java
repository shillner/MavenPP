/*
 * generated by Xtext
 */
package de.itemis.mpp;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import de.itemis.mpp.generator.MppModelProcessor;
import de.itemis.mpp.generator.MppMultiOutputConfigurationProvider;
import de.itemis.mpp.generator.PomGenerator;
import de.itemis.mpp.generator.processors.MppArtifactProcessor;
import de.itemis.mpp.generator.processors.MppBuildStepProcessor;
import de.itemis.mpp.generator.processors.MppDependencyProcessor;
import de.itemis.mpp.generator.processors.MppPropertiesProcessor;
import de.itemis.mpp.generator.processors.MppRepoProcessor;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class PomRuntimeModule extends de.itemis.mpp.AbstractPomRuntimeModule {

  @Override
  public void configure(Binder binder) {
    super.configure(binder);
    binder.bind(IOutputConfigurationProvider.class).to(MppMultiOutputConfigurationProvider.class).in(Singleton.class);
    binder.bind(IGenerator.class).to(PomGenerator.class);

    bindModelProcessors(binder);
  }

  private void bindModelProcessors(Binder binder) {
    binder.bind(MppModelProcessor.class).annotatedWith(Names.named(MppModelProcessor.PROPERTIES))
        .to(MppPropertiesProcessor.class);
    binder.bind(MppModelProcessor.class).annotatedWith(Names.named(MppModelProcessor.ARTIFACT))
        .to(MppArtifactProcessor.class);
    binder.bind(MppModelProcessor.class).annotatedWith(Names.named(MppModelProcessor.BUILD_STEP))
        .to(MppBuildStepProcessor.class);
    binder.bind(MppModelProcessor.class).annotatedWith(Names.named(MppModelProcessor.DEPENDENCIES))
        .to(MppDependencyProcessor.class);
    binder.bind(MppModelProcessor.class).annotatedWith(Names.named(MppModelProcessor.REPOSITORIES))
        .to(MppRepoProcessor.class);
  }
}
