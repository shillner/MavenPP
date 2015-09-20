package de.itemis.mpp.aether;

import java.io.File;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.eclipse.aether.resolution.ArtifactResult;

import com.google.common.base.Optional;

import de.itemis.mpp.aether.internal.util.AetherBootstrap;

public class ArtifactResolver {
  public static Optional<File> resolveArtifact(String groupId, String artifactId, String version, Optional<String> type,
      Optional<String> classifier) {
    Optional<File> result;

    RepositorySystem system = AetherBootstrap.newRepositorySystem();
    // TODO remove hard coded path to repository and get the one from settings or default to user.home ...
    String userHome = System.getProperty("user.home");
    RepositorySystemSession session = AetherBootstrap.newRepositorySystemSession(system, userHome + "/.m2/repository");

    Artifact artifact = new DefaultArtifact(groupId, artifactId, classifier.orNull(), type.orNull(), version);

    // FIXME could not find artifact in central repo (if artifact is local only)
    ArtifactRequest artifactRequest = new ArtifactRequest();
    artifactRequest.setArtifact(artifact);
    artifactRequest.setRepositories(AetherBootstrap.newRemoteRepositories(system, session));

    try {
      // TODO maybe use DefaultArtifactResolver of the eclipse aether package?!
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
