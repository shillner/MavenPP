package de.itemis.mpp.aether;

import java.io.File;
import java.util.List;

import org.apache.maven.model.Parent;
import org.apache.maven.model.Repository;
import org.apache.maven.model.building.FileModelSource;
import org.apache.maven.model.building.ModelSource;
import org.apache.maven.model.resolution.InvalidRepositoryException;
import org.apache.maven.model.resolution.UnresolvableModelException;

import com.google.common.base.Optional;

public class ModelResolver implements org.apache.maven.model.resolution.ModelResolver {
  @Override
  public ModelSource resolveModel(String groupId, String artifactId, String version) throws UnresolvableModelException {
    Optional<File> resolveArtifact = ArtifactResolver.resolveArtifact(groupId, artifactId, version, Optional.of("pom"),
        Optional.<String> absent(), Optional.<List<org.apache.maven.settings.Repository>> absent());
    if (!resolveArtifact.isPresent()) {
      throw new UnresolvableModelException("Could not resolve the model", groupId, artifactId, version);
    }
    return new FileModelSource(resolveArtifact.get());
  }

  @Override
  public ModelSource resolveModel(Parent parent) throws UnresolvableModelException {
    return resolveModel(parent.getGroupId(), parent.getArtifactId(), parent.getVersion());
  }

  @Override
  public void addRepository(Repository repository) throws InvalidRepositoryException {
    // not supported!
  }

  @Override
  public void addRepository(Repository repository, boolean replace) throws InvalidRepositoryException {
    // not supported!
  }

  @Override
  public org.apache.maven.model.resolution.ModelResolver newCopy() {
    return this;
  }
}
