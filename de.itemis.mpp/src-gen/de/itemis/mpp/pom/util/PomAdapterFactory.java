/**
 */
package de.itemis.mpp.pom.util;

import de.itemis.mpp.pom.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.itemis.mpp.pom.PomPackage
 * @generated
 */
public class PomAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PomPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PomAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PomPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PomSwitch<Adapter> modelSwitch =
    new PomSwitch<Adapter>()
    {
      @Override
      public Adapter casePOM(POM object)
      {
        return createPOMAdapter();
      }
      @Override
      public Adapter caseParentRef(ParentRef object)
      {
        return createParentRefAdapter();
      }
      @Override
      public Adapter caseModules(Modules object)
      {
        return createModulesAdapter();
      }
      @Override
      public Adapter caseArtifactDefinition(ArtifactDefinition object)
      {
        return createArtifactDefinitionAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropertyInclusion(PropertyInclusion object)
      {
        return createPropertyInclusionAdapter();
      }
      @Override
      public Adapter caseDependencies(Dependencies object)
      {
        return createDependenciesAdapter();
      }
      @Override
      public Adapter caseDependencyGroup(DependencyGroup object)
      {
        return createDependencyGroupAdapter();
      }
      @Override
      public Adapter caseUngroupedDependency(UngroupedDependency object)
      {
        return createUngroupedDependencyAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseDependencyInclusion(DependencyInclusion object)
      {
        return createDependencyInclusionAdapter();
      }
      @Override
      public Adapter caseSCM(SCM object)
      {
        return createSCMAdapter();
      }
      @Override
      public Adapter casePlugin(Plugin object)
      {
        return createPluginAdapter();
      }
      @Override
      public Adapter casePluginConfiguration(PluginConfiguration object)
      {
        return createPluginConfigurationAdapter();
      }
      @Override
      public Adapter casePluginConfigurationItem(PluginConfigurationItem object)
      {
        return createPluginConfigurationItemAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameter(PluginConfigurationParameter object)
      {
        return createPluginConfigurationParameterAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameterList(PluginConfigurationParameterList object)
      {
        return createPluginConfigurationParameterListAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameterMap(PluginConfigurationParameterMap object)
      {
        return createPluginConfigurationParameterMapAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameterMapEntry(PluginConfigurationParameterMapEntry object)
      {
        return createPluginConfigurationParameterMapEntryAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameterProperties(PluginConfigurationParameterProperties object)
      {
        return createPluginConfigurationParameterPropertiesAdapter();
      }
      @Override
      public Adapter casePluginConfigurationParameterPropertyEntry(PluginConfigurationParameterPropertyEntry object)
      {
        return createPluginConfigurationParameterPropertyEntryAdapter();
      }
      @Override
      public Adapter casePluginExecution(PluginExecution object)
      {
        return createPluginExecutionAdapter();
      }
      @Override
      public Adapter casePluginInclusion(PluginInclusion object)
      {
        return createPluginInclusionAdapter();
      }
      @Override
      public Adapter caseBuildStep(BuildStep object)
      {
        return createBuildStepAdapter();
      }
      @Override
      public Adapter caseCoordinates(Coordinates object)
      {
        return createCoordinatesAdapter();
      }
      @Override
      public Adapter caseExtendedCoordinates(ExtendedCoordinates object)
      {
        return createExtendedCoordinatesAdapter();
      }
      @Override
      public Adapter casePOMImport(POMImport object)
      {
        return createPOMImportAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.POM <em>POM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.POM
   * @generated
   */
  public Adapter createPOMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.ParentRef <em>Parent Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.ParentRef
   * @generated
   */
  public Adapter createParentRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Modules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Modules
   * @generated
   */
  public Adapter createModulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.ArtifactDefinition <em>Artifact Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.ArtifactDefinition
   * @generated
   */
  public Adapter createArtifactDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PropertyInclusion <em>Property Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PropertyInclusion
   * @generated
   */
  public Adapter createPropertyInclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Dependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Dependencies
   * @generated
   */
  public Adapter createDependenciesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.DependencyGroup <em>Dependency Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.DependencyGroup
   * @generated
   */
  public Adapter createDependencyGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.UngroupedDependency <em>Ungrouped Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.UngroupedDependency
   * @generated
   */
  public Adapter createUngroupedDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.DependencyInclusion <em>Dependency Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.DependencyInclusion
   * @generated
   */
  public Adapter createDependencyInclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.SCM <em>SCM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.SCM
   * @generated
   */
  public Adapter createSCMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Plugin <em>Plugin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Plugin
   * @generated
   */
  public Adapter createPluginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfiguration <em>Plugin Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfiguration
   * @generated
   */
  public Adapter createPluginConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationItem <em>Plugin Configuration Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationItem
   * @generated
   */
  public Adapter createPluginConfigurationItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameter <em>Plugin Configuration Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameter
   * @generated
   */
  public Adapter createPluginConfigurationParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameterList <em>Plugin Configuration Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterList
   * @generated
   */
  public Adapter createPluginConfigurationParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameterMap <em>Plugin Configuration Parameter Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMap
   * @generated
   */
  public Adapter createPluginConfigurationParameterMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameterMapEntry <em>Plugin Configuration Parameter Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterMapEntry
   * @generated
   */
  public Adapter createPluginConfigurationParameterMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameterProperties <em>Plugin Configuration Parameter Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterProperties
   * @generated
   */
  public Adapter createPluginConfigurationParameterPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry <em>Plugin Configuration Parameter Property Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry
   * @generated
   */
  public Adapter createPluginConfigurationParameterPropertyEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginExecution <em>Plugin Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginExecution
   * @generated
   */
  public Adapter createPluginExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.PluginInclusion <em>Plugin Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.PluginInclusion
   * @generated
   */
  public Adapter createPluginInclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.BuildStep <em>Build Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.BuildStep
   * @generated
   */
  public Adapter createBuildStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.Coordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.Coordinates
   * @generated
   */
  public Adapter createCoordinatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.ExtendedCoordinates <em>Extended Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.ExtendedCoordinates
   * @generated
   */
  public Adapter createExtendedCoordinatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.itemis.mpp.pom.POMImport <em>POM Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.itemis.mpp.pom.POMImport
   * @generated
   */
  public Adapter createPOMImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PomAdapterFactory
