/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Dependency;
import de.itemis.mpp.pom.DependencyGroup;
import de.itemis.mpp.pom.DependencyScope;
import de.itemis.mpp.pom.PomPackage;

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
 * An implementation of the model object '<em><b>Dependency Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.DependencyGroupImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.DependencyGroupImpl#getDependecies <em>Dependecies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyGroupImpl extends MinimalEObjectImpl.Container implements DependencyGroup
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
   * The cached value of the '{@link #getDependecies() <em>Dependecies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependecies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependecies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyGroupImpl()
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
    return PomPackage.Literals.DEPENDENCY_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.DEPENDENCY_GROUP__SCOPE, oldScope, scope));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependecies()
  {
    if (dependecies == null)
    {
      dependecies = new EObjectContainmentEList<Dependency>(Dependency.class, this, PomPackage.DEPENDENCY_GROUP__DEPENDECIES);
    }
    return dependecies;
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
      case PomPackage.DEPENDENCY_GROUP__DEPENDECIES:
        return ((InternalEList<?>)getDependecies()).basicRemove(otherEnd, msgs);
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
      case PomPackage.DEPENDENCY_GROUP__SCOPE:
        return getScope();
      case PomPackage.DEPENDENCY_GROUP__DEPENDECIES:
        return getDependecies();
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
      case PomPackage.DEPENDENCY_GROUP__SCOPE:
        setScope((DependencyScope)newValue);
        return;
      case PomPackage.DEPENDENCY_GROUP__DEPENDECIES:
        getDependecies().clear();
        getDependecies().addAll((Collection<? extends Dependency>)newValue);
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
      case PomPackage.DEPENDENCY_GROUP__SCOPE:
        setScope(SCOPE_EDEFAULT);
        return;
      case PomPackage.DEPENDENCY_GROUP__DEPENDECIES:
        getDependecies().clear();
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
      case PomPackage.DEPENDENCY_GROUP__SCOPE:
        return scope != SCOPE_EDEFAULT;
      case PomPackage.DEPENDENCY_GROUP__DEPENDECIES:
        return dependecies != null && !dependecies.isEmpty();
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

} //DependencyGroupImpl
