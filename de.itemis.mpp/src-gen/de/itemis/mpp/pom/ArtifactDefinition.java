/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.ArtifactDefinition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition()
 * @model
 * @generated
 */
public interface ArtifactDefinition extends EObject
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
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getGroupId <em>Group Id</em>}' attribute.
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
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactId <em>Artifact Id</em>}' attribute.
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
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_Version()
   * @model containment="true"
   * @generated
   */
  Version getVersion();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getVersion <em>Version</em>}' containment reference.
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
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Name</em>' attribute.
   * @see #setArtifactName(String)
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_ArtifactName()
   * @model
   * @generated
   */
  String getArtifactName();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getArtifactName <em>Artifact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Name</em>' attribute.
   * @see #getArtifactName()
   * @generated
   */
  void setArtifactName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see de.itemis.mpp.pom.PomPackage#getArtifactDefinition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.ArtifactDefinition#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // ArtifactDefinition
