/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Modules#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getModules()
 * @model
 * @generated
 */
public interface Modules extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see de.itemis.mpp.pom.PomPackage#getModules_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // Modules
