/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PluginConfigurationParameterMap;
import de.itemis.mpp.pom.PluginConfigurationParameterMapEntry;
import de.itemis.mpp.pom.PomPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Configuration Parameter Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PluginConfigurationParameterMapImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginConfigurationParameterMapImpl extends PluginConfigurationItemImpl implements PluginConfigurationParameterMap
{
  /**
   * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntries()
   * @generated
   * @ordered
   */
  protected EList<PluginConfigurationParameterMapEntry> entries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginConfigurationParameterMapImpl()
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
    return PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PluginConfigurationParameterMapEntry> getEntries()
  {
    if (entries == null)
    {
      entries = new EObjectContainmentEList<PluginConfigurationParameterMapEntry>(PluginConfigurationParameterMapEntry.class, this, PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES);
    }
    return entries;
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
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES:
        return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES:
        return getEntries();
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
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES:
        getEntries().clear();
        getEntries().addAll((Collection<? extends PluginConfigurationParameterMapEntry>)newValue);
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
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES:
        getEntries().clear();
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
      case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP__ENTRIES:
        return entries != null && !entries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PluginConfigurationParameterMapImpl
