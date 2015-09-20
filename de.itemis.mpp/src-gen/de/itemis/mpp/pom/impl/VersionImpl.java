/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Version;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.VersionImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.VersionImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.VersionImpl#getIncremental <em>Incremental</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.VersionImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version
{
  /**
   * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected static final String MAJOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajor()
   * @generated
   * @ordered
   */
  protected String major = MAJOR_EDEFAULT;

  /**
   * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected static final String MINOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinor()
   * @generated
   * @ordered
   */
  protected String minor = MINOR_EDEFAULT;

  /**
   * The default value of the '{@link #getIncremental() <em>Incremental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncremental()
   * @generated
   * @ordered
   */
  protected static final String INCREMENTAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncremental() <em>Incremental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncremental()
   * @generated
   * @ordered
   */
  protected String incremental = INCREMENTAL_EDEFAULT;

  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected String qualifier = QUALIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VersionImpl()
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
    return PomPackage.Literals.VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMajor()
  {
    return major;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMajor(String newMajor)
  {
    String oldMajor = major;
    major = newMajor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.VERSION__MAJOR, oldMajor, major));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinor()
  {
    return minor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinor(String newMinor)
  {
    String oldMinor = minor;
    minor = newMinor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.VERSION__MINOR, oldMinor, minor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncremental()
  {
    return incremental;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncremental(String newIncremental)
  {
    String oldIncremental = incremental;
    incremental = newIncremental;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.VERSION__INCREMENTAL, oldIncremental, incremental));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(String newQualifier)
  {
    String oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.VERSION__QUALIFIER, oldQualifier, qualifier));
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
      case PomPackage.VERSION__MAJOR:
        return getMajor();
      case PomPackage.VERSION__MINOR:
        return getMinor();
      case PomPackage.VERSION__INCREMENTAL:
        return getIncremental();
      case PomPackage.VERSION__QUALIFIER:
        return getQualifier();
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
      case PomPackage.VERSION__MAJOR:
        setMajor((String)newValue);
        return;
      case PomPackage.VERSION__MINOR:
        setMinor((String)newValue);
        return;
      case PomPackage.VERSION__INCREMENTAL:
        setIncremental((String)newValue);
        return;
      case PomPackage.VERSION__QUALIFIER:
        setQualifier((String)newValue);
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
      case PomPackage.VERSION__MAJOR:
        setMajor(MAJOR_EDEFAULT);
        return;
      case PomPackage.VERSION__MINOR:
        setMinor(MINOR_EDEFAULT);
        return;
      case PomPackage.VERSION__INCREMENTAL:
        setIncremental(INCREMENTAL_EDEFAULT);
        return;
      case PomPackage.VERSION__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
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
      case PomPackage.VERSION__MAJOR:
        return MAJOR_EDEFAULT == null ? major != null : !MAJOR_EDEFAULT.equals(major);
      case PomPackage.VERSION__MINOR:
        return MINOR_EDEFAULT == null ? minor != null : !MINOR_EDEFAULT.equals(minor);
      case PomPackage.VERSION__INCREMENTAL:
        return INCREMENTAL_EDEFAULT == null ? incremental != null : !INCREMENTAL_EDEFAULT.equals(incremental);
      case PomPackage.VERSION__QUALIFIER:
        return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
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
    result.append(" (major: ");
    result.append(major);
    result.append(", minor: ");
    result.append(minor);
    result.append(", incremental: ");
    result.append(incremental);
    result.append(", qualifier: ");
    result.append(qualifier);
    result.append(')');
    return result.toString();
  }

} //VersionImpl
