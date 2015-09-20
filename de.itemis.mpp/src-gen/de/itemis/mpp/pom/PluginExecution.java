/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginExecution#getId <em>Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginExecution#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginExecution#getGoals <em>Goals</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginExecution#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginExecution#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginExecution()
 * @model
 * @generated
 */
public interface PluginExecution extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.itemis.mpp.pom.PomPackage#getPluginExecution_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginExecution#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Phase</b></em>' attribute.
   * The literals are from the enumeration {@link de.itemis.mpp.pom.Phase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phase</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phase</em>' attribute.
   * @see de.itemis.mpp.pom.Phase
   * @see #setPhase(Phase)
   * @see de.itemis.mpp.pom.PomPackage#getPluginExecution_Phase()
   * @model
   * @generated
   */
  Phase getPhase();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginExecution#getPhase <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phase</em>' attribute.
   * @see de.itemis.mpp.pom.Phase
   * @see #getPhase()
   * @generated
   */
  void setPhase(Phase value);

  /**
   * Returns the value of the '<em><b>Goals</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' attribute list.
   * @see de.itemis.mpp.pom.PomPackage#getPluginExecution_Goals()
   * @model unique="false"
   * @generated
   */
  EList<String> getGoals();

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
   * @see de.itemis.mpp.pom.PomPackage#getPluginExecution_Configuration()
   * @model containment="true"
   * @generated
   */
  PluginConfiguration getConfiguration();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginExecution#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(PluginConfiguration value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getPluginExecution_Default()
   * @model
   * @generated
   */
  boolean isDefault();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginExecution#isDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #isDefault()
   * @generated
   */
  void setDefault(boolean value);

} // PluginExecution
