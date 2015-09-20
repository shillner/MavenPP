/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Configuration Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginConfigurationParameter#getValue <em>Value</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginConfigurationParameter#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameter()
 * @model
 * @generated
 */
public interface PluginConfigurationParameter extends PluginConfigurationItem
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginConfigurationParameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PluginConfigurationItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameter_Children()
   * @model containment="true"
   * @generated
   */
  EList<PluginConfigurationItem> getChildren();

} // PluginConfigurationParameter
