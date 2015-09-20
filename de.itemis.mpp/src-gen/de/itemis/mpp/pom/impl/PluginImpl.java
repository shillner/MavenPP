/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Coordinates;
import de.itemis.mpp.pom.Plugin;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginImpl#getExecutions <em>Executions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginImpl extends BuildStepImpl implements Plugin
{
  /**
   * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinates()
   * @generated
   * @ordered
   */
  protected Coordinates coordinates;

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
   * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutions()
   * @generated
   * @ordered
   */
  protected EList<PluginExecution> executions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginImpl()
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
    return PomPackage.Literals.PLUGIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinates getCoordinates()
  {
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinates(Coordinates newCoordinates, NotificationChain msgs)
  {
    Coordinates oldCoordinates = coordinates;
    coordinates = newCoordinates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN__COORDINATES, oldCoordinates, newCoordinates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinates(Coordinates newCoordinates)
  {
    if (newCoordinates != coordinates)
    {
      NotificationChain msgs = null;
      if (coordinates != null)
        msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN__COORDINATES, null, msgs);
      if (newCoordinates != null)
        msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN__COORDINATES, null, msgs);
      msgs = basicSetCoordinates(newCoordinates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN__COORDINATES, newCoordinates, newCoordinates));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN__CONFIGURATION, oldConfiguration, newConfiguration);
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
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PLUGIN__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PLUGIN__CONFIGURATION, newConfiguration, newConfiguration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PluginExecution> getExecutions()
  {
    if (executions == null)
    {
      executions = new EObjectContainmentEList<PluginExecution>(PluginExecution.class, this, PomPackage.PLUGIN__EXECUTIONS);
    }
    return executions;
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
      case PomPackage.PLUGIN__COORDINATES:
        return basicSetCoordinates(null, msgs);
      case PomPackage.PLUGIN__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
      case PomPackage.PLUGIN__EXECUTIONS:
        return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
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
      case PomPackage.PLUGIN__COORDINATES:
        return getCoordinates();
      case PomPackage.PLUGIN__CONFIGURATION:
        return getConfiguration();
      case PomPackage.PLUGIN__EXECUTIONS:
        return getExecutions();
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
      case PomPackage.PLUGIN__COORDINATES:
        setCoordinates((Coordinates)newValue);
        return;
      case PomPackage.PLUGIN__CONFIGURATION:
        setConfiguration((PluginConfiguration)newValue);
        return;
      case PomPackage.PLUGIN__EXECUTIONS:
        getExecutions().clear();
        getExecutions().addAll((Collection<? extends PluginExecution>)newValue);
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
      case PomPackage.PLUGIN__COORDINATES:
        setCoordinates((Coordinates)null);
        return;
      case PomPackage.PLUGIN__CONFIGURATION:
        setConfiguration((PluginConfiguration)null);
        return;
      case PomPackage.PLUGIN__EXECUTIONS:
        getExecutions().clear();
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
      case PomPackage.PLUGIN__COORDINATES:
        return coordinates != null;
      case PomPackage.PLUGIN__CONFIGURATION:
        return configuration != null;
      case PomPackage.PLUGIN__EXECUTIONS:
        return executions != null && !executions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PluginImpl
