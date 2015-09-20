/*
 * generated by Xtext
 */
package de.itemis.mpp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.itemis.mpp.pom.ArtifactDefinition;
import de.itemis.mpp.pom.Coordinates;
import de.itemis.mpp.pom.Dependencies;
import de.itemis.mpp.pom.Dependency;
import de.itemis.mpp.pom.DependencyGroup;
import de.itemis.mpp.pom.DependencyInclusion;
import de.itemis.mpp.pom.ExtendedCoordinates;
import de.itemis.mpp.pom.Modules;
import de.itemis.mpp.pom.POM;
import de.itemis.mpp.pom.POMImport;
import de.itemis.mpp.pom.ParentRef;
import de.itemis.mpp.pom.Plugin;
import de.itemis.mpp.pom.PluginConfiguration;
import de.itemis.mpp.pom.PluginConfigurationParameter;
import de.itemis.mpp.pom.PluginConfigurationParameterList;
import de.itemis.mpp.pom.PluginConfigurationParameterMap;
import de.itemis.mpp.pom.PluginConfigurationParameterMapEntry;
import de.itemis.mpp.pom.PluginConfigurationParameterProperties;
import de.itemis.mpp.pom.PluginConfigurationParameterPropertyEntry;
import de.itemis.mpp.pom.PluginExecution;
import de.itemis.mpp.pom.PluginInclusion;
import de.itemis.mpp.pom.PomPackage;
import de.itemis.mpp.pom.Property;
import de.itemis.mpp.pom.PropertyInclusion;
import de.itemis.mpp.pom.SCM;
import de.itemis.mpp.pom.UngroupedDependency;
import de.itemis.mpp.pom.Version;
import de.itemis.mpp.services.PomGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PomSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PomGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PomPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PomPackage.ARTIFACT_DEFINITION:
				sequence_ArtifactDefinition(context, (ArtifactDefinition) semanticObject); 
				return; 
			case PomPackage.COORDINATES:
				sequence_Coordinates(context, (Coordinates) semanticObject); 
				return; 
			case PomPackage.DEPENDENCIES:
				sequence_Dependencies(context, (Dependencies) semanticObject); 
				return; 
			case PomPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case PomPackage.DEPENDENCY_GROUP:
				sequence_DependencyGroup(context, (DependencyGroup) semanticObject); 
				return; 
			case PomPackage.DEPENDENCY_INCLUSION:
				sequence_DependencyInclusion(context, (DependencyInclusion) semanticObject); 
				return; 
			case PomPackage.EXTENDED_COORDINATES:
				sequence_ExtendedCoordinates(context, (ExtendedCoordinates) semanticObject); 
				return; 
			case PomPackage.MODULES:
				sequence_Modules(context, (Modules) semanticObject); 
				return; 
			case PomPackage.POM:
				sequence_POM(context, (POM) semanticObject); 
				return; 
			case PomPackage.POM_IMPORT:
				sequence_POMImport(context, (POMImport) semanticObject); 
				return; 
			case PomPackage.PARENT_REF:
				sequence_ParentRef(context, (ParentRef) semanticObject); 
				return; 
			case PomPackage.PLUGIN:
				sequence_Plugin(context, (Plugin) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION:
				sequence_PluginConfiguration(context, (PluginConfiguration) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER:
				sequence_PluginConfigurationParameter(context, (PluginConfigurationParameter) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_LIST:
				sequence_PluginConfigurationParameterList(context, (PluginConfigurationParameterList) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP:
				sequence_PluginConfigurationParameterMap(context, (PluginConfigurationParameterMap) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY:
				sequence_PluginConfigurationParameterMapEntry(context, (PluginConfigurationParameterMapEntry) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTIES:
				sequence_PluginConfigurationParameterProperties(context, (PluginConfigurationParameterProperties) semanticObject); 
				return; 
			case PomPackage.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY:
				sequence_PluginConfigurationParameterPropertyEntry(context, (PluginConfigurationParameterPropertyEntry) semanticObject); 
				return; 
			case PomPackage.PLUGIN_EXECUTION:
				sequence_PluginExecution(context, (PluginExecution) semanticObject); 
				return; 
			case PomPackage.PLUGIN_INCLUSION:
				sequence_PluginInclusion(context, (PluginInclusion) semanticObject); 
				return; 
			case PomPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case PomPackage.PROPERTY_INCLUSION:
				sequence_PropertyInclusion(context, (PropertyInclusion) semanticObject); 
				return; 
			case PomPackage.SCM:
				sequence_SCM(context, (SCM) semanticObject); 
				return; 
			case PomPackage.UNGROUPED_DEPENDENCY:
				sequence_UngroupedDependency(context, (UngroupedDependency) semanticObject); 
				return; 
			case PomPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         groupId=IDAndDot? 
	 *         artifactId=IDAndDash? 
	 *         version=Version? 
	 *         type=Text? 
	 *         artifactName=STRING? 
	 *         description=STRING?
	 *     )
	 */
	protected void sequence_ArtifactDefinition(EObject context, ArtifactDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (groupId=IDAndDot artifactId=IDAndDash version=Version)
	 */
	protected void sequence_Coordinates(EObject context, Coordinates semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.COORDINATES__GROUP_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.COORDINATES__GROUP_ID));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.COORDINATES__ARTIFACT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.COORDINATES__ARTIFACT_ID));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.COORDINATES__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.COORDINATES__VERSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0(), semanticObject.getGroupId());
		feeder.accept(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0(), semanticObject.getArtifactId());
		feeder.accept(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0(), semanticObject.getVersion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (includes+=DependencyInclusion | dependencyGroups+=DependencyGroup | ungroupedDependencies+=UngroupedDependency)+
	 */
	protected void sequence_Dependencies(EObject context, Dependencies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scope=DependencyScope dependecies+=Dependency+)
	 */
	protected void sequence_DependencyGroup(EObject context, DependencyGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pomRef=[POMImport|ID] scope=DependencyScope)
	 */
	protected void sequence_DependencyInclusion(EObject context, DependencyInclusion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.DEPENDENCY_INCLUSION__POM_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.DEPENDENCY_INCLUSION__POM_REF));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.DEPENDENCY_INCLUSION__SCOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.DEPENDENCY_INCLUSION__SCOPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportIDTerminalRuleCall_1_0_1(), semanticObject.getPomRef());
		feeder.accept(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0(), semanticObject.getScope());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='optional'? coordinates=ExtendedCoordinates)
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (groupId=IDAndDot artifactId=IDAndDash version=Version (type=IDAndDash classifier=Classifier?)?)
	 */
	protected void sequence_ExtendedCoordinates(EObject context, ExtendedCoordinates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=STRING names+=STRING*)
	 */
	protected void sequence_Modules(EObject context, Modules semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (coordinates=Coordinates name=ID)
	 */
	protected void sequence_POMImport(EObject context, POMImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.POM_IMPORT__COORDINATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.POM_IMPORT__COORDINATES));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.POM_IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.POM_IMPORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0(), semanticObject.getCoordinates());
		feeder.accept(grammarAccess.getPOMImportAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         imports+=POMImport* 
	 *         parent=ParentRef? 
	 *         artifactDefinition=ArtifactDefinition 
	 *         modules=Modules? 
	 *         propertyInclusions+=PropertyInclusion* 
	 *         properties+=Property* 
	 *         dependencies=Dependencies? 
	 *         scm=SCM? 
	 *         buildSteps+=BuildStep*
	 *     )
	 */
	protected void sequence_POM(EObject context, POM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (coordinates=Coordinates relativePath=STRING?)
	 */
	protected void sequence_ParentRef(EObject context, ParentRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID values+=STRING values+=STRING*)
	 */
	protected void sequence_PluginConfigurationParameterList(EObject context, PluginConfigurationParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID value=STRING)
	 */
	protected void sequence_PluginConfigurationParameterMapEntry(EObject context, PluginConfigurationParameterMapEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__KEY));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_MAP_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPluginConfigurationParameterMapEntryAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPluginConfigurationParameterMapEntryAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID entries+=PluginConfigurationParameterMapEntry+)
	 */
	protected void sequence_PluginConfigurationParameterMap(EObject context, PluginConfigurationParameterMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID entries+=PluginConfigurationParameterPropertyEntry+)
	 */
	protected void sequence_PluginConfigurationParameterProperties(EObject context, PluginConfigurationParameterProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID value=STRING)
	 */
	protected void sequence_PluginConfigurationParameterPropertyEntry(EObject context, PluginConfigurationParameterPropertyEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__KEY));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PLUGIN_CONFIGURATION_PARAMETER_PROPERTY_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID (value=STRING | children+=PluginConfigurationItem+)?)
	 */
	protected void sequence_PluginConfigurationParameter(EObject context, PluginConfigurationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     configurationItems+=PluginConfigurationItem+
	 */
	protected void sequence_PluginConfiguration(EObject context, PluginConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=IDAndDash? phase=Phase? goals+=IDAndDash goals+=IDAndDash* configuration=PluginConfiguration?) | default?='default')
	 */
	protected void sequence_PluginExecution(EObject context, PluginExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pomRef=[POMImport|ID] pluginCoordinates=Coordinates (executionId=IDAndDash | config?='config')?)
	 */
	protected void sequence_PluginInclusion(EObject context, PluginInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (coordinates=Coordinates configuration=PluginConfiguration? executions+=PluginExecution*)
	 */
	protected void sequence_Plugin(EObject context, Plugin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pomRef=[POMImport|ID]
	 */
	protected void sequence_PropertyInclusion(EObject context, PropertyInclusion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PROPERTY_INCLUSION__POM_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PROPERTY_INCLUSION__POM_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyInclusionAccess().getPomRefPOMImportIDTerminalRuleCall_1_0_1(), semanticObject.getPomRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PropertyName value=STRING)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, PomPackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PomPackage.Literals.PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (connection=STRING? developerConncetion=STRING url=STRING? tag=STRING?)
	 */
	protected void sequence_SCM(EObject context, SCM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scope=DependencyScope? dependency=Dependency)
	 */
	protected void sequence_UngroupedDependency(EObject context, UngroupedDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (major=Number (minor=Number incremental=Number?)? qualifier=Text?)
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}