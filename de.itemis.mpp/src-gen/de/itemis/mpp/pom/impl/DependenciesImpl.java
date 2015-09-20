/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Dependencies;
import de.itemis.mpp.pom.DependencyGroup;
import de.itemis.mpp.pom.DependencyInclusion;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.UngroupedDependency;

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
 * An implementation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.DependenciesImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.DependenciesImpl#getDependencyGroups <em>Dependency Groups</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.DependenciesImpl#getUngroupedDependencies <em>Ungrouped Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenciesImpl extends MinimalEObjectImpl.Container implements Dependencies
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<DependencyInclusion> includes;

  /**
   * The cached value of the '{@link #getDependencyGroups() <em>Dependency Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencyGroups()
   * @generated
   * @ordered
   */
  protected EList<DependencyGroup> dependencyGroups;

  /**
   * The cached value of the '{@link #getUngroupedDependencies() <em>Ungrouped Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUngroupedDependencies()
   * @generated
   * @ordered
   */
  protected EList<UngroupedDependency> ungroupedDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependenciesImpl()
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
    return PomPackage.Literals.DEPENDENCIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependencyInclusion> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<DependencyInclusion>(DependencyInclusion.class, this, PomPackage.DEPENDENCIES__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependencyGroup> getDependencyGroups()
  {
    if (dependencyGroups == null)
    {
      dependencyGroups = new EObjectContainmentEList<DependencyGroup>(DependencyGroup.class, this, PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS);
    }
    return dependencyGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UngroupedDependency> getUngroupedDependencies()
  {
    if (ungroupedDependencies == null)
    {
      ungroupedDependencies = new EObjectContainmentEList<UngroupedDependency>(UngroupedDependency.class, this, PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES);
    }
    return ungroupedDependencies;
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
      case PomPackage.DEPENDENCIES__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS:
        return ((InternalEList<?>)getDependencyGroups()).basicRemove(otherEnd, msgs);
      case PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES:
        return ((InternalEList<?>)getUngroupedDependencies()).basicRemove(otherEnd, msgs);
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
      case PomPackage.DEPENDENCIES__INCLUDES:
        return getIncludes();
      case PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS:
        return getDependencyGroups();
      case PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES:
        return getUngroupedDependencies();
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
      case PomPackage.DEPENDENCIES__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends DependencyInclusion>)newValue);
        return;
      case PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS:
        getDependencyGroups().clear();
        getDependencyGroups().addAll((Collection<? extends DependencyGroup>)newValue);
        return;
      case PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES:
        getUngroupedDependencies().clear();
        getUngroupedDependencies().addAll((Collection<? extends UngroupedDependency>)newValue);
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
      case PomPackage.DEPENDENCIES__INCLUDES:
        getIncludes().clear();
        return;
      case PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS:
        getDependencyGroups().clear();
        return;
      case PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES:
        getUngroupedDependencies().clear();
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
      case PomPackage.DEPENDENCIES__INCLUDES:
        return includes != null && !includes.isEmpty();
      case PomPackage.DEPENDENCIES__DEPENDENCY_GROUPS:
        return dependencyGroups != null && !dependencyGroups.isEmpty();
      case PomPackage.DEPENDENCIES__UNGROUPED_DEPENDENCIES:
        return ungroupedDependencies != null && !ungroupedDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DependenciesImpl
