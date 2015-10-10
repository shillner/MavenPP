package de.itemis.mpp.aether.internal.util;

import org.apache.maven.repository.internal.MavenRepositorySystemUtils;
import org.eclipse.aether.DefaultRepositorySystemSession;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.LocalRepository;

public class AetherBootstrap {
  public static RepositorySystem newRepositorySystem() {
    return RepositorySystemFactory.newRepositorySystem();
  }

  public static RepositorySystemSession newRepositorySystemSession(RepositorySystem system,
      String localRepositoryPath) {
    DefaultRepositorySystemSession session = MavenRepositorySystemUtils.newSession();

    // TODO setup session as described in settings.xml
    LocalRepository localRepo = new LocalRepository(localRepositoryPath);
    session.setLocalRepositoryManager(system.newLocalRepositoryManager(session, localRepo));

    // TODO logger for repository access?
    /*
     * if (printConsoleOutput) {
     * session.setTransferListener(new ConsoleTransferListener());
     * session.setRepositoryListener(new ConsoleRepositoryListener());
     * }
     */

    // uncomment to generate dirty trees
    // session.setDependencyGraphTransformer( null );

    return session;
  }
}
