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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:450:1: ruleArtifactDefinition returns [EObject current=null] : ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:453:28: ( ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:1: ( () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:2: () (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleVersion ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleText ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= 'name' ( (lv_artifactName_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:454:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:455:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArtifactDefinitionAccess().getArtifactDefinitionAction_0(),
                        current);
                

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:460:2: (otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:460:4: otherlv_1= 'group' ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleArtifactDefinition914); 

                        	newLeafNode(otherlv_1, grammarAccess.getArtifactDefinitionAccess().getGroupKeyword_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:464:1: ( (lv_groupId_2_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:465:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:465:1: (lv_groupId_2_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:466:3: lv_groupId_2_0= ruleIDAndSpecialCharacters
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition935);
                    lv_groupId_2_0=ruleIDAndSpecialCharacters();

                    state._fsp--;


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
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:482:4: (otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:482:6: otherlv_3= 'artifact' ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArtifactDefinition950); 

                        	newLeafNode(otherlv_3, grammarAccess.getArtifactDefinitionAccess().getArtifactKeyword_2_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:486:1: ( (lv_artifactId_4_0= ruleIDAndSpecialCharacters ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:487:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:487:1: (lv_artifactId_4_0= ruleIDAndSpecialCharacters )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:488:3: lv_artifactId_4_0= ruleIDAndSpecialCharacters
                    {
                     
                    	        newCompositeNode(grammarAccess.getArtifactDefinitionAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition971);
                    lv_artifactId_4_0=ruleIDAndSpecialCharacters();

                    state._fsp--;


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


    // $ANTLR start "entryRuleIDAndSpecialCharacters"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:730:1: entryRuleIDAndSpecialCharacters returns [String current=null] : iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF ;
    public final String entryRuleIDAndSpecialCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDAndSpecialCharacters = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:731:2: (iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:732:2: iv_ruleIDAndSpecialCharacters= ruleIDAndSpecialCharacters EOF
            {
             newCompositeNode(grammarAccess.getIDAndSpecialCharactersRule()); 
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1573);
            iv_ruleIDAndSpecialCharacters=ruleIDAndSpecialCharacters();

            state._fsp--;

             current =iv_ruleIDAndSpecialCharacters.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1584); 

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
    // $ANTLR end "entryRuleIDAndSpecialCharacters"


    // $ANTLR start "ruleIDAndSpecialCharacters"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:739:1: ruleIDAndSpecialCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndSpecialCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:742:28: ( (this_ID_0= RULE_ID ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_ID_0= RULE_ID ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_ID_0= RULE_ID ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:6: this_ID_0= RULE_ID ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndSpecialCharacters1624); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIDAndSpecialCharactersAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:750:1: ( (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=20 && LA18_0<=22)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:750:2: (kw= '-' | kw= '.' | kw= '_' )* this_ID_4= RULE_ID
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:750:2: (kw= '-' | kw= '.' | kw= '_' )*
            	    loop17:
            	    do {
            	        int alt17=4;
            	        switch ( input.LA(1) ) {
            	        case 21:
            	            {
            	            alt17=1;
            	            }
            	            break;
            	        case 20:
            	            {
            	            alt17=2;
            	            }
            	            break;
            	        case 22:
            	            {
            	            alt17=3;
            	            }
            	            break;

            	        }

            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:751:2: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,21,FOLLOW_21_in_ruleIDAndSpecialCharacters1644); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getHyphenMinusKeyword_1_0_0()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:758:2: kw= '.'
            	    	    {
            	    	    kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndSpecialCharacters1663); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getFullStopKeyword_1_0_1()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:765:2: kw= '_'
            	    	    {
            	    	    kw=(Token)match(input,22,FOLLOW_22_in_ruleIDAndSpecialCharacters1682); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().get_Keyword_1_0_2()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDAndSpecialCharacters1699); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getIDAndSpecialCharactersAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleIDAndSpecialCharacters"


    // $ANTLR start "entryRuleClassifier"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:785:1: entryRuleClassifier returns [String current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final String entryRuleClassifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifier = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:786:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:787:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1747);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1758); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:794:1: ruleClassifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:797:28: (this_ID_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:798:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1797); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:813:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:814:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:815:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1842);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1853); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:822:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:825:28: (this_INT_0= RULE_INT )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:826:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1892); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:841:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:842:2: (iv_ruleText= ruleText EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:843:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1937);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1948); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:850:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Number_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:853:28: ( (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:854:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:854:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            loop19:
            do {
                int alt19=4;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:854:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText1988); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:863:5: this_Number_1= ruleNumber
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTextAccess().getNumberParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleNumber_in_ruleText2021);
            	    this_Number_1=ruleNumber();

            	    state._fsp--;


            	    		current.merge(this_Number_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:874:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2047); 

            	    		current.merge(this_ANY_OTHER_2);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_2, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:889:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:890:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:891:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName2094);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName2105); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:898:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )* ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:901:28: ( (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:902:1: (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:902:1: (this_ID_0= RULE_ID | kw= '-' | kw= '_' | kw= '.' )*
            loop20:
            do {
                int alt20=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt20=1;
                    }
                    break;
                case 21:
                    {
                    alt20=2;
                    }
                    break;
                case 22:
                    {
                    alt20=3;
                    }
                    break;
                case 20:
                    {
                    alt20=4;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:902:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyName2145); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getPropertyNameAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:911:2: kw= '-'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_rulePropertyName2169); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getHyphenMinusKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:918:2: kw= '_'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_rulePropertyName2188); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().get_Keyword_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:925:2: kw= '.'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_rulePropertyName2207); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getFullStopKeyword_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:938:1: entryRuleIDOrPropteryRef returns [String current=null] : iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF ;
    public final String entryRuleIDOrPropteryRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrPropteryRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:939:2: (iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:940:2: iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF
            {
             newCompositeNode(grammarAccess.getIDOrPropteryRefRule()); 
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2249);
            iv_ruleIDOrPropteryRef=ruleIDOrPropteryRef();

            state._fsp--;

             current =iv_ruleIDOrPropteryRef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPropteryRef2260); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:947:1: ruleIDOrPropteryRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleIDOrPropteryRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PropertyName_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:950:28: ( (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:951:1: (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:951:1: (this_ID_0= RULE_ID | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==23) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:951:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrPropteryRef2300); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIDOrPropteryRefAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:959:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:959:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:960:2: kw= '${' this_PropertyName_2= rulePropertyName kw= '}'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleIDOrPropteryRef2325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrPropteryRefAccess().getDollarSignLeftCurlyBracketKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getPropertyNameParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2347);
                    this_PropertyName_2=rulePropertyName();

                    state._fsp--;


                    		current.merge(this_PropertyName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleIDOrPropteryRef2365); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:990:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:991:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:992:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2406);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2416); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:999:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1002:28: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1003:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1003:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1003:2: ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1003:2: ( (lv_major_0_0= ruleNumber ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1004:1: (lv_major_0_0= ruleNumber )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1004:1: (lv_major_0_0= ruleNumber )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1005:3: lv_major_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getMajorNumberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2462);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1021:2: (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_INT) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1021:4: otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleVersion2475); 

                        	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1025:1: ( (lv_minor_2_0= ruleNumber ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1026:1: (lv_minor_2_0= ruleNumber )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1026:1: (lv_minor_2_0= ruleNumber )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1027:3: lv_minor_2_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getMinorNumberParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2496);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1043:2: (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==20) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==RULE_INT) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1043:4: otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) )
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVersion2509); 

                                	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_1_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1047:1: ( (lv_incremental_4_0= ruleNumber ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1048:1: (lv_incremental_4_0= ruleNumber )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1048:1: (lv_incremental_4_0= ruleNumber )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1049:3: lv_incremental_4_0= ruleNumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getVersionAccess().getIncrementalNumberParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2530);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1065:6: (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1065:8: otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleVersion2547); 

                        	newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getHyphenMinusKeyword_2_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1069:1: ( (lv_qualifier_6_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1070:1: (lv_qualifier_6_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1070:1: (lv_qualifier_6_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1071:3: lv_qualifier_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getQualifierTextParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleVersion2568);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1095:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1096:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1097:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2606);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2616); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1104:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1107:28: ( (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:3: otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleProperty2653); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1112:1: ( (lv_name_1_0= rulePropertyName ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1113:1: (lv_name_1_0= rulePropertyName )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1113:1: (lv_name_1_0= rulePropertyName )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1114:3: lv_name_1_0= rulePropertyName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyName_in_ruleProperty2674);
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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleProperty2686); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1134:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1135:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1135:1: (lv_value_3_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1136:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty2703); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1160:1: entryRulePropertyInclusion returns [EObject current=null] : iv_rulePropertyInclusion= rulePropertyInclusion EOF ;
    public final EObject entryRulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1161:2: (iv_rulePropertyInclusion= rulePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1162:2: iv_rulePropertyInclusion= rulePropertyInclusion EOF
            {
             newCompositeNode(grammarAccess.getPropertyInclusionRule()); 
            pushFollow(FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2744);
            iv_rulePropertyInclusion=rulePropertyInclusion();

            state._fsp--;

             current =iv_rulePropertyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInclusion2754); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1169:1: rulePropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) ;
    public final EObject rulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1172:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1173:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1173:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1173:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePropertyInclusion2791); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1177:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1178:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1178:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1179:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyInclusion2811); 

            		newLeafNode(otherlv_1, grammarAccess.getPropertyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePropertyInclusion2823); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1202:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1203:2: (iv_ruleDependencies= ruleDependencies EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1204:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_ruleDependencies_in_entryRuleDependencies2859);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencies2869); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1211:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1214:28: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:2: () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDependencies2915); 

                	newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDependencies2927); 

                	newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1229:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1229:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1229:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1230:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1230:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1231:3: lv_includes_3_0= ruleDependencyInclusion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getIncludesDependencyInclusionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyInclusion_in_ruleDependencies2949);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1248:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1248:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1249:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1249:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1250:3: lv_dependencyGroups_4_0= ruleDependencyGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getDependencyGroupsDependencyGroupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyGroup_in_ruleDependencies2976);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1267:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1267:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1268:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1268:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1269:3: lv_ungroupedDependencies_5_0= ruleUngroupedDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getUngroupedDependenciesUngroupedDependencyParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUngroupedDependency_in_ruleDependencies3003);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDependencies3017); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1297:1: entryRuleDependencyGroup returns [EObject current=null] : iv_ruleDependencyGroup= ruleDependencyGroup EOF ;
    public final EObject entryRuleDependencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyGroup = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1298:2: (iv_ruleDependencyGroup= ruleDependencyGroup EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1299:2: iv_ruleDependencyGroup= ruleDependencyGroup EOF
            {
             newCompositeNode(grammarAccess.getDependencyGroupRule()); 
            pushFollow(FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3053);
            iv_ruleDependencyGroup=ruleDependencyGroup();

            state._fsp--;

             current =iv_ruleDependencyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyGroup3063); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1306:1: ruleDependencyGroup returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDependencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_scope_0_0 = null;

        EObject lv_dependecies_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1309:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1310:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1310:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1310:2: ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1310:2: ( (lv_scope_0_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1311:1: (lv_scope_0_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1311:1: (lv_scope_0_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1312:3: lv_scope_0_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3109);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDependencyGroup3121); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyGroupAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1332:1: ( (lv_dependecies_2_0= ruleDependency ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==23||LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1333:1: (lv_dependecies_2_0= ruleDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1333:1: (lv_dependecies_2_0= ruleDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1334:3: lv_dependecies_2_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getDependeciesDependencyParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleDependencyGroup3142);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDependencyGroup3155); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1362:1: entryRuleUngroupedDependency returns [EObject current=null] : iv_ruleUngroupedDependency= ruleUngroupedDependency EOF ;
    public final EObject entryRuleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUngroupedDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1363:2: (iv_ruleUngroupedDependency= ruleUngroupedDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1364:2: iv_ruleUngroupedDependency= ruleUngroupedDependency EOF
            {
             newCompositeNode(grammarAccess.getUngroupedDependencyRule()); 
            pushFollow(FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3191);
            iv_ruleUngroupedDependency=ruleUngroupedDependency();

            state._fsp--;

             current =iv_ruleUngroupedDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUngroupedDependency3201); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1371:1: ruleUngroupedDependency returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) ;
    public final EObject ruleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_dependency_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1374:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:2: ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1375:2: ( (lv_scope_0_0= ruleDependencyScope ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47||(LA27_0>=49 && LA27_0<=53)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1376:1: (lv_scope_0_0= ruleDependencyScope )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1376:1: (lv_scope_0_0= ruleDependencyScope )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1377:3: lv_scope_0_0= ruleDependencyScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3247);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1393:3: ( (lv_dependency_1_0= ruleDependency ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1394:1: (lv_dependency_1_0= ruleDependency )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1394:1: (lv_dependency_1_0= ruleDependency )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1395:3: lv_dependency_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getDependencyDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependency_in_ruleUngroupedDependency3269);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1419:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1420:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1421:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3305);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3315); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1428:1: ruleDependency returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:28: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1432:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1432:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1432:2: ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1432:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1433:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1433:1: (lv_optional_0_0= 'optional' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1434:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,31,FOLLOW_31_in_ruleDependency3358); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getDependencyAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependencyRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1447:3: ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1448:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1448:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1449:3: lv_coordinates_1_0= ruleExtendedCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getCoordinatesExtendedCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_ruleDependency3393);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1473:1: entryRuleDependencyInclusion returns [EObject current=null] : iv_ruleDependencyInclusion= ruleDependencyInclusion EOF ;
    public final EObject entryRuleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1474:2: (iv_ruleDependencyInclusion= ruleDependencyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1475:2: iv_ruleDependencyInclusion= ruleDependencyInclusion EOF
            {
             newCompositeNode(grammarAccess.getDependencyInclusionRule()); 
            pushFollow(FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3429);
            iv_ruleDependencyInclusion=ruleDependencyInclusion();

            state._fsp--;

             current =iv_ruleDependencyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyInclusion3439); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1482:1: ruleDependencyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) ;
    public final EObject ruleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1485:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1486:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1486:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1486:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDependencyInclusion3476); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1490:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1491:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1491:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1492:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyInclusion3496); 

            		newLeafNode(otherlv_1, grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDependencyInclusion3508); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1507:1: ( (lv_scope_3_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1508:1: (lv_scope_3_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1508:1: (lv_scope_3_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1509:3: lv_scope_3_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3529);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1533:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1534:2: (iv_ruleSCM= ruleSCM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1535:2: iv_ruleSCM= ruleSCM EOF
            {
             newCompositeNode(grammarAccess.getSCMRule()); 
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM3565);
            iv_ruleSCM=ruleSCM();

            state._fsp--;

             current =iv_ruleSCM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM3575); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1542:1: ruleSCM returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1545:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1546:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1546:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1548:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1548:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1549:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSCMAccess().getUnorderedGroup());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1552:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1553:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1553:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=5;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1555:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1555:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1556:5: {...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1556:98: ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1557:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1560:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1560:7: {...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1560:16: (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1560:18: otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSCM3657); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getScmKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSCM3669); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSCMAccess().getLeftCurlyBracketKeyword_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1568:1: (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==33) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1568:3: otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSCM3682); 

            	                	newLeafNode(otherlv_3, grammarAccess.getSCMAccess().getConKeyword_0_2_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:1: ( (lv_connection_4_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1573:1: (lv_connection_4_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1573:1: (lv_connection_4_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1574:3: lv_connection_4_0= RULE_STRING
            	            {
            	            lv_connection_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3699); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1598:5: {...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1598:98: ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1599:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1602:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1602:7: {...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1602:16: (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1602:18: otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleSCM3774); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSCMAccess().getDevKeyword_1_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1606:1: ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1607:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1607:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1608:3: lv_developerConncetion_6_0= RULE_STRING
            	    {
            	    lv_developerConncetion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3791); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1631:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1631:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1632:5: {...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1632:98: ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1633:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1636:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1636:7: {...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1636:16: (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1636:18: otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleSCM3864); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSCMAccess().getUrlKeyword_2_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1640:1: ( (lv_url_8_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1641:1: (lv_url_8_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1641:1: (lv_url_8_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1642:3: lv_url_8_0= RULE_STRING
            	    {
            	    lv_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3881); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1665:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1665:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1666:5: {...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1666:98: ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1667:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:7: {...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:16: ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==36) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:19: otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_36_in_ruleSCM3955); 

            	                	newLeafNode(otherlv_9, grammarAccess.getSCMAccess().getTagKeyword_3_0_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1674:1: ( (lv_tag_10_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1675:1: (lv_tag_10_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1675:1: (lv_tag_10_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1676:3: lv_tag_10_0= RULE_STRING
            	            {
            	            lv_tag_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3972); 

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

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSCM3991); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSCMAccess().getRightCurlyBracketKeyword_3_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSCMAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1719:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1720:2: (iv_rulePlugin= rulePlugin EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1721:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin4073);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin4083); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1728:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1731:28: ( (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1732:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1732:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1732:3: otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePlugin4120); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1736:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1737:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1737:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1738:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePlugin4141);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePlugin4153); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1758:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1760:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1760:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1761:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1764:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1765:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1765:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1767:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1767:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1768:5: {...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1768:103: ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1769:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:7: {...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:16: (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1772:18: otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_rulePlugin4211); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPluginAccess().getConfigKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePlugin4223); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_3_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1780:1: ( (lv_configuration_6_0= rulePluginConfiguration ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1781:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1781:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1782:3: lv_configuration_6_0= rulePluginConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginAccess().getConfigurationPluginConfigurationParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfiguration_in_rulePlugin4244);
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

            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlugin4256); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:5: {...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1810:103: ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1811:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1814:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==42) ) {
            	            int LA32_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt32=1;
            	            }


            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1814:7: {...}? => ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1814:16: ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1815:1: (lv_executions_8_0= rulePluginExecution )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1815:1: (lv_executions_8_0= rulePluginExecution )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1816:3: lv_executions_8_0= rulePluginExecution
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPluginAccess().getExecutionsPluginExecutionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePluginExecution_in_rulePlugin4332);
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
            	    	    if ( cnt32 >= 1 ) break loop32;
            	                EarlyExitException eee =
            	                    new EarlyExitException(32, input);
            	                throw eee;
            	        }
            	        cnt32++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	

            }

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePlugin4385); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1858:1: entryRulePluginConfiguration returns [EObject current=null] : iv_rulePluginConfiguration= rulePluginConfiguration EOF ;
    public final EObject entryRulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfiguration = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1859:2: (iv_rulePluginConfiguration= rulePluginConfiguration EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1860:2: iv_rulePluginConfiguration= rulePluginConfiguration EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationRule()); 
            pushFollow(FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4421);
            iv_rulePluginConfiguration=rulePluginConfiguration();

            state._fsp--;

             current =iv_rulePluginConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfiguration4431); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1867:1: rulePluginConfiguration returns [EObject current=null] : ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ ;
    public final EObject rulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configurationItems_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1870:28: ( ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1871:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1871:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1872:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1872:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1873:3: lv_configurationItems_0_0= rulePluginConfigurationItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsPluginConfigurationItemParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4476);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1897:1: entryRulePluginConfigurationItem returns [EObject current=null] : iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF ;
    public final EObject entryRulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationItem = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1898:2: (iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1899:2: iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationItemRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4512);
            iv_rulePluginConfigurationItem=rulePluginConfigurationItem();

            state._fsp--;

             current =iv_rulePluginConfigurationItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationItem4522); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1906:1: rulePluginConfigurationItem returns [EObject current=null] : (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) ;
    public final EObject rulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject this_PluginConfigurationParameter_0 = null;

        EObject this_PluginConfigurationParameterList_1 = null;

        EObject this_PluginConfigurationParameterMap_2 = null;

        EObject this_PluginConfigurationParameterProperties_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1909:28: ( (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1910:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1910:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            int alt35=4;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                case 24:
                    {
                    alt35=1;
                    }
                    break;
                case 30:
                    {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case RULE_STRING:
                        case RULE_ID:
                        case 24:
                        case 30:
                        case 39:
                            {
                            alt35=1;
                            }
                            break;
                        case 41:
                            {
                            alt35=3;
                            }
                            break;
                        case 26:
                            {
                            alt35=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 35, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    alt35=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1911:5: this_PluginConfigurationParameter_0= rulePluginConfigurationParameter
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4569);
                    this_PluginConfigurationParameter_0=rulePluginConfigurationParameter();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1921:5: this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4596);
                    this_PluginConfigurationParameterList_1=rulePluginConfigurationParameterList();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1931:5: this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterMapParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4623);
                    this_PluginConfigurationParameterMap_2=rulePluginConfigurationParameterMap();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterMap_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1941:5: this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterPropertiesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4650);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1957:1: entryRulePluginConfigurationParameter returns [EObject current=null] : iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF ;
    public final EObject entryRulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameter = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1958:2: (iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1959:2: iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4685);
            iv_rulePluginConfigurationParameter=rulePluginConfigurationParameter();

            state._fsp--;

             current =iv_rulePluginConfigurationParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameter4695); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1966:1: rulePluginConfigurationParameter returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) ;
    public final EObject rulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1969:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1970:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1970:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1970:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1970:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1971:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1971:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1972:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4737); 

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1988:2: ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==30) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1988:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1988:3: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1989:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1989:1: (lv_value_1_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1990:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4760); 

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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:8: otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameter4784); 

                        	newLeafNode(otherlv_2, grammarAccess.getPluginConfigurationParameterAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2011:1: ( (lv_children_3_0= rulePluginConfigurationItem ) )+
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
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2012:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2012:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2013:3: lv_children_3_0= rulePluginConfigurationItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterAccess().getChildrenPluginConfigurationItemParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4805);
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
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameter4818); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2041:1: entryRulePluginConfigurationParameterList returns [EObject current=null] : iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF ;
    public final EObject entryRulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterList = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2042:2: (iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2043:2: iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterListRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4857);
            iv_rulePluginConfigurationParameterList=rulePluginConfigurationParameterList();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4867); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2050:1: rulePluginConfigurationParameterList returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2053:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2054:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2054:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2054:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2054:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2055:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2055:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2056:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList4909); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_rulePluginConfigurationParameterList4926); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterListAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2076:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2077:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2077:1: (lv_values_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2078:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4943); 

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2094:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==13) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2094:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePluginConfigurationParameterList4961); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterListAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2098:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2099:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2099:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2100:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4978); 

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
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_rulePluginConfigurationParameterList4997); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2128:1: entryRulePluginConfigurationParameterMap returns [EObject current=null] : iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF ;
    public final EObject entryRulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMap = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2129:2: (iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2130:2: iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5033);
            iv_rulePluginConfigurationParameterMap=rulePluginConfigurationParameterMap();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5043); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2137:1: rulePluginConfigurationParameterMap returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2140:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2141:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2141:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2141:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2141:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2142:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2142:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2143:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5085); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameterMap5102); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2163:1: ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2164:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2164:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2165:3: lv_entries_2_0= rulePluginConfigurationParameterMapEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesPluginConfigurationParameterMapEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5123);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterMap5136); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2193:1: entryRulePluginConfigurationParameterMapEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMapEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2194:2: (iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2195:2: iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5172);
            iv_rulePluginConfigurationParameterMapEntry=rulePluginConfigurationParameterMapEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMapEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5182); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2202:1: rulePluginConfigurationParameterMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2205:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2206:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2206:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2206:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2206:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2207:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2207:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2208:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5224); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_rulePluginConfigurationParameterMapEntry5241); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2228:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2229:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2229:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2230:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5258); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2254:1: entryRulePluginConfigurationParameterProperties returns [EObject current=null] : iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF ;
    public final EObject entryRulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2255:2: (iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2256:2: iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5299);
            iv_rulePluginConfigurationParameterProperties=rulePluginConfigurationParameterProperties();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5309); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2263:1: rulePluginConfigurationParameterProperties returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2266:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2267:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2267:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2267:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2267:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2268:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2268:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2269:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5351); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePluginConfigurationParameterProperties5368); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2289:1: ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2290:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2290:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2291:3: lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesPluginConfigurationParameterPropertyEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5389);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterProperties5402); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2319:1: entryRulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterPropertyEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2320:2: (iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2321:2: iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertyEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5438);
            iv_rulePluginConfigurationParameterPropertyEntry=rulePluginConfigurationParameterPropertyEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterPropertyEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5448); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2328:1: rulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2331:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2332:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2332:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2332:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2332:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2333:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2333:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2334:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5490); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePluginConfigurationParameterPropertyEntry5507); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getEqualsSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2354:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2355:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2355:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2356:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5524); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2380:1: entryRulePluginExecution returns [EObject current=null] : iv_rulePluginExecution= rulePluginExecution EOF ;
    public final EObject entryRulePluginExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginExecution = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2381:2: (iv_rulePluginExecution= rulePluginExecution EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2382:2: iv_rulePluginExecution= rulePluginExecution EOF
            {
             newCompositeNode(grammarAccess.getPluginExecutionRule()); 
            pushFollow(FOLLOW_rulePluginExecution_in_entryRulePluginExecution5565);
            iv_rulePluginExecution=rulePluginExecution();

            state._fsp--;

             current =iv_rulePluginExecution; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginExecution5575); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2389:1: rulePluginExecution returns [EObject current=null] : (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2392:28: ( (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2393:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2393:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2393:3: otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePluginExecution5612); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginExecutionAccess().getExecKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2397:1: ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||(LA45_0>=43 && LA45_0<=44)) ) {
                alt45=1;
            }
            else if ( (LA45_0==45) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2397:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2397:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2397:3: ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2397:3: ( (lv_id_1_0= ruleIDAndDash ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2398:1: (lv_id_1_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2398:1: (lv_id_1_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2399:3: lv_id_1_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getIdIDAndDashParserRuleCall_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5635);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2415:3: (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==43) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2415:5: otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) )
                            {
                            otherlv_2=(Token)match(input,43,FOLLOW_43_in_rulePluginExecution5649); 

                                	newLeafNode(otherlv_2, grammarAccess.getPluginExecutionAccess().getInKeyword_1_0_1_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2419:1: ( (lv_phase_3_0= rulePhase ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2420:1: (lv_phase_3_0= rulePhase )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2420:1: (lv_phase_3_0= rulePhase )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2421:3: lv_phase_3_0= rulePhase
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getPhasePhaseEnumRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePhase_in_rulePluginExecution5670);
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

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_rulePluginExecution5684); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginExecutionAccess().getWithGoalsKeyword_1_0_2());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2441:1: ( (lv_goals_5_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2442:1: (lv_goals_5_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2442:1: (lv_goals_5_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2443:3: lv_goals_5_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5705);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2459:2: (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==13) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2459:4: otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePluginExecution5718); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPluginExecutionAccess().getCommaKeyword_1_0_4_0());
                    	        
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2463:1: ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2464:1: (lv_goals_7_0= ruleIDAndDash )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2464:1: (lv_goals_7_0= ruleIDAndDash )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2465:3: lv_goals_7_0= ruleIDAndDash
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5739);
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
                    	    break loop43;
                        }
                    } while (true);

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2481:4: (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==30) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2481:6: otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,30,FOLLOW_30_in_rulePluginExecution5754); 

                                	newLeafNode(otherlv_8, grammarAccess.getPluginExecutionAccess().getLeftCurlyBracketKeyword_1_0_5_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2485:1: ( (lv_configuration_9_0= rulePluginConfiguration ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2486:1: (lv_configuration_9_0= rulePluginConfiguration )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2486:1: (lv_configuration_9_0= rulePluginConfiguration )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2487:3: lv_configuration_9_0= rulePluginConfiguration
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getConfigurationPluginConfigurationParserRuleCall_1_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePluginConfiguration_in_rulePluginExecution5775);
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

                            otherlv_10=(Token)match(input,24,FOLLOW_24_in_rulePluginExecution5787); 

                                	newLeafNode(otherlv_10, grammarAccess.getPluginExecutionAccess().getRightCurlyBracketKeyword_1_0_5_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2508:6: ( (lv_default_11_0= 'default' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2508:6: ( (lv_default_11_0= 'default' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2509:1: (lv_default_11_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2509:1: (lv_default_11_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2510:3: lv_default_11_0= 'default'
                    {
                    lv_default_11_0=(Token)match(input,45,FOLLOW_45_in_rulePluginExecution5814); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2531:1: entryRulePluginInclusion returns [EObject current=null] : iv_rulePluginInclusion= rulePluginInclusion EOF ;
    public final EObject entryRulePluginInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2532:2: (iv_rulePluginInclusion= rulePluginInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2533:2: iv_rulePluginInclusion= rulePluginInclusion EOF
            {
             newCompositeNode(grammarAccess.getPluginInclusionRule()); 
            pushFollow(FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5864);
            iv_rulePluginInclusion=rulePluginInclusion();

            state._fsp--;

             current =iv_rulePluginInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginInclusion5874); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2540:1: rulePluginInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2543:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2544:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2544:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2544:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePluginInclusion5911); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2548:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2549:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2549:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2550:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPluginInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginInclusion5931); 

            		newLeafNode(otherlv_1, grammarAccess.getPluginInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion5943); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2565:1: ( (lv_pluginCoordinates_3_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2566:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2566:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2567:3: lv_pluginCoordinates_3_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesCoordinatesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePluginInclusion5964);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2583:2: (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2583:4: otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion5977); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_4_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:1: ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==38) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2588:1: (lv_executionId_5_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2588:1: (lv_executionId_5_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2589:3: lv_executionId_5_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getExecutionIdIDAndDashParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginInclusion5999);
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
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2606:6: ( (lv_config_6_0= 'config' ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2606:6: ( (lv_config_6_0= 'config' ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2607:1: (lv_config_6_0= 'config' )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2607:1: (lv_config_6_0= 'config' )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2608:3: lv_config_6_0= 'config'
                            {
                            lv_config_6_0=(Token)match(input,38,FOLLOW_38_in_rulePluginInclusion6023); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2629:1: entryRuleBuildStep returns [EObject current=null] : iv_ruleBuildStep= ruleBuildStep EOF ;
    public final EObject entryRuleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildStep = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2630:2: (iv_ruleBuildStep= ruleBuildStep EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2631:2: iv_ruleBuildStep= ruleBuildStep EOF
            {
             newCompositeNode(grammarAccess.getBuildStepRule()); 
            pushFollow(FOLLOW_ruleBuildStep_in_entryRuleBuildStep6075);
            iv_ruleBuildStep=ruleBuildStep();

            state._fsp--;

             current =iv_ruleBuildStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildStep6085); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2638:1: ruleBuildStep returns [EObject current=null] : (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) ;
    public final EObject ruleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject this_Plugin_0 = null;

        EObject this_PluginInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2641:28: ( (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2642:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2642:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            else if ( (LA48_0==27) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2643:5: this_Plugin_0= rulePlugin
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePlugin_in_ruleBuildStep6132);
                    this_Plugin_0=rulePlugin();

                    state._fsp--;

                     
                            current = this_Plugin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2653:5: this_PluginInclusion_1= rulePluginInclusion
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginInclusionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginInclusion_in_ruleBuildStep6159);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2669:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2670:2: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2671:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates6194);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates6204); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2678:1: ruleCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2681:28: ( ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:2: ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2682:2: ( (lv_groupId_0_0= ruleIDAndDot ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2683:1: (lv_groupId_0_0= ruleIDAndDot )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2683:1: (lv_groupId_0_0= ruleIDAndDot )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2684:3: lv_groupId_0_0= ruleIDAndDot
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDot_in_ruleCoordinates6250);
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleCoordinates6262); 

                	newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2704:1: ( (lv_artifactId_2_0= ruleIDAndDash ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2705:1: (lv_artifactId_2_0= ruleIDAndDash )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2705:1: (lv_artifactId_2_0= ruleIDAndDash )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2706:3: lv_artifactId_2_0= ruleIDAndDash
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDash_in_ruleCoordinates6283);
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

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleCoordinates6295); 

                	newLeafNode(otherlv_3, grammarAccess.getCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2726:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2727:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2727:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2728:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleCoordinates6316);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2752:1: entryRuleExtendedCoordinates returns [EObject current=null] : iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF ;
    public final EObject entryRuleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2753:2: (iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2754:2: iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF
            {
             newCompositeNode(grammarAccess.getExtendedCoordinatesRule()); 
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6352);
            iv_ruleExtendedCoordinates=ruleExtendedCoordinates();

            state._fsp--;

             current =iv_ruleExtendedCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedCoordinates6362); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2761:1: ruleExtendedCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2764:28: ( ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2765:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2765:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2765:2: ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2765:2: ( (lv_groupId_0_0= ruleIDAndDot ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2766:1: (lv_groupId_0_0= ruleIDAndDot )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2766:1: (lv_groupId_0_0= ruleIDAndDot )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2767:3: lv_groupId_0_0= ruleIDAndDot
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6408);
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

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6420); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2787:1: ( (lv_artifactId_2_0= ruleIDAndDash ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2788:1: (lv_artifactId_2_0= ruleIDAndDash )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2788:1: (lv_artifactId_2_0= ruleIDAndDash )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2789:3: lv_artifactId_2_0= ruleIDAndDash
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6441);
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

            otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6453); 

                	newLeafNode(otherlv_3, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2809:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2810:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2810:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2811:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleExtendedCoordinates6474);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2827:2: (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2827:4: otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6487); 

                        	newLeafNode(otherlv_5, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2831:1: ( (lv_type_6_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2832:1: (lv_type_6_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2832:1: (lv_type_6_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2833:3: lv_type_6_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getTypeIDAndDashParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6508);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2849:2: (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==46) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2849:4: otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) )
                            {
                            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleExtendedCoordinates6521); 

                                	newLeafNode(otherlv_7, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2853:1: ( (lv_classifier_8_0= ruleClassifier ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2854:1: (lv_classifier_8_0= ruleClassifier )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2854:1: (lv_classifier_8_0= ruleClassifier )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2855:3: lv_classifier_8_0= ruleClassifier
                            {
                             
                            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getClassifierClassifierParserRuleCall_5_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6542);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2879:1: entryRulePOMImport returns [EObject current=null] : iv_rulePOMImport= rulePOMImport EOF ;
    public final EObject entryRulePOMImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOMImport = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2880:2: (iv_rulePOMImport= rulePOMImport EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2881:2: iv_rulePOMImport= rulePOMImport EOF
            {
             newCompositeNode(grammarAccess.getPOMImportRule()); 
            pushFollow(FOLLOW_rulePOMImport_in_entryRulePOMImport6582);
            iv_rulePOMImport=rulePOMImport();

            state._fsp--;

             current =iv_rulePOMImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOMImport6592); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2888:1: rulePOMImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePOMImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2891:28: ( (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:3: otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulePOMImport6629); 

                	newLeafNode(otherlv_0, grammarAccess.getPOMImportAccess().getImportKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2896:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2897:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2897:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2898:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePOMImport6650);
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

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePOMImport6662); 

                	newLeafNode(otherlv_2, grammarAccess.getPOMImportAccess().getAsKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2918:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2919:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2919:1: (lv_name_3_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2920:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOMImport6679); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2944:1: ruleDependencyScope returns [Enumerator current=null] : ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2946:28: ( ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt51=1;
                }
                break;
            case 50:
                {
                alt51=2;
                }
                break;
            case 51:
                {
                alt51=3;
                }
                break;
            case 52:
                {
                alt51=4;
                }
                break;
            case 53:
                {
                alt51=5;
                }
                break;
            case 47:
                {
                alt51=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:2: (enumLiteral_0= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:2: (enumLiteral_0= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2947:4: enumLiteral_0= 'compile'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleDependencyScope6734); 

                            current = grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:6: (enumLiteral_1= 'provided' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:6: (enumLiteral_1= 'provided' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2953:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleDependencyScope6751); 

                            current = grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:6: (enumLiteral_2= 'runtime' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:6: (enumLiteral_2= 'runtime' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2959:8: enumLiteral_2= 'runtime'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleDependencyScope6768); 

                            current = grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:6: (enumLiteral_3= 'system' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:6: (enumLiteral_3= 'system' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2965:8: enumLiteral_3= 'system'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleDependencyScope6785); 

                            current = grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:6: (enumLiteral_4= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:6: (enumLiteral_4= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2971:8: enumLiteral_4= 'test'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleDependencyScope6802); 

                            current = grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:6: (enumLiteral_5= 'import' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:6: (enumLiteral_5= 'import' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2977:8: enumLiteral_5= 'import'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleDependencyScope6819); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2987:1: rulePhase returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2989:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            int alt52=31;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt52=1;
                }
                break;
            case 54:
                {
                alt52=2;
                }
                break;
            case 55:
                {
                alt52=3;
                }
                break;
            case 56:
                {
                alt52=4;
                }
                break;
            case 57:
                {
                alt52=5;
                }
                break;
            case 58:
                {
                alt52=6;
                }
                break;
            case 59:
                {
                alt52=7;
                }
                break;
            case 60:
                {
                alt52=8;
                }
                break;
            case 61:
                {
                alt52=9;
                }
                break;
            case 62:
                {
                alt52=10;
                }
                break;
            case 49:
                {
                alt52=11;
                }
                break;
            case 63:
                {
                alt52=12;
                }
                break;
            case 64:
                {
                alt52=13;
                }
                break;
            case 65:
                {
                alt52=14;
                }
                break;
            case 66:
                {
                alt52=15;
                }
                break;
            case 67:
                {
                alt52=16;
                }
                break;
            case 68:
                {
                alt52=17;
                }
                break;
            case 69:
                {
                alt52=18;
                }
                break;
            case 53:
                {
                alt52=19;
                }
                break;
            case 70:
                {
                alt52=20;
                }
                break;
            case 71:
                {
                alt52=21;
                }
                break;
            case 72:
                {
                alt52=22;
                }
                break;
            case 73:
                {
                alt52=23;
                }
                break;
            case 74:
                {
                alt52=24;
                }
                break;
            case 75:
                {
                alt52=25;
                }
                break;
            case 76:
                {
                alt52=26;
                }
                break;
            case 77:
                {
                alt52=27;
                }
                break;
            case 78:
                {
                alt52=28;
                }
                break;
            case 79:
                {
                alt52=29;
                }
                break;
            case 80:
                {
                alt52=30;
                }
                break;
            case 81:
                {
                alt52=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:2: (enumLiteral_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:2: (enumLiteral_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_rulePhase6864); 

                            current = grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:6: (enumLiteral_1= 'pre-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:6: (enumLiteral_1= 'pre-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:8: enumLiteral_1= 'pre-clean'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_rulePhase6881); 

                            current = grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:6: (enumLiteral_2= 'clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:6: (enumLiteral_2= 'clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:8: enumLiteral_2= 'clean'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_rulePhase6898); 

                            current = grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:6: (enumLiteral_3= 'post-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:6: (enumLiteral_3= 'post-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:8: enumLiteral_3= 'post-clean'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_rulePhase6915); 

                            current = grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:6: (enumLiteral_4= 'validate' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:6: (enumLiteral_4= 'validate' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:8: enumLiteral_4= 'validate'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_rulePhase6932); 

                            current = grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3020:6: (enumLiteral_5= 'initialize' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3020:6: (enumLiteral_5= 'initialize' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3020:8: enumLiteral_5= 'initialize'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_rulePhase6949); 

                            current = grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3026:6: (enumLiteral_6= 'generate-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3026:6: (enumLiteral_6= 'generate-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3026:8: enumLiteral_6= 'generate-sources'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_rulePhase6966); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3032:6: (enumLiteral_7= 'process-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3032:6: (enumLiteral_7= 'process-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3032:8: enumLiteral_7= 'process-sources'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_rulePhase6983); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3038:6: (enumLiteral_8= 'generate-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3038:6: (enumLiteral_8= 'generate-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3038:8: enumLiteral_8= 'generate-resources'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_rulePhase7000); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3044:6: (enumLiteral_9= 'process-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3044:6: (enumLiteral_9= 'process-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3044:8: enumLiteral_9= 'process-resources'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_rulePhase7017); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3050:6: (enumLiteral_10= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3050:6: (enumLiteral_10= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3050:8: enumLiteral_10= 'compile'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_49_in_rulePhase7034); 

                            current = grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3056:6: (enumLiteral_11= 'process-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3056:6: (enumLiteral_11= 'process-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3056:8: enumLiteral_11= 'process-classes'
                    {
                    enumLiteral_11=(Token)match(input,63,FOLLOW_63_in_rulePhase7051); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3062:6: (enumLiteral_12= 'generate-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3062:6: (enumLiteral_12= 'generate-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3062:8: enumLiteral_12= 'generate-test-sources'
                    {
                    enumLiteral_12=(Token)match(input,64,FOLLOW_64_in_rulePhase7068); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3068:6: (enumLiteral_13= 'process-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3068:6: (enumLiteral_13= 'process-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3068:8: enumLiteral_13= 'process-test-sources'
                    {
                    enumLiteral_13=(Token)match(input,65,FOLLOW_65_in_rulePhase7085); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3074:6: (enumLiteral_14= 'generate-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3074:6: (enumLiteral_14= 'generate-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3074:8: enumLiteral_14= 'generate-test-resources'
                    {
                    enumLiteral_14=(Token)match(input,66,FOLLOW_66_in_rulePhase7102); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3080:6: (enumLiteral_15= 'process-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3080:6: (enumLiteral_15= 'process-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3080:8: enumLiteral_15= 'process-test-resources'
                    {
                    enumLiteral_15=(Token)match(input,67,FOLLOW_67_in_rulePhase7119); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3086:6: (enumLiteral_16= 'test-compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3086:6: (enumLiteral_16= 'test-compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3086:8: enumLiteral_16= 'test-compile'
                    {
                    enumLiteral_16=(Token)match(input,68,FOLLOW_68_in_rulePhase7136); 

                            current = grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3092:6: (enumLiteral_17= 'process-test-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3092:6: (enumLiteral_17= 'process-test-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3092:8: enumLiteral_17= 'process-test-classes'
                    {
                    enumLiteral_17=(Token)match(input,69,FOLLOW_69_in_rulePhase7153); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3098:6: (enumLiteral_18= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3098:6: (enumLiteral_18= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3098:8: enumLiteral_18= 'test'
                    {
                    enumLiteral_18=(Token)match(input,53,FOLLOW_53_in_rulePhase7170); 

                            current = grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3104:6: (enumLiteral_19= 'prepare-package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3104:6: (enumLiteral_19= 'prepare-package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3104:8: enumLiteral_19= 'prepare-package'
                    {
                    enumLiteral_19=(Token)match(input,70,FOLLOW_70_in_rulePhase7187); 

                            current = grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3110:6: (enumLiteral_20= 'package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3110:6: (enumLiteral_20= 'package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3110:8: enumLiteral_20= 'package'
                    {
                    enumLiteral_20=(Token)match(input,71,FOLLOW_71_in_rulePhase7204); 

                            current = grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3116:6: (enumLiteral_21= 'pre-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3116:6: (enumLiteral_21= 'pre-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3116:8: enumLiteral_21= 'pre-integration-test'
                    {
                    enumLiteral_21=(Token)match(input,72,FOLLOW_72_in_rulePhase7221); 

                            current = grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3122:6: (enumLiteral_22= 'integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3122:6: (enumLiteral_22= 'integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3122:8: enumLiteral_22= 'integration-test'
                    {
                    enumLiteral_22=(Token)match(input,73,FOLLOW_73_in_rulePhase7238); 

                            current = grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3128:6: (enumLiteral_23= 'post-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3128:6: (enumLiteral_23= 'post-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3128:8: enumLiteral_23= 'post-integration-test'
                    {
                    enumLiteral_23=(Token)match(input,74,FOLLOW_74_in_rulePhase7255); 

                            current = grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3134:6: (enumLiteral_24= 'verify' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3134:6: (enumLiteral_24= 'verify' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3134:8: enumLiteral_24= 'verify'
                    {
                    enumLiteral_24=(Token)match(input,75,FOLLOW_75_in_rulePhase7272); 

                            current = grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3140:6: (enumLiteral_25= 'install' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3140:6: (enumLiteral_25= 'install' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3140:8: enumLiteral_25= 'install'
                    {
                    enumLiteral_25=(Token)match(input,76,FOLLOW_76_in_rulePhase7289); 

                            current = grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3146:6: (enumLiteral_26= 'deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3146:6: (enumLiteral_26= 'deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3146:8: enumLiteral_26= 'deploy'
                    {
                    enumLiteral_26=(Token)match(input,77,FOLLOW_77_in_rulePhase7306); 

                            current = grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3152:6: (enumLiteral_27= 'pre-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3152:6: (enumLiteral_27= 'pre-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3152:8: enumLiteral_27= 'pre-site'
                    {
                    enumLiteral_27=(Token)match(input,78,FOLLOW_78_in_rulePhase7323); 

                            current = grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3158:6: (enumLiteral_28= 'site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3158:6: (enumLiteral_28= 'site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3158:8: enumLiteral_28= 'site'
                    {
                    enumLiteral_28=(Token)match(input,79,FOLLOW_79_in_rulePhase7340); 

                            current = grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3164:6: (enumLiteral_29= 'post-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3164:6: (enumLiteral_29= 'post-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3164:8: enumLiteral_29= 'post-site'
                    {
                    enumLiteral_29=(Token)match(input,80,FOLLOW_80_in_rulePhase7357); 

                            current = grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3170:6: (enumLiteral_30= 'site-deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3170:6: (enumLiteral_30= 'site-deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3170:8: enumLiteral_30= 'site-deploy'
                    {
                    enumLiteral_30=(Token)match(input,81,FOLLOW_81_in_rulePhase7374); 

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


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA19_eotS =
        "\15\uffff";
    static final String DFA19_eofS =
        "\1\1\1\uffff\1\5\5\uffff\2\5\2\uffff\1\5";
    static final String DFA19_minS =
        "\1\4\1\uffff\1\4\3\uffff\2\5\1\24\4\5";
    static final String DFA19_maxS =
        "\1\65\1\uffff\1\65\3\uffff\1\46\1\5\1\56\1\65\1\5\1\6\1\65";
    static final String DFA19_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\1\1\7\uffff";
    static final String DFA19_specialS =
        "\15\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\3\1\4\4\uffff\1\1\1\uffff\7\1\2\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\4\1\10\uffff\10\1",
            "",
            "\4\5\4\uffff\1\5\1\uffff\6\5\1\6\2\uffff\3\5\1\uffff\1\5\1"+
            "\uffff\4\5\1\uffff\4\5\10\uffff\1\7\7\5",
            "",
            "",
            "",
            "\1\10\21\uffff\1\1\16\uffff\1\5",
            "\1\11",
            "\1\1\1\5\5\uffff\1\5\11\uffff\1\5\10\uffff\1\1",
            "\1\5\17\uffff\1\12\1\uffff\2\5\2\uffff\1\5\3\uffff\1\5\16"+
            "\uffff\1\13\1\5\1\uffff\5\5",
            "\1\14",
            "\1\5\1\1",
            "\1\5\17\uffff\1\12\1\uffff\2\5\2\uffff\1\5\3\uffff\1\5\16"+
            "\uffff\1\13\1\5\1\uffff\5\5"
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
            return "()* loopback of 854:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*";
        }
    }
    static final String DFA25_eotS =
        "\13\uffff";
    static final String DFA25_eofS =
        "\13\uffff";
    static final String DFA25_minS =
        "\1\5\2\uffff\6\5\2\uffff";
    static final String DFA25_maxS =
        "\1\65\2\uffff\6\37\2\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\4\1\1\6\uffff\1\3\1\2";
    static final String DFA25_specialS =
        "\13\uffff}>";
    static final String[] DFA25_transitionS = {
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1229:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+";
        }
    }
    static final String DFA31_eotS =
        "\13\uffff";
    static final String DFA31_eofS =
        "\1\1\12\uffff";
    static final String DFA31_minS =
        "\1\30\1\uffff\5\0\4\uffff";
    static final String DFA31_maxS =
        "\1\45\1\uffff\5\0\4\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\5\5\uffff\1\1\1\2\1\3\1\4";
    static final String DFA31_specialS =
        "\2\uffff\1\1\1\0\1\2\1\3\1\4\4\uffff}>";
    static final String[] DFA31_transitionS = {
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1553:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
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
    public static final BitSet FOLLOW_14_in_ruleArtifactDefinition914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition935 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_15_in_ruleArtifactDefinition950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition971 = new BitSet(new long[]{0x00000000000F0002L});
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
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndSpecialCharacters1624 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_21_in_ruleIDAndSpecialCharacters1644 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_20_in_ruleIDAndSpecialCharacters1663 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_22_in_ruleIDAndSpecialCharacters1682 = new BitSet(new long[]{0x0000000000700020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndSpecialCharacters1699 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText1988 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleText2021 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2047 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName2094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyName2145 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_21_in_rulePropertyName2169 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_22_in_rulePropertyName2188 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_20_in_rulePropertyName2207 = new BitSet(new long[]{0x0000000000700022L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPropteryRef2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrPropteryRef2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIDOrPropteryRef2325 = new BitSet(new long[]{0x0000000001700020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2347 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIDOrPropteryRef2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2462 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2475 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2496 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2530 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2547 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleVersion2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleProperty2653 = new BitSet(new long[]{0x0000000004700020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleProperty2674 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProperty2686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInclusion2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePropertyInclusion2791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyInclusion2811 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePropertyInclusion2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_entryRuleDependencies2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencies2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDependencies2915 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDependencies2927 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_ruleDependencies2949 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_ruleDependencies2976 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_ruleDependencies3003 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_24_in_ruleDependencies3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyGroup3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3109 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDependencyGroup3121 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDependencyGroup3142 = new BitSet(new long[]{0x003E800089800020L});
    public static final BitSet FOLLOW_24_in_ruleDependencyGroup3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUngroupedDependency3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3247 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleUngroupedDependency3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDependency3358 = new BitSet(new long[]{0x003E800088800020L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_ruleDependency3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyInclusion3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDependencyInclusion3476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyInclusion3496 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependencyInclusion3508 = new BitSet(new long[]{0x003E800000000000L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM3565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSCM3657 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSCM3669 = new BitSet(new long[]{0x0000001F01000002L});
    public static final BitSet FOLLOW_33_in_ruleSCM3682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3699 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_34_in_ruleSCM3774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3791 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_35_in_ruleSCM3864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3881 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_36_in_ruleSCM3955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3972 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSCM3991 = new BitSet(new long[]{0x0000001D01000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePlugin4120 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePlugin4141 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlugin4153 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_38_in_rulePlugin4211 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePlugin4223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePlugin4244 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4256 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_rulePluginExecution_in_rulePlugin4332 = new BitSet(new long[]{0x0000044001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfiguration4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4476 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationItem4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameter4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4737 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameter4784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4805 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameter4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList4909 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePluginConfigurationParameterList4926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4943 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_13_in_rulePluginConfigurationParameterList4961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList4978 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_40_in_rulePluginConfigurationParameterList4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5085 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameterMap5102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5123 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterMap5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5224 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePluginConfigurationParameterMapEntry5241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5351 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePluginConfigurationParameterProperties5368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5389 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterProperties5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5490 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePluginConfigurationParameterPropertyEntry5507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginExecution_in_entryRulePluginExecution5565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginExecution5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePluginExecution5612 = new BitSet(new long[]{0x0000380000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5635 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_rulePluginExecution5649 = new BitSet(new long[]{0xFFE2200000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_rulePhase_in_rulePluginExecution5670 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulePluginExecution5684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5705 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_13_in_rulePluginExecution5718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5739 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_30_in_rulePluginExecution5754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePluginExecution5775 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePluginExecution5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePluginExecution5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginInclusion5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePluginInclusion5911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginInclusion5931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion5943 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePluginInclusion5964 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion5977 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginInclusion5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePluginInclusion6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_entryRuleBuildStep6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildStep6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleBuildStep6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_ruleBuildStep6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates6194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleCoordinates6250 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCoordinates6262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleCoordinates6283 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCoordinates6295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleCoordinates6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedCoordinates6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6408 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6441 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtendedCoordinates6474 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6508 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExtendedCoordinates6521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_entryRulePOMImport6582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOMImport6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePOMImport6629 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePOMImport6650 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePOMImport6662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOMImport6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDependencyScope6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDependencyScope6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDependencyScope6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDependencyScope6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDependencyScope6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDependencyScope6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePhase6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePhase6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePhase6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePhase6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePhase6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePhase6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePhase6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePhase6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePhase7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePhase7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePhase7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePhase7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePhase7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePhase7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePhase7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePhase7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePhase7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePhase7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePhase7170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePhase7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePhase7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePhase7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePhase7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePhase7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePhase7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePhase7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePhase7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePhase7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePhase7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePhase7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePhase7374 = new BitSet(new long[]{0x0000000000000002L});

}
