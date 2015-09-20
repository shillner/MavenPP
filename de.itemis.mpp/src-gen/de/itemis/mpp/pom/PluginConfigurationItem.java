/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginConfigurationItem#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationItem()
 * @model
 * @generated
 */
public interface PluginConfigurationItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationItem_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginConfigurationItem#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

} // PluginConfigurationItem
