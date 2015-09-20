/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Configuration Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginConfigurationParameterList#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameterList()
 * @model
 * @generated
 */
public interface PluginConfigurationParameterList extends PluginConfigurationItem
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameterList_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // PluginConfigurationParameterList
