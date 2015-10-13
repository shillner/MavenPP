package de.itemis.mpp.aether.internal.util;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Repository;
import org.apache.maven.settings.Settings;
import org.apache.maven.settings.building.DefaultSettingsBuilderFactory;
import org.apache.maven.settings.building.DefaultSettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuilder;
import org.apache.maven.settings.building.SettingsBuildingException;
import org.apache.maven.settings.building.SettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuildingResult;
import org.eclipse.aether.repository.LocalRepository;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.repository.RemoteRepository.Builder;
import org.eclipse.aether.repository.RepositoryPolicy;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class MavenSettingsUtil {
  private static final String DEFAULT_REPOSITORY_LOCAL = System.getProperty("user.home") + "/.m2/repository";
  private static final RemoteRepository DEFAULT_REPOSITORY_REMOTE = new RemoteRepository.Builder("central", "default",
      "http://central.maven.org/maven2/").build();
  private static Settings settings;

  private MavenSettingsUtil() {
  }

  public static File getGlobalSettings() {
    return new File(System.getenv("M2_HOME"), "conf/settings.xml");
  }

  public static File getUserSettings() {
    return new File(System.getProperty("user.home"), ".m2/settings.xml");
  }

  public static Settings loadSettings() {
    File globalSettings = getGlobalSettings();
    File userSettings = getUserSettings();
    return loadSettings(globalSettings, userSettings);
  }

  public static Settings loadSettings(File globalSettings, File userSettings) {
    if (settings == null) {
      SettingsBuildingRequest request = new DefaultSettingsBuildingRequest();
      request.setGlobalSettingsFile(globalSettings);
      request.setUserSettingsFile(userSettings);

      DefaultSettingsBuilderFactory factory = new DefaultSettingsBuilderFactory();
      SettingsBuilder builder = factory.newInstance();
      try {
        SettingsBuildingResult result = builder.build(request);
        settings = result.getEffectiveSettings();
      } catch (SettingsBuildingException e) {
        // TODO handle exception!!!
      }
    }

    return settings;
  }

  public static LocalRepository getLocalRepository(Settings settings) {
    String localRepoPath = MoreObjects.firstNonNull(settings.getLocalRepository(), DEFAULT_REPOSITORY_LOCAL);
    return new LocalRepository(localRepoPath);
  }

  public static List<RemoteRepository> getRemoteRepositories(Settings settings, List<Repository> customRepositories) {
    List<RemoteRepository> repositories = Lists.newArrayList();

    // QUESTION can we determine the profiles that are relevant or just keep on using all profile settings?
    for (Profile profile : settings.getProfiles()) {
      for (Repository repository : profile.getRepositories()) {
        repositories.add(toRemoteRepository(repository));
      }
      for (Repository repository : profile.getPluginRepositories()) {
        repositories.add(toRemoteRepository(repository));
      }
    }

    if (customRepositories != null) {
      for (Repository repository : customRepositories) {
        repositories.add(toRemoteRepository(repository));
      }
    }

    // default repository if no other is available
    if (repositories.isEmpty()) {
      repositories.add(DEFAULT_REPOSITORY_REMOTE);
    }

    for (Mirror mirror : settings.getMirrors()) {
      repositories.add(toRemoteRepository(mirror, repositories));
    }

    return repositories;
  }

  private static RemoteRepository toRemoteRepository(Repository repository) {
    Builder builder = new RemoteRepository.Builder(repository.getId(), repository.getLayout(), repository.getUrl());

    org.apache.maven.settings.RepositoryPolicy settingsReleasePolicy = repository.getReleases();
    RepositoryPolicy releasePolicy = new RepositoryPolicy(settingsReleasePolicy.isEnabled(),
        settingsReleasePolicy.getUpdatePolicy(), settingsReleasePolicy.getChecksumPolicy());
    builder.setReleasePolicy(releasePolicy);

    org.apache.maven.settings.RepositoryPolicy settingsSnapshotPolicy = repository.getSnapshots();
    RepositoryPolicy snapshotsPolicy = new RepositoryPolicy(settingsSnapshotPolicy.isEnabled(),
        settingsSnapshotPolicy.getUpdatePolicy(), settingsSnapshotPolicy.getChecksumPolicy());
    builder.setSnapshotPolicy(snapshotsPolicy);

    // TODO add authentication (from equivalent server configuration)
    // builder.setAuthentication(authentication)
    return builder.build();
  }

  private static RemoteRepository toRemoteRepository(Mirror mirror, List<RemoteRepository> remoteRepositories) {
    Builder builder = new RemoteRepository.Builder(mirror.getId(), mirror.getLayout(), mirror.getUrl());

    String[] mirroredRepoIds = mirror.getMirrorOf().split(",");
    Set<String> includes = Sets.newHashSet();
    Set<String> excludes = Sets.newHashSet();
    for (String id : mirroredRepoIds) {
      if (Objects.equal("*", id)) {
        for (RemoteRepository repository : remoteRepositories) {
          if (repository.getMirroredRepositories() == null || repository.getMirroredRepositories().isEmpty()) {
            // don't add mirrors to the list of includes!
            includes.add(repository.getId());
          }
        }
      } else if (id.startsWith("!")) {
        excludes.add(id.substring(1));
      } else {
        includes.add(id);
      }
    }

    for (String id : includes) {
      if (!excludes.contains(id)) {
        for (RemoteRepository repository : remoteRepositories) {
          if (Objects.equal(id, repository.getId())) {
            builder.addMirroredRepository(repository);
          }
        }
      }
    }

    // TODO add authentication (from equivalent server configuration)
    // builder.setAuthentication(authentication)
    return builder.build();
  }
}
