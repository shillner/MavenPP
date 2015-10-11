/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.ChecksumPolicy;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.RepositoryPolicy;
import de.itemis.mpp.pom.RepositoryUpdatePolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#isReleases <em>Releases</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#isSnapshots <em>Snapshots</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#getUpdatePolicy <em>Update Policy</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#getUpdateInterval <em>Update Interval</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryPolicyImpl#getChecksumPolicy <em>Checksum Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryPolicyImpl extends MinimalEObjectImpl.Container implements RepositoryPolicy
{
  /**
   * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected boolean disabled = DISABLED_EDEFAULT;

  /**
   * The default value of the '{@link #isReleases() <em>Releases</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReleases()
   * @generated
   * @ordered
   */
  protected static final boolean RELEASES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReleases() <em>Releases</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReleases()
   * @generated
   * @ordered
   */
  protected boolean releases = RELEASES_EDEFAULT;

  /**
   * The default value of the '{@link #isSnapshots() <em>Snapshots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSnapshots()
   * @generated
   * @ordered
   */
  protected static final boolean SNAPSHOTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSnapshots() <em>Snapshots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSnapshots()
   * @generated
   * @ordered
   */
  protected boolean snapshots = SNAPSHOTS_EDEFAULT;

  /**
   * The default value of the '{@link #getUpdatePolicy() <em>Update Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatePolicy()
   * @generated
   * @ordered
   */
  protected static final RepositoryUpdatePolicy UPDATE_POLICY_EDEFAULT = RepositoryUpdatePolicy.DAILY;

  /**
   * The cached value of the '{@link #getUpdatePolicy() <em>Update Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatePolicy()
   * @generated
   * @ordered
   */
  protected RepositoryUpdatePolicy updatePolicy = UPDATE_POLICY_EDEFAULT;

  /**
   * The default value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateInterval()
   * @generated
   * @ordered
   */
  protected static final int UPDATE_INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateInterval()
   * @generated
   * @ordered
   */
  protected int updateInterval = UPDATE_INTERVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getChecksumPolicy() <em>Checksum Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecksumPolicy()
   * @generated
   * @ordered
   */
  protected static final ChecksumPolicy CHECKSUM_POLICY_EDEFAULT = ChecksumPolicy.IGNORE;

  /**
   * The cached value of the '{@link #getChecksumPolicy() <em>Checksum Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecksumPolicy()
   * @generated
   * @ordered
   */
  protected ChecksumPolicy checksumPolicy = CHECKSUM_POLICY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryPolicyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PomPackage.Literals.REPOSITORY_POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisabled()
  {
    return disabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisabled(boolean newDisabled)
  {
    boolean oldDisabled = disabled;
    disabled = newDisabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__DISABLED, oldDisabled, disabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReleases()
  {
    return releases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReleases(boolean newReleases)
  {
    boolean oldReleases = releases;
    releases = newReleases;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__RELEASES, oldReleases, releases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSnapshots()
  {
    return snapshots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSnapshots(boolean newSnapshots)
  {
    boolean oldSnapshots = snapshots;
    snapshots = newSnapshots;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__SNAPSHOTS, oldSnapshots, snapshots));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryUpdatePolicy getUpdatePolicy()
  {
    return updatePolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdatePolicy(RepositoryUpdatePolicy newUpdatePolicy)
  {
    RepositoryUpdatePolicy oldUpdatePolicy = updatePolicy;
    updatePolicy = newUpdatePolicy == null ? UPDATE_POLICY_EDEFAULT : newUpdatePolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__UPDATE_POLICY, oldUpdatePolicy, updatePolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpdateInterval()
  {
    return updateInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateInterval(int newUpdateInterval)
  {
    int oldUpdateInterval = updateInterval;
    updateInterval = newUpdateInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__UPDATE_INTERVAL, oldUpdateInterval, updateInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChecksumPolicy getChecksumPolicy()
  {
    return checksumPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChecksumPolicy(ChecksumPolicy newChecksumPolicy)
  {
    ChecksumPolicy oldChecksumPolicy = checksumPolicy;
    checksumPolicy = newChecksumPolicy == null ? CHECKSUM_POLICY_EDEFAULT : newChecksumPolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY, oldChecksumPolicy, checksumPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PomPackage.REPOSITORY_POLICY__DISABLED:
        return isDisabled();
      case PomPackage.REPOSITORY_POLICY__RELEASES:
        return isReleases();
      case PomPackage.REPOSITORY_POLICY__SNAPSHOTS:
        return isSnapshots();
      case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
        return getUpdatePolicy();
      case PomPackage.REPOSITORY_POLICY__UPDATE_INTERVAL:
        return getUpdateInterval();
      case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
        return getChecksumPolicy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PomPackage.REPOSITORY_POLICY__DISABLED:
        setDisabled((Boolean)newValue);
        return;
      case PomPackage.REPOSITORY_POLICY__RELEASES:
        setReleases((Boolean)newValue);
        return;
      case PomPackage.REPOSITORY_POLICY__SNAPSHOTS:
        setSnapshots((Boolean)newValue);
        return;
      case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
        setUpdatePolicy((RepositoryUpdatePolicy)newValue);
        return;
      case PomPackage.REPOSITORY_POLICY__UPDATE_INTERVAL:
        setUpdateInterval((Integer)newValue);
        return;
      case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
        setChecksumPolicy((ChecksumPolicy)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PomPackage.REPOSITORY_POLICY__DISABLED:
        setDisabled(DISABLED_EDEFAULT);
        return;
      case PomPackage.REPOSITORY_POLICY__RELEASES:
        setReleases(RELEASES_EDEFAULT);
        return;
      case PomPackage.REPOSITORY_POLICY__SNAPSHOTS:
        setSnapshots(SNAPSHOTS_EDEFAULT);
        return;
      case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
        setUpdatePolicy(UPDATE_POLICY_EDEFAULT);
        return;
      case PomPackage.REPOSITORY_POLICY__UPDATE_INTERVAL:
        setUpdateInterval(UPDATE_INTERVAL_EDEFAULT);
        return;
      case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
        setChecksumPolicy(CHECKSUM_POLICY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PomPackage.REPOSITORY_POLICY__DISABLED:
        return disabled != DISABLED_EDEFAULT;
      case PomPackage.REPOSITORY_POLICY__RELEASES:
        return releases != RELEASES_EDEFAULT;
      case PomPackage.REPOSITORY_POLICY__SNAPSHOTS:
        return snapshots != SNAPSHOTS_EDEFAULT;
      case PomPackage.REPOSITORY_POLICY__UPDATE_POLICY:
        return updatePolicy != UPDATE_POLICY_EDEFAULT;
      case PomPackage.REPOSITORY_POLICY__UPDATE_INTERVAL:
        return updateInterval != UPDATE_INTERVAL_EDEFAULT;
      case PomPackage.REPOSITORY_POLICY__CHECKSUM_POLICY:
        return checksumPolicy != CHECKSUM_POLICY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (disabled: ");
    result.append(disabled);
    result.append(", releases: ");
    result.append(releases);
    result.append(", snapshots: ");
    result.append(snapshots);
    result.append(", updatePolicy: ");
    result.append(updatePolicy);
    result.append(", updateInterval: ");
    result.append(updateInterval);
    result.append(", checksumPolicy: ");
    result.append(checksumPolicy);
    result.append(')');
    return result.toString();
  }

} //RepositoryPolicyImpl
