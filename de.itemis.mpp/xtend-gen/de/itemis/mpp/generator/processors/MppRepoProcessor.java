package de.itemis.mpp.generator.processors;

import com.google.common.base.Objects;
import de.itemis.mpp.generator.MppModelProcessor;
import de.itemis.mpp.pom.ChecksumPolicy;
import de.itemis.mpp.pom.POM;
import de.itemis.mpp.pom.Repository;
import de.itemis.mpp.pom.RepositoryPolicy;
import de.itemis.mpp.pom.RepositoryUpdatePolicy;
import java.util.List;
import org.apache.maven.model.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MppRepoProcessor implements MppModelProcessor {
  private Model model;
  
  @Override
  public void process(final POM pom, final Model model) {
    this.model = model;
    EList<Repository> _repositories = pom.getRepositories();
    this.process(_repositories);
  }
  
  public void process(final List<Repository> repositories) {
    boolean _notEquals = (!Objects.equal(repositories, null));
    if (_notEquals) {
      for (final Repository repo : repositories) {
        {
          org.apache.maven.model.Repository _repository = new org.apache.maven.model.Repository();
          final Procedure1<org.apache.maven.model.Repository> _function = new Procedure1<org.apache.maven.model.Repository>() {
            @Override
            public void apply(final org.apache.maven.model.Repository it) {
              String _id = repo.getId();
              it.setId(_id);
              String _name = repo.getName();
              boolean _notEquals = (!Objects.equal(_name, null));
              if (_notEquals) {
                String _name_1 = repo.getName();
                it.setName(_name_1);
              }
              String _url = repo.getUrl();
              it.setUrl(_url);
              String _layout = repo.getLayout();
              boolean _notEquals_1 = (!Objects.equal(_layout, null));
              if (_notEquals_1) {
                String _layout_1 = repo.getLayout();
                it.setLayout(_layout_1);
              }
              EList<RepositoryPolicy> _policies = repo.getPolicies();
              for (final RepositoryPolicy policy : _policies) {
                {
                  org.apache.maven.model.RepositoryPolicy _repositoryPolicy = new org.apache.maven.model.RepositoryPolicy();
                  final Procedure1<org.apache.maven.model.RepositoryPolicy> _function = new Procedure1<org.apache.maven.model.RepositoryPolicy>() {
                    @Override
                    public void apply(final org.apache.maven.model.RepositoryPolicy it) {
                      boolean _isDisabled = policy.isDisabled();
                      boolean _not = (!_isDisabled);
                      it.setEnabled(_not);
                      ChecksumPolicy _checksumPolicy = policy.getChecksumPolicy();
                      String _literal = _checksumPolicy.getLiteral();
                      it.setChecksumPolicy(_literal);
                      RepositoryUpdatePolicy _updatePolicy = policy.getUpdatePolicy();
                      String configuredUpdatePolicy = _updatePolicy.getLiteral();
                      RepositoryUpdatePolicy _updatePolicy_1 = policy.getUpdatePolicy();
                      boolean _equals = Objects.equal(RepositoryUpdatePolicy.INTERVAL, _updatePolicy_1);
                      if (_equals) {
                        String _configuredUpdatePolicy = configuredUpdatePolicy;
                        int _updateInterval = policy.getUpdateInterval();
                        String _plus = (":" + Integer.valueOf(_updateInterval));
                        configuredUpdatePolicy = (_configuredUpdatePolicy + _plus);
                      }
                      it.setUpdatePolicy(configuredUpdatePolicy);
                    }
                  };
                  final org.apache.maven.model.RepositoryPolicy mvnPolicy = ObjectExtensions.<org.apache.maven.model.RepositoryPolicy>operator_doubleArrow(_repositoryPolicy, _function);
                  boolean _isSnapshots = policy.isSnapshots();
                  if (_isSnapshots) {
                    it.setSnapshots(mvnPolicy);
                  } else {
                    it.setReleases(mvnPolicy);
                  }
                }
              }
            }
          };
          final org.apache.maven.model.Repository mvnRepo = ObjectExtensions.<org.apache.maven.model.Repository>operator_doubleArrow(_repository, _function);
          boolean _isPluginRepositroy = repo.isPluginRepositroy();
          if (_isPluginRepositroy) {
            this.model.addPluginRepository(mvnRepo);
          } else {
            this.model.addRepository(mvnRepo);
          }
        }
      }
    }
  }
}
