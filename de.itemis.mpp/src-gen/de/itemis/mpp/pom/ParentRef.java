/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.ParentRef#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ParentRef#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getParentRef()
 * @model
 * @generated
 */
public interface ParentRef extends EObject
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
   * @see de.itemis.mpp.pom.PomPackage#getParentRef_Coordinates()
   * @model containment="true"
   * @generated
   */
  Coordinates getCoordinates();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ParentRef#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(Coordinates value);

  /**
   * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relative Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relative Path</em>' attribute.
   * @see #setRelativePath(String)
   * @see de.itemis.mpp.pom.PomPackage#getParentRef_RelativePath()
   * @model
   * @generated
   */
  String getRelativePath();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ParentRef#getRelativePath <em>Relative Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relative Path</em>' attribute.
   * @see #getRelativePath()
   * @generated
   */
  void setRelativePath(String value);

} // ParentRef
