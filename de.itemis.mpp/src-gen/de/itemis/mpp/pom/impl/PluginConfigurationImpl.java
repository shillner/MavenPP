/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PluginConfiguration;
import de.itemis.mpp.pom.PluginConfigurationItem;
import de.itemis.mpp.pom.PomPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginConfigurationImpl#getConfigurationItems <em>Configuration Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginConfigurationImpl extends MinimalEObjectImpl.Container implements PluginConfiguration
{
  /**
   * The cached value of the '{@link #getConfigurationItems() <em>Configuration Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurationItems()
   * @generated
   * @ordered
   */
  protected EList<PluginConfigurationItem> configurationItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginConfigurationImpl()
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
    return PomPackage.Literals.PLUGIN_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PluginConfigurationItem> getConfigurationItems()
  {
    if (configurationItems == null)
    {
      configurationItems = new EObjectContainmentEList<PluginConfigurationItem>(PluginConfigurationItem.class, this, PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS);
    }
    return configurationItems;
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
      case PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS:
        return ((InternalEList<?>)getConfigurationItems()).basicRemove(otherEnd, msgs);
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
      case PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS:
        return getConfigurationItems();
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
      case PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS:
        getConfigurationItems().clear();
        getConfigurationItems().addAll((Collection<? extends PluginConfigurationItem>)newValue);
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
      case PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS:
        getConfigurationItems().clear();
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
      case PomPackage.PLUGIN_CONFIGURATION__CONFIGURATION_ITEMS:
        return configurationItems != null && !configurationItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PluginConfigurationImpl
