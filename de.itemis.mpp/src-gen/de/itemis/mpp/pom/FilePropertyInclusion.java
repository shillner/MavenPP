/**
 */
package de.itemis.mpp.pom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Property Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.FilePropertyInclusion#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getFilePropertyInclusion()
 * @model
 * @generated
 */
public interface FilePropertyInclusion extends PropertyInclusion
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see de.itemis.mpp.pom.PomPackage#getFilePropertyInclusion_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.FilePropertyInclusion#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // FilePropertyInclusion
