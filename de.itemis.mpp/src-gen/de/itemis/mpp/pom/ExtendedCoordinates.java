/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.ExtendedCoordinates#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ExtendedCoordinates#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ExtendedCoordinates#getVersion <em>Version</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ExtendedCoordinates#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ExtendedCoordinates#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates()
 * @model
 * @generated
 */
public interface ExtendedCoordinates extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ExtendedCoordinates#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ExtendedCoordinates#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ExtendedCoordinates#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  void setVersion(Version value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ExtendedCoordinates#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Classifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifier</em>' attribute.
   * @see #setClassifier(String)
   * @see de.itemis.mpp.pom.PomPackage#getExtendedCoordinates_Classifier()
   * @model
   * @generated
   */
  String getClassifier();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ExtendedCoordinates#getClassifier <em>Classifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classifier</em>' attribute.
   * @see #getClassifier()
   * @generated
   */
  void setClassifier(String value);

} // ExtendedCoordinates
