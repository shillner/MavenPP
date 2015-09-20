/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.ExtendedCoordinates;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.ExtendedCoordinatesImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedCoordinatesImpl extends MinimalEObjectImpl.Container implements ExtendedCoordinates
{
  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected static final String CLASSIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected String classifier = CLASSIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedCoordinatesImpl()
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
    return PomPackage.Literals.EXTENDED_COORDINATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs)
  {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(Version newVersion)
  {
    if (newVersion != version)
    {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.EXTENDED_COORDINATES__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.EXTENDED_COORDINATES__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__VERSION, newVersion, newVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassifier()
  {
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassifier(String newClassifier)
  {
    String oldClassifier = classifier;
    classifier = newClassifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.EXTENDED_COORDINATES__CLASSIFIER, oldClassifier, classifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PomPackage.EXTENDED_COORDINATES__VERSION:
        return basicSetVersion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PomPackage.EXTENDED_COORDINATES__GROUP_ID:
        return getGroupId();
      case PomPackage.EXTENDED_COORDINATES__ARTIFACT_ID:
        return getArtifactId();
      case PomPackage.EXTENDED_COORDINATES__VERSION:
        return getVersion();
      case PomPackage.EXTENDED_COORDINATES__TYPE:
        return getType();
      case PomPackage.EXTENDED_COORDINATES__CLASSIFIER:
        return getClassifier();
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
      case PomPackage.EXTENDED_COORDINATES__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case PomPackage.EXTENDED_COORDINATES__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case PomPackage.EXTENDED_COORDINATES__VERSION:
        setVersion((Version)newValue);
        return;
      case PomPackage.EXTENDED_COORDINATES__TYPE:
        setType((String)newValue);
        return;
      case PomPackage.EXTENDED_COORDINATES__CLASSIFIER:
        setClassifier((String)newValue);
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
      case PomPackage.EXTENDED_COORDINATES__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case PomPackage.EXTENDED_COORDINATES__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case PomPackage.EXTENDED_COORDINATES__VERSION:
        setVersion((Version)null);
        return;
      case PomPackage.EXTENDED_COORDINATES__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PomPackage.EXTENDED_COORDINATES__CLASSIFIER:
        setClassifier(CLASSIFIER_EDEFAULT);
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
      case PomPackage.EXTENDED_COORDINATES__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case PomPackage.EXTENDED_COORDINATES__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case PomPackage.EXTENDED_COORDINATES__VERSION:
        return version != null;
      case PomPackage.EXTENDED_COORDINATES__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case PomPackage.EXTENDED_COORDINATES__CLASSIFIER:
        return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
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
    result.append(" (groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", type: ");
    result.append(type);
    result.append(", classifier: ");
    result.append(classifier);
    result.append(')');
    return result.toString();
  }

} //ExtendedCoordinatesImpl
