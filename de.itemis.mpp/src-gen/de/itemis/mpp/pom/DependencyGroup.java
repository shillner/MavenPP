/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.DependencyGroup#getScope <em>Scope</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.DependencyGroup#getDependecies <em>Dependecies</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getDependencyGroup()
 * @model
 * @generated
 */
public interface DependencyGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * The literals are from the enumeration {@link de.itemis.mpp.pom.DependencyScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see de.itemis.mpp.pom.DependencyScope
   * @see #setScope(DependencyScope)
   * @see de.itemis.mpp.pom.PomPackage#getDependencyGroup_Scope()
   * @model
   * @generated
   */
  DependencyScope getScope();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.DependencyGroup#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see de.itemis.mpp.pom.DependencyScope
   * @see #getScope()
   * @generated
   */
  void setScope(DependencyScope value);

  /**
   * Returns the value of the '<em><b>Dependecies</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependecies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependecies</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getDependencyGroup_Dependecies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependecies();

} // DependencyGroup
