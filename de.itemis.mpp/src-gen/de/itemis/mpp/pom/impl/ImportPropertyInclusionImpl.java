/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.ImportPropertyInclusion;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.PomPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Property Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.ImportPropertyInclusionImpl#getPomRef <em>Pom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportPropertyInclusionImpl extends PropertyInclusionImpl implements ImportPropertyInclusion
{
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
  protected ImportPropertyInclusionImpl()
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
    return PomPackage.Literals.IMPORT_PROPERTY_INCLUSION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF, oldPomRef, pomRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF, oldPomRef, pomRef));
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
      case PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF:
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
      case PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF:
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
      case PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF:
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
      case PomPackage.IMPORT_PROPERTY_INCLUSION__POM_REF:
        return pomRef != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportPropertyInclusionImpl
