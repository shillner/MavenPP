/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomFactory
 * @model kind="package"
 * @generated
 */
public interface PomPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pom";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itemis.de/mpp/Pom";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pom";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PomPackage eINSTANCE = de.itemis.mpp.pom.impl.PomPackageImpl.init();

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.POMImpl <em>POM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.POMImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPOM()
   * @generated
   */
  int POM = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__PARENT = 1;

  /**
   * The feature id for the '<em><b>Artifact Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__ARTIFACT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__MODULES = 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__DEPENDENCIES = 5;

  /**
   * The feature id for the '<em><b>Scm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__SCM = 6;

  /**
   * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__REPOSITORIES = 7;

  /**
   * The feature id for the '<em><b>Build Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM__BUILD_STEPS = 8;

  /**
   * The number of structural features of the '<em>POM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.ParentRefImpl <em>Parent Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.ParentRefImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getParentRef()
   * @generated
   */
  int PARENT_REF = 1;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_REF__COORDINATES = 0;

  /**
   * The feature id for the '<em><b>Relative Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_REF__RELATIVE_PATH = 1;

  /**
   * The number of structural features of the '<em>Parent Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.ModulesImpl <em>Modules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.ModulesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getModules()
   * @generated
   */
  int MODULES = 2;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULES__NAMES = 0;

  /**
   * The number of structural features of the '<em>Modules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.ArtifactDefinitionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getArtifactDefinition()
   * @generated
   */
  int ARTIFACT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__VERSION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__TYPE = 3;

  /**
   * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__ARTIFACT_NAME = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Artifact Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_DEFINITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.VersionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 4;

  /**
   * The feature id for the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MAJOR = 0;

  /**
   * The feature id for the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MINOR = 1;

  /**
   * The feature id for the '<em><b>Incremental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__INCREMENTAL = 2;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__QUALIFIER = 3;

  /**
   * The feature id for the '<em><b>Property Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__PROPERTY_REF = 4;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PropertiesImpl <em>Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PropertiesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getProperties()
   * @generated
   */
  int PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Inclusions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES__INCLUSIONS = 1;

  /**
   * The number of structural features of the '<em>Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PropertyImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PropertyInclusionImpl <em>Property Inclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PropertyInclusionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPropertyInclusion()
   * @generated
   */
  int PROPERTY_INCLUSION = 9;

  /**
   * The number of structural features of the '<em>Property Inclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INCLUSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.ImportPropertyInclusionImpl <em>Import Property Inclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.ImportPropertyInclusionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getImportPropertyInclusion()
   * @generated
   */
  int IMPORT_PROPERTY_INCLUSION = 7;

  /**
   * The feature id for the '<em><b>Pom Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_PROPERTY_INCLUSION__POM_REF = PROPERTY_INCLUSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Property Inclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_PROPERTY_INCLUSION_FEATURE_COUNT = PROPERTY_INCLUSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.FilePropertyInclusionImpl <em>File Property Inclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.FilePropertyInclusionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getFilePropertyInclusion()
   * @generated
   */
  int FILE_PROPERTY_INCLUSION = 8;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PROPERTY_INCLUSION__PATH = PROPERTY_INCLUSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File Property Inclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PROPERTY_INCLUSION_FEATURE_COUNT = PROPERTY_INCLUSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.DependenciesImpl <em>Dependencies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.DependenciesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencies()
   * @generated
   */
  int DEPENDENCIES = 10;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Dependency Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES__DEPENDENCY_GROUPS = 1;

  /**
   * The feature id for the '<em><b>Ungrouped Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES__UNGROUPED_DEPENDENCIES = 2;

  /**
   * The number of structural features of the '<em>Dependencies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.DependencyGroupImpl <em>Dependency Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.DependencyGroupImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyGroup()
   * @generated
   */
  int DEPENDENCY_GROUP = 11;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_GROUP__SCOPE = 0;

  /**
   * The feature id for the '<em><b>Dependecies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_GROUP__DEPENDECIES = 1;

  /**
   * The number of structural features of the '<em>Dependency Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.UngroupedDependencyImpl <em>Ungrouped Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.UngroupedDependencyImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getUngroupedDependency()
   * @generated
   */
  int UNGROUPED_DEPENDENCY = 12;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNGROUPED_DEPENDENCY__SCOPE = 0;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNGROUPED_DEPENDENCY__DEPENDENCY = 1;

  /**
   * The number of structural features of the '<em>Ungrouped Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNGROUPED_DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.DependencyImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 13;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__OPTIONAL = 0;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__COORDINATES = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.DependencyInclusionImpl <em>Dependency Inclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.DependencyInclusionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyInclusion()
   * @generated
   */
  int DEPENDENCY_INCLUSION = 14;

  /**
   * The feature id for the '<em><b>Pom Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_INCLUSION__POM_REF = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_INCLUSION__SCOPE = 1;

  /**
   * The number of structural features of the '<em>Dependency Inclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_INCLUSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.SCMImpl <em>SCM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.SCMImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getSCM()
   * @generated
   */
  int SCM = 15;

  /**
   * The feature id for the '<em><b>Connection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCM__CONNECTION = 0;

  /**
   * The feature id for the '<em><b>Developer Conncetion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCM__DEVELOPER_CONNCETION = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCM__URL = 2;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCM__TAG = 3;

  /**
   * The number of structural features of the '<em>SCM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.BuildStepImpl <em>Build Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.BuildStepImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getBuildStep()
   * @generated
   */
  int BUILD_STEP = 27;

  /**
   * The number of structural features of the '<em>Build Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_STEP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginImpl <em>Plugin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPlugin()
   * @generated
   */
  int PLUGIN = 16;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__COORDINATES = BUILD_STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__CONFIGURATION = BUILD_STEP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Executions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN__EXECUTIONS = BUILD_STEP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Plugin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_FEATURE_COUNT = BUILD_STEP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationImpl <em>Plugin Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfiguration()
   * @generated
   */
  int PLUGIN_CONFIGURATION = 17;

  /**
   * The feature id for the '<em><b>Configuration Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Plugin Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationItemImpl <em>Plugin Configuration Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationItemImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationItem()
   * @generated
   */
  int PLUGIN_CONFIGURATION_ITEM = 18;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_ITEM__KEY = 0;

  /**
   * The number of structural features of the '<em>Plugin Configuration Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterImpl <em>Plugin Configuration Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameter()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER = 19;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER__KEY = PLUGIN_CONFIGURATION_ITEM__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER__VALUE = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER__CHILDREN = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_FEATURE_COUNT = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterListImpl <em>Plugin Configuration Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterListImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterList()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER_LIST = 20;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_LIST__KEY = PLUGIN_CONFIGURATION_ITEM__KEY;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_LIST__VALUES = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_LIST_FEATURE_COUNT = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterMapImpl <em>Plugin Configuration Parameter Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterMapImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterMap()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP = 21;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP__KEY = PLUGIN_CONFIGURATION_ITEM__KEY;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP_FEATURE_COUNT = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterMapEntryImpl <em>Plugin Configuration Parameter Map Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterMapEntryImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterMapEntry()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY = 22;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter Map Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertiesImpl <em>Plugin Configuration Parameter Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertiesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterProperties()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES = 23;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES__KEY = PLUGIN_CONFIGURATION_ITEM__KEY;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES__ENTRIES = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES_FEATURE_COUNT = PLUGIN_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertyEntryImpl <em>Plugin Configuration Parameter Property Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertyEntryImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterPropertyEntry()
   * @generated
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY = 24;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Plugin Configuration Parameter Property Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginExecutionImpl <em>Plugin Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginExecutionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginExecution()
   * @generated
   */
  int PLUGIN_EXECUTION = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION__ID = 0;

  /**
   * The feature id for the '<em><b>Phase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION__PHASE = 1;

  /**
   * The feature id for the '<em><b>Goals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION__GOALS = 2;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION__CONFIGURATION = 3;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION__DEFAULT = 4;

  /**
   * The number of structural features of the '<em>Plugin Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_EXECUTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.PluginInclusionImpl <em>Plugin Inclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.PluginInclusionImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginInclusion()
   * @generated
   */
  int PLUGIN_INCLUSION = 26;

  /**
   * The feature id for the '<em><b>Pom Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_INCLUSION__POM_REF = BUILD_STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Plugin Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_INCLUSION__PLUGIN_COORDINATES = BUILD_STEP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Execution Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_INCLUSION__EXECUTION_ID = BUILD_STEP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_INCLUSION__CONFIG = BUILD_STEP_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Plugin Inclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_INCLUSION_FEATURE_COUNT = BUILD_STEP_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.CoordinatesImpl <em>Coordinates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.CoordinatesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getCoordinates()
   * @generated
   */
  int COORDINATES = 28;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__VERSION = 2;

  /**
   * The number of structural features of the '<em>Coordinates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl <em>Extended Coordinates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getExtendedCoordinates()
   * @generated
   */
  int EXTENDED_COORDINATES = 29;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES__VERSION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES__TYPE = 3;

  /**
   * The feature id for the '<em><b>Classifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES__CLASSIFIER = 4;

  /**
   * The number of structural features of the '<em>Extended Coordinates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COORDINATES_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.POMImportImpl <em>POM Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.POMImportImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPOMImport()
   * @generated
   */
  int POM_IMPORT = 30;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM_IMPORT__COORDINATES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM_IMPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>POM Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POM_IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.RepositoryImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 31;

  /**
   * The feature id for the '<em><b>Plugin Repositroy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PLUGIN_REPOSITROY = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__ID = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__URL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__NAME = 3;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__LAYOUT = 4;

  /**
   * The feature id for the '<em><b>Policies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__POLICIES = 5;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl <em>Repository Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.impl.RepositoryPolicyImpl
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepositoryPolicy()
   * @generated
   */
  int REPOSITORY_POLICY = 32;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__DISABLED = 0;

  /**
   * The feature id for the '<em><b>Releases</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__RELEASES = 1;

  /**
   * The feature id for the '<em><b>Snapshots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__SNAPSHOTS = 2;

  /**
   * The feature id for the '<em><b>Update Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__UPDATE_POLICY = 3;

  /**
   * The feature id for the '<em><b>Update Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__UPDATE_INTERVAL = 4;

  /**
   * The feature id for the '<em><b>Checksum Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY__CHECKSUM_POLICY = 5;

  /**
   * The number of structural features of the '<em>Repository Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_POLICY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.DependencyScope <em>Dependency Scope</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.DependencyScope
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyScope()
   * @generated
   */
  int DEPENDENCY_SCOPE = 33;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.Phase <em>Phase</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.Phase
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPhase()
   * @generated
   */
  int PHASE = 34;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.RepositoryUpdatePolicy <em>Repository Update Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.RepositoryUpdatePolicy
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepositoryUpdatePolicy()
   * @generated
   */
  int REPOSITORY_UPDATE_POLICY = 35;

  /**
   * The meta object id for the '{@link de.itemis.mpp.pom.ChecksumPolicy <em>Checksum Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.itemis.mpp.pom.ChecksumPolicy
   * @see de.itemis.mpp.pom.impl.PomPackageImpl#getChecksumPolicy()
   * @generated
   */
  int CHECKSUM_POLICY = 36;


  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.POM <em>POM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POM</em>'.
   * @see de.itemis.mpp.pom.POM
   * @generated
   */
  EClass getPOM();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.POM#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.itemis.mpp.pom.POM#getImports()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Imports();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent</em>'.
   * @see de.itemis.mpp.pom.POM#getParent()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Parent();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getArtifactDefinition <em>Artifact Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Artifact Definition</em>'.
   * @see de.itemis.mpp.pom.POM#getArtifactDefinition()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_ArtifactDefinition();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modules</em>'.
   * @see de.itemis.mpp.pom.POM#getModules()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Modules();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see de.itemis.mpp.pom.POM#getProperties()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Properties();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependencies</em>'.
   * @see de.itemis.mpp.pom.POM#getDependencies()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Dependencies();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POM#getScm <em>Scm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scm</em>'.
   * @see de.itemis.mpp.pom.POM#getScm()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Scm();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.POM#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repositories</em>'.
   * @see de.itemis.mpp.pom.POM#getRepositories()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_Repositories();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.POM#getBuildSteps <em>Build Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Build Steps</em>'.
   * @see de.itemis.mpp.pom.POM#getBuildSteps()
   * @see #getPOM()
   * @generated
   */
  EReference getPOM_BuildSteps();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.ParentRef <em>Parent Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Ref</em>'.
   * @see de.itemis.mpp.pom.ParentRef
   * @generated
   */
  EClass getParentRef();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.ParentRef#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinates</em>'.
   * @see de.itemis.mpp.pom.ParentRef#getCoordinates()
   * @see #getParentRef()
   * @generated
   */
  EReference getParentRef_Coordinates();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ParentRef#getRelativePath <em>Relative Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relative Path</em>'.
   * @see de.itemis.mpp.pom.ParentRef#getRelativePath()
   * @see #getParentRef()
   * @generated
   */
  EAttribute getParentRef_RelativePath();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Modules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modules</em>'.
   * @see de.itemis.mpp.pom.Modules
   * @generated
   */
  EClass getModules();

  /**
   * Returns the meta object for the attribute list '{@link de.itemis.mpp.pom.Modules#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see de.itemis.mpp.pom.Modules#getNames()
   * @see #getModules()
   * @generated
   */
  EAttribute getModules_Names();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.ArtifactDefinition <em>Artifact Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact Definition</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition
   * @generated
   */
  EClass getArtifactDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ArtifactDefinition#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getGroupId()
   * @see #getArtifactDefinition()
   * @generated
   */
  EAttribute getArtifactDefinition_GroupId();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getArtifactId()
   * @see #getArtifactDefinition()
   * @generated
   */
  EAttribute getArtifactDefinition_ArtifactId();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.ArtifactDefinition#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getVersion()
   * @see #getArtifactDefinition()
   * @generated
   */
  EReference getArtifactDefinition_Version();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ArtifactDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getType()
   * @see #getArtifactDefinition()
   * @generated
   */
  EAttribute getArtifactDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactName <em>Artifact Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Name</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getArtifactName()
   * @see #getArtifactDefinition()
   * @generated
   */
  EAttribute getArtifactDefinition_ArtifactName();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ArtifactDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.itemis.mpp.pom.ArtifactDefinition#getDescription()
   * @see #getArtifactDefinition()
   * @generated
   */
  EAttribute getArtifactDefinition_Description();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see de.itemis.mpp.pom.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Version#getMajor <em>Major</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Major</em>'.
   * @see de.itemis.mpp.pom.Version#getMajor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Major();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Version#getMinor <em>Minor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minor</em>'.
   * @see de.itemis.mpp.pom.Version#getMinor()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Minor();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Version#getIncremental <em>Incremental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incremental</em>'.
   * @see de.itemis.mpp.pom.Version#getIncremental()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Incremental();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Version#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see de.itemis.mpp.pom.Version#getQualifier()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Version#getPropertyRef <em>Property Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Ref</em>'.
   * @see de.itemis.mpp.pom.Version#getPropertyRef()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_PropertyRef();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Properties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties</em>'.
   * @see de.itemis.mpp.pom.Properties
   * @generated
   */
  EClass getProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Properties#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see de.itemis.mpp.pom.Properties#getProperties()
   * @see #getProperties()
   * @generated
   */
  EReference getProperties_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Properties#getInclusions <em>Inclusions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inclusions</em>'.
   * @see de.itemis.mpp.pom.Properties#getInclusions()
   * @see #getProperties()
   * @generated
   */
  EReference getProperties_Inclusions();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see de.itemis.mpp.pom.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.itemis.mpp.pom.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.itemis.mpp.pom.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.ImportPropertyInclusion <em>Import Property Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Property Inclusion</em>'.
   * @see de.itemis.mpp.pom.ImportPropertyInclusion
   * @generated
   */
  EClass getImportPropertyInclusion();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mpp.pom.ImportPropertyInclusion#getPomRef <em>Pom Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pom Ref</em>'.
   * @see de.itemis.mpp.pom.ImportPropertyInclusion#getPomRef()
   * @see #getImportPropertyInclusion()
   * @generated
   */
  EReference getImportPropertyInclusion_PomRef();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.FilePropertyInclusion <em>File Property Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Property Inclusion</em>'.
   * @see de.itemis.mpp.pom.FilePropertyInclusion
   * @generated
   */
  EClass getFilePropertyInclusion();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.FilePropertyInclusion#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see de.itemis.mpp.pom.FilePropertyInclusion#getPath()
   * @see #getFilePropertyInclusion()
   * @generated
   */
  EAttribute getFilePropertyInclusion_Path();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PropertyInclusion <em>Property Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Inclusion</em>'.
   * @see de.itemis.mpp.pom.PropertyInclusion
   * @generated
   */
  EClass getPropertyInclusion();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Dependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependencies</em>'.
   * @see de.itemis.mpp.pom.Dependencies
   * @generated
   */
  EClass getDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Dependencies#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see de.itemis.mpp.pom.Dependencies#getIncludes()
   * @see #getDependencies()
   * @generated
   */
  EReference getDependencies_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Dependencies#getDependencyGroups <em>Dependency Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependency Groups</em>'.
   * @see de.itemis.mpp.pom.Dependencies#getDependencyGroups()
   * @see #getDependencies()
   * @generated
   */
  EReference getDependencies_DependencyGroups();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Dependencies#getUngroupedDependencies <em>Ungrouped Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ungrouped Dependencies</em>'.
   * @see de.itemis.mpp.pom.Dependencies#getUngroupedDependencies()
   * @see #getDependencies()
   * @generated
   */
  EReference getDependencies_UngroupedDependencies();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.DependencyGroup <em>Dependency Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Group</em>'.
   * @see de.itemis.mpp.pom.DependencyGroup
   * @generated
   */
  EClass getDependencyGroup();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.DependencyGroup#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see de.itemis.mpp.pom.DependencyGroup#getScope()
   * @see #getDependencyGroup()
   * @generated
   */
  EAttribute getDependencyGroup_Scope();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.DependencyGroup#getDependecies <em>Dependecies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependecies</em>'.
   * @see de.itemis.mpp.pom.DependencyGroup#getDependecies()
   * @see #getDependencyGroup()
   * @generated
   */
  EReference getDependencyGroup_Dependecies();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.UngroupedDependency <em>Ungrouped Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ungrouped Dependency</em>'.
   * @see de.itemis.mpp.pom.UngroupedDependency
   * @generated
   */
  EClass getUngroupedDependency();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.UngroupedDependency#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see de.itemis.mpp.pom.UngroupedDependency#getScope()
   * @see #getUngroupedDependency()
   * @generated
   */
  EAttribute getUngroupedDependency_Scope();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.UngroupedDependency#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependency</em>'.
   * @see de.itemis.mpp.pom.UngroupedDependency#getDependency()
   * @see #getUngroupedDependency()
   * @generated
   */
  EReference getUngroupedDependency_Dependency();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see de.itemis.mpp.pom.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Dependency#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see de.itemis.mpp.pom.Dependency#isOptional()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Optional();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.Dependency#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinates</em>'.
   * @see de.itemis.mpp.pom.Dependency#getCoordinates()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Coordinates();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.DependencyInclusion <em>Dependency Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Inclusion</em>'.
   * @see de.itemis.mpp.pom.DependencyInclusion
   * @generated
   */
  EClass getDependencyInclusion();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mpp.pom.DependencyInclusion#getPomRef <em>Pom Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pom Ref</em>'.
   * @see de.itemis.mpp.pom.DependencyInclusion#getPomRef()
   * @see #getDependencyInclusion()
   * @generated
   */
  EReference getDependencyInclusion_PomRef();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.DependencyInclusion#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see de.itemis.mpp.pom.DependencyInclusion#getScope()
   * @see #getDependencyInclusion()
   * @generated
   */
  EAttribute getDependencyInclusion_Scope();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.SCM <em>SCM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SCM</em>'.
   * @see de.itemis.mpp.pom.SCM
   * @generated
   */
  EClass getSCM();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.SCM#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection</em>'.
   * @see de.itemis.mpp.pom.SCM#getConnection()
   * @see #getSCM()
   * @generated
   */
  EAttribute getSCM_Connection();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.SCM#getDeveloperConncetion <em>Developer Conncetion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Developer Conncetion</em>'.
   * @see de.itemis.mpp.pom.SCM#getDeveloperConncetion()
   * @see #getSCM()
   * @generated
   */
  EAttribute getSCM_DeveloperConncetion();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.SCM#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see de.itemis.mpp.pom.SCM#getUrl()
   * @see #getSCM()
   * @generated
   */
  EAttribute getSCM_Url();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.SCM#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see de.itemis.mpp.pom.SCM#getTag()
   * @see #getSCM()
   * @generated
   */
  EAttribute getSCM_Tag();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Plugin <em>Plugin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin</em>'.
   * @see de.itemis.mpp.pom.Plugin
   * @generated
   */
  EClass getPlugin();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.Plugin#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinates</em>'.
   * @see de.itemis.mpp.pom.Plugin#getCoordinates()
   * @see #getPlugin()
   * @generated
   */
  EReference getPlugin_Coordinates();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.Plugin#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see de.itemis.mpp.pom.Plugin#getConfiguration()
   * @see #getPlugin()
   * @generated
   */
  EReference getPlugin_Configuration();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Plugin#getExecutions <em>Executions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Executions</em>'.
   * @see de.itemis.mpp.pom.Plugin#getExecutions()
   * @see #getPlugin()
   * @generated
   */
  EReference getPlugin_Executions();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfiguration <em>Plugin Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration</em>'.
   * @see de.itemis.mpp.pom.PluginConfiguration
   * @generated
   */
  EClass getPluginConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.PluginConfiguration#getConfigurationItems <em>Configuration Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configuration Items</em>'.
   * @see de.itemis.mpp.pom.PluginConfiguration#getConfigurationItems()
   * @see #getPluginConfiguration()
   * @generated
   */
  EReference getPluginConfiguration_ConfigurationItems();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationItem <em>Plugin Configuration Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Item</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationItem
   * @generated
   */
  EClass getPluginConfigurationItem();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationItem#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationItem#getKey()
   * @see #getPluginConfigurationItem()
   * @generated
   */
  EAttribute getPluginConfigurationItem_Key();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameter <em>Plugin Configuration Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameter
   * @generated
   */
  EClass getPluginConfigurationParameter();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameter#getValue()
   * @see #getPluginConfigurationParameter()
   * @generated
   */
  EAttribute getPluginConfigurationParameter_Value();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.PluginConfigurationParameter#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameter#getChildren()
   * @see #getPluginConfigurationParameter()
   * @generated
   */
  EReference getPluginConfigurationParameter_Children();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameterList <em>Plugin Configuration Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter List</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterList
   * @generated
   */
  EClass getPluginConfigurationParameterList();

  /**
   * Returns the meta object for the attribute list '{@link de.itemis.mpp.pom.PluginConfigurationParameterList#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterList#getValues()
   * @see #getPluginConfigurationParameterList()
   * @generated
   */
  EAttribute getPluginConfigurationParameterList_Values();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameterMap <em>Plugin Configuration Parameter Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter Map</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMap
   * @generated
   */
  EClass getPluginConfigurationParameterMap();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.PluginConfigurationParameterMap#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMap#getEntries()
   * @see #getPluginConfigurationParameterMap()
   * @generated
   */
  EReference getPluginConfigurationParameterMap_Entries();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameterMapEntry <em>Plugin Configuration Parameter Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter Map Entry</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMapEntry
   * @generated
   */
  EClass getPluginConfigurationParameterMapEntry();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationParameterMapEntry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMapEntry#getKey()
   * @see #getPluginConfigurationParameterMapEntry()
   * @generated
   */
  EAttribute getPluginConfigurationParameterMapEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationParameterMapEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMapEntry#getValue()
   * @see #getPluginConfigurationParameterMapEntry()
   * @generated
   */
  EAttribute getPluginConfigurationParameterMapEntry_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameterProperties <em>Plugin Configuration Parameter Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter Properties</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterProperties
   * @generated
   */
  EClass getPluginConfigurationParameterProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.PluginConfigurationParameterProperties#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterProperties#getEntries()
   * @see #getPluginConfigurationParameterProperties()
   * @generated
   */
  EReference getPluginConfigurationParameterProperties_Entries();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry <em>Plugin Configuration Parameter Property Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Configuration Parameter Property Entry</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry
   * @generated
   */
  EClass getPluginConfigurationParameterPropertyEntry();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry#getKey()
   * @see #getPluginConfigurationParameterPropertyEntry()
   * @generated
   */
  EAttribute getPluginConfigurationParameterPropertyEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry#getValue()
   * @see #getPluginConfigurationParameterPropertyEntry()
   * @generated
   */
  EAttribute getPluginConfigurationParameterPropertyEntry_Value();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginExecution <em>Plugin Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Execution</em>'.
   * @see de.itemis.mpp.pom.PluginExecution
   * @generated
   */
  EClass getPluginExecution();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginExecution#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.itemis.mpp.pom.PluginExecution#getId()
   * @see #getPluginExecution()
   * @generated
   */
  EAttribute getPluginExecution_Id();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginExecution#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phase</em>'.
   * @see de.itemis.mpp.pom.PluginExecution#getPhase()
   * @see #getPluginExecution()
   * @generated
   */
  EAttribute getPluginExecution_Phase();

  /**
   * Returns the meta object for the attribute list '{@link de.itemis.mpp.pom.PluginExecution#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Goals</em>'.
   * @see de.itemis.mpp.pom.PluginExecution#getGoals()
   * @see #getPluginExecution()
   * @generated
   */
  EAttribute getPluginExecution_Goals();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.PluginExecution#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see de.itemis.mpp.pom.PluginExecution#getConfiguration()
   * @see #getPluginExecution()
   * @generated
   */
  EReference getPluginExecution_Configuration();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginExecution#isDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see de.itemis.mpp.pom.PluginExecution#isDefault()
   * @see #getPluginExecution()
   * @generated
   */
  EAttribute getPluginExecution_Default();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.PluginInclusion <em>Plugin Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Inclusion</em>'.
   * @see de.itemis.mpp.pom.PluginInclusion
   * @generated
   */
  EClass getPluginInclusion();

  /**
   * Returns the meta object for the reference '{@link de.itemis.mpp.pom.PluginInclusion#getPomRef <em>Pom Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pom Ref</em>'.
   * @see de.itemis.mpp.pom.PluginInclusion#getPomRef()
   * @see #getPluginInclusion()
   * @generated
   */
  EReference getPluginInclusion_PomRef();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.PluginInclusion#getPluginCoordinates <em>Plugin Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Plugin Coordinates</em>'.
   * @see de.itemis.mpp.pom.PluginInclusion#getPluginCoordinates()
   * @see #getPluginInclusion()
   * @generated
   */
  EReference getPluginInclusion_PluginCoordinates();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginInclusion#getExecutionId <em>Execution Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Execution Id</em>'.
   * @see de.itemis.mpp.pom.PluginInclusion#getExecutionId()
   * @see #getPluginInclusion()
   * @generated
   */
  EAttribute getPluginInclusion_ExecutionId();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.PluginInclusion#isConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Config</em>'.
   * @see de.itemis.mpp.pom.PluginInclusion#isConfig()
   * @see #getPluginInclusion()
   * @generated
   */
  EAttribute getPluginInclusion_Config();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.BuildStep <em>Build Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Step</em>'.
   * @see de.itemis.mpp.pom.BuildStep
   * @generated
   */
  EClass getBuildStep();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Coordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coordinates</em>'.
   * @see de.itemis.mpp.pom.Coordinates
   * @generated
   */
  EClass getCoordinates();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Coordinates#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see de.itemis.mpp.pom.Coordinates#getGroupId()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_GroupId();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Coordinates#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see de.itemis.mpp.pom.Coordinates#getArtifactId()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_ArtifactId();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.Coordinates#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see de.itemis.mpp.pom.Coordinates#getVersion()
   * @see #getCoordinates()
   * @generated
   */
  EReference getCoordinates_Version();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.ExtendedCoordinates <em>Extended Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Coordinates</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates
   * @generated
   */
  EClass getExtendedCoordinates();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ExtendedCoordinates#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates#getGroupId()
   * @see #getExtendedCoordinates()
   * @generated
   */
  EAttribute getExtendedCoordinates_GroupId();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ExtendedCoordinates#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates#getArtifactId()
   * @see #getExtendedCoordinates()
   * @generated
   */
  EAttribute getExtendedCoordinates_ArtifactId();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.ExtendedCoordinates#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates#getVersion()
   * @see #getExtendedCoordinates()
   * @generated
   */
  EReference getExtendedCoordinates_Version();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ExtendedCoordinates#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates#getType()
   * @see #getExtendedCoordinates()
   * @generated
   */
  EAttribute getExtendedCoordinates_Type();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.ExtendedCoordinates#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classifier</em>'.
   * @see de.itemis.mpp.pom.ExtendedCoordinates#getClassifier()
   * @see #getExtendedCoordinates()
   * @generated
   */
  EAttribute getExtendedCoordinates_Classifier();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.POMImport <em>POM Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POM Import</em>'.
   * @see de.itemis.mpp.pom.POMImport
   * @generated
   */
  EClass getPOMImport();

  /**
   * Returns the meta object for the containment reference '{@link de.itemis.mpp.pom.POMImport#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinates</em>'.
   * @see de.itemis.mpp.pom.POMImport#getCoordinates()
   * @see #getPOMImport()
   * @generated
   */
  EReference getPOMImport_Coordinates();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.POMImport#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.itemis.mpp.pom.POMImport#getName()
   * @see #getPOMImport()
   * @generated
   */
  EAttribute getPOMImport_Name();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see de.itemis.mpp.pom.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Repository#isPluginRepositroy <em>Plugin Repositroy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plugin Repositroy</em>'.
   * @see de.itemis.mpp.pom.Repository#isPluginRepositroy()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_PluginRepositroy();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Repository#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.itemis.mpp.pom.Repository#getId()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Id();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Repository#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see de.itemis.mpp.pom.Repository#getUrl()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Url();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Repository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.itemis.mpp.pom.Repository#getName()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Name();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.Repository#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Layout</em>'.
   * @see de.itemis.mpp.pom.Repository#getLayout()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Layout();

  /**
   * Returns the meta object for the containment reference list '{@link de.itemis.mpp.pom.Repository#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policies</em>'.
   * @see de.itemis.mpp.pom.Repository#getPolicies()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Policies();

  /**
   * Returns the meta object for class '{@link de.itemis.mpp.pom.RepositoryPolicy <em>Repository Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Policy</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy
   * @generated
   */
  EClass getRepositoryPolicy();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#isDisabled <em>Disabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disabled</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#isDisabled()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_Disabled();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#isReleases <em>Releases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Releases</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#isReleases()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_Releases();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#isSnapshots <em>Snapshots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Snapshots</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#isSnapshots()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_Snapshots();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Update Policy</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#getUpdatePolicy()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_UpdatePolicy();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdateInterval <em>Update Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Update Interval</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#getUpdateInterval()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_UpdateInterval();

  /**
   * Returns the meta object for the attribute '{@link de.itemis.mpp.pom.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Checksum Policy</em>'.
   * @see de.itemis.mpp.pom.RepositoryPolicy#getChecksumPolicy()
   * @see #getRepositoryPolicy()
   * @generated
   */
  EAttribute getRepositoryPolicy_ChecksumPolicy();

  /**
   * Returns the meta object for enum '{@link de.itemis.mpp.pom.DependencyScope <em>Dependency Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dependency Scope</em>'.
   * @see de.itemis.mpp.pom.DependencyScope
   * @generated
   */
  EEnum getDependencyScope();

  /**
   * Returns the meta object for enum '{@link de.itemis.mpp.pom.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Phase</em>'.
   * @see de.itemis.mpp.pom.Phase
   * @generated
   */
  EEnum getPhase();

  /**
   * Returns the meta object for enum '{@link de.itemis.mpp.pom.RepositoryUpdatePolicy <em>Repository Update Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Repository Update Policy</em>'.
   * @see de.itemis.mpp.pom.RepositoryUpdatePolicy
   * @generated
   */
  EEnum getRepositoryUpdatePolicy();

  /**
   * Returns the meta object for enum '{@link de.itemis.mpp.pom.ChecksumPolicy <em>Checksum Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Checksum Policy</em>'.
   * @see de.itemis.mpp.pom.ChecksumPolicy
   * @generated
   */
  EEnum getChecksumPolicy();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PomFactory getPomFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.POMImpl <em>POM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.POMImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPOM()
     * @generated
     */
    EClass POM = eINSTANCE.getPOM();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__IMPORTS = eINSTANCE.getPOM_Imports();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__PARENT = eINSTANCE.getPOM_Parent();

    /**
     * The meta object literal for the '<em><b>Artifact Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__ARTIFACT_DEFINITION = eINSTANCE.getPOM_ArtifactDefinition();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__MODULES = eINSTANCE.getPOM_Modules();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__PROPERTIES = eINSTANCE.getPOM_Properties();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__DEPENDENCIES = eINSTANCE.getPOM_Dependencies();

    /**
     * The meta object literal for the '<em><b>Scm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__SCM = eINSTANCE.getPOM_Scm();

    /**
     * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__REPOSITORIES = eINSTANCE.getPOM_Repositories();

    /**
     * The meta object literal for the '<em><b>Build Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM__BUILD_STEPS = eINSTANCE.getPOM_BuildSteps();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.ParentRefImpl <em>Parent Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.ParentRefImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getParentRef()
     * @generated
     */
    EClass PARENT_REF = eINSTANCE.getParentRef();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT_REF__COORDINATES = eINSTANCE.getParentRef_Coordinates();

    /**
     * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARENT_REF__RELATIVE_PATH = eINSTANCE.getParentRef_RelativePath();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.ModulesImpl <em>Modules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.ModulesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getModules()
     * @generated
     */
    EClass MODULES = eINSTANCE.getModules();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULES__NAMES = eINSTANCE.getModules_Names();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.ArtifactDefinitionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getArtifactDefinition()
     * @generated
     */
    EClass ARTIFACT_DEFINITION = eINSTANCE.getArtifactDefinition();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_DEFINITION__GROUP_ID = eINSTANCE.getArtifactDefinition_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_DEFINITION__ARTIFACT_ID = eINSTANCE.getArtifactDefinition_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_DEFINITION__VERSION = eINSTANCE.getArtifactDefinition_Version();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_DEFINITION__TYPE = eINSTANCE.getArtifactDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_DEFINITION__ARTIFACT_NAME = eINSTANCE.getArtifactDefinition_ArtifactName();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT_DEFINITION__DESCRIPTION = eINSTANCE.getArtifactDefinition_Description();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.VersionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

    /**
     * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

    /**
     * The meta object literal for the '<em><b>Incremental</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__INCREMENTAL = eINSTANCE.getVersion_Incremental();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__QUALIFIER = eINSTANCE.getVersion_Qualifier();

    /**
     * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__PROPERTY_REF = eINSTANCE.getVersion_PropertyRef();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PropertiesImpl <em>Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PropertiesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getProperties()
     * @generated
     */
    EClass PROPERTIES = eINSTANCE.getProperties();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

    /**
     * The meta object literal for the '<em><b>Inclusions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTIES__INCLUSIONS = eINSTANCE.getProperties_Inclusions();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PropertyImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.ImportPropertyInclusionImpl <em>Import Property Inclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.ImportPropertyInclusionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getImportPropertyInclusion()
     * @generated
     */
    EClass IMPORT_PROPERTY_INCLUSION = eINSTANCE.getImportPropertyInclusion();

    /**
     * The meta object literal for the '<em><b>Pom Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_PROPERTY_INCLUSION__POM_REF = eINSTANCE.getImportPropertyInclusion_PomRef();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.FilePropertyInclusionImpl <em>File Property Inclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.FilePropertyInclusionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getFilePropertyInclusion()
     * @generated
     */
    EClass FILE_PROPERTY_INCLUSION = eINSTANCE.getFilePropertyInclusion();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_PROPERTY_INCLUSION__PATH = eINSTANCE.getFilePropertyInclusion_Path();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PropertyInclusionImpl <em>Property Inclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PropertyInclusionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPropertyInclusion()
     * @generated
     */
    EClass PROPERTY_INCLUSION = eINSTANCE.getPropertyInclusion();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.DependenciesImpl <em>Dependencies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.DependenciesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencies()
     * @generated
     */
    EClass DEPENDENCIES = eINSTANCE.getDependencies();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCIES__INCLUDES = eINSTANCE.getDependencies_Includes();

    /**
     * The meta object literal for the '<em><b>Dependency Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCIES__DEPENDENCY_GROUPS = eINSTANCE.getDependencies_DependencyGroups();

    /**
     * The meta object literal for the '<em><b>Ungrouped Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCIES__UNGROUPED_DEPENDENCIES = eINSTANCE.getDependencies_UngroupedDependencies();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.DependencyGroupImpl <em>Dependency Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.DependencyGroupImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyGroup()
     * @generated
     */
    EClass DEPENDENCY_GROUP = eINSTANCE.getDependencyGroup();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY_GROUP__SCOPE = eINSTANCE.getDependencyGroup_Scope();

    /**
     * The meta object literal for the '<em><b>Dependecies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_GROUP__DEPENDECIES = eINSTANCE.getDependencyGroup_Dependecies();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.UngroupedDependencyImpl <em>Ungrouped Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.UngroupedDependencyImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getUngroupedDependency()
     * @generated
     */
    EClass UNGROUPED_DEPENDENCY = eINSTANCE.getUngroupedDependency();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNGROUPED_DEPENDENCY__SCOPE = eINSTANCE.getUngroupedDependency_Scope();

    /**
     * The meta object literal for the '<em><b>Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNGROUPED_DEPENDENCY__DEPENDENCY = eINSTANCE.getUngroupedDependency_Dependency();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.DependencyImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__OPTIONAL = eINSTANCE.getDependency_Optional();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__COORDINATES = eINSTANCE.getDependency_Coordinates();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.DependencyInclusionImpl <em>Dependency Inclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.DependencyInclusionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyInclusion()
     * @generated
     */
    EClass DEPENDENCY_INCLUSION = eINSTANCE.getDependencyInclusion();

    /**
     * The meta object literal for the '<em><b>Pom Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_INCLUSION__POM_REF = eINSTANCE.getDependencyInclusion_PomRef();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY_INCLUSION__SCOPE = eINSTANCE.getDependencyInclusion_Scope();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.SCMImpl <em>SCM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.SCMImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getSCM()
     * @generated
     */
    EClass SCM = eINSTANCE.getSCM();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCM__CONNECTION = eINSTANCE.getSCM_Connection();

    /**
     * The meta object literal for the '<em><b>Developer Conncetion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCM__DEVELOPER_CONNCETION = eINSTANCE.getSCM_DeveloperConncetion();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCM__URL = eINSTANCE.getSCM_Url();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCM__TAG = eINSTANCE.getSCM_Tag();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginImpl <em>Plugin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPlugin()
     * @generated
     */
    EClass PLUGIN = eINSTANCE.getPlugin();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN__COORDINATES = eINSTANCE.getPlugin_Coordinates();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN__CONFIGURATION = eINSTANCE.getPlugin_Configuration();

    /**
     * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN__EXECUTIONS = eINSTANCE.getPlugin_Executions();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationImpl <em>Plugin Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfiguration()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION = eINSTANCE.getPluginConfiguration();

    /**
     * The meta object literal for the '<em><b>Configuration Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS = eINSTANCE.getPluginConfiguration_ConfigurationItems();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationItemImpl <em>Plugin Configuration Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationItemImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationItem()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_ITEM = eINSTANCE.getPluginConfigurationItem();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_ITEM__KEY = eINSTANCE.getPluginConfigurationItem_Key();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterImpl <em>Plugin Configuration Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameter()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER = eINSTANCE.getPluginConfigurationParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER__VALUE = eINSTANCE.getPluginConfigurationParameter_Value();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_CONFIGURATION_PARAMETER__CHILDREN = eINSTANCE.getPluginConfigurationParameter_Children();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterListImpl <em>Plugin Configuration Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterListImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterList()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER_LIST = eINSTANCE.getPluginConfigurationParameterList();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER_LIST__VALUES = eINSTANCE.getPluginConfigurationParameterList_Values();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterMapImpl <em>Plugin Configuration Parameter Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterMapImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterMap()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER_MAP = eINSTANCE.getPluginConfigurationParameterMap();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES = eINSTANCE.getPluginConfigurationParameterMap_Entries();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterMapEntryImpl <em>Plugin Configuration Parameter Map Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterMapEntryImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterMapEntry()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY = eINSTANCE.getPluginConfigurationParameterMapEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__KEY = eINSTANCE.getPluginConfigurationParameterMapEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__VALUE = eINSTANCE.getPluginConfigurationParameterMapEntry_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertiesImpl <em>Plugin Configuration Parameter Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertiesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterProperties()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES = eINSTANCE.getPluginConfigurationParameterProperties();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES__ENTRIES = eINSTANCE.getPluginConfigurationParameterProperties_Entries();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertyEntryImpl <em>Plugin Configuration Parameter Property Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginConfigurationParameterPropertyEntryImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginConfigurationParameterPropertyEntry()
     * @generated
     */
    EClass PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY = eINSTANCE.getPluginConfigurationParameterPropertyEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__KEY = eINSTANCE.getPluginConfigurationParameterPropertyEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__VALUE = eINSTANCE.getPluginConfigurationParameterPropertyEntry_Value();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginExecutionImpl <em>Plugin Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginExecutionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginExecution()
     * @generated
     */
    EClass PLUGIN_EXECUTION = eINSTANCE.getPluginExecution();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_EXECUTION__ID = eINSTANCE.getPluginExecution_Id();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_EXECUTION__PHASE = eINSTANCE.getPluginExecution_Phase();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_EXECUTION__GOALS = eINSTANCE.getPluginExecution_Goals();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_EXECUTION__CONFIGURATION = eINSTANCE.getPluginExecution_Configuration();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_EXECUTION__DEFAULT = eINSTANCE.getPluginExecution_Default();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.PluginInclusionImpl <em>Plugin Inclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.PluginInclusionImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPluginInclusion()
     * @generated
     */
    EClass PLUGIN_INCLUSION = eINSTANCE.getPluginInclusion();

    /**
     * The meta object literal for the '<em><b>Pom Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_INCLUSION__POM_REF = eINSTANCE.getPluginInclusion_PomRef();

    /**
     * The meta object literal for the '<em><b>Plugin Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_INCLUSION__PLUGIN_COORDINATES = eINSTANCE.getPluginInclusion_PluginCoordinates();

    /**
     * The meta object literal for the '<em><b>Execution Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_INCLUSION__EXECUTION_ID = eINSTANCE.getPluginInclusion_ExecutionId();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLUGIN_INCLUSION__CONFIG = eINSTANCE.getPluginInclusion_Config();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.BuildStepImpl <em>Build Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.BuildStepImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getBuildStep()
     * @generated
     */
    EClass BUILD_STEP = eINSTANCE.getBuildStep();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.CoordinatesImpl <em>Coordinates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.CoordinatesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getCoordinates()
     * @generated
     */
    EClass COORDINATES = eINSTANCE.getCoordinates();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__GROUP_ID = eINSTANCE.getCoordinates_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__ARTIFACT_ID = eINSTANCE.getCoordinates_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COORDINATES__VERSION = eINSTANCE.getCoordinates_Version();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl <em>Extended Coordinates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getExtendedCoordinates()
     * @generated
     */
    EClass EXTENDED_COORDINATES = eINSTANCE.getExtendedCoordinates();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COORDINATES__GROUP_ID = eINSTANCE.getExtendedCoordinates_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COORDINATES__ARTIFACT_ID = eINSTANCE.getExtendedCoordinates_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDED_COORDINATES__VERSION = eINSTANCE.getExtendedCoordinates_Version();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COORDINATES__TYPE = eINSTANCE.getExtendedCoordinates_Type();

    /**
     * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COORDINATES__CLASSIFIER = eINSTANCE.getExtendedCoordinates_Classifier();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.POMImportImpl <em>POM Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.POMImportImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPOMImport()
     * @generated
     */
    EClass POM_IMPORT = eINSTANCE.getPOMImport();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POM_IMPORT__COORDINATES = eINSTANCE.getPOMImport_Coordinates();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POM_IMPORT__NAME = eINSTANCE.getPOMImport_Name();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.RepositoryImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Plugin Repositroy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__PLUGIN_REPOSITROY = eINSTANCE.getRepository_PluginRepositroy();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__ID = eINSTANCE.getRepository_Id();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__LAYOUT = eINSTANCE.getRepository_Layout();

    /**
     * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__POLICIES = eINSTANCE.getRepository_Policies();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl <em>Repository Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.impl.RepositoryPolicyImpl
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepositoryPolicy()
     * @generated
     */
    EClass REPOSITORY_POLICY = eINSTANCE.getRepositoryPolicy();

    /**
     * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__DISABLED = eINSTANCE.getRepositoryPolicy_Disabled();

    /**
     * The meta object literal for the '<em><b>Releases</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__RELEASES = eINSTANCE.getRepositoryPolicy_Releases();

    /**
     * The meta object literal for the '<em><b>Snapshots</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__SNAPSHOTS = eINSTANCE.getRepositoryPolicy_Snapshots();

    /**
     * The meta object literal for the '<em><b>Update Policy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__UPDATE_POLICY = eINSTANCE.getRepositoryPolicy_UpdatePolicy();

    /**
     * The meta object literal for the '<em><b>Update Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__UPDATE_INTERVAL = eINSTANCE.getRepositoryPolicy_UpdateInterval();

    /**
     * The meta object literal for the '<em><b>Checksum Policy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_POLICY__CHECKSUM_POLICY = eINSTANCE.getRepositoryPolicy_ChecksumPolicy();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.DependencyScope <em>Dependency Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.DependencyScope
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getDependencyScope()
     * @generated
     */
    EEnum DEPENDENCY_SCOPE = eINSTANCE.getDependencyScope();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.Phase <em>Phase</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.Phase
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getPhase()
     * @generated
     */
    EEnum PHASE = eINSTANCE.getPhase();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.RepositoryUpdatePolicy <em>Repository Update Policy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.RepositoryUpdatePolicy
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getRepositoryUpdatePolicy()
     * @generated
     */
    EEnum REPOSITORY_UPDATE_POLICY = eINSTANCE.getRepositoryUpdatePolicy();

    /**
     * The meta object literal for the '{@link de.itemis.mpp.pom.ChecksumPolicy <em>Checksum Policy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.itemis.mpp.pom.ChecksumPolicy
     * @see de.itemis.mpp.pom.impl.PomPackageImpl#getChecksumPolicy()
     * @generated
     */
    EEnum CHECKSUM_POLICY = eINSTANCE.getChecksumPolicy();

  }

} //PomPackage
