/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.POM#getImports <em>Imports</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getParent <em>Parent</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getArtifactDefinition <em>Artifact Definition</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getModules <em>Modules</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getPropertyInclusions <em>Property Inclusions</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getScm <em>Scm</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.POM#getBuildSteps <em>Build Steps</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getPOM()
 * @model
 * @generated
 */
public interface POM extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.POMImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Imports()
   * @model containment="true"
   * @generated
   */
  EList<POMImport> getImports();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' containment reference.
   * @see #setParent(ParentRef)
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Parent()
   * @model containment="true"
   * @generated
   */
  ParentRef getParent();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.POM#getParent <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' containment reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ParentRef value);

  /**
   * Returns the value of the '<em><b>Artifact Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Definition</em>' containment reference.
   * @see #setArtifactDefinition(ArtifactDefinition)
   * @see de.itemis.mpp.pom.PomPackage#getPOM_ArtifactDefinition()
   * @model containment="true"
   * @generated
   */
  ArtifactDefinition getArtifactDefinition();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.POM#getArtifactDefinition <em>Artifact Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Definition</em>' containment reference.
   * @see #getArtifactDefinition()
   * @generated
   */
  void setArtifactDefinition(ArtifactDefinition value);

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference.
   * @see #setModules(Modules)
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Modules()
   * @model containment="true"
   * @generated
   */
  Modules getModules();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.POM#getModules <em>Modules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modules</em>' containment reference.
   * @see #getModules()
   * @generated
   */
  void setModules(Modules value);

  /**
   * Returns the value of the '<em><b>Property Inclusions</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.PropertyInclusion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Inclusions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Inclusions</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPOM_PropertyInclusions()
   * @model containment="true"
   * @generated
   */
  EList<PropertyInclusion> getPropertyInclusions();

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
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference.
   * @see #setDependencies(Dependencies)
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Dependencies()
   * @model containment="true"
   * @generated
   */
  Dependencies getDependencies();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.POM#getDependencies <em>Dependencies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependencies</em>' containment reference.
   * @see #getDependencies()
   * @generated
   */
  void setDependencies(Dependencies value);

  /**
   * Returns the value of the '<em><b>Scm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scm</em>' containment reference.
   * @see #setScm(SCM)
   * @see de.itemis.mpp.pom.PomPackage#getPOM_Scm()
   * @model containment="true"
   * @generated
   */
  SCM getScm();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.POM#getScm <em>Scm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scm</em>' containment reference.
   * @see #getScm()
   * @generated
   */
  void setScm(SCM value);

  /**
   * Returns the value of the '<em><b>Build Steps</b></em>' containment reference list.
   * The list contents are of type {@link de.itemis.mpp.pom.BuildStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Steps</em>' containment reference list.
   * @see de.itemis.mpp.pom.PomPackage#getPOM_BuildSteps()
   * @model containment="true"
   * @generated
   */
  EList<BuildStep> getBuildSteps();

} // POM
