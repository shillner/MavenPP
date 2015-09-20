/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.Coordinates;
import de.itemis.mpp.pom.ParentRef;
import de.itemis.mpp.pom.PomPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.ParentRefImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.ParentRefImpl#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParentRefImpl extends MinimalEObjectImpl.Container implements ParentRef
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
   * The default value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelativePath()
   * @generated
   * @ordered
   */
  protected static final String RELATIVE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelativePath()
   * @generated
   * @ordered
   */
  protected String relativePath = RELATIVE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParentRefImpl()
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
    return PomPackage.Literals.PARENT_REF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.PARENT_REF__COORDINATES, oldCoordinates, newCoordinates);
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
        msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.PARENT_REF__COORDINATES, null, msgs);
      if (newCoordinates != null)
        msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.PARENT_REF__COORDINATES, null, msgs);
      msgs = basicSetCoordinates(newCoordinates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PARENT_REF__COORDINATES, newCoordinates, newCoordinates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelativePath()
  {
    return relativePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelativePath(String newRelativePath)
  {
    String oldRelativePath = relativePath;
    relativePath = newRelativePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.PARENT_REF__RELATIVE_PATH, oldRelativePath, relativePath));
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
      case PomPackage.PARENT_REF__COORDINATES:
        return basicSetCoordinates(null, msgs);
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
      case PomPackage.PARENT_REF__COORDINATES:
        return getCoordinates();
      case PomPackage.PARENT_REF__RELATIVE_PATH:
        return getRelativePath();
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
      case PomPackage.PARENT_REF__COORDINATES:
        setCoordinates((Coordinates)newValue);
        return;
      case PomPackage.PARENT_REF__RELATIVE_PATH:
        setRelativePath((String)newValue);
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
      case PomPackage.PARENT_REF__COORDINATES:
        setCoordinates((Coordinates)null);
        return;
      case PomPackage.PARENT_REF__RELATIVE_PATH:
        setRelativePath(RELATIVE_PATH_EDEFAULT);
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
      case PomPackage.PARENT_REF__COORDINATES:
        return coordinates != null;
      case PomPackage.PARENT_REF__RELATIVE_PATH:
        return RELATIVE_PATH_EDEFAULT == null ? relativePath != null : !RELATIVE_PATH_EDEFAULT.equals(relativePath);
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
    result.append(" (relativePath: ");
    result.append(relativePath);
    result.append(')');
    return result.toString();
  }

} //ParentRefImpl
