package de.itemis.mpp.linking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import com.google.common.base.Objects;

import de.itemis.mpp.pom.BuildStep;
import de.itemis.mpp.pom.POM;
import de.itemis.mpp.pom.PluginInclusion;

public class MppLazyLinker extends LazyLinker {
  public static final String KW_PLUGIN_CONFIG = "config";

  @Override
  protected void beforeModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
    super.beforeModelLinked(model, diagnosticsConsumer);

    if (model instanceof POM) {
      EList<BuildStep> buildSteps = ((POM) model).getBuildSteps();
      if (buildSteps != null) {
        for (BuildStep step : buildSteps) {
          if (step instanceof PluginInclusion) {
            PluginInclusion inclusion = (PluginInclusion) step;
            if (Objects.equal(KW_PLUGIN_CONFIG, inclusion.getExecutionId())) {
              inclusion.setExecutionId(null);
              inclusion.setConfig(true);
            }
          }
        }
      }
    }
  }
}
