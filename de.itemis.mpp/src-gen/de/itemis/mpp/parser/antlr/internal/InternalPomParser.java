package de.itemis.mpp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.itemis.mpp.services.PomGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPomParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'parent'", "'modules'", "','", "'group'", "'artifact'", "'version'", "'type'", "'name'", "'description'", "'-'", "'.'", "'_'", "'${'", "'}'", "'test'", "'exec'", "'clean'", "'plugin'", "'compile'", "'property'", "'='", "'include'", "'properties'", "'dependencies'", "'{'", "'optional'", "'scm'", "'con'", "'dev'", "'url'", "'tag'", "'config'", "'['", "']'", "'->'", "'in'", "'phase'", "'with'", "'goals'", "'default'", "':'", "'import'", "'as'", "'repository'", "'plugin-repository'", "'at'", "'layout'", "'do not'", "'fetch'", "'releases'", "'snapshots'", "'update'", "'interval'", "'checksumPolicy'", "'provided'", "'runtime'", "'system'", "'pre-clean'", "'post-clean'", "'validate'", "'initialize'", "'generate-sources'", "'process-sources'", "'generate-resources'", "'process-resources'", "'process-classes'", "'generate-test-sources'", "'process-test-sources'", "'generate-test-resources'", "'process-test-resources'", "'test-compile'", "'process-test-classes'", "'prepare-package'", "'package'", "'pre-integration-test'", "'integration-test'", "'post-integration-test'", "'verify'", "'install'", "'deploy'", "'pre-site'", "'site'", "'post-site'", "'site-deploy'", "'daily'", "'always'", "'never'", "'ignore'", "'warn'", "'fail'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalPomParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPomParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPomParser.tokenNames; }
    public String getGrammarFileName() { return "../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g"; }



     	private PomGrammarAccess grammarAccess;
     	
        public InternalPomParser(TokenStream input, PomGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "POM";	
       	}
       	
       	@Override
       	protected PomGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePOM"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:68:1: entryRulePOM returns [EObject current=null] : iv_rulePOM= rulePOM EOF ;
    public final EObject entryRulePOM() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:69:2: (iv_rulePOM= rulePOM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:70:2: iv_rulePOM= rulePOM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPOMRule()); 
            }
            pushFollow(FOLLOW_rulePOM_in_entryRulePOM75);
            iv_rulePOM=rulePOM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePOM; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePOM85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOM"


    // $ANTLR start "rulePOM"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:77:1: rulePOM returns [EObject current=null] : ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) ) ( (lv_buildSteps_10_0= ruleBuildStep ) )* ) ;
    public final EObject rulePOM() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_parent_1_0 = null;

        EObject lv_artifactDefinition_2_0 = null;

        EObject lv_modules_3_0 = null;

        EObject lv_propertyInclusions_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_dependencies_7_0 = null;

        EObject lv_scm_8_0 = null;

        EObject lv_repositories_9_0 = null;

        EObject lv_buildSteps_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:80:28: ( ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) ) ( (lv_buildSteps_10_0= ruleBuildStep ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) ) ( (lv_buildSteps_10_0= ruleBuildStep ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) ) ( (lv_buildSteps_10_0= ruleBuildStep ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) ) ( (lv_buildSteps_10_0= ruleBuildStep ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:82:1: (lv_imports_0_0= rulePOMImport )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:82:1: (lv_imports_0_0= rulePOMImport )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:83:3: lv_imports_0_0= rulePOMImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getImportsPOMImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePOMImport_in_rulePOM131);
            	    lv_imports_0_0=rulePOMImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"POMImport");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:99:3: ( (lv_parent_1_0= ruleParentRef ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:100:1: (lv_parent_1_0= ruleParentRef )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:100:1: (lv_parent_1_0= ruleParentRef )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:101:3: lv_parent_1_0= ruleParentRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPOMAccess().getParentParentRefParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParentRef_in_rulePOM153);
                    lv_parent_1_0=ruleParentRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPOMRule());
                      	        }
                             		set(
                             			current, 
                             			"parent",
                              		lv_parent_1_0, 
                              		"ParentRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:117:3: ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:118:1: (lv_artifactDefinition_2_0= ruleArtifactDefinition )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:118:1: (lv_artifactDefinition_2_0= ruleArtifactDefinition )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:119:3: lv_artifactDefinition_2_0= ruleArtifactDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPOMAccess().getArtifactDefinitionArtifactDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArtifactDefinition_in_rulePOM175);
            lv_artifactDefinition_2_0=ruleArtifactDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPOMRule());
              	        }
                     		set(
                     			current, 
                     			"artifactDefinition",
                      		lv_artifactDefinition_2_0, 
                      		"ArtifactDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:135:2: ( (lv_modules_3_0= ruleModules ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:136:1: (lv_modules_3_0= ruleModules )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:136:1: (lv_modules_3_0= ruleModules )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:137:3: lv_modules_3_0= ruleModules
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPOMAccess().getModulesModulesParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModules_in_rulePOM196);
                    lv_modules_3_0=ruleModules();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPOMRule());
                      	        }
                             		set(
                             			current, 
                             			"modules",
                              		lv_modules_3_0, 
                              		"Modules");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:153:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:156:2: ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPOMAccess().getUnorderedGroup_4());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:159:2: ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=6;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:163:5: {...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:163:100: ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:164:6: ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:6: ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==32) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:7: {...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:16: ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_propertyInclusions_5_0= rulePropertyInclusion )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_propertyInclusions_5_0= rulePropertyInclusion )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:169:3: lv_propertyInclusions_5_0= rulePropertyInclusion
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPOMAccess().getPropertyInclusionsPropertyInclusionParserRuleCall_4_0_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_rulePropertyInclusion_in_rulePOM263);
            	    	    lv_propertyInclusions_5_0=rulePropertyInclusion();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"propertyInclusions",
            	    	              		lv_propertyInclusions_5_0, 
            	    	              		"PropertyInclusion");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:192:4: ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:192:4: ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:193:5: {...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:193:100: ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:194:6: ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:6: ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==30) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:7: {...}? => ( (lv_properties_6_0= ruleProperty ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:16: ( (lv_properties_6_0= ruleProperty ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_properties_6_0= ruleProperty )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_properties_6_0= ruleProperty )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:199:3: lv_properties_6_0= ruleProperty
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPOMAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleProperty_in_rulePOM339);
            	    	    lv_properties_6_0=ruleProperty();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"properties",
            	    	              		lv_properties_6_0, 
            	    	              		"Property");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:222:4: ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:222:4: ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:223:5: {...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:223:100: ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:224:6: ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:6: ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:7: {...}? => ( (lv_dependencies_7_0= ruleDependencies ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:16: ( (lv_dependencies_7_0= ruleDependencies ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_dependencies_7_0= ruleDependencies )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_dependencies_7_0= ruleDependencies )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:229:3: lv_dependencies_7_0= ruleDependencies
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getDependenciesDependenciesParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencies_in_rulePOM415);
            	    lv_dependencies_7_0=ruleDependencies();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"dependencies",
            	              		lv_dependencies_7_0, 
            	              		"Dependencies");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:252:4: ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:252:4: ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:253:5: {...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:253:100: ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:254:6: ({...}? => ( (lv_scm_8_0= ruleSCM ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:6: ({...}? => ( (lv_scm_8_0= ruleSCM ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:7: {...}? => ( (lv_scm_8_0= ruleSCM ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:16: ( (lv_scm_8_0= ruleSCM ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_scm_8_0= ruleSCM )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_scm_8_0= ruleSCM )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:259:3: lv_scm_8_0= ruleSCM
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getScmSCMParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSCM_in_rulePOM490);
            	    lv_scm_8_0=ruleSCM();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"scm",
            	              		lv_scm_8_0, 
            	              		"SCM");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:282:4: ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:282:4: ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:283:5: {...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:283:100: ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:284:6: ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 4);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:287:6: ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==54) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==55) ) {
            	            int LA6_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:287:7: {...}? => ( (lv_repositories_9_0= ruleRepository ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:287:16: ( (lv_repositories_9_0= ruleRepository ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:288:1: (lv_repositories_9_0= ruleRepository )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:288:1: (lv_repositories_9_0= ruleRepository )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:289:3: lv_repositories_9_0= ruleRepository
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPOMAccess().getRepositoriesRepositoryParserRuleCall_4_4_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleRepository_in_rulePOM565);
            	    	    lv_repositories_9_0=ruleRepository();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"repositories",
            	    	              		lv_repositories_9_0, 
            	    	              		"Repository");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:319:2: ( (lv_buildSteps_10_0= ruleBuildStep ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:320:1: (lv_buildSteps_10_0= ruleBuildStep )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:320:1: (lv_buildSteps_10_0= ruleBuildStep )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:321:3: lv_buildSteps_10_0= ruleBuildStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getBuildStepsBuildStepParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBuildStep_in_rulePOM627);
            	    lv_buildSteps_10_0=ruleBuildStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"buildSteps",
            	              		lv_buildSteps_10_0, 
            	              		"BuildStep");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOM"


    // $ANTLR start "entryRuleParentRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:345:1: entryRuleParentRef returns [EObject current=null] : iv_ruleParentRef= ruleParentRef EOF ;
    public final EObject entryRuleParentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:346:2: (iv_ruleParentRef= ruleParentRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:347:2: iv_ruleParentRef= ruleParentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentRefRule()); 
            }
            pushFollow(FOLLOW_ruleParentRef_in_entryRuleParentRef664);
            iv_ruleParentRef=ruleParentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentRef674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentRef"


    // $ANTLR start "ruleParentRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:354:1: ruleParentRef returns [EObject current=null] : (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleParentRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_relativePath_2_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:357:28: ( (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:358:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:358:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:358:3: otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleParentRef711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParentRefAccess().getParentKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:362:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:363:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:363:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:364:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParentRefAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_ruleParentRef732);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParentRefRule());
              	        }
                     		set(
                     			current, 
                     			"coordinates",
                      		lv_coordinates_1_0, 
                      		"Coordinates");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:380:2: ( (lv_relativePath_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:381:1: (lv_relativePath_2_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:381:1: (lv_relativePath_2_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:382:3: lv_relativePath_2_0= RULE_STRING
                    {
                    lv_relativePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParentRef749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relativePath_2_0, grammarAccess.getParentRefAccess().getRelativePathSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParentRefRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"relativePath",
                              		lv_relativePath_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParentRef"


    // $ANTLR start "entryRuleModules"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:406:1: entryRuleModules returns [EObject current=null] : iv_ruleModules= ruleModules EOF ;
    public final EObject entryRuleModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModules = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:407:2: (iv_ruleModules= ruleModules EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:408:2: iv_ruleModules= ruleModules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulesRule()); 
            }
            pushFollow(FOLLOW_ruleModules_in_entryRuleModules791);
            iv_ruleModules=ruleModules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModules; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModules801); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModules"


    // $ANTLR start "ruleModules"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:415:1: ruleModules returns [EObject current=null] : (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:418:28: ( (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:419:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:419:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:419:3: otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModules838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModulesAccess().getModulesKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:423:1: ( (lv_names_1_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:424:1: (lv_names_1_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:424:1: (lv_names_1_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:425:3: lv_names_1_0= RULE_STRING
            {
            lv_names_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_names_1_0, grammarAccess.getModulesAccess().getNamesSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModulesRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"names",
                      		lv_names_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:441:2: (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:441:4: otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModules873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getModulesAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:445:1: ( (lv_names_3_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:446:1: (lv_names_3_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:446:1: (lv_names_3_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:447:3: lv_names_3_0= RULE_STRING
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules890); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_names_3_0, grammarAccess.getModulesAccess().getNamesSTRINGTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModulesRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"names",
            	              		lv_names_3_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModules"


    // $ANTLR start "entryRuleArtifactDefinition"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:471:1: entryRuleArtifactDefinition returns [EObject current=null] : iv_ruleArtifactDefinition= ruleArtifactDefinition EOF ;
    public final EObject entryRuleArtifactDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactDefinition = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:472:2: (iv_ruleArtifactDefinition= ruleArtifactDefinition EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:473:2: iv_ruleArtifactDefinition= ruleArtifactDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArtifactDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition933);
            iv_ruleArtifactDefinition=ruleArtifactDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArtifactDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifactDefinition943); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifactDefinition"


    // $ANTLR start "ruleArtifactDefinition"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:480:1: ruleArtifactDefinition returns [EObject current=null] : ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleArtifactDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token lv_artifactName_11_0=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        AntlrDatatypeRuleToken lv_groupId_2_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_4_0 = null;

        EObject lv_version_6_0 = null;

        AntlrDatatypeRuleToken lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:483:28: ( ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:484:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:484:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:484:2: () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:484:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArtifactDefinitionAccess().getArtifactDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:490:2: (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:490:4: otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArtifactDefinition990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArtifactDefinitionAccess().getGroupKeyword_1_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:494:1: ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:495:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:495:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:496:3: lv_groupId_2_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition1011);
                    lv_groupId_2_0=ruleIDAndSpecialCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"groupId",
                              		lv_groupId_2_0, 
                              		"IDAndSpecialCharacters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:512:4: (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:512:6: otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArtifactDefinition1026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArtifactDefinitionAccess().getArtifactKeyword_2_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:516:1: ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:517:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:517:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:518:3: lv_artifactId_4_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition1047);
                    lv_artifactId_4_0=ruleIDAndSpecialCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"artifactId",
                              		lv_artifactId_4_0, 
                              		"IDAndSpecialCharacters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:534:4: (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:534:6: otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleArtifactDefinition1062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArtifactDefinitionAccess().getVersionKeyword_3_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:538:1: ( (lv_version_6_0= ruleVersion ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:539:1: (lv_version_6_0= ruleVersion )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:539:1: (lv_version_6_0= ruleVersion )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:540:3: lv_version_6_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getVersionVersionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleArtifactDefinition1083);
                    lv_version_6_0=ruleVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"version",
                              		lv_version_6_0, 
                              		"Version");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:556:4: (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:556:6: otherlv_7= 'type' ( (lv_type_8_0= ruleText ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleArtifactDefinition1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getArtifactDefinitionAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:560:1: ( (lv_type_8_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:561:1: (lv_type_8_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:561:1: (lv_type_8_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:562:3: lv_type_8_0= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getTypeTextParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleArtifactDefinition1119);
                    lv_type_8_0=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_8_0, 
                              		"Text");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:578:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:580:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:580:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:581:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:584:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:585:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:585:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:587:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:587:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:588:5: {...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:588:115: ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:589:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:7: {...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:16: (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:18: otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleArtifactDefinition1179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getArtifactDefinitionAccess().getNameKeyword_5_0_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:596:1: ( (lv_artifactName_11_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:1: (lv_artifactName_11_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:1: (lv_artifactName_11_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:598:3: lv_artifactName_11_0= RULE_STRING
            	    {
            	    lv_artifactName_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1196); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_artifactName_11_0, grammarAccess.getArtifactDefinitionAccess().getArtifactNameSTRINGTerminalRuleCall_5_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getArtifactDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"artifactName",
            	              		lv_artifactName_11_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:621:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:621:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:622:5: {...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:622:115: ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:623:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:626:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:626:7: {...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:626:16: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:626:18: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleArtifactDefinition1269); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getArtifactDefinitionAccess().getDescriptionKeyword_5_1_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:630:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:631:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:631:1: (lv_description_13_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:632:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1286); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_description_13_0, grammarAccess.getArtifactDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getArtifactDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"description",
            	              		lv_description_13_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifactDefinition"


    // $ANTLR start "entryRuleIDAndDash"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:672:1: entryRuleIDAndDash returns [String current=null] : iv_ruleIDAndDash= ruleIDAndDash EOF ;
    public final String entryRuleIDAndDash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndDash = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:676:2: (iv_ruleIDAndDash= ruleIDAndDash EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:677:2: iv_ruleIDAndDash= ruleIDAndDash EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDAndDashRule()); 
            }
            pushFollow(FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1377);
            iv_ruleIDAndDash=ruleIDAndDash();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDAndDash.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndDash1388); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIDAndDash"


    // $ANTLR start "ruleIDAndDash"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:687:1: ruleIDAndDash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndDash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:691:28: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:692:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:692:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:692:6: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:699:1: (kw= '-' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:700:2: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndDash1451); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getIDAndDashAccess().getHyphenMinusKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1466); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIDAndDash"


    // $ANTLR start "entryRuleIDAndSpecialCharacters"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:723:1: entryRuleIDAndSpecialCharacters returns [String current=null] : iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF ;
    public final String entryRuleIDAndSpecialCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndSpecialCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:727:2: (iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:728:2: iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDAndSpecialCharactersRule()); 
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1524);
            iv_ruleIDAndSpecialCharacters=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDAndSpecialCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIDAndSpecialCharacters"


    // $ANTLR start "ruleIDAndSpecialCharacters"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:738:1: ruleIDAndSpecialCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndSpecialCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDOrKW_0 = null;

        AntlrDatatypeRuleToken this_IDOrKW_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:742:28: ( (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:744:5: this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIDAndSpecialCharactersAccess().getIDOrKWParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1586);
            this_IDOrKW_0=ruleIDOrKW();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDOrKW_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:1: ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) && (synpred1_InternalPom())) {
                    alt18=1;
                }
                else if ( (LA18_0==21) && (synpred1_InternalPom())) {
                    alt18=1;
                }
                else if ( (LA18_0==22) && (synpred1_InternalPom())) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:2: ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:2: ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:3: ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:762:5: (kw= '-' | kw= '.' | kw= '_' )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:763:2: kw= '-'
            	            {
            	            kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndSpecialCharacters1639); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getHyphenMinusKeyword_1_0_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:770:2: kw= '.'
            	            {
            	            kw=(Token)match(input,21,FOLLOW_21_in_ruleIDAndSpecialCharacters1658); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getFullStopKeyword_1_0_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:777:2: kw= '_'
            	            {
            	            kw=(Token)match(input,22,FOLLOW_22_in_ruleIDAndSpecialCharacters1677); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().get_Keyword_1_0_0_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getIDAndSpecialCharactersAccess().getIDOrKWParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1701);
            	    this_IDOrKW_4=ruleIDOrKW();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDOrKW_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIDAndSpecialCharacters"


    // $ANTLR start "entryRuleClassifier"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:806:1: entryRuleClassifier returns [String current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final String entryRuleClassifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifier = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:807:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:808:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1755);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:815:1: ruleClassifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:818:28: (this_ID_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:819:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getClassifierAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleNumber"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:834:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:835:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:836:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1850);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1861); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:843:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:846:28: (this_INT_0= RULE_INT )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:847:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleText"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:862:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:863:2: (iv_ruleText= ruleText EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:864:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1945);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1956); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:871:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Number_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:874:28: ( (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:875:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:875:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            loop19:
            do {
                int alt19=4;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:875:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1996); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:884:5: this_Number_1= ruleNumber
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTextAccess().getNumberParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNumber_in_ruleText2029);
            	    this_Number_1=ruleNumber();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Number_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:895:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2055); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRulePropertyName"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:910:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:911:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:912:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyNameRule()); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName2102);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName2113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:919:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDAndSpecialCharacters_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:922:28: (this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:924:5: this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyNameAccess().getIDAndSpecialCharactersParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2159);
            this_IDAndSpecialCharacters_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDAndSpecialCharacters_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRulePropertyRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:942:1: entryRulePropertyRef returns [String current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final String entryRulePropertyRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:943:2: (iv_rulePropertyRef= rulePropertyRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:944:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRefRule()); 
            }
            pushFollow(FOLLOW_rulePropertyRef_in_entryRulePropertyRef2204);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyRef.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRef2215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:951:1: rulePropertyRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePropertyRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PropertyName_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:954:28: ( (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:955:1: (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:955:1: (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:956:2: kw= '${' this_PropertyName_1= rulePropertyName kw= '}'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulePropertyRef2253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPropertyRefAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyRefAccess().getPropertyNameParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePropertyName_in_rulePropertyRef2275);
            this_PropertyName_1=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PropertyName_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_rulePropertyRef2293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPropertyRefAccess().getRightCurlyBracketKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleIDOrPropteryRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:986:1: entryRuleIDOrPropteryRef returns [String current=null] : iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF ;
    public final String entryRuleIDOrPropteryRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrPropteryRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:987:2: (iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:988:2: iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDOrPropteryRefRule()); 
            }
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2334);
            iv_ruleIDOrPropteryRef=ruleIDOrPropteryRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDOrPropteryRef.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPropteryRef2345); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDOrPropteryRef"


    // $ANTLR start "ruleIDOrPropteryRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:995:1: ruleIDOrPropteryRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef ) ;
    public final AntlrDatatypeRuleToken ruleIDOrPropteryRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDOrKW_0 = null;

        AntlrDatatypeRuleToken this_PropertyRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:998:28: ( (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:999:1: (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:999:1: (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==11||LA20_0==16||(LA20_0>=25 && LA20_0<=29)) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1000:5: this_IDOrKW_0= ruleIDOrKW
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getIDOrKWParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2392);
                    this_IDOrKW_0=ruleIDOrKW();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDOrKW_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1012:5: this_PropertyRef_1= rulePropertyRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getPropertyRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyRef_in_ruleIDOrPropteryRef2425);
                    this_PropertyRef_1=rulePropertyRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PropertyRef_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDOrPropteryRef"


    // $ANTLR start "entryRuleIDOrKW"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1030:1: entryRuleIDOrKW returns [String current=null] : iv_ruleIDOrKW= ruleIDOrKW EOF ;
    public final String entryRuleIDOrKW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrKW = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1031:2: (iv_ruleIDOrKW= ruleIDOrKW EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1032:2: iv_ruleIDOrKW= ruleIDOrKW EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDOrKWRule()); 
            }
            pushFollow(FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2471);
            iv_ruleIDOrKW=ruleIDOrKW();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDOrKW.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrKW2482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDOrKW"


    // $ANTLR start "ruleIDOrKW"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1039:1: ruleIDOrKW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' ) ;
    public final AntlrDatatypeRuleToken ruleIDOrKW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1042:28: ( (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1043:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1043:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 25:
                {
                alt21=2;
                }
                break;
            case 11:
                {
                alt21=3;
                }
                break;
            case 16:
                {
                alt21=4;
                }
                break;
            case 26:
                {
                alt21=5;
                }
                break;
            case 27:
                {
                alt21=6;
                }
                break;
            case 28:
                {
                alt21=7;
                }
                break;
            case 29:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1043:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrKW2522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIDOrKWAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1052:2: kw= 'test'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleIDOrKW2546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getTestKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1059:2: kw= 'parent'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleIDOrKW2565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getParentKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1066:2: kw= 'version'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleIDOrKW2584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getVersionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1073:2: kw= 'exec'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleIDOrKW2603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getExecKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1080:2: kw= 'clean'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleIDOrKW2622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getCleanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1087:2: kw= 'plugin'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleIDOrKW2641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getPluginKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1094:2: kw= 'compile'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleIDOrKW2660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getCompileKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDOrKW"


    // $ANTLR start "entryRuleVersion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1107:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1109:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2700);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2710); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1116:1: ruleVersion returns [EObject current=null] : ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_major_0_0 = null;

        AntlrDatatypeRuleToken lv_minor_2_0 = null;

        AntlrDatatypeRuleToken lv_incremental_4_0 = null;

        AntlrDatatypeRuleToken lv_qualifier_6_0 = null;

        AntlrDatatypeRuleToken lv_propertyRef_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1119:28: ( ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:1: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:1: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==23) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:2: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:2: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:3: ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1120:3: ( (lv_major_0_0= ruleNumber ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1121:1: (lv_major_0_0= ruleNumber )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1121:1: (lv_major_0_0= ruleNumber )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1122:3: lv_major_0_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVersionAccess().getMajorNumberParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2757);
                    lv_major_0_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVersionRule());
                      	        }
                             		set(
                             			current, 
                             			"major",
                              		lv_major_0_0, 
                              		"Number");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1138:2: (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==21) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==RULE_INT) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1138:4: otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVersion2770); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_0_1_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1142:1: ( (lv_minor_2_0= ruleNumber ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1143:1: (lv_minor_2_0= ruleNumber )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1143:1: (lv_minor_2_0= ruleNumber )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1144:3: lv_minor_2_0= ruleNumber
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVersionAccess().getMinorNumberParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2791);
                            lv_minor_2_0=ruleNumber();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVersionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"minor",
                                      		lv_minor_2_0, 
                                      		"Number");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:2: (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==21) ) {
                                int LA22_1 = input.LA(2);

                                if ( (LA22_1==RULE_INT) ) {
                                    alt22=1;
                                }
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:4: otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) )
                                    {
                                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVersion2804); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_0_1_2_0());
                                          
                                    }
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1164:1: ( (lv_incremental_4_0= ruleNumber ) )
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1165:1: (lv_incremental_4_0= ruleNumber )
                                    {
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1165:1: (lv_incremental_4_0= ruleNumber )
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1166:3: lv_incremental_4_0= ruleNumber
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getVersionAccess().getIncrementalNumberParserRuleCall_0_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2825);
                                    lv_incremental_4_0=ruleNumber();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getVersionRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"incremental",
                                              		lv_incremental_4_0, 
                                              		"Number");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1182:6: (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==20) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1182:8: otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) )
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleVersion2842); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getHyphenMinusKeyword_0_2_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1186:1: ( (lv_qualifier_6_0= ruleText ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1187:1: (lv_qualifier_6_0= ruleText )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1187:1: (lv_qualifier_6_0= ruleText )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1188:3: lv_qualifier_6_0= ruleText
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVersionAccess().getQualifierTextParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleText_in_ruleVersion2863);
                            lv_qualifier_6_0=ruleText();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVersionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"qualifier",
                                      		lv_qualifier_6_0, 
                                      		"Text");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1205:6: ( (lv_propertyRef_7_0= rulePropertyRef ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1205:6: ( (lv_propertyRef_7_0= rulePropertyRef ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1206:1: (lv_propertyRef_7_0= rulePropertyRef )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1206:1: (lv_propertyRef_7_0= rulePropertyRef )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1207:3: lv_propertyRef_7_0= rulePropertyRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVersionAccess().getPropertyRefPropertyRefParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyRef_in_ruleVersion2893);
                    lv_propertyRef_7_0=rulePropertyRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVersionRule());
                      	        }
                             		set(
                             			current, 
                             			"propertyRef",
                              		lv_propertyRef_7_0, 
                              		"PropertyRef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleProperty"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1231:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1232:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1233:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2929);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2939); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1240:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1243:28: ( (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1244:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1244:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1244:3: otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleProperty2976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1248:1: ( (lv_name_1_0= rulePropertyName ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1249:1: (lv_name_1_0= rulePropertyName )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1249:1: (lv_name_1_0= rulePropertyName )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1250:3: lv_name_1_0= rulePropertyName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleProperty2997);
            lv_name_1_0=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"PropertyName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleProperty3009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1270:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1271:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1271:1: (lv_value_3_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1272:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_3_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1296:1: entryRulePropertyInclusion returns [EObject current=null] : iv_rulePropertyInclusion= rulePropertyInclusion EOF ;
    public final EObject entryRulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1297:2: (iv_rulePropertyInclusion= rulePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1298:2: iv_rulePropertyInclusion= rulePropertyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyInclusionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion3067);
            iv_rulePropertyInclusion=rulePropertyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInclusion3077); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyInclusion"


    // $ANTLR start "rulePropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:1: rulePropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'properties' ) ;
    public final EObject rulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1308:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'properties' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1309:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'properties' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1309:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'properties' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1309:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'properties'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePropertyInclusion3114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyInclusionAccess().getIncludeKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1313:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1314:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1314:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1315:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyInclusionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyInclusion3134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPropertyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePropertyInclusion3146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyInclusionAccess().getFullStopKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_rulePropertyInclusion3158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyInclusionAccess().getPropertiesKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyInclusion"


    // $ANTLR start "entryRuleDependencies"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1342:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1343:2: (iv_ruleDependencies= ruleDependencies EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1344:2: iv_ruleDependencies= ruleDependencies EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependenciesRule()); 
            }
            pushFollow(FOLLOW_ruleDependencies_in_entryRuleDependencies3194);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencies; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencies3204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencies"


    // $ANTLR start "ruleDependencies"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1351:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_includes_3_0 = null;

        EObject lv_dependencyGroups_4_0 = null;

        EObject lv_ungroupedDependencies_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1354:28: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1355:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1355:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1355:2: () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1355:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1356:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDependencies3250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDependencies3262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1369:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=4;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1369:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1369:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1370:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1370:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1371:3: lv_includes_3_0= ruleDependencyInclusion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getIncludesDependencyInclusionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencyInclusion_in_ruleDependencies3284);
            	    lv_includes_3_0=ruleDependencyInclusion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"includes",
            	              		lv_includes_3_0, 
            	              		"DependencyInclusion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1388:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1388:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1389:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1389:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1390:3: lv_dependencyGroups_4_0= ruleDependencyGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getDependencyGroupsDependencyGroupParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencyGroup_in_ruleDependencies3311);
            	    lv_dependencyGroups_4_0=ruleDependencyGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dependencyGroups",
            	              		lv_dependencyGroups_4_0, 
            	              		"DependencyGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1407:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1407:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1409:3: lv_ungroupedDependencies_5_0= ruleUngroupedDependency
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getUngroupedDependenciesUngroupedDependencyParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUngroupedDependency_in_ruleDependencies3338);
            	    lv_ungroupedDependencies_5_0=ruleUngroupedDependency();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDependenciesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ungroupedDependencies",
            	              		lv_ungroupedDependencies_5_0, 
            	              		"UngroupedDependency");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDependencies3352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencies"


    // $ANTLR start "entryRuleDependencyGroup"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1437:1: entryRuleDependencyGroup returns [EObject current=null] : iv_ruleDependencyGroup= ruleDependencyGroup EOF ;
    public final EObject entryRuleDependencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyGroup = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1438:2: (iv_ruleDependencyGroup= ruleDependencyGroup EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1439:2: iv_ruleDependencyGroup= ruleDependencyGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyGroupRule()); 
            }
            pushFollow(FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3388);
            iv_ruleDependencyGroup=ruleDependencyGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencyGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyGroup3398); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyGroup"


    // $ANTLR start "ruleDependencyGroup"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1446:1: ruleDependencyGroup returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDependencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_scope_0_0 = null;

        EObject lv_dependecies_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1449:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1450:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1450:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1450:2: ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1450:2: ( (lv_scope_0_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1451:1: (lv_scope_0_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1451:1: (lv_scope_0_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1452:3: lv_scope_0_0= ruleDependencyScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3444);
            lv_scope_0_0=ruleDependencyScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDependencyGroupRule());
              	        }
                     		set(
                     			current, 
                     			"scope",
                      		lv_scope_0_0, 
                      		"DependencyScope");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDependencyGroup3456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDependencyGroupAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1472:1: ( (lv_dependecies_2_0= ruleDependency ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==11||LA27_0==16||(LA27_0>=25 && LA27_0<=29)||LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1473:1: (lv_dependecies_2_0= ruleDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1473:1: (lv_dependecies_2_0= ruleDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1474:3: lv_dependecies_2_0= ruleDependency
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getDependeciesDependencyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependency_in_ruleDependencyGroup3477);
            	    lv_dependecies_2_0=ruleDependency();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDependencyGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dependecies",
            	              		lv_dependecies_2_0, 
            	              		"Dependency");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDependencyGroup3490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDependencyGroupAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyGroup"


    // $ANTLR start "entryRuleUngroupedDependency"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1502:1: entryRuleUngroupedDependency returns [EObject current=null] : iv_ruleUngroupedDependency= ruleUngroupedDependency EOF ;
    public final EObject entryRuleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUngroupedDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1503:2: (iv_ruleUngroupedDependency= ruleUngroupedDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1504:2: iv_ruleUngroupedDependency= ruleUngroupedDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUngroupedDependencyRule()); 
            }
            pushFollow(FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3526);
            iv_ruleUngroupedDependency=ruleUngroupedDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUngroupedDependency; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUngroupedDependency3536); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUngroupedDependency"


    // $ANTLR start "ruleUngroupedDependency"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1511:1: ruleUngroupedDependency returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) ;
    public final EObject ruleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_dependency_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1514:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1515:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1515:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1515:2: ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1515:2: ( (lv_scope_0_0= ruleDependencyScope ) )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID||LA28_1==11||LA28_1==16||(LA28_1>=25 && LA28_1<=29)||LA28_1==36) ) {
                        alt28=1;
                    }
                    }
                    break;
                case 52:
                case 65:
                case 66:
                case 67:
                    {
                    alt28=1;
                    }
                    break;
                case 25:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (LA28_3==RULE_ID||LA28_3==11||LA28_3==16||(LA28_3>=25 && LA28_3<=29)||LA28_3==36) ) {
                        alt28=1;
                    }
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1516:1: (lv_scope_0_0= ruleDependencyScope )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1516:1: (lv_scope_0_0= ruleDependencyScope )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1517:3: lv_scope_0_0= ruleDependencyScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3582);
                    lv_scope_0_0=ruleDependencyScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUngroupedDependencyRule());
                      	        }
                             		set(
                             			current, 
                             			"scope",
                              		lv_scope_0_0, 
                              		"DependencyScope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1533:3: ( (lv_dependency_1_0= ruleDependency ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1534:1: (lv_dependency_1_0= ruleDependency )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1534:1: (lv_dependency_1_0= ruleDependency )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1535:3: lv_dependency_1_0= ruleDependency
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getDependencyDependencyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependency_in_ruleUngroupedDependency3604);
            lv_dependency_1_0=ruleDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUngroupedDependencyRule());
              	        }
                     		set(
                     			current, 
                     			"dependency",
                      		lv_dependency_1_0, 
                      		"Dependency");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUngroupedDependency"


    // $ANTLR start "entryRuleDependency"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1559:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1560:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1561:2: iv_ruleDependency= ruleDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyRule()); 
            }
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3640);
            iv_ruleDependency=ruleDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependency; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1568:1: ruleDependency returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1571:28: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:2: ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1573:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1573:1: (lv_optional_0_0= 'optional' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1574:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,36,FOLLOW_36_in_ruleDependency3693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_0_0, grammarAccess.getDependencyAccess().getOptionalOptionalKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDependencyRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1587:3: ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1588:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1588:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1589:3: lv_coordinates_1_0= ruleExtendedCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyAccess().getCoordinatesExtendedCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_ruleDependency3728);
            lv_coordinates_1_0=ruleExtendedCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDependencyRule());
              	        }
                     		set(
                     			current, 
                     			"coordinates",
                      		lv_coordinates_1_0, 
                      		"ExtendedCoordinates");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleDependencyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1613:1: entryRuleDependencyInclusion returns [EObject current=null] : iv_ruleDependencyInclusion= ruleDependencyInclusion EOF ;
    public final EObject entryRuleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1614:2: (iv_ruleDependencyInclusion= ruleDependencyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:2: iv_ruleDependencyInclusion= ruleDependencyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyInclusionRule()); 
            }
            pushFollow(FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3764);
            iv_ruleDependencyInclusion=ruleDependencyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyInclusion3774); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyInclusion"


    // $ANTLR start "ruleDependencyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1622:1: ruleDependencyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) ;
    public final EObject ruleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1625:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1626:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1626:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1626:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDependencyInclusion3811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDependencyInclusionAccess().getIncludeKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1630:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1631:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1631:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1632:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDependencyInclusionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyInclusion3831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDependencyInclusion3843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDependencyInclusionAccess().getFullStopKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1647:1: ( (lv_scope_3_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1648:1: (lv_scope_3_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1648:1: (lv_scope_3_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1649:3: lv_scope_3_0= ruleDependencyScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3864);
            lv_scope_3_0=ruleDependencyScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDependencyInclusionRule());
              	        }
                     		set(
                     			current, 
                     			"scope",
                      		lv_scope_3_0, 
                      		"DependencyScope");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyInclusion"


    // $ANTLR start "entryRuleSCM"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1674:2: (iv_ruleSCM= ruleSCM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1675:2: iv_ruleSCM= ruleSCM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCMRule()); 
            }
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM3900);
            iv_ruleSCM=ruleSCM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCM; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM3910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCM"


    // $ANTLR start "ruleSCM"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1682:1: ruleSCM returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleSCM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_connection_4_0=null;
        Token otherlv_5=null;
        Token lv_developerConncetion_6_0=null;
        Token otherlv_7=null;
        Token lv_url_8_0=null;
        Token otherlv_9=null;
        Token lv_tag_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1685:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1686:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1686:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1688:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1688:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1689:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getSCMAccess().getUnorderedGroup());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1692:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1693:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1693:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=5;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1695:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1695:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1696:5: {...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1696:98: ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1697:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1700:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1700:7: {...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1700:16: (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1700:18: otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleSCM3992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getScmKeyword_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleSCM4004); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSCMAccess().getLeftCurlyBracketKeyword_0_1());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1708:1: (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==38) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1708:3: otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSCM4017); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getSCMAccess().getConKeyword_0_2_0());
            	                  
            	            }
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:1: ( (lv_connection_4_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1713:1: (lv_connection_4_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1713:1: (lv_connection_4_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1714:3: lv_connection_4_0= RULE_STRING
            	            {
            	            lv_connection_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4034); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_connection_4_0, grammarAccess.getSCMAccess().getConnectionSTRINGTerminalRuleCall_0_2_1_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSCMRule());
            	              	        }
            	                     		setWithLastConsumed(
            	                     			current, 
            	                     			"connection",
            	                      		lv_connection_4_0, 
            	                      		"STRING");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1737:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1737:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1738:5: {...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1738:98: ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1739:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1742:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1742:7: {...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1742:16: (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1742:18: otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleSCM4109); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSCMAccess().getDevKeyword_1_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1746:1: ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1747:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1747:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1748:3: lv_developerConncetion_6_0= RULE_STRING
            	    {
            	    lv_developerConncetion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4126); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_developerConncetion_6_0, grammarAccess.getSCMAccess().getDeveloperConncetionSTRINGTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSCMRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"developerConncetion",
            	              		lv_developerConncetion_6_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1771:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1771:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:5: {...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:98: ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1773:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 2);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1776:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1776:7: {...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1776:16: (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1776:18: otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleSCM4199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSCMAccess().getUrlKeyword_2_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1780:1: ( (lv_url_8_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1781:1: (lv_url_8_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1781:1: (lv_url_8_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1782:3: lv_url_8_0= RULE_STRING
            	    {
            	    lv_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4216); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_url_8_0, grammarAccess.getSCMAccess().getUrlSTRINGTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSCMRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"url",
            	              		lv_url_8_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1805:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1805:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1806:5: {...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1806:98: ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1807:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 3);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:7: {...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:16: ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==41) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:19: otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleSCM4290); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getSCMAccess().getTagKeyword_3_0_0());
            	                  
            	            }
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1814:1: ( (lv_tag_10_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1815:1: (lv_tag_10_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1815:1: (lv_tag_10_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1816:3: lv_tag_10_0= RULE_STRING
            	            {
            	            lv_tag_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4307); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_tag_10_0, grammarAccess.getSCMAccess().getTagSTRINGTerminalRuleCall_3_0_1_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSCMRule());
            	              	        }
            	                     		setWithLastConsumed(
            	                     			current, 
            	                     			"tag",
            	                      		lv_tag_10_0, 
            	                      		"STRING");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSCM4326); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getSCMAccess().getRightCurlyBracketKeyword_3_1());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getSCMAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCM"


    // $ANTLR start "entryRulePlugin"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1859:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1860:2: (iv_rulePlugin= rulePlugin EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1861:2: iv_rulePlugin= rulePlugin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginRule()); 
            }
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin4408);
            iv_rulePlugin=rulePlugin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlugin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin4418); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlugin"


    // $ANTLR start "rulePlugin"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1868:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject rulePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_coordinates_1_0 = null;

        EObject lv_configuration_6_0 = null;

        EObject lv_executions_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1871:28: ( (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1872:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1872:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1872:3: otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePlugin4455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1876:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1877:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1877:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1878:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPluginAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePlugin4476);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPluginRule());
              	        }
                     		set(
                     			current, 
                     			"coordinates",
                      		lv_coordinates_1_0, 
                      		"Coordinates");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulePlugin4488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1898:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1900:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1900:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1901:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1904:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1905:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1905:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( LA34_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1907:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1907:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1908:5: {...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1908:103: ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1909:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1912:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1912:7: {...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1912:16: (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1912:18: otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}'
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_rulePlugin4546); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPluginAccess().getConfigKeyword_3_0_0());
            	          
            	    }
            	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_rulePlugin4558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_3_0_1());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1920:1: ( (lv_configuration_6_0= rulePluginConfiguration ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1921:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1921:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1922:3: lv_configuration_6_0= rulePluginConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginAccess().getConfigurationPluginConfigurationParserRuleCall_3_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfiguration_in_rulePlugin4579);
            	    lv_configuration_6_0=rulePluginConfiguration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPluginRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"configuration",
            	              		lv_configuration_6_0, 
            	              		"PluginConfiguration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlugin4591); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_3_0_3());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1949:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1949:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1950:5: {...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1950:103: ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1951:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==26) ) {
            	            int LA33_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt33=1;
            	            }


            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:7: {...}? => ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:16: ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1955:1: (lv_executions_8_0= rulePluginExecution )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1955:1: (lv_executions_8_0= rulePluginExecution )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1956:3: lv_executions_8_0= rulePluginExecution
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPluginAccess().getExecutionsPluginExecutionParserRuleCall_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_rulePluginExecution_in_rulePlugin4667);
            	    	    lv_executions_8_0=rulePluginExecution();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getPluginRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"executions",
            	    	              		lv_executions_8_0, 
            	    	              		"PluginExecution");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPluginAccess().getUnorderedGroup_3());

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePlugin4720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlugin"


    // $ANTLR start "entryRulePluginConfiguration"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1998:1: entryRulePluginConfiguration returns [EObject current=null] : iv_rulePluginConfiguration= rulePluginConfiguration EOF ;
    public final EObject entryRulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfiguration = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1999:2: (iv_rulePluginConfiguration= rulePluginConfiguration EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2000:2: iv_rulePluginConfiguration= rulePluginConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4756);
            iv_rulePluginConfiguration=rulePluginConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfiguration4766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfiguration"


    // $ANTLR start "rulePluginConfiguration"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:1: rulePluginConfiguration returns [EObject current=null] : ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ ;
    public final EObject rulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configurationItems_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2010:28: ( ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2011:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2011:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2012:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2012:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2013:3: lv_configurationItems_0_0= rulePluginConfigurationItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsPluginConfigurationItemParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4811);
            	    lv_configurationItems_0_0=rulePluginConfigurationItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPluginConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"configurationItems",
            	              		lv_configurationItems_0_0, 
            	              		"PluginConfigurationItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfiguration"


    // $ANTLR start "entryRulePluginConfigurationItem"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2037:1: entryRulePluginConfigurationItem returns [EObject current=null] : iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF ;
    public final EObject entryRulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationItem = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2038:2: (iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2039:2: iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationItemRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4847);
            iv_rulePluginConfigurationItem=rulePluginConfigurationItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationItem4857); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationItem"


    // $ANTLR start "rulePluginConfigurationItem"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2046:1: rulePluginConfigurationItem returns [EObject current=null] : (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) ;
    public final EObject rulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject this_PluginConfigurationParameter_0 = null;

        EObject this_PluginConfigurationParameterList_1 = null;

        EObject this_PluginConfigurationParameterMap_2 = null;

        EObject this_PluginConfigurationParameterProperties_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2049:28: ( (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2050:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2050:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            int alt36=4;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt36=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 24:
                    {
                    alt36=1;
                    }
                    break;
                case 35:
                    {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 45:
                            {
                            alt36=3;
                            }
                            break;
                        case 31:
                            {
                            alt36=4;
                            }
                            break;
                        case RULE_STRING:
                        case RULE_ID:
                        case 24:
                        case 35:
                        case 43:
                            {
                            alt36=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2051:5: this_PluginConfigurationParameter_0= rulePluginConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4904);
                    this_PluginConfigurationParameter_0=rulePluginConfigurationParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PluginConfigurationParameter_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2061:5: this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4931);
                    this_PluginConfigurationParameterList_1=rulePluginConfigurationParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PluginConfigurationParameterList_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2071:5: this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterMapParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4958);
                    this_PluginConfigurationParameterMap_2=rulePluginConfigurationParameterMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PluginConfigurationParameterMap_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2081:5: this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterPropertiesParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4985);
                    this_PluginConfigurationParameterProperties_3=rulePluginConfigurationParameterProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PluginConfigurationParameterProperties_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationItem"


    // $ANTLR start "entryRulePluginConfigurationParameter"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2097:1: entryRulePluginConfigurationParameter returns [EObject current=null] : iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF ;
    public final EObject entryRulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameter = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2098:2: (iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2099:2: iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter5020);
            iv_rulePluginConfigurationParameter=rulePluginConfigurationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameter5030); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameter"


    // $ANTLR start "rulePluginConfigurationParameter"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2106:1: rulePluginConfigurationParameter returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) ;
    public final EObject rulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2109:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2110:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2110:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2110:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2110:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2111:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2111:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2112:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameter5072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2128:2: ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==35) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2128:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2128:3: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2129:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2129:1: (lv_value_1_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2130:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter5095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getPluginConfigurationParameterAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPluginConfigurationParameterRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2147:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2147:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2147:8: otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulePluginConfigurationParameter5119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPluginConfigurationParameterAccess().getLeftCurlyBracketKeyword_1_1_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:1: ( (lv_children_3_0= rulePluginConfigurationItem ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2152:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2152:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2153:3: lv_children_3_0= rulePluginConfigurationItem
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterAccess().getChildrenPluginConfigurationItemParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter5140);
                    	    lv_children_3_0=rulePluginConfigurationItem();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPluginConfigurationParameterRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"children",
                    	              		lv_children_3_0, 
                    	              		"PluginConfigurationItem");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameter5153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPluginConfigurationParameterAccess().getRightCurlyBracketKeyword_1_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameter"


    // $ANTLR start "entryRulePluginConfigurationParameterList"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2181:1: entryRulePluginConfigurationParameterList returns [EObject current=null] : iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF ;
    public final EObject entryRulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterList = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2182:2: (iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2183:2: iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterListRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList5192);
            iv_rulePluginConfigurationParameterList=rulePluginConfigurationParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterList5202); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameterList"


    // $ANTLR start "rulePluginConfigurationParameterList"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2190:1: rulePluginConfigurationParameterList returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
    public final EObject rulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2193:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2195:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2195:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2196:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterListAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_rulePluginConfigurationParameterList5261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2216:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2217:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2217:1: (lv_values_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2218:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_2_0, grammarAccess.getPluginConfigurationParameterListAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterListRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2234:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==13) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2234:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePluginConfigurationParameterList5296); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterListAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2238:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2239:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2239:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2240:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5313); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_4_0, grammarAccess.getPluginConfigurationParameterListAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPluginConfigurationParameterListRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_rulePluginConfigurationParameterList5332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPluginConfigurationParameterListAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameterList"


    // $ANTLR start "entryRulePluginConfigurationParameterMap"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2268:1: entryRulePluginConfigurationParameterMap returns [EObject current=null] : iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF ;
    public final EObject entryRulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMap = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2269:2: (iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2270:2: iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterMapRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5368);
            iv_rulePluginConfigurationParameterMap=rulePluginConfigurationParameterMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterMap; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameterMap"


    // $ANTLR start "rulePluginConfigurationParameterMap"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2277:1: rulePluginConfigurationParameterMap returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2280:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2281:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2281:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2281:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2281:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2282:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2282:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2283:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterMapAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterMapRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePluginConfigurationParameterMap5437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2303:1: ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2305:3: lv_entries_2_0= rulePluginConfigurationParameterMapEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesPluginConfigurationParameterMapEntryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5458);
            	    lv_entries_2_0=rulePluginConfigurationParameterMapEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPluginConfigurationParameterMapRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_2_0, 
            	              		"PluginConfigurationParameterMapEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterMap5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterMapAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameterMap"


    // $ANTLR start "entryRulePluginConfigurationParameterMapEntry"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2333:1: entryRulePluginConfigurationParameterMapEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMapEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2334:2: (iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2335:2: iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterMapEntryRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5507);
            iv_rulePluginConfigurationParameterMapEntry=rulePluginConfigurationParameterMapEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterMapEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameterMapEntry"


    // $ANTLR start "rulePluginConfigurationParameterMapEntry"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:1: rulePluginConfigurationParameterMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2345:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2346:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2346:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2346:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2346:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2347:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2347:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2348:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterMapEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_rulePluginConfigurationParameterMapEntry5576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2368:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2370:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterMapEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameterMapEntry"


    // $ANTLR start "entryRulePluginConfigurationParameterProperties"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2394:1: entryRulePluginConfigurationParameterProperties returns [EObject current=null] : iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF ;
    public final EObject entryRulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2395:2: (iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2396:2: iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5634);
            iv_rulePluginConfigurationParameterProperties=rulePluginConfigurationParameterProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameterProperties"


    // $ANTLR start "rulePluginConfigurationParameterProperties"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2403:1: rulePluginConfigurationParameterProperties returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2406:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2407:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2407:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2407:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2407:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2408:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2408:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2409:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterPropertiesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePluginConfigurationParameterProperties5703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2429:1: ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2431:3: lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesPluginConfigurationParameterPropertyEntryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5724);
            	    lv_entries_2_0=rulePluginConfigurationParameterPropertyEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPluginConfigurationParameterPropertiesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entries",
            	              		lv_entries_2_0, 
            	              		"PluginConfigurationParameterPropertyEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterProperties5737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameterProperties"


    // $ANTLR start "entryRulePluginConfigurationParameterPropertyEntry"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2459:1: entryRulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterPropertyEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2460:2: (iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2461:2: iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertyEntryRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5773);
            iv_rulePluginConfigurationParameterPropertyEntry=rulePluginConfigurationParameterPropertyEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterPropertyEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5783); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginConfigurationParameterPropertyEntry"


    // $ANTLR start "rulePluginConfigurationParameterPropertyEntry"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2468:1: rulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2471:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2472:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2472:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2472:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2472:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2473:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2473:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2474:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterPropertyEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePluginConfigurationParameterPropertyEntry5842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2494:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2495:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2495:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2496:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginConfigurationParameterPropertyEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginConfigurationParameterPropertyEntry"


    // $ANTLR start "entryRulePluginExecution"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2520:1: entryRulePluginExecution returns [EObject current=null] : iv_rulePluginExecution= rulePluginExecution EOF ;
    public final EObject entryRulePluginExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginExecution = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2521:2: (iv_rulePluginExecution= rulePluginExecution EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2522:2: iv_rulePluginExecution= rulePluginExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginExecutionRule()); 
            }
            pushFollow(FOLLOW_rulePluginExecution_in_entryRulePluginExecution5900);
            iv_rulePluginExecution=rulePluginExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginExecution; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginExecution5910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginExecution"


    // $ANTLR start "rulePluginExecution"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2529:1: rulePluginExecution returns [EObject current=null] : (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) ) ;
    public final EObject rulePluginExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_default_13_0=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        Enumerator lv_phase_4_0 = null;

        AntlrDatatypeRuleToken lv_goals_7_0 = null;

        AntlrDatatypeRuleToken lv_goals_9_0 = null;

        EObject lv_configuration_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2532:28: ( (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:3: otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePluginExecution5947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginExecutionAccess().getExecKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2537:1: ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==46||LA46_0==48) ) {
                alt46=1;
            }
            else if ( (LA46_0==50) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2537:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2537:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2537:3: ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2537:3: ( (lv_id_1_0= ruleIDAndDash ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2538:1: (lv_id_1_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2538:1: (lv_id_1_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2539:3: lv_id_1_0= ruleIDAndDash
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getIdIDAndDashParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5970);
                            lv_id_1_0=ruleIDAndDash();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"id",
                                      		lv_id_1_0, 
                                      		"IDAndDash");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2555:3: (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==46) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2555:5: otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) )
                            {
                            otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulePluginExecution5984); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getPluginExecutionAccess().getInKeyword_1_0_1_0());
                                  
                            }
                            otherlv_3=(Token)match(input,47,FOLLOW_47_in_rulePluginExecution5996); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getPluginExecutionAccess().getPhaseKeyword_1_0_1_1());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2563:1: ( (lv_phase_4_0= rulePhase ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2564:1: (lv_phase_4_0= rulePhase )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2564:1: (lv_phase_4_0= rulePhase )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2565:3: lv_phase_4_0= rulePhase
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getPhasePhaseEnumRuleCall_1_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePhase_in_rulePluginExecution6017);
                            lv_phase_4_0=rulePhase();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"phase",
                                      		lv_phase_4_0, 
                                      		"Phase");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_rulePluginExecution6031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPluginExecutionAccess().getWithKeyword_1_0_2());
                          
                    }
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_rulePluginExecution6043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPluginExecutionAccess().getGoalsKeyword_1_0_3());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2589:1: ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2590:1: (lv_goals_7_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2590:1: (lv_goals_7_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2591:3: lv_goals_7_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndSpecialCharactersParserRuleCall_1_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_rulePluginExecution6064);
                    lv_goals_7_0=ruleIDAndSpecialCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                      	        }
                             		add(
                             			current, 
                             			"goals",
                              		lv_goals_7_0, 
                              		"IDAndSpecialCharacters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2607:2: (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==13) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2607:4: otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_rulePluginExecution6077); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getPluginExecutionAccess().getCommaKeyword_1_0_5_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2611:1: ( (lv_goals_9_0= ruleIDAndDash ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2612:1: (lv_goals_9_0= ruleIDAndDash )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2612:1: (lv_goals_9_0= ruleIDAndDash )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2613:3: lv_goals_9_0= ruleIDAndDash
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution6098);
                    	    lv_goals_9_0=ruleIDAndDash();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"goals",
                    	              		lv_goals_9_0, 
                    	              		"IDAndDash");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2629:4: (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==35) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2629:6: otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,35,FOLLOW_35_in_rulePluginExecution6113); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPluginExecutionAccess().getLeftCurlyBracketKeyword_1_0_6_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2633:1: ( (lv_configuration_11_0= rulePluginConfiguration ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2634:1: (lv_configuration_11_0= rulePluginConfiguration )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2634:1: (lv_configuration_11_0= rulePluginConfiguration )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2635:3: lv_configuration_11_0= rulePluginConfiguration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getConfigurationPluginConfigurationParserRuleCall_1_0_6_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePluginConfiguration_in_rulePluginExecution6134);
                            lv_configuration_11_0=rulePluginConfiguration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"configuration",
                                      		lv_configuration_11_0, 
                                      		"PluginConfiguration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_12=(Token)match(input,24,FOLLOW_24_in_rulePluginExecution6146); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getPluginExecutionAccess().getRightCurlyBracketKeyword_1_0_6_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2656:6: ( (lv_default_13_0= 'default' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2656:6: ( (lv_default_13_0= 'default' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2657:1: (lv_default_13_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2657:1: (lv_default_13_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2658:3: lv_default_13_0= 'default'
                    {
                    lv_default_13_0=(Token)match(input,50,FOLLOW_50_in_rulePluginExecution6173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_default_13_0, grammarAccess.getPluginExecutionAccess().getDefaultDefaultKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPluginExecutionRule());
                      	        }
                             		setWithLastConsumed(current, "default", true, "default");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginExecution"


    // $ANTLR start "entryRulePluginInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2679:1: entryRulePluginInclusion returns [EObject current=null] : iv_rulePluginInclusion= rulePluginInclusion EOF ;
    public final EObject entryRulePluginInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2680:2: (iv_rulePluginInclusion= rulePluginInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:2: iv_rulePluginInclusion= rulePluginInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginInclusionRule()); 
            }
            pushFollow(FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion6223);
            iv_rulePluginInclusion=rulePluginInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginInclusion6233); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluginInclusion"


    // $ANTLR start "rulePluginInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2688:1: rulePluginInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) ;
    public final EObject rulePluginInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_config_6_0=null;
        EObject lv_pluginCoordinates_3_0 = null;

        AntlrDatatypeRuleToken lv_executionId_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2691:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2692:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2692:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2692:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePluginInclusion6270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginInclusionAccess().getIncludeKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2696:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2697:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2697:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2698:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginInclusionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginInclusion6290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPluginInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePluginInclusion6302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2713:1: ( (lv_pluginCoordinates_3_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2714:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2714:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2715:3: lv_pluginCoordinates_3_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesCoordinatesParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePluginInclusion6323);
            lv_pluginCoordinates_3_0=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPluginInclusionRule());
              	        }
                     		set(
                     			current, 
                     			"pluginCoordinates",
                      		lv_pluginCoordinates_3_0, 
                      		"Coordinates");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2731:2: (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==21) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2731:4: otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePluginInclusion6336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2735:1: ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==42) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2735:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2735:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2736:1: (lv_executionId_5_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2736:1: (lv_executionId_5_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2737:3: lv_executionId_5_0= ruleIDAndDash
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getExecutionIdIDAndDashParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginInclusion6358);
                            lv_executionId_5_0=ruleIDAndDash();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPluginInclusionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"executionId",
                                      		lv_executionId_5_0, 
                                      		"IDAndDash");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2754:6: ( (lv_config_6_0= 'config' ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2754:6: ( (lv_config_6_0= 'config' ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2755:1: (lv_config_6_0= 'config' )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2755:1: (lv_config_6_0= 'config' )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2756:3: lv_config_6_0= 'config'
                            {
                            lv_config_6_0=(Token)match(input,42,FOLLOW_42_in_rulePluginInclusion6382); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_config_6_0, grammarAccess.getPluginInclusionAccess().getConfigConfigKeyword_4_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPluginInclusionRule());
                              	        }
                                     		setWithLastConsumed(current, "config", true, "config");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginInclusion"


    // $ANTLR start "entryRuleBuildStep"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2777:1: entryRuleBuildStep returns [EObject current=null] : iv_ruleBuildStep= ruleBuildStep EOF ;
    public final EObject entryRuleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildStep = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2778:2: (iv_ruleBuildStep= ruleBuildStep EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2779:2: iv_ruleBuildStep= ruleBuildStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuildStepRule()); 
            }
            pushFollow(FOLLOW_ruleBuildStep_in_entryRuleBuildStep6434);
            iv_ruleBuildStep=ruleBuildStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuildStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildStep6444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildStep"


    // $ANTLR start "ruleBuildStep"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2786:1: ruleBuildStep returns [EObject current=null] : (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) ;
    public final EObject ruleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject this_Plugin_0 = null;

        EObject this_PluginInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2789:28: ( (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2790:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2790:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28) ) {
                alt49=1;
            }
            else if ( (LA49_0==32) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2791:5: this_Plugin_0= rulePlugin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuildStepAccess().getPluginParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlugin_in_ruleBuildStep6491);
                    this_Plugin_0=rulePlugin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Plugin_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2801:5: this_PluginInclusion_1= rulePluginInclusion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuildStepAccess().getPluginInclusionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginInclusion_in_ruleBuildStep6518);
                    this_PluginInclusion_1=rulePluginInclusion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PluginInclusion_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildStep"


    // $ANTLR start "entryRuleCoordinates"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2817:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2818:2: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2819:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinatesRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates6553);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinates; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates6563); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinates"


    // $ANTLR start "ruleCoordinates"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2826:1: ruleCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2829:28: ( ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2830:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2830:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2830:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2830:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2831:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2831:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2832:3: lv_groupId_0_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6609);
            lv_groupId_0_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"groupId",
                      		lv_groupId_0_0, 
                      		"IDAndSpecialCharacters");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleCoordinates6621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getColonKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2852:1: ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2853:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2853:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2854:3: lv_artifactId_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6642);
            lv_artifactId_2_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"artifactId",
                      		lv_artifactId_2_0, 
                      		"IDAndSpecialCharacters");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleCoordinates6654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCoordinatesAccess().getColonKeyword_3());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2874:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2875:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2875:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2876:3: lv_version_4_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVersion_in_ruleCoordinates6675);
            lv_version_4_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"version",
                      		lv_version_4_0, 
                      		"Version");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinates"


    // $ANTLR start "entryRuleExtendedCoordinates"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2900:1: entryRuleExtendedCoordinates returns [EObject current=null] : iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF ;
    public final EObject entryRuleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2901:2: (iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2902:2: iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedCoordinatesRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6711);
            iv_ruleExtendedCoordinates=ruleExtendedCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedCoordinates; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedCoordinates6721); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedCoordinates"


    // $ANTLR start "ruleExtendedCoordinates"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2909:1: ruleExtendedCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) ;
    public final EObject ruleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;

        AntlrDatatypeRuleToken lv_classifier_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2912:28: ( ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2913:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2913:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2913:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2913:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2914:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2914:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2915:3: lv_groupId_0_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates6767);
            lv_groupId_0_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"groupId",
                      		lv_groupId_0_0, 
                      		"IDAndSpecialCharacters");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleExtendedCoordinates6779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:1: ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2936:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2936:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2937:3: lv_artifactId_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates6800);
            lv_artifactId_2_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"artifactId",
                      		lv_artifactId_2_0, 
                      		"IDAndSpecialCharacters");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleExtendedCoordinates6812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_3());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2957:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2958:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2958:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:3: lv_version_4_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVersion_in_ruleExtendedCoordinates6833);
            lv_version_4_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
              	        }
                     		set(
                     			current, 
                     			"version",
                      		lv_version_4_0, 
                      		"Version");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2975:2: (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2975:4: otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleExtendedCoordinates6846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2979:1: ( (lv_type_6_0= RULE_ID ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2980:1: (lv_type_6_0= RULE_ID )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2980:1: (lv_type_6_0= RULE_ID )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2981:3: lv_type_6_0= RULE_ID
                    {
                    lv_type_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedCoordinates6863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_6_0, grammarAccess.getExtendedCoordinatesAccess().getTypeIDTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExtendedCoordinatesRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2997:2: (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==51) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2997:4: otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) )
                            {
                            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleExtendedCoordinates6881); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_2_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3001:1: ( (lv_classifier_8_0= ruleClassifier ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:1: (lv_classifier_8_0= ruleClassifier )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:1: (lv_classifier_8_0= ruleClassifier )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3003:3: lv_classifier_8_0= ruleClassifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getClassifierClassifierParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6902);
                            lv_classifier_8_0=ruleClassifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"classifier",
                                      		lv_classifier_8_0, 
                                      		"Classifier");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendedCoordinates"


    // $ANTLR start "entryRulePOMImport"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:1: entryRulePOMImport returns [EObject current=null] : iv_rulePOMImport= rulePOMImport EOF ;
    public final EObject entryRulePOMImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOMImport = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3028:2: (iv_rulePOMImport= rulePOMImport EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3029:2: iv_rulePOMImport= rulePOMImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPOMImportRule()); 
            }
            pushFollow(FOLLOW_rulePOMImport_in_entryRulePOMImport6942);
            iv_rulePOMImport=rulePOMImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePOMImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePOMImport6952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOMImport"


    // $ANTLR start "rulePOMImport"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3036:1: rulePOMImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePOMImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3039:28: ( (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3040:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3040:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3040:3: otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_rulePOMImport6989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPOMImportAccess().getImportKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3044:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3046:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePOMImport7010);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPOMImportRule());
              	        }
                     		set(
                     			current, 
                     			"coordinates",
                      		lv_coordinates_1_0, 
                      		"Coordinates");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_rulePOMImport7022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPOMImportAccess().getAsKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3066:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3067:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3067:1: (lv_name_3_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3068:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOMImport7039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getPOMImportAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPOMImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOMImport"


    // $ANTLR start "entryRuleRepository"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3092:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3093:2: (iv_ruleRepository= ruleRepository EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3094:2: iv_ruleRepository= ruleRepository EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryRule()); 
            }
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository7080);
            iv_ruleRepository=ruleRepository();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepository; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository7090); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3101:1: ruleRepository returns [EObject current=null] : ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pluginRepositroy_1_0=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_layout_10_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_policies_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3104:28: ( ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:1: ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:1: ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:2: (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:2: (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            else if ( (LA52_0==55) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:4: otherlv_0= 'repository'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleRepository7128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3110:6: ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3110:6: ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3111:1: (lv_pluginRepositroy_1_0= 'plugin-repository' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3111:1: (lv_pluginRepositroy_1_0= 'plugin-repository' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3112:3: lv_pluginRepositroy_1_0= 'plugin-repository'
                    {
                    lv_pluginRepositroy_1_0=(Token)match(input,55,FOLLOW_55_in_ruleRepository7152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_pluginRepositroy_1_0, grammarAccess.getRepositoryAccess().getPluginRepositroyPluginRepositoryKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepositoryRule());
                      	        }
                             		setWithLastConsumed(current, "pluginRepositroy", true, "plugin-repository");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3125:3: ( (lv_id_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3126:1: (lv_id_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3126:1: (lv_id_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3127:3: lv_id_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepositoryAccess().getIdIDAndSpecialCharactersParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleRepository7187);
            lv_id_2_0=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"IDAndSpecialCharacters");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleRepository7199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getAtKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3147:1: ( (lv_url_4_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3148:1: (lv_url_4_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3148:1: (lv_url_4_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3149:3: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_url_4_0, grammarAccess.getRepositoryAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRepositoryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"url",
                      		lv_url_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3165:2: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==35) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3165:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleRepository7234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3169:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3172:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3175:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3176:3: ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3176:3: ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )*
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( LA53_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0) ) {
                            alt53=1;
                        }
                        else if ( LA53_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1) ) {
                            alt53=2;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3178:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3178:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3179:5: {...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0)");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3179:109: ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3180:6: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0);
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:6: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:7: {...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "true");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:16: (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:18: otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRepository7292); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getNameKeyword_4_1_0_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3187:1: ( (lv_name_8_0= RULE_STRING ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3188:1: (lv_name_8_0= RULE_STRING )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3188:1: (lv_name_8_0= RULE_STRING )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:3: lv_name_8_0= RULE_STRING
                    	    {
                    	    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7309); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_name_8_0, grammarAccess.getRepositoryAccess().getNameSTRINGTerminalRuleCall_4_1_0_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRepositoryRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"name",
                    	              		lv_name_8_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3212:4: ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3212:4: ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3213:5: {...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1)");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3213:109: ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3214:6: ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1);
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3217:6: ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3217:7: {...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "true");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3217:16: (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3217:18: otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) )
                    	    {
                    	    otherlv_9=(Token)match(input,57,FOLLOW_57_in_ruleRepository7382); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getLayoutKeyword_4_1_1_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3221:1: ( (lv_layout_10_0= RULE_STRING ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3222:1: (lv_layout_10_0= RULE_STRING )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3222:1: (lv_layout_10_0= RULE_STRING )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3223:3: lv_layout_10_0= RULE_STRING
                    	    {
                    	    lv_layout_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7399); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_layout_10_0, grammarAccess.getRepositoryAccess().getLayoutSTRINGTerminalRuleCall_4_1_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRepositoryRule());
                    	      	        }
                    	             		setWithLastConsumed(
                    	             			current, 
                    	             			"layout",
                    	              		lv_layout_10_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());

                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3253:2: ( (lv_policies_11_0= ruleRepositoryPolicy ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=58 && LA54_0<=59)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3254:1: (lv_policies_11_0= ruleRepositoryPolicy )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3254:1: (lv_policies_11_0= ruleRepositoryPolicy )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3255:3: lv_policies_11_0= ruleRepositoryPolicy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepositoryAccess().getPoliciesRepositoryPolicyParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRepositoryPolicy_in_ruleRepository7466);
                    	    lv_policies_11_0=ruleRepositoryPolicy();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"policies",
                    	              		lv_policies_11_0, 
                    	              		"RepositoryPolicy");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleRepository7479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryPolicy"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3283:1: entryRuleRepositoryPolicy returns [EObject current=null] : iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF ;
    public final EObject entryRuleRepositoryPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryPolicy = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3284:2: (iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3285:2: iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryPolicyRule()); 
            }
            pushFollow(FOLLOW_ruleRepositoryPolicy_in_entryRuleRepositoryPolicy7517);
            iv_ruleRepositoryPolicy=ruleRepositoryPolicy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepositoryPolicy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryPolicy7527); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositoryPolicy"


    // $ANTLR start "ruleRepositoryPolicy"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3292:1: ruleRepositoryPolicy returns [EObject current=null] : ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? ) ;
    public final EObject ruleRepositoryPolicy() throws RecognitionException {
        EObject current = null;

        Token lv_disabled_0_0=null;
        Token otherlv_1=null;
        Token lv_releases_2_0=null;
        Token lv_snapshots_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_updateInterval_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_updatePolicy_6_0 = null;

        Enumerator lv_checksumPolicy_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3295:28: ( ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3296:1: ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3296:1: ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3296:2: ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3296:2: ( (lv_disabled_0_0= 'do not' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3297:1: (lv_disabled_0_0= 'do not' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3297:1: (lv_disabled_0_0= 'do not' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3298:3: lv_disabled_0_0= 'do not'
                    {
                    lv_disabled_0_0=(Token)match(input,58,FOLLOW_58_in_ruleRepositoryPolicy7570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_disabled_0_0, grammarAccess.getRepositoryPolicyAccess().getDisabledDoNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepositoryPolicyRule());
                      	        }
                             		setWithLastConsumed(current, "disabled", true, "do not");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleRepositoryPolicy7596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRepositoryPolicyAccess().getFetchKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3315:1: ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            else if ( (LA57_0==61) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3315:2: ( (lv_releases_2_0= 'releases' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3315:2: ( (lv_releases_2_0= 'releases' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3316:1: (lv_releases_2_0= 'releases' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3316:1: (lv_releases_2_0= 'releases' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3317:3: lv_releases_2_0= 'releases'
                    {
                    lv_releases_2_0=(Token)match(input,60,FOLLOW_60_in_ruleRepositoryPolicy7615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_releases_2_0, grammarAccess.getRepositoryPolicyAccess().getReleasesReleasesKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepositoryPolicyRule());
                      	        }
                             		setWithLastConsumed(current, "releases", true, "releases");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3331:6: ( (lv_snapshots_3_0= 'snapshots' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3331:6: ( (lv_snapshots_3_0= 'snapshots' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3332:1: (lv_snapshots_3_0= 'snapshots' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3332:1: (lv_snapshots_3_0= 'snapshots' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3333:3: lv_snapshots_3_0= 'snapshots'
                    {
                    lv_snapshots_3_0=(Token)match(input,61,FOLLOW_61_in_ruleRepositoryPolicy7652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_snapshots_3_0, grammarAccess.getRepositoryPolicyAccess().getSnapshotsSnapshotsKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRepositoryPolicyRule());
                      	        }
                             		setWithLastConsumed(current, "snapshots", true, "snapshots");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3346:3: (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==13) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==62) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3346:5: otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )?
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryPolicy7679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRepositoryPolicyAccess().getCommaKeyword_3_0());
                          
                    }
                    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleRepositoryPolicy7691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRepositoryPolicyAccess().getUpdateKeyword_3_1());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3354:1: ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3355:1: (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3355:1: (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3356:3: lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepositoryPolicyAccess().getUpdatePolicyRepositoryUpdatePolicyEnumRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepositoryUpdatePolicy_in_ruleRepositoryPolicy7712);
                    lv_updatePolicy_6_0=ruleRepositoryUpdatePolicy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepositoryPolicyRule());
                      	        }
                             		set(
                             			current, 
                             			"updatePolicy",
                              		lv_updatePolicy_6_0, 
                              		"RepositoryUpdatePolicy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3372:2: (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==48) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3372:4: otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleRepositoryPolicy7725); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepositoryPolicyAccess().getWithKeyword_3_3_0());
                                  
                            }
                            otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleRepositoryPolicy7737); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getRepositoryPolicyAccess().getIntervalKeyword_3_3_1());
                                  
                            }
                            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleRepositoryPolicy7749); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getRepositoryPolicyAccess().getEqualsSignKeyword_3_3_2());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3384:1: ( (lv_updateInterval_10_0= RULE_INT ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3385:1: (lv_updateInterval_10_0= RULE_INT )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3385:1: (lv_updateInterval_10_0= RULE_INT )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3386:3: lv_updateInterval_10_0= RULE_INT
                            {
                            lv_updateInterval_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepositoryPolicy7766); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_updateInterval_10_0, grammarAccess.getRepositoryPolicyAccess().getUpdateIntervalINTTerminalRuleCall_3_3_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRepositoryPolicyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"updateInterval",
                                      		lv_updateInterval_10_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3402:6: (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3402:8: otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) )
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryPolicy7788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRepositoryPolicyAccess().getCommaKeyword_4_0());
                          
                    }
                    otherlv_12=(Token)match(input,64,FOLLOW_64_in_ruleRepositoryPolicy7800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getRepositoryPolicyAccess().getChecksumPolicyKeyword_4_1());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3410:1: ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3411:1: (lv_checksumPolicy_13_0= ruleChecksumPolicy )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3411:1: (lv_checksumPolicy_13_0= ruleChecksumPolicy )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3412:3: lv_checksumPolicy_13_0= ruleChecksumPolicy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepositoryPolicyAccess().getChecksumPolicyChecksumPolicyEnumRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleChecksumPolicy_in_ruleRepositoryPolicy7821);
                    lv_checksumPolicy_13_0=ruleChecksumPolicy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRepositoryPolicyRule());
                      	        }
                             		set(
                             			current, 
                             			"checksumPolicy",
                              		lv_checksumPolicy_13_0, 
                              		"ChecksumPolicy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryPolicy"


    // $ANTLR start "ruleDependencyScope"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3436:1: ruleDependencyScope returns [Enumerator current=null] : ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) ;
    public final Enumerator ruleDependencyScope() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3438:28: ( ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt61=1;
                }
                break;
            case 65:
                {
                alt61=2;
                }
                break;
            case 66:
                {
                alt61=3;
                }
                break;
            case 67:
                {
                alt61=4;
                }
                break;
            case 25:
                {
                alt61=5;
                }
                break;
            case 52:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:2: (enumLiteral_0= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:2: (enumLiteral_0= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:4: enumLiteral_0= 'compile'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleDependencyScope7873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3445:6: (enumLiteral_1= 'provided' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3445:6: (enumLiteral_1= 'provided' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3445:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleDependencyScope7890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3451:6: (enumLiteral_2= 'runtime' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3451:6: (enumLiteral_2= 'runtime' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3451:8: enumLiteral_2= 'runtime'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleDependencyScope7907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3457:6: (enumLiteral_3= 'system' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3457:6: (enumLiteral_3= 'system' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3457:8: enumLiteral_3= 'system'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleDependencyScope7924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3463:6: (enumLiteral_4= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3463:6: (enumLiteral_4= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3463:8: enumLiteral_4= 'test'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleDependencyScope7941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3469:6: (enumLiteral_5= 'import' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3469:6: (enumLiteral_5= 'import' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3469:8: enumLiteral_5= 'import'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_52_in_ruleDependencyScope7958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getIMPORTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getDependencyScopeAccess().getIMPORTEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyScope"


    // $ANTLR start "rulePhase"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3479:1: rulePhase returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) ;
    public final Enumerator rulePhase() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3481:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3482:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3482:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            int alt62=31;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt62=1;
                }
                break;
            case 68:
                {
                alt62=2;
                }
                break;
            case 27:
                {
                alt62=3;
                }
                break;
            case 69:
                {
                alt62=4;
                }
                break;
            case 70:
                {
                alt62=5;
                }
                break;
            case 71:
                {
                alt62=6;
                }
                break;
            case 72:
                {
                alt62=7;
                }
                break;
            case 73:
                {
                alt62=8;
                }
                break;
            case 74:
                {
                alt62=9;
                }
                break;
            case 75:
                {
                alt62=10;
                }
                break;
            case 29:
                {
                alt62=11;
                }
                break;
            case 76:
                {
                alt62=12;
                }
                break;
            case 77:
                {
                alt62=13;
                }
                break;
            case 78:
                {
                alt62=14;
                }
                break;
            case 79:
                {
                alt62=15;
                }
                break;
            case 80:
                {
                alt62=16;
                }
                break;
            case 81:
                {
                alt62=17;
                }
                break;
            case 82:
                {
                alt62=18;
                }
                break;
            case 25:
                {
                alt62=19;
                }
                break;
            case 83:
                {
                alt62=20;
                }
                break;
            case 84:
                {
                alt62=21;
                }
                break;
            case 85:
                {
                alt62=22;
                }
                break;
            case 86:
                {
                alt62=23;
                }
                break;
            case 87:
                {
                alt62=24;
                }
                break;
            case 88:
                {
                alt62=25;
                }
                break;
            case 89:
                {
                alt62=26;
                }
                break;
            case 90:
                {
                alt62=27;
                }
                break;
            case 91:
                {
                alt62=28;
                }
                break;
            case 92:
                {
                alt62=29;
                }
                break;
            case 93:
                {
                alt62=30;
                }
                break;
            case 94:
                {
                alt62=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3482:2: (enumLiteral_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3482:2: (enumLiteral_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3482:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_rulePhase8003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3488:6: (enumLiteral_1= 'pre-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3488:6: (enumLiteral_1= 'pre-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3488:8: enumLiteral_1= 'pre-clean'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_rulePhase8020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3494:6: (enumLiteral_2= 'clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3494:6: (enumLiteral_2= 'clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3494:8: enumLiteral_2= 'clean'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_rulePhase8037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3500:6: (enumLiteral_3= 'post-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3500:6: (enumLiteral_3= 'post-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3500:8: enumLiteral_3= 'post-clean'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_69_in_rulePhase8054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3506:6: (enumLiteral_4= 'validate' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3506:6: (enumLiteral_4= 'validate' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3506:8: enumLiteral_4= 'validate'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_70_in_rulePhase8071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3512:6: (enumLiteral_5= 'initialize' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3512:6: (enumLiteral_5= 'initialize' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3512:8: enumLiteral_5= 'initialize'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_71_in_rulePhase8088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3518:6: (enumLiteral_6= 'generate-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3518:6: (enumLiteral_6= 'generate-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3518:8: enumLiteral_6= 'generate-sources'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_72_in_rulePhase8105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3524:6: (enumLiteral_7= 'process-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3524:6: (enumLiteral_7= 'process-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3524:8: enumLiteral_7= 'process-sources'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_73_in_rulePhase8122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3530:6: (enumLiteral_8= 'generate-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3530:6: (enumLiteral_8= 'generate-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3530:8: enumLiteral_8= 'generate-resources'
                    {
                    enumLiteral_8=(Token)match(input,74,FOLLOW_74_in_rulePhase8139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3536:6: (enumLiteral_9= 'process-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3536:6: (enumLiteral_9= 'process-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3536:8: enumLiteral_9= 'process-resources'
                    {
                    enumLiteral_9=(Token)match(input,75,FOLLOW_75_in_rulePhase8156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3542:6: (enumLiteral_10= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3542:6: (enumLiteral_10= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3542:8: enumLiteral_10= 'compile'
                    {
                    enumLiteral_10=(Token)match(input,29,FOLLOW_29_in_rulePhase8173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3548:6: (enumLiteral_11= 'process-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3548:6: (enumLiteral_11= 'process-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3548:8: enumLiteral_11= 'process-classes'
                    {
                    enumLiteral_11=(Token)match(input,76,FOLLOW_76_in_rulePhase8190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3554:6: (enumLiteral_12= 'generate-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3554:6: (enumLiteral_12= 'generate-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3554:8: enumLiteral_12= 'generate-test-sources'
                    {
                    enumLiteral_12=(Token)match(input,77,FOLLOW_77_in_rulePhase8207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3560:6: (enumLiteral_13= 'process-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3560:6: (enumLiteral_13= 'process-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3560:8: enumLiteral_13= 'process-test-sources'
                    {
                    enumLiteral_13=(Token)match(input,78,FOLLOW_78_in_rulePhase8224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3566:6: (enumLiteral_14= 'generate-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3566:6: (enumLiteral_14= 'generate-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3566:8: enumLiteral_14= 'generate-test-resources'
                    {
                    enumLiteral_14=(Token)match(input,79,FOLLOW_79_in_rulePhase8241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3572:6: (enumLiteral_15= 'process-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3572:6: (enumLiteral_15= 'process-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3572:8: enumLiteral_15= 'process-test-resources'
                    {
                    enumLiteral_15=(Token)match(input,80,FOLLOW_80_in_rulePhase8258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3578:6: (enumLiteral_16= 'test-compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3578:6: (enumLiteral_16= 'test-compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3578:8: enumLiteral_16= 'test-compile'
                    {
                    enumLiteral_16=(Token)match(input,81,FOLLOW_81_in_rulePhase8275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3584:6: (enumLiteral_17= 'process-test-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3584:6: (enumLiteral_17= 'process-test-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3584:8: enumLiteral_17= 'process-test-classes'
                    {
                    enumLiteral_17=(Token)match(input,82,FOLLOW_82_in_rulePhase8292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3590:6: (enumLiteral_18= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3590:6: (enumLiteral_18= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3590:8: enumLiteral_18= 'test'
                    {
                    enumLiteral_18=(Token)match(input,25,FOLLOW_25_in_rulePhase8309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3596:6: (enumLiteral_19= 'prepare-package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3596:6: (enumLiteral_19= 'prepare-package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3596:8: enumLiteral_19= 'prepare-package'
                    {
                    enumLiteral_19=(Token)match(input,83,FOLLOW_83_in_rulePhase8326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3602:6: (enumLiteral_20= 'package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3602:6: (enumLiteral_20= 'package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3602:8: enumLiteral_20= 'package'
                    {
                    enumLiteral_20=(Token)match(input,84,FOLLOW_84_in_rulePhase8343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3608:6: (enumLiteral_21= 'pre-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3608:6: (enumLiteral_21= 'pre-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3608:8: enumLiteral_21= 'pre-integration-test'
                    {
                    enumLiteral_21=(Token)match(input,85,FOLLOW_85_in_rulePhase8360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3614:6: (enumLiteral_22= 'integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3614:6: (enumLiteral_22= 'integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3614:8: enumLiteral_22= 'integration-test'
                    {
                    enumLiteral_22=(Token)match(input,86,FOLLOW_86_in_rulePhase8377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3620:6: (enumLiteral_23= 'post-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3620:6: (enumLiteral_23= 'post-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3620:8: enumLiteral_23= 'post-integration-test'
                    {
                    enumLiteral_23=(Token)match(input,87,FOLLOW_87_in_rulePhase8394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:6: (enumLiteral_24= 'verify' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:6: (enumLiteral_24= 'verify' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:8: enumLiteral_24= 'verify'
                    {
                    enumLiteral_24=(Token)match(input,88,FOLLOW_88_in_rulePhase8411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:6: (enumLiteral_25= 'install' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:6: (enumLiteral_25= 'install' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:8: enumLiteral_25= 'install'
                    {
                    enumLiteral_25=(Token)match(input,89,FOLLOW_89_in_rulePhase8428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:6: (enumLiteral_26= 'deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:6: (enumLiteral_26= 'deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:8: enumLiteral_26= 'deploy'
                    {
                    enumLiteral_26=(Token)match(input,90,FOLLOW_90_in_rulePhase8445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_26, grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26()); 
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:6: (enumLiteral_27= 'pre-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:6: (enumLiteral_27= 'pre-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:8: enumLiteral_27= 'pre-site'
                    {
                    enumLiteral_27=(Token)match(input,91,FOLLOW_91_in_rulePhase8462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_27, grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27()); 
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:6: (enumLiteral_28= 'site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:6: (enumLiteral_28= 'site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:8: enumLiteral_28= 'site'
                    {
                    enumLiteral_28=(Token)match(input,92,FOLLOW_92_in_rulePhase8479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_28, grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28()); 
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:6: (enumLiteral_29= 'post-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:6: (enumLiteral_29= 'post-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:8: enumLiteral_29= 'post-site'
                    {
                    enumLiteral_29=(Token)match(input,93,FOLLOW_93_in_rulePhase8496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_29, grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29()); 
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:6: (enumLiteral_30= 'site-deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:6: (enumLiteral_30= 'site-deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:8: enumLiteral_30= 'site-deploy'
                    {
                    enumLiteral_30=(Token)match(input,94,FOLLOW_94_in_rulePhase8513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getSITE_DEPLOYEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_30, grammarAccess.getPhaseAccess().getSITE_DEPLOYEnumLiteralDeclaration_30()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "ruleRepositoryUpdatePolicy"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3672:1: ruleRepositoryUpdatePolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) ) ;
    public final Enumerator ruleRepositoryUpdatePolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3674:28: ( ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3675:1: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3675:1: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt63=1;
                }
                break;
            case 96:
                {
                alt63=2;
                }
                break;
            case 97:
                {
                alt63=3;
                }
                break;
            case 63:
                {
                alt63=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3675:2: (enumLiteral_0= 'daily' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3675:2: (enumLiteral_0= 'daily' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3675:4: enumLiteral_0= 'daily'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_95_in_ruleRepositoryUpdatePolicy8558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getDAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRepositoryUpdatePolicyAccess().getDAILYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3681:6: (enumLiteral_1= 'always' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3681:6: (enumLiteral_1= 'always' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3681:8: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_96_in_ruleRepositoryUpdatePolicy8575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getALWAYSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRepositoryUpdatePolicyAccess().getALWAYSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3687:6: (enumLiteral_2= 'never' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3687:6: (enumLiteral_2= 'never' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3687:8: enumLiteral_2= 'never'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_97_in_ruleRepositoryUpdatePolicy8592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getNEVEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRepositoryUpdatePolicyAccess().getNEVEREnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3693:6: (enumLiteral_3= 'interval' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3693:6: (enumLiteral_3= 'interval' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3693:8: enumLiteral_3= 'interval'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleRepositoryUpdatePolicy8609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getINTERVALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRepositoryUpdatePolicyAccess().getINTERVALEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryUpdatePolicy"


    // $ANTLR start "ruleChecksumPolicy"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3703:1: ruleChecksumPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) ) ;
    public final Enumerator ruleChecksumPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3705:28: ( ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3706:1: ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3706:1: ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt64=1;
                }
                break;
            case 99:
                {
                alt64=2;
                }
                break;
            case 100:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3706:2: (enumLiteral_0= 'ignore' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3706:2: (enumLiteral_0= 'ignore' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3706:4: enumLiteral_0= 'ignore'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_98_in_ruleChecksumPolicy8654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getChecksumPolicyAccess().getIGNOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getChecksumPolicyAccess().getIGNOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3712:6: (enumLiteral_1= 'warn' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3712:6: (enumLiteral_1= 'warn' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3712:8: enumLiteral_1= 'warn'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_99_in_ruleChecksumPolicy8671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getChecksumPolicyAccess().getWARNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getChecksumPolicyAccess().getWARNEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3718:6: (enumLiteral_2= 'fail' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3718:6: (enumLiteral_2= 'fail' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3718:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_100_in_ruleChecksumPolicy8688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getChecksumPolicyAccess().getFAILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getChecksumPolicyAccess().getFAILEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChecksumPolicy"

    // $ANTLR start synpred1_InternalPom
    public final void synpred1_InternalPom_fragment() throws RecognitionException {   
        // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:3: ( ( '-' | '.' | '_' ) )
        // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:4: ( '-' | '.' | '_' )
        {
        if ( (input.LA(1)>=20 && input.LA(1)<=22) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalPom

    // Delegated rules

    public final boolean synpred1_InternalPom() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPom_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\1\11\uffff";
    static final String DFA7_minS =
        "\1\30\1\uffff\1\5\4\uffff\1\25\1\5\1\uffff";
    static final String DFA7_maxS =
        "\1\67\1\uffff\1\5\4\uffff\1\25\1\41\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\6\1\uffff\1\2\1\3\1\4\1\5\2\uffff\1\1";
    static final String DFA7_specialS =
        "\1\1\7\uffff\1\0\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\5\3\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff\1\4\2\uffff"+
            "\1\5\1\uffff\3\5\14\uffff\2\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\1\5\uffff\1\1\4\uffff\1\1\10\uffff\5\1\3\uffff\1\11",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 160:3: ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_9_0= ruleRepository ) ) )+ ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA7_8 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {s = 9;}

                        else if ( (LA7_8==RULE_ID||LA7_8==11||LA7_8==16||(LA7_8>=25 && LA7_8<=29)) ) {s = 1;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==EOF||LA7_0==28) ) {s = 1;}

                        else if ( (LA7_0==32) ) {s = 2;}

                        else if ( LA7_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA7_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( (LA7_0==24||LA7_0==37|| LA7_0 >=39 && LA7_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA7_0 >=54 && LA7_0<=55 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\15\uffff";
    static final String DFA19_eofS =
        "\1\1\1\uffff\1\7\5\uffff\2\7\2\uffff\1\7";
    static final String DFA19_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\5\1\uffff\1\24\3\5\1\24";
    static final String DFA19_maxS =
        "\1\103\1\uffff\1\103\2\uffff\1\52\1\35\1\uffff\1\63\1\103\1\35"+
        "\1\27\1\63";
    static final String DFA19_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String DFA19_specialS =
        "\15\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\3\1\4\3\uffff\2\1\1\uffff\6\1\1\uffff\1\1\2\uffff"+
            "\7\1\1\uffff\1\1\1\uffff\4\1\1\uffff\3\1\11\uffff\5\1\11\uffff"+
            "\3\1",
            "",
            "\4\7\3\uffff\2\7\1\uffff\6\7\1\1\1\5\1\1\1\uffff\7\7\1\uffff"+
            "\1\7\1\uffff\4\7\1\uffff\3\7\11\uffff\1\6\4\7\11\uffff\3\7",
            "",
            "",
            "\1\10\5\uffff\1\1\4\uffff\1\1\10\uffff\5\1\14\uffff\1\7",
            "\1\11\5\uffff\1\1\4\uffff\1\1\10\uffff\5\1",
            "",
            "\1\12\2\1\5\uffff\1\7\3\uffff\1\7\22\uffff\1\1",
            "\1\7\5\uffff\1\7\4\uffff\1\7\3\uffff\3\1\1\uffff\6\7\2\uffff"+
            "\1\7\3\uffff\1\7\16\uffff\1\13\1\7\14\uffff\3\7",
            "\1\14\5\uffff\1\1\4\uffff\1\1\10\uffff\5\1",
            "\1\7\1\1\20\uffff\1\1",
            "\1\12\2\1\5\uffff\1\7\3\uffff\1\7\22\uffff\1\1"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 875:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*";
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\13\uffff";
    static final String DFA26_minS =
        "\1\5\2\uffff\6\5\2\uffff";
    static final String DFA26_maxS =
        "\1\103\2\uffff\1\63\3\44\1\63\1\44\2\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\4\1\1\6\uffff\1\3\1\2";
    static final String DFA26_specialS =
        "\13\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\11\5\uffff\1\11\4\uffff\1\11\7\uffff\1\1\1\7\3\11\1\3\2"+
            "\uffff\1\2\3\uffff\1\11\17\uffff\1\10\14\uffff\1\4\1\5\1\6",
            "",
            "",
            "\1\11\5\uffff\1\11\4\uffff\1\11\3\uffff\3\11\2\uffff\5\11"+
            "\5\uffff\1\12\1\11\16\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\5\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\5\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\5\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\3\uffff\3\11\2\uffff\5\11"+
            "\5\uffff\1\12\1\11\16\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\5\11\5\uffff\1\12"+
            "\1\11",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1369:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+";
        }
    }
    static final String DFA32_eotS =
        "\13\uffff";
    static final String DFA32_eofS =
        "\1\1\12\uffff";
    static final String DFA32_minS =
        "\1\30\1\uffff\5\0\4\uffff";
    static final String DFA32_maxS =
        "\1\67\1\uffff\5\0\4\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\5\5\uffff\1\1\1\2\1\3\1\4";
    static final String DFA32_specialS =
        "\2\uffff\1\0\1\4\1\1\1\3\1\2\4\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\6\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff"+
            "\1\2\1\uffff\1\3\1\4\1\5\14\uffff\2\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1693:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePOM_in_entryRulePOM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_rulePOM131 = new BitSet(new long[]{0x00D003A5510FD800L});
    public static final BitSet FOLLOW_ruleParentRef_in_rulePOM153 = new BitSet(new long[]{0x00C003A5510FD000L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_rulePOM175 = new BitSet(new long[]{0x00C003A551001002L});
    public static final BitSet FOLLOW_ruleModules_in_rulePOM196 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_rulePOM263 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePOM339 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_rulePOM415 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_ruleSCM_in_rulePOM490 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_ruleRepository_in_rulePOM565 = new BitSet(new long[]{0x00C003A551000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_rulePOM627 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_ruleParentRef_in_entryRuleParentRef664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentRef674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleParentRef711 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_ruleParentRef732 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParentRef749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModules_in_entryRuleModules791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModules801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModules838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules855 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleModules873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules890 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifactDefinition943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArtifactDefinition990 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition1011 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_15_in_ruleArtifactDefinition1026 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition1047 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_ruleArtifactDefinition1062 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleArtifactDefinition1083 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_17_in_ruleArtifactDefinition1098 = new BitSet(new long[]{0x00000000000C00E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleArtifactDefinition1119 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleArtifactDefinition1179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1196 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_19_in_ruleArtifactDefinition1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1286 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndDash1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1432 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIDAndDash1451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1466 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1586 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_20_in_ruleIDAndSpecialCharacters1639 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_21_in_ruleIDAndSpecialCharacters1658 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_22_in_ruleIDAndSpecialCharacters1677 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1701 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1996 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleText2029 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2055 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_entryRulePropertyRef2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRef2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePropertyRef2253 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_rulePropertyName_in_rulePropertyRef2275 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyRef2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPropteryRef2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_ruleIDOrPropteryRef2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrKW2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrKW2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIDOrKW2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleIDOrKW2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIDOrKW2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIDOrKW2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIDOrKW2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIDOrKW2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIDOrKW2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2757 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2770 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2791 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2825 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2842 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleVersion2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_ruleVersion2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleProperty2976 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleProperty2997 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProperty3009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInclusion3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePropertyInclusion3114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyInclusion3134 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePropertyInclusion3146 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePropertyInclusion3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_entryRuleDependencies3194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencies3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDependencies3250 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDependencies3262 = new BitSet(new long[]{0x001000113E010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_ruleDependencies3284 = new BitSet(new long[]{0x001000113F010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_ruleDependencies3311 = new BitSet(new long[]{0x001000113F010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_ruleDependencies3338 = new BitSet(new long[]{0x001000113F010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_24_in_ruleDependencies3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyGroup3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3444 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDependencyGroup3456 = new BitSet(new long[]{0x001000113E010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDependencyGroup3477 = new BitSet(new long[]{0x001000113F010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_24_in_ruleDependencyGroup3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUngroupedDependency3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3582 = new BitSet(new long[]{0x001000113E010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDependency_in_ruleUngroupedDependency3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDependency3693 = new BitSet(new long[]{0x001000113E010820L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_ruleDependency3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyInclusion3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDependencyInclusion3811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyInclusion3831 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDependencyInclusion3843 = new BitSet(new long[]{0x0010000022000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSCM3992 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSCM4004 = new BitSet(new long[]{0x000003E001000002L});
    public static final BitSet FOLLOW_38_in_ruleSCM4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4034 = new BitSet(new long[]{0x000003A001000002L});
    public static final BitSet FOLLOW_39_in_ruleSCM4109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4126 = new BitSet(new long[]{0x000003A001000002L});
    public static final BitSet FOLLOW_40_in_ruleSCM4199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4216 = new BitSet(new long[]{0x000003A001000002L});
    public static final BitSet FOLLOW_41_in_ruleSCM4290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4307 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSCM4326 = new BitSet(new long[]{0x000003A001000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin4408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePlugin4455 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePlugin4476 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePlugin4488 = new BitSet(new long[]{0x0000040005000000L});
    public static final BitSet FOLLOW_42_in_rulePlugin4546 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePlugin4558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePlugin4579 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4591 = new BitSet(new long[]{0x0000040005000000L});
    public static final BitSet FOLLOW_rulePluginExecution_in_rulePlugin4667 = new BitSet(new long[]{0x0000040005000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfiguration4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4811 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationItem4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter5020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameter5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameter5072 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePluginConfigurationParameter5119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter5140 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameter5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList5192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterList5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5244 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePluginConfigurationParameterList5261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5278 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_13_in_rulePluginConfigurationParameterList5296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5313 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_rulePluginConfigurationParameterList5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5420 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePluginConfigurationParameterMap5437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5458 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterMap5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5559 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePluginConfigurationParameterMapEntry5576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5686 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePluginConfigurationParameterProperties5703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5724 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterProperties5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5825 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePluginConfigurationParameterPropertyEntry5842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginExecution_in_entryRulePluginExecution5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginExecution5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePluginExecution5947 = new BitSet(new long[]{0x0005400000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5970 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_rulePluginExecution5984 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulePluginExecution5996 = new BitSet(new long[]{0x000400002A000000L,0x000000007FFFFFF0L});
    public static final BitSet FOLLOW_rulePhase_in_rulePluginExecution6017 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePluginExecution6031 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePluginExecution6043 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_rulePluginExecution6064 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_13_in_rulePluginExecution6077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution6098 = new BitSet(new long[]{0x0000000800002002L});
    public static final BitSet FOLLOW_35_in_rulePluginExecution6113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePluginExecution6134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePluginExecution6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePluginExecution6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion6223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginInclusion6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePluginInclusion6270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginInclusion6290 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePluginInclusion6302 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePluginInclusion6323 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePluginInclusion6336 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginInclusion6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePluginInclusion6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_entryRuleBuildStep6434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildStep6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleBuildStep6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_ruleBuildStep6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates6553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6609 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleCoordinates6621 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6642 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleCoordinates6654 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleCoordinates6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedCoordinates6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates6767 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleExtendedCoordinates6779 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates6800 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleExtendedCoordinates6812 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtendedCoordinates6833 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExtendedCoordinates6846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedCoordinates6863 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExtendedCoordinates6881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_entryRulePOMImport6942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOMImport6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePOMImport6989 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePOMImport7010 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePOMImport7022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOMImport7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository7080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleRepository7128 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_55_in_ruleRepository7152 = new BitSet(new long[]{0x000000003E010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleRepository7187 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleRepository7199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7216 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleRepository7234 = new BitSet(new long[]{0x0E00000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepository7292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7309 = new BitSet(new long[]{0x0E00000000040000L});
    public static final BitSet FOLLOW_57_in_ruleRepository7382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7399 = new BitSet(new long[]{0x0E00000000040000L});
    public static final BitSet FOLLOW_ruleRepositoryPolicy_in_ruleRepository7466 = new BitSet(new long[]{0x0E00000001040000L});
    public static final BitSet FOLLOW_24_in_ruleRepository7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryPolicy_in_entryRuleRepositoryPolicy7517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryPolicy7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRepositoryPolicy7570 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleRepositoryPolicy7596 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRepositoryPolicy7615 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_61_in_ruleRepositoryPolicy7652 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryPolicy7679 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleRepositoryPolicy7691 = new BitSet(new long[]{0x8000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_ruleRepositoryUpdatePolicy_in_ruleRepositoryPolicy7712 = new BitSet(new long[]{0x0001000000002002L});
    public static final BitSet FOLLOW_48_in_ruleRepositoryPolicy7725 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleRepositoryPolicy7737 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleRepositoryPolicy7749 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepositoryPolicy7766 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryPolicy7788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRepositoryPolicy7800 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleChecksumPolicy_in_ruleRepositoryPolicy7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDependencyScope7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDependencyScope7890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDependencyScope7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDependencyScope7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDependencyScope7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDependencyScope7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePhase8003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePhase8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePhase8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePhase8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePhase8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePhase8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePhase8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePhase8122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePhase8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePhase8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePhase8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePhase8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePhase8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePhase8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePhase8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePhase8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePhase8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulePhase8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePhase8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rulePhase8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rulePhase8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rulePhase8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rulePhase8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rulePhase8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rulePhase8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulePhase8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulePhase8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulePhase8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulePhase8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulePhase8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulePhase8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRepositoryUpdatePolicy8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRepositoryUpdatePolicy8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRepositoryUpdatePolicy8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRepositoryUpdatePolicy8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleChecksumPolicy8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleChecksumPolicy8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleChecksumPolicy8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalPom1603 = new BitSet(new long[]{0x0000000000000002L});

}
