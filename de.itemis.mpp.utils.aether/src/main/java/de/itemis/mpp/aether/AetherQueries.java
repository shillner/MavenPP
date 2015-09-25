package de.itemis.mpp.aether;

import java.util.List;

public class AetherQueries {
  public static List<String> getGroupIds(String prefix) {
    // Build an index and query this index at runtime!
    // RepositorySystem system = AetherBootstrap.newRepositorySystem();
    // // TODO remove hard coded path to repository and get the one from settings or default to user.home ...
    // String userHome = System.getProperty("user.home");
    // RepositorySystemSession session = AetherBootstrap.newRepositorySystemSession(system, userHome +
    // "/.m2/repository");
    //
    // Metadata metadata = new DefaultMetadata("com.google.guava", "guava", "maven-metadata.xml",
    // Metadata.Nature.RELEASE_OR_SNAPSHOT);
    //
    // MetadataRequest metadataRequest = new MetadataRequest();
    // metadataRequest.setMetadata(metadata);
    // metadataRequest.setFavorLocalRepository(true);
    // metadataRequest.setRepository(AetherBootstrap.newCentralRepository());
    //
    // DefaultMetadataResolver resolver = new DefaultMetadataResolver();
    // resolver.setSyncContextFactory(new DefaultSyncContextFactory());
    // resolver.setRepositoryEventDispatcher(new DefaultRepositoryEventDispatcher());
    // DefaultRemoteRepositoryManager remoteRepositoryManager = new DefaultRemoteRepositoryManager();
    // remoteRepositoryManager.setChecksumPolicyProvider(new DefaultChecksumPolicyProvider());
    // remoteRepositoryManager.setUpdatePolicyAnalyzer(new DefaultUpdatePolicyAnalyzer());
    // resolver.setRemoteRepositoryManager(remoteRepositoryManager);
    // DefaultUpdateCheckManager updateCheckManager = new DefaultUpdateCheckManager();
    // updateCheckManager.setUpdatePolicyAnalyzer(new DefaultUpdatePolicyAnalyzer());
    // resolver.setUpdateCheckManager(updateCheckManager);
    // resolver.setRepositoryConnectorProvider(new DefaultRepositoryConnectorProvider());
    // List<MetadataResult> resultList = resolver.resolveMetadata(session, Collections.singleton(metadataRequest));
    // for (MetadataResult result : resultList) {
    // if (result.getMetadata() != null) {
    // System.out.println(result.getMetadata().getGroupId());
    // }
    // }
    return null;
  }
}
