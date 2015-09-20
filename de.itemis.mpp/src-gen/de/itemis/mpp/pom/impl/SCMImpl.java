/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.SCM;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.SCMImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.SCMImpl#getDeveloperConncetion <em>Developer Conncetion</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.SCMImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.SCMImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCMImpl extends MinimalEObjectImpl.Container implements SCM
{
  /**
   * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected static final String CONNECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected String connection = CONNECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDeveloperConncetion() <em>Developer Conncetion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeveloperConncetion()
   * @generated
   * @ordered
   */
  protected static final String DEVELOPER_CONNCETION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeveloperConncetion() <em>Developer Conncetion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeveloperConncetion()
   * @generated
   * @ordered
   */
  protected String developerConncetion = DEVELOPER_CONNCETION_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected static final String TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected String tag = TAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SCMImpl()
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
    return PomPackage.Literals.SCM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnection(String newConnection)
  {
    String oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__CONNECTION, oldConnection, connection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeveloperConncetion()
  {
    return developerConncetion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeveloperConncetion(String newDeveloperConncetion)
  {
    String oldDeveloperConncetion = developerConncetion;
    developerConncetion = newDeveloperConncetion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__DEVELOPER_CONNCETION, oldDeveloperConncetion, developerConncetion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(String newTag)
  {
    String oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.SCM__TAG, oldTag, tag));
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
      case PomPackage.SCM__CONNECTION:
        return getConnection();
      case PomPackage.SCM__DEVELOPER_CONNCETION:
        return getDeveloperConncetion();
      case PomPackage.SCM__URL:
        return getUrl();
      case PomPackage.SCM__TAG:
        return getTag();
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
      case PomPackage.SCM__CONNECTION:
        setConnection((String)newValue);
        return;
      case PomPackage.SCM__DEVELOPER_CONNCETION:
        setDeveloperConncetion((String)newValue);
        return;
      case PomPackage.SCM__URL:
        setUrl((String)newValue);
        return;
      case PomPackage.SCM__TAG:
        setTag((String)newValue);
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
      case PomPackage.SCM__CONNECTION:
        setConnection(CONNECTION_EDEFAULT);
        return;
      case PomPackage.SCM__DEVELOPER_CONNCETION:
        setDeveloperConncetion(DEVELOPER_CONNCETION_EDEFAULT);
        return;
      case PomPackage.SCM__URL:
        setUrl(URL_EDEFAULT);
        return;
      case PomPackage.SCM__TAG:
        setTag(TAG_EDEFAULT);
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
      case PomPackage.SCM__CONNECTION:
        return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
      case PomPackage.SCM__DEVELOPER_CONNCETION:
        return DEVELOPER_CONNCETION_EDEFAULT == null ? developerConncetion != null : !DEVELOPER_CONNCETION_EDEFAULT.equals(developerConncetion);
      case PomPackage.SCM__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case PomPackage.SCM__TAG:
        return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
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
    result.append(" (connection: ");
    result.append(connection);
    result.append(", developerConncetion: ");
    result.append(developerConncetion);
    result.append(", url: ");
    result.append(url);
    result.append(", tag: ");
    result.append(tag);
    result.append(')');
    return result.toString();
  }

} //SCMImpl
