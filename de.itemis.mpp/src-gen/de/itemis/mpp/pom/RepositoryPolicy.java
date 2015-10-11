/**
 */
package de.itemis.mpp.pom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#isReleases <em>Releases</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#isSnapshots <em>Snapshots</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdateInterval <em>Update Interval</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}</li>
 * </ul>
 *
 * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy()
 * @model
 * @generated
 */
public interface RepositoryPolicy extends EObject
{
  /**
   * Returns the value of the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disabled</em>' attribute.
   * @see #setDisabled(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_Disabled()
   * @model
   * @generated
   */
  boolean isDisabled();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#isDisabled <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disabled</em>' attribute.
   * @see #isDisabled()
   * @generated
   */
  void setDisabled(boolean value);

  /**
   * Returns the value of the '<em><b>Releases</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Releases</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Releases</em>' attribute.
   * @see #setReleases(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_Releases()
   * @model
   * @generated
   */
  boolean isReleases();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#isReleases <em>Releases</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Releases</em>' attribute.
   * @see #isReleases()
   * @generated
   */
  void setReleases(boolean value);

  /**
   * Returns the value of the '<em><b>Snapshots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Snapshots</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Snapshots</em>' attribute.
   * @see #setSnapshots(boolean)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_Snapshots()
   * @model
   * @generated
   */
  boolean isSnapshots();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#isSnapshots <em>Snapshots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Snapshots</em>' attribute.
   * @see #isSnapshots()
   * @generated
   */
  void setSnapshots(boolean value);

  /**
   * Returns the value of the '<em><b>Update Policy</b></em>' attribute.
   * The literals are from the enumeration {@link de.itemis.mpp.pom.RepositoryUpdatePolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Policy</em>' attribute.
   * @see de.itemis.mpp.pom.RepositoryUpdatePolicy
   * @see #setUpdatePolicy(RepositoryUpdatePolicy)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_UpdatePolicy()
   * @model
   * @generated
   */
  RepositoryUpdatePolicy getUpdatePolicy();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdatePolicy <em>Update Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Policy</em>' attribute.
   * @see de.itemis.mpp.pom.RepositoryUpdatePolicy
   * @see #getUpdatePolicy()
   * @generated
   */
  void setUpdatePolicy(RepositoryUpdatePolicy value);

  /**
   * Returns the value of the '<em><b>Update Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Interval</em>' attribute.
   * @see #setUpdateInterval(int)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_UpdateInterval()
   * @model
   * @generated
   */
  int getUpdateInterval();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#getUpdateInterval <em>Update Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Interval</em>' attribute.
   * @see #getUpdateInterval()
   * @generated
   */
  void setUpdateInterval(int value);

  /**
   * Returns the value of the '<em><b>Checksum Policy</b></em>' attribute.
   * The literals are from the enumeration {@link de.itemis.mpp.pom.ChecksumPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checksum Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checksum Policy</em>' attribute.
   * @see de.itemis.mpp.pom.ChecksumPolicy
   * @see #setChecksumPolicy(ChecksumPolicy)
   * @see de.itemis.mpp.pom.PomPackage#getRepositoryPolicy_ChecksumPolicy()
   * @model
   * @generated
   */
  ChecksumPolicy getChecksumPolicy();

  /**
   * Sets the value of the '{@link de.itemis.mpp.pom.RepositoryPolicy#getChecksumPolicy <em>Checksum Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checksum Policy</em>' attribute.
   * @see de.itemis.mpp.pom.ChecksumPolicy
   * @see #getChecksumPolicy()
   * @generated
   */
  void setChecksumPolicy(ChecksumPolicy value);

} // RepositoryPolicy
