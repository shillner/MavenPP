/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.DependencyInclusion;
import de.itemis.mpp.pom.DependencyScope;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.PomPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.DependencyInclusionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.DependencyInclusionImpl#getPomRef <em>Pom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyInclusionImpl extends MinimalEObjectImpl.Container implements DependencyInclusion
{
  /**
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final DependencyScope SCOPE_EDEFAULT = DependencyScope.COMPILE;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected DependencyScope scope = SCOPE_EDEFAULT;

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
  protected DependencyInclusionImpl()
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
    return PomPackage.Literals.DEPENDENCY_INCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyScope getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(DependencyScope newScope)
  {
    DependencyScope oldScope = scope;
    scope = newScope == null ? SCOPE_EDEFAULT : newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.DEPENDENCY_INCLUSION__SCOPE, oldScope, scope));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PomPackage.DEPENDENCY_INCLUSION__POM_REF, oldPomRef, pomRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.DEPENDENCY_INCLUSION__POM_REF, oldPomRef, pomRef));
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
      case PomPackage.DEPENDENCY_INCLUSION__SCOPE:
        return getScope();
      case PomPackage.DEPENDENCY_INCLUSION__POM_REF:
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
      case PomPackage.DEPENDENCY_INCLUSION__SCOPE:
        setScope((DependencyScope)newValue);
        return;
      case PomPackage.DEPENDENCY_INCLUSION__POM_REF:
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
      case PomPackage.DEPENDENCY_INCLUSION__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case PomPackage.DEPENDENCY_INCLUSION__POM_REF:
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
      case PomPackage.DEPENDENCY_INCLUSION__SCOPE:
        return scope != SCOPE_EDEFAULT;
      case PomPackage.DEPENDENCY_INCLUSION__POM_REF:
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
    result.append(" (scope: ");
    result.append(scope);
    result.append(')');
    return result.toString();
  }

} //DependencyInclusionImpl
