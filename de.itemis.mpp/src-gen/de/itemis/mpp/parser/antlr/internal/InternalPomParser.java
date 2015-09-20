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

@SuppressWarnings("all")
public class InternalPomParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'parent'", "'modules'", "','", "'group'", "'artifact'", "'version'", "'type'", "'name'", "'description'", "'.'", "'-'", "'_'", "'${'", "'}'", "'property'", "'='", "'include'", "'.properties'", "'dependencies'", "'{'", "'optional'", "'scm'", "'con'", "'dev'", "'url'", "'tag'", "'plugin'", "'config'", "'['", "']'", "'->'", "'exec'", "'in'", "'with goals'", "'default'", "':'", "'import'", "'as'", "'compile'", "'provided'", "'runtime'", "'system'", "'test'", "'pre-clean'", "'clean'", "'post-clean'", "'validate'", "'initialize'", "'generate-sources'", "'process-sources'", "'generate-resources'", "'process-resources'", "'process-classes'", "'generate-test-sources'", "'process-test-sources'", "'generate-test-resources'", "'process-test-resources'", "'test-compile'", "'process-test-classes'", "'prepare-package'", "'package'", "'pre-integration-test'", "'integration-test'", "'post-integration-test'", "'verify'", "'install'", "'deploy'", "'pre-site'", "'site'", "'post-site'", "'site-deploy'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=7;
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
             newCompositeNode(grammarAccess.getPOMRule()); 
            pushFollow(FOLLOW_rulePOM_in_entryRulePOM75);
            iv_rulePOM=rulePOM();

            state._fsp--;

             current =iv_rulePOM; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOM85); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:77:1: rulePOM returns [EObject current=null] : ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* ) ;
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

        EObject lv_buildSteps_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:80:28: ( ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:1: ( ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )* ( (lv_parent_1_0= ruleParentRef ) )? ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) ) ( (lv_modules_3_0= ruleModules ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) ) ( (lv_buildSteps_9_0= ruleBuildStep ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:81:2: ( (lv_imports_0_0= rulePOMImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:82:1: (lv_imports_0_0= rulePOMImport )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:82:1: (lv_imports_0_0= rulePOMImport )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:83:3: lv_imports_0_0= rulePOMImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPOMAccess().getImportsPOMImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePOMImport_in_rulePOM131);
            	    lv_imports_0_0=rulePOMImport();

            	    state._fsp--;


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
                     
                    	        newCompositeNode(grammarAccess.getPOMAccess().getParentParentRefParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParentRef_in_rulePOM153);
                    lv_parent_1_0=ruleParentRef();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:117:3: ( (lv_artifactDefinition_2_0= ruleArtifactDefinition ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:118:1: (lv_artifactDefinition_2_0= ruleArtifactDefinition )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:118:1: (lv_artifactDefinition_2_0= ruleArtifactDefinition )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:119:3: lv_artifactDefinition_2_0= ruleArtifactDefinition
            {
             
            	        newCompositeNode(grammarAccess.getPOMAccess().getArtifactDefinitionArtifactDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArtifactDefinition_in_rulePOM175);
            lv_artifactDefinition_2_0=ruleArtifactDefinition();

            state._fsp--;


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
                     
                    	        newCompositeNode(grammarAccess.getPOMAccess().getModulesModulesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModules_in_rulePOM196);
                    lv_modules_3_0=ruleModules();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:153:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:155:1: ( ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:156:2: ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPOMAccess().getUnorderedGroup_4());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:159:2: ( ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:160:3: ( ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_6_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_7_0= ruleDependencies ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_scm_8_0= ruleSCM ) ) ) ) ) )*
            loop6:
            do {
                int alt6=5;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( LA6_6 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
                            alt6=1;
                        }


                    }


                }
                else if ( LA6_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {
                    alt6=3;
                }
                else if ( (LA6_0==24||LA6_0==32|| LA6_0 >=34 && LA6_0<=36) && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {
                    alt6=4;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:162:4: ({...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:163:5: {...}? => ( ({...}? => ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
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

            	        if ( (LA4_0==27) ) {
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
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:167:16: ( (lv_propertyInclusions_5_0= rulePropertyInclusion ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_propertyInclusions_5_0= rulePropertyInclusion )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:168:1: (lv_propertyInclusions_5_0= rulePropertyInclusion )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:169:3: lv_propertyInclusions_5_0= rulePropertyInclusion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPOMAccess().getPropertyInclusionsPropertyInclusionParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePropertyInclusion_in_rulePOM263);
            	    	    lv_propertyInclusions_5_0=rulePropertyInclusion();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
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

            	        if ( (LA5_0==25) ) {
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
            	    	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:197:16: ( (lv_properties_6_0= ruleProperty ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_properties_6_0= ruleProperty )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:198:1: (lv_properties_6_0= ruleProperty )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:199:3: lv_properties_6_0= ruleProperty
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPOMAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleProperty_in_rulePOM339);
            	    	    lv_properties_6_0=ruleProperty();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
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
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:227:16: ( (lv_dependencies_7_0= ruleDependencies ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_dependencies_7_0= ruleDependencies )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:228:1: (lv_dependencies_7_0= ruleDependencies )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:229:3: lv_dependencies_7_0= ruleDependencies
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPOMAccess().getDependenciesDependenciesParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencies_in_rulePOM415);
            	    lv_dependencies_7_0=ruleDependencies();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "rulePOM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:257:16: ( (lv_scm_8_0= ruleSCM ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_scm_8_0= ruleSCM )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:258:1: (lv_scm_8_0= ruleSCM )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:259:3: lv_scm_8_0= ruleSCM
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPOMAccess().getScmSCMParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSCM_in_rulePOM490);
            	    lv_scm_8_0=ruleSCM();

            	    state._fsp--;


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPOMAccess().getUnorderedGroup_4());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPOMAccess().getUnorderedGroup_4());
            	

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:289:2: ( (lv_buildSteps_9_0= ruleBuildStep ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:290:1: (lv_buildSteps_9_0= ruleBuildStep )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:290:1: (lv_buildSteps_9_0= ruleBuildStep )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:291:3: lv_buildSteps_9_0= ruleBuildStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPOMAccess().getBuildStepsBuildStepParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBuildStep_in_rulePOM551);
            	    lv_buildSteps_9_0=ruleBuildStep();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:315:1: entryRuleParentRef returns [EObject current=null] : iv_ruleParentRef= ruleParentRef EOF ;
    public final EObject entryRuleParentRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:316:2: (iv_ruleParentRef= ruleParentRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:317:2: iv_ruleParentRef= ruleParentRef EOF
            {
             newCompositeNode(grammarAccess.getParentRefRule()); 
            pushFollow(FOLLOW_ruleParentRef_in_entryRuleParentRef588);
            iv_ruleParentRef=ruleParentRef();

            state._fsp--;

             current =iv_ruleParentRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentRef598); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:324:1: ruleParentRef returns [EObject current=null] : (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleParentRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_relativePath_2_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:327:28: ( (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:328:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:328:1: (otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:328:3: otherlv_0= 'parent' ( (lv_coordinates_1_0= ruleCoordinates ) ) ( (lv_relativePath_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleParentRef635); 

                	newLeafNode(otherlv_0, grammarAccess.getParentRefAccess().getParentKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:332:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:333:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:333:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:334:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getParentRefAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_ruleParentRef656);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;


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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:350:2: ( (lv_relativePath_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:351:1: (lv_relativePath_2_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:351:1: (lv_relativePath_2_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:352:3: lv_relativePath_2_0= RULE_STRING
                    {
                    lv_relativePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParentRef673); 

                    			newLeafNode(lv_relativePath_2_0, grammarAccess.getParentRefAccess().getRelativePathSTRINGTerminalRuleCall_2_0()); 
                    		

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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:376:1: entryRuleModules returns [EObject current=null] : iv_ruleModules= ruleModules EOF ;
    public final EObject entryRuleModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModules = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:377:2: (iv_ruleModules= ruleModules EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:378:2: iv_ruleModules= ruleModules EOF
            {
             newCompositeNode(grammarAccess.getModulesRule()); 
            pushFollow(FOLLOW_ruleModules_in_entryRuleModules715);
            iv_ruleModules=ruleModules();

            state._fsp--;

             current =iv_ruleModules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModules725); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:385:1: ruleModules returns [EObject current=null] : (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:388:28: ( (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:389:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:389:1: (otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:389:3: otherlv_0= 'modules' ( (lv_names_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModules762); 

                	newLeafNode(otherlv_0, grammarAccess.getModulesAccess().getModulesKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:393:1: ( (lv_names_1_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:394:1: (lv_names_1_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:394:1: (lv_names_1_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:395:3: lv_names_1_0= RULE_STRING
            {
            lv_names_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules779); 

            			newLeafNode(lv_names_1_0, grammarAccess.getModulesAccess().getNamesSTRINGTerminalRuleCall_1_0()); 
            		

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:411:2: (otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:411:4: otherlv_2= ',' ( (lv_names_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModules797); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModulesAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:415:1: ( (lv_names_3_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:416:1: (lv_names_3_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:416:1: (lv_names_3_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:417:3: lv_names_3_0= RULE_STRING
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModules814); 

            	    			newLeafNode(lv_names_3_0, grammarAccess.getModulesAccess().getNamesSTRINGTerminalRuleCall_2_1_0()); 
            	    		

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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:441:1: entryRuleArtifactDefinition returns [EObject current=null] : iv_ruleArtifactDefinition= ruleArtifactDefinition EOF ;
    public final EObject entryRuleArtifactDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactDefinition = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:442:2: (iv_ruleArtifactDefinition= ruleArtifactDefinition EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:443:2: iv_ruleArtifactDefinition= ruleArtifactDefinition EOF
            {
             newCompositeNode(grammarAccess.getArtifactDefinitionRule()); 
            pushFollow(FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition857);
            iv_ruleArtifactDefinition=ruleArtifactDefinition();

            state._fsp--;

             current =iv_ruleArtifactDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifactDefinition867); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:450:1: ruleArtifactDefinition returns [EObject current=null] : ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:453:28: ( ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:2: () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArtifactDefinitionAccess().getArtifactDefinitionAction_0(),
                        current);
                

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:460:2: (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:460:4: otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndDot ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArtifactDefinition914); 

                        	newLeafNode(otherlv_1, grammarAccess.getArtifactDefinitionAccess().getGroupKeyword_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:464:1: ( (lv_groupId_2_0= ruleIDAndDot ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:465:1: (lv_groupId_2_0= ruleIDAndDot )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:465:1: (lv_groupId_2_0= ruleIDAndDot )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:466:3: lv_groupId_2_0= ruleIDAndDot
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getGroupIdIDAndDotParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDot_in_ruleArtifactDefinition935);
                    lv_groupId_2_0=ruleIDAndDot();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"groupId",
                            		lv_groupId_2_0, 
                            		"IDAndDot");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:482:4: (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:482:6: otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndDash ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArtifactDefinition950); 

                        	newLeafNode(otherlv_3, grammarAccess.getArtifactDefinitionAccess().getArtifactKeyword_2_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:486:1: ( (lv_artifactId_4_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:487:1: (lv_artifactId_4_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:487:1: (lv_artifactId_4_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:488:3: lv_artifactId_4_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getArtifactIdIDAndDashParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_ruleArtifactDefinition971);
                    lv_artifactId_4_0=ruleIDAndDash();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArtifactDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"artifactId",
                            		lv_artifactId_4_0, 
                            		"IDAndDash");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:504:4: (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:504:6: otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleArtifactDefinition986); 

                        	newLeafNode(otherlv_5, grammarAccess.getArtifactDefinitionAccess().getVersionKeyword_3_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:508:1: ( (lv_version_6_0= ruleVersion ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:509:1: (lv_version_6_0= ruleVersion )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:509:1: (lv_version_6_0= ruleVersion )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:510:3: lv_version_6_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getVersionVersionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersion_in_ruleArtifactDefinition1007);
                    lv_version_6_0=ruleVersion();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:526:4: (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:526:6: otherlv_7= 'type' ( (lv_type_8_0= ruleText ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleArtifactDefinition1022); 

                        	newLeafNode(otherlv_7, grammarAccess.getArtifactDefinitionAccess().getTypeKeyword_4_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:530:1: ( (lv_type_8_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:531:1: (lv_type_8_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:531:1: (lv_type_8_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:532:3: lv_type_8_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getTypeTextParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleArtifactDefinition1043);
                    lv_type_8_0=ruleText();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:548:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:550:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:550:1: ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:551:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:554:2: ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:555:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:555:3: ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:557:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:557:4: ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:558:5: {...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:558:115: ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:559:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:562:6: ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:562:7: {...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:562:16: (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:562:18: otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleArtifactDefinition1103); 

            	        	newLeafNode(otherlv_10, grammarAccess.getArtifactDefinitionAccess().getNameKeyword_5_0_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:566:1: ( (lv_artifactName_11_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:567:1: (lv_artifactName_11_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:567:1: (lv_artifactName_11_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:568:3: lv_artifactName_11_0= RULE_STRING
            	    {
            	    lv_artifactName_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1120); 

            	    			newLeafNode(lv_artifactName_11_0, grammarAccess.getArtifactDefinitionAccess().getArtifactNameSTRINGTerminalRuleCall_5_0_1_0()); 
            	    		

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:591:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:591:4: ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:5: {...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:592:115: ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:593:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:596:6: ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:596:7: {...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArtifactDefinition", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:596:16: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:596:18: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleArtifactDefinition1193); 

            	        	newLeafNode(otherlv_12, grammarAccess.getArtifactDefinitionAccess().getDescriptionKeyword_5_1_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:600:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:601:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:601:1: (lv_description_13_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:602:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArtifactDefinition1210); 

            	    			newLeafNode(lv_description_13_0, grammarAccess.getArtifactDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_5_1_1_0()); 
            	    		

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getArtifactDefinitionAccess().getUnorderedGroup_5());
            	

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleIDAndDot"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:640:1: entryRuleIDAndDot returns [String current=null] : iv_ruleIDAndDot= ruleIDAndDot EOF ;
    public final String entryRuleIDAndDot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndDot = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:641:2: (iv_ruleIDAndDot= ruleIDAndDot EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:642:2: iv_ruleIDAndDot= ruleIDAndDot EOF
            {
             newCompositeNode(grammarAccess.getIDAndDotRule()); 
            pushFollow(FOLLOW_ruleIDAndDot_in_entryRuleIDAndDot1293);
            iv_ruleIDAndDot=ruleIDAndDot();

            state._fsp--;

             current =iv_ruleIDAndDot.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndDot1304); 

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
    // $ANTLR end "entryRuleIDAndDot"


    // $ANTLR start "ruleIDAndDot"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:649:1: ruleIDAndDot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrPropteryRef_0= ruleIDOrPropteryRef (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndDot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDOrPropteryRef_0 = null;

        AntlrDatatypeRuleToken this_IDOrPropteryRef_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:652:28: ( (this_IDOrPropteryRef_0= ruleIDOrPropteryRef (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:653:1: (this_IDOrPropteryRef_0= ruleIDOrPropteryRef (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:653:1: (this_IDOrPropteryRef_0= ruleIDOrPropteryRef (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:654:5: this_IDOrPropteryRef_0= ruleIDOrPropteryRef (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )*
            {
             
                    newCompositeNode(grammarAccess.getIDAndDotAccess().getIDOrPropteryRefParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndDot1351);
            this_IDOrPropteryRef_0=ruleIDOrPropteryRef();

            state._fsp--;


            		current.merge(this_IDOrPropteryRef_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:664:1: (kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:665:2: kw= '.' this_IDOrPropteryRef_2= ruleIDOrPropteryRef
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndDot1370); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIDAndDotAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getIDAndDotAccess().getIDOrPropteryRefParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndDot1392);
            	    this_IDOrPropteryRef_2=ruleIDOrPropteryRef();

            	    state._fsp--;


            	    		current.merge(this_IDOrPropteryRef_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDAndDot"


    // $ANTLR start "entryRuleIDAndDash"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:689:1: entryRuleIDAndDash returns [String current=null] : iv_ruleIDAndDash= ruleIDAndDash EOF ;
    public final String entryRuleIDAndDash() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndDash = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:690:2: (iv_ruleIDAndDash= ruleIDAndDash EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:691:2: iv_ruleIDAndDash= ruleIDAndDash EOF
            {
             newCompositeNode(grammarAccess.getIDAndDashRule()); 
            pushFollow(FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1440);
            iv_ruleIDAndDash=ruleIDAndDash();

            state._fsp--;

             current =iv_ruleIDAndDash.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndDash1451); 

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
    // $ANTLR end "entryRuleIDAndDash"


    // $ANTLR start "ruleIDAndDash"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:698:1: ruleIDAndDash returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndDash() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:701:28: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:702:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:702:1: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:702:6: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1491); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:709:1: (kw= '-' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:710:2: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleIDAndDash1510); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getIDAndDashAccess().getHyphenMinusKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndDash1525); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getIDAndDashAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDAndDash"


    // $ANTLR start "entryRuleClassifier"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:730:1: entryRuleClassifier returns [String current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final String entryRuleClassifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifier = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:731:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:732:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1573);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1584); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:739:1: ruleClassifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:742:28: (this_ID_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1623); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getClassifierAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:758:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:759:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:760:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1668);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1679); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:767:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:770:28: (this_INT_0= RULE_INT )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:771:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1718); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:786:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:787:2: (iv_ruleText= ruleText EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:788:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1763);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1774); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:795:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Number_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:798:28: ( (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:799:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:799:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            loop17:
            do {
                int alt17=4;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:799:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1814); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:808:5: this_Number_1= ruleNumber
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTextAccess().getNumberParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleNumber_in_ruleText1847);
            	    this_Number_1=ruleNumber();

            	    state._fsp--;


            	    		current.merge(this_Number_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:819:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText1873); 

            	    		current.merge(this_ANY_OTHER_2);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_2, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:834:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:835:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:836:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName1920);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName1931); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:843:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )* ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:846:28: ( (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:847:1: (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:847:1: (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )*
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt18=1;
                    }
                    break;
                case 21:
                    {
                    alt18=2;
                    }
                    break;
                case 22:
                    {
                    alt18=3;
                    }
                    break;
                case 20:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:847:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyName1971); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getPropertyNameAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:856:2: kw= '-'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulePropertyName1995); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:863:2: kw= '_'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_rulePropertyName2014); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().get_Keyword_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:870:2: kw= '.'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulePropertyName2033); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getFullStopKeyword_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleIDOrPropteryRef"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:883:1: entryRuleIDOrPropteryRef returns [String current=null] : iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF ;
    public final String entryRuleIDOrPropteryRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrPropteryRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:884:2: (iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:885:2: iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF
            {
             newCompositeNode(grammarAccess.getIDOrPropteryRefRule()); 
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2075);
            iv_ruleIDOrPropteryRef=ruleIDOrPropteryRef();

            state._fsp--;

             current =iv_ruleIDOrPropteryRef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPropteryRef2086); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:892:1: ruleIDOrPropteryRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleIDOrPropteryRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PropertyName_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:895:28: ( (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:896:1: (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:896:1: (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:896:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrPropteryRef2126); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIDOrPropteryRefAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:904:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:904:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:905:2: kw= '${' this_PropertyName_2= rulePropertyName kw= '}'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleIDOrPropteryRef2151); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrPropteryRefAccess().getDollarSignLeftCurlyBracketKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getPropertyNameParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2173);
                    this_PropertyName_2=rulePropertyName();

                    state._fsp--;


                    		current.merge(this_PropertyName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleIDOrPropteryRef2191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrPropteryRefAccess().getRightCurlyBracketKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleVersion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:935:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:936:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:937:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2232);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2242); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:944:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_major_0_0 = null;

        AntlrDatatypeRuleToken lv_minor_2_0 = null;

        AntlrDatatypeRuleToken lv_incremental_4_0 = null;

        AntlrDatatypeRuleToken lv_qualifier_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:947:28: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:948:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:948:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:948:2: ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:948:2: ( (lv_major_0_0= ruleNumber ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:949:1: (lv_major_0_0= ruleNumber )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:949:1: (lv_major_0_0= ruleNumber )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:950:3: lv_major_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getMajorNumberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2288);
            lv_major_0_0=ruleNumber();

            state._fsp--;


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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:966:2: (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_INT) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:966:4: otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleVersion2301); 

                        	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:970:1: ( (lv_minor_2_0= ruleNumber ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:971:1: (lv_minor_2_0= ruleNumber )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:971:1: (lv_minor_2_0= ruleNumber )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:972:3: lv_minor_2_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getMinorNumberParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2322);
                    lv_minor_2_0=ruleNumber();

                    state._fsp--;


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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:988:2: (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==20) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==RULE_INT) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:988:4: otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) )
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVersion2335); 

                                	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_1_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:992:1: ( (lv_incremental_4_0= ruleNumber ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:993:1: (lv_incremental_4_0= ruleNumber )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:993:1: (lv_incremental_4_0= ruleNumber )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:994:3: lv_incremental_4_0= ruleNumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getVersionAccess().getIncrementalNumberParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2356);
                            lv_incremental_4_0=ruleNumber();

                            state._fsp--;


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
                            break;

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1010:6: (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1010:8: otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleVersion2373); 

                        	newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getHyphenMinusKeyword_2_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1014:1: ( (lv_qualifier_6_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1015:1: (lv_qualifier_6_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1015:1: (lv_qualifier_6_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1016:3: lv_qualifier_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getQualifierTextParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleVersion2394);
                    lv_qualifier_6_0=ruleText();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1040:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1041:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1042:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2432);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2442); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1049:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1052:28: ( (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1053:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1053:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1053:3: otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleProperty2479); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1057:1: ( (lv_name_1_0= rulePropertyName ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1058:1: (lv_name_1_0= rulePropertyName )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1058:1: (lv_name_1_0= rulePropertyName )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1059:3: lv_name_1_0= rulePropertyName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyName_in_ruleProperty2500);
            lv_name_1_0=rulePropertyName();

            state._fsp--;


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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleProperty2512); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1079:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1080:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1080:1: (lv_value_3_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1081:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty2529); 

            			newLeafNode(lv_value_3_0, grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1105:1: entryRulePropertyInclusion returns [EObject current=null] : iv_rulePropertyInclusion= rulePropertyInclusion EOF ;
    public final EObject entryRulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1106:2: (iv_rulePropertyInclusion= rulePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1107:2: iv_rulePropertyInclusion= rulePropertyInclusion EOF
            {
             newCompositeNode(grammarAccess.getPropertyInclusionRule()); 
            pushFollow(FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2570);
            iv_rulePropertyInclusion=rulePropertyInclusion();

            state._fsp--;

             current =iv_rulePropertyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInclusion2580); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1114:1: rulePropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) ;
    public final EObject rulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1117:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1118:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1118:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1118:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePropertyInclusion2617); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1122:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1123:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1123:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1124:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyInclusion2637); 

            		newLeafNode(otherlv_1, grammarAccess.getPropertyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePropertyInclusion2649); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyInclusionAccess().getPropertiesKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1147:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1148:2: (iv_ruleDependencies= ruleDependencies EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1149:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_ruleDependencies_in_entryRuleDependencies2685);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencies2695); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1156:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1159:28: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:2: () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1161:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDependencies2741); 

                	newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDependencies2753); 

                	newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1174:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1174:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1174:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1175:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1175:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1176:3: lv_includes_3_0= ruleDependencyInclusion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getIncludesDependencyInclusionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyInclusion_in_ruleDependencies2775);
            	    lv_includes_3_0=ruleDependencyInclusion();

            	    state._fsp--;


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
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1193:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1193:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1194:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1194:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1195:3: lv_dependencyGroups_4_0= ruleDependencyGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getDependencyGroupsDependencyGroupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyGroup_in_ruleDependencies2802);
            	    lv_dependencyGroups_4_0=ruleDependencyGroup();

            	    state._fsp--;


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
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1212:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1212:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1213:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1213:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1214:3: lv_ungroupedDependencies_5_0= ruleUngroupedDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getUngroupedDependenciesUngroupedDependencyParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUngroupedDependency_in_ruleDependencies2829);
            	    lv_ungroupedDependencies_5_0=ruleUngroupedDependency();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDependencies2843); 

                	newLeafNode(otherlv_6, grammarAccess.getDependenciesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1242:1: entryRuleDependencyGroup returns [EObject current=null] : iv_ruleDependencyGroup= ruleDependencyGroup EOF ;
    public final EObject entryRuleDependencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyGroup = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1243:2: (iv_ruleDependencyGroup= ruleDependencyGroup EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1244:2: iv_ruleDependencyGroup= ruleDependencyGroup EOF
            {
             newCompositeNode(grammarAccess.getDependencyGroupRule()); 
            pushFollow(FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup2879);
            iv_ruleDependencyGroup=ruleDependencyGroup();

            state._fsp--;

             current =iv_ruleDependencyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyGroup2889); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1251:1: ruleDependencyGroup returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDependencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_scope_0_0 = null;

        EObject lv_dependecies_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1254:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1255:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1255:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1255:2: ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1255:2: ( (lv_scope_0_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1256:1: (lv_scope_0_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1256:1: (lv_scope_0_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1257:3: lv_scope_0_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyGroup2935);
            lv_scope_0_0=ruleDependencyScope();

            state._fsp--;


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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDependencyGroup2947); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyGroupAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1277:1: ( (lv_dependecies_2_0= ruleDependency ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==23||LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1278:1: (lv_dependecies_2_0= ruleDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1278:1: (lv_dependecies_2_0= ruleDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1279:3: lv_dependecies_2_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getDependeciesDependencyParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleDependencyGroup2968);
            	    lv_dependecies_2_0=ruleDependency();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDependencyGroup2981); 

                	newLeafNode(otherlv_3, grammarAccess.getDependencyGroupAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1307:1: entryRuleUngroupedDependency returns [EObject current=null] : iv_ruleUngroupedDependency= ruleUngroupedDependency EOF ;
    public final EObject entryRuleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUngroupedDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1308:2: (iv_ruleUngroupedDependency= ruleUngroupedDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1309:2: iv_ruleUngroupedDependency= ruleUngroupedDependency EOF
            {
             newCompositeNode(grammarAccess.getUngroupedDependencyRule()); 
            pushFollow(FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3017);
            iv_ruleUngroupedDependency=ruleUngroupedDependency();

            state._fsp--;

             current =iv_ruleUngroupedDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUngroupedDependency3027); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1316:1: ruleUngroupedDependency returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) ;
    public final EObject ruleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_dependency_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1319:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1320:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1320:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1320:2: ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1320:2: ( (lv_scope_0_0= ruleDependencyScope ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47||(LA25_0>=49 && LA25_0<=53)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1321:1: (lv_scope_0_0= ruleDependencyScope )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1321:1: (lv_scope_0_0= ruleDependencyScope )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1322:3: lv_scope_0_0= ruleDependencyScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3073);
                    lv_scope_0_0=ruleDependencyScope();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1338:3: ( (lv_dependency_1_0= ruleDependency ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1339:1: (lv_dependency_1_0= ruleDependency )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1339:1: (lv_dependency_1_0= ruleDependency )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1340:3: lv_dependency_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getDependencyDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependency_in_ruleUngroupedDependency3095);
            lv_dependency_1_0=ruleDependency();

            state._fsp--;


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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1364:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1365:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1366:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3131);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3141); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1373:1: ruleDependency returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1376:28: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1377:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1377:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1377:2: ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1377:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1378:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1378:1: (lv_optional_0_0= 'optional' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1379:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,31,FOLLOW_31_in_ruleDependency3184); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getDependencyAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependencyRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1392:3: ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1393:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1393:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1394:3: lv_coordinates_1_0= ruleExtendedCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getCoordinatesExtendedCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_ruleDependency3219);
            lv_coordinates_1_0=ruleExtendedCoordinates();

            state._fsp--;


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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1418:1: entryRuleDependencyInclusion returns [EObject current=null] : iv_ruleDependencyInclusion= ruleDependencyInclusion EOF ;
    public final EObject entryRuleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1419:2: (iv_ruleDependencyInclusion= ruleDependencyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1420:2: iv_ruleDependencyInclusion= ruleDependencyInclusion EOF
            {
             newCompositeNode(grammarAccess.getDependencyInclusionRule()); 
            pushFollow(FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3255);
            iv_ruleDependencyInclusion=ruleDependencyInclusion();

            state._fsp--;

             current =iv_ruleDependencyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyInclusion3265); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1427:1: ruleDependencyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) ;
    public final EObject ruleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1430:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDependencyInclusion3302); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1435:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1436:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1436:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1437:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyInclusion3322); 

            		newLeafNode(otherlv_1, grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDependencyInclusion3334); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1452:1: ( (lv_scope_3_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1453:1: (lv_scope_3_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1453:1: (lv_scope_3_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1454:3: lv_scope_3_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3355);
            lv_scope_3_0=ruleDependencyScope();

            state._fsp--;


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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1478:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1479:2: (iv_ruleSCM= ruleSCM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1480:2: iv_ruleSCM= ruleSCM EOF
            {
             newCompositeNode(grammarAccess.getSCMRule()); 
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM3391);
            iv_ruleSCM=ruleSCM();

            state._fsp--;

             current =iv_ruleSCM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM3401); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1487:1: ruleSCM returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1490:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1491:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1491:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1493:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1493:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1494:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSCMAccess().getUnorderedGroup());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1497:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1498:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1498:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=5;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1500:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1500:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1501:5: {...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1501:98: ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1502:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1505:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1505:7: {...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1505:16: (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1505:18: otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSCM3483); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getScmKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSCM3495); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSCMAccess().getLeftCurlyBracketKeyword_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1513:1: (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==33) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1513:3: otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSCM3508); 

            	                	newLeafNode(otherlv_3, grammarAccess.getSCMAccess().getConKeyword_0_2_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1517:1: ( (lv_connection_4_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1518:1: (lv_connection_4_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1518:1: (lv_connection_4_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1519:3: lv_connection_4_0= RULE_STRING
            	            {
            	            lv_connection_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3525); 

            	            			newLeafNode(lv_connection_4_0, grammarAccess.getSCMAccess().getConnectionSTRINGTerminalRuleCall_0_2_1_0()); 
            	            		

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1542:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1542:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1543:5: {...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1543:98: ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1544:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1547:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1547:7: {...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1547:16: (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1547:18: otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleSCM3600); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSCMAccess().getDevKeyword_1_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1551:1: ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1552:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1552:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1553:3: lv_developerConncetion_6_0= RULE_STRING
            	    {
            	    lv_developerConncetion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3617); 

            	    			newLeafNode(lv_developerConncetion_6_0, grammarAccess.getSCMAccess().getDeveloperConncetionSTRINGTerminalRuleCall_1_1_0()); 
            	    		

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1576:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1576:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1577:5: {...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1577:98: ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1578:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1581:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1581:7: {...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1581:16: (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1581:18: otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleSCM3690); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSCMAccess().getUrlKeyword_2_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1585:1: ( (lv_url_8_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1586:1: (lv_url_8_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1586:1: (lv_url_8_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1587:3: lv_url_8_0= RULE_STRING
            	    {
            	    lv_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3707); 

            	    			newLeafNode(lv_url_8_0, grammarAccess.getSCMAccess().getUrlSTRINGTerminalRuleCall_2_1_0()); 
            	    		

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1610:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1610:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1611:5: {...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1611:98: ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1612:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:7: {...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:16: ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==36) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1615:19: otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleSCM3781); 

            	                	newLeafNode(otherlv_9, grammarAccess.getSCMAccess().getTagKeyword_3_0_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1619:1: ( (lv_tag_10_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1620:1: (lv_tag_10_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1620:1: (lv_tag_10_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1621:3: lv_tag_10_0= RULE_STRING
            	            {
            	            lv_tag_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3798); 

            	            			newLeafNode(lv_tag_10_0, grammarAccess.getSCMAccess().getTagSTRINGTerminalRuleCall_3_0_1_0()); 
            	            		

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
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSCM3817); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSCMAccess().getRightCurlyBracketKeyword_3_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSCMAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1664:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1665:2: (iv_rulePlugin= rulePlugin EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1666:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin3899);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin3909); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1676:28: ( (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1677:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1677:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1677:3: otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePlugin3946); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1681:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1682:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1682:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1683:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePlugin3967);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;


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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePlugin3979); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1703:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1705:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1705:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1706:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1709:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1710:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1710:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1713:5: {...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1713:103: ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1714:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:7: {...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:16: (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1717:18: otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_rulePlugin4037); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPluginAccess().getConfigKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePlugin4049); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_3_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1725:1: ( (lv_configuration_6_0= rulePluginConfiguration ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1726:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1726:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1727:3: lv_configuration_6_0= rulePluginConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginAccess().getConfigurationPluginConfigurationParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfiguration_in_rulePlugin4070);
            	    lv_configuration_6_0=rulePluginConfiguration();

            	    state._fsp--;


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

            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlugin4082); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1754:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1754:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1755:5: {...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1755:103: ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1756:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1759:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==42) ) {
            	            int LA30_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt30=1;
            	            }


            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1759:7: {...}? => ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1759:16: ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1760:1: (lv_executions_8_0= rulePluginExecution )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1760:1: (lv_executions_8_0= rulePluginExecution )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1761:3: lv_executions_8_0= rulePluginExecution
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPluginAccess().getExecutionsPluginExecutionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePluginExecution_in_rulePlugin4158);
            	    	    lv_executions_8_0=rulePluginExecution();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    if ( cnt30 >= 1 ) break loop30;
            	                EarlyExitException eee =
            	                    new EarlyExitException(30, input);
            	                throw eee;
            	        }
            	        cnt30++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePlugin4211); 

                	newLeafNode(otherlv_9, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1803:1: entryRulePluginConfiguration returns [EObject current=null] : iv_rulePluginConfiguration= rulePluginConfiguration EOF ;
    public final EObject entryRulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfiguration = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1804:2: (iv_rulePluginConfiguration= rulePluginConfiguration EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1805:2: iv_rulePluginConfiguration= rulePluginConfiguration EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationRule()); 
            pushFollow(FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4247);
            iv_rulePluginConfiguration=rulePluginConfiguration();

            state._fsp--;

             current =iv_rulePluginConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfiguration4257); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1812:1: rulePluginConfiguration returns [EObject current=null] : ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ ;
    public final EObject rulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configurationItems_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1815:28: ( ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1816:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1816:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1817:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1817:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1818:3: lv_configurationItems_0_0= rulePluginConfigurationItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsPluginConfigurationItemParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4302);
            	    lv_configurationItems_0_0=rulePluginConfigurationItem();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1842:1: entryRulePluginConfigurationItem returns [EObject current=null] : iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF ;
    public final EObject entryRulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationItem = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1843:2: (iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1844:2: iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationItemRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4338);
            iv_rulePluginConfigurationItem=rulePluginConfigurationItem();

            state._fsp--;

             current =iv_rulePluginConfigurationItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationItem4348); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1851:1: rulePluginConfigurationItem returns [EObject current=null] : (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) ;
    public final EObject rulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject this_PluginConfigurationParameter_0 = null;

        EObject this_PluginConfigurationParameterList_1 = null;

        EObject this_PluginConfigurationParameterMap_2 = null;

        EObject this_PluginConfigurationParameterProperties_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1854:28: ( (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1855:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1855:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case RULE_STRING:
                        case RULE_ID:
                        case 24:
                        case 30:
                        case 39:
                            {
                            alt33=1;
                            }
                            break;
                        case 41:
                            {
                            alt33=3;
                            }
                            break;
                        case 26:
                            {
                            alt33=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    alt33=2;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 24:
                    {
                    alt33=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1856:5: this_PluginConfigurationParameter_0= rulePluginConfigurationParameter
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4395);
                    this_PluginConfigurationParameter_0=rulePluginConfigurationParameter();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1866:5: this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4422);
                    this_PluginConfigurationParameterList_1=rulePluginConfigurationParameterList();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1876:5: this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterMapParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4449);
                    this_PluginConfigurationParameterMap_2=rulePluginConfigurationParameterMap();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterMap_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1886:5: this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterPropertiesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4476);
                    this_PluginConfigurationParameterProperties_3=rulePluginConfigurationParameterProperties();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterProperties_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1902:1: entryRulePluginConfigurationParameter returns [EObject current=null] : iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF ;
    public final EObject entryRulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameter = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1903:2: (iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1904:2: iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4511);
            iv_rulePluginConfigurationParameter=rulePluginConfigurationParameter();

            state._fsp--;

             current =iv_rulePluginConfigurationParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameter4521); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1911:1: rulePluginConfigurationParameter returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) ;
    public final EObject rulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1914:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1915:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1916:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1916:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1917:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4563); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1933:2: ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==30) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1933:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1933:3: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1934:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1934:1: (lv_value_1_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1935:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4586); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getPluginConfigurationParameterAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

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
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1952:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1952:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1952:8: otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameter4610); 

                        	newLeafNode(otherlv_2, grammarAccess.getPluginConfigurationParameterAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1956:1: ( (lv_children_3_0= rulePluginConfigurationItem ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1957:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1957:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1958:3: lv_children_3_0= rulePluginConfigurationItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterAccess().getChildrenPluginConfigurationItemParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4631);
                    	    lv_children_3_0=rulePluginConfigurationItem();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameter4644); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginConfigurationParameterAccess().getRightCurlyBracketKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1986:1: entryRulePluginConfigurationParameterList returns [EObject current=null] : iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF ;
    public final EObject entryRulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterList = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1987:2: (iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1988:2: iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterListRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4683);
            iv_rulePluginConfigurationParameterList=rulePluginConfigurationParameterList();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4693); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1995:1: rulePluginConfigurationParameterList returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1998:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1999:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1999:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1999:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1999:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2000:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2000:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2001:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList4735); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterListAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePluginConfigurationParameterList4752); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterListAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2021:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2022:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2022:1: (lv_values_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2023:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4769); 

            			newLeafNode(lv_values_2_0, grammarAccess.getPluginConfigurationParameterListAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            		

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2039:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2039:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePluginConfigurationParameterList4787); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterListAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2043:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2045:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4804); 

            	    			newLeafNode(lv_values_4_0, grammarAccess.getPluginConfigurationParameterListAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

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
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_rulePluginConfigurationParameterList4823); 

                	newLeafNode(otherlv_5, grammarAccess.getPluginConfigurationParameterListAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2073:1: entryRulePluginConfigurationParameterMap returns [EObject current=null] : iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF ;
    public final EObject entryRulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMap = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2074:2: (iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2075:2: iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap4859);
            iv_rulePluginConfigurationParameterMap=rulePluginConfigurationParameterMap();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap4869); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2082:1: rulePluginConfigurationParameterMap returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2085:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2086:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2086:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2086:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2086:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2087:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2087:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2088:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap4911); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterMapAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameterMap4928); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2108:1: ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2109:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2109:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2110:3: lv_entries_2_0= rulePluginConfigurationParameterMapEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesPluginConfigurationParameterMapEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap4949);
            	    lv_entries_2_0=rulePluginConfigurationParameterMapEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterMap4962); 

                	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterMapAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2138:1: entryRulePluginConfigurationParameterMapEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMapEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2139:2: (iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2140:2: iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry4998);
            iv_rulePluginConfigurationParameterMapEntry=rulePluginConfigurationParameterMapEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMapEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5008); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2147:1: rulePluginConfigurationParameterMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2150:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2151:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2152:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2152:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2153:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5050); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_rulePluginConfigurationParameterMapEntry5067); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2173:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2174:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2174:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2175:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5084); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2199:1: entryRulePluginConfigurationParameterProperties returns [EObject current=null] : iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF ;
    public final EObject entryRulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2200:2: (iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2201:2: iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5125);
            iv_rulePluginConfigurationParameterProperties=rulePluginConfigurationParameterProperties();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5135); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2208:1: rulePluginConfigurationParameterProperties returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2211:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2212:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2212:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2212:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2212:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2213:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2213:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2214:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5177); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameterProperties5194); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2234:1: ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2235:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2235:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2236:3: lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesPluginConfigurationParameterPropertyEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5215);
            	    lv_entries_2_0=rulePluginConfigurationParameterPropertyEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterProperties5228); 

                	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2264:1: entryRulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterPropertyEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2265:2: (iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2266:2: iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertyEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5264);
            iv_rulePluginConfigurationParameterPropertyEntry=rulePluginConfigurationParameterPropertyEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterPropertyEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5274); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2273:1: rulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2276:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2277:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2277:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2277:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2277:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2278:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2278:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2279:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5316); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePluginConfigurationParameterPropertyEntry5333); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getEqualsSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2299:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2300:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2300:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2301:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5350); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2325:1: entryRulePluginExecution returns [EObject current=null] : iv_rulePluginExecution= rulePluginExecution EOF ;
    public final EObject entryRulePluginExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginExecution = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2326:2: (iv_rulePluginExecution= rulePluginExecution EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2327:2: iv_rulePluginExecution= rulePluginExecution EOF
            {
             newCompositeNode(grammarAccess.getPluginExecutionRule()); 
            pushFollow(FOLLOW_rulePluginExecution_in_entryRulePluginExecution5391);
            iv_rulePluginExecution=rulePluginExecution();

            state._fsp--;

             current =iv_rulePluginExecution; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginExecution5401); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2334:1: rulePluginExecution returns [EObject current=null] : (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) ;
    public final EObject rulePluginExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_default_11_0=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        Enumerator lv_phase_3_0 = null;

        AntlrDatatypeRuleToken lv_goals_5_0 = null;

        AntlrDatatypeRuleToken lv_goals_7_0 = null;

        EObject lv_configuration_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2337:28: ( (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2338:3: otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePluginExecution5438); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginExecutionAccess().getExecKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:1: ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||(LA43_0>=43 && LA43_0<=44)) ) {
                alt43=1;
            }
            else if ( (LA43_0==45) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:3: ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2342:3: ( (lv_id_1_0= ruleIDAndDash ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2343:1: (lv_id_1_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2343:1: (lv_id_1_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2344:3: lv_id_1_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getIdIDAndDashParserRuleCall_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5461);
                            lv_id_1_0=ruleIDAndDash();

                            state._fsp--;


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
                            break;

                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2360:3: (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==43) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2360:5: otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) )
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_43_in_rulePluginExecution5475); 

                                	newLeafNode(otherlv_2, grammarAccess.getPluginExecutionAccess().getInKeyword_1_0_1_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2364:1: ( (lv_phase_3_0= rulePhase ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2365:1: (lv_phase_3_0= rulePhase )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2365:1: (lv_phase_3_0= rulePhase )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2366:3: lv_phase_3_0= rulePhase
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getPhasePhaseEnumRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePhase_in_rulePluginExecution5496);
                            lv_phase_3_0=rulePhase();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"phase",
                                    		lv_phase_3_0, 
                                    		"Phase");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_rulePluginExecution5510); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginExecutionAccess().getWithGoalsKeyword_1_0_2());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2386:1: ( (lv_goals_5_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2387:1: (lv_goals_5_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2387:1: (lv_goals_5_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2388:3: lv_goals_5_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5531);
                    lv_goals_5_0=ruleIDAndDash();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                    	        }
                           		add(
                           			current, 
                           			"goals",
                            		lv_goals_5_0, 
                            		"IDAndDash");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2404:2: (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==13) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2404:4: otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePluginExecution5544); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPluginExecutionAccess().getCommaKeyword_1_0_4_0());
                    	        
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2408:1: ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2409:1: (lv_goals_7_0= ruleIDAndDash )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2409:1: (lv_goals_7_0= ruleIDAndDash )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2410:3: lv_goals_7_0= ruleIDAndDash
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5565);
                    	    lv_goals_7_0=ruleIDAndDash();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"goals",
                    	            		lv_goals_7_0, 
                    	            		"IDAndDash");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2426:4: (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==30) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2426:6: otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,30,FOLLOW_30_in_rulePluginExecution5580); 

                                	newLeafNode(otherlv_8, grammarAccess.getPluginExecutionAccess().getLeftCurlyBracketKeyword_1_0_5_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:1: ( (lv_configuration_9_0= rulePluginConfiguration ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2431:1: (lv_configuration_9_0= rulePluginConfiguration )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2431:1: (lv_configuration_9_0= rulePluginConfiguration )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2432:3: lv_configuration_9_0= rulePluginConfiguration
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getConfigurationPluginConfigurationParserRuleCall_1_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePluginConfiguration_in_rulePluginExecution5601);
                            lv_configuration_9_0=rulePluginConfiguration();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPluginExecutionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"configuration",
                                    		lv_configuration_9_0, 
                                    		"PluginConfiguration");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_10=(Token)match(input,24,FOLLOW_24_in_rulePluginExecution5613); 

                                	newLeafNode(otherlv_10, grammarAccess.getPluginExecutionAccess().getRightCurlyBracketKeyword_1_0_5_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2453:6: ( (lv_default_11_0= 'default' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2453:6: ( (lv_default_11_0= 'default' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2454:1: (lv_default_11_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2454:1: (lv_default_11_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2455:3: lv_default_11_0= 'default'
                    {
                    lv_default_11_0=(Token)match(input,45,FOLLOW_45_in_rulePluginExecution5640); 

                            newLeafNode(lv_default_11_0, grammarAccess.getPluginExecutionAccess().getDefaultDefaultKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPluginExecutionRule());
                    	        }
                           		setWithLastConsumed(current, "default", true, "default");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2476:1: entryRulePluginInclusion returns [EObject current=null] : iv_rulePluginInclusion= rulePluginInclusion EOF ;
    public final EObject entryRulePluginInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2477:2: (iv_rulePluginInclusion= rulePluginInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2478:2: iv_rulePluginInclusion= rulePluginInclusion EOF
            {
             newCompositeNode(grammarAccess.getPluginInclusionRule()); 
            pushFollow(FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5690);
            iv_rulePluginInclusion=rulePluginInclusion();

            state._fsp--;

             current =iv_rulePluginInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginInclusion5700); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2485:1: rulePluginInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2488:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2489:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2489:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2489:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePluginInclusion5737); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2493:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2494:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2494:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2495:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPluginInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginInclusion5757); 

            		newLeafNode(otherlv_1, grammarAccess.getPluginInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion5769); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2510:1: ( (lv_pluginCoordinates_3_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2511:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2511:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2512:3: lv_pluginCoordinates_3_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesCoordinatesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePluginInclusion5790);
            lv_pluginCoordinates_3_0=ruleCoordinates();

            state._fsp--;


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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2528:2: (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2528:4: otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion5803); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_4_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2532:1: ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==38) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2532:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2532:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:1: (lv_executionId_5_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:1: (lv_executionId_5_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2534:3: lv_executionId_5_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getExecutionIdIDAndDashParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginInclusion5825);
                            lv_executionId_5_0=ruleIDAndDash();

                            state._fsp--;


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
                            break;
                        case 2 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:6: ( (lv_config_6_0= 'config' ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2551:6: ( (lv_config_6_0= 'config' ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2552:1: (lv_config_6_0= 'config' )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2552:1: (lv_config_6_0= 'config' )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2553:3: lv_config_6_0= 'config'
                            {
                            lv_config_6_0=(Token)match(input,38,FOLLOW_38_in_rulePluginInclusion5849); 

                                    newLeafNode(lv_config_6_0, grammarAccess.getPluginInclusionAccess().getConfigConfigKeyword_4_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPluginInclusionRule());
                            	        }
                                   		setWithLastConsumed(current, "config", true, "config");
                            	    

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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2574:1: entryRuleBuildStep returns [EObject current=null] : iv_ruleBuildStep= ruleBuildStep EOF ;
    public final EObject entryRuleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildStep = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2575:2: (iv_ruleBuildStep= ruleBuildStep EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2576:2: iv_ruleBuildStep= ruleBuildStep EOF
            {
             newCompositeNode(grammarAccess.getBuildStepRule()); 
            pushFollow(FOLLOW_ruleBuildStep_in_entryRuleBuildStep5901);
            iv_ruleBuildStep=ruleBuildStep();

            state._fsp--;

             current =iv_ruleBuildStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildStep5911); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2583:1: ruleBuildStep returns [EObject current=null] : (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) ;
    public final EObject ruleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject this_Plugin_0 = null;

        EObject this_PluginInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2586:28: ( (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            else if ( (LA46_0==27) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2588:5: this_Plugin_0= rulePlugin
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePlugin_in_ruleBuildStep5958);
                    this_Plugin_0=rulePlugin();

                    state._fsp--;

                     
                            current = this_Plugin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2598:5: this_PluginInclusion_1= rulePluginInclusion
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginInclusionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginInclusion_in_ruleBuildStep5985);
                    this_PluginInclusion_1=rulePluginInclusion();

                    state._fsp--;

                     
                            current = this_PluginInclusion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2614:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2615:2: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2616:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates6020);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates6030); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2623:1: ruleCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2626:28: ( ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2627:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2627:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2627:2: ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2627:2: ( (lv_groupId_0_0= ruleIDAndDot ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2628:1: (lv_groupId_0_0= ruleIDAndDot )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2628:1: (lv_groupId_0_0= ruleIDAndDot )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2629:3: lv_groupId_0_0= ruleIDAndDot
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDot_in_ruleCoordinates6076);
            lv_groupId_0_0=ruleIDAndDot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinatesRule());
            	        }
                   		set(
                   			current, 
                   			"groupId",
                    		lv_groupId_0_0, 
                    		"IDAndDot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleCoordinates6088); 

                	newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2649:1: ( (lv_artifactId_2_0= ruleIDAndDash ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2650:1: (lv_artifactId_2_0= ruleIDAndDash )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2650:1: (lv_artifactId_2_0= ruleIDAndDash )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2651:3: lv_artifactId_2_0= ruleIDAndDash
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDash_in_ruleCoordinates6109);
            lv_artifactId_2_0=ruleIDAndDash();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinatesRule());
            	        }
                   		set(
                   			current, 
                   			"artifactId",
                    		lv_artifactId_2_0, 
                    		"IDAndDash");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleCoordinates6121); 

                	newLeafNode(otherlv_3, grammarAccess.getCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2671:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2672:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2672:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2673:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleCoordinates6142);
            lv_version_4_0=ruleVersion();

            state._fsp--;


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

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2697:1: entryRuleExtendedCoordinates returns [EObject current=null] : iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF ;
    public final EObject entryRuleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2698:2: (iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2699:2: iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF
            {
             newCompositeNode(grammarAccess.getExtendedCoordinatesRule()); 
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6178);
            iv_ruleExtendedCoordinates=ruleExtendedCoordinates();

            state._fsp--;

             current =iv_ruleExtendedCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedCoordinates6188); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2706:1: ruleExtendedCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) ;
    public final EObject ruleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_classifier_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2709:28: ( ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2710:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2710:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2710:2: ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2710:2: ( (lv_groupId_0_0= ruleIDAndDot ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2711:1: (lv_groupId_0_0= ruleIDAndDot )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2711:1: (lv_groupId_0_0= ruleIDAndDot )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2712:3: lv_groupId_0_0= ruleIDAndDot
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6234);
            lv_groupId_0_0=ruleIDAndDot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
            	        }
                   		set(
                   			current, 
                   			"groupId",
                    		lv_groupId_0_0, 
                    		"IDAndDot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6246); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2732:1: ( (lv_artifactId_2_0= ruleIDAndDash ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2733:1: (lv_artifactId_2_0= ruleIDAndDash )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2733:1: (lv_artifactId_2_0= ruleIDAndDash )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2734:3: lv_artifactId_2_0= ruleIDAndDash
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6267);
            lv_artifactId_2_0=ruleIDAndDash();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
            	        }
                   		set(
                   			current, 
                   			"artifactId",
                    		lv_artifactId_2_0, 
                    		"IDAndDash");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6279); 

                	newLeafNode(otherlv_3, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2754:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2755:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2755:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2756:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleExtendedCoordinates6300);
            lv_version_4_0=ruleVersion();

            state._fsp--;


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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2772:2: (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2772:4: otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6313); 

                        	newLeafNode(otherlv_5, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2776:1: ( (lv_type_6_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2777:1: (lv_type_6_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2777:1: (lv_type_6_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2778:3: lv_type_6_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getTypeIDAndDashParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6334);
                    lv_type_6_0=ruleIDAndDash();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedCoordinatesRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"IDAndDash");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2794:2: (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==46) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2794:4: otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) )
                            {
                            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6347); 

                                	newLeafNode(otherlv_7, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2798:1: ( (lv_classifier_8_0= ruleClassifier ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2799:1: (lv_classifier_8_0= ruleClassifier )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2799:1: (lv_classifier_8_0= ruleClassifier )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2800:3: lv_classifier_8_0= ruleClassifier
                            {
                             
                            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getClassifierClassifierParserRuleCall_5_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6368);
                            lv_classifier_8_0=ruleClassifier();

                            state._fsp--;


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
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2824:1: entryRulePOMImport returns [EObject current=null] : iv_rulePOMImport= rulePOMImport EOF ;
    public final EObject entryRulePOMImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOMImport = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2825:2: (iv_rulePOMImport= rulePOMImport EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2826:2: iv_rulePOMImport= rulePOMImport EOF
            {
             newCompositeNode(grammarAccess.getPOMImportRule()); 
            pushFollow(FOLLOW_rulePOMImport_in_entryRulePOMImport6408);
            iv_rulePOMImport=rulePOMImport();

            state._fsp--;

             current =iv_rulePOMImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOMImport6418); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2833:1: rulePOMImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePOMImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2836:28: ( (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2837:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2837:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2837:3: otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulePOMImport6455); 

                	newLeafNode(otherlv_0, grammarAccess.getPOMImportAccess().getImportKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2841:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2842:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2842:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2843:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePOMImport6476);
            lv_coordinates_1_0=ruleCoordinates();

            state._fsp--;


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

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePOMImport6488); 

                	newLeafNode(otherlv_2, grammarAccess.getPOMImportAccess().getAsKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2863:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2864:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2864:1: (lv_name_3_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2865:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOMImport6505); 

            			newLeafNode(lv_name_3_0, grammarAccess.getPOMImportAccess().getNameIDTerminalRuleCall_3_0()); 
            		

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

             leaveRule(); 
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


    // $ANTLR start "ruleDependencyScope"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2889:1: ruleDependencyScope returns [Enumerator current=null] : ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2891:28: ( ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt49=1;
                }
                break;
            case 50:
                {
                alt49=2;
                }
                break;
            case 51:
                {
                alt49=3;
                }
                break;
            case 52:
                {
                alt49=4;
                }
                break;
            case 53:
                {
                alt49=5;
                }
                break;
            case 47:
                {
                alt49=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:2: (enumLiteral_0= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:2: (enumLiteral_0= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:4: enumLiteral_0= 'compile'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleDependencyScope6560); 

                            current = grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:6: (enumLiteral_1= 'provided' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:6: (enumLiteral_1= 'provided' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleDependencyScope6577); 

                            current = grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2904:6: (enumLiteral_2= 'runtime' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2904:6: (enumLiteral_2= 'runtime' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2904:8: enumLiteral_2= 'runtime'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleDependencyScope6594); 

                            current = grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2910:6: (enumLiteral_3= 'system' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2910:6: (enumLiteral_3= 'system' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2910:8: enumLiteral_3= 'system'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleDependencyScope6611); 

                            current = grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2916:6: (enumLiteral_4= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2916:6: (enumLiteral_4= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2916:8: enumLiteral_4= 'test'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleDependencyScope6628); 

                            current = grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2922:6: (enumLiteral_5= 'import' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2922:6: (enumLiteral_5= 'import' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2922:8: enumLiteral_5= 'import'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleDependencyScope6645); 

                            current = grammarAccess.getDependencyScopeAccess().getIMPORTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDependencyScopeAccess().getIMPORTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2932:1: rulePhase returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2934:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            int alt50=31;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt50=1;
                }
                break;
            case 54:
                {
                alt50=2;
                }
                break;
            case 55:
                {
                alt50=3;
                }
                break;
            case 56:
                {
                alt50=4;
                }
                break;
            case 57:
                {
                alt50=5;
                }
                break;
            case 58:
                {
                alt50=6;
                }
                break;
            case 59:
                {
                alt50=7;
                }
                break;
            case 60:
                {
                alt50=8;
                }
                break;
            case 61:
                {
                alt50=9;
                }
                break;
            case 62:
                {
                alt50=10;
                }
                break;
            case 49:
                {
                alt50=11;
                }
                break;
            case 63:
                {
                alt50=12;
                }
                break;
            case 64:
                {
                alt50=13;
                }
                break;
            case 65:
                {
                alt50=14;
                }
                break;
            case 66:
                {
                alt50=15;
                }
                break;
            case 67:
                {
                alt50=16;
                }
                break;
            case 68:
                {
                alt50=17;
                }
                break;
            case 69:
                {
                alt50=18;
                }
                break;
            case 53:
                {
                alt50=19;
                }
                break;
            case 70:
                {
                alt50=20;
                }
                break;
            case 71:
                {
                alt50=21;
                }
                break;
            case 72:
                {
                alt50=22;
                }
                break;
            case 73:
                {
                alt50=23;
                }
                break;
            case 74:
                {
                alt50=24;
                }
                break;
            case 75:
                {
                alt50=25;
                }
                break;
            case 76:
                {
                alt50=26;
                }
                break;
            case 77:
                {
                alt50=27;
                }
                break;
            case 78:
                {
                alt50=28;
                }
                break;
            case 79:
                {
                alt50=29;
                }
                break;
            case 80:
                {
                alt50=30;
                }
                break;
            case 81:
                {
                alt50=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:2: (enumLiteral_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:2: (enumLiteral_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_rulePhase6690); 

                            current = grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2941:6: (enumLiteral_1= 'pre-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2941:6: (enumLiteral_1= 'pre-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2941:8: enumLiteral_1= 'pre-clean'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_rulePhase6707); 

                            current = grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:6: (enumLiteral_2= 'clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:6: (enumLiteral_2= 'clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:8: enumLiteral_2= 'clean'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_rulePhase6724); 

                            current = grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:6: (enumLiteral_3= 'post-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:6: (enumLiteral_3= 'post-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:8: enumLiteral_3= 'post-clean'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_rulePhase6741); 

                            current = grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:6: (enumLiteral_4= 'validate' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:6: (enumLiteral_4= 'validate' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:8: enumLiteral_4= 'validate'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_rulePhase6758); 

                            current = grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:6: (enumLiteral_5= 'initialize' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:6: (enumLiteral_5= 'initialize' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:8: enumLiteral_5= 'initialize'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_rulePhase6775); 

                            current = grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:6: (enumLiteral_6= 'generate-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:6: (enumLiteral_6= 'generate-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:8: enumLiteral_6= 'generate-sources'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_rulePhase6792); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:6: (enumLiteral_7= 'process-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:6: (enumLiteral_7= 'process-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:8: enumLiteral_7= 'process-sources'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_rulePhase6809); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2983:6: (enumLiteral_8= 'generate-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2983:6: (enumLiteral_8= 'generate-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2983:8: enumLiteral_8= 'generate-resources'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_rulePhase6826); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2989:6: (enumLiteral_9= 'process-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2989:6: (enumLiteral_9= 'process-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2989:8: enumLiteral_9= 'process-resources'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_rulePhase6843); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2995:6: (enumLiteral_10= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2995:6: (enumLiteral_10= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2995:8: enumLiteral_10= 'compile'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_49_in_rulePhase6860); 

                            current = grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3001:6: (enumLiteral_11= 'process-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3001:6: (enumLiteral_11= 'process-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3001:8: enumLiteral_11= 'process-classes'
                    {
                    enumLiteral_11=(Token)match(input,63,FOLLOW_63_in_rulePhase6877); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3007:6: (enumLiteral_12= 'generate-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3007:6: (enumLiteral_12= 'generate-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3007:8: enumLiteral_12= 'generate-test-sources'
                    {
                    enumLiteral_12=(Token)match(input,64,FOLLOW_64_in_rulePhase6894); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3013:6: (enumLiteral_13= 'process-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3013:6: (enumLiteral_13= 'process-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3013:8: enumLiteral_13= 'process-test-sources'
                    {
                    enumLiteral_13=(Token)match(input,65,FOLLOW_65_in_rulePhase6911); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3019:6: (enumLiteral_14= 'generate-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3019:6: (enumLiteral_14= 'generate-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3019:8: enumLiteral_14= 'generate-test-resources'
                    {
                    enumLiteral_14=(Token)match(input,66,FOLLOW_66_in_rulePhase6928); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3025:6: (enumLiteral_15= 'process-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3025:6: (enumLiteral_15= 'process-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3025:8: enumLiteral_15= 'process-test-resources'
                    {
                    enumLiteral_15=(Token)match(input,67,FOLLOW_67_in_rulePhase6945); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3031:6: (enumLiteral_16= 'test-compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3031:6: (enumLiteral_16= 'test-compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3031:8: enumLiteral_16= 'test-compile'
                    {
                    enumLiteral_16=(Token)match(input,68,FOLLOW_68_in_rulePhase6962); 

                            current = grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3037:6: (enumLiteral_17= 'process-test-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3037:6: (enumLiteral_17= 'process-test-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3037:8: enumLiteral_17= 'process-test-classes'
                    {
                    enumLiteral_17=(Token)match(input,69,FOLLOW_69_in_rulePhase6979); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3043:6: (enumLiteral_18= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3043:6: (enumLiteral_18= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3043:8: enumLiteral_18= 'test'
                    {
                    enumLiteral_18=(Token)match(input,53,FOLLOW_53_in_rulePhase6996); 

                            current = grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3049:6: (enumLiteral_19= 'prepare-package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3049:6: (enumLiteral_19= 'prepare-package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3049:8: enumLiteral_19= 'prepare-package'
                    {
                    enumLiteral_19=(Token)match(input,70,FOLLOW_70_in_rulePhase7013); 

                            current = grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3055:6: (enumLiteral_20= 'package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3055:6: (enumLiteral_20= 'package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3055:8: enumLiteral_20= 'package'
                    {
                    enumLiteral_20=(Token)match(input,71,FOLLOW_71_in_rulePhase7030); 

                            current = grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3061:6: (enumLiteral_21= 'pre-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3061:6: (enumLiteral_21= 'pre-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3061:8: enumLiteral_21= 'pre-integration-test'
                    {
                    enumLiteral_21=(Token)match(input,72,FOLLOW_72_in_rulePhase7047); 

                            current = grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3067:6: (enumLiteral_22= 'integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3067:6: (enumLiteral_22= 'integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3067:8: enumLiteral_22= 'integration-test'
                    {
                    enumLiteral_22=(Token)match(input,73,FOLLOW_73_in_rulePhase7064); 

                            current = grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3073:6: (enumLiteral_23= 'post-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3073:6: (enumLiteral_23= 'post-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3073:8: enumLiteral_23= 'post-integration-test'
                    {
                    enumLiteral_23=(Token)match(input,74,FOLLOW_74_in_rulePhase7081); 

                            current = grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3079:6: (enumLiteral_24= 'verify' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3079:6: (enumLiteral_24= 'verify' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3079:8: enumLiteral_24= 'verify'
                    {
                    enumLiteral_24=(Token)match(input,75,FOLLOW_75_in_rulePhase7098); 

                            current = grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3085:6: (enumLiteral_25= 'install' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3085:6: (enumLiteral_25= 'install' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3085:8: enumLiteral_25= 'install'
                    {
                    enumLiteral_25=(Token)match(input,76,FOLLOW_76_in_rulePhase7115); 

                            current = grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3091:6: (enumLiteral_26= 'deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3091:6: (enumLiteral_26= 'deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3091:8: enumLiteral_26= 'deploy'
                    {
                    enumLiteral_26=(Token)match(input,77,FOLLOW_77_in_rulePhase7132); 

                            current = grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3097:6: (enumLiteral_27= 'pre-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3097:6: (enumLiteral_27= 'pre-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3097:8: enumLiteral_27= 'pre-site'
                    {
                    enumLiteral_27=(Token)match(input,78,FOLLOW_78_in_rulePhase7149); 

                            current = grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3103:6: (enumLiteral_28= 'site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3103:6: (enumLiteral_28= 'site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3103:8: enumLiteral_28= 'site'
                    {
                    enumLiteral_28=(Token)match(input,79,FOLLOW_79_in_rulePhase7166); 

                            current = grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3109:6: (enumLiteral_29= 'post-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3109:6: (enumLiteral_29= 'post-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3109:8: enumLiteral_29= 'post-site'
                    {
                    enumLiteral_29=(Token)match(input,80,FOLLOW_80_in_rulePhase7183); 

                            current = grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3115:6: (enumLiteral_30= 'site-deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3115:6: (enumLiteral_30= 'site-deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3115:8: enumLiteral_30= 'site-deploy'
                    {
                    enumLiteral_30=(Token)match(input,81,FOLLOW_81_in_rulePhase7200); 

                            current = grammarAccess.getPhaseAccess().getSITE_DEPLOYEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getPhaseAccess().getSITE_DEPLOYEnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\1\1\1\uffff\1\7\5\uffff\2\7\2\uffff\1\7";
    static final String DFA17_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\5\1\uffff\1\24\4\5";
    static final String DFA17_maxS =
        "\1\65\1\uffff\1\65\2\uffff\1\46\1\5\1\uffff\1\56\1\65\1\5\1\6\1"+
        "\65";
    static final String DFA17_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\3\1\4\4\uffff\1\1\1\uffff\7\1\2\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\4\1\10\uffff\10\1",
            "",
            "\4\7\4\uffff\1\7\1\uffff\6\7\1\5\2\uffff\3\7\1\uffff\1\7\1"+
            "\uffff\4\7\1\uffff\4\7\10\uffff\1\6\7\7",
            "",
            "",
            "\1\10\21\uffff\1\1\16\uffff\1\7",
            "\1\11",
            "",
            "\1\1\1\7\5\uffff\1\7\11\uffff\1\7\10\uffff\1\1",
            "\1\7\17\uffff\1\12\1\uffff\2\7\2\uffff\1\7\3\uffff\1\7\16"+
            "\uffff\1\13\1\7\1\uffff\5\7",
            "\1\14",
            "\1\7\1\1",
            "\1\7\17\uffff\1\12\1\uffff\2\7\2\uffff\1\7\3\uffff\1\7\16"+
            "\uffff\1\13\1\7\1\uffff\5\7"
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
            return "()* loopback of 799:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*";
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\5\2\uffff\6\5\2\uffff";
    static final String DFA23_maxS =
        "\1\65\2\uffff\6\37\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\4\1\1\6\uffff\1\3\1\2";
    static final String DFA23_specialS =
        "\13\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\11\21\uffff\1\11\1\1\2\uffff\1\2\3\uffff\1\11\17\uffff\1"+
            "\10\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "\1\11\21\uffff\1\11\6\uffff\1\12\1\11",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1174:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+";
        }
    }
    static final String DFA29_eotS =
        "\13\uffff";
    static final String DFA29_eofS =
        "\1\1\12\uffff";
    static final String DFA29_minS =
        "\1\30\1\uffff\5\0\4\uffff";
    static final String DFA29_maxS =
        "\1\45\1\uffff\5\0\4\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\5\5\uffff\1\1\1\2\1\3\1\4";
    static final String DFA29_specialS =
        "\2\uffff\1\2\1\1\1\3\1\4\1\0\4\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\6\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1"+
            "\4\1\5\1\1",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1498:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePOM_in_entryRulePOM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_rulePOM131 = new BitSet(new long[]{0x0000803D2B0FD800L});
    public static final BitSet FOLLOW_ruleParentRef_in_rulePOM153 = new BitSet(new long[]{0x0000003D2B0FD000L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_rulePOM175 = new BitSet(new long[]{0x0000003D2B001002L});
    public static final BitSet FOLLOW_ruleModules_in_rulePOM196 = new BitSet(new long[]{0x0000003D2B000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_rulePOM263 = new BitSet(new long[]{0x0000003D2B000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePOM339 = new BitSet(new long[]{0x0000003D2B000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_rulePOM415 = new BitSet(new long[]{0x0000003D2B000002L});
    public static final BitSet FOLLOW_ruleSCM_in_rulePOM490 = new BitSet(new long[]{0x0000003D2B000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_rulePOM551 = new BitSet(new long[]{0x0000002008000002L});
    public static final BitSet FOLLOW_ruleParentRef_in_entryRuleParentRef588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentRef598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleParentRef635 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_ruleParentRef656 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParentRef673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModules_in_entryRuleModules715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModules725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModules762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules779 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleModules797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModules814 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_entryRuleArtifactDefinition857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifactDefinition867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArtifactDefinition914 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleArtifactDefinition935 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_15_in_ruleArtifactDefinition950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleArtifactDefinition971 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_ruleArtifactDefinition986 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleArtifactDefinition1007 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_17_in_ruleArtifactDefinition1022 = new BitSet(new long[]{0x00000000000C00E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleArtifactDefinition1043 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleArtifactDefinition1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1120 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_19_in_ruleArtifactDefinition1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArtifactDefinition1210 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_entryRuleIDAndDot1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndDot1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndDot1351 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIDAndDot1370 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndDot1392 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndDash1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1491 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleIDAndDash1510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1525 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1814 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleText1847 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText1873 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyName1971 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_21_in_rulePropertyName1995 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_22_in_rulePropertyName2014 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_20_in_rulePropertyName2033 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPropteryRef2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrPropteryRef2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIDOrPropteryRef2151 = new BitSet(new long[]{0x0000000001700020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIDOrPropteryRef2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2288 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2322 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2356 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2373 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleVersion2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleProperty2479 = new BitSet(new long[]{0x0000000004700020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleProperty2500 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProperty2512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInclusion2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePropertyInclusion2617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyInclusion2637 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePropertyInclusion2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_entryRuleDependencies2685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencies2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDependencies2741 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDependencies2753 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_ruleDependencies2775 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_ruleDependencies2802 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_ruleDependencies2829 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_24_in_ruleDependencies2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyGroup2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyGroup2935 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDependencyGroup2947 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDependencyGroup2968 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_24_in_ruleDependencyGroup2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUngroupedDependency3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3073 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleUngroupedDependency3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDependency3184 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_ruleDependency3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyInclusion3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDependencyInclusion3302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyInclusion3322 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependencyInclusion3334 = new BitSet(new long[]{0x003E800000000000L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSCM3483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSCM3495 = new BitSet(new long[]{0x0000001F01000002L});
    public static final BitSet FOLLOW_33_in_ruleSCM3508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3525 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_34_in_ruleSCM3600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3617 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_35_in_ruleSCM3690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3707 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_36_in_ruleSCM3781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3798 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSCM3817 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePlugin3946 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePlugin3967 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlugin3979 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_38_in_rulePlugin4037 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlugin4049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePlugin4070 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4082 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_rulePluginExecution_in_rulePlugin4158 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfiguration4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4302 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationItem4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameter4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4563 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameter4610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4631 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameter4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList4735 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePluginConfigurationParameterList4752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4769 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_13_in_rulePluginConfigurationParameterList4787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4804 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_40_in_rulePluginConfigurationParameterList4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap4859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap4911 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameterMap4928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap4949 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterMap4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry4998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5050 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePluginConfigurationParameterMapEntry5067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5177 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameterProperties5194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5215 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterProperties5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5316 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePluginConfigurationParameterPropertyEntry5333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginExecution_in_entryRulePluginExecution5391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginExecution5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePluginExecution5438 = new BitSet(new long[]{0x0000380000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5461 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_rulePluginExecution5475 = new BitSet(new long[]{0xFFE2200000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_rulePhase_in_rulePluginExecution5496 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePluginExecution5510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5531 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_13_in_rulePluginExecution5544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5565 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_30_in_rulePluginExecution5580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePluginExecution5601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePluginExecution5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePluginExecution5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginInclusion5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePluginInclusion5737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginInclusion5757 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion5769 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePluginInclusion5790 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion5803 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginInclusion5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePluginInclusion5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_entryRuleBuildStep5901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildStep5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleBuildStep5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_ruleBuildStep5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates6020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleCoordinates6076 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCoordinates6088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleCoordinates6109 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCoordinates6121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleCoordinates6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedCoordinates6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6234 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6267 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtendedCoordinates6300 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6334 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_entryRulePOMImport6408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOMImport6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePOMImport6455 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePOMImport6476 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePOMImport6488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOMImport6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDependencyScope6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDependencyScope6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDependencyScope6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDependencyScope6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDependencyScope6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDependencyScope6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePhase6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePhase6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePhase6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePhase6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePhase6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePhase6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePhase6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePhase6809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePhase6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePhase6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePhase6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePhase6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePhase6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePhase6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePhase6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePhase6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePhase6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePhase6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePhase6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePhase7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePhase7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePhase7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePhase7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePhase7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePhase7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePhase7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePhase7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePhase7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePhase7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePhase7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePhase7200 = new BitSet(new long[]{0x0000000000000002L});

}
