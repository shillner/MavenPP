/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Version#getIncremental <em>Incremental</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Version#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.Version#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject
{
  /**
   * Returns the value of the '<em><b>Major</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Major</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Major</em>' attribute.
   * @see #setMajor(String)
   * @see de.itemis.mpp.pom.PomPackage#getVersion_Major()
   * @model
   * @generated
   */
  String getMajor();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Version#getMajor <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Major</em>' attribute.
   * @see #getMajor()
   * @generated
   */
  void setMajor(String value);

  /**
   * Returns the value of the '<em><b>Minor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minor</em>' attribute.
   * @see #setMinor(String)
   * @see de.itemis.mpp.pom.PomPackage#getVersion_Minor()
   * @model
   * @generated
   */
  String getMinor();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Version#getMinor <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minor</em>' attribute.
   * @see #getMinor()
   * @generated
   */
  void setMinor(String value);

  /**
   * Returns the value of the '<em><b>Incremental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incremental</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incremental</em>' attribute.
   * @see #setIncremental(String)
   * @see de.itemis.mpp.pom.PomPackage#getVersion_Incremental()
   * @model
   * @generated
   */
  String getIncremental();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Version#getIncremental <em>Incremental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Incremental</em>' attribute.
   * @see #getIncremental()
   * @generated
   */
  void setIncremental(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' attribute.
   * @see #setQualifier(String)
   * @see de.itemis.mpp.pom.PomPackage#getVersion_Qualifier()
   * @model
   * @generated
   */
  String getQualifier();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Version#getQualifier <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' attribute.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(String value);

  /**
   * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Ref</em>' attribute.
   * @see #setPropertyRef(String)
   * @see de.itemis.mpp.pom.PomPackage#getVersion_PropertyRef()
   * @model
   * @generated
   */
  String getPropertyRef();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.Version#getPropertyRef <em>Property Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Ref</em>' attribute.
   * @see #getPropertyRef()
   * @generated
   */
  void setPropertyRef(String value);

} // Version
