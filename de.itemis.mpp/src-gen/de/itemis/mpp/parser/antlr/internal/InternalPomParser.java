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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'parent'", "'modules'", "','", "'group'", "'artifact'", "'version'", "'type'", "'name'", "'description'", "'.'", "'-'", "'_'", "'${'", "'}'", "'test'", "'property'", "'='", "'include'", "'.properties'", "'dependencies'", "'{'", "'optional'", "'scm'", "'con'", "'dev'", "'url'", "'tag'", "'plugin'", "'config'", "'['", "']'", "'->'", "'exec'", "'in'", "'with goals'", "'default'", "':'", "'import'", "'as'", "'compile'", "'provided'", "'runtime'", "'system'", "'pre-clean'", "'clean'", "'post-clean'", "'validate'", "'initialize'", "'generate-sources'", "'process-sources'", "'generate-resources'", "'process-resources'", "'process-classes'", "'generate-test-sources'", "'process-test-sources'", "'generate-test-resources'", "'process-test-resources'", "'test-compile'", "'process-test-classes'", "'prepare-package'", "'package'", "'pre-integration-test'", "'integration-test'", "'post-integration-test'", "'verify'", "'install'", "'deploy'", "'pre-site'", "'site'", "'post-site'", "'site-deploy'"
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

                if ( (LA1_0==48) ) {
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

                if ( (LA6_0==28) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( LA6_6 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 0) ) {
                            alt6=1;
                        }


                    }


                }
                else if ( LA6_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 2) ) {
                    alt6=3;
                }
                else if ( (LA6_0==24||LA6_0==33|| LA6_0 >=35 && LA6_0<=37) && getUnorderedGroupHelper().canSelect(grammarAccess.getPOMAccess().getUnorderedGroup_4(), 3) ) {
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

            	        if ( (LA4_0==28) ) {
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

            	        if ( (LA5_0==26) ) {
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

                if ( (LA7_0==28||LA7_0==38) ) {
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:739:1: ruleIDAndSpecialCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrPropteryRef_0= ruleIDOrPropteryRef ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )* ) ;
    public final AntlrDatatypeRuleToken ruleIDAndSpecialCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDOrPropteryRef_0 = null;

        AntlrDatatypeRuleToken this_IDOrPropteryRef_4 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:742:28: ( (this_IDOrPropteryRef_0= ruleIDOrPropteryRef ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_IDOrPropteryRef_0= ruleIDOrPropteryRef ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )* )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:743:1: (this_IDOrPropteryRef_0= ruleIDOrPropteryRef ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:744:5: this_IDOrPropteryRef_0= ruleIDOrPropteryRef ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )*
            {
             
                    newCompositeNode(grammarAccess.getIDAndSpecialCharactersAccess().getIDOrPropteryRefParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndSpecialCharacters1631);
            this_IDOrPropteryRef_0=ruleIDOrPropteryRef();

            state._fsp--;


            		current.merge(this_IDOrPropteryRef_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:1: ( (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==11||(LA18_0>=20 && LA18_0<=23)||LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:2: (kw= '-' | kw= '.' | kw= '_' )* this_IDOrPropteryRef_4= ruleIDOrPropteryRef
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:754:2: (kw= '-' | kw= '.' | kw= '_' )*
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
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:755:2: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,21,FOLLOW_21_in_ruleIDAndSpecialCharacters1651); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getHyphenMinusKeyword_1_0_0()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:762:2: kw= '.'
            	    	    {
            	    	    kw=(Token)match(input,20,FOLLOW_20_in_ruleIDAndSpecialCharacters1670); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().getFullStopKeyword_1_0_1()); 
            	    	        

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:769:2: kw= '_'
            	    	    {
            	    	    kw=(Token)match(input,22,FOLLOW_22_in_ruleIDAndSpecialCharacters1689); 

            	    	            current.merge(kw);
            	    	            newLeafNode(kw, grammarAccess.getIDAndSpecialCharactersAccess().get_Keyword_1_0_2()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getIDAndSpecialCharactersAccess().getIDOrPropteryRefParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndSpecialCharacters1713);
            	    this_IDOrPropteryRef_4=ruleIDOrPropteryRef();

            	    state._fsp--;


            	    		current.merge(this_IDOrPropteryRef_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:793:1: entryRuleClassifier returns [String current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final String entryRuleClassifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassifier = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:794:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:795:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1761);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1772); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:802:1: ruleClassifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleClassifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:805:28: (this_ID_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:806:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier1811); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:821:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:822:2: (iv_ruleNumber= ruleNumber EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:823:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1856);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1867); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:830:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:833:28: (this_INT_0= RULE_INT )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:834:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1906); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:849:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:850:2: (iv_ruleText= ruleText EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:851:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1951);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1962); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:858:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Number_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:861:28: ( (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:862:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:862:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*
            loop19:
            do {
                int alt19=4;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:862:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleText2002); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:871:5: this_Number_1= ruleNumber
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTextAccess().getNumberParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleNumber_in_ruleText2035);
            	    this_Number_1=ruleNumber();

            	    state._fsp--;


            	    		current.merge(this_Number_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:882:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleText2061); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:897:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:898:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:899:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName2108);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName2119); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:906:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDAndSpecialCharacters_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:909:28: (this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:911:5: this_IDAndSpecialCharacters_0= ruleIDAndSpecialCharacters
            {
             
                    newCompositeNode(grammarAccess.getPropertyNameAccess().getIDAndSpecialCharactersParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2165);
            this_IDAndSpecialCharacters_0=ruleIDAndSpecialCharacters();

            state._fsp--;


            		current.merge(this_IDAndSpecialCharacters_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:929:1: entryRuleIDOrPropteryRef returns [String current=null] : iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF ;
    public final String entryRuleIDOrPropteryRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrPropteryRef = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:930:2: (iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:931:2: iv_ruleIDOrPropteryRef= ruleIDOrPropteryRef EOF
            {
             newCompositeNode(grammarAccess.getIDOrPropteryRefRule()); 
            pushFollow(FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2210);
            iv_ruleIDOrPropteryRef=ruleIDOrPropteryRef();

            state._fsp--;

             current =iv_ruleIDOrPropteryRef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPropteryRef2221); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:938:1: ruleIDOrPropteryRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDOrKW_0= ruleIDOrKW | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleIDOrPropteryRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDOrKW_0 = null;

        AntlrDatatypeRuleToken this_PropertyName_2 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:941:28: ( (this_IDOrKW_0= ruleIDOrKW | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:942:1: (this_IDOrKW_0= ruleIDOrKW | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:942:1: (this_IDOrKW_0= ruleIDOrKW | (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==11||LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:943:5: this_IDOrKW_0= ruleIDOrKW
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getIDOrKWParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2268);
                    this_IDOrKW_0=ruleIDOrKW();

                    state._fsp--;


                    		current.merge(this_IDOrKW_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:954:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:954:6: (kw= '${' this_PropertyName_2= rulePropertyName kw= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:955:2: kw= '${' this_PropertyName_2= rulePropertyName kw= '}'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleIDOrPropteryRef2293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrPropteryRefAccess().getDollarSignLeftCurlyBracketKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIDOrPropteryRefAccess().getPropertyNameParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2315);
                    this_PropertyName_2=rulePropertyName();

                    state._fsp--;


                    		current.merge(this_PropertyName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleIDOrPropteryRef2333); 

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


    // $ANTLR start "entryRuleIDOrKW"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:985:1: entryRuleIDOrKW returns [String current=null] : iv_ruleIDOrKW= ruleIDOrKW EOF ;
    public final String entryRuleIDOrKW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDOrKW = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:986:2: (iv_ruleIDOrKW= ruleIDOrKW EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:987:2: iv_ruleIDOrKW= ruleIDOrKW EOF
            {
             newCompositeNode(grammarAccess.getIDOrKWRule()); 
            pushFollow(FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2375);
            iv_ruleIDOrKW=ruleIDOrKW();

            state._fsp--;

             current =iv_ruleIDOrKW.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrKW2386); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:994:1: ruleIDOrKW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' ) ;
    public final AntlrDatatypeRuleToken ruleIDOrKW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:997:28: ( (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:998:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:998:1: (this_ID_0= RULE_ID | kw= 'test' | kw= 'parent' )
            int alt21=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:998:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrKW2426); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIDOrKWAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1007:2: kw= 'test'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleIDOrKW2450); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrKWAccess().getTestKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1014:2: kw= 'parent'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleIDOrKW2469); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIDOrKWAccess().getParentKeyword_2()); 
                        

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
    // $ANTLR end "ruleIDOrKW"


    // $ANTLR start "entryRuleVersion"
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1027:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1028:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1029:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion2509);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion2519); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1036:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1039:28: ( ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1040:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1040:1: ( ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1040:2: ( (lv_major_0_0= ruleNumber ) ) (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )? (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1040:2: ( (lv_major_0_0= ruleNumber ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1041:1: (lv_major_0_0= ruleNumber )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1041:1: (lv_major_0_0= ruleNumber )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1042:3: lv_major_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getMajorNumberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2565);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1058:2: (otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )? )?
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1058:4: otherlv_1= '.' ( (lv_minor_2_0= ruleNumber ) ) (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleVersion2578); 

                        	newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1062:1: ( (lv_minor_2_0= ruleNumber ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1063:1: (lv_minor_2_0= ruleNumber )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1063:1: (lv_minor_2_0= ruleNumber )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1064:3: lv_minor_2_0= ruleNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getMinorNumberParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumber_in_ruleVersion2599);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1080:2: (otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) ) )?
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
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1080:4: otherlv_3= '.' ( (lv_incremental_4_0= ruleNumber ) )
                            {
                            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVersion2612); 

                                	newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getFullStopKeyword_1_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1084:1: ( (lv_incremental_4_0= ruleNumber ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1085:1: (lv_incremental_4_0= ruleNumber )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1085:1: (lv_incremental_4_0= ruleNumber )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1086:3: lv_incremental_4_0= ruleNumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getVersionAccess().getIncrementalNumberParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNumber_in_ruleVersion2633);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1102:6: (otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1102:8: otherlv_5= '-' ( (lv_qualifier_6_0= ruleText ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleVersion2650); 

                        	newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getHyphenMinusKeyword_2_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1106:1: ( (lv_qualifier_6_0= ruleText ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1107:1: (lv_qualifier_6_0= ruleText )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1107:1: (lv_qualifier_6_0= ruleText )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1108:3: lv_qualifier_6_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getVersionAccess().getQualifierTextParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleVersion2671);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1132:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1133:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1134:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2709);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2719); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1141:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1144:28: ( (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1145:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1145:1: (otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1145:3: otherlv_0= 'property' ( (lv_name_1_0= rulePropertyName ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleProperty2756); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1149:1: ( (lv_name_1_0= rulePropertyName ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1150:1: (lv_name_1_0= rulePropertyName )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1150:1: (lv_name_1_0= rulePropertyName )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1151:3: lv_name_1_0= rulePropertyName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyName_in_ruleProperty2777);
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleProperty2789); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1171:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1172:1: (lv_value_3_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1172:1: (lv_value_3_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1173:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty2806); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1197:1: entryRulePropertyInclusion returns [EObject current=null] : iv_rulePropertyInclusion= rulePropertyInclusion EOF ;
    public final EObject entryRulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1198:2: (iv_rulePropertyInclusion= rulePropertyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1199:2: iv_rulePropertyInclusion= rulePropertyInclusion EOF
            {
             newCompositeNode(grammarAccess.getPropertyInclusionRule()); 
            pushFollow(FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2847);
            iv_rulePropertyInclusion=rulePropertyInclusion();

            state._fsp--;

             current =iv_rulePropertyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyInclusion2857); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1206:1: rulePropertyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) ;
    public final EObject rulePropertyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1209:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1210:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1210:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1210:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.properties'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePropertyInclusion2894); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1214:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1215:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1216:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyInclusion2914); 

            		newLeafNode(otherlv_1, grammarAccess.getPropertyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePropertyInclusion2926); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1239:1: entryRuleDependencies returns [EObject current=null] : iv_ruleDependencies= ruleDependencies EOF ;
    public final EObject entryRuleDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencies = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1240:2: (iv_ruleDependencies= ruleDependencies EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1241:2: iv_ruleDependencies= ruleDependencies EOF
            {
             newCompositeNode(grammarAccess.getDependenciesRule()); 
            pushFollow(FOLLOW_ruleDependencies_in_entryRuleDependencies2962);
            iv_ruleDependencies=ruleDependencies();

            state._fsp--;

             current =iv_ruleDependencies; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencies2972); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1248:1: ruleDependencies returns [EObject current=null] : ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1251:28: ( ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1252:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1252:1: ( () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1252:2: () otherlv_1= 'dependencies' otherlv_2= '{' ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+ otherlv_6= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1252:2: ()
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1253:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDependenciesAccess().getDependenciesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDependencies3018); 

                	newLeafNode(otherlv_1, grammarAccess.getDependenciesAccess().getDependenciesKeyword_1());
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDependencies3030); 

                	newLeafNode(otherlv_2, grammarAccess.getDependenciesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1266:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1266:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1266:2: ( (lv_includes_3_0= ruleDependencyInclusion ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1267:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1267:1: (lv_includes_3_0= ruleDependencyInclusion )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1268:3: lv_includes_3_0= ruleDependencyInclusion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getIncludesDependencyInclusionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyInclusion_in_ruleDependencies3052);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1285:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1285:6: ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1286:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1286:1: (lv_dependencyGroups_4_0= ruleDependencyGroup )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1287:3: lv_dependencyGroups_4_0= ruleDependencyGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getDependencyGroupsDependencyGroupParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyGroup_in_ruleDependencies3079);
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1304:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1304:6: ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1305:1: (lv_ungroupedDependencies_5_0= ruleUngroupedDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1306:3: lv_ungroupedDependencies_5_0= ruleUngroupedDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependenciesAccess().getUngroupedDependenciesUngroupedDependencyParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUngroupedDependency_in_ruleDependencies3106);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleDependencies3120); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1334:1: entryRuleDependencyGroup returns [EObject current=null] : iv_ruleDependencyGroup= ruleDependencyGroup EOF ;
    public final EObject entryRuleDependencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyGroup = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1335:2: (iv_ruleDependencyGroup= ruleDependencyGroup EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1336:2: iv_ruleDependencyGroup= ruleDependencyGroup EOF
            {
             newCompositeNode(grammarAccess.getDependencyGroupRule()); 
            pushFollow(FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3156);
            iv_ruleDependencyGroup=ruleDependencyGroup();

            state._fsp--;

             current =iv_ruleDependencyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyGroup3166); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1343:1: ruleDependencyGroup returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) ;
    public final EObject ruleDependencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_scope_0_0 = null;

        EObject lv_dependecies_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1346:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1347:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1347:1: ( ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1347:2: ( (lv_scope_0_0= ruleDependencyScope ) ) otherlv_1= '{' ( (lv_dependecies_2_0= ruleDependency ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1347:2: ( (lv_scope_0_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1348:1: (lv_scope_0_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1348:1: (lv_scope_0_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1349:3: lv_scope_0_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3212);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDependencyGroup3224); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyGroupAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1369:1: ( (lv_dependecies_2_0= ruleDependency ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==11||LA26_0==23||LA26_0==25||LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1370:1: (lv_dependecies_2_0= ruleDependency )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1370:1: (lv_dependecies_2_0= ruleDependency )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1371:3: lv_dependecies_2_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyGroupAccess().getDependeciesDependencyParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleDependencyGroup3245);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleDependencyGroup3258); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1399:1: entryRuleUngroupedDependency returns [EObject current=null] : iv_ruleUngroupedDependency= ruleUngroupedDependency EOF ;
    public final EObject entryRuleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUngroupedDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1400:2: (iv_ruleUngroupedDependency= ruleUngroupedDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1401:2: iv_ruleUngroupedDependency= ruleUngroupedDependency EOF
            {
             newCompositeNode(grammarAccess.getUngroupedDependencyRule()); 
            pushFollow(FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3294);
            iv_ruleUngroupedDependency=ruleUngroupedDependency();

            state._fsp--;

             current =iv_ruleUngroupedDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUngroupedDependency3304); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1408:1: ruleUngroupedDependency returns [EObject current=null] : ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) ;
    public final EObject ruleUngroupedDependency() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_dependency_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1411:28: ( ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1412:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1412:1: ( ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1412:2: ( (lv_scope_0_0= ruleDependencyScope ) )? ( (lv_dependency_1_0= ruleDependency ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1412:2: ( (lv_scope_0_0= ruleDependencyScope ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48||(LA27_0>=50 && LA27_0<=53)) ) {
                alt27=1;
            }
            else if ( (LA27_0==25) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_ID||LA27_2==11||LA27_2==23||LA27_2==25||LA27_2==32) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1413:1: (lv_scope_0_0= ruleDependencyScope )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1413:1: (lv_scope_0_0= ruleDependencyScope )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1414:3: lv_scope_0_0= ruleDependencyScope
                    {
                     
                    	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getScopeDependencyScopeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3350);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1430:3: ( (lv_dependency_1_0= ruleDependency ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:1: (lv_dependency_1_0= ruleDependency )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1431:1: (lv_dependency_1_0= ruleDependency )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1432:3: lv_dependency_1_0= ruleDependency
            {
             
            	        newCompositeNode(grammarAccess.getUngroupedDependencyAccess().getDependencyDependencyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependency_in_ruleUngroupedDependency3372);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1456:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1457:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1458:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3408);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3418); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1465:1: ruleDependency returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1468:28: ( ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1469:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1469:1: ( ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1469:2: ( (lv_optional_0_0= 'optional' ) )? ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1469:2: ( (lv_optional_0_0= 'optional' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1470:1: (lv_optional_0_0= 'optional' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1470:1: (lv_optional_0_0= 'optional' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1471:3: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,32,FOLLOW_32_in_ruleDependency3461); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getDependencyAccess().getOptionalOptionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependencyRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1484:3: ( (lv_coordinates_1_0= ruleExtendedCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1485:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1485:1: (lv_coordinates_1_0= ruleExtendedCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1486:3: lv_coordinates_1_0= ruleExtendedCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getCoordinatesExtendedCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_ruleDependency3496);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1510:1: entryRuleDependencyInclusion returns [EObject current=null] : iv_ruleDependencyInclusion= ruleDependencyInclusion EOF ;
    public final EObject entryRuleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1511:2: (iv_ruleDependencyInclusion= ruleDependencyInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1512:2: iv_ruleDependencyInclusion= ruleDependencyInclusion EOF
            {
             newCompositeNode(grammarAccess.getDependencyInclusionRule()); 
            pushFollow(FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3532);
            iv_ruleDependencyInclusion=ruleDependencyInclusion();

            state._fsp--;

             current =iv_ruleDependencyInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyInclusion3542); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1519:1: ruleDependencyInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) ;
    public final EObject ruleDependencyInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_scope_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1522:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1523:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1523:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1523:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_scope_3_0= ruleDependencyScope ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDependencyInclusion3579); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1527:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1528:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1528:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1529:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyInclusion3599); 

            		newLeafNode(otherlv_1, grammarAccess.getDependencyInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDependencyInclusion3611); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1544:1: ( (lv_scope_3_0= ruleDependencyScope ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1545:1: (lv_scope_3_0= ruleDependencyScope )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1545:1: (lv_scope_3_0= ruleDependencyScope )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1546:3: lv_scope_3_0= ruleDependencyScope
            {
             
            	        newCompositeNode(grammarAccess.getDependencyInclusionAccess().getScopeDependencyScopeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3632);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1570:1: entryRuleSCM returns [EObject current=null] : iv_ruleSCM= ruleSCM EOF ;
    public final EObject entryRuleSCM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCM = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1571:2: (iv_ruleSCM= ruleSCM EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1572:2: iv_ruleSCM= ruleSCM EOF
            {
             newCompositeNode(grammarAccess.getSCMRule()); 
            pushFollow(FOLLOW_ruleSCM_in_entryRuleSCM3668);
            iv_ruleSCM=ruleSCM();

            state._fsp--;

             current =iv_ruleSCM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCM3678); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1579:1: ruleSCM returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1582:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1583:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1583:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1585:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1585:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1586:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSCMAccess().getUnorderedGroup());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1589:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?)
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1590:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+ {...}?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1590:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=5;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1592:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1592:4: ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1593:5: {...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1593:98: ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1594:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:6: ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:7: {...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:16: (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1597:18: otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSCM3760); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSCMAccess().getScmKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleSCM3772); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSCMAccess().getLeftCurlyBracketKeyword_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1605:1: (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==34) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1605:3: otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) )
            	            {
            	            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleSCM3785); 

            	                	newLeafNode(otherlv_3, grammarAccess.getSCMAccess().getConKeyword_0_2_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1609:1: ( (lv_connection_4_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1610:1: (lv_connection_4_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1610:1: (lv_connection_4_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1611:3: lv_connection_4_0= RULE_STRING
            	            {
            	            lv_connection_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3802); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1634:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1634:4: ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1635:5: {...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1635:98: ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1636:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1639:6: ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1639:7: {...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1639:16: (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1639:18: otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleSCM3877); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSCMAccess().getDevKeyword_1_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1643:1: ( (lv_developerConncetion_6_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1644:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1644:1: (lv_developerConncetion_6_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1645:3: lv_developerConncetion_6_0= RULE_STRING
            	    {
            	    lv_developerConncetion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3894); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1668:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1668:4: ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1669:5: {...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1669:98: ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1670:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:6: ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:7: {...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:16: (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1673:18: otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleSCM3967); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSCMAccess().getUrlKeyword_2_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1677:1: ( (lv_url_8_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1678:1: (lv_url_8_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1678:1: (lv_url_8_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1679:3: lv_url_8_0= RULE_STRING
            	    {
            	    lv_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM3984); 

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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1702:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1702:4: ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1703:5: {...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1703:98: ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1704:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSCMAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:6: ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:7: {...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSCM", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:16: ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:17: (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==37) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1707:19: otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) )
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleSCM4058); 

            	                	newLeafNode(otherlv_9, grammarAccess.getSCMAccess().getTagKeyword_3_0_0());
            	                
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1711:1: ( (lv_tag_10_0= RULE_STRING ) )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:1: (lv_tag_10_0= RULE_STRING )
            	            {
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1712:1: (lv_tag_10_0= RULE_STRING )
            	            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1713:3: lv_tag_10_0= RULE_STRING
            	            {
            	            lv_tag_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSCM4075); 

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

            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleSCM4094); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1756:1: entryRulePlugin returns [EObject current=null] : iv_rulePlugin= rulePlugin EOF ;
    public final EObject entryRulePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlugin = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1757:2: (iv_rulePlugin= rulePlugin EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1758:2: iv_rulePlugin= rulePlugin EOF
            {
             newCompositeNode(grammarAccess.getPluginRule()); 
            pushFollow(FOLLOW_rulePlugin_in_entryRulePlugin4176);
            iv_rulePlugin=rulePlugin();

            state._fsp--;

             current =iv_rulePlugin; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlugin4186); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1765:1: rulePlugin returns [EObject current=null] : (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1768:28: ( (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1769:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1769:1: (otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1769:3: otherlv_0= 'plugin' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePlugin4223); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginAccess().getPluginKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1773:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1774:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1774:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1775:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePlugin4244);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePlugin4256); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1795:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1797:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1797:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1798:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1801:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )* )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1802:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1802:3: ( ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1804:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1804:4: ({...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1805:5: {...}? => ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1805:103: ( ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1806:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:6: ({...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:7: {...}? => (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:16: (otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}' )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1809:18: otherlv_4= 'config' otherlv_5= '{' ( (lv_configuration_6_0= rulePluginConfiguration ) ) otherlv_7= '}'
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_rulePlugin4314); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPluginAccess().getConfigKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulePlugin4326); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPluginAccess().getLeftCurlyBracketKeyword_3_0_1());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1817:1: ( (lv_configuration_6_0= rulePluginConfiguration ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1818:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1818:1: (lv_configuration_6_0= rulePluginConfiguration )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1819:3: lv_configuration_6_0= rulePluginConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginAccess().getConfigurationPluginConfigurationParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfiguration_in_rulePlugin4347);
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

            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlugin4359); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPluginAccess().getRightCurlyBracketKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPluginAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1846:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1846:4: ({...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1847:5: {...}? => ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlugin", "getUnorderedGroupHelper().canSelect(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1847:103: ( ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+ )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1848:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPluginAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1851:6: ({...}? => ( (lv_executions_8_0= rulePluginExecution ) ) )+
            	    int cnt32=0;
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==43) ) {
            	            int LA32_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt32=1;
            	            }


            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1851:7: {...}? => ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePlugin", "true");
            	    	    }
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1851:16: ( (lv_executions_8_0= rulePluginExecution ) )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1852:1: (lv_executions_8_0= rulePluginExecution )
            	    	    {
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1852:1: (lv_executions_8_0= rulePluginExecution )
            	    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1853:3: lv_executions_8_0= rulePluginExecution
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPluginAccess().getExecutionsPluginExecutionParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePluginExecution_in_rulePlugin4435);
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

            otherlv_9=(Token)match(input,24,FOLLOW_24_in_rulePlugin4488); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1895:1: entryRulePluginConfiguration returns [EObject current=null] : iv_rulePluginConfiguration= rulePluginConfiguration EOF ;
    public final EObject entryRulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfiguration = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1896:2: (iv_rulePluginConfiguration= rulePluginConfiguration EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1897:2: iv_rulePluginConfiguration= rulePluginConfiguration EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationRule()); 
            pushFollow(FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4524);
            iv_rulePluginConfiguration=rulePluginConfiguration();

            state._fsp--;

             current =iv_rulePluginConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfiguration4534); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1904:1: rulePluginConfiguration returns [EObject current=null] : ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ ;
    public final EObject rulePluginConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configurationItems_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1907:28: ( ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+ )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1908:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1908:1: ( (lv_configurationItems_0_0= rulePluginConfigurationItem ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1909:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1909:1: (lv_configurationItems_0_0= rulePluginConfigurationItem )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1910:3: lv_configurationItems_0_0= rulePluginConfigurationItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationAccess().getConfigurationItemsPluginConfigurationItemParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4579);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1934:1: entryRulePluginConfigurationItem returns [EObject current=null] : iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF ;
    public final EObject entryRulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationItem = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1935:2: (iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1936:2: iv_rulePluginConfigurationItem= rulePluginConfigurationItem EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationItemRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4615);
            iv_rulePluginConfigurationItem=rulePluginConfigurationItem();

            state._fsp--;

             current =iv_rulePluginConfigurationItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationItem4625); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1943:1: rulePluginConfigurationItem returns [EObject current=null] : (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) ;
    public final EObject rulePluginConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject this_PluginConfigurationParameter_0 = null;

        EObject this_PluginConfigurationParameterList_1 = null;

        EObject this_PluginConfigurationParameterMap_2 = null;

        EObject this_PluginConfigurationParameterProperties_3 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1946:28: ( (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1947:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1947:1: (this_PluginConfigurationParameter_0= rulePluginConfigurationParameter | this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList | this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap | this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties )
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
                case 31:
                    {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 42:
                            {
                            alt35=3;
                            }
                            break;
                        case RULE_STRING:
                        case RULE_ID:
                        case 24:
                        case 31:
                        case 40:
                            {
                            alt35=1;
                            }
                            break;
                        case 27:
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
                case 40:
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1948:5: this_PluginConfigurationParameter_0= rulePluginConfigurationParameter
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4672);
                    this_PluginConfigurationParameter_0=rulePluginConfigurationParameter();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1958:5: this_PluginConfigurationParameterList_1= rulePluginConfigurationParameterList
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4699);
                    this_PluginConfigurationParameterList_1=rulePluginConfigurationParameterList();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1968:5: this_PluginConfigurationParameterMap_2= rulePluginConfigurationParameterMap
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterMapParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4726);
                    this_PluginConfigurationParameterMap_2=rulePluginConfigurationParameterMap();

                    state._fsp--;

                     
                            current = this_PluginConfigurationParameterMap_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1978:5: this_PluginConfigurationParameterProperties_3= rulePluginConfigurationParameterProperties
                    {
                     
                            newCompositeNode(grammarAccess.getPluginConfigurationItemAccess().getPluginConfigurationParameterPropertiesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4753);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1994:1: entryRulePluginConfigurationParameter returns [EObject current=null] : iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF ;
    public final EObject entryRulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameter = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1995:2: (iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:1996:2: iv_rulePluginConfigurationParameter= rulePluginConfigurationParameter EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4788);
            iv_rulePluginConfigurationParameter=rulePluginConfigurationParameter();

            state._fsp--;

             current =iv_rulePluginConfigurationParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameter4798); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2003:1: rulePluginConfigurationParameter returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) ;
    public final EObject rulePluginConfigurationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2006:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2007:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2008:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2008:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2009:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4840); 

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2025:2: ( ( (lv_value_1_0= RULE_STRING ) ) | (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==31) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2025:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2025:3: ( (lv_value_1_0= RULE_STRING ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2026:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2026:1: (lv_value_1_0= RULE_STRING )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2027:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4863); 

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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:6: (otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2044:8: otherlv_2= '{' ( (lv_children_3_0= rulePluginConfigurationItem ) )+ otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_rulePluginConfigurationParameter4887); 

                        	newLeafNode(otherlv_2, grammarAccess.getPluginConfigurationParameterAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2048:1: ( (lv_children_3_0= rulePluginConfigurationItem ) )+
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
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2049:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2049:1: (lv_children_3_0= rulePluginConfigurationItem )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2050:3: lv_children_3_0= rulePluginConfigurationItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterAccess().getChildrenPluginConfigurationItemParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4908);
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

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameter4921); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2078:1: entryRulePluginConfigurationParameterList returns [EObject current=null] : iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF ;
    public final EObject entryRulePluginConfigurationParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterList = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2079:2: (iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2080:2: iv_rulePluginConfigurationParameterList= rulePluginConfigurationParameterList EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterListRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4960);
            iv_rulePluginConfigurationParameterList=rulePluginConfigurationParameterList();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4970); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2087:1: rulePluginConfigurationParameterList returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2090:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2091:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2091:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2091:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* otherlv_5= ']'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2091:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2092:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2092:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2093:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5012); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_rulePluginConfigurationParameterList5029); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterListAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2113:1: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2114:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2114:1: (lv_values_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2115:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5046); 

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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2131:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==13) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2131:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePluginConfigurationParameterList5064); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPluginConfigurationParameterListAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2135:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2136:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2136:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2137:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5081); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_rulePluginConfigurationParameterList5100); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2165:1: entryRulePluginConfigurationParameterMap returns [EObject current=null] : iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF ;
    public final EObject entryRulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMap = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2166:2: (iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2167:2: iv_rulePluginConfigurationParameterMap= rulePluginConfigurationParameterMap EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5136);
            iv_rulePluginConfigurationParameterMap=rulePluginConfigurationParameterMap();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5146); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2174:1: rulePluginConfigurationParameterMap returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterMap() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2177:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2178:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2178:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2178:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2178:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2179:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2179:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2180:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5188); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePluginConfigurationParameterMap5205); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2200:1: ( (lv_entries_2_0= rulePluginConfigurationParameterMapEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2201:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2201:1: (lv_entries_2_0= rulePluginConfigurationParameterMapEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2202:3: lv_entries_2_0= rulePluginConfigurationParameterMapEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterMapAccess().getEntriesPluginConfigurationParameterMapEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5226);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterMap5239); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2230:1: entryRulePluginConfigurationParameterMapEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterMapEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2231:2: (iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2232:2: iv_rulePluginConfigurationParameterMapEntry= rulePluginConfigurationParameterMapEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterMapEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5275);
            iv_rulePluginConfigurationParameterMapEntry=rulePluginConfigurationParameterMapEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterMapEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5285); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2239:1: rulePluginConfigurationParameterMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2242:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2243:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2243:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2243:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2243:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2244:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2244:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2245:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5327); 

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

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_rulePluginConfigurationParameterMapEntry5344); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterMapEntryAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2265:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2266:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2266:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2267:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5361); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2291:1: entryRulePluginConfigurationParameterProperties returns [EObject current=null] : iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF ;
    public final EObject entryRulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterProperties = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2292:2: (iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2293:2: iv_rulePluginConfigurationParameterProperties= rulePluginConfigurationParameterProperties EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5402);
            iv_rulePluginConfigurationParameterProperties=rulePluginConfigurationParameterProperties();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5412); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2300:1: rulePluginConfigurationParameterProperties returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) ;
    public final EObject rulePluginConfigurationParameterProperties() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2303:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}' )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+ otherlv_3= '}'
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2304:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2305:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2305:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2306:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5454); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePluginConfigurationParameterProperties5471); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertiesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2326:1: ( (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry ) )+
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
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2327:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    {
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2327:1: (lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry )
            	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2328:3: lv_entries_2_0= rulePluginConfigurationParameterPropertyEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertiesAccess().getEntriesPluginConfigurationParameterPropertyEntryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5492);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePluginConfigurationParameterProperties5505); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2356:1: entryRulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF ;
    public final EObject entryRulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginConfigurationParameterPropertyEntry = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2357:2: (iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2358:2: iv_rulePluginConfigurationParameterPropertyEntry= rulePluginConfigurationParameterPropertyEntry EOF
            {
             newCompositeNode(grammarAccess.getPluginConfigurationParameterPropertyEntryRule()); 
            pushFollow(FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5541);
            iv_rulePluginConfigurationParameterPropertyEntry=rulePluginConfigurationParameterPropertyEntry();

            state._fsp--;

             current =iv_rulePluginConfigurationParameterPropertyEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5551); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2365:1: rulePluginConfigurationParameterPropertyEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePluginConfigurationParameterPropertyEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2368:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2369:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2370:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2370:1: (lv_key_0_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2371:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5593); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulePluginConfigurationParameterPropertyEntry5610); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginConfigurationParameterPropertyEntryAccess().getEqualsSignKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2391:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2392:1: (lv_value_2_0= RULE_STRING )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2392:1: (lv_value_2_0= RULE_STRING )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2393:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5627); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2417:1: entryRulePluginExecution returns [EObject current=null] : iv_rulePluginExecution= rulePluginExecution EOF ;
    public final EObject entryRulePluginExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginExecution = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2418:2: (iv_rulePluginExecution= rulePluginExecution EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2419:2: iv_rulePluginExecution= rulePluginExecution EOF
            {
             newCompositeNode(grammarAccess.getPluginExecutionRule()); 
            pushFollow(FOLLOW_rulePluginExecution_in_entryRulePluginExecution5668);
            iv_rulePluginExecution=rulePluginExecution();

            state._fsp--;

             current =iv_rulePluginExecution; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginExecution5678); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2426:1: rulePluginExecution returns [EObject current=null] : (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2429:28: ( (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:1: (otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2430:3: otherlv_0= 'exec' ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulePluginExecution5715); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginExecutionAccess().getExecKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2434:1: ( ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? ) | ( (lv_default_11_0= 'default' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||(LA45_0>=44 && LA45_0<=45)) ) {
                alt45=1;
            }
            else if ( (LA45_0==46) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2434:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2434:2: ( ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )? )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2434:3: ( (lv_id_1_0= ruleIDAndDash ) )? (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )? otherlv_4= 'with goals' ( (lv_goals_5_0= ruleIDAndDash ) ) (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )* (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2434:3: ( (lv_id_1_0= ruleIDAndDash ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2435:1: (lv_id_1_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2435:1: (lv_id_1_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2436:3: lv_id_1_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getIdIDAndDashParserRuleCall_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5738);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2452:3: (otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==44) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2452:5: otherlv_2= 'in' ( (lv_phase_3_0= rulePhase ) )
                            {
                            otherlv_2=(Token)match(input,44,FOLLOW_44_in_rulePluginExecution5752); 

                                	newLeafNode(otherlv_2, grammarAccess.getPluginExecutionAccess().getInKeyword_1_0_1_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2456:1: ( (lv_phase_3_0= rulePhase ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2457:1: (lv_phase_3_0= rulePhase )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2457:1: (lv_phase_3_0= rulePhase )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2458:3: lv_phase_3_0= rulePhase
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getPhasePhaseEnumRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePhase_in_rulePluginExecution5773);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_rulePluginExecution5787); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginExecutionAccess().getWithGoalsKeyword_1_0_2());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2478:1: ( (lv_goals_5_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2479:1: (lv_goals_5_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2479:1: (lv_goals_5_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2480:3: lv_goals_5_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5808);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2496:2: (otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==13) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2496:4: otherlv_6= ',' ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePluginExecution5821); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPluginExecutionAccess().getCommaKeyword_1_0_4_0());
                    	        
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2500:1: ( (lv_goals_7_0= ruleIDAndDash ) )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2501:1: (lv_goals_7_0= ruleIDAndDash )
                    	    {
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2501:1: (lv_goals_7_0= ruleIDAndDash )
                    	    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2502:3: lv_goals_7_0= ruleIDAndDash
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getGoalsIDAndDashParserRuleCall_1_0_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginExecution5842);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2518:4: (otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==31) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2518:6: otherlv_8= '{' ( (lv_configuration_9_0= rulePluginConfiguration ) ) otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,31,FOLLOW_31_in_rulePluginExecution5857); 

                                	newLeafNode(otherlv_8, grammarAccess.getPluginExecutionAccess().getLeftCurlyBracketKeyword_1_0_5_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2522:1: ( (lv_configuration_9_0= rulePluginConfiguration ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2523:1: (lv_configuration_9_0= rulePluginConfiguration )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2523:1: (lv_configuration_9_0= rulePluginConfiguration )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2524:3: lv_configuration_9_0= rulePluginConfiguration
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginExecutionAccess().getConfigurationPluginConfigurationParserRuleCall_1_0_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePluginConfiguration_in_rulePluginExecution5878);
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

                            otherlv_10=(Token)match(input,24,FOLLOW_24_in_rulePluginExecution5890); 

                                	newLeafNode(otherlv_10, grammarAccess.getPluginExecutionAccess().getRightCurlyBracketKeyword_1_0_5_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2545:6: ( (lv_default_11_0= 'default' ) )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2545:6: ( (lv_default_11_0= 'default' ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2546:1: (lv_default_11_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2546:1: (lv_default_11_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2547:3: lv_default_11_0= 'default'
                    {
                    lv_default_11_0=(Token)match(input,46,FOLLOW_46_in_rulePluginExecution5917); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2568:1: entryRulePluginInclusion returns [EObject current=null] : iv_rulePluginInclusion= rulePluginInclusion EOF ;
    public final EObject entryRulePluginInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginInclusion = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2569:2: (iv_rulePluginInclusion= rulePluginInclusion EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2570:2: iv_rulePluginInclusion= rulePluginInclusion EOF
            {
             newCompositeNode(grammarAccess.getPluginInclusionRule()); 
            pushFollow(FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5967);
            iv_rulePluginInclusion=rulePluginInclusion();

            state._fsp--;

             current =iv_rulePluginInclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePluginInclusion5977); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2577:1: rulePluginInclusion returns [EObject current=null] : (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2580:28: ( (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2581:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2581:1: (otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2581:3: otherlv_0= 'include' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_pluginCoordinates_3_0= ruleCoordinates ) ) (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulePluginInclusion6014); 

                	newLeafNode(otherlv_0, grammarAccess.getPluginInclusionAccess().getIncludeKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2585:1: ( (otherlv_1= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2586:1: (otherlv_1= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2586:1: (otherlv_1= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2587:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPluginInclusionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePluginInclusion6034); 

            		newLeafNode(otherlv_1, grammarAccess.getPluginInclusionAccess().getPomRefPOMImportCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion6046); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2602:1: ( (lv_pluginCoordinates_3_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2603:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2603:1: (lv_pluginCoordinates_3_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2604:3: lv_pluginCoordinates_3_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getPluginCoordinatesCoordinatesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePluginInclusion6067);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2620:2: (otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2620:4: otherlv_4= '.' ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePluginInclusion6080); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginInclusionAccess().getFullStopKeyword_4_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2624:1: ( ( (lv_executionId_5_0= ruleIDAndDash ) ) | ( (lv_config_6_0= 'config' ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==39) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2624:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2624:2: ( (lv_executionId_5_0= ruleIDAndDash ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2625:1: (lv_executionId_5_0= ruleIDAndDash )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2625:1: (lv_executionId_5_0= ruleIDAndDash )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2626:3: lv_executionId_5_0= ruleIDAndDash
                            {
                             
                            	        newCompositeNode(grammarAccess.getPluginInclusionAccess().getExecutionIdIDAndDashParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleIDAndDash_in_rulePluginInclusion6102);
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
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2643:6: ( (lv_config_6_0= 'config' ) )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2643:6: ( (lv_config_6_0= 'config' ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2644:1: (lv_config_6_0= 'config' )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2644:1: (lv_config_6_0= 'config' )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2645:3: lv_config_6_0= 'config'
                            {
                            lv_config_6_0=(Token)match(input,39,FOLLOW_39_in_rulePluginInclusion6126); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2666:1: entryRuleBuildStep returns [EObject current=null] : iv_ruleBuildStep= ruleBuildStep EOF ;
    public final EObject entryRuleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildStep = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2667:2: (iv_ruleBuildStep= ruleBuildStep EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2668:2: iv_ruleBuildStep= ruleBuildStep EOF
            {
             newCompositeNode(grammarAccess.getBuildStepRule()); 
            pushFollow(FOLLOW_ruleBuildStep_in_entryRuleBuildStep6178);
            iv_ruleBuildStep=ruleBuildStep();

            state._fsp--;

             current =iv_ruleBuildStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildStep6188); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2675:1: ruleBuildStep returns [EObject current=null] : (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) ;
    public final EObject ruleBuildStep() throws RecognitionException {
        EObject current = null;

        EObject this_Plugin_0 = null;

        EObject this_PluginInclusion_1 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2678:28: ( (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2679:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2679:1: (this_Plugin_0= rulePlugin | this_PluginInclusion_1= rulePluginInclusion )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2680:5: this_Plugin_0= rulePlugin
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePlugin_in_ruleBuildStep6235);
                    this_Plugin_0=rulePlugin();

                    state._fsp--;

                     
                            current = this_Plugin_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2690:5: this_PluginInclusion_1= rulePluginInclusion
                    {
                     
                            newCompositeNode(grammarAccess.getBuildStepAccess().getPluginInclusionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePluginInclusion_in_ruleBuildStep6262);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2706:1: entryRuleCoordinates returns [EObject current=null] : iv_ruleCoordinates= ruleCoordinates EOF ;
    public final EObject entryRuleCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2707:2: (iv_ruleCoordinates= ruleCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2708:2: iv_ruleCoordinates= ruleCoordinates EOF
            {
             newCompositeNode(grammarAccess.getCoordinatesRule()); 
            pushFollow(FOLLOW_ruleCoordinates_in_entryRuleCoordinates6297);
            iv_ruleCoordinates=ruleCoordinates();

            state._fsp--;

             current =iv_ruleCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoordinates6307); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2715:1: ruleCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) ;
    public final EObject ruleCoordinates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_groupId_0_0 = null;

        AntlrDatatypeRuleToken lv_artifactId_2_0 = null;

        EObject lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2718:28: ( ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2719:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2719:1: ( ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2719:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2719:2: ( (lv_groupId_0_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2720:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2720:1: (lv_groupId_0_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2721:3: lv_groupId_0_0= ruleIDAndSpecialCharacters
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getGroupIdIDAndSpecialCharactersParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6353);
            lv_groupId_0_0=ruleIDAndSpecialCharacters();

            state._fsp--;


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

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleCoordinates6365); 

                	newLeafNode(otherlv_1, grammarAccess.getCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2741:1: ( (lv_artifactId_2_0= ruleIDAndSpecialCharacters ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2742:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2742:1: (lv_artifactId_2_0= ruleIDAndSpecialCharacters )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2743:3: lv_artifactId_2_0= ruleIDAndSpecialCharacters
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getArtifactIdIDAndSpecialCharactersParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6386);
            lv_artifactId_2_0=ruleIDAndSpecialCharacters();

            state._fsp--;


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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleCoordinates6398); 

                	newLeafNode(otherlv_3, grammarAccess.getCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2763:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2764:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2764:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2765:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleCoordinates6419);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2789:1: entryRuleExtendedCoordinates returns [EObject current=null] : iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF ;
    public final EObject entryRuleExtendedCoordinates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedCoordinates = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2790:2: (iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2791:2: iv_ruleExtendedCoordinates= ruleExtendedCoordinates EOF
            {
             newCompositeNode(grammarAccess.getExtendedCoordinatesRule()); 
            pushFollow(FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6455);
            iv_ruleExtendedCoordinates=ruleExtendedCoordinates();

            state._fsp--;

             current =iv_ruleExtendedCoordinates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedCoordinates6465); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2798:1: ruleExtendedCoordinates returns [EObject current=null] : ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2801:28: ( ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2802:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2802:1: ( ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )? )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2802:2: ( (lv_groupId_0_0= ruleIDAndDot ) ) otherlv_1= ':' ( (lv_artifactId_2_0= ruleIDAndDash ) ) otherlv_3= ':' ( (lv_version_4_0= ruleVersion ) ) (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2802:2: ( (lv_groupId_0_0= ruleIDAndDot ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2803:1: (lv_groupId_0_0= ruleIDAndDot )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2803:1: (lv_groupId_0_0= ruleIDAndDot )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2804:3: lv_groupId_0_0= ruleIDAndDot
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getGroupIdIDAndDotParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6511);
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

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleExtendedCoordinates6523); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_1());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2824:1: ( (lv_artifactId_2_0= ruleIDAndDash ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2825:1: (lv_artifactId_2_0= ruleIDAndDash )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2825:1: (lv_artifactId_2_0= ruleIDAndDash )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2826:3: lv_artifactId_2_0= ruleIDAndDash
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getArtifactIdIDAndDashParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6544);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleExtendedCoordinates6556); 

                	newLeafNode(otherlv_3, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_3());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2846:1: ( (lv_version_4_0= ruleVersion ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2847:1: (lv_version_4_0= ruleVersion )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2847:1: (lv_version_4_0= ruleVersion )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2848:3: lv_version_4_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getVersionVersionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleExtendedCoordinates6577);
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

            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2864:2: (otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2864:4: otherlv_5= ':' ( (lv_type_6_0= ruleIDAndDash ) ) (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleExtendedCoordinates6590); 

                        	newLeafNode(otherlv_5, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_0());
                        
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2868:1: ( (lv_type_6_0= ruleIDAndDash ) )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2869:1: (lv_type_6_0= ruleIDAndDash )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2869:1: (lv_type_6_0= ruleIDAndDash )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2870:3: lv_type_6_0= ruleIDAndDash
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getTypeIDAndDashParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6611);
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

                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2886:2: (otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==47) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2886:4: otherlv_7= ':' ( (lv_classifier_8_0= ruleClassifier ) )
                            {
                            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleExtendedCoordinates6624); 

                                	newLeafNode(otherlv_7, grammarAccess.getExtendedCoordinatesAccess().getColonKeyword_5_2_0());
                                
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2890:1: ( (lv_classifier_8_0= ruleClassifier ) )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2891:1: (lv_classifier_8_0= ruleClassifier )
                            {
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2891:1: (lv_classifier_8_0= ruleClassifier )
                            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2892:3: lv_classifier_8_0= ruleClassifier
                            {
                             
                            	        newCompositeNode(grammarAccess.getExtendedCoordinatesAccess().getClassifierClassifierParserRuleCall_5_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6645);
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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2916:1: entryRulePOMImport returns [EObject current=null] : iv_rulePOMImport= rulePOMImport EOF ;
    public final EObject entryRulePOMImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOMImport = null;


        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2917:2: (iv_rulePOMImport= rulePOMImport EOF )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2918:2: iv_rulePOMImport= rulePOMImport EOF
            {
             newCompositeNode(grammarAccess.getPOMImportRule()); 
            pushFollow(FOLLOW_rulePOMImport_in_entryRulePOMImport6685);
            iv_rulePOMImport=rulePOMImport();

            state._fsp--;

             current =iv_rulePOMImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOMImport6695); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2925:1: rulePOMImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject rulePOMImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_coordinates_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2928:28: ( (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2929:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2929:1: (otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2929:3: otherlv_0= 'import' ( (lv_coordinates_1_0= ruleCoordinates ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePOMImport6732); 

                	newLeafNode(otherlv_0, grammarAccess.getPOMImportAccess().getImportKeyword_0());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2933:1: ( (lv_coordinates_1_0= ruleCoordinates ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2934:1: (lv_coordinates_1_0= ruleCoordinates )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2934:1: (lv_coordinates_1_0= ruleCoordinates )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2935:3: lv_coordinates_1_0= ruleCoordinates
            {
             
            	        newCompositeNode(grammarAccess.getPOMImportAccess().getCoordinatesCoordinatesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCoordinates_in_rulePOMImport6753);
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

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_rulePOMImport6765); 

                	newLeafNode(otherlv_2, grammarAccess.getPOMImportAccess().getAsKeyword_2());
                
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2955:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2956:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2956:1: (lv_name_3_0= RULE_ID )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2957:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOMImport6782); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2981:1: ruleDependencyScope returns [Enumerator current=null] : ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2983:28: ( ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2984:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2984:1: ( (enumLiteral_0= 'compile' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'runtime' ) | (enumLiteral_3= 'system' ) | (enumLiteral_4= 'test' ) | (enumLiteral_5= 'import' ) )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt51=1;
                }
                break;
            case 51:
                {
                alt51=2;
                }
                break;
            case 52:
                {
                alt51=3;
                }
                break;
            case 53:
                {
                alt51=4;
                }
                break;
            case 25:
                {
                alt51=5;
                }
                break;
            case 48:
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2984:2: (enumLiteral_0= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2984:2: (enumLiteral_0= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2984:4: enumLiteral_0= 'compile'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleDependencyScope6837); 

                            current = grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDependencyScopeAccess().getCOMPILEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:6: (enumLiteral_1= 'provided' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:6: (enumLiteral_1= 'provided' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2990:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleDependencyScope6854); 

                            current = grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDependencyScopeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:6: (enumLiteral_2= 'runtime' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:6: (enumLiteral_2= 'runtime' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:2996:8: enumLiteral_2= 'runtime'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleDependencyScope6871); 

                            current = grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDependencyScopeAccess().getRUNTIMEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:6: (enumLiteral_3= 'system' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:6: (enumLiteral_3= 'system' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3002:8: enumLiteral_3= 'system'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleDependencyScope6888); 

                            current = grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDependencyScopeAccess().getSYSTEMEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:6: (enumLiteral_4= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:6: (enumLiteral_4= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3008:8: enumLiteral_4= 'test'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleDependencyScope6905); 

                            current = grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDependencyScopeAccess().getTESTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:6: (enumLiteral_5= 'import' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:6: (enumLiteral_5= 'import' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3014:8: enumLiteral_5= 'import'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_48_in_ruleDependencyScope6922); 

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
    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3024:1: rulePhase returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) ;
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
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3026:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) ) )
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            {
            // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'pre-clean' ) | (enumLiteral_2= 'clean' ) | (enumLiteral_3= 'post-clean' ) | (enumLiteral_4= 'validate' ) | (enumLiteral_5= 'initialize' ) | (enumLiteral_6= 'generate-sources' ) | (enumLiteral_7= 'process-sources' ) | (enumLiteral_8= 'generate-resources' ) | (enumLiteral_9= 'process-resources' ) | (enumLiteral_10= 'compile' ) | (enumLiteral_11= 'process-classes' ) | (enumLiteral_12= 'generate-test-sources' ) | (enumLiteral_13= 'process-test-sources' ) | (enumLiteral_14= 'generate-test-resources' ) | (enumLiteral_15= 'process-test-resources' ) | (enumLiteral_16= 'test-compile' ) | (enumLiteral_17= 'process-test-classes' ) | (enumLiteral_18= 'test' ) | (enumLiteral_19= 'prepare-package' ) | (enumLiteral_20= 'package' ) | (enumLiteral_21= 'pre-integration-test' ) | (enumLiteral_22= 'integration-test' ) | (enumLiteral_23= 'post-integration-test' ) | (enumLiteral_24= 'verify' ) | (enumLiteral_25= 'install' ) | (enumLiteral_26= 'deploy' ) | (enumLiteral_27= 'pre-site' ) | (enumLiteral_28= 'site' ) | (enumLiteral_29= 'post-site' ) | (enumLiteral_30= 'site-deploy' ) )
            int alt52=31;
            switch ( input.LA(1) ) {
            case 46:
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
            case 50:
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
            case 25:
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
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:2: (enumLiteral_0= 'default' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:2: (enumLiteral_0= 'default' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3027:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_rulePhase6967); 

                            current = grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPhaseAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3033:6: (enumLiteral_1= 'pre-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3033:6: (enumLiteral_1= 'pre-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3033:8: enumLiteral_1= 'pre-clean'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_rulePhase6984); 

                            current = grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPhaseAccess().getPRE_CLEANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3039:6: (enumLiteral_2= 'clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3039:6: (enumLiteral_2= 'clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3039:8: enumLiteral_2= 'clean'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_rulePhase7001); 

                            current = grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPhaseAccess().getCLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:6: (enumLiteral_3= 'post-clean' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:6: (enumLiteral_3= 'post-clean' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3045:8: enumLiteral_3= 'post-clean'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_rulePhase7018); 

                            current = grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPhaseAccess().getPOST_CLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3051:6: (enumLiteral_4= 'validate' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3051:6: (enumLiteral_4= 'validate' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3051:8: enumLiteral_4= 'validate'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_rulePhase7035); 

                            current = grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPhaseAccess().getVALIDATEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:6: (enumLiteral_5= 'initialize' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:6: (enumLiteral_5= 'initialize' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3057:8: enumLiteral_5= 'initialize'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_rulePhase7052); 

                            current = grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPhaseAccess().getINITIALIZEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3063:6: (enumLiteral_6= 'generate-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3063:6: (enumLiteral_6= 'generate-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3063:8: enumLiteral_6= 'generate-sources'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_rulePhase7069); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPhaseAccess().getGENERATE_SOURCESEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3069:6: (enumLiteral_7= 'process-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3069:6: (enumLiteral_7= 'process-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3069:8: enumLiteral_7= 'process-sources'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_rulePhase7086); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPhaseAccess().getPROCESS_SOURCESEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3075:6: (enumLiteral_8= 'generate-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3075:6: (enumLiteral_8= 'generate-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3075:8: enumLiteral_8= 'generate-resources'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_rulePhase7103); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPhaseAccess().getGENERATE_RESOURCESEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3081:6: (enumLiteral_9= 'process-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3081:6: (enumLiteral_9= 'process-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3081:8: enumLiteral_9= 'process-resources'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_rulePhase7120); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPhaseAccess().getPROCESS_RESOURCESEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3087:6: (enumLiteral_10= 'compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3087:6: (enumLiteral_10= 'compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3087:8: enumLiteral_10= 'compile'
                    {
                    enumLiteral_10=(Token)match(input,50,FOLLOW_50_in_rulePhase7137); 

                            current = grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPhaseAccess().getCOMPILEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3093:6: (enumLiteral_11= 'process-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3093:6: (enumLiteral_11= 'process-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3093:8: enumLiteral_11= 'process-classes'
                    {
                    enumLiteral_11=(Token)match(input,63,FOLLOW_63_in_rulePhase7154); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPhaseAccess().getPROCESS_CLASSESEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3099:6: (enumLiteral_12= 'generate-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3099:6: (enumLiteral_12= 'generate-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3099:8: enumLiteral_12= 'generate-test-sources'
                    {
                    enumLiteral_12=(Token)match(input,64,FOLLOW_64_in_rulePhase7171); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPhaseAccess().getGENERATE_TEST_SOURCESEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:6: (enumLiteral_13= 'process-test-sources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:6: (enumLiteral_13= 'process-test-sources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3105:8: enumLiteral_13= 'process-test-sources'
                    {
                    enumLiteral_13=(Token)match(input,65,FOLLOW_65_in_rulePhase7188); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPhaseAccess().getPROCESS_TEST_SOURCESEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3111:6: (enumLiteral_14= 'generate-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3111:6: (enumLiteral_14= 'generate-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3111:8: enumLiteral_14= 'generate-test-resources'
                    {
                    enumLiteral_14=(Token)match(input,66,FOLLOW_66_in_rulePhase7205); 

                            current = grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPhaseAccess().getGENERATE_TEST_RESOURCESEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3117:6: (enumLiteral_15= 'process-test-resources' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3117:6: (enumLiteral_15= 'process-test-resources' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3117:8: enumLiteral_15= 'process-test-resources'
                    {
                    enumLiteral_15=(Token)match(input,67,FOLLOW_67_in_rulePhase7222); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPhaseAccess().getPROCESS_TEST_RESOURCESEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3123:6: (enumLiteral_16= 'test-compile' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3123:6: (enumLiteral_16= 'test-compile' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3123:8: enumLiteral_16= 'test-compile'
                    {
                    enumLiteral_16=(Token)match(input,68,FOLLOW_68_in_rulePhase7239); 

                            current = grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPhaseAccess().getTEST_COMPILEEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3129:6: (enumLiteral_17= 'process-test-classes' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3129:6: (enumLiteral_17= 'process-test-classes' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3129:8: enumLiteral_17= 'process-test-classes'
                    {
                    enumLiteral_17=(Token)match(input,69,FOLLOW_69_in_rulePhase7256); 

                            current = grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPhaseAccess().getPROCESS_TEST_CLASSESEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3135:6: (enumLiteral_18= 'test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3135:6: (enumLiteral_18= 'test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3135:8: enumLiteral_18= 'test'
                    {
                    enumLiteral_18=(Token)match(input,25,FOLLOW_25_in_rulePhase7273); 

                            current = grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPhaseAccess().getTESTEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3141:6: (enumLiteral_19= 'prepare-package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3141:6: (enumLiteral_19= 'prepare-package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3141:8: enumLiteral_19= 'prepare-package'
                    {
                    enumLiteral_19=(Token)match(input,70,FOLLOW_70_in_rulePhase7290); 

                            current = grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPhaseAccess().getPREPARE_PACKAGEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3147:6: (enumLiteral_20= 'package' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3147:6: (enumLiteral_20= 'package' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3147:8: enumLiteral_20= 'package'
                    {
                    enumLiteral_20=(Token)match(input,71,FOLLOW_71_in_rulePhase7307); 

                            current = grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPhaseAccess().getPACKAGEEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3153:6: (enumLiteral_21= 'pre-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3153:6: (enumLiteral_21= 'pre-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3153:8: enumLiteral_21= 'pre-integration-test'
                    {
                    enumLiteral_21=(Token)match(input,72,FOLLOW_72_in_rulePhase7324); 

                            current = grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPhaseAccess().getPRE_INTEGRATION_TESTEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3159:6: (enumLiteral_22= 'integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3159:6: (enumLiteral_22= 'integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3159:8: enumLiteral_22= 'integration-test'
                    {
                    enumLiteral_22=(Token)match(input,73,FOLLOW_73_in_rulePhase7341); 

                            current = grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPhaseAccess().getINTEGRATION_TESTEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3165:6: (enumLiteral_23= 'post-integration-test' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3165:6: (enumLiteral_23= 'post-integration-test' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3165:8: enumLiteral_23= 'post-integration-test'
                    {
                    enumLiteral_23=(Token)match(input,74,FOLLOW_74_in_rulePhase7358); 

                            current = grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPhaseAccess().getPOST_INTEGRATION_TESTEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:6: (enumLiteral_24= 'verify' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:6: (enumLiteral_24= 'verify' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3171:8: enumLiteral_24= 'verify'
                    {
                    enumLiteral_24=(Token)match(input,75,FOLLOW_75_in_rulePhase7375); 

                            current = grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPhaseAccess().getVERIFYEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3177:6: (enumLiteral_25= 'install' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3177:6: (enumLiteral_25= 'install' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3177:8: enumLiteral_25= 'install'
                    {
                    enumLiteral_25=(Token)match(input,76,FOLLOW_76_in_rulePhase7392); 

                            current = grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getPhaseAccess().getINSTALLEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:6: (enumLiteral_26= 'deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:6: (enumLiteral_26= 'deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3183:8: enumLiteral_26= 'deploy'
                    {
                    enumLiteral_26=(Token)match(input,77,FOLLOW_77_in_rulePhase7409); 

                            current = grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getPhaseAccess().getDEPLOYEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:6: (enumLiteral_27= 'pre-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:6: (enumLiteral_27= 'pre-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3189:8: enumLiteral_27= 'pre-site'
                    {
                    enumLiteral_27=(Token)match(input,78,FOLLOW_78_in_rulePhase7426); 

                            current = grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getPhaseAccess().getPRE_SITEEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3195:6: (enumLiteral_28= 'site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3195:6: (enumLiteral_28= 'site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3195:8: enumLiteral_28= 'site'
                    {
                    enumLiteral_28=(Token)match(input,79,FOLLOW_79_in_rulePhase7443); 

                            current = grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getPhaseAccess().getSITEEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3201:6: (enumLiteral_29= 'post-site' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3201:6: (enumLiteral_29= 'post-site' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3201:8: enumLiteral_29= 'post-site'
                    {
                    enumLiteral_29=(Token)match(input,80,FOLLOW_80_in_rulePhase7460); 

                            current = grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getPhaseAccess().getPOST_SITEEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3207:6: (enumLiteral_30= 'site-deploy' )
                    {
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3207:6: (enumLiteral_30= 'site-deploy' )
                    // ../de.itemis.mpp/src-gen/de/itemis/mpp/parser/antlr/internal/InternalPom.g:3207:8: enumLiteral_30= 'site-deploy'
                    {
                    enumLiteral_30=(Token)match(input,81,FOLLOW_81_in_rulePhase7477); 

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
        "\1\1\1\uffff\1\7\5\uffff\2\7\2\uffff\1\7";
    static final String DFA19_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\5\1\uffff\1\24\4\5";
    static final String DFA19_maxS =
        "\1\65\1\uffff\1\65\2\uffff\1\47\1\5\1\uffff\1\57\1\65\1\5\1\6\1"+
        "\65";
    static final String DFA19_acceptS =
        "\1\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1\5\uffff";
    static final String DFA19_specialS =
        "\15\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\3\1\4\3\uffff\2\1\1\uffff\7\1\2\uffff\4\1\1\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\4\1\10\uffff\7\1",
            "",
            "\4\7\3\uffff\2\7\1\uffff\6\7\1\5\2\uffff\4\7\1\uffff\1\7\1"+
            "\uffff\4\7\1\uffff\4\7\10\uffff\1\6\6\7",
            "",
            "",
            "\1\10\5\uffff\1\1\13\uffff\1\1\1\uffff\1\1\15\uffff\1\7",
            "\1\11",
            "",
            "\1\1\1\7\6\uffff\1\7\11\uffff\1\7\10\uffff\1\1",
            "\1\7\5\uffff\1\7\11\uffff\1\12\1\uffff\3\7\2\uffff\1\7\3\uffff"+
            "\1\7\16\uffff\1\13\1\7\1\uffff\4\7",
            "\1\14",
            "\1\7\1\1",
            "\1\7\5\uffff\1\7\11\uffff\1\12\1\uffff\3\7\2\uffff\1\7\3\uffff"+
            "\1\7\16\uffff\1\13\1\7\1\uffff\4\7"
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
            return "()* loopback of 862:1: (this_ID_0= RULE_ID | this_Number_1= ruleNumber | this_ANY_OTHER_2= RULE_ANY_OTHER )*";
        }
    }
    static final String DFA25_eotS =
        "\13\uffff";
    static final String DFA25_eofS =
        "\13\uffff";
    static final String DFA25_minS =
        "\1\5\2\uffff\6\5\2\uffff";
    static final String DFA25_maxS =
        "\1\65\2\uffff\4\40\1\57\1\40\2\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\4\1\1\6\uffff\1\3\1\2";
    static final String DFA25_specialS =
        "\13\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\1\1\7\2\uffff\1\2\3\uffff"+
            "\1\11\17\uffff\1\10\1\uffff\1\3\1\4\1\5\1\6",
            "",
            "",
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\uffff\1\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\uffff\1\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\uffff\1\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\uffff\1\11\5\uffff\1\12"+
            "\1\11",
            "\1\11\5\uffff\1\11\10\uffff\1\11\2\uffff\1\11\1\uffff\1\11"+
            "\5\uffff\1\12\1\11\16\uffff\1\11",
            "\1\11\5\uffff\1\11\13\uffff\1\11\1\uffff\1\11\5\uffff\1\12"+
            "\1\11",
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
            return "()+ loopback of 1266:1: ( ( (lv_includes_3_0= ruleDependencyInclusion ) ) | ( (lv_dependencyGroups_4_0= ruleDependencyGroup ) ) | ( (lv_ungroupedDependencies_5_0= ruleUngroupedDependency ) ) )+";
        }
    }
    static final String DFA31_eotS =
        "\13\uffff";
    static final String DFA31_eofS =
        "\1\1\12\uffff";
    static final String DFA31_minS =
        "\1\30\1\uffff\5\0\4\uffff";
    static final String DFA31_maxS =
        "\1\46\1\uffff\5\0\4\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\5\5\uffff\1\1\1\2\1\3\1\4";
    static final String DFA31_specialS =
        "\2\uffff\1\2\1\1\1\3\1\4\1\0\4\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\6\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\1\uffff"+
            "\1\3\1\4\1\5\1\1",
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
            return "()+ loopback of 1590:3: ( ({...}? => ( ({...}? => (otherlv_1= 'scm' otherlv_2= '{' (otherlv_3= 'con' ( (lv_connection_4_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'dev' ( (lv_developerConncetion_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'url' ( (lv_url_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_9= 'tag' ( (lv_tag_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSCMAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getSCMAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index31_5);
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
    public static final BitSet FOLLOW_rulePOMImport_in_rulePOM131 = new BitSet(new long[]{0x0001007A550FD800L});
    public static final BitSet FOLLOW_ruleParentRef_in_rulePOM153 = new BitSet(new long[]{0x0000007A550FD000L});
    public static final BitSet FOLLOW_ruleArtifactDefinition_in_rulePOM175 = new BitSet(new long[]{0x0000007A55001002L});
    public static final BitSet FOLLOW_ruleModules_in_rulePOM196 = new BitSet(new long[]{0x0000007A55000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_rulePOM263 = new BitSet(new long[]{0x0000007A55000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePOM339 = new BitSet(new long[]{0x0000007A55000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_rulePOM415 = new BitSet(new long[]{0x0000007A55000002L});
    public static final BitSet FOLLOW_ruleSCM_in_rulePOM490 = new BitSet(new long[]{0x0000007A55000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_rulePOM551 = new BitSet(new long[]{0x0000004010000002L});
    public static final BitSet FOLLOW_ruleParentRef_in_entryRuleParentRef588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentRef598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleParentRef635 = new BitSet(new long[]{0x0000000002800820L});
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
    public static final BitSet FOLLOW_14_in_ruleArtifactDefinition914 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleArtifactDefinition935 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_15_in_ruleArtifactDefinition950 = new BitSet(new long[]{0x0000000002800820L});
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
    public static final BitSet FOLLOW_20_in_ruleIDAndDot1370 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndDot1392 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_entryRuleIDAndDash1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndDash1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1491 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleIDAndDash1510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDAndDash1525 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_entryRuleIDAndSpecialCharacters1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDAndSpecialCharacters1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndSpecialCharacters1631 = new BitSet(new long[]{0x0000000002F00822L});
    public static final BitSet FOLLOW_21_in_ruleIDAndSpecialCharacters1651 = new BitSet(new long[]{0x0000000002F00820L});
    public static final BitSet FOLLOW_20_in_ruleIDAndSpecialCharacters1670 = new BitSet(new long[]{0x0000000002F00820L});
    public static final BitSet FOLLOW_22_in_ruleIDAndSpecialCharacters1689 = new BitSet(new long[]{0x0000000002F00820L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_ruleIDAndSpecialCharacters1713 = new BitSet(new long[]{0x0000000002F00822L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleText2002 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleText2035 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleText2061 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_rulePropertyName2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPropteryRef_in_entryRuleIDOrPropteryRef2210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPropteryRef2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_ruleIDOrPropteryRef2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIDOrPropteryRef2293 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleIDOrPropteryRef2315 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIDOrPropteryRef2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrKW_in_entryRuleIDOrKW2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrKW2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrKW2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIDOrKW2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleIDOrKW2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2565 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2578 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2599 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleVersion2612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleVersion2633 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVersion2650 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleText_in_ruleVersion2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleProperty2756 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleProperty2777 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProperty2789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyInclusion_in_entryRulePropertyInclusion2847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyInclusion2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePropertyInclusion2894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyInclusion2914 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePropertyInclusion2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencies_in_entryRuleDependencies2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencies2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDependencies3018 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDependencies3030 = new BitSet(new long[]{0x003D000112800820L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_ruleDependencies3052 = new BitSet(new long[]{0x003D000113800820L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_ruleDependencies3079 = new BitSet(new long[]{0x003D000113800820L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_ruleDependencies3106 = new BitSet(new long[]{0x003D000113800820L});
    public static final BitSet FOLLOW_24_in_ruleDependencies3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyGroup_in_entryRuleDependencyGroup3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyGroup3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyGroup3212 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDependencyGroup3224 = new BitSet(new long[]{0x003D000112800820L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDependencyGroup3245 = new BitSet(new long[]{0x003D000113800820L});
    public static final BitSet FOLLOW_24_in_ruleDependencyGroup3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUngroupedDependency_in_entryRuleUngroupedDependency3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUngroupedDependency3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleUngroupedDependency3350 = new BitSet(new long[]{0x003D000112800820L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleUngroupedDependency3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDependency3461 = new BitSet(new long[]{0x003D000112800820L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_ruleDependency3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyInclusion_in_entryRuleDependencyInclusion3532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyInclusion3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDependencyInclusion3579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyInclusion3599 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependencyInclusion3611 = new BitSet(new long[]{0x003D000002000000L});
    public static final BitSet FOLLOW_ruleDependencyScope_in_ruleDependencyInclusion3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCM_in_entryRuleSCM3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCM3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSCM3760 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSCM3772 = new BitSet(new long[]{0x0000003E01000002L});
    public static final BitSet FOLLOW_34_in_ruleSCM3785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3802 = new BitSet(new long[]{0x0000003A01000002L});
    public static final BitSet FOLLOW_35_in_ruleSCM3877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3894 = new BitSet(new long[]{0x0000003A01000002L});
    public static final BitSet FOLLOW_36_in_ruleSCM3967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM3984 = new BitSet(new long[]{0x0000003A01000002L});
    public static final BitSet FOLLOW_37_in_ruleSCM4058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSCM4075 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSCM4094 = new BitSet(new long[]{0x0000003A01000002L});
    public static final BitSet FOLLOW_rulePlugin_in_entryRulePlugin4176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlugin4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePlugin4223 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePlugin4244 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePlugin4256 = new BitSet(new long[]{0x0000088001000000L});
    public static final BitSet FOLLOW_39_in_rulePlugin4314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePlugin4326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePlugin4347 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4359 = new BitSet(new long[]{0x0000088001000000L});
    public static final BitSet FOLLOW_rulePluginExecution_in_rulePlugin4435 = new BitSet(new long[]{0x0000088001000000L});
    public static final BitSet FOLLOW_24_in_rulePlugin4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_entryRulePluginConfiguration4524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfiguration4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfiguration4579 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_entryRulePluginConfigurationItem4615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationItem4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_rulePluginConfigurationItem4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_rulePluginConfigurationItem4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_rulePluginConfigurationItem4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_rulePluginConfigurationItem4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameter_in_entryRulePluginConfigurationParameter4788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameter4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameter4840 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameter4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePluginConfigurationParameter4887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationItem_in_rulePluginConfigurationParameter4908 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameter4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterList_in_entryRulePluginConfigurationParameterList4960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterList4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterList5012 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePluginConfigurationParameterList5029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5046 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_13_in_rulePluginConfigurationParameterList5064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterList5081 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_41_in_rulePluginConfigurationParameterList5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMap_in_entryRulePluginConfigurationParameterMap5136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMap5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMap5188 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePluginConfigurationParameterMap5205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_rulePluginConfigurationParameterMap5226 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterMap5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterMapEntry_in_entryRulePluginConfigurationParameterMapEntry5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterMapEntry5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterMapEntry5327 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePluginConfigurationParameterMapEntry5344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterMapEntry5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterProperties_in_entryRulePluginConfigurationParameterProperties5402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterProperties5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterProperties5454 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePluginConfigurationParameterProperties5471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_rulePluginConfigurationParameterProperties5492 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_rulePluginConfigurationParameterProperties5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginConfigurationParameterPropertyEntry_in_entryRulePluginConfigurationParameterPropertyEntry5541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginConfigurationParameterPropertyEntry5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginConfigurationParameterPropertyEntry5593 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePluginConfigurationParameterPropertyEntry5610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePluginConfigurationParameterPropertyEntry5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginExecution_in_entryRulePluginExecution5668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginExecution5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePluginExecution5715 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5738 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_rulePluginExecution5752 = new BitSet(new long[]{0xFFC4400002000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_rulePhase_in_rulePluginExecution5773 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePluginExecution5787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5808 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_13_in_rulePluginExecution5821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginExecution5842 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_31_in_rulePluginExecution5857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePluginConfiguration_in_rulePluginExecution5878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePluginExecution5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePluginExecution5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_entryRulePluginInclusion5967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePluginInclusion5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePluginInclusion6014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePluginInclusion6034 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion6046 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePluginInclusion6067 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_rulePluginInclusion6080 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_rulePluginInclusion6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePluginInclusion6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuildStep_in_entryRuleBuildStep6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildStep6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlugin_in_ruleBuildStep6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePluginInclusion_in_ruleBuildStep6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoordinates_in_entryRuleCoordinates6297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoordinates6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6353 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCoordinates6365 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleIDAndSpecialCharacters_in_ruleCoordinates6386 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCoordinates6398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleCoordinates6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedCoordinates_in_entryRuleExtendedCoordinates6455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedCoordinates6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDAndDot_in_ruleExtendedCoordinates6511 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExtendedCoordinates6523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6544 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExtendedCoordinates6556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleExtendedCoordinates6577 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExtendedCoordinates6590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIDAndDash_in_ruleExtendedCoordinates6611 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExtendedCoordinates6624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleExtendedCoordinates6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOMImport_in_entryRulePOMImport6685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOMImport6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePOMImport6732 = new BitSet(new long[]{0x0000000002800820L});
    public static final BitSet FOLLOW_ruleCoordinates_in_rulePOMImport6753 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePOMImport6765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOMImport6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDependencyScope6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDependencyScope6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDependencyScope6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDependencyScope6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDependencyScope6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDependencyScope6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePhase6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePhase6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePhase7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePhase7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePhase7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePhase7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePhase7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePhase7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePhase7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePhase7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePhase7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePhase7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePhase7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePhase7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePhase7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePhase7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePhase7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePhase7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePhase7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePhase7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePhase7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePhase7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePhase7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePhase7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePhase7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePhase7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePhase7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePhase7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePhase7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePhase7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePhase7477 = new BitSet(new long[]{0x0000000000000002L});

}
