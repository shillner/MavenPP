/**
 */
package de.itemis.mpp.pom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PluginInclusion#getExecutionId <em>Execution Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginInclusion#isConfig <em>Config</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginInclusion#getPluginCoordinates <em>Plugin Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.PluginInclusion#getPomRef <em>Pom Ref</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPluginInclusion()
 * @model
 * @generated
 */
public interface PluginInclusion extends BuildStep
{
  /**
   * Returns the value of the '<em><b>Execution Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Id</em>' attribute.
   * @see #setExecutionId(String)
   * @see de.itemis.mpp.pom.PomPackage#getPluginInclusion_ExecutionId()
   * @model
   * @generated
   */
  String getExecutionId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginInclusion#getExecutionId <em>Execution Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution Id</em>' attribute.
   * @see #getExecutionId()
   * @generated
   */
  void setExecutionId(String value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' attribute.
   * @see #setConfig(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getPluginInclusion_Config()
   * @model
   * @generated
   */
  boolean isConfig();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginInclusion#isConfig <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' attribute.
   * @see #isConfig()
   * @generated
   */
  void setConfig(boolean value);

  /**
   * Returns the value of the '<em><b>Plugin Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plugin Coordinates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plugin Coordinates</em>' containment reference.
   * @see #setPluginCoordinates(NonVersionedCoordinates)
   * @see de.itemis.mpp.pom.PomPackage#getPluginInclusion_PluginCoordinates()
   * @model containment="true"
   * @generated
   */
  NonVersionedCoordinates getPluginCoordinates();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginInclusion#getPluginCoordinates <em>Plugin Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plugin Coordinates</em>' containment reference.
   * @see #getPluginCoordinates()
   * @generated
   */
  void setPluginCoordinates(NonVersionedCoordinates value);

  /**
   * Returns the value of the '<em><b>Pom Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pom Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pom Ref</em>' reference.
   * @see #setPomRef(POMImport)
   * @see de.itemis.mpp.pom.PomPackage#getPluginInclusion_PomRef()
   * @model
   * @generated
   */
  POMImport getPomRef();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PluginInclusion#getPomRef <em>Pom Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pom Ref</em>' reference.
   * @see #getPomRef()
   * @generated
   */
  void setPomRef(POMImport value);

} // PluginInclusion
