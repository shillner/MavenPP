/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Dependency;
import de.itemis.mpp.pom.DependencyScope;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.UngroupedDependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ungrouped Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.UngroupedDependencyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.UngroupedDependencyImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UngroupedDependencyImpl extends MinimalEObjectImpl.Container implements UngroupedDependency
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
   * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected Dependency dependency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UngroupedDependencyImpl()
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
    return PomPackage.Literals.UNGROUPED_DEPENDENCY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.UNGROUPED_DEPENDENCY__SCOPE, oldScope, scope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency getDependency()
  {
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependency(Dependency newDependency, NotificationChain msgs)
  {
    Dependency oldDependency = dependency;
    dependency = newDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY, oldDependency, newDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependency(Dependency newDependency)
  {
    if (newDependency != dependency)
    {
      NotificationChain msgs = null;
      if (dependency != null)
        msgs = ((InternalEObject)dependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY, null, msgs);
      if (newDependency != null)
        msgs = ((InternalEObject)newDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY, null, msgs);
      msgs = basicSetDependency(newDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY, newDependency, newDependency));
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
      case PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY:
        return basicSetDependency(null, msgs);
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
      case PomPackage.UNGROUPED_DEPENDENCY__SCOPE:
        return getScope();
      case PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY:
        return getDependency();
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
      case PomPackage.UNGROUPED_DEPENDENCY__SCOPE:
        setScope((DependencyScope)newValue);
        return;
      case PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY:
        setDependency((Dependency)newValue);
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
      case PomPackage.UNGROUPED_DEPENDENCY__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY:
        setDependency((Dependency)null);
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
      case PomPackage.UNGROUPED_DEPENDENCY__SCOPE:
        return scope != SCOPE_EDEFAULT;
      case PomPackage.UNGROUPED_DEPENDENCY__DEPENDENCY:
        return dependency != null;
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

} //UngroupedDependencyImpl
