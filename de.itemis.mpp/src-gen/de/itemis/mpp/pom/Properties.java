/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Properties#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Properties#getInclusions <em>Inclusions</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getProperties_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Inclusions</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PropertyInclusion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inclusions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inclusions</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getProperties_Inclusions()
   * @model containment="true"
   * @generated
   */
  EList<PropertyInclusion> getInclusions();

} // Properties
