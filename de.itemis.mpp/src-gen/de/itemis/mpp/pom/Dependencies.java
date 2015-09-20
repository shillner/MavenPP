/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Dependencies#getIncludes <em>Includes</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Dependencies#getDependencyGroups <em>Dependency Groups</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Dependencies#getUngroupedDependencies <em>Ungrouped Dependencies</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getDependencies()
 * @model
 * @generated
 */
public interface Dependencies extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.DependencyInclusion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getDependencies_Includes()
   * @model containment="true"
   * @generated
   */
  EList<DependencyInclusion> getIncludes();

  /**
   * Returns the value of the '<em><b>Dependency Groups</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.DependencyGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Groups</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getDependencies_DependencyGroups()
   * @model containment="true"
   * @generated
   */
  EList<DependencyGroup> getDependencyGroups();

  /**
   * Returns the value of the '<em><b>Ungrouped Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.UngroupedDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ungrouped Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ungrouped Dependencies</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getDependencies_UngroupedDependencies()
   * @model containment="true"
   * @generated
   */
  EList<UngroupedDependency> getUngroupedDependencies();

} // Dependencies
