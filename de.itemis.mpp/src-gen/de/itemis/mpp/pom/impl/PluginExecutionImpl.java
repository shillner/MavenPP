/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Phase;
import de.itemis.mpp.pom.PluginConfiguration;
import de.itemis.mpp.pom.PluginExecution;
import de.itemis.mpp.pom.PomPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginExecutionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginExecutionImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginExecutionImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginExecutionImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginExecutionImpl#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginExecutionImpl extends MinimalEObjectImpl.Container implements PluginExecution
{
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
   * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected static final Phase PHASE_EDEFAULT = Phase.DEFAULT;

  /**
   * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected Phase phase = PHASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<String> goals;

  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected PluginConfiguration configuration;

  /**
   * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected boolean default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginExecutionImpl()
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
    return PomPackage.Literals.PLUGIN_EXECUTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_EXECUTION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase getPhase()
  {
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhase(Phase newPhase)
  {
    Phase oldPhase = phase;
    phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_EXECUTION__PHASE, oldPhase, phase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGoals()
  {
    if (goals == null)
    {
      goals = new EDataTypeEList<String>(String.class, this, PomPackage.PLUGIN_EXECUTION__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginConfiguration getConfiguration()
  {
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfiguration(PluginConfiguration newConfiguration, NotificationChain msgs)
  {
    PluginConfiguration oldConfiguration = configuration;
    configuration = newConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_EXECUTION__CONFIGURATION, oldConfiguration, newConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfiguration(PluginConfiguration newConfiguration)
  {
    if (newConfiguration != configuration)
    {
      NotificationChain msgs = null;
      if (configuration != null)
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN_EXECUTION__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN_EXECUTION__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_EXECUTION__CONFIGURATION, newConfiguration, newConfiguration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(boolean newDefault)
  {
    boolean oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN_EXECUTION__DEFAULT, oldDefault, default_));
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
      case PomPackage.PLUGIN_EXECUTION__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
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
      case PomPackage.PLUGIN_EXECUTION__ID:
        return getId();
      case PomPackage.PLUGIN_EXECUTION__PHASE:
        return getPhase();
      case PomPackage.PLUGIN_EXECUTION__GOALS:
        return getGoals();
      case PomPackage.PLUGIN_EXECUTION__CONFIGURATION:
        return getConfiguration();
      case PomPackage.PLUGIN_EXECUTION__DEFAULT:
        return isDefault();
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
      case PomPackage.PLUGIN_EXECUTION__ID:
        setId((String)newValue);
        return;
      case PomPackage.PLUGIN_EXECUTION__PHASE:
        setPhase((Phase)newValue);
        return;
      case PomPackage.PLUGIN_EXECUTION__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends String>)newValue);
        return;
      case PomPackage.PLUGIN_EXECUTION__CONFIGURATION:
        setConfiguration((PluginConfiguration)newValue);
        return;
      case PomPackage.PLUGIN_EXECUTION__DEFAULT:
        setDefault((Boolean)newValue);
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
      case PomPackage.PLUGIN_EXECUTION__ID:
        setId(ID_EDEFAULT);
        return;
      case PomPackage.PLUGIN_EXECUTION__PHASE:
        setPhase(PHASE_EDEFAULT);
        return;
      case PomPackage.PLUGIN_EXECUTION__GOALS:
        getGoals().clear();
        return;
      case PomPackage.PLUGIN_EXECUTION__CONFIGURATION:
        setConfiguration((PluginConfiguration)null);
        return;
      case PomPackage.PLUGIN_EXECUTION__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
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
      case PomPackage.PLUGIN_EXECUTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PomPackage.PLUGIN_EXECUTION__PHASE:
        return phase != PHASE_EDEFAULT;
      case PomPackage.PLUGIN_EXECUTION__GOALS:
        return goals != null && !goals.isEmpty();
      case PomPackage.PLUGIN_EXECUTION__CONFIGURATION:
        return configuration != null;
      case PomPackage.PLUGIN_EXECUTION__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", phase: ");
    result.append(phase);
    result.append(", goals: ");
    result.append(goals);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //PluginExecutionImpl
