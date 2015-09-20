/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Configuration Parameter Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginConfigurationParameterMap#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameterMap()
 * @model
 * @generated
 */
public interface PluginConfigurationParameterMap extends PluginConfigurationItem
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PluginConfigurationParameterMapEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPluginConfigurationParameterMap_Entries()
   * @model containment="true"
   * @generated
   */
  EList<PluginConfigurationParameterMapEntry> getEntries();

} // PluginConfigurationParameterMap
