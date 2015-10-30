/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.NonVersionedCoordinates;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.PluginInclusion;
import de.itemis.mpp.pom.PomPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginInclusionImpl#getExecutionId <em>Execution Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginInclusionImpl#isConfig <em>Config</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginInclusionImpl#getPluginCoordinates <em>Plugin Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginInclusionImpl#getPomRef <em>Pom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginInclusionImpl extends BuildStepImpl implements PluginInclusion
{
  /**
   * The default value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionId()
   * @generated
   * @ordered
   */
  protected static final String EXECUTION_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionId()
   * @generated
   * @ordered
   */
  protected String executionId = EXECUTION_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isConfig() <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfig()
   * @generated
   * @ordered
   */
  protected static final boolean CONFIG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConfig() <em>Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfig()
   * @generated
   * @ordered
   */
  protected boolean config = CONFIG_EDEFAULT;

  /**
   * The cached value of the '{@link #getPluginCoordinates() <em>Plugin Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPluginCoordinates()
   * @generated
   * @ordered
   */
  protected NonVersionedCoordinates pluginCoordinates;

  /**
   * The cached value of the '{@link #getPomRef() <em>Pom Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPomRef()
   * @generated
   * @ordered
   */
  protected POMImport pomRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginInclusionImpl()
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
    return PomPackage.Literals.PLUGIN_INCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExecutionId()
  {
    return executionId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecutionId(String newExecutionId)
  {
    String oldExecutionId = executionId;
    executionId = newExecutionId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_INCLUSION__EXECUTION_ID, oldExecutionId, executionId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(boolean newConfig)
  {
    boolean oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_INCLUSION__CONFIG, oldConfig, config));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonVersionedCoordinates getPluginCoordinates()
  {
    return pluginCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPluginCoordinates(NonVersionedCoordinates newPluginCoordinates, NotificationChain msgs)
  {
    NonVersionedCoordinates oldPluginCoordinates = pluginCoordinates;
    pluginCoordinates = newPluginCoordinates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES, oldPluginCoordinates, newPluginCoordinates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPluginCoordinates(NonVersionedCoordinates newPluginCoordinates)
  {
    if (newPluginCoordinates != pluginCoordinates)
    {
      NotificationChain msgs = null;
      if (pluginCoordinates != null)
        msgs = ((InternalEObject)pluginCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES, null, msgs);
      if (newPluginCoordinates != null)
        msgs = ((InternalEObject)newPluginCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES, null, msgs);
      msgs = basicSetPluginCoordinates(newPluginCoordinates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES, newPluginCoordinates, newPluginCoordinates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POMImport getPomRef()
  {
    if (pomRef != null && pomRef.eIsProxy())
    {
      InternalEObject oldPomRef = (InternalEObject)pomRef;
      pomRef = (POMImport)eResolveProxy(oldPomRef);
      if (pomRef != oldPomRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PomPackage.PLUGIN_INCLUSION__POM_REF, oldPomRef, pomRef));
      }
    }
    return pomRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POMImport basicGetPomRef()
  {
    return pomRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPomRef(POMImport newPomRef)
  {
    POMImport oldPomRef = pomRef;
    pomRef = newPomRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_INCLUSION__POM_REF, oldPomRef, pomRef));
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
      case PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES:
        return basicSetPluginCoordinates(null, msgs);
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
      case PomPackage.PLUGIN_INCLUSION__EXECUTION_ID:
        return getExecutionId();
      case PomPackage.PLUGIN_INCLUSION__CONFIG:
        return isConfig();
      case PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES:
        return getPluginCoordinates();
      case PomPackage.PLUGIN_INCLUSION__POM_REF:
        if (resolve) return getPomRef();
        return basicGetPomRef();
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
      case PomPackage.PLUGIN_INCLUSION__EXECUTION_ID:
        setExecutionId((String)newValue);
        return;
      case PomPackage.PLUGIN_INCLUSION__CONFIG:
        setConfig((Boolean)newValue);
        return;
      case PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES:
        setPluginCoordinates((NonVersionedCoordinates)newValue);
        return;
      case PomPackage.PLUGIN_INCLUSION__POM_REF:
        setPomRef((POMImport)newValue);
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
      case PomPackage.PLUGIN_INCLUSION__EXECUTION_ID:
        setExecutionId(EXECUTION_ID_EDEFAULT);
        return;
      case PomPackage.PLUGIN_INCLUSION__CONFIG:
        setConfig(CONFIG_EDEFAULT);
        return;
      case PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES:
        setPluginCoordinates((NonVersionedCoordinates)null);
        return;
      case PomPackage.PLUGIN_INCLUSION__POM_REF:
        setPomRef((POMImport)null);
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
      case PomPackage.PLUGIN_INCLUSION__EXECUTION_ID:
        return EXECUTION_ID_EDEFAULT == null ? executionId != null : !EXECUTION_ID_EDEFAULT.equals(executionId);
      case PomPackage.PLUGIN_INCLUSION__CONFIG:
        return config != CONFIG_EDEFAULT;
      case PomPackage.PLUGIN_INCLUSION__PLUGIN_COORDINATES:
        return pluginCoordinates != null;
      case PomPackage.PLUGIN_INCLUSION__POM_REF:
        return pomRef != null;
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
    result.append(" (executionId: ");
    result.append(executionId);
    result.append(", config: ");
    result.append(config);
    result.append(')');
    return result.toString();
  }

} //PluginInclusionImpl
