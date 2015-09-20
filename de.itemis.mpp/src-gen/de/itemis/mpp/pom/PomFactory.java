/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage
 * @generated
 */
public interface PomFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PomFactory eINSTANCE = de.itemis.mpp.pom.impl.PomFactoryImpl.init();

  /**
   * Returns a new object of class '<em>POM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POM</em>'.
   * @generated
   */
  POM createPOM();

  /**
   * Returns a new object of class '<em>Parent Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Ref</em>'.
   * @generated
   */
  ParentRef createParentRef();

  /**
   * Returns a new object of class '<em>Modules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modules</em>'.
   * @generated
   */
  Modules createModules();

  /**
   * Returns a new object of class '<em>Artifact Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact Definition</em>'.
   * @generated
   */
  ArtifactDefinition createArtifactDefinition();

  /**
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Property Inclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Inclusion</em>'.
   * @generated
   */
  PropertyInclusion createPropertyInclusion();

  /**
   * Returns a new object of class '<em>Dependencies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependencies</em>'.
   * @generated
   */
  Dependencies createDependencies();

  /**
   * Returns a new object of class '<em>Dependency Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Group</em>'.
   * @generated
   */
  DependencyGroup createDependencyGroup();

  /**
   * Returns a new object of class '<em>Ungrouped Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ungrouped Dependency</em>'.
   * @generated
   */
  UngroupedDependency createUngroupedDependency();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Dependency Inclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Inclusion</em>'.
   * @generated
   */
  DependencyInclusion createDependencyInclusion();

  /**
   * Returns a new object of class '<em>SCM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SCM</em>'.
   * @generated
   */
  SCM createSCM();

  /**
   * Returns a new object of class '<em>Plugin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin</em>'.
   * @generated
   */
  Plugin createPlugin();

  /**
   * Returns a new object of class '<em>Plugin Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration</em>'.
   * @generated
   */
  PluginConfiguration createPluginConfiguration();

  /**
   * Returns a new object of class '<em>Plugin Configuration Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Item</em>'.
   * @generated
   */
  PluginConfigurationItem createPluginConfigurationItem();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter</em>'.
   * @generated
   */
  PluginConfigurationParameter createPluginConfigurationParameter();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter List</em>'.
   * @generated
   */
  PluginConfigurationParameterList createPluginConfigurationParameterList();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter Map</em>'.
   * @generated
   */
  PluginConfigurationParameterMap createPluginConfigurationParameterMap();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter Map Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter Map Entry</em>'.
   * @generated
   */
  PluginConfigurationParameterMapEntry createPluginConfigurationParameterMapEntry();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter Properties</em>'.
   * @generated
   */
  PluginConfigurationParameterProperties createPluginConfigurationParameterProperties();

  /**
   * Returns a new object of class '<em>Plugin Configuration Parameter Property Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Configuration Parameter Property Entry</em>'.
   * @generated
   */
  PluginConfigurationParameterPropertyEntry createPluginConfigurationParameterPropertyEntry();

  /**
   * Returns a new object of class '<em>Plugin Execution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Execution</em>'.
   * @generated
   */
  PluginExecution createPluginExecution();

  /**
   * Returns a new object of class '<em>Plugin Inclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Inclusion</em>'.
   * @generated
   */
  PluginInclusion createPluginInclusion();

  /**
   * Returns a new object of class '<em>Build Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Step</em>'.
   * @generated
   */
  BuildStep createBuildStep();

  /**
   * Returns a new object of class '<em>Coordinates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coordinates</em>'.
   * @generated
   */
  Coordinates createCoordinates();

  /**
   * Returns a new object of class '<em>Extended Coordinates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Coordinates</em>'.
   * @generated
   */
  ExtendedCoordinates createExtendedCoordinates();

  /**
   * Returns a new object of class '<em>POM Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POM Import</em>'.
   * @generated
   */
  POMImport createPOMImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PomPackage getPomPackage();

} //PomFactory
