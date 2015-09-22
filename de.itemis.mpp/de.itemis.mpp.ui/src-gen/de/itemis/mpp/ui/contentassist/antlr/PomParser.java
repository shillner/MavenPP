/*
 * generated by Xtext
 */
package de.itemis.mpp.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.itemis.mpp.services.PomGrammarAccess;

public class PomParser extends AbstractContentAssistParser {
	
	@Inject
	private PomGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.itemis.mpp.ui.contentassist.antlr.internal.InternalPomParser createParser() {
		de.itemis.mpp.ui.contentassist.antlr.internal.InternalPomParser result = new de.itemis.mpp.ui.contentassist.antlr.internal.InternalPomParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTextAccess().getAlternatives(), "rule__Text__Alternatives");
					put(grammarAccess.getPropertyNameAccess().getAlternatives(), "rule__PropertyName__Alternatives");
					put(grammarAccess.getIDOrPropteryRefAccess().getAlternatives(), "rule__IDOrPropteryRef__Alternatives");
					put(grammarAccess.getDependenciesAccess().getAlternatives_3(), "rule__Dependencies__Alternatives_3");
					put(grammarAccess.getPluginConfigurationItemAccess().getAlternatives(), "rule__PluginConfigurationItem__Alternatives");
					put(grammarAccess.getPluginConfigurationParameterAccess().getAlternatives_1(), "rule__PluginConfigurationParameter__Alternatives_1");
					put(grammarAccess.getPluginExecutionAccess().getAlternatives_1(), "rule__PluginExecution__Alternatives_1");
					put(grammarAccess.getPluginInclusionAccess().getAlternatives_4_1(), "rule__PluginInclusion__Alternatives_4_1");
					put(grammarAccess.getBuildStepAccess().getAlternatives(), "rule__BuildStep__Alternatives");
					put(grammarAccess.getDependencyScopeAccess().getAlternatives(), "rule__DependencyScope__Alternatives");
					put(grammarAccess.getPhaseAccess().getAlternatives(), "rule__Phase__Alternatives");
					put(grammarAccess.getPOMAccess().getGroup(), "rule__POM__Group__0");
					put(grammarAccess.getParentRefAccess().getGroup(), "rule__ParentRef__Group__0");
					put(grammarAccess.getModulesAccess().getGroup(), "rule__Modules__Group__0");
					put(grammarAccess.getModulesAccess().getGroup_2(), "rule__Modules__Group_2__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup(), "rule__ArtifactDefinition__Group__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_1(), "rule__ArtifactDefinition__Group_1__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_2(), "rule__ArtifactDefinition__Group_2__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_3(), "rule__ArtifactDefinition__Group_3__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_4(), "rule__ArtifactDefinition__Group_4__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_5_0(), "rule__ArtifactDefinition__Group_5_0__0");
					put(grammarAccess.getArtifactDefinitionAccess().getGroup_5_1(), "rule__ArtifactDefinition__Group_5_1__0");
					put(grammarAccess.getIDAndDotAccess().getGroup(), "rule__IDAndDot__Group__0");
					put(grammarAccess.getIDAndDotAccess().getGroup_1(), "rule__IDAndDot__Group_1__0");
					put(grammarAccess.getIDAndDashAccess().getGroup(), "rule__IDAndDash__Group__0");
					put(grammarAccess.getIDAndDashAccess().getGroup_1(), "rule__IDAndDash__Group_1__0");
					put(grammarAccess.getIDOrPropteryRefAccess().getGroup_1(), "rule__IDOrPropteryRef__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_2(), "rule__Version__Group_1_2__0");
					put(grammarAccess.getVersionAccess().getGroup_2(), "rule__Version__Group_2__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyInclusionAccess().getGroup(), "rule__PropertyInclusion__Group__0");
					put(grammarAccess.getDependenciesAccess().getGroup(), "rule__Dependencies__Group__0");
					put(grammarAccess.getDependencyGroupAccess().getGroup(), "rule__DependencyGroup__Group__0");
					put(grammarAccess.getUngroupedDependencyAccess().getGroup(), "rule__UngroupedDependency__Group__0");
					put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
					put(grammarAccess.getDependencyInclusionAccess().getGroup(), "rule__DependencyInclusion__Group__0");
					put(grammarAccess.getSCMAccess().getGroup_0(), "rule__SCM__Group_0__0");
					put(grammarAccess.getSCMAccess().getGroup_0_2(), "rule__SCM__Group_0_2__0");
					put(grammarAccess.getSCMAccess().getGroup_1(), "rule__SCM__Group_1__0");
					put(grammarAccess.getSCMAccess().getGroup_2(), "rule__SCM__Group_2__0");
					put(grammarAccess.getSCMAccess().getGroup_3(), "rule__SCM__Group_3__0");
					put(grammarAccess.getSCMAccess().getGroup_3_0(), "rule__SCM__Group_3_0__0");
					put(grammarAccess.getPluginAccess().getGroup(), "rule__Plugin__Group__0");
					put(grammarAccess.getPluginAccess().getGroup_3_0(), "rule__Plugin__Group_3_0__0");
					put(grammarAccess.getPluginConfigurationParameterAccess().getGroup(), "rule__PluginConfigurationParameter__Group__0");
					put(grammarAccess.getPluginConfigurationParameterAccess().getGroup_1_1(), "rule__PluginConfigurationParameter__Group_1_1__0");
					put(grammarAccess.getPluginConfigurationParameterListAccess().getGroup(), "rule__PluginConfigurationParameterList__Group__0");
					put(grammarAccess.getPluginConfigurationParameterListAccess().getGroup_3(), "rule__PluginConfigurationParameterList__Group_3__0");
					put(grammarAccess.getPluginConfigurationParameterMapAccess().getGroup(), "rule__PluginConfigurationParameterMap__Group__0");
					put(grammarAccess.getPluginConfigurationParameterMapEntryAccess().getGroup(), "rule__PluginConfigurationParameterMapEntry__Group__0");
					put(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getGroup(), "rule__PluginConfigurationParameterProperties__Group__0");
					put(grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getGroup(), "rule__PluginConfigurationParameterPropertyEntry__Group__0");
					put(grammarAccess.getPluginExecutionAccess().getGroup(), "rule__PluginExecution__Group__0");
					put(grammarAccess.getPluginExecutionAccess().getGroup_1_0(), "rule__PluginExecution__Group_1_0__0");
					put(grammarAccess.getPluginExecutionAccess().getGroup_1_0_1(), "rule__PluginExecution__Group_1_0_1__0");
					put(grammarAccess.getPluginExecutionAccess().getGroup_1_0_4(), "rule__PluginExecution__Group_1_0_4__0");
					put(grammarAccess.getPluginExecutionAccess().getGroup_1_0_5(), "rule__PluginExecution__Group_1_0_5__0");
					put(grammarAccess.getPluginInclusionAccess().getGroup(), "rule__PluginInclusion__Group__0");
					put(grammarAccess.getPluginInclusionAccess().getGroup_4(), "rule__PluginInclusion__Group_4__0");
					put(grammarAccess.getCoordinatesAccess().getGroup(), "rule__Coordinates__Group__0");
					put(grammarAccess.getExtendedCoordinatesAccess().getGroup(), "rule__ExtendedCoordinates__Group__0");
					put(grammarAccess.getExtendedCoordinatesAccess().getGroup_5(), "rule__ExtendedCoordinates__Group_5__0");
					put(grammarAccess.getExtendedCoordinatesAccess().getGroup_5_2(), "rule__ExtendedCoordinates__Group_5_2__0");
					put(grammarAccess.getPOMImportAccess().getGroup(), "rule__POMImport__Group__0");
					put(grammarAccess.getPOMAccess().getImportsAssignment_0(), "rule__POM__ImportsAssignment_0");
					put(grammarAccess.getPOMAccess().getParentAssignment_1(), "rule__POM__ParentAssignment_1");
					put(grammarAccess.getPOMAccess().getArtifactDefinitionAssignment_2(), "rule__POM__ArtifactDefinitionAssignment_2");
					put(grammarAccess.getPOMAccess().getModulesAssignment_3(), "rule__POM__ModulesAssignment_3");
					put(grammarAccess.getPOMAccess().getPropertyInclusionsAssignment_4_0(), "rule__POM__PropertyInclusionsAssignment_4_0");
					put(grammarAccess.getPOMAccess().getPropertiesAssignment_4_1(), "rule__POM__PropertiesAssignment_4_1");
					put(grammarAccess.getPOMAccess().getDependenciesAssignment_4_2(), "rule__POM__DependenciesAssignment_4_2");
					put(grammarAccess.getPOMAccess().getScmAssignment_4_3(), "rule__POM__ScmAssignment_4_3");
					put(grammarAccess.getPOMAccess().getBuildStepsAssignment_5(), "rule__POM__BuildStepsAssignment_5");
					put(grammarAccess.getParentRefAccess().getCoordinatesAssignment_1(), "rule__ParentRef__CoordinatesAssignment_1");
					put(grammarAccess.getParentRefAccess().getRelativePathAssignment_2(), "rule__ParentRef__RelativePathAssignment_2");
					put(grammarAccess.getModulesAccess().getNamesAssignment_1(), "rule__Modules__NamesAssignment_1");
					put(grammarAccess.getModulesAccess().getNamesAssignment_2_1(), "rule__Modules__NamesAssignment_2_1");
					put(grammarAccess.getArtifactDefinitionAccess().getGroupIdAssignment_1_1(), "rule__ArtifactDefinition__GroupIdAssignment_1_1");
					put(grammarAccess.getArtifactDefinitionAccess().getArtifactIdAssignment_2_1(), "rule__ArtifactDefinition__ArtifactIdAssignment_2_1");
					put(grammarAccess.getArtifactDefinitionAccess().getVersionAssignment_3_1(), "rule__ArtifactDefinition__VersionAssignment_3_1");
					put(grammarAccess.getArtifactDefinitionAccess().getTypeAssignment_4_1(), "rule__ArtifactDefinition__TypeAssignment_4_1");
					put(grammarAccess.getArtifactDefinitionAccess().getArtifactNameAssignment_5_0_1(), "rule__ArtifactDefinition__ArtifactNameAssignment_5_0_1");
					put(grammarAccess.getArtifactDefinitionAccess().getDescriptionAssignment_5_1_1(), "rule__ArtifactDefinition__DescriptionAssignment_5_1_1");
					put(grammarAccess.getVersionAccess().getMajorAssignment_0(), "rule__Version__MajorAssignment_0");
					put(grammarAccess.getVersionAccess().getMinorAssignment_1_1(), "rule__Version__MinorAssignment_1_1");
					put(grammarAccess.getVersionAccess().getIncrementalAssignment_1_2_1(), "rule__Version__IncrementalAssignment_1_2_1");
					put(grammarAccess.getVersionAccess().getQualifierAssignment_2_1(), "rule__Version__QualifierAssignment_2_1");
					put(grammarAccess.getPropertyAccess().getNameAssignment_1(), "rule__Property__NameAssignment_1");
					put(grammarAccess.getPropertyAccess().getValueAssignment_3(), "rule__Property__ValueAssignment_3");
					put(grammarAccess.getPropertyInclusionAccess().getPomRefAssignment_1(), "rule__PropertyInclusion__PomRefAssignment_1");
					put(grammarAccess.getDependenciesAccess().getIncludesAssignment_3_0(), "rule__Dependencies__IncludesAssignment_3_0");
					put(grammarAccess.getDependenciesAccess().getDependencyGroupsAssignment_3_1(), "rule__Dependencies__DependencyGroupsAssignment_3_1");
					put(grammarAccess.getDependenciesAccess().getUngroupedDependenciesAssignment_3_2(), "rule__Dependencies__UngroupedDependenciesAssignment_3_2");
					put(grammarAccess.getDependencyGroupAccess().getScopeAssignment_0(), "rule__DependencyGroup__ScopeAssignment_0");
					put(grammarAccess.getDependencyGroupAccess().getDependeciesAssignment_2(), "rule__DependencyGroup__DependeciesAssignment_2");
					put(grammarAccess.getUngroupedDependencyAccess().getScopeAssignment_0(), "rule__UngroupedDependency__ScopeAssignment_0");
					put(grammarAccess.getUngroupedDependencyAccess().getDependencyAssignment_1(), "rule__UngroupedDependency__DependencyAssignment_1");
					put(grammarAccess.getDependencyAccess().getOptionalAssignment_0(), "rule__Dependency__OptionalAssignment_0");
					put(grammarAccess.getDependencyAccess().getCoordinatesAssignment_1(), "rule__Dependency__CoordinatesAssignment_1");
					put(grammarAccess.getDependencyInclusionAccess().getPomRefAssignment_1(), "rule__DependencyInclusion__PomRefAssignment_1");
					put(grammarAccess.getDependencyInclusionAccess().getScopeAssignment_3(), "rule__DependencyInclusion__ScopeAssignment_3");
					put(grammarAccess.getSCMAccess().getConnectionAssignment_0_2_1(), "rule__SCM__ConnectionAssignment_0_2_1");
					put(grammarAccess.getSCMAccess().getDeveloperConncetionAssignment_1_1(), "rule__SCM__DeveloperConncetionAssignment_1_1");
					put(grammarAccess.getSCMAccess().getUrlAssignment_2_1(), "rule__SCM__UrlAssignment_2_1");
					put(grammarAccess.getSCMAccess().getTagAssignment_3_0_1(), "rule__SCM__TagAssignment_3_0_1");
					put(grammarAccess.getPluginAccess().getCoordinatesAssignment_1(), "rule__Plugin__CoordinatesAssignment_1");
					put(grammarAccess.getPluginAccess().getConfigurationAssignment_3_0_2(), "rule__Plugin__ConfigurationAssignment_3_0_2");
					put(grammarAccess.getPluginAccess().getExecutionsAssignment_3_1(), "rule__Plugin__ExecutionsAssignment_3_1");
					put(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsAssignment(), "rule__PluginConfiguration__ConfigurationItemsAssignment");
					put(grammarAccess.getPluginConfigurationParameterAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameter__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterAccess().getValueAssignment_1_0(), "rule__PluginConfigurationParameter__ValueAssignment_1_0");
					put(grammarAccess.getPluginConfigurationParameterAccess().getChildrenAssignment_1_1_1(), "rule__PluginConfigurationParameter__ChildrenAssignment_1_1_1");
					put(grammarAccess.getPluginConfigurationParameterListAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameterList__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterListAccess().getValuesAssignment_2(), "rule__PluginConfigurationParameterList__ValuesAssignment_2");
					put(grammarAccess.getPluginConfigurationParameterListAccess().getValuesAssignment_3_1(), "rule__PluginConfigurationParameterList__ValuesAssignment_3_1");
					put(grammarAccess.getPluginConfigurationParameterMapAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameterMap__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesAssignment_2(), "rule__PluginConfigurationParameterMap__EntriesAssignment_2");
					put(grammarAccess.getPluginConfigurationParameterMapEntryAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameterMapEntry__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterMapEntryAccess().getValueAssignment_2(), "rule__PluginConfigurationParameterMapEntry__ValueAssignment_2");
					put(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameterProperties__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesAssignment_2(), "rule__PluginConfigurationParameterProperties__EntriesAssignment_2");
					put(grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getKeyAssignment_0(), "rule__PluginConfigurationParameterPropertyEntry__KeyAssignment_0");
					put(grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getValueAssignment_2(), "rule__PluginConfigurationParameterPropertyEntry__ValueAssignment_2");
					put(grammarAccess.getPluginExecutionAccess().getIdAssignment_1_0_0(), "rule__PluginExecution__IdAssignment_1_0_0");
					put(grammarAccess.getPluginExecutionAccess().getPhaseAssignment_1_0_1_1(), "rule__PluginExecution__PhaseAssignment_1_0_1_1");
					put(grammarAccess.getPluginExecutionAccess().getGoalsAssignment_1_0_3(), "rule__PluginExecution__GoalsAssignment_1_0_3");
					put(grammarAccess.getPluginExecutionAccess().getGoalsAssignment_1_0_4_1(), "rule__PluginExecution__GoalsAssignment_1_0_4_1");
					put(grammarAccess.getPluginExecutionAccess().getConfigurationAssignment_1_0_5_1(), "rule__PluginExecution__ConfigurationAssignment_1_0_5_1");
					put(grammarAccess.getPluginExecutionAccess().getDefaultAssignment_1_1(), "rule__PluginExecution__DefaultAssignment_1_1");
					put(grammarAccess.getPluginInclusionAccess().getPomRefAssignment_1(), "rule__PluginInclusion__PomRefAssignment_1");
					put(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesAssignment_3(), "rule__PluginInclusion__PluginCoordinatesAssignment_3");
					put(grammarAccess.getPluginInclusionAccess().getExecutionIdAssignment_4_1_0(), "rule__PluginInclusion__ExecutionIdAssignment_4_1_0");
					put(grammarAccess.getPluginInclusionAccess().getConfigAssignment_4_1_1(), "rule__PluginInclusion__ConfigAssignment_4_1_1");
					put(grammarAccess.getCoordinatesAccess().getGroupIdAssignment_0(), "rule__Coordinates__GroupIdAssignment_0");
					put(grammarAccess.getCoordinatesAccess().getArtifactIdAssignment_2(), "rule__Coordinates__ArtifactIdAssignment_2");
					put(grammarAccess.getCoordinatesAccess().getVersionAssignment_4(), "rule__Coordinates__VersionAssignment_4");
					put(grammarAccess.getExtendedCoordinatesAccess().getGroupIdAssignment_0(), "rule__ExtendedCoordinates__GroupIdAssignment_0");
					put(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdAssignment_2(), "rule__ExtendedCoordinates__ArtifactIdAssignment_2");
					put(grammarAccess.getExtendedCoordinatesAccess().getVersionAssignment_4(), "rule__ExtendedCoordinates__VersionAssignment_4");
					put(grammarAccess.getExtendedCoordinatesAccess().getTypeAssignment_5_1(), "rule__ExtendedCoordinates__TypeAssignment_5_1");
					put(grammarAccess.getExtendedCoordinatesAccess().getClassifierAssignment_5_2_1(), "rule__ExtendedCoordinates__ClassifierAssignment_5_2_1");
					put(grammarAccess.getPOMImportAccess().getCoordinatesAssignment_1(), "rule__POMImport__CoordinatesAssignment_1");
					put(grammarAccess.getPOMImportAccess().getNameAssignment_3(), "rule__POMImport__NameAssignment_3");
					put(grammarAccess.getPOMAccess().getUnorderedGroup_4(), "rule__POM__UnorderedGroup_4");
					put(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), "rule__ArtifactDefinition__UnorderedGroup_5");
					put(grammarAccess.getSCMAccess().getUnorderedGroup(), "rule__SCM__UnorderedGroup");
					put(grammarAccess.getPluginAccess().getUnorderedGroup_3(), "rule__Plugin__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.itemis.mpp.ui.contentassist.antlr.internal.InternalPomParser typedParser = (de.itemis.mpp.ui.contentassist.antlr.internal.InternalPomParser) parser;
			typedParser.entryRulePOM();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
