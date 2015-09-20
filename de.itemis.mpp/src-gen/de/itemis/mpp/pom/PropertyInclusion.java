/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.PropertyInclusion#getPomRef <em>Pom Ref</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPropertyInclusion()
 * @model
 * @generated
 */
public interface PropertyInclusion extends EObject
{
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
   * @see de.itemis.mpp.pom.PomPackage#getPropertyInclusion_PomRef()
   * @model
   * @generated
   */
  POMImport getPomRef();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.PropertyInclusion#getPomRef <em>Pom Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pom Ref</em>' reference.
   * @see #getPomRef()
   * @generated
   */
  void setPomRef(POMImport value);

} // PropertyInclusion
