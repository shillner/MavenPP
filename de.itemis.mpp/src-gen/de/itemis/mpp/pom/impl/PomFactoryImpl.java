/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PomFactoryImpl extends EFactoryImpl implements PomFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PomFactory init()
  {
    try
    {
      PomFactory thePomFactory = (PomFactory)EPackage.Registry.INSTANCE.getEFactory(PomPackage.eNS_URI);
      if (thePomFactory != null)
      {
        return thePomFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PomFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PomFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PomPackage.POM: return createPOM();
      case PomPackage.PARENT_REF: return createParentRef();
      case PomPackage.MODULES: return createModules();
      case PomPackage.ARTIFACT_DEFINITION: return createArtifactDefinition();
      case PomPackage.VERSION: return createVersion();
      case PomPackage.PROPERTIES: return createProperties();
      case PomPackage.PROPERTY: return createProperty();
      case PomPackage.IMPORT_PROPERTY_INCLUSION: return createImportPropertyInclusion();
      case PomPackage.FILE_PROPERTY_INCLUSION: return createFilePropertyInclusion();
      case PomPackage.PROPERTY_INCLUSION: return createPropertyInclusion();
      case PomPackage.DEPENDENCIES: return createDependencies();
      case PomPackage.DEPENDENCY_GROUP: return createDependencyGroup();
      case PomPackage.UNGROUPED_DEPENDENCY: return createUngroupedDependency();
      case PomPackage.DEPENDENCY: return createDependency();
      case PomPackage.DEPENDENCY_INCLUSION: return createDependencyInclusion();
      case PomPackage.SCM: return createSCM();
      case PomPackage.PLUGIN: return createPlugin();
      case PomPackage.PLUGIN_CONFIGURATION: return createPluginConfiguration();
      case PomPackage.PLUGIN_CONFIGURATION_ITEM: return createPluginConfigurationItem();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER: return createPluginConfigurationParameter();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_LIST: return createPluginConfigurationParameterList();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP: return createPluginConfigurationParameterMap();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY: return createPluginConfigurationParameterMapEntry();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES: return createPluginConfigurationParameterProperties();
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY: return createPluginConfigurationParameterPropertyEntry();
      case PomPackage.PLUGIN_EXECUTION: return createPluginExecution();
      case PomPackage.PLUGIN_INCLUSION: return createPluginInclusion();
      case PomPackage.BUILD_STEP: return createBuildStep();
      case PomPackage.COORDINATES: return createCoordinates();
      case PomPackage.EXTENDED_COORDINATES: return createExtendedCoordinates();
      case PomPackage.POM_IMPORT: return createPOMImport();
      case PomPackage.REPOSITORY: return createRepository();
      case PomPackage.REPOSITORY_POLICY: return createRepositoryPolicy();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PomPackage.DEPENDENCY_SCOPE:
        return createDependencyScopeFromString(eDataType, initialValue);
      case PomPackage.PHASE:
        return createPhaseFromString(eDataType, initialValue);
      case PomPackage.REPOSITORY_UPDATE_POLICY:
        return createRepositoryUpdatePolicyFromString(eDataType, initialValue);
      case PomPackage.CHECKSUM_POLICY:
        return createChecksumPolicyFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PomPackage.DEPENDENCY_SCOPE:
        return convertDependencyScopeToString(eDataType, instanceValue);
      case PomPackage.PHASE:
        return convertPhaseToString(eDataType, instanceValue);
      case PomPackage.REPOSITORY_UPDATE_POLICY:
        return convertRepositoryUpdatePolicyToString(eDataType, instanceValue);
      case PomPackage.CHECKSUM_POLICY:
        return convertChecksumPolicyToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POM createPOM()
  {
    POMImpl pom = new POMImpl();
    return pom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentRef createParentRef()
  {
    ParentRefImpl parentRef = new ParentRefImpl();
    return parentRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modules createModules()
  {
    ModulesImpl modules = new ModulesImpl();
    return modules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactDefinition createArtifactDefinition()
  {
    ArtifactDefinitionImpl artifactDefinition = new ArtifactDefinitionImpl();
    return artifactDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Properties createProperties()
  {
    PropertiesImpl properties = new PropertiesImpl();
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportPropertyInclusion createImportPropertyInclusion()
  {
    ImportPropertyInclusionImpl importPropertyInclusion = new ImportPropertyInclusionImpl();
    return importPropertyInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePropertyInclusion createFilePropertyInclusion()
  {
    FilePropertyInclusionImpl filePropertyInclusion = new FilePropertyInclusionImpl();
    return filePropertyInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyInclusion createPropertyInclusion()
  {
    PropertyInclusionImpl propertyInclusion = new PropertyInclusionImpl();
    return propertyInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependencies createDependencies()
  {
    DependenciesImpl dependencies = new DependenciesImpl();
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyGroup createDependencyGroup()
  {
    DependencyGroupImpl dependencyGroup = new DependencyGroupImpl();
    return dependencyGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UngroupedDependency createUngroupedDependency()
  {
    UngroupedDependencyImpl ungroupedDependency = new UngroupedDependencyImpl();
    return ungroupedDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyInclusion createDependencyInclusion()
  {
    DependencyInclusionImpl dependencyInclusion = new DependencyInclusionImpl();
    return dependencyInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCM createSCM()
  {
    SCMImpl scm = new SCMImpl();
    return scm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plugin createPlugin()
  {
    PluginImpl plugin = new PluginImpl();
    return plugin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfiguration createPluginConfiguration()
  {
    PluginConfigurationImpl pluginConfiguration = new PluginConfigurationImpl();
    return pluginConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationItem createPluginConfigurationItem()
  {
    PluginConfigurationItemImpl pluginConfigurationItem = new PluginConfigurationItemImpl();
    return pluginConfigurationItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameter createPluginConfigurationParameter()
  {
    PluginConfigurationParameterImpl pluginConfigurationParameter = new PluginConfigurationParameterImpl();
    return pluginConfigurationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameterList createPluginConfigurationParameterList()
  {
    PluginConfigurationParameterListImpl pluginConfigurationParameterList = new PluginConfigurationParameterListImpl();
    return pluginConfigurationParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameterMap createPluginConfigurationParameterMap()
  {
    PluginConfigurationParameterMapImpl pluginConfigurationParameterMap = new PluginConfigurationParameterMapImpl();
    return pluginConfigurationParameterMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameterMapEntry createPluginConfigurationParameterMapEntry()
  {
    PluginConfigurationParameterMapEntryImpl pluginConfigurationParameterMapEntry = new PluginConfigurationParameterMapEntryImpl();
    return pluginConfigurationParameterMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameterProperties createPluginConfigurationParameterProperties()
  {
    PluginConfigurationParameterPropertiesImpl pluginConfigurationParameterProperties = new PluginConfigurationParameterPropertiesImpl();
    return pluginConfigurationParameterProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfigurationParameterPropertyEntry createPluginConfigurationParameterPropertyEntry()
  {
    PluginConfigurationParameterPropertyEntryImpl pluginConfigurationParameterPropertyEntry = new PluginConfigurationParameterPropertyEntryImpl();
    return pluginConfigurationParameterPropertyEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginExecution createPluginExecution()
  {
    PluginExecutionImpl pluginExecution = new PluginExecutionImpl();
    return pluginExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginInclusion createPluginInclusion()
  {
    PluginInclusionImpl pluginInclusion = new PluginInclusionImpl();
    return pluginInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildStep createBuildStep()
  {
    BuildStepImpl buildStep = new BuildStepImpl();
    return buildStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinates createCoordinates()
  {
    CoordinatesImpl coordinates = new CoordinatesImpl();
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedCoordinates createExtendedCoordinates()
  {
    ExtendedCoordinatesImpl extendedCoordinates = new ExtendedCoordinatesImpl();
    return extendedCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POMImport createPOMImport()
  {
    POMImportImpl pomImport = new POMImportImpl();
    return pomImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryPolicy createRepositoryPolicy()
  {
    RepositoryPolicyImpl repositoryPolicy = new RepositoryPolicyImpl();
    return repositoryPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyScope createDependencyScopeFromString(EDataType eDataType, String initialValue)
  {
    DependencyScope result = DependencyScope.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDependencyScopeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase createPhaseFromString(EDataType eDataType, String initialValue)
  {
    Phase result = Phase.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPhaseToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryUpdatePolicy createRepositoryUpdatePolicyFromString(EDataType eDataType, String initialValue)
  {
    RepositoryUpdatePolicy result = RepositoryUpdatePolicy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRepositoryUpdatePolicyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChecksumPolicy createChecksumPolicyFromString(EDataType eDataType, String initialValue)
  {
    ChecksumPolicy result = ChecksumPolicy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChecksumPolicyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PomPackage getPomPackage()
  {
    return (PomPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PomPackage getPackage()
  {
    return PomPackage.eINSTANCE;
  }

} //PomFactoryImpl
