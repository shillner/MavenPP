/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ungrouped Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.UngroupedDependency#getScope <em>Scope</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.UngroupedDependency#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getUngroupedDependency()
 * @model
 * @generated
 */
public interface UngroupedDependency extends EObject
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
   * @see de.itemis.mpp.pom.PomPackage#getUngroupedDependency_Scope()
   * @model
   * @generated
   */
  DependencyScope getScope();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.UngroupedDependency#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see de.itemis.mpp.pom.DependencyScope
   * @see #getScope()
   * @generated
   */
  void setScope(DependencyScope value);

  /**
   * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' containment reference.
   * @see #setDependency(Dependency)
   * @see de.itemis.mpp.pom.PomPackage#getUngroupedDependency_Dependency()
   * @model containment="true"
   * @generated
   */
  Dependency getDependency();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.UngroupedDependency#getDependency <em>Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' containment reference.
   * @see #getDependency()
   * @generated
   */
  void setDependency(Dependency value);

} // UngroupedDependency
