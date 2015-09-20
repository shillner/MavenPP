/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginConfiguration#getConfigurationItems <em>Configuration Items</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginConfiguration()
 * @model
 * @generated
 */
public interface PluginConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Configuration Items</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PluginConfigurationItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration Items</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfiguration_ConfigurationItems()
   * @model containment="true"
   * @generated
   */
  EList<PluginConfigurationItem> getConfigurationItems();

} // PluginConfiguration
