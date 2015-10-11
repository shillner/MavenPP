package de.itemis.mpp.generator.processors

import de.itemis.mpp.generator.MppModelProcessor
import de.itemis.mpp.pom.POM
import org.apache.maven.model.Model
import java.util.List
import de.itemis.mpp.pom.Repository
import de.itemis.mpp.pom.RepositoryPolicy
import de.itemis.mpp.pom.RepositoryUpdatePolicy

class MppRepoProcessor implements MppModelProcessor {

  var Model model

  override process(POM pom, Model model) {
    this.model = model
    pom.repositories.process
  }

  // TODO add a validator rule to ensure that only one releases and one snapshots rule has been added!
  def void process(List<Repository> repositories) {
    if(repositories != null) {
      for (Repository repo : repositories) {
        val org.apache.maven.model.Repository mvnRepo = new org.apache.maven.model.Repository => [
          id = repo.id
          if(repo.name != null) {
            name = repo.name
          }
          url = repo.url
          if(repo.layout != null) {
            layout = repo.layout
          }
          for (RepositoryPolicy policy : repo.policies) {
            val org.apache.maven.model.RepositoryPolicy mvnPolicy = new org.apache.maven.model.RepositoryPolicy => [
              enabled = !policy.disabled
              checksumPolicy = policy.checksumPolicy.literal

              // TODO add validator rule for update policy -> interval must be set if the interval policy is set
              var configuredUpdatePolicy = policy.updatePolicy.literal
              if(RepositoryUpdatePolicy.INTERVAL == policy.updatePolicy) {
                configuredUpdatePolicy += ":" + policy.updateInterval
              }
              updatePolicy = configuredUpdatePolicy
            ]
            if(policy.isSnapshots) {
              snapshots = mvnPolicy
            } else {
              releases = mvnPolicy
            }
          }
        ]
        if(repo.isPluginRepositroy) {
          model.addPluginRepository(mvnRepo)
        } else {
          model.addRepository(mvnRepo)
        }
      }
    }
  }
}