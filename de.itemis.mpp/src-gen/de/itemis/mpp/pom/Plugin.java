/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Plugin#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Plugin#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Plugin#getExecutions <em>Executions</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends BuildStep
{
  /**
   * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinates</em>' containment reference.
   * @see #setCoordinates(Coordinates)
   * @see de.itemis.mpp.pom.PomPackage#getPlugin_Coordinates()
   * @model containment="true"
   * @generated
   */
  Coordinates getCoordinates();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Plugin#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(Coordinates value);

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(PluginConfiguration)
   * @see de.itemis.mpp.pom.PomPackage#getPlugin_Configuration()
   * @model containment="true"
   * @generated
   */
  PluginConfiguration getConfiguration();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Plugin#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(PluginConfiguration value);

  /**
   * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PluginExecution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executions</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPlugin_Executions()
   * @model containment="true"
   * @generated
   */
  EList<PluginExecution> getExecutions();

} // Plugin
