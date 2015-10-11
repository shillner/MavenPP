/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Repository;
import de.itemis.mpp.pom.RepositoryPolicy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#isPluginRepositroy <em>Plugin Repositroy</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.RepositoryImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository
{
  /**
   * The default value of the '{@link #isPluginRepositroy() <em>Plugin Repositroy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPluginRepositroy()
   * @generated
   * @ordered
   */
  protected static final boolean PLUGIN_REPOSITROY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPluginRepositroy() <em>Plugin Repositroy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPluginRepositroy()
   * @generated
   * @ordered
   */
  protected boolean pluginRepositroy = PLUGIN_REPOSITROY_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected static final String LAYOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected String layout = LAYOUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<RepositoryPolicy> policies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryImpl()
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
    return PomPackage.Literals.REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPluginRepositroy()
  {
    return pluginRepositroy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPluginRepositroy(boolean newPluginRepositroy)
  {
    boolean oldPluginRepositroy = pluginRepositroy;
    pluginRepositroy = newPluginRepositroy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY__PLUGIN_REPOSITROY, oldPluginRepositroy, pluginRepositroy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLayout()
  {
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayout(String newLayout)
  {
    String oldLayout = layout;
    layout = newLayout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.REPOSITORY__LAYOUT, oldLayout, layout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RepositoryPolicy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<RepositoryPolicy>(RepositoryPolicy.class, this, PomPackage.REPOSITORY__POLICIES);
    }
    return policies;
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
      case PomPackage.REPOSITORY__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
      case PomPackage.REPOSITORY__PLUGIN_REPOSITROY:
        return isPluginRepositroy();
      case PomPackage.REPOSITORY__ID:
        return getId();
      case PomPackage.REPOSITORY__URL:
        return getUrl();
      case PomPackage.REPOSITORY__NAME:
        return getName();
      case PomPackage.REPOSITORY__LAYOUT:
        return getLayout();
      case PomPackage.REPOSITORY__POLICIES:
        return getPolicies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PomPackage.REPOSITORY__PLUGIN_REPOSITROY:
        setPluginRepositroy((Boolean)newValue);
        return;
      case PomPackage.REPOSITORY__ID:
        setId((String)newValue);
        return;
      case PomPackage.REPOSITORY__URL:
        setUrl((String)newValue);
        return;
      case PomPackage.REPOSITORY__NAME:
        setName((String)newValue);
        return;
      case PomPackage.REPOSITORY__LAYOUT:
        setLayout((String)newValue);
        return;
      case PomPackage.REPOSITORY__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends RepositoryPolicy>)newValue);
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
      case PomPackage.REPOSITORY__PLUGIN_REPOSITROY:
        setPluginRepositroy(PLUGIN_REPOSITROY_EDEFAULT);
        return;
      case PomPackage.REPOSITORY__ID:
        setId(ID_EDEFAULT);
        return;
      case PomPackage.REPOSITORY__URL:
        setUrl(URL_EDEFAULT);
        return;
      case PomPackage.REPOSITORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PomPackage.REPOSITORY__LAYOUT:
        setLayout(LAYOUT_EDEFAULT);
        return;
      case PomPackage.REPOSITORY__POLICIES:
        getPolicies().clear();
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
      case PomPackage.REPOSITORY__PLUGIN_REPOSITROY:
        return pluginRepositroy != PLUGIN_REPOSITROY_EDEFAULT;
      case PomPackage.REPOSITORY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PomPackage.REPOSITORY__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case PomPackage.REPOSITORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PomPackage.REPOSITORY__LAYOUT:
        return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
      case PomPackage.REPOSITORY__POLICIES:
        return policies != null && !policies.isEmpty();
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
    result.append(" (pluginRepositroy: ");
    result.append(pluginRepositroy);
    result.append(", id: ");
    result.append(id);
    result.append(", url: ");
    result.append(url);
    result.append(", name: ");
    result.append(name);
    result.append(", layout: ");
    result.append(layout);
    result.append(')');
    return result.toString();
  }

} //RepositoryImpl
