/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Properties;
import de.itemis.mpp.pom.Property;
import de.itemis.mpp.pom.PropertyInclusion;

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
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.PropertiesImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.PropertiesImpl#getInclusions <em>Inclusions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesImpl extends MinimalEObjectImpl.Container implements Properties
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getInclusions() <em>Inclusions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusions()
   * @generated
   * @ordered
   */
  protected EList<PropertyInclusion> inclusions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesImpl()
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
    return PomPackage.Literals.PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, PomPackage.PROPERTIES__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyInclusion> getInclusions()
  {
    if (inclusions == null)
    {
      inclusions = new EObjectContainmentEList<PropertyInclusion>(PropertyInclusion.class, this, PomPackage.PROPERTIES__INCLUSIONS);
    }
    return inclusions;
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
      case PomPackage.PROPERTIES__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case PomPackage.PROPERTIES__INCLUSIONS:
        return ((InternalEList<?>)getInclusions()).basicRemove(otherEnd, msgs);
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
      case PomPackage.PROPERTIES__PROPERTIES:
        return getProperties();
      case PomPackage.PROPERTIES__INCLUSIONS:
        return getInclusions();
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
      case PomPackage.PROPERTIES__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case PomPackage.PROPERTIES__INCLUSIONS:
        getInclusions().clear();
        getInclusions().addAll((Collection<? extends PropertyInclusion>)newValue);
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
      case PomPackage.PROPERTIES__PROPERTIES:
        getProperties().clear();
        return;
      case PomPackage.PROPERTIES__INCLUSIONS:
        getInclusions().clear();
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
      case PomPackage.PROPERTIES__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case PomPackage.PROPERTIES__INCLUSIONS:
        return inclusions != null && !inclusions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropertiesImpl
