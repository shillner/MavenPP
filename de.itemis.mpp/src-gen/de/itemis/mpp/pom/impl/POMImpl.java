/**
 */
package de.itemis.mpp.pom.impl;

import de.itemis.mpp.pom.ArtifactDefinition;
import de.itemis.mpp.pom.BuildStep;
import de.itemis.mpp.pom.Dependencies;
import de.itemis.mpp.pom.Modules;
import de.itemis.mpp.pom.POM;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.ParentRef;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Property;
import de.itemis.mpp.pom.PropertyInclusion;
import de.itemis.mpp.pom.SCM;

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
 * An implementation of the model object '<em><b>POM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getArtifactDefinition <em>Artifact Definition</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getPropertyInclusions <em>Property Inclusions</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getScm <em>Scm</em>}</li>
 *   <li>{@link de.itemis.mpp.pom.impl.POMImpl#getBuildSteps <em>Build Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POMImpl extends MinimalEObjectImpl.Container implements POM
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<POMImport> imports;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected ParentRef parent;

  /**
   * The cached value of the '{@link #getArtifactDefinition() <em>Artifact Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactDefinition()
   * @generated
   * @ordered
   */
  protected ArtifactDefinition artifactDefinition;

  /**
   * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModules()
   * @generated
   * @ordered
   */
  protected Modules modules;

  /**
   * The cached value of the '{@link #getPropertyInclusions() <em>Property Inclusions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyInclusions()
   * @generated
   * @ordered
   */
  protected EList<PropertyInclusion> propertyInclusions;

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
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected Dependencies dependencies;

  /**
   * The cached value of the '{@link #getScm() <em>Scm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScm()
   * @generated
   * @ordered
   */
  protected SCM scm;

  /**
   * The cached value of the '{@link #getBuildSteps() <em>Build Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildSteps()
   * @generated
   * @ordered
   */
  protected EList<BuildStep> buildSteps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POMImpl()
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
    return PomPackage.Literals.POM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<POMImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<POMImport>(POMImport.class, this, PomPackage.POM__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentRef getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ParentRef newParent, NotificationChain msgs)
  {
    ParentRef oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.POM__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ParentRef newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__PARENT, null, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__PARENT, null, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.POM__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArtifactDefinition getArtifactDefinition()
  {
    return artifactDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifactDefinition(ArtifactDefinition newArtifactDefinition, NotificationChain msgs)
  {
    ArtifactDefinition oldArtifactDefinition = artifactDefinition;
    artifactDefinition = newArtifactDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.POM__ARTIFACT_DEFINITION, oldArtifactDefinition, newArtifactDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactDefinition(ArtifactDefinition newArtifactDefinition)
  {
    if (newArtifactDefinition != artifactDefinition)
    {
      NotificationChain msgs = null;
      if (artifactDefinition != null)
        msgs = ((InternalEObject)artifactDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__ARTIFACT_DEFINITION, null, msgs);
      if (newArtifactDefinition != null)
        msgs = ((InternalEObject)newArtifactDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__ARTIFACT_DEFINITION, null, msgs);
      msgs = basicSetArtifactDefinition(newArtifactDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.POM__ARTIFACT_DEFINITION, newArtifactDefinition, newArtifactDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modules getModules()
  {
    return modules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModules(Modules newModules, NotificationChain msgs)
  {
    Modules oldModules = modules;
    modules = newModules;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.POM__MODULES, oldModules, newModules);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModules(Modules newModules)
  {
    if (newModules != modules)
    {
      NotificationChain msgs = null;
      if (modules != null)
        msgs = ((InternalEObject)modules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__MODULES, null, msgs);
      if (newModules != null)
        msgs = ((InternalEObject)newModules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__MODULES, null, msgs);
      msgs = basicSetModules(newModules, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.POM__MODULES, newModules, newModules));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyInclusion> getPropertyInclusions()
  {
    if (propertyInclusions == null)
    {
      propertyInclusions = new EObjectContainmentEList<PropertyInclusion>(PropertyInclusion.class, this, PomPackage.POM__PROPERTY_INCLUSIONS);
    }
    return propertyInclusions;
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
      properties = new EObjectContainmentEList<Property>(Property.class, this, PomPackage.POM__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependencies getDependencies()
  {
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependencies(Dependencies newDependencies, NotificationChain msgs)
  {
    Dependencies oldDependencies = dependencies;
    dependencies = newDependencies;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.POM__DEPENDENCIES, oldDependencies, newDependencies);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependencies(Dependencies newDependencies)
  {
    if (newDependencies != dependencies)
    {
      NotificationChain msgs = null;
      if (dependencies != null)
        msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__DEPENDENCIES, null, msgs);
      if (newDependencies != null)
        msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__DEPENDENCIES, null, msgs);
      msgs = basicSetDependencies(newDependencies, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.POM__DEPENDENCIES, newDependencies, newDependencies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCM getScm()
  {
    return scm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScm(SCM newScm, NotificationChain msgs)
  {
    SCM oldScm = scm;
    scm = newScm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PomPackage.POM__SCM, oldScm, newScm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScm(SCM newScm)
  {
    if (newScm != scm)
    {
      NotificationChain msgs = null;
      if (scm != null)
        msgs = ((InternalEObject)scm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__SCM, null, msgs);
      if (newScm != null)
        msgs = ((InternalEObject)newScm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PomPackage.POM__SCM, null, msgs);
      msgs = basicSetScm(newScm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PomPackage.POM__SCM, newScm, newScm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildStep> getBuildSteps()
  {
    if (buildSteps == null)
    {
      buildSteps = new EObjectContainmentEList<BuildStep>(BuildStep.class, this, PomPackage.POM__BUILD_STEPS);
    }
    return buildSteps;
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
      case PomPackage.POM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case PomPackage.POM__PARENT:
        return basicSetParent(null, msgs);
      case PomPackage.POM__ARTIFACT_DEFINITION:
        return basicSetArtifactDefinition(null, msgs);
      case PomPackage.POM__MODULES:
        return basicSetModules(null, msgs);
      case PomPackage.POM__PROPERTY_INCLUSIONS:
        return ((InternalEList<?>)getPropertyInclusions()).basicRemove(otherEnd, msgs);
      case PomPackage.POM__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case PomPackage.POM__DEPENDENCIES:
        return basicSetDependencies(null, msgs);
      case PomPackage.POM__SCM:
        return basicSetScm(null, msgs);
      case PomPackage.POM__BUILD_STEPS:
        return ((InternalEList<?>)getBuildSteps()).basicRemove(otherEnd, msgs);
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
      case PomPackage.POM__IMPORTS:
        return getImports();
      case PomPackage.POM__PARENT:
        return getParent();
      case PomPackage.POM__ARTIFACT_DEFINITION:
        return getArtifactDefinition();
      case PomPackage.POM__MODULES:
        return getModules();
      case PomPackage.POM__PROPERTY_INCLUSIONS:
        return getPropertyInclusions();
      case PomPackage.POM__PROPERTIES:
        return getProperties();
      case PomPackage.POM__DEPENDENCIES:
        return getDependencies();
      case PomPackage.POM__SCM:
        return getScm();
      case PomPackage.POM__BUILD_STEPS:
        return getBuildSteps();
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
      case PomPackage.POM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends POMImport>)newValue);
        return;
      case PomPackage.POM__PARENT:
        setParent((ParentRef)newValue);
        return;
      case PomPackage.POM__ARTIFACT_DEFINITION:
        setArtifactDefinition((ArtifactDefinition)newValue);
        return;
      case PomPackage.POM__MODULES:
        setModules((Modules)newValue);
        return;
      case PomPackage.POM__PROPERTY_INCLUSIONS:
        getPropertyInclusions().clear();
        getPropertyInclusions().addAll((Collection<? extends PropertyInclusion>)newValue);
        return;
      case PomPackage.POM__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case PomPackage.POM__DEPENDENCIES:
        setDependencies((Dependencies)newValue);
        return;
      case PomPackage.POM__SCM:
        setScm((SCM)newValue);
        return;
      case PomPackage.POM__BUILD_STEPS:
        getBuildSteps().clear();
        getBuildSteps().addAll((Collection<? extends BuildStep>)newValue);
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
      case PomPackage.POM__IMPORTS:
        getImports().clear();
        return;
      case PomPackage.POM__PARENT:
        setParent((ParentRef)null);
        return;
      case PomPackage.POM__ARTIFACT_DEFINITION:
        setArtifactDefinition((ArtifactDefinition)null);
        return;
      case PomPackage.POM__MODULES:
        setModules((Modules)null);
        return;
      case PomPackage.POM__PROPERTY_INCLUSIONS:
        getPropertyInclusions().clear();
        return;
      case PomPackage.POM__PROPERTIES:
        getProperties().clear();
        return;
      case PomPackage.POM__DEPENDENCIES:
        setDependencies((Dependencies)null);
        return;
      case PomPackage.POM__SCM:
        setScm((SCM)null);
        return;
      case PomPackage.POM__BUILD_STEPS:
        getBuildSteps().clear();
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
      case PomPackage.POM__IMPORTS:
        return imports != null && !imports.isEmpty();
      case PomPackage.POM__PARENT:
        return parent != null;
      case PomPackage.POM__ARTIFACT_DEFINITION:
        return artifactDefinition != null;
      case PomPackage.POM__MODULES:
        return modules != null;
      case PomPackage.POM__PROPERTY_INCLUSIONS:
        return propertyInclusions != null && !propertyInclusions.isEmpty();
      case PomPackage.POM__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case PomPackage.POM__DEPENDENCIES:
        return dependencies != null;
      case PomPackage.POM__SCM:
        return scm != null;
      case PomPackage.POM__BUILD_STEPS:
        return buildSteps != null && !buildSteps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //POMImpl
