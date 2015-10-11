/**
 */
package de.itemis.mpp.pom.util;

import de.itemis.mpp.pom.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage
 * @generated
 */
public class PomSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PomPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PomSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PomPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PomPackage.POM:
      {
        POM pom = (POM)theEObject;
        T result = casePOM(pom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PARENT_REF:
      {
        ParentRef parentRef = (ParentRef)theEObject;
        T result = caseParentRef(parentRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.MODULES:
      {
        Modules modules = (Modules)theEObject;
        T result = caseModules(modules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.ARTIFACT_DEFINITION:
      {
        ArtifactDefinition artifactDefinition = (ArtifactDefinition)theEObject;
        T result = caseArtifactDefinition(artifactDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PROPERTY_INCLUSION:
      {
        PropertyInclusion propertyInclusion = (PropertyInclusion)theEObject;
        T result = casePropertyInclusion(propertyInclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.DEPENDENCIES:
      {
        Dependencies dependencies = (Dependencies)theEObject;
        T result = caseDependencies(dependencies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.DEPENDENCY_GROUP:
      {
        DependencyGroup dependencyGroup = (DependencyGroup)theEObject;
        T result = caseDependencyGroup(dependencyGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.UNGROUPED_DEPENDENCY:
      {
        UngroupedDependency ungroupedDependency = (UngroupedDependency)theEObject;
        T result = caseUngroupedDependency(ungroupedDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.DEPENDENCY_INCLUSION:
      {
        DependencyInclusion dependencyInclusion = (DependencyInclusion)theEObject;
        T result = caseDependencyInclusion(dependencyInclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.SCM:
      {
        SCM scm = (SCM)theEObject;
        T result = caseSCM(scm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN:
      {
        Plugin plugin = (Plugin)theEObject;
        T result = casePlugin(plugin);
        if (result == null) result = caseBuildStep(plugin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION:
      {
        PluginConfiguration pluginConfiguration = (PluginConfiguration)theEObject;
        T result = casePluginConfiguration(pluginConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_ITEM:
      {
        PluginConfigurationItem pluginConfigurationItem = (PluginConfigurationItem)theEObject;
        T result = casePluginConfigurationItem(pluginConfigurationItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER:
      {
        PluginConfigurationParameter pluginConfigurationParameter = (PluginConfigurationParameter)theEObject;
        T result = casePluginConfigurationParameter(pluginConfigurationParameter);
        if (result == null) result = casePluginConfigurationItem(pluginConfigurationParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_LIST:
      {
        PluginConfigurationParameterList pluginConfigurationParameterList = (PluginConfigurationParameterList)theEObject;
        T result = casePluginConfigurationParameterList(pluginConfigurationParameterList);
        if (result == null) result = casePluginConfigurationItem(pluginConfigurationParameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP:
      {
        PluginConfigurationParameterMap pluginConfigurationParameterMap = (PluginConfigurationParameterMap)theEObject;
        T result = casePluginConfigurationParameterMap(pluginConfigurationParameterMap);
        if (result == null) result = casePluginConfigurationItem(pluginConfigurationParameterMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY:
      {
        PluginConfigurationParameterMapEntry pluginConfigurationParameterMapEntry = (PluginConfigurationParameterMapEntry)theEObject;
        T result = casePluginConfigurationParameterMapEntry(pluginConfigurationParameterMapEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES:
      {
        PluginConfigurationParameterProperties pluginConfigurationParameterProperties = (PluginConfigurationParameterProperties)theEObject;
        T result = casePluginConfigurationParameterProperties(pluginConfigurationParameterProperties);
        if (result == null) result = casePluginConfigurationItem(pluginConfigurationParameterProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY:
      {
        PluginConfigurationParameterPropertyEntry pluginConfigurationParameterPropertyEntry = (PluginConfigurationParameterPropertyEntry)theEObject;
        T result = casePluginConfigurationParameterPropertyEntry(pluginConfigurationParameterPropertyEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_EXECUTION:
      {
        PluginExecution pluginExecution = (PluginExecution)theEObject;
        T result = casePluginExecution(pluginExecution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.PLUGIN_INCLUSION:
      {
        PluginInclusion pluginInclusion = (PluginInclusion)theEObject;
        T result = casePluginInclusion(pluginInclusion);
        if (result == null) result = caseBuildStep(pluginInclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.BUILD_STEP:
      {
        BuildStep buildStep = (BuildStep)theEObject;
        T result = caseBuildStep(buildStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.COORDINATES:
      {
        Coordinates coordinates = (Coordinates)theEObject;
        T result = caseCoordinates(coordinates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.EXTENDED_COORDINATES:
      {
        ExtendedCoordinates extendedCoordinates = (ExtendedCoordinates)theEObject;
        T result = caseExtendedCoordinates(extendedCoordinates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.POM_IMPORT:
      {
        POMImport pomImport = (POMImport)theEObject;
        T result = casePOMImport(pomImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PomPackage.REPOSITORY_POLICY:
      {
        RepositoryPolicy repositoryPolicy = (RepositoryPolicy)theEObject;
        T result = caseRepositoryPolicy(repositoryPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOM(POM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentRef(ParentRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModules(Modules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifactDefinition(ArtifactDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Inclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Inclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyInclusion(PropertyInclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependencies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependencies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencies(Dependencies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencyGroup(DependencyGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ungrouped Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ungrouped Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUngroupedDependency(UngroupedDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency Inclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency Inclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencyInclusion(DependencyInclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SCM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SCM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSCM(SCM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlugin(Plugin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfiguration(PluginConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationItem(PluginConfigurationItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameter(PluginConfigurationParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameterList(PluginConfigurationParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameterMap(PluginConfigurationParameterMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Map Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Map Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameterMapEntry(PluginConfigurationParameterMapEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameterProperties(PluginConfigurationParameterProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Property Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Configuration Parameter Property Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginConfigurationParameterPropertyEntry(PluginConfigurationParameterPropertyEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Execution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Execution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginExecution(PluginExecution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plugin Inclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plugin Inclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePluginInclusion(PluginInclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Build Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Build Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuildStep(BuildStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinates(Coordinates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extended Coordinates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extended Coordinates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendedCoordinates(ExtendedCoordinates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POM Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POM Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOMImport(POMImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryPolicy(RepositoryPolicy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PomSwitch
