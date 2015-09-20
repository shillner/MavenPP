/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Dependency#isOptional <em>Optional</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Dependency#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getDependency_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Dependency#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinates</em>' containment reference.
   * @see #setCoordinates(ExtendedCoordinates)
   * @see de.itemis.mpp.pom.PomPackage#getDependency_Coordinates()
   * @model containment="true"
   * @generated
   */
  ExtendedCoordinates getCoordinates();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Dependency#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(ExtendedCoordinates value);

} // Dependency
