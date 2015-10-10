package de.itemis.mpp.aether;

import java.io.File;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.repository.LocalRepository;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.eclipse.aether.resolution.ArtifactResult;

import com.google.common.base.Optional;

import de.itemis.mpp.aether.internal.util.AetherBootstrap;
import de.itemis.mpp.aether.internal.util.MavenSettingsUtil;

public class ArtifactResolver {
  public static Optional<File> resolveArtifact(String groupId, String artifactId, String version, Optional<String> type,
      Optional<String> classifier) {
    Optional<File> result;

    LocalRepository localRepository = MavenSettingsUtil.getLocalRepository(MavenSettingsUtil.loadSettings());
    RepositorySystem system = AetherBootstrap.newRepositorySystem();
    RepositorySystemSession session = AetherBootstrap.newRepositorySystemSession(system,
        localRepository.getBasedir().getAbsolutePath());

    Artifact artifact = new DefaultArtifact(groupId, artifactId, classifier.orNull(), type.orNull(), version);
    ArtifactRequest artifactRequest = new ArtifactRequest();
    artifactRequest.setArtifact(artifact);
    artifactRequest.setRepositories(MavenSettingsUtil.getRemoteRepositories(MavenSettingsUtil.loadSettings()));

    try {
      ArtifactResult artifactResult = system.resolveArtifact(session, artifactRequest);
      artifact = artifactResult.getArtifact();
      if (artifact != null) {
        result = Optional.fromNullable(artifact.getFile());
      } else {
        result = Optional.absent();
      }
    } catch (ArtifactResolutionException e) {
      // TODO add error handling -> maybe throw an exception that indicates the error or return an Optional
      result = Optional.absent();
    }

    return result;
  }
}
