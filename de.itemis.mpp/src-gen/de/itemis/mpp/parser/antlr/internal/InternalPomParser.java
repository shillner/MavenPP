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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'parent'", "'modules'", "','", "'group'", "'artifact'", "'version'", "'type'", "'name'", "'description'", "'-'", "'.'", "'_'", "'${'", "'}'", "'test'", "'exec'", "'clean'", "'plugin'", "'compile'", "'file'", "'from'", "'include'", "'properties'", "'{'", "'='", "'dependencies'", "'optional'", "'scm'", "'con'", "'dev'", "'url'", "'tag'", "'config'", "'['", "']'", "'->'", "'in'", "'phase'", "'with'", "'goals'", "'default'", "':'", "'import'", "'as'", "'repository'", "'plugin-repository'", "'at'", "'layout'", "'do not'", "'fetch'", "'releases'", "'snapshots'", "'update'", "'interval'", "'checksumPolicy'", "'provided'", "'runtime'", "'system'", "'pre-clean'", "'post-clean'", "'validate'", "'initialize'", "'generate-sources'", "'process-sources'", "'generate-resources'", "'process-resources'", "'process-classes'", "'generate-test-sources'", "'process-test-sources'", "'generate-test-resources'", "'process-test-resources'", "'test-compile'", "'process-test-classes'", "'prepare-package'", "'package'", "'pre-integration-test'", "'integration-test'", "'post-integration-test'", "'verify'", "'install'", "'deploy'", "'pre-site'", "'site'", "'post-site'", "'site-deploy'", "'daily'", "'always'", "'never'", "'ignore'", "'warn'", "'fail'"
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
    public static final int T__101=101;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:77:1: rulePOM returns [EObject current=null] : ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* ) ;
    public final EObject rulePOM() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_parent_1_0 = null;

        EObject lv_artifactDefinition_2_0 = null;

        EObject lv_modules_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_dependencies_6_0 = null;

        EObject lv_scm_7_0 = null;

        EObject lv_repositories_8_0 = null;

        EObject lv_buildSteps_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:80:28: ( ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==53) ) {
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:153:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:156:2: ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPOMAccess().getUnorderedGroup_4());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:159:2: ( ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {
                    alt5=2;
                }
                else if ( (LA5_0==24||LA5_0==38|| LA5_0 >=40 && LA5_0<=42) && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 >=55 && LA5_0<=56 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:163:5: {...}? => ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:163:100: ( ({...}? => ( (lv_properties_5_0= ruleProperties ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:164:6: ({...}? => ( (lv_properties_5_0= ruleProperties ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:6: ({...}? => ( (lv_properties_5_0= ruleProperties ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:7: {...}? => ( (lv_properties_5_0= ruleProperties ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:16: ( (lv_properties_5_0= ruleProperties ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_properties_5_0= ruleProperties )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_properties_5_0= ruleProperties )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:169:3: lv_properties_5_0= ruleProperties
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getPropertiesPropertiesParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperties_in_rulePOM263);
            	    lv_properties_5_0=ruleProperties();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"properties",
            	              		lv_properties_5_0, 
            	              		"Properties");
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
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:192:4: ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:192:4: ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:193:5: {...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:193:100: ( ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:194:6: ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:6: ({...}? => ( (lv_dependencies_6_0= ruleDependencies ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:7: {...}? => ( (lv_dependencies_6_0= ruleDependencies ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:16: ( (lv_dependencies_6_0= ruleDependencies ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_dependencies_6_0= ruleDependencies )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_dependencies_6_0= ruleDependencies )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:199:3: lv_dependencies_6_0= ruleDependencies
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getDependenciesDependenciesParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencies_in_rulePOM338);
            	    lv_dependencies_6_0=ruleDependencies();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"dependencies",
            	              		lv_dependencies_6_0, 
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
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:222:4: ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:222:4: ({...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:223:5: {...}? => ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:223:100: ( ({...}? => ( (lv_scm_7_0= ruleSCM ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:224:6: ({...}? => ( (lv_scm_7_0= ruleSCM ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:6: ({...}? => ( (lv_scm_7_0= ruleSCM ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:7: {...}? => ( (lv_scm_7_0= ruleSCM ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:16: ( (lv_scm_7_0= ruleSCM ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_scm_7_0= ruleSCM )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_scm_7_0= ruleSCM )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:229:3: lv_scm_7_0= ruleSCM
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getScmSCMParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSCM_in_rulePOM413);
            	    lv_scm_7_0=ruleSCM();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"scm",
            	              		lv_scm_7_0, 
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
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:252:4: ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:252:4: ({...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:253:5: {...}? => ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:253:100: ( ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:254:6: ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:6: ({...}? => ( (lv_repositories_8_0= ruleRepository ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==55) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( (LA4_0==56) ) {
            	            int LA4_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:7: {...}? => ( (lv_repositories_8_0= ruleRepository ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:16: ( (lv_repositories_8_0= ruleRepository ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_repositories_8_0= ruleRepository )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_repositories_8_0= ruleRepository )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:259:3: lv_repositories_8_0= ruleRepository
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPOMAccess().getRepositoriesRepositoryParserRuleCall_4_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleRepository_in_rulePOM488);
            	    	    lv_repositories_8_0=ruleRepository();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"repositories",
            	    	              		lv_repositories_8_0, 
            	    	              		"Repository");
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

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPOMAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "rulePOM", "getUnorderedGroupHelper().canLeave(grammarAccess.getPOMAccess().getUnorderedGroup_4())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPOMAccess().getUnorderedGroup_4());

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:290:2: ( (lv_buildSteps_9_0= ruleBuildStep ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:291:1: (lv_buildSteps_9_0= ruleBuildStep )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:291:1: (lv_buildSteps_9_0= ruleBuildStep )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:292:3: lv_buildSteps_9_0= ruleBuildStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPOMAccess().getBuildStepsBuildStepParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBuildStep_in_rulePOM556);
            	    lv_buildSteps_9_0=ruleBuildStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPOMRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"buildSteps",
            	              		lv_buildSteps_9_0, 
            	              		"BuildStep");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:316:1: entryRuleParentRef returns [EObject current=null] : iv_ruleParentRef= ruleParentRef EOF ;
    public final EObject entryRuleParentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:317:2: (iv_ruleParentRef= ruleParentRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:318:2: iv_ruleParentRef= ruleParentRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentRefRule()); 
            }
            pushFollow(FOLLOW_ruleParentRef_in_entryRuleParentRef593);
            iv_ruleParentRef=ruleParentRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentRef603); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:325:1: ruleParentRef returns [EObject current=null] : (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleParentRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_relativePath_2_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:328:28: ( (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:329:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:329:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:329:3: otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleParentRef640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParentRefAccess().getParentKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:333:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:334:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:334:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:335:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParentRefAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_ruleParentRef661);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:351:2: ( (lv_relativePath_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:352:1: (lv_relativePath_2_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:352:1: (lv_relativePath_2_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:353:3: lv_relativePath_2_0= RULE_STRING
                    {
                    lv_relativePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParentRef678); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:377:1: entryRuleModules returns [EObject current=null] : iv_ruleModules= ruleModules EOF ;
    public final EObject entryRuleModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModules = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:378:2: (iv_ruleModules= ruleModules EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:379:2: iv_ruleModules= ruleModules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulesRule()); 
            }
            pushFollow(FOLLOW_ruleModules_in_entryRuleModules720);
            iv_ruleModules=ruleModules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModules; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModules730); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:386:1: ruleModules returns [EObject current=null] : (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:389:28: ( (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:390:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:390:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:390:3: otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModules767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModulesAccess().getModulesKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:394:1: ( (lv_names_1_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:395:1: (lv_names_1_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:395:1: (lv_names_1_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:396:3: lv_names_1_0= RULE_STRING
            {
            lv_names_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules784); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:412:2: (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:412:4: otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModules802); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getModulesAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:416:1: ( (lv_names_3_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:417:1: (lv_names_3_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:417:1: (lv_names_3_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:418:3: lv_names_3_0= RULE_STRING
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules819); if (state.failed) return current;
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
    // $ANTLR end "ruleModules"


    // $ANTLR start "entryRuleArtifactDefinition"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:442:1: entryRuleArtifactDefinition returns [EObject current=null] : iv_ruleArtifactDefinition= ruleArtifactDefinition EOF ;
    public final EObject entryRuleArtifactDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactDefinition = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:443:2: (iv_ruleArtifactDefinition= ruleArtifactDefinition EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:444:2: iv_ruleArtifactDefinition= ruleArtifactDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArtifactDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition862);
            iv_ruleArtifactDefinition=ruleArtifactDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArtifactDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifactDefinition872); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:451:1: ruleArtifactDefinition returns [EObject current=null] : ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:28: ( ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:2: () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:456:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArtifactDefinitionAccess().getArtifactDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:461:2: (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:461:4: otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArtifactDefinition919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArtifactDefinitionAccess().getGroupKeyword_1_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:465:1: ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:466:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:466:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:467:3: lv_groupId_2_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition940);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:483:4: (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:483:6: otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArtifactDefinition955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArtifactDefinitionAccess().getArtifactKeyword_2_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:487:1: ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:488:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:488:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:489:3: lv_artifactId_4_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition976);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:505:4: (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:505:6: otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleArtifactDefinition991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArtifactDefinitionAccess().getVersionKeyword_3_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:509:1: ( (lv_version_6_0= ruleVersion ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:510:1: (lv_version_6_0= ruleVersion )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:510:1: (lv_version_6_0= ruleVersion )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:511:3: lv_version_6_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getVersionVersionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleArtifactDefinition1012);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:527:4: (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:527:6: otherlv_7= 'type' ( (lv_type_8_0= ruleText ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleArtifactDefinition1027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getArtifactDefinitionAccess().getTypeKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:531:1: ( (lv_type_8_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:532:1: (lv_type_8_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:532:1: (lv_type_8_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:533:3: lv_type_8_0= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getTypeTextParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleText_in_ruleArtifactDefinition1048);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:549:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:551:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:551:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:552:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:555:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:556:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:556:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:558:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:558:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:559:5: {...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:559:115: ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:560:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:563:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:563:7: {...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:563:16: (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:563:18: otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleArtifactDefinition1108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getArtifactDefinitionAccess().getNameKeyword_5_0_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:567:1: ( (lv_artifactName_11_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:568:1: (lv_artifactName_11_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:568:1: (lv_artifactName_11_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:569:3: lv_artifactName_11_0= RULE_STRING
            	    {
            	    lv_artifactName_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1125); if (state.failed) return current;
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:593:5: {...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:593:115: ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:594:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:7: {...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:16: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:597:18: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleArtifactDefinition1198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getArtifactDefinitionAccess().getDescriptionKeyword_5_1_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:601:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:602:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:602:1: (lv_description_13_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:603:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1215); if (state.failed) return current;
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
            	    break loop13;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:643:1: entryRuleIDAndDash returns [String current=null] : iv_ruleIDAndDash= ruleIDAndDash EOF ;
    public final String entryRuleIDAndDash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndDash = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:647:2: (iv_ruleIDAndDash= ruleIDAndDash EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:648:2: iv_ruleIDAndDash= ruleIDAndDash EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDAndDashRule()); 
            }
            pushFollow(FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1306);
            iv_ruleIDAndDash=ruleIDAndDash();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDAndDash.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndDash1317); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:658:1: ruleIDAndDash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndDash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:662:28: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:663:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:663:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:663:6: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:670:1: (kw= '-' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:671:2: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndDash1380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getIDAndDashAccess().getHyphenMinusKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1395); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:694:1: entryRuleIDAndSpecialCharacters returns [String current=null] : iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF ;
    public final String entryRuleIDAndSpecialCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndSpecialCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:698:2: (iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:699:2: iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDAndSpecialCharactersRule()); 
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1453);
            iv_ruleIDAndSpecialCharacters=ruleIDAndSpecialCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDAndSpecialCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1464); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:709:1: ruleIDAndSpecialCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndSpecialCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDOrKW_0 = null;

        AntlrDatatypeRuleToken this_IDOrKW_4 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:713:28: ( (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:714:1: (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:714:1: (this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:715:5: this_IDOrKW_0= ruleIDOrKW ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIDAndSpecialCharactersAccess().getIDOrKWParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1515);
            this_IDOrKW_0=ruleIDOrKW();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDOrKW_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:1: ( ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) && (synpred1_InternalPom())) {
                    alt16=1;
                }
                else if ( (LA16_0==21) && (synpred1_InternalPom())) {
                    alt16=1;
                }
                else if ( (LA16_0==22) && (synpred1_InternalPom())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:2: ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) ) this_IDOrKW_4= ruleIDOrKW
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:2: ( ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:3: ( ( '-' | '.' | '_' ) )=> (kw= '-' | kw= '.' | kw= '_' )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:733:5: (kw= '-' | kw= '.' | kw= '_' )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:734:2: kw= '-'
            	            {
            	            kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndSpecialCharacters1568); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getHyphenMinusKeyword_1_0_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:741:2: kw= '.'
            	            {
            	            kw=(Token)match(input,21,FOLLOW_21_in_ruleIDAndSpecialCharacters1587); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getFullStopKeyword_1_0_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:748:2: kw= '_'
            	            {
            	            kw=(Token)match(input,22,FOLLOW_22_in_ruleIDAndSpecialCharacters1606); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1630);
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
    // $ANTLR end "ruleIDAndSpecialCharacters"


    // $ANTLR start "entryRuleClassifier"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:777:1: entryRuleClassifier returns [String current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final String entryRuleClassifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifier = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:778:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:779:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1684);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1695); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:786:1: ruleClassifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:789:28: (this_ID_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:790:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1734); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:805:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:806:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:807:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1779);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1790); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:814:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:817:28: (this_INT_0= RULE_INT )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:818:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1829); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:833:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:834:2: (iv_ruleText= ruleText EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:835:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText1874);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1885); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:842:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Number_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:845:28: ( (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:846:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:846:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            loop17:
            do {
                int alt17=4;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:846:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1925); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:855:5: this_Number_1= ruleNumber
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTextAccess().getNumberParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNumber_in_ruleText1958);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:866:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText1984); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:881:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:882:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:883:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyNameRule()); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName2031);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName2042); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:890:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDAndSpecialCharacters_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:893:28: (this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:895:5: this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyNameAccess().getIDAndSpecialCharactersParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2088);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:913:1: entryRulePropertyRef returns [String current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final String entryRulePropertyRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:914:2: (iv_rulePropertyRef= rulePropertyRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:915:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRefRule()); 
            }
            pushFollow(FOLLOW_rulePropertyRef_in_entryRulePropertyRef2133);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyRef.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyRef2144); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:922:1: rulePropertyRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePropertyRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PropertyName_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:925:28: ( (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:926:1: (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:926:1: (kw= '${' this_PropertyName_1= rulePropertyName kw= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:927:2: kw= '${' this_PropertyName_1= rulePropertyName kw= '}'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulePropertyRef2182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPropertyRefAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyRefAccess().getPropertyNameParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_rulePropertyName_in_rulePropertyRef2204);
            this_PropertyName_1=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PropertyName_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_rulePropertyRef2222); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:957:1: entryRuleIDOrPropteryRef returns [String current=null] : iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF ;
    public final String entryRuleIDOrPropteryRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrPropteryRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:958:2: (iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:959:2: iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDOrPropteryRefRule()); 
            }
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2263);
            iv_ruleIDOrPropteryRef=ruleIDOrPropteryRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDOrPropteryRef.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPropteryRef2274); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:966:1: ruleIDOrPropteryRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef ) ;
    public final AntlrDatatypeRuleToken ruleIDOrPropteryRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDOrKW_0 = null;

        AntlrDatatypeRuleToken this_PropertyRef_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:969:28: ( (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:970:1: (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:970:1: (this_IDOrKW_0= ruleIDOrKW | this_PropertyRef_1= rulePropertyRef )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==11||LA18_0==16||(LA18_0>=25 && LA18_0<=32)) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:971:5: this_IDOrKW_0= ruleIDOrKW
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getIDOrKWParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2321);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:983:5: this_PropertyRef_1= rulePropertyRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getPropertyRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyRef_in_ruleIDOrPropteryRef2354);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1001:1: entryRuleIDOrKW returns [String current=null] : iv_ruleIDOrKW= ruleIDOrKW EOF ;
    public final String entryRuleIDOrKW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrKW = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1002:2: (iv_ruleIDOrKW= ruleIDOrKW EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1003:2: iv_ruleIDOrKW= ruleIDOrKW EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDOrKWRule()); 
            }
            pushFollow(FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2400);
            iv_ruleIDOrKW=ruleIDOrKW();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDOrKW.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrKW2411); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1010:1: ruleIDOrKW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' | kw= 'file' | kw= 'from' | kw= 'include' ) ;
    public final AntlrDatatypeRuleToken ruleIDOrKW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1013:28: ( (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' | kw= 'file' | kw= 'from' | kw= 'include' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1014:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' | kw= 'file' | kw= 'from' | kw= 'include' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1014:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' | kw= 'version' | kw= 'exec' | kw= 'clean' | kw= 'plugin' | kw= 'compile' | kw= 'file' | kw= 'from' | kw= 'include' )
            int alt19=11;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 25:
                {
                alt19=2;
                }
                break;
            case 11:
                {
                alt19=3;
                }
                break;
            case 16:
                {
                alt19=4;
                }
                break;
            case 26:
                {
                alt19=5;
                }
                break;
            case 27:
                {
                alt19=6;
                }
                break;
            case 28:
                {
                alt19=7;
                }
                break;
            case 29:
                {
                alt19=8;
                }
                break;
            case 30:
                {
                alt19=9;
                }
                break;
            case 31:
                {
                alt19=10;
                }
                break;
            case 32:
                {
                alt19=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1014:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrKW2451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIDOrKWAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1023:2: kw= 'test'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleIDOrKW2475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getTestKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1030:2: kw= 'parent'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleIDOrKW2494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getParentKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1037:2: kw= 'version'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleIDOrKW2513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getVersionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1044:2: kw= 'exec'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleIDOrKW2532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getExecKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1051:2: kw= 'clean'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleIDOrKW2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getCleanKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1058:2: kw= 'plugin'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleIDOrKW2570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getPluginKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1065:2: kw= 'compile'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleIDOrKW2589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getCompileKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1072:2: kw= 'file'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleIDOrKW2608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getFileKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1079:2: kw= 'from'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleIDOrKW2627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getFromKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1086:2: kw= 'include'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleIDOrKW2646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIDOrKWAccess().getIncludeKeyword_10()); 
                          
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1099:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1100:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1101:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2686);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2696); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:1: ruleVersion returns [EObject current=null] : ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1111:28: ( ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:1: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:1: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) | ( (lv_propertyRef_7_0= rulePropertyRef ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:2: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:2: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:3: ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:3: ( (lv_major_0_0= ruleNumber ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1113:1: (lv_major_0_0= ruleNumber )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1113:1: (lv_major_0_0= ruleNumber )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1114:3: lv_major_0_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVersionAccess().getMajorNumberParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2743);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1130:2: (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==RULE_INT) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1130:4: otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVersion2756); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_0_1_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1134:1: ( (lv_minor_2_0= ruleNumber ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1135:1: (lv_minor_2_0= ruleNumber )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1135:1: (lv_minor_2_0= ruleNumber )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1136:3: lv_minor_2_0= ruleNumber
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVersionAccess().getMinorNumberParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2777);
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

                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1152:2: (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==21) ) {
                                int LA20_1 = input.LA(2);

                                if ( (LA20_1==RULE_INT) ) {
                                    alt20=1;
                                }
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1152:4: otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) )
                                    {
                                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVersion2790); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_0_1_2_0());
                                          
                                    }
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1156:1: ( (lv_incremental_4_0= ruleNumber ) )
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1157:1: (lv_incremental_4_0= ruleNumber )
                                    {
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1157:1: (lv_incremental_4_0= ruleNumber )
                                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1158:3: lv_incremental_4_0= ruleNumber
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getVersionAccess().getIncrementalNumberParserRuleCall_0_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2811);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1174:6: (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==20) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1174:8: otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) )
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleVersion2828); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getHyphenMinusKeyword_0_2_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1178:1: ( (lv_qualifier_6_0= ruleText ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1179:1: (lv_qualifier_6_0= ruleText )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1179:1: (lv_qualifier_6_0= ruleText )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1180:3: lv_qualifier_6_0= ruleText
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVersionAccess().getQualifierTextParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleText_in_ruleVersion2849);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1197:6: ( (lv_propertyRef_7_0= rulePropertyRef ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1197:6: ( (lv_propertyRef_7_0= rulePropertyRef ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1198:1: (lv_propertyRef_7_0= rulePropertyRef )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1198:1: (lv_propertyRef_7_0= rulePropertyRef )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1199:3: lv_propertyRef_7_0= rulePropertyRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVersionAccess().getPropertyRefPropertyRefParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyRef_in_ruleVersion2879);
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


    // $ANTLR start "entryRuleProperties"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1223:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1224:2: (iv_ruleProperties= ruleProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1225:2: iv_ruleProperties= ruleProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleProperties_in_entryRuleProperties2915);
            iv_ruleProperties=ruleProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperties2925); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1232:1: ruleProperties returns [EObject current=null] : (otherlv_0= 'properties' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* ( (lv_inclusions_3_0= rulePropertyInclusion ) )* otherlv_4= '}' ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_properties_2_0 = null;

        EObject lv_inclusions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1235:28: ( (otherlv_0= 'properties' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* ( (lv_inclusions_3_0= rulePropertyInclusion ) )* otherlv_4= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1236:1: (otherlv_0= 'properties' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* ( (lv_inclusions_3_0= rulePropertyInclusion ) )* otherlv_4= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1236:1: (otherlv_0= 'properties' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* ( (lv_inclusions_3_0= rulePropertyInclusion ) )* otherlv_4= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1236:3: otherlv_0= 'properties' otherlv_1= '{' ( (lv_properties_2_0= ruleProperty ) )* ( (lv_inclusions_3_0= rulePropertyInclusion ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleProperties2962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getPropertiesKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleProperties2974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1244:1: ( (lv_properties_2_0= ruleProperty ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1>=20 && LA24_1<=22)||LA24_1==35) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==RULE_ID||LA24_0==11||LA24_0==16||(LA24_0>=25 && LA24_0<=31)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1245:1: (lv_properties_2_0= ruleProperty )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1245:1: (lv_properties_2_0= ruleProperty )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1246:3: lv_properties_2_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleProperties2995);
            	    lv_properties_2_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_2_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1262:3: ( (lv_inclusions_3_0= rulePropertyInclusion ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1263:1: (lv_inclusions_3_0= rulePropertyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1263:1: (lv_inclusions_3_0= rulePropertyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1264:3: lv_inclusions_3_0= rulePropertyInclusion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertiesAccess().getInclusionsPropertyInclusionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyInclusion_in_ruleProperties3017);
            	    lv_inclusions_3_0=rulePropertyInclusion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inclusions",
            	              		lv_inclusions_3_0, 
            	              		"PropertyInclusion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleProperties3030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleProperty"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1292:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1293:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1294:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3066);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3076); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1301:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1304:28: ( ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:1: ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:1: ( ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:2: ( (lv_name_0_0= rulePropertyName ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:2: ( (lv_name_0_0= rulePropertyName ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1306:1: (lv_name_0_0= rulePropertyName )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1306:1: (lv_name_0_0= rulePropertyName )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1307:3: lv_name_0_0= rulePropertyName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleProperty3122);
            lv_name_0_0=rulePropertyName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PropertyName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleProperty3134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1327:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1328:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1328:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1329:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty3151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleImportPropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1353:1: entryRuleImportPropertyInclusion returns [EObject current=null] : iv_ruleImportPropertyInclusion= ruleImportPropertyInclusion EOF ;
    public final EObject entryRuleImportPropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportPropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1354:2: (iv_ruleImportPropertyInclusion= ruleImportPropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1355:2: iv_ruleImportPropertyInclusion= ruleImportPropertyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportPropertyInclusionRule()); 
            }
            pushFollow(FOLLOW_ruleImportPropertyInclusion_in_entryRuleImportPropertyInclusion3192);
            iv_ruleImportPropertyInclusion=ruleImportPropertyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportPropertyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportPropertyInclusion3202); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportPropertyInclusion"


    // $ANTLR start "ruleImportPropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1362:1: ruleImportPropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleImportPropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1365:28: ( (otherlv_0= 'include' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1366:1: (otherlv_0= 'include' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1366:1: (otherlv_0= 'include' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1366:3: otherlv_0= 'include' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleImportPropertyInclusion3239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportPropertyInclusionAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleImportPropertyInclusion3251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportPropertyInclusionAccess().getFromKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1374:1: ( (otherlv_2= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:1: (otherlv_2= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:1: (otherlv_2= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1376:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getImportPropertyInclusionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportPropertyInclusion3271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getImportPropertyInclusionAccess().getPomRefPOMImportCrossReference_2_0()); 
              	
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
    // $ANTLR end "ruleImportPropertyInclusion"


    // $ANTLR start "entryRuleFilePropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1395:1: entryRuleFilePropertyInclusion returns [EObject current=null] : iv_ruleFilePropertyInclusion= ruleFilePropertyInclusion EOF ;
    public final EObject entryRuleFilePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1396:2: (iv_ruleFilePropertyInclusion= ruleFilePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1397:2: iv_ruleFilePropertyInclusion= ruleFilePropertyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilePropertyInclusionRule()); 
            }
            pushFollow(FOLLOW_ruleFilePropertyInclusion_in_entryRuleFilePropertyInclusion3307);
            iv_ruleFilePropertyInclusion=ruleFilePropertyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilePropertyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilePropertyInclusion3317); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilePropertyInclusion"


    // $ANTLR start "ruleFilePropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1404:1: ruleFilePropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= 'from' otherlv_2= 'file' ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFilePropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1407:28: ( (otherlv_0= 'include' otherlv_1= 'from' otherlv_2= 'file' ( (lv_path_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:1: (otherlv_0= 'include' otherlv_1= 'from' otherlv_2= 'file' ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:1: (otherlv_0= 'include' otherlv_1= 'from' otherlv_2= 'file' ( (lv_path_3_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:3: otherlv_0= 'include' otherlv_1= 'from' otherlv_2= 'file' ( (lv_path_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleFilePropertyInclusion3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFilePropertyInclusionAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleFilePropertyInclusion3366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFilePropertyInclusionAccess().getFromKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleFilePropertyInclusion3378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFilePropertyInclusionAccess().getFileKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1420:1: ( (lv_path_3_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1421:1: (lv_path_3_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1421:1: (lv_path_3_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1422:3: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFilePropertyInclusion3395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_3_0, grammarAccess.getFilePropertyInclusionAccess().getPathSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFilePropertyInclusionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_3_0, 
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
    // $ANTLR end "ruleFilePropertyInclusion"


    // $ANTLR start "entryRulePropertyInclusion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1446:1: entryRulePropertyInclusion returns [EObject current=null] : iv_rulePropertyInclusion= rulePropertyInclusion EOF ;
    public final EObject entryRulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1447:2: (iv_rulePropertyInclusion= rulePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1448:2: iv_rulePropertyInclusion= rulePropertyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyInclusionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion3436);
            iv_rulePropertyInclusion=rulePropertyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInclusion3446); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1455:1: rulePropertyInclusion returns [EObject current=null] : (this_ImportPropertyInclusion_0= ruleImportPropertyInclusion | this_FilePropertyInclusion_1= ruleFilePropertyInclusion ) ;
    public final EObject rulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject this_ImportPropertyInclusion_0 = null;

        EObject this_FilePropertyInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1458:28: ( (this_ImportPropertyInclusion_0= ruleImportPropertyInclusion | this_FilePropertyInclusion_1= ruleFilePropertyInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1459:1: (this_ImportPropertyInclusion_0= ruleImportPropertyInclusion | this_FilePropertyInclusion_1= ruleFilePropertyInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1459:1: (this_ImportPropertyInclusion_0= ruleImportPropertyInclusion | this_FilePropertyInclusion_1= ruleFilePropertyInclusion )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==31) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==30) ) {
                        alt26=2;
                    }
                    else if ( (LA26_2==RULE_ID) ) {
                        alt26=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1460:5: this_ImportPropertyInclusion_0= ruleImportPropertyInclusion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyInclusionAccess().getImportPropertyInclusionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportPropertyInclusion_in_rulePropertyInclusion3493);
                    this_ImportPropertyInclusion_0=ruleImportPropertyInclusion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImportPropertyInclusion_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1470:5: this_FilePropertyInclusion_1= ruleFilePropertyInclusion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyInclusionAccess().getFilePropertyInclusionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFilePropertyInclusion_in_rulePropertyInclusion3520);
                    this_FilePropertyInclusion_1=ruleFilePropertyInclusion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FilePropertyInclusion_1; 
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
    // $ANTLR end "rulePropertyInclusion"


    // $ANTLR start "entryRuleDependencies"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1486:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1487:2: (iv_ruleDependencies= ruleDependencies EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1488:2: iv_ruleDependencies= ruleDependencies EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependenciesRule()); 
            }
            pushFollow(FOLLOW_ruleDependencies_in_entryRuleDependencies3555);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencies; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencies3565); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1495:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1498:28: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1499:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1499:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1499:2: () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1499:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1500:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleDependencies3611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleDependencies3623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1513:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=4;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1513:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1513:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1514:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1514:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1515:3: lv_includes_3_0= ruleDependencyInclusion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getIncludesDependencyInclusionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencyInclusion_in_ruleDependencies3645);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1532:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1532:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1533:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1533:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1534:3: lv_dependencyGroups_4_0= ruleDependencyGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getDependencyGroupsDependencyGroupParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependencyGroup_in_ruleDependencies3672);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1551:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1551:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1552:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1552:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1553:3: lv_ungroupedDependencies_5_0= ruleUngroupedDependency
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependenciesAccess().getUngroupedDependenciesUngroupedDependencyParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUngroupedDependency_in_ruleDependencies3699);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDependencies3713); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1581:1: entryRuleDependencyGroup returns [EObject current=null] : iv_ruleDependencyGroup= ruleDependencyGroup EOF ;
    public final EObject entryRuleDependencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyGroup = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1582:2: (iv_ruleDependencyGroup= ruleDependencyGroup EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1583:2: iv_ruleDependencyGroup= ruleDependencyGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyGroupRule()); 
            }
            pushFollow(FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3749);
            iv_ruleDependencyGroup=ruleDependencyGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencyGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyGroup3759); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1590:1: ruleDependencyGroup returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDependencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_scope_0_0 = null;

        EObject lv_dependecies_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1593:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1594:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1594:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1594:2: ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1594:2: ( (lv_scope_0_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1595:1: (lv_scope_0_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1595:1: (lv_scope_0_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1596:3: lv_scope_0_0= ruleDependencyScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3805);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDependencyGroup3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDependencyGroupAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1616:1: ( (lv_dependecies_2_0= ruleDependency ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==11||LA28_0==16||(LA28_0>=25 && LA28_0<=32)||LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1617:1: (lv_dependecies_2_0= ruleDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1617:1: (lv_dependecies_2_0= ruleDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1618:3: lv_dependecies_2_0= ruleDependency
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getDependeciesDependencyParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDependency_in_ruleDependencyGroup3838);
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDependencyGroup3851); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1646:1: entryRuleUngroupedDependency returns [EObject current=null] : iv_ruleUngroupedDependency= ruleUngroupedDependency EOF ;
    public final EObject entryRuleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUngroupedDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1647:2: (iv_ruleUngroupedDependency= ruleUngroupedDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1648:2: iv_ruleUngroupedDependency= ruleUngroupedDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUngroupedDependencyRule()); 
            }
            pushFollow(FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3887);
            iv_ruleUngroupedDependency=ruleUngroupedDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUngroupedDependency; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUngroupedDependency3897); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1655:1: ruleUngroupedDependency returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) ;
    public final EObject ruleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_dependency_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1658:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1659:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1659:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1659:2: ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1659:2: ( (lv_scope_0_0= ruleDependencyScope ) )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||LA29_1==11||LA29_1==16||(LA29_1>=25 && LA29_1<=32)||LA29_1==37) ) {
                        alt29=1;
                    }
                    }
                    break;
                case 53:
                case 66:
                case 67:
                case 68:
                    {
                    alt29=1;
                    }
                    break;
                case 25:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==RULE_ID||LA29_3==11||LA29_3==16||(LA29_3>=25 && LA29_3<=32)||LA29_3==37) ) {
                        alt29=1;
                    }
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1660:1: (lv_scope_0_0= ruleDependencyScope )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1660:1: (lv_scope_0_0= ruleDependencyScope )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1661:3: lv_scope_0_0= ruleDependencyScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3943);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1677:3: ( (lv_dependency_1_0= ruleDependency ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1678:1: (lv_dependency_1_0= ruleDependency )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1678:1: (lv_dependency_1_0= ruleDependency )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1679:3: lv_dependency_1_0= ruleDependency
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getDependencyDependencyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependency_in_ruleUngroupedDependency3965);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1703:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1704:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1705:2: iv_ruleDependency= ruleDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyRule()); 
            }
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency4001);
            iv_ruleDependency=ruleDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependency; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency4011); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:1: ruleDependency returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1715:28: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1716:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1716:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1716:2: ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1716:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:1: (lv_optional_0_0= 'optional' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1718:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,37,FOLLOW_37_in_ruleDependency4054); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1731:3: ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1732:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1732:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1733:3: lv_coordinates_1_0= ruleExtendedCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyAccess().getCoordinatesExtendedCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_ruleDependency4089);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1757:1: entryRuleDependencyInclusion returns [EObject current=null] : iv_ruleDependencyInclusion= ruleDependencyInclusion EOF ;
    public final EObject entryRuleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1758:2: (iv_ruleDependencyInclusion= ruleDependencyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1759:2: iv_ruleDependencyInclusion= ruleDependencyInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyInclusionRule()); 
            }
            pushFollow(FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion4125);
            iv_ruleDependencyInclusion=ruleDependencyInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependencyInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyInclusion4135); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1766:1: ruleDependencyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) ;
    public final EObject ruleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1769:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1770:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1770:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1770:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDependencyInclusion4172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDependencyInclusionAccess().getIncludeKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1774:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1775:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1775:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1776:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDependencyInclusionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyInclusion4192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleDependencyInclusion4204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDependencyInclusionAccess().getFullStopKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1791:1: ( (lv_scope_3_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1792:1: (lv_scope_3_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1792:1: (lv_scope_3_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1793:3: lv_scope_3_0= ruleDependencyScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion4225);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1817:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1818:2: (iv_ruleSCM= ruleSCM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1819:2: iv_ruleSCM= ruleSCM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCMRule()); 
            }
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM4261);
            iv_ruleSCM=ruleSCM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCM; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM4271); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1826:1: ruleSCM returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1829:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1830:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1830:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1832:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1832:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1833:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getSCMAccess().getUnorderedGroup());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1836:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1837:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1837:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=5;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1839:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1839:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1840:5: {...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1840:98: ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1841:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1844:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1844:7: {...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1844:16: (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1844:18: otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSCM4353); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getScmKeyword_0_0());
            	          
            	    }
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleSCM4365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSCMAccess().getLeftCurlyBracketKeyword_0_1());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1852:1: (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==39) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1852:3: otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleSCM4378); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getSCMAccess().getConKeyword_0_2_0());
            	                  
            	            }
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1856:1: ( (lv_connection_4_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1857:1: (lv_connection_4_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1857:1: (lv_connection_4_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1858:3: lv_connection_4_0= RULE_STRING
            	            {
            	            lv_connection_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4395); if (state.failed) return current;
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1881:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1881:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1882:5: {...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1882:98: ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1883:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1886:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1886:7: {...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1886:16: (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1886:18: otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleSCM4470); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getSCMAccess().getDevKeyword_1_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1890:1: ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1891:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1891:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1892:3: lv_developerConncetion_6_0= RULE_STRING
            	    {
            	    lv_developerConncetion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4487); if (state.failed) return current;
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1916:5: {...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1916:98: ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1917:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 2);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1920:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1920:7: {...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1920:16: (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1920:18: otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleSCM4560); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getSCMAccess().getUrlKeyword_2_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1924:1: ( (lv_url_8_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1925:1: (lv_url_8_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1925:1: (lv_url_8_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1926:3: lv_url_8_0= RULE_STRING
            	    {
            	    lv_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4577); if (state.failed) return current;
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1949:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1949:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1950:5: {...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1950:98: ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1951:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 3);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:7: {...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:16: ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==42) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1954:19: otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleSCM4651); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getSCMAccess().getTagKeyword_3_0_0());
            	                  
            	            }
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1958:1: ( (lv_tag_10_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1959:1: (lv_tag_10_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1959:1: (lv_tag_10_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1960:3: lv_tag_10_0= RULE_STRING
            	            {
            	            lv_tag_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4668); if (state.failed) return current;
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

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSCM4687); if (state.failed) return current;
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
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2003:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2004:2: (iv_rulePlugin= rulePlugin EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2005:2: iv_rulePlugin= rulePlugin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginRule()); 
            }
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin4769);
            iv_rulePlugin=rulePlugin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlugin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin4779); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2012:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2015:28: ( (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2016:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2016:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2016:3: otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePlugin4816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2020:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2021:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2021:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2022:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPluginAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePlugin4837);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_rulePlugin4849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2042:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2045:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2048:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2049:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2049:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( LA35_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2051:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2051:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2052:5: {...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2052:103: ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2053:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2056:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2056:7: {...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2056:16: (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2056:18: otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}'
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_rulePlugin4907); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPluginAccess().getConfigKeyword_3_0_0());
            	          
            	    }
            	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_rulePlugin4919); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_3_0_1());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2064:1: ( (lv_configuration_6_0= rulePluginConfiguration ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2065:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2065:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2066:3: lv_configuration_6_0= rulePluginConfiguration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginAccess().getConfigurationPluginConfigurationParserRuleCall_3_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfiguration_in_rulePlugin4940);
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

            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlugin4952); if (state.failed) return current;
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2093:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2093:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2094:5: {...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2094:103: ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2095:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1);
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2098:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==26) ) {
            	            int LA34_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt34=1;
            	            }


            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2098:7: {...}? => ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2098:16: ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2099:1: (lv_executions_8_0= rulePluginExecution )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2099:1: (lv_executions_8_0= rulePluginExecution )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2100:3: lv_executions_8_0= rulePluginExecution
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getPluginAccess().getExecutionsPluginExecutionParserRuleCall_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_rulePluginExecution_in_rulePlugin5028);
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
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getPluginAccess().getUnorderedGroup_3());

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePlugin5081); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2142:1: entryRulePluginConfiguration returns [EObject current=null] : iv_rulePluginConfiguration= rulePluginConfiguration EOF ;
    public final EObject entryRulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfiguration = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2143:2: (iv_rulePluginConfiguration= rulePluginConfiguration EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2144:2: iv_rulePluginConfiguration= rulePluginConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration5117);
            iv_rulePluginConfiguration=rulePluginConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfiguration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfiguration5127); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:1: rulePluginConfiguration returns [EObject current=null] : ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ ;
    public final EObject rulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configurationItems_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2154:28: ( ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2155:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2155:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2156:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2156:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2157:3: lv_configurationItems_0_0= rulePluginConfigurationItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsPluginConfigurationItemParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration5172);
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
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2181:1: entryRulePluginConfigurationItem returns [EObject current=null] : iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF ;
    public final EObject entryRulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationItem = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2182:2: (iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2183:2: iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationItemRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem5208);
            iv_rulePluginConfigurationItem=rulePluginConfigurationItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationItem5218); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2190:1: rulePluginConfigurationItem returns [EObject current=null] : (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) ;
    public final EObject rulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject this_PluginConfigurationParameter_0 = null;

        EObject this_PluginConfigurationParameterList_1 = null;

        EObject this_PluginConfigurationParameterMap_2 = null;

        EObject this_PluginConfigurationParameterProperties_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2193:28: ( (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 24:
                    {
                    alt37=1;
                    }
                    break;
                case 34:
                    {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 35:
                            {
                            alt37=4;
                            }
                            break;
                        case RULE_STRING:
                        case RULE_ID:
                        case 24:
                        case 34:
                        case 44:
                            {
                            alt37=1;
                            }
                            break;
                        case 46:
                            {
                            alt37=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 44:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2195:5: this_PluginConfigurationParameter_0= rulePluginConfigurationParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem5265);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2205:5: this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem5292);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2215:5: this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterMapParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem5319);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2225:5: this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterPropertiesParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem5346);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2241:1: entryRulePluginConfigurationParameter returns [EObject current=null] : iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF ;
    public final EObject entryRulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameter = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2242:2: (iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2243:2: iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter5381);
            iv_rulePluginConfigurationParameter=rulePluginConfigurationParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameter5391); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2250:1: rulePluginConfigurationParameter returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) ;
    public final EObject rulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2253:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2254:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2254:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2254:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2254:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2255:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2255:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2256:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameter5433); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2272:2: ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==34) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2272:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2272:3: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2273:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2273:1: (lv_value_1_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2274:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter5456); if (state.failed) return current;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2291:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2291:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2291:8: otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_rulePluginConfigurationParameter5480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPluginConfigurationParameterAccess().getLeftCurlyBracketKeyword_1_1_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2295:1: ( (lv_children_3_0= rulePluginConfigurationItem ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2296:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2296:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2297:3: lv_children_3_0= rulePluginConfigurationItem
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterAccess().getChildrenPluginConfigurationItemParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter5501);
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameter5514); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2325:1: entryRulePluginConfigurationParameterList returns [EObject current=null] : iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF ;
    public final EObject entryRulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterList = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2326:2: (iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2327:2: iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterListRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList5553);
            iv_rulePluginConfigurationParameterList=rulePluginConfigurationParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterList5563); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2334:1: rulePluginConfigurationParameterList returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2337:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2339:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2339:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2340:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5605); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_rulePluginConfigurationParameterList5622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2360:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2361:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2361:1: (lv_values_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2362:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5639); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2378:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==13) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2378:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePluginConfigurationParameterList5657); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterListAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2382:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2383:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2383:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2384:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5674); if (state.failed) return current;
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
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_rulePluginConfigurationParameterList5693); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2412:1: entryRulePluginConfigurationParameterMap returns [EObject current=null] : iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF ;
    public final EObject entryRulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMap = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2413:2: (iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2414:2: iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterMapRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5729);
            iv_rulePluginConfigurationParameterMap=rulePluginConfigurationParameterMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterMap; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5739); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2421:1: rulePluginConfigurationParameterMap returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2424:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2425:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2425:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2425:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2425:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2426:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2426:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2427:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5781); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePluginConfigurationParameterMap5798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2447:1: ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2448:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2448:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2449:3: lv_entries_2_0= rulePluginConfigurationParameterMapEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesPluginConfigurationParameterMapEntryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5819);
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
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterMap5832); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2477:1: entryRulePluginConfigurationParameterMapEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMapEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2478:2: (iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2479:2: iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterMapEntryRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5868);
            iv_rulePluginConfigurationParameterMapEntry=rulePluginConfigurationParameterMapEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterMapEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5878); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2486:1: rulePluginConfigurationParameterMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2489:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2490:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2490:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2490:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2490:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2491:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2491:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2492:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5920); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_rulePluginConfigurationParameterMapEntry5937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2512:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2513:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2513:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2514:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5954); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2538:1: entryRulePluginConfigurationParameterProperties returns [EObject current=null] : iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF ;
    public final EObject entryRulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2539:2: (iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2540:2: iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5995);
            iv_rulePluginConfigurationParameterProperties=rulePluginConfigurationParameterProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties6005); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2547:1: rulePluginConfigurationParameterProperties returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2550:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2552:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2552:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2553:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties6047); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePluginConfigurationParameterProperties6064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2573:1: ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2574:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2574:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2575:3: lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesPluginConfigurationParameterPropertyEntryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties6085);
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
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterProperties6098); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2603:1: entryRulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterPropertyEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2604:2: (iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2605:2: iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertyEntryRule()); 
            }
            pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry6134);
            iv_rulePluginConfigurationParameterPropertyEntry=rulePluginConfigurationParameterPropertyEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginConfigurationParameterPropertyEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry6144); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2612:1: rulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2615:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2616:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2616:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2616:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2616:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2617:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2617:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2618:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry6186); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_rulePluginConfigurationParameterPropertyEntry6203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2638:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2639:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2639:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2640:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry6220); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2664:1: entryRulePluginExecution returns [EObject current=null] : iv_rulePluginExecution= rulePluginExecution EOF ;
    public final EObject entryRulePluginExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginExecution = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2665:2: (iv_rulePluginExecution= rulePluginExecution EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2666:2: iv_rulePluginExecution= rulePluginExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginExecutionRule()); 
            }
            pushFollow(FOLLOW_rulePluginExecution_in_entryRulePluginExecution6261);
            iv_rulePluginExecution=rulePluginExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginExecution; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginExecution6271); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2673:1: rulePluginExecution returns [EObject current=null] : (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2676:28: ( (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2677:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2677:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2677:3: otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePluginExecution6308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginExecutionAccess().getExecKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:1: ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? ) | ( (lv_default_13_0= 'default' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==47||LA47_0==49) ) {
                alt47=1;
            }
            else if ( (LA47_0==51) ) {
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:3: ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )? otherlv_5= 'with' otherlv_6= 'goals' ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) ) (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )* (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:3: ( (lv_id_1_0= ruleIDAndDash ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:1: (lv_id_1_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:1: (lv_id_1_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2683:3: lv_id_1_0= ruleIDAndDash
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getIdIDAndDashParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution6331);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2699:3: (otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==47) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2699:5: otherlv_2= 'in' otherlv_3= 'phase' ( (lv_phase_4_0= rulePhase ) )
                            {
                            otherlv_2=(Token)match(input,47,FOLLOW_47_in_rulePluginExecution6345); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getPluginExecutionAccess().getInKeyword_1_0_1_0());
                                  
                            }
                            otherlv_3=(Token)match(input,48,FOLLOW_48_in_rulePluginExecution6357); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getPluginExecutionAccess().getPhaseKeyword_1_0_1_1());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2707:1: ( (lv_phase_4_0= rulePhase ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2708:1: (lv_phase_4_0= rulePhase )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2708:1: (lv_phase_4_0= rulePhase )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2709:3: lv_phase_4_0= rulePhase
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getPhasePhaseEnumRuleCall_1_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePhase_in_rulePluginExecution6378);
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

                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_rulePluginExecution6392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPluginExecutionAccess().getWithKeyword_1_0_2());
                          
                    }
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_rulePluginExecution6404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPluginExecutionAccess().getGoalsKeyword_1_0_3());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2733:1: ( (lv_goals_7_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2734:1: (lv_goals_7_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2734:1: (lv_goals_7_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2735:3: lv_goals_7_0= ruleIDAndSpecialCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndSpecialCharactersParserRuleCall_1_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_rulePluginExecution6425);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2751:2: (otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==13) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2751:4: otherlv_8= ',' ( (lv_goals_9_0= ruleIDAndDash ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_rulePluginExecution6438); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getPluginExecutionAccess().getCommaKeyword_1_0_5_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2755:1: ( (lv_goals_9_0= ruleIDAndDash ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2756:1: (lv_goals_9_0= ruleIDAndDash )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2756:1: (lv_goals_9_0= ruleIDAndDash )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2757:3: lv_goals_9_0= ruleIDAndDash
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution6459);
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
                    	    break loop45;
                        }
                    } while (true);

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2773:4: (otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==34) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2773:6: otherlv_10= '{' ( (lv_configuration_11_0= rulePluginConfiguration ) ) otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,34,FOLLOW_34_in_rulePluginExecution6474); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPluginExecutionAccess().getLeftCurlyBracketKeyword_1_0_6_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2777:1: ( (lv_configuration_11_0= rulePluginConfiguration ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2778:1: (lv_configuration_11_0= rulePluginConfiguration )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2778:1: (lv_configuration_11_0= rulePluginConfiguration )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2779:3: lv_configuration_11_0= rulePluginConfiguration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getConfigurationPluginConfigurationParserRuleCall_1_0_6_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePluginConfiguration_in_rulePluginExecution6495);
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

                            otherlv_12=(Token)match(input,24,FOLLOW_24_in_rulePluginExecution6507); if (state.failed) return current;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2800:6: ( (lv_default_13_0= 'default' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2800:6: ( (lv_default_13_0= 'default' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2801:1: (lv_default_13_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2801:1: (lv_default_13_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2802:3: lv_default_13_0= 'default'
                    {
                    lv_default_13_0=(Token)match(input,51,FOLLOW_51_in_rulePluginExecution6534); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2823:1: entryRulePluginInclusion returns [EObject current=null] : iv_rulePluginInclusion= rulePluginInclusion EOF ;
    public final EObject entryRulePluginInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2824:2: (iv_rulePluginInclusion= rulePluginInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2825:2: iv_rulePluginInclusion= rulePluginInclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPluginInclusionRule()); 
            }
            pushFollow(FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion6584);
            iv_rulePluginInclusion=rulePluginInclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePluginInclusion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginInclusion6594); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2832:1: rulePluginInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2835:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2836:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2836:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2836:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePluginInclusion6631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPluginInclusionAccess().getIncludeKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2840:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2841:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2841:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2842:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPluginInclusionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginInclusion6651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPluginInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePluginInclusion6663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2857:1: ( (lv_pluginCoordinates_3_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2858:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2858:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2859:3: lv_pluginCoordinates_3_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesCoordinatesParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePluginInclusion6684);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2875:2: (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==21) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2875:4: otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePluginInclusion6697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2879:1: ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==43) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2879:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2879:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2880:1: (lv_executionId_5_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2880:1: (lv_executionId_5_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2881:3: lv_executionId_5_0= ruleIDAndDash
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getExecutionIdIDAndDashParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginInclusion6719);
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
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:6: ( (lv_config_6_0= 'config' ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:6: ( (lv_config_6_0= 'config' ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2899:1: (lv_config_6_0= 'config' )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2899:1: (lv_config_6_0= 'config' )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2900:3: lv_config_6_0= 'config'
                            {
                            lv_config_6_0=(Token)match(input,43,FOLLOW_43_in_rulePluginInclusion6743); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2921:1: entryRuleBuildStep returns [EObject current=null] : iv_ruleBuildStep= ruleBuildStep EOF ;
    public final EObject entryRuleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildStep = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2922:2: (iv_ruleBuildStep= ruleBuildStep EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2923:2: iv_ruleBuildStep= ruleBuildStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuildStepRule()); 
            }
            pushFollow(FOLLOW_ruleBuildStep_in_entryRuleBuildStep6795);
            iv_ruleBuildStep=ruleBuildStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuildStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildStep6805); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2930:1: ruleBuildStep returns [EObject current=null] : (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) ;
    public final EObject ruleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject this_Plugin_0 = null;

        EObject this_PluginInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2933:28: ( (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2934:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2934:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            else if ( (LA50_0==32) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:5: this_Plugin_0= rulePlugin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuildStepAccess().getPluginParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePlugin_in_ruleBuildStep6852);
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2945:5: this_PluginInclusion_1= rulePluginInclusion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuildStepAccess().getPluginInclusionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePluginInclusion_in_ruleBuildStep6879);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2961:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2962:2: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2963:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinatesRule()); 
            }
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates6914);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinates; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates6924); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2970:1: ruleCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2973:28: ( ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2974:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2974:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2974:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2974:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2975:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2975:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2976:3: lv_groupId_0_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6970);
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

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleCoordinates6982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getColonKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:1: ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2997:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2997:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2998:3: lv_artifactId_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates7003);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleCoordinates7015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCoordinatesAccess().getColonKeyword_3());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3018:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3019:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3019:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3020:3: lv_version_4_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVersion_in_ruleCoordinates7036);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3044:1: entryRuleExtendedCoordinates returns [EObject current=null] : iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF ;
    public final EObject entryRuleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:2: (iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3046:2: iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedCoordinatesRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates7072);
            iv_ruleExtendedCoordinates=ruleExtendedCoordinates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedCoordinates; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedCoordinates7082); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3053:1: ruleExtendedCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3056:28: ( ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3058:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3058:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3059:3: lv_groupId_0_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates7128);
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

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExtendedCoordinates7140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3079:1: ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3080:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3080:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3081:3: lv_artifactId_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates7161);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleExtendedCoordinates7173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_3());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3101:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3102:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3102:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3103:3: lv_version_4_0= ruleVersion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVersion_in_ruleExtendedCoordinates7194);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3119:2: (otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3119:4: otherlv_5= ':' ( (lv_type_6_0= RULE_ID ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleExtendedCoordinates7207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3123:1: ( (lv_type_6_0= RULE_ID ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3124:1: (lv_type_6_0= RULE_ID )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3124:1: (lv_type_6_0= RULE_ID )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3125:3: lv_type_6_0= RULE_ID
                    {
                    lv_type_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedCoordinates7224); if (state.failed) return current;
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3141:2: (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==52) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3141:4: otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) )
                            {
                            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleExtendedCoordinates7242); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_2_0());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3145:1: ( (lv_classifier_8_0= ruleClassifier ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3146:1: (lv_classifier_8_0= ruleClassifier )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3146:1: (lv_classifier_8_0= ruleClassifier )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3147:3: lv_classifier_8_0= ruleClassifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getClassifierClassifierParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleClassifier_in_ruleExtendedCoordinates7263);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:1: entryRulePOMImport returns [EObject current=null] : iv_rulePOMImport= rulePOMImport EOF ;
    public final EObject entryRulePOMImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOMImport = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3172:2: (iv_rulePOMImport= rulePOMImport EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3173:2: iv_rulePOMImport= rulePOMImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPOMImportRule()); 
            }
            pushFollow(FOLLOW_rulePOMImport_in_entryRulePOMImport7303);
            iv_rulePOMImport=rulePOMImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePOMImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePOMImport7313); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3180:1: rulePOMImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePOMImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:28: ( (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3184:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3184:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3184:3: otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulePOMImport7350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPOMImportAccess().getImportKeyword_0());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3188:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3190:3: lv_coordinates_1_0= ruleCoordinates
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCoordinates_in_rulePOMImport7371);
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

            otherlv_2=(Token)match(input,54,FOLLOW_54_in_rulePOMImport7383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPOMImportAccess().getAsKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3210:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3211:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3211:1: (lv_name_3_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3212:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOMImport7400); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3236:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3237:2: (iv_ruleRepository= ruleRepository EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3238:2: iv_ruleRepository= ruleRepository EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryRule()); 
            }
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository7441);
            iv_ruleRepository=ruleRepository();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepository; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository7451); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3245:1: ruleRepository returns [EObject current=null] : ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3248:28: ( ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3249:1: ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3249:1: ( (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3249:2: (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) ) ( (lv_id_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= 'at' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3249:2: (otherlv_0= 'repository' | ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            else if ( (LA53_0==56) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3249:4: otherlv_0= 'repository'
                    {
                    otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleRepository7489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3254:6: ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3254:6: ( (lv_pluginRepositroy_1_0= 'plugin-repository' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3255:1: (lv_pluginRepositroy_1_0= 'plugin-repository' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3255:1: (lv_pluginRepositroy_1_0= 'plugin-repository' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3256:3: lv_pluginRepositroy_1_0= 'plugin-repository'
                    {
                    lv_pluginRepositroy_1_0=(Token)match(input,56,FOLLOW_56_in_ruleRepository7513); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3269:3: ( (lv_id_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3270:1: (lv_id_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3270:1: (lv_id_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3271:3: lv_id_2_0= ruleIDAndSpecialCharacters
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRepositoryAccess().getIdIDAndSpecialCharactersParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleRepository7548);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleRepository7560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getAtKeyword_2());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3291:1: ( (lv_url_4_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3292:1: (lv_url_4_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3292:1: (lv_url_4_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3293:3: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7577); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3309:2: (otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3309:4: otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_policies_11_0= ruleRepositoryPolicy ) )+ otherlv_12= '}'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleRepository7595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3313:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3315:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3315:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3316:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3319:2: ( ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )* )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3320:3: ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3320:3: ( ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( LA54_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0) ) {
                            alt54=1;
                        }
                        else if ( LA54_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3322:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3322:4: ({...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3323:5: {...}? => ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0)");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3323:109: ( ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3324:6: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 0);
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3327:6: ({...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3327:7: {...}? => (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "true");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3327:16: (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3327:18: otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleRepository7653); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getNameKeyword_4_1_0_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3331:1: ( (lv_name_8_0= RULE_STRING ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3332:1: (lv_name_8_0= RULE_STRING )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3332:1: (lv_name_8_0= RULE_STRING )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3333:3: lv_name_8_0= RULE_STRING
                    	    {
                    	    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7670); if (state.failed) return current;
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
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3356:4: ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3356:4: ({...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3357:5: {...}? => ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "getUnorderedGroupHelper().canSelect(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1)");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3357:109: ( ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3358:6: ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1(), 1);
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3361:6: ({...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3361:7: {...}? => (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleRepository", "true");
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3361:16: (otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3361:18: otherlv_9= 'layout' ( (lv_layout_10_0= RULE_STRING ) )
                    	    {
                    	    otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleRepository7743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getLayoutKeyword_4_1_1_0());
                    	          
                    	    }
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3365:1: ( (lv_layout_10_0= RULE_STRING ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3366:1: (lv_layout_10_0= RULE_STRING )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3366:1: (lv_layout_10_0= RULE_STRING )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3367:3: lv_layout_10_0= RULE_STRING
                    	    {
                    	    lv_layout_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepository7760); if (state.failed) return current;
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
                    	    break loop54;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getRepositoryAccess().getUnorderedGroup_4_1());

                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3397:2: ( (lv_policies_11_0= ruleRepositoryPolicy ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=59 && LA55_0<=60)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3398:1: (lv_policies_11_0= ruleRepositoryPolicy )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3398:1: (lv_policies_11_0= ruleRepositoryPolicy )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3399:3: lv_policies_11_0= ruleRepositoryPolicy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRepositoryAccess().getPoliciesRepositoryPolicyParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRepositoryPolicy_in_ruleRepository7827);
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleRepository7840); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3427:1: entryRuleRepositoryPolicy returns [EObject current=null] : iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF ;
    public final EObject entryRuleRepositoryPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryPolicy = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3428:2: (iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3429:2: iv_ruleRepositoryPolicy= ruleRepositoryPolicy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryPolicyRule()); 
            }
            pushFollow(FOLLOW_ruleRepositoryPolicy_in_entryRuleRepositoryPolicy7878);
            iv_ruleRepositoryPolicy=ruleRepositoryPolicy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepositoryPolicy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryPolicy7888); if (state.failed) return current;

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3436:1: ruleRepositoryPolicy returns [EObject current=null] : ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3439:28: ( ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3440:1: ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3440:1: ( ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3440:2: ( (lv_disabled_0_0= 'do not' ) )? otherlv_1= 'fetch' ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) ) (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )? (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3440:2: ( (lv_disabled_0_0= 'do not' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3441:1: (lv_disabled_0_0= 'do not' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3441:1: (lv_disabled_0_0= 'do not' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3442:3: lv_disabled_0_0= 'do not'
                    {
                    lv_disabled_0_0=(Token)match(input,59,FOLLOW_59_in_ruleRepositoryPolicy7931); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleRepositoryPolicy7957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRepositoryPolicyAccess().getFetchKeyword_1());
                  
            }
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3459:1: ( ( (lv_releases_2_0= 'releases' ) ) | ( (lv_snapshots_3_0= 'snapshots' ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==61) ) {
                alt58=1;
            }
            else if ( (LA58_0==62) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3459:2: ( (lv_releases_2_0= 'releases' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3459:2: ( (lv_releases_2_0= 'releases' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3460:1: (lv_releases_2_0= 'releases' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3460:1: (lv_releases_2_0= 'releases' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3461:3: lv_releases_2_0= 'releases'
                    {
                    lv_releases_2_0=(Token)match(input,61,FOLLOW_61_in_ruleRepositoryPolicy7976); if (state.failed) return current;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3475:6: ( (lv_snapshots_3_0= 'snapshots' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3475:6: ( (lv_snapshots_3_0= 'snapshots' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3476:1: (lv_snapshots_3_0= 'snapshots' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3476:1: (lv_snapshots_3_0= 'snapshots' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3477:3: lv_snapshots_3_0= 'snapshots'
                    {
                    lv_snapshots_3_0=(Token)match(input,62,FOLLOW_62_in_ruleRepositoryPolicy8013); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3490:3: (otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==63) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3490:5: otherlv_4= ',' otherlv_5= 'update' ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) ) (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )?
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryPolicy8040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRepositoryPolicyAccess().getCommaKeyword_3_0());
                          
                    }
                    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleRepositoryPolicy8052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRepositoryPolicyAccess().getUpdateKeyword_3_1());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3498:1: ( (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3499:1: (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3499:1: (lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3500:3: lv_updatePolicy_6_0= ruleRepositoryUpdatePolicy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepositoryPolicyAccess().getUpdatePolicyRepositoryUpdatePolicyEnumRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRepositoryUpdatePolicy_in_ruleRepositoryPolicy8073);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3516:2: (otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==49) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3516:4: otherlv_7= 'with' otherlv_8= 'interval' otherlv_9= '=' ( (lv_updateInterval_10_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleRepositoryPolicy8086); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getRepositoryPolicyAccess().getWithKeyword_3_3_0());
                                  
                            }
                            otherlv_8=(Token)match(input,64,FOLLOW_64_in_ruleRepositoryPolicy8098); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getRepositoryPolicyAccess().getIntervalKeyword_3_3_1());
                                  
                            }
                            otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleRepositoryPolicy8110); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getRepositoryPolicyAccess().getEqualsSignKeyword_3_3_2());
                                  
                            }
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3528:1: ( (lv_updateInterval_10_0= RULE_INT ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3529:1: (lv_updateInterval_10_0= RULE_INT )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3529:1: (lv_updateInterval_10_0= RULE_INT )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3530:3: lv_updateInterval_10_0= RULE_INT
                            {
                            lv_updateInterval_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRepositoryPolicy8127); if (state.failed) return current;
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3546:6: (otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==13) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3546:8: otherlv_11= ',' otherlv_12= 'checksumPolicy' ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) )
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryPolicy8149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRepositoryPolicyAccess().getCommaKeyword_4_0());
                          
                    }
                    otherlv_12=(Token)match(input,65,FOLLOW_65_in_ruleRepositoryPolicy8161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getRepositoryPolicyAccess().getChecksumPolicyKeyword_4_1());
                          
                    }
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3554:1: ( (lv_checksumPolicy_13_0= ruleChecksumPolicy ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3555:1: (lv_checksumPolicy_13_0= ruleChecksumPolicy )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3555:1: (lv_checksumPolicy_13_0= ruleChecksumPolicy )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3556:3: lv_checksumPolicy_13_0= ruleChecksumPolicy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRepositoryPolicyAccess().getChecksumPolicyChecksumPolicyEnumRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleChecksumPolicy_in_ruleRepositoryPolicy8182);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3580:1: ruleDependencyScope returns [Enumerator current=null] : ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3582:28: ( ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3583:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3583:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt62=1;
                }
                break;
            case 66:
                {
                alt62=2;
                }
                break;
            case 67:
                {
                alt62=3;
                }
                break;
            case 68:
                {
                alt62=4;
                }
                break;
            case 25:
                {
                alt62=5;
                }
                break;
            case 53:
                {
                alt62=6;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3583:2: (enumLiteral_0= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3583:2: (enumLiteral_0= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3583:4: enumLiteral_0= 'compile'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleDependencyScope8234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3589:6: (enumLiteral_1= 'provided' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3589:6: (enumLiteral_1= 'provided' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3589:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleDependencyScope8251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3595:6: (enumLiteral_2= 'runtime' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3595:6: (enumLiteral_2= 'runtime' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3595:8: enumLiteral_2= 'runtime'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleDependencyScope8268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3601:6: (enumLiteral_3= 'system' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3601:6: (enumLiteral_3= 'system' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3601:8: enumLiteral_3= 'system'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleDependencyScope8285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3607:6: (enumLiteral_4= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3607:6: (enumLiteral_4= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3607:8: enumLiteral_4= 'test'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleDependencyScope8302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3613:6: (enumLiteral_5= 'import' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3613:6: (enumLiteral_5= 'import' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3613:8: enumLiteral_5= 'import'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_53_in_ruleDependencyScope8319); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3623:1: rulePhase returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3625:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            int alt63=31;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt63=1;
                }
                break;
            case 69:
                {
                alt63=2;
                }
                break;
            case 27:
                {
                alt63=3;
                }
                break;
            case 70:
                {
                alt63=4;
                }
                break;
            case 71:
                {
                alt63=5;
                }
                break;
            case 72:
                {
                alt63=6;
                }
                break;
            case 73:
                {
                alt63=7;
                }
                break;
            case 74:
                {
                alt63=8;
                }
                break;
            case 75:
                {
                alt63=9;
                }
                break;
            case 76:
                {
                alt63=10;
                }
                break;
            case 29:
                {
                alt63=11;
                }
                break;
            case 77:
                {
                alt63=12;
                }
                break;
            case 78:
                {
                alt63=13;
                }
                break;
            case 79:
                {
                alt63=14;
                }
                break;
            case 80:
                {
                alt63=15;
                }
                break;
            case 81:
                {
                alt63=16;
                }
                break;
            case 82:
                {
                alt63=17;
                }
                break;
            case 83:
                {
                alt63=18;
                }
                break;
            case 25:
                {
                alt63=19;
                }
                break;
            case 84:
                {
                alt63=20;
                }
                break;
            case 85:
                {
                alt63=21;
                }
                break;
            case 86:
                {
                alt63=22;
                }
                break;
            case 87:
                {
                alt63=23;
                }
                break;
            case 88:
                {
                alt63=24;
                }
                break;
            case 89:
                {
                alt63=25;
                }
                break;
            case 90:
                {
                alt63=26;
                }
                break;
            case 91:
                {
                alt63=27;
                }
                break;
            case 92:
                {
                alt63=28;
                }
                break;
            case 93:
                {
                alt63=29;
                }
                break;
            case 94:
                {
                alt63=30;
                }
                break;
            case 95:
                {
                alt63=31;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:2: (enumLiteral_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:2: (enumLiteral_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3626:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_rulePhase8364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:6: (enumLiteral_1= 'pre-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:6: (enumLiteral_1= 'pre-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3632:8: enumLiteral_1= 'pre-clean'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_rulePhase8381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:6: (enumLiteral_2= 'clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:6: (enumLiteral_2= 'clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3638:8: enumLiteral_2= 'clean'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_rulePhase8398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:6: (enumLiteral_3= 'post-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:6: (enumLiteral_3= 'post-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3644:8: enumLiteral_3= 'post-clean'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_rulePhase8415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:6: (enumLiteral_4= 'validate' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:6: (enumLiteral_4= 'validate' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3650:8: enumLiteral_4= 'validate'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_rulePhase8432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:6: (enumLiteral_5= 'initialize' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:6: (enumLiteral_5= 'initialize' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3656:8: enumLiteral_5= 'initialize'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_rulePhase8449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:6: (enumLiteral_6= 'generate-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:6: (enumLiteral_6= 'generate-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3662:8: enumLiteral_6= 'generate-sources'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_rulePhase8466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3668:6: (enumLiteral_7= 'process-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3668:6: (enumLiteral_7= 'process-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3668:8: enumLiteral_7= 'process-sources'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_rulePhase8483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3674:6: (enumLiteral_8= 'generate-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3674:6: (enumLiteral_8= 'generate-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3674:8: enumLiteral_8= 'generate-resources'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_75_in_rulePhase8500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3680:6: (enumLiteral_9= 'process-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3680:6: (enumLiteral_9= 'process-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3680:8: enumLiteral_9= 'process-resources'
                    {
                    enumLiteral_9=(Token)match(input,76,FOLLOW_76_in_rulePhase8517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3686:6: (enumLiteral_10= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3686:6: (enumLiteral_10= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3686:8: enumLiteral_10= 'compile'
                    {
                    enumLiteral_10=(Token)match(input,29,FOLLOW_29_in_rulePhase8534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3692:6: (enumLiteral_11= 'process-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3692:6: (enumLiteral_11= 'process-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3692:8: enumLiteral_11= 'process-classes'
                    {
                    enumLiteral_11=(Token)match(input,77,FOLLOW_77_in_rulePhase8551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3698:6: (enumLiteral_12= 'generate-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3698:6: (enumLiteral_12= 'generate-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3698:8: enumLiteral_12= 'generate-test-sources'
                    {
                    enumLiteral_12=(Token)match(input,78,FOLLOW_78_in_rulePhase8568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3704:6: (enumLiteral_13= 'process-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3704:6: (enumLiteral_13= 'process-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3704:8: enumLiteral_13= 'process-test-sources'
                    {
                    enumLiteral_13=(Token)match(input,79,FOLLOW_79_in_rulePhase8585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3710:6: (enumLiteral_14= 'generate-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3710:6: (enumLiteral_14= 'generate-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3710:8: enumLiteral_14= 'generate-test-resources'
                    {
                    enumLiteral_14=(Token)match(input,80,FOLLOW_80_in_rulePhase8602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3716:6: (enumLiteral_15= 'process-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3716:6: (enumLiteral_15= 'process-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3716:8: enumLiteral_15= 'process-test-resources'
                    {
                    enumLiteral_15=(Token)match(input,81,FOLLOW_81_in_rulePhase8619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3722:6: (enumLiteral_16= 'test-compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3722:6: (enumLiteral_16= 'test-compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3722:8: enumLiteral_16= 'test-compile'
                    {
                    enumLiteral_16=(Token)match(input,82,FOLLOW_82_in_rulePhase8636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3728:6: (enumLiteral_17= 'process-test-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3728:6: (enumLiteral_17= 'process-test-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3728:8: enumLiteral_17= 'process-test-classes'
                    {
                    enumLiteral_17=(Token)match(input,83,FOLLOW_83_in_rulePhase8653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3734:6: (enumLiteral_18= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3734:6: (enumLiteral_18= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3734:8: enumLiteral_18= 'test'
                    {
                    enumLiteral_18=(Token)match(input,25,FOLLOW_25_in_rulePhase8670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3740:6: (enumLiteral_19= 'prepare-package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3740:6: (enumLiteral_19= 'prepare-package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3740:8: enumLiteral_19= 'prepare-package'
                    {
                    enumLiteral_19=(Token)match(input,84,FOLLOW_84_in_rulePhase8687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19()); 
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3746:6: (enumLiteral_20= 'package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3746:6: (enumLiteral_20= 'package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3746:8: enumLiteral_20= 'package'
                    {
                    enumLiteral_20=(Token)match(input,85,FOLLOW_85_in_rulePhase8704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_20, grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20()); 
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3752:6: (enumLiteral_21= 'pre-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3752:6: (enumLiteral_21= 'pre-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3752:8: enumLiteral_21= 'pre-integration-test'
                    {
                    enumLiteral_21=(Token)match(input,86,FOLLOW_86_in_rulePhase8721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_21, grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21()); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3758:6: (enumLiteral_22= 'integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3758:6: (enumLiteral_22= 'integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3758:8: enumLiteral_22= 'integration-test'
                    {
                    enumLiteral_22=(Token)match(input,87,FOLLOW_87_in_rulePhase8738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_22, grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22()); 
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3764:6: (enumLiteral_23= 'post-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3764:6: (enumLiteral_23= 'post-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3764:8: enumLiteral_23= 'post-integration-test'
                    {
                    enumLiteral_23=(Token)match(input,88,FOLLOW_88_in_rulePhase8755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_23, grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23()); 
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3770:6: (enumLiteral_24= 'verify' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3770:6: (enumLiteral_24= 'verify' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3770:8: enumLiteral_24= 'verify'
                    {
                    enumLiteral_24=(Token)match(input,89,FOLLOW_89_in_rulePhase8772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_24, grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24()); 
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3776:6: (enumLiteral_25= 'install' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3776:6: (enumLiteral_25= 'install' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3776:8: enumLiteral_25= 'install'
                    {
                    enumLiteral_25=(Token)match(input,90,FOLLOW_90_in_rulePhase8789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_25, grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25()); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3782:6: (enumLiteral_26= 'deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3782:6: (enumLiteral_26= 'deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3782:8: enumLiteral_26= 'deploy'
                    {
                    enumLiteral_26=(Token)match(input,91,FOLLOW_91_in_rulePhase8806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_26, grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26()); 
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3788:6: (enumLiteral_27= 'pre-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3788:6: (enumLiteral_27= 'pre-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3788:8: enumLiteral_27= 'pre-site'
                    {
                    enumLiteral_27=(Token)match(input,92,FOLLOW_92_in_rulePhase8823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_27, grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27()); 
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3794:6: (enumLiteral_28= 'site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3794:6: (enumLiteral_28= 'site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3794:8: enumLiteral_28= 'site'
                    {
                    enumLiteral_28=(Token)match(input,93,FOLLOW_93_in_rulePhase8840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_28, grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28()); 
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3800:6: (enumLiteral_29= 'post-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3800:6: (enumLiteral_29= 'post-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3800:8: enumLiteral_29= 'post-site'
                    {
                    enumLiteral_29=(Token)match(input,94,FOLLOW_94_in_rulePhase8857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_29, grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29()); 
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3806:6: (enumLiteral_30= 'site-deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3806:6: (enumLiteral_30= 'site-deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3806:8: enumLiteral_30= 'site-deploy'
                    {
                    enumLiteral_30=(Token)match(input,95,FOLLOW_95_in_rulePhase8874); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3816:1: ruleRepositoryUpdatePolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) ) ;
    public final Enumerator ruleRepositoryUpdatePolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3818:28: ( ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3819:1: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3819:1: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'always' ) | (enumLiteral_2= 'never' ) | (enumLiteral_3= 'interval' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt64=1;
                }
                break;
            case 97:
                {
                alt64=2;
                }
                break;
            case 98:
                {
                alt64=3;
                }
                break;
            case 64:
                {
                alt64=4;
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3819:2: (enumLiteral_0= 'daily' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3819:2: (enumLiteral_0= 'daily' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3819:4: enumLiteral_0= 'daily'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleRepositoryUpdatePolicy8919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getDAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRepositoryUpdatePolicyAccess().getDAILYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3825:6: (enumLiteral_1= 'always' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3825:6: (enumLiteral_1= 'always' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3825:8: enumLiteral_1= 'always'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleRepositoryUpdatePolicy8936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getALWAYSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRepositoryUpdatePolicyAccess().getALWAYSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3831:6: (enumLiteral_2= 'never' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3831:6: (enumLiteral_2= 'never' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3831:8: enumLiteral_2= 'never'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleRepositoryUpdatePolicy8953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRepositoryUpdatePolicyAccess().getNEVEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRepositoryUpdatePolicyAccess().getNEVEREnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3837:6: (enumLiteral_3= 'interval' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3837:6: (enumLiteral_3= 'interval' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3837:8: enumLiteral_3= 'interval'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_64_in_ruleRepositoryUpdatePolicy8970); if (state.failed) return current;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3847:1: ruleChecksumPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) ) ;
    public final Enumerator ruleChecksumPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3849:28: ( ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3850:1: ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3850:1: ( (enumLiteral_0= 'ignore' ) | (enumLiteral_1= 'warn' ) | (enumLiteral_2= 'fail' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt65=1;
                }
                break;
            case 100:
                {
                alt65=2;
                }
                break;
            case 101:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3850:2: (enumLiteral_0= 'ignore' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3850:2: (enumLiteral_0= 'ignore' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3850:4: enumLiteral_0= 'ignore'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_99_in_ruleChecksumPolicy9015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getChecksumPolicyAccess().getIGNOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getChecksumPolicyAccess().getIGNOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3856:6: (enumLiteral_1= 'warn' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3856:6: (enumLiteral_1= 'warn' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3856:8: enumLiteral_1= 'warn'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_100_in_ruleChecksumPolicy9032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getChecksumPolicyAccess().getWARNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getChecksumPolicyAccess().getWARNEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3862:6: (enumLiteral_2= 'fail' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3862:6: (enumLiteral_2= 'fail' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3862:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_101_in_ruleChecksumPolicy9049); if (state.failed) return current;
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
        // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:3: ( ( '-' | '.' | '_' ) )
        // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:725:4: ( '-' | '.' | '_' )
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\1\1\1\uffff\1\7\5\uffff\2\7\2\uffff\1\7";
    static final String DFA17_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\5\1\uffff\1\24\3\5\1\24";
    static final String DFA17_maxS =
        "\1\104\1\uffff\1\104\2\uffff\1\53\1\40\1\uffff\1\64\1\104\1\40"+
        "\1\27\1\64";
    static final String DFA17_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\3\1\4\3\uffff\2\1\1\uffff\6\1\1\uffff\1\1\2\uffff"+
            "\13\1\1\uffff\3\1\1\uffff\3\1\11\uffff\5\1\11\uffff\3\1",
            "",
            "\4\7\3\uffff\2\7\1\uffff\6\7\1\1\1\5\1\1\1\uffff\13\7\1\uffff"+
            "\3\7\1\uffff\3\7\11\uffff\1\6\4\7\11\uffff\3\7",
            "",
            "",
            "\1\10\5\uffff\1\1\4\uffff\1\1\10\uffff\10\1\12\uffff\1\7",
            "\1\11\5\uffff\1\1\4\uffff\1\1\10\uffff\10\1",
            "",
            "\1\12\2\1\5\uffff\1\7\3\uffff\1\7\23\uffff\1\1",
            "\1\7\5\uffff\1\7\4\uffff\1\7\3\uffff\3\1\1\uffff\11\7\4\uffff"+
            "\1\7\16\uffff\1\13\1\7\14\uffff\3\7",
            "\1\14\5\uffff\1\1\4\uffff\1\1\10\uffff\10\1",
            "\1\7\1\1\20\uffff\1\1",
            "\1\12\2\1\5\uffff\1\7\3\uffff\1\7\23\uffff\1\1"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 846:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*";
        }
    }
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\1\5\1\uffff\7\5\3\uffff";
    static final String DFA27_maxS =
        "\1\104\1\uffff\2\64\3\45\1\64\1\45\3\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\4\7\uffff\1\3\1\1\1\2";
    static final String DFA27_specialS =
        "\14\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\11\5\uffff\1\11\4\uffff\1\11\7\uffff\1\1\1\7\3\11\1\3\2"+
            "\11\1\2\4\uffff\1\11\17\uffff\1\10\14\uffff\1\4\1\5\1\6",
            "",
            "\1\12\16\uffff\3\11\35\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\3\uffff\3\11\2\uffff\10\11"+
            "\1\uffff\1\13\2\uffff\1\11\16\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\10\11\1\uffff\1\13"+
            "\2\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\10\11\1\uffff\1\13"+
            "\2\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\10\11\1\uffff\1\13"+
            "\2\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\3\uffff\3\11\2\uffff\10\11"+
            "\1\uffff\1\13\2\uffff\1\11\16\uffff\1\11",
            "\1\11\5\uffff\1\11\4\uffff\1\11\10\uffff\10\11\1\uffff\1\13"+
            "\2\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1513:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+";
        }
    }
    static final String DFA33_eotS =
        "\13\uffff";
    static final String DFA33_eofS =
        "\1\1\12\uffff";
    static final String DFA33_minS =
        "\1\30\1\uffff\5\0\4\uffff";
    static final String DFA33_maxS =
        "\1\70\1\uffff\5\0\4\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\5\5\uffff\1\1\1\2\1\3\1\4";
    static final String DFA33_specialS =
        "\2\uffff\1\0\1\3\1\1\1\2\1\4\4\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\6\3\uffff\1\1\3\uffff\2\1\2\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\5\14\uffff\2\1",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1837:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePOM_in_entryRulePOM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_rulePOM131 = new BitSet(new long[]{0x01A00752010FD800L});
    public static final BitSet FOLLOW_ruleParentRef_in_rulePOM153 = new BitSet(new long[]{0x01800752010FD800L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_rulePOM175 = new BitSet(new long[]{0x01800752010FD800L});
    public static final BitSet FOLLOW_ruleModules_in_rulePOM196 = new BitSet(new long[]{0x01800752010FD800L});
    public static final BitSet FOLLOW_ruleProperties_in_rulePOM263 = new BitSet(new long[]{0x01800753110FD802L});
    public static final BitSet FOLLOW_ruleDependencies_in_rulePOM338 = new BitSet(new long[]{0x01800753110FD802L});
    public static final BitSet FOLLOW_ruleSCM_in_rulePOM413 = new BitSet(new long[]{0x01800753110FD802L});
    public static final BitSet FOLLOW_ruleRepository_in_rulePOM488 = new BitSet(new long[]{0x01800753110FD802L});
    public static final BitSet FOLLOW_ruleBuildStep_in_rulePOM556 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_ruleParentRef_in_entryRuleParentRef593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentRef603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleParentRef640 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_ruleParentRef661 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParentRef678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModules_in_entryRuleModules720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModules730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModules767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules784 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleModules802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules819 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifactDefinition872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArtifactDefinition919 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition940 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_15_in_ruleArtifactDefinition955 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition976 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_ruleArtifactDefinition991 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleArtifactDefinition1012 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_17_in_ruleArtifactDefinition1027 = new BitSet(new long[]{0x00000000000C00E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleArtifactDefinition1048 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleArtifactDefinition1108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1125 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_19_in_ruleArtifactDefinition1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1215 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndDash1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1361 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIDAndDash1380 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1395 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1515 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_20_in_ruleIDAndSpecialCharacters1568 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_21_in_ruleIDAndSpecialCharacters1587 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_22_in_ruleIDAndSpecialCharacters1606 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDAndSpecialCharacters1630 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1925 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleText1958 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText1984 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_entryRulePropertyRef2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyRef2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePropertyRef2182 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_rulePropertyName_in_rulePropertyRef2204 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyRef2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPropteryRef2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_ruleIDOrPropteryRef2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrKW2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrKW2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIDOrKW2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleIDOrKW2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleIDOrKW2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIDOrKW2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIDOrKW2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIDOrKW2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIDOrKW2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIDOrKW2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIDOrKW2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIDOrKW2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2743 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2777 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2811 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2828 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleVersion2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyRef_in_ruleVersion2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperties2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleProperties2962 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleProperties2974 = new BitSet(new long[]{0x00000001FF010820L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleProperties2995 = new BitSet(new long[]{0x00000001FF010820L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_ruleProperties3017 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_ruleProperties3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleProperty3122 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProperty3134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportPropertyInclusion_in_entryRuleImportPropertyInclusion3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportPropertyInclusion3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleImportPropertyInclusion3239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleImportPropertyInclusion3251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportPropertyInclusion3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePropertyInclusion_in_entryRuleFilePropertyInclusion3307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilePropertyInclusion3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFilePropertyInclusion3354 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFilePropertyInclusion3366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFilePropertyInclusion3378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFilePropertyInclusion3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInclusion3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportPropertyInclusion_in_rulePropertyInclusion3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilePropertyInclusion_in_rulePropertyInclusion3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_entryRuleDependencies3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencies3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDependencies3611 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDependencies3623 = new BitSet(new long[]{0x00200021FE010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_ruleDependencies3645 = new BitSet(new long[]{0x00200021FF010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_ruleDependencies3672 = new BitSet(new long[]{0x00200021FF010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_ruleDependencies3699 = new BitSet(new long[]{0x00200021FF010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_24_in_ruleDependencies3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyGroup3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3805 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDependencyGroup3817 = new BitSet(new long[]{0x00200021FE010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDependencyGroup3838 = new BitSet(new long[]{0x00200021FF010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_24_in_ruleDependencyGroup3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUngroupedDependency3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3943 = new BitSet(new long[]{0x00200021FE010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleDependency_in_ruleUngroupedDependency3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency4001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDependency4054 = new BitSet(new long[]{0x00200021FE010820L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_ruleDependency4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion4125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyInclusion4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDependencyInclusion4172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyInclusion4192 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDependencyInclusion4204 = new BitSet(new long[]{0x0020000022000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM4261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSCM4353 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSCM4365 = new BitSet(new long[]{0x000007C001000002L});
    public static final BitSet FOLLOW_39_in_ruleSCM4378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4395 = new BitSet(new long[]{0x0000074001000002L});
    public static final BitSet FOLLOW_40_in_ruleSCM4470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4487 = new BitSet(new long[]{0x0000074001000002L});
    public static final BitSet FOLLOW_41_in_ruleSCM4560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4577 = new BitSet(new long[]{0x0000074001000002L});
    public static final BitSet FOLLOW_42_in_ruleSCM4651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4668 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSCM4687 = new BitSet(new long[]{0x0000074001000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin4769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePlugin4816 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePlugin4837 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePlugin4849 = new BitSet(new long[]{0x0000080005000000L});
    public static final BitSet FOLLOW_43_in_rulePlugin4907 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePlugin4919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePlugin4940 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4952 = new BitSet(new long[]{0x0000080005000000L});
    public static final BitSet FOLLOW_rulePluginExecution_in_rulePlugin5028 = new BitSet(new long[]{0x0000080005000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfiguration5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration5172 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem5208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationItem5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter5381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameter5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameter5433 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePluginConfigurationParameter5480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter5501 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameter5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList5553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterList5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5605 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePluginConfigurationParameterList5622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5639 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_13_in_rulePluginConfigurationParameterList5657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5674 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_45_in_rulePluginConfigurationParameterList5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5781 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePluginConfigurationParameterMap5798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5819 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterMap5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5920 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_rulePluginConfigurationParameterMapEntry5937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties6047 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePluginConfigurationParameterProperties6064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties6085 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterProperties6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry6134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry6186 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulePluginConfigurationParameterPropertyEntry6203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginExecution_in_entryRulePluginExecution6261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginExecution6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePluginExecution6308 = new BitSet(new long[]{0x000A800000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution6331 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_rulePluginExecution6345 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePluginExecution6357 = new BitSet(new long[]{0x000800002A000000L,0x00000000FFFFFFE0L});
    public static final BitSet FOLLOW_rulePhase_in_rulePluginExecution6378 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePluginExecution6392 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_rulePluginExecution6404 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_rulePluginExecution6425 = new BitSet(new long[]{0x0000000400002002L});
    public static final BitSet FOLLOW_13_in_rulePluginExecution6438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution6459 = new BitSet(new long[]{0x0000000400002002L});
    public static final BitSet FOLLOW_34_in_rulePluginExecution6474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePluginExecution6495 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePluginExecution6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePluginExecution6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion6584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginInclusion6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePluginInclusion6631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginInclusion6651 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePluginInclusion6663 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePluginInclusion6684 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_rulePluginInclusion6697 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginInclusion6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePluginInclusion6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_entryRuleBuildStep6795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildStep6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleBuildStep6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_ruleBuildStep6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates6914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6970 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleCoordinates6982 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates7003 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleCoordinates7015 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleCoordinates7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates7072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedCoordinates7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates7128 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleExtendedCoordinates7140 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleExtendedCoordinates7161 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleExtendedCoordinates7173 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtendedCoordinates7194 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExtendedCoordinates7207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedCoordinates7224 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExtendedCoordinates7242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleExtendedCoordinates7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_entryRulePOMImport7303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOMImport7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePOMImport7350 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePOMImport7371 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePOMImport7383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOMImport7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRepository7489 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_56_in_ruleRepository7513 = new BitSet(new long[]{0x00000001FE010820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleRepository7548 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleRepository7560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7577 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleRepository7595 = new BitSet(new long[]{0x1C00000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRepository7653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7670 = new BitSet(new long[]{0x1C00000000040000L});
    public static final BitSet FOLLOW_58_in_ruleRepository7743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepository7760 = new BitSet(new long[]{0x1C00000000040000L});
    public static final BitSet FOLLOW_ruleRepositoryPolicy_in_ruleRepository7827 = new BitSet(new long[]{0x1C00000001040000L});
    public static final BitSet FOLLOW_24_in_ruleRepository7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryPolicy_in_entryRuleRepositoryPolicy7878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryPolicy7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRepositoryPolicy7931 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRepositoryPolicy7957 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRepositoryPolicy7976 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_62_in_ruleRepositoryPolicy8013 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryPolicy8040 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleRepositoryPolicy8052 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000001L});
    public static final BitSet FOLLOW_ruleRepositoryUpdatePolicy_in_ruleRepositoryPolicy8073 = new BitSet(new long[]{0x0002000000002002L});
    public static final BitSet FOLLOW_49_in_ruleRepositoryPolicy8086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRepositoryPolicy8098 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRepositoryPolicy8110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRepositoryPolicy8127 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryPolicy8149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRepositoryPolicy8161 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_ruleChecksumPolicy_in_ruleRepositoryPolicy8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDependencyScope8234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDependencyScope8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDependencyScope8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDependencyScope8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDependencyScope8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDependencyScope8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePhase8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePhase8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePhase8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePhase8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePhase8432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePhase8449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePhase8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePhase8483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePhase8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePhase8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePhase8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePhase8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePhase8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePhase8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePhase8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePhase8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulePhase8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rulePhase8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePhase8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rulePhase8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rulePhase8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rulePhase8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rulePhase8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rulePhase8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rulePhase8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rulePhase8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rulePhase8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulePhase8823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rulePhase8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulePhase8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulePhase8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRepositoryUpdatePolicy8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleRepositoryUpdatePolicy8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleRepositoryUpdatePolicy8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRepositoryUpdatePolicy8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleChecksumPolicy9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleChecksumPolicy9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleChecksumPolicy9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalPom1532 = new BitSet(new long[]{0x0000000000000002L});

}
