/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.ArtifactDefinition;
import de.itemis.mpp.pom.BuildStep;
import de.itemis.mpp.pom.ChecksumPolicy;
import de.itemis.mpp.pom.Coordinates;
import de.itemis.mpp.pom.Dependencies;
import de.itemis.mpp.pom.Dependency;
import de.itemis.mpp.pom.DependencyGroup;
import de.itemis.mpp.pom.DependencyInclusion;
import de.itemis.mpp.pom.DependencyScope;
import de.itemis.mpp.pom.ExtendedCoordinates;
import de.itemis.mpp.pom.Modules;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.ParentRef;
import de.itemis.mpp.pom.Phase;
import de.itemis.mpp.pom.Plugin;
import de.itemis.mpp.pom.PluginConfiguration;
import de.itemis.mpp.pom.PluginConfigurationItem;
import de.itemis.mpp.pom.PluginConfigurationParameter;
import de.itemis.mpp.pom.PluginConfigurationParameterList;
import de.itemis.mpp.pom.PluginConfigurationParameterMap;
import de.itemis.mpp.pom.PluginConfigurationParameterMapEntry;
import de.itemis.mpp.pom.PluginConfigurationParameterProperties;
import de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry;
import de.itemis.mpp.pom.PluginExecution;
import de.itemis.mpp.pom.PluginInclusion;
import de.itemis.mpp.pom.PomFactory;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Property;
import de.itemis.mpp.pom.PropertyInclusion;
import de.itemis.mpp.pom.Repository;
import de.itemis.mpp.pom.RepositoryPolicy;
import de.itemis.mpp.pom.RepositoryUpdatePolicy;
import de.itemis.mpp.pom.UngroupedDependency;
import de.itemis.mpp.pom.Version;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PomPackageImpl extends EPackageImpl implements PomPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parentRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyInclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependenciesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ungroupedDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyInclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterMapEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginConfigurationParameterPropertyEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginInclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedCoordinatesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pomImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryPolicyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dependencyScopeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum phaseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum repositoryUpdatePolicyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum checksumPolicyEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.itemis.mpp.pom.PomPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PomPackageImpl()
  {
    super(eNS_URI, PomFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PomPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PomPackage init()
  {
    if (isInited) return (PomPackage)EPackage.Registry.INSTANCE.getEPackage(PomPackage.eNS_URI);

    // Obtain or create and register package
    PomPackageImpl thePomPackage = (PomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PomPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePomPackage.createPackageContents();

    // Initialize created meta-data
    thePomPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePomPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PomPackage.eNS_URI, thePomPackage);
    return thePomPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOM()
  {
    return pomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Imports()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Parent()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_ArtifactDefinition()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Modules()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_PropertyInclusions()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Properties()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Dependencies()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Scm()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_Repositories()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOM_BuildSteps()
  {
    return (EReference)pomEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParentRef()
  {
    return parentRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParentRef_Coordinates()
  {
    return (EReference)parentRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParentRef_RelativePath()
  {
    return (EAttribute)parentRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModules()
  {
    return modulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModules_Names()
  {
    return (EAttribute)modulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifactDefinition()
  {
    return artifactDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactDefinition_GroupId()
  {
    return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactDefinition_ArtifactId()
  {
    return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifactDefinition_Version()
  {
    return (EReference)artifactDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactDefinition_Type()
  {
    return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactDefinition_ArtifactName()
  {
    return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifactDefinition_Description()
  {
    return (EAttribute)artifactDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Major()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Minor()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Incremental()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Qualifier()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_PropertyRef()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Value()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyInclusion()
  {
    return propertyInclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyInclusion_PomRef()
  {
    return (EReference)propertyInclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencies()
  {
    return dependenciesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencies_Includes()
  {
    return (EReference)dependenciesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencies_DependencyGroups()
  {
    return (EReference)dependenciesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencies_UngroupedDependencies()
  {
    return (EReference)dependenciesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencyGroup()
  {
    return dependencyGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyGroup_Scope()
  {
    return (EAttribute)dependencyGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencyGroup_Dependecies()
  {
    return (EReference)dependencyGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUngroupedDependency()
  {
    return ungroupedDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUngroupedDependency_Scope()
  {
    return (EAttribute)ungroupedDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUngroupedDependency_Dependency()
  {
    return (EReference)ungroupedDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependency_Optional()
  {
    return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Coordinates()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencyInclusion()
  {
    return dependencyInclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencyInclusion_PomRef()
  {
    return (EReference)dependencyInclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyInclusion_Scope()
  {
    return (EAttribute)dependencyInclusionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSCM()
  {
    return scmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSCM_Connection()
  {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSCM_DeveloperConncetion()
  {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSCM_Url()
  {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSCM_Tag()
  {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlugin()
  {
    return pluginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlugin_Coordinates()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlugin_Configuration()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlugin_Executions()
  {
    return (EReference)pluginEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfiguration()
  {
    return pluginConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginConfiguration_ConfigurationItems()
  {
    return (EReference)pluginConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationItem()
  {
    return pluginConfigurationItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationItem_Key()
  {
    return (EAttribute)pluginConfigurationItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameter()
  {
    return pluginConfigurationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameter_Value()
  {
    return (EAttribute)pluginConfigurationParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginConfigurationParameter_Children()
  {
    return (EReference)pluginConfigurationParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameterList()
  {
    return pluginConfigurationParameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameterList_Values()
  {
    return (EAttribute)pluginConfigurationParameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameterMap()
  {
    return pluginConfigurationParameterMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginConfigurationParameterMap_Entries()
  {
    return (EReference)pluginConfigurationParameterMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameterMapEntry()
  {
    return pluginConfigurationParameterMapEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameterMapEntry_Key()
  {
    return (EAttribute)pluginConfigurationParameterMapEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameterMapEntry_Value()
  {
    return (EAttribute)pluginConfigurationParameterMapEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameterProperties()
  {
    return pluginConfigurationParameterPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginConfigurationParameterProperties_Entries()
  {
    return (EReference)pluginConfigurationParameterPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginConfigurationParameterPropertyEntry()
  {
    return pluginConfigurationParameterPropertyEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameterPropertyEntry_Key()
  {
    return (EAttribute)pluginConfigurationParameterPropertyEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginConfigurationParameterPropertyEntry_Value()
  {
    return (EAttribute)pluginConfigurationParameterPropertyEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginExecution()
  {
    return pluginExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginExecution_Id()
  {
    return (EAttribute)pluginExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginExecution_Phase()
  {
    return (EAttribute)pluginExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginExecution_Goals()
  {
    return (EAttribute)pluginExecutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginExecution_Configuration()
  {
    return (EReference)pluginExecutionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginExecution_Default()
  {
    return (EAttribute)pluginExecutionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginInclusion()
  {
    return pluginInclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginInclusion_PomRef()
  {
    return (EReference)pluginInclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginInclusion_PluginCoordinates()
  {
    return (EReference)pluginInclusionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginInclusion_ExecutionId()
  {
    return (EAttribute)pluginInclusionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPluginInclusion_Config()
  {
    return (EAttribute)pluginInclusionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildStep()
  {
    return buildStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoordinates()
  {
    return coordinatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinates_GroupId()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinates_ArtifactId()
  {
    return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCoordinates_Version()
  {
    return (EReference)coordinatesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendedCoordinates()
  {
    return extendedCoordinatesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedCoordinates_GroupId()
  {
    return (EAttribute)extendedCoordinatesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedCoordinates_ArtifactId()
  {
    return (EAttribute)extendedCoordinatesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendedCoordinates_Version()
  {
    return (EReference)extendedCoordinatesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedCoordinates_Type()
  {
    return (EAttribute)extendedCoordinatesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendedCoordinates_Classifier()
  {
    return (EAttribute)extendedCoordinatesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOMImport()
  {
    return pomImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOMImport_Coordinates()
  {
    return (EReference)pomImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPOMImport_Name()
  {
    return (EAttribute)pomImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_PluginRepositroy()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Id()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Url()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Name()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Layout()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Policies()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryPolicy()
  {
    return repositoryPolicyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_Disabled()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_Releases()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_Snapshots()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_UpdatePolicy()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_UpdateInterval()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryPolicy_ChecksumPolicy()
  {
    return (EAttribute)repositoryPolicyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDependencyScope()
  {
    return dependencyScopeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPhase()
  {
    return phaseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRepositoryUpdatePolicy()
  {
    return repositoryUpdatePolicyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChecksumPolicy()
  {
    return checksumPolicyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PomFactory getPomFactory()
  {
    return (PomFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pomEClass = createEClass(POM);
    createEReference(pomEClass, POM__IMPORTS);
    createEReference(pomEClass, POM__PARENT);
    createEReference(pomEClass, POM__ARTIFACT_DEFINITION);
    createEReference(pomEClass, POM__MODULES);
    createEReference(pomEClass, POM__PROPERTY_INCLUSIONS);
    createEReference(pomEClass, POM__PROPERTIES);
    createEReference(pomEClass, POM__DEPENDENCIES);
    createEReference(pomEClass, POM__SCM);
    createEReference(pomEClass, POM__REPOSITORIES);
    createEReference(pomEClass, POM__BUILD_STEPS);

    parentRefEClass = createEClass(PARENT_REF);
    createEReference(parentRefEClass, PARENT_REF__COORDINATES);
    createEAttribute(parentRefEClass, PARENT_REF__RELATIVE_PATH);

    modulesEClass = createEClass(MODULES);
    createEAttribute(modulesEClass, MODULES__NAMES);

    artifactDefinitionEClass = createEClass(ARTIFACT_DEFINITION);
    createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__GROUP_ID);
    createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__ARTIFACT_ID);
    createEReference(artifactDefinitionEClass, ARTIFACT_DEFINITION__VERSION);
    createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__TYPE);
    createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__ARTIFACT_NAME);
    createEAttribute(artifactDefinitionEClass, ARTIFACT_DEFINITION__DESCRIPTION);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__MAJOR);
    createEAttribute(versionEClass, VERSION__MINOR);
    createEAttribute(versionEClass, VERSION__INCREMENTAL);
    createEAttribute(versionEClass, VERSION__QUALIFIER);
    createEAttribute(versionEClass, VERSION__PROPERTY_REF);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEAttribute(propertyEClass, PROPERTY__VALUE);

    propertyInclusionEClass = createEClass(PROPERTY_INCLUSION);
    createEReference(propertyInclusionEClass, PROPERTY_INCLUSION__POM_REF);

    dependenciesEClass = createEClass(DEPENDENCIES);
    createEReference(dependenciesEClass, DEPENDENCIES__INCLUDES);
    createEReference(dependenciesEClass, DEPENDENCIES__DEPENDENCY_GROUPS);
    createEReference(dependenciesEClass, DEPENDENCIES__UNGROUPED_DEPENDENCIES);

    dependencyGroupEClass = createEClass(DEPENDENCY_GROUP);
    createEAttribute(dependencyGroupEClass, DEPENDENCY_GROUP__SCOPE);
    createEReference(dependencyGroupEClass, DEPENDENCY_GROUP__DEPENDECIES);

    ungroupedDependencyEClass = createEClass(UNGROUPED_DEPENDENCY);
    createEAttribute(ungroupedDependencyEClass, UNGROUPED_DEPENDENCY__SCOPE);
    createEReference(ungroupedDependencyEClass, UNGROUPED_DEPENDENCY__DEPENDENCY);

    dependencyEClass = createEClass(DEPENDENCY);
    createEAttribute(dependencyEClass, DEPENDENCY__OPTIONAL);
    createEReference(dependencyEClass, DEPENDENCY__COORDINATES);

    dependencyInclusionEClass = createEClass(DEPENDENCY_INCLUSION);
    createEReference(dependencyInclusionEClass, DEPENDENCY_INCLUSION__POM_REF);
    createEAttribute(dependencyInclusionEClass, DEPENDENCY_INCLUSION__SCOPE);

    scmEClass = createEClass(SCM);
    createEAttribute(scmEClass, SCM__CONNECTION);
    createEAttribute(scmEClass, SCM__DEVELOPER_CONNCETION);
    createEAttribute(scmEClass, SCM__URL);
    createEAttribute(scmEClass, SCM__TAG);

    pluginEClass = createEClass(PLUGIN);
    createEReference(pluginEClass, PLUGIN__COORDINATES);
    createEReference(pluginEClass, PLUGIN__CONFIGURATION);
    createEReference(pluginEClass, PLUGIN__EXECUTIONS);

    pluginConfigurationEClass = createEClass(PLUGIN_CONFIGURATION);
    createEReference(pluginConfigurationEClass, PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS);

    pluginConfigurationItemEClass = createEClass(PLUGIN_CONFIGURATION_ITEM);
    createEAttribute(pluginConfigurationItemEClass, PLUGIN_CONFIGURATION_ITEM__KEY);

    pluginConfigurationParameterEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER);
    createEAttribute(pluginConfigurationParameterEClass, PLUGIN_CONFIGURATION_PARAMETER__VALUE);
    createEReference(pluginConfigurationParameterEClass, PLUGIN_CONFIGURATION_PARAMETER__CHILDREN);

    pluginConfigurationParameterListEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER_LIST);
    createEAttribute(pluginConfigurationParameterListEClass, PLUGIN_CONFIGURATION_PARAMETER_LIST__VALUES);

    pluginConfigurationParameterMapEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER_MAP);
    createEReference(pluginConfigurationParameterMapEClass, PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES);

    pluginConfigurationParameterMapEntryEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY);
    createEAttribute(pluginConfigurationParameterMapEntryEClass, PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__KEY);
    createEAttribute(pluginConfigurationParameterMapEntryEClass, PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__VALUE);

    pluginConfigurationParameterPropertiesEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES);
    createEReference(pluginConfigurationParameterPropertiesEClass, PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES__ENTRIES);

    pluginConfigurationParameterPropertyEntryEClass = createEClass(PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY);
    createEAttribute(pluginConfigurationParameterPropertyEntryEClass, PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__KEY);
    createEAttribute(pluginConfigurationParameterPropertyEntryEClass, PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__VALUE);

    pluginExecutionEClass = createEClass(PLUGIN_EXECUTION);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__ID);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__PHASE);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__GOALS);
    createEReference(pluginExecutionEClass, PLUGIN_EXECUTION__CONFIGURATION);
    createEAttribute(pluginExecutionEClass, PLUGIN_EXECUTION__DEFAULT);

    pluginInclusionEClass = createEClass(PLUGIN_INCLUSION);
    createEReference(pluginInclusionEClass, PLUGIN_INCLUSION__POM_REF);
    createEReference(pluginInclusionEClass, PLUGIN_INCLUSION__PLUGIN_COORDINATES);
    createEAttribute(pluginInclusionEClass, PLUGIN_INCLUSION__EXECUTION_ID);
    createEAttribute(pluginInclusionEClass, PLUGIN_INCLUSION__CONFIG);

    buildStepEClass = createEClass(BUILD_STEP);

    coordinatesEClass = createEClass(COORDINATES);
    createEAttribute(coordinatesEClass, COORDINATES__GROUP_ID);
    createEAttribute(coordinatesEClass, COORDINATES__ARTIFACT_ID);
    createEReference(coordinatesEClass, COORDINATES__VERSION);

    extendedCoordinatesEClass = createEClass(EXTENDED_COORDINATES);
    createEAttribute(extendedCoordinatesEClass, EXTENDED_COORDINATES__GROUP_ID);
    createEAttribute(extendedCoordinatesEClass, EXTENDED_COORDINATES__ARTIFACT_ID);
    createEReference(extendedCoordinatesEClass, EXTENDED_COORDINATES__VERSION);
    createEAttribute(extendedCoordinatesEClass, EXTENDED_COORDINATES__TYPE);
    createEAttribute(extendedCoordinatesEClass, EXTENDED_COORDINATES__CLASSIFIER);

    pomImportEClass = createEClass(POM_IMPORT);
    createEReference(pomImportEClass, POM_IMPORT__COORDINATES);
    createEAttribute(pomImportEClass, POM_IMPORT__NAME);

    repositoryEClass = createEClass(REPOSITORY);
    createEAttribute(repositoryEClass, REPOSITORY__PLUGIN_REPOSITROY);
    createEAttribute(repositoryEClass, REPOSITORY__ID);
    createEAttribute(repositoryEClass, REPOSITORY__URL);
    createEAttribute(repositoryEClass, REPOSITORY__NAME);
    createEAttribute(repositoryEClass, REPOSITORY__LAYOUT);
    createEReference(repositoryEClass, REPOSITORY__POLICIES);

    repositoryPolicyEClass = createEClass(REPOSITORY_POLICY);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__DISABLED);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__RELEASES);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__SNAPSHOTS);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__UPDATE_POLICY);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__UPDATE_INTERVAL);
    createEAttribute(repositoryPolicyEClass, REPOSITORY_POLICY__CHECKSUM_POLICY);

    // Create enums
    dependencyScopeEEnum = createEEnum(DEPENDENCY_SCOPE);
    phaseEEnum = createEEnum(PHASE);
    repositoryUpdatePolicyEEnum = createEEnum(REPOSITORY_UPDATE_POLICY);
    checksumPolicyEEnum = createEEnum(CHECKSUM_POLICY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    pluginEClass.getESuperTypes().add(this.getBuildStep());
    pluginConfigurationParameterEClass.getESuperTypes().add(this.getPluginConfigurationItem());
    pluginConfigurationParameterListEClass.getESuperTypes().add(this.getPluginConfigurationItem());
    pluginConfigurationParameterMapEClass.getESuperTypes().add(this.getPluginConfigurationItem());
    pluginConfigurationParameterPropertiesEClass.getESuperTypes().add(this.getPluginConfigurationItem());
    pluginInclusionEClass.getESuperTypes().add(this.getBuildStep());

    // Initialize classes and features; add operations and parameters
    initEClass(pomEClass, de.itemis.mpp.pom.POM.class, "POM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPOM_Imports(), this.getPOMImport(), null, "imports", null, 0, -1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Parent(), this.getParentRef(), null, "parent", null, 0, 1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_ArtifactDefinition(), this.getArtifactDefinition(), null, "artifactDefinition", null, 0, 1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Modules(), this.getModules(), null, "modules", null, 0, 1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_PropertyInclusions(), this.getPropertyInclusion(), null, "propertyInclusions", null, 0, -1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Properties(), this.getProperty(), null, "properties", null, 0, -1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Dependencies(), this.getDependencies(), null, "dependencies", null, 0, 1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Scm(), this.getSCM(), null, "scm", null, 0, 1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPOM_BuildSteps(), this.getBuildStep(), null, "buildSteps", null, 0, -1, de.itemis.mpp.pom.POM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parentRefEClass, ParentRef.class, "ParentRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParentRef_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, ParentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParentRef_RelativePath(), ecorePackage.getEString(), "relativePath", null, 0, 1, ParentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modulesEClass, Modules.class, "Modules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModules_Names(), ecorePackage.getEString(), "names", null, 0, -1, Modules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactDefinitionEClass, ArtifactDefinition.class, "ArtifactDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifactDefinition_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactDefinition_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifactDefinition_Version(), this.getVersion(), null, "version", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactDefinition_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArtifactDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, ArtifactDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Major(), ecorePackage.getEString(), "major", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_Minor(), ecorePackage.getEString(), "minor", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_Incremental(), ecorePackage.getEString(), "incremental", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_Qualifier(), ecorePackage.getEString(), "qualifier", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVersion_PropertyRef(), ecorePackage.getEString(), "propertyRef", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyInclusionEClass, PropertyInclusion.class, "PropertyInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyInclusion_PomRef(), this.getPOMImport(), null, "pomRef", null, 0, 1, PropertyInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependenciesEClass, Dependencies.class, "Dependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencies_Includes(), this.getDependencyInclusion(), null, "includes", null, 0, -1, Dependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependencies_DependencyGroups(), this.getDependencyGroup(), null, "dependencyGroups", null, 0, -1, Dependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependencies_UngroupedDependencies(), this.getUngroupedDependency(), null, "ungroupedDependencies", null, 0, -1, Dependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyGroupEClass, DependencyGroup.class, "DependencyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependencyGroup_Scope(), this.getDependencyScope(), "scope", null, 0, 1, DependencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependencyGroup_Dependecies(), this.getDependency(), null, "dependecies", null, 0, -1, DependencyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ungroupedDependencyEClass, UngroupedDependency.class, "UngroupedDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUngroupedDependency_Scope(), this.getDependencyScope(), "scope", null, 0, 1, UngroupedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUngroupedDependency_Dependency(), this.getDependency(), null, "dependency", null, 0, 1, UngroupedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependency_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependency_Coordinates(), this.getExtendedCoordinates(), null, "coordinates", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyInclusionEClass, DependencyInclusion.class, "DependencyInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencyInclusion_PomRef(), this.getPOMImport(), null, "pomRef", null, 0, 1, DependencyInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependencyInclusion_Scope(), this.getDependencyScope(), "scope", null, 0, 1, DependencyInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scmEClass, de.itemis.mpp.pom.SCM.class, "SCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSCM_Connection(), ecorePackage.getEString(), "connection", null, 0, 1, de.itemis.mpp.pom.SCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSCM_DeveloperConncetion(), ecorePackage.getEString(), "developerConncetion", null, 0, 1, de.itemis.mpp.pom.SCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSCM_Url(), ecorePackage.getEString(), "url", null, 0, 1, de.itemis.mpp.pom.SCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSCM_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, de.itemis.mpp.pom.SCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlugin_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Configuration(), this.getPluginConfiguration(), null, "configuration", null, 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlugin_Executions(), this.getPluginExecution(), null, "executions", null, 0, -1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationEClass, PluginConfiguration.class, "PluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginConfiguration_ConfigurationItems(), this.getPluginConfigurationItem(), null, "configurationItems", null, 0, -1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationItemEClass, PluginConfigurationItem.class, "PluginConfigurationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginConfigurationItem_Key(), ecorePackage.getEString(), "key", null, 0, 1, PluginConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterEClass, PluginConfigurationParameter.class, "PluginConfigurationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginConfigurationParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, PluginConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginConfigurationParameter_Children(), this.getPluginConfigurationItem(), null, "children", null, 0, -1, PluginConfigurationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterListEClass, PluginConfigurationParameterList.class, "PluginConfigurationParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginConfigurationParameterList_Values(), ecorePackage.getEString(), "values", null, 0, -1, PluginConfigurationParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterMapEClass, PluginConfigurationParameterMap.class, "PluginConfigurationParameterMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginConfigurationParameterMap_Entries(), this.getPluginConfigurationParameterMapEntry(), null, "entries", null, 0, -1, PluginConfigurationParameterMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterMapEntryEClass, PluginConfigurationParameterMapEntry.class, "PluginConfigurationParameterMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginConfigurationParameterMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, PluginConfigurationParameterMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginConfigurationParameterMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, PluginConfigurationParameterMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterPropertiesEClass, PluginConfigurationParameterProperties.class, "PluginConfigurationParameterProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginConfigurationParameterProperties_Entries(), this.getPluginConfigurationParameterPropertyEntry(), null, "entries", null, 0, -1, PluginConfigurationParameterProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginConfigurationParameterPropertyEntryEClass, PluginConfigurationParameterPropertyEntry.class, "PluginConfigurationParameterPropertyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginConfigurationParameterPropertyEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, PluginConfigurationParameterPropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginConfigurationParameterPropertyEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, PluginConfigurationParameterPropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginExecutionEClass, PluginExecution.class, "PluginExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPluginExecution_Id(), ecorePackage.getEString(), "id", null, 0, 1, PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Phase(), this.getPhase(), "phase", null, 0, 1, PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Goals(), ecorePackage.getEString(), "goals", null, 0, -1, PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginExecution_Configuration(), this.getPluginConfiguration(), null, "configuration", null, 0, 1, PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginExecution_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, PluginExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginInclusionEClass, PluginInclusion.class, "PluginInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginInclusion_PomRef(), this.getPOMImport(), null, "pomRef", null, 0, 1, PluginInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginInclusion_PluginCoordinates(), this.getCoordinates(), null, "pluginCoordinates", null, 0, 1, PluginInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginInclusion_ExecutionId(), ecorePackage.getEString(), "executionId", null, 0, 1, PluginInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPluginInclusion_Config(), ecorePackage.getEBoolean(), "config", null, 0, 1, PluginInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildStepEClass, BuildStep.class, "BuildStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinates_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinates_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCoordinates_Version(), this.getVersion(), null, "version", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedCoordinatesEClass, ExtendedCoordinates.class, "ExtendedCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtendedCoordinates_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, ExtendedCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendedCoordinates_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, ExtendedCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtendedCoordinates_Version(), this.getVersion(), null, "version", null, 0, 1, ExtendedCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendedCoordinates_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExtendedCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtendedCoordinates_Classifier(), ecorePackage.getEString(), "classifier", null, 0, 1, ExtendedCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pomImportEClass, POMImport.class, "POMImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPOMImport_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, POMImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPOMImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, POMImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepository_PluginRepositroy(), ecorePackage.getEBoolean(), "pluginRepositroy", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Id(), ecorePackage.getEString(), "id", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Url(), ecorePackage.getEString(), "url", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepository_Layout(), ecorePackage.getEString(), "layout", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Policies(), this.getRepositoryPolicy(), null, "policies", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryPolicyEClass, RepositoryPolicy.class, "RepositoryPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryPolicy_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_Releases(), ecorePackage.getEBoolean(), "releases", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_Snapshots(), ecorePackage.getEBoolean(), "snapshots", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_UpdatePolicy(), this.getRepositoryUpdatePolicy(), "updatePolicy", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_UpdateInterval(), ecorePackage.getEInt(), "updateInterval", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryPolicy_ChecksumPolicy(), this.getChecksumPolicy(), "checksumPolicy", null, 0, 1, RepositoryPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dependencyScopeEEnum, DependencyScope.class, "DependencyScope");
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.COMPILE);
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.PROVIDED);
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.RUNTIME);
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.SYSTEM);
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.TEST);
    addEEnumLiteral(dependencyScopeEEnum, DependencyScope.IMPORT);

    initEEnum(phaseEEnum, Phase.class, "Phase");
    addEEnumLiteral(phaseEEnum, Phase.DEFAULT);
    addEEnumLiteral(phaseEEnum, Phase.PRE_CLEAN);
    addEEnumLiteral(phaseEEnum, Phase.CLEAN);
    addEEnumLiteral(phaseEEnum, Phase.POST_CLEAN);
    addEEnumLiteral(phaseEEnum, Phase.VALIDATE);
    addEEnumLiteral(phaseEEnum, Phase.INITIALIZE);
    addEEnumLiteral(phaseEEnum, Phase.GENERATE_SOURCES);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_SOURCES);
    addEEnumLiteral(phaseEEnum, Phase.GENERATE_RESOURCES);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_RESOURCES);
    addEEnumLiteral(phaseEEnum, Phase.COMPILE);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_CLASSES);
    addEEnumLiteral(phaseEEnum, Phase.GENERATE_TEST_SOURCES);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_TEST_SOURCES);
    addEEnumLiteral(phaseEEnum, Phase.GENERATE_TEST_RESOURCES);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_TEST_RESOURCES);
    addEEnumLiteral(phaseEEnum, Phase.TEST_COMPILE);
    addEEnumLiteral(phaseEEnum, Phase.PROCESS_TEST_CLASSES);
    addEEnumLiteral(phaseEEnum, Phase.TEST);
    addEEnumLiteral(phaseEEnum, Phase.PREPARE_PACKAGE);
    addEEnumLiteral(phaseEEnum, Phase.PACKAGE);
    addEEnumLiteral(phaseEEnum, Phase.PRE_INTEGRATION_TEST);
    addEEnumLiteral(phaseEEnum, Phase.INTEGRATION_TEST);
    addEEnumLiteral(phaseEEnum, Phase.POST_INTEGRATION_TEST);
    addEEnumLiteral(phaseEEnum, Phase.VERIFY);
    addEEnumLiteral(phaseEEnum, Phase.INSTALL);
    addEEnumLiteral(phaseEEnum, Phase.DEPLOY);
    addEEnumLiteral(phaseEEnum, Phase.PRE_SITE);
    addEEnumLiteral(phaseEEnum, Phase.SITE);
    addEEnumLiteral(phaseEEnum, Phase.POST_SITE);
    addEEnumLiteral(phaseEEnum, Phase.SITE_DEPLOY);

    initEEnum(repositoryUpdatePolicyEEnum, RepositoryUpdatePolicy.class, "RepositoryUpdatePolicy");
    addEEnumLiteral(repositoryUpdatePolicyEEnum, RepositoryUpdatePolicy.DAILY);
    addEEnumLiteral(repositoryUpdatePolicyEEnum, RepositoryUpdatePolicy.ALWAYS);
    addEEnumLiteral(repositoryUpdatePolicyEEnum, RepositoryUpdatePolicy.NEVER);
    addEEnumLiteral(repositoryUpdatePolicyEEnum, RepositoryUpdatePolicy.INTERVAL);

    initEEnum(checksumPolicyEEnum, ChecksumPolicy.class, "ChecksumPolicy");
    addEEnumLiteral(checksumPolicyEEnum, ChecksumPolicy.IGNORE);
    addEEnumLiteral(checksumPolicyEEnum, ChecksumPolicy.WARN);
    addEEnumLiteral(checksumPolicyEEnum, ChecksumPolicy.FAIL);

    // Create resource
    createResource(eNS_URI);
  }

} //PomPackageImpl
