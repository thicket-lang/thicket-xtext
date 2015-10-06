package org.thicket.lang.xtext.ide.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.thicket.lang.xtext.services.ThicketGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThicketParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_OP", "RULE_DOLL", "RULE_IDENT", "RULE_ID", "RULE_SOP", "RULE_EOP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "','", "'->'", "'/>'", "'module'", "'.'", "'from'", "'import'", "'typedef'", "'='", "'type'", "'{'", "'}'", "'model'", "':'", "'['", "']'", "'('", "')'", "'def'", "'adapter'", "'class'", "'+'", "'trait'", "'<'", "'>'", "'</'", "'for'", "'yield'", "'<-'", "'if'", "'let'", "'in'", "'new'", "'with'"
    };
    public static final int T__50=50;
    public static final int RULE_SOP=10;
    public static final int RULE_DOLL=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_EOP=11;
    public static final int RULE_OP=6;
    public static final int RULE_ID=9;
    public static final int RULE_IDENT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
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


        public InternalThicketParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThicketParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThicketParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThicket.g"; }


     
     	private ThicketGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ThicketGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // InternalThicket.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalThicket.g:61:1: ( ruleModel EOF )
            // InternalThicket.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalThicket.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalThicket.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalThicket.g:74:1: ( ( rule__Model__Group__0 ) )
            // InternalThicket.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalThicket.g:76:1: ( rule__Model__Group__0 )
            // InternalThicket.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleimports"
    // InternalThicket.g:88:1: entryRuleimports : ruleimports EOF ;
    public final void entryRuleimports() throws RecognitionException {
        try {
            // InternalThicket.g:89:1: ( ruleimports EOF )
            // InternalThicket.g:90:1: ruleimports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            ruleimports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleimports"


    // $ANTLR start "ruleimports"
    // InternalThicket.g:97:1: ruleimports : ( ( rule__Imports__Alternatives ) ) ;
    public final void ruleimports() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:101:2: ( ( ( rule__Imports__Alternatives ) ) )
            // InternalThicket.g:102:1: ( ( rule__Imports__Alternatives ) )
            {
            // InternalThicket.g:102:1: ( ( rule__Imports__Alternatives ) )
            // InternalThicket.g:103:1: ( rule__Imports__Alternatives )
            {
             before(grammarAccess.getImportsAccess().getAlternatives()); 
            // InternalThicket.g:104:1: ( rule__Imports__Alternatives )
            // InternalThicket.g:104:2: rule__Imports__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleimports"


    // $ANTLR start "entryRuleentity"
    // InternalThicket.g:116:1: entryRuleentity : ruleentity EOF ;
    public final void entryRuleentity() throws RecognitionException {
        try {
            // InternalThicket.g:117:1: ( ruleentity EOF )
            // InternalThicket.g:118:1: ruleentity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentity"


    // $ANTLR start "ruleentity"
    // InternalThicket.g:125:1: ruleentity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleentity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:129:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalThicket.g:130:1: ( ( rule__Entity__Alternatives ) )
            {
            // InternalThicket.g:130:1: ( ( rule__Entity__Alternatives ) )
            // InternalThicket.g:131:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalThicket.g:132:1: ( rule__Entity__Alternatives )
            // InternalThicket.g:132:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentity"


    // $ANTLR start "entryRuletypeDef"
    // InternalThicket.g:144:1: entryRuletypeDef : ruletypeDef EOF ;
    public final void entryRuletypeDef() throws RecognitionException {
        try {
            // InternalThicket.g:145:1: ( ruletypeDef EOF )
            // InternalThicket.g:146:1: ruletypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruletypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletypeDef"


    // $ANTLR start "ruletypeDef"
    // InternalThicket.g:153:1: ruletypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruletypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:157:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalThicket.g:158:1: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalThicket.g:158:1: ( ( rule__TypeDef__Group__0 ) )
            // InternalThicket.g:159:1: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // InternalThicket.g:160:1: ( rule__TypeDef__Group__0 )
            // InternalThicket.g:160:2: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeDef"


    // $ANTLR start "entryRulesortDef"
    // InternalThicket.g:172:1: entryRulesortDef : rulesortDef EOF ;
    public final void entryRulesortDef() throws RecognitionException {
        try {
            // InternalThicket.g:173:1: ( rulesortDef EOF )
            // InternalThicket.g:174:1: rulesortDef EOF
            {
             before(grammarAccess.getSortDefRule()); 
            pushFollow(FOLLOW_1);
            rulesortDef();

            state._fsp--;

             after(grammarAccess.getSortDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesortDef"


    // $ANTLR start "rulesortDef"
    // InternalThicket.g:181:1: rulesortDef : ( ( rule__SortDef__Group__0 ) ) ;
    public final void rulesortDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:185:2: ( ( ( rule__SortDef__Group__0 ) ) )
            // InternalThicket.g:186:1: ( ( rule__SortDef__Group__0 ) )
            {
            // InternalThicket.g:186:1: ( ( rule__SortDef__Group__0 ) )
            // InternalThicket.g:187:1: ( rule__SortDef__Group__0 )
            {
             before(grammarAccess.getSortDefAccess().getGroup()); 
            // InternalThicket.g:188:1: ( rule__SortDef__Group__0 )
            // InternalThicket.g:188:2: rule__SortDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SortDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSortDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesortDef"


    // $ANTLR start "entryRuleobjectDef"
    // InternalThicket.g:200:1: entryRuleobjectDef : ruleobjectDef EOF ;
    public final void entryRuleobjectDef() throws RecognitionException {
        try {
            // InternalThicket.g:201:1: ( ruleobjectDef EOF )
            // InternalThicket.g:202:1: ruleobjectDef EOF
            {
             before(grammarAccess.getObjectDefRule()); 
            pushFollow(FOLLOW_1);
            ruleobjectDef();

            state._fsp--;

             after(grammarAccess.getObjectDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleobjectDef"


    // $ANTLR start "ruleobjectDef"
    // InternalThicket.g:209:1: ruleobjectDef : ( ( rule__ObjectDef__Group__0 ) ) ;
    public final void ruleobjectDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:213:2: ( ( ( rule__ObjectDef__Group__0 ) ) )
            // InternalThicket.g:214:1: ( ( rule__ObjectDef__Group__0 ) )
            {
            // InternalThicket.g:214:1: ( ( rule__ObjectDef__Group__0 ) )
            // InternalThicket.g:215:1: ( rule__ObjectDef__Group__0 )
            {
             before(grammarAccess.getObjectDefAccess().getGroup()); 
            // InternalThicket.g:216:1: ( rule__ObjectDef__Group__0 )
            // InternalThicket.g:216:2: rule__ObjectDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleobjectDef"


    // $ANTLR start "entryRuletparam"
    // InternalThicket.g:228:1: entryRuletparam : ruletparam EOF ;
    public final void entryRuletparam() throws RecognitionException {
        try {
            // InternalThicket.g:229:1: ( ruletparam EOF )
            // InternalThicket.g:230:1: ruletparam EOF
            {
             before(grammarAccess.getTparamRule()); 
            pushFollow(FOLLOW_1);
            ruletparam();

            state._fsp--;

             after(grammarAccess.getTparamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletparam"


    // $ANTLR start "ruletparam"
    // InternalThicket.g:237:1: ruletparam : ( ( rule__Tparam__Group__0 ) ) ;
    public final void ruletparam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:241:2: ( ( ( rule__Tparam__Group__0 ) ) )
            // InternalThicket.g:242:1: ( ( rule__Tparam__Group__0 ) )
            {
            // InternalThicket.g:242:1: ( ( rule__Tparam__Group__0 ) )
            // InternalThicket.g:243:1: ( rule__Tparam__Group__0 )
            {
             before(grammarAccess.getTparamAccess().getGroup()); 
            // InternalThicket.g:244:1: ( rule__Tparam__Group__0 )
            // InternalThicket.g:244:2: rule__Tparam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tparam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTparamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletparam"


    // $ANTLR start "entryRulegenerics"
    // InternalThicket.g:256:1: entryRulegenerics : rulegenerics EOF ;
    public final void entryRulegenerics() throws RecognitionException {
        try {
            // InternalThicket.g:257:1: ( rulegenerics EOF )
            // InternalThicket.g:258:1: rulegenerics EOF
            {
             before(grammarAccess.getGenericsRule()); 
            pushFollow(FOLLOW_1);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getGenericsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegenerics"


    // $ANTLR start "rulegenerics"
    // InternalThicket.g:265:1: rulegenerics : ( ( rule__Generics__Group__0 )? ) ;
    public final void rulegenerics() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:269:2: ( ( ( rule__Generics__Group__0 )? ) )
            // InternalThicket.g:270:1: ( ( rule__Generics__Group__0 )? )
            {
            // InternalThicket.g:270:1: ( ( rule__Generics__Group__0 )? )
            // InternalThicket.g:271:1: ( rule__Generics__Group__0 )?
            {
             before(grammarAccess.getGenericsAccess().getGroup()); 
            // InternalThicket.g:272:1: ( rule__Generics__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalThicket.g:272:2: rule__Generics__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generics__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGenericsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegenerics"


    // $ANTLR start "entryRuletype"
    // InternalThicket.g:284:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalThicket.g:285:1: ( ruletype EOF )
            // InternalThicket.g:286:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalThicket.g:293:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:297:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalThicket.g:298:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalThicket.g:298:1: ( ( rule__Type__Alternatives ) )
            // InternalThicket.g:299:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalThicket.g:300:1: ( rule__Type__Alternatives )
            // InternalThicket.g:300:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuletypes"
    // InternalThicket.g:312:1: entryRuletypes : ruletypes EOF ;
    public final void entryRuletypes() throws RecognitionException {
        try {
            // InternalThicket.g:313:1: ( ruletypes EOF )
            // InternalThicket.g:314:1: ruletypes EOF
            {
             before(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletypes"


    // $ANTLR start "ruletypes"
    // InternalThicket.g:321:1: ruletypes : ( ( rule__Types__Group__0 ) ) ;
    public final void ruletypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:325:2: ( ( ( rule__Types__Group__0 ) ) )
            // InternalThicket.g:326:1: ( ( rule__Types__Group__0 ) )
            {
            // InternalThicket.g:326:1: ( ( rule__Types__Group__0 ) )
            // InternalThicket.g:327:1: ( rule__Types__Group__0 )
            {
             before(grammarAccess.getTypesAccess().getGroup()); 
            // InternalThicket.g:328:1: ( rule__Types__Group__0 )
            // InternalThicket.g:328:2: rule__Types__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypes"


    // $ANTLR start "entryRuleexpressionDef"
    // InternalThicket.g:340:1: entryRuleexpressionDef : ruleexpressionDef EOF ;
    public final void entryRuleexpressionDef() throws RecognitionException {
        try {
            // InternalThicket.g:341:1: ( ruleexpressionDef EOF )
            // InternalThicket.g:342:1: ruleexpressionDef EOF
            {
             before(grammarAccess.getExpressionDefRule()); 
            pushFollow(FOLLOW_1);
            ruleexpressionDef();

            state._fsp--;

             after(grammarAccess.getExpressionDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpressionDef"


    // $ANTLR start "ruleexpressionDef"
    // InternalThicket.g:349:1: ruleexpressionDef : ( ( rule__ExpressionDef__Group__0 ) ) ;
    public final void ruleexpressionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:353:2: ( ( ( rule__ExpressionDef__Group__0 ) ) )
            // InternalThicket.g:354:1: ( ( rule__ExpressionDef__Group__0 ) )
            {
            // InternalThicket.g:354:1: ( ( rule__ExpressionDef__Group__0 ) )
            // InternalThicket.g:355:1: ( rule__ExpressionDef__Group__0 )
            {
             before(grammarAccess.getExpressionDefAccess().getGroup()); 
            // InternalThicket.g:356:1: ( rule__ExpressionDef__Group__0 )
            // InternalThicket.g:356:2: rule__ExpressionDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpressionDef"


    // $ANTLR start "entryRuleclassDef"
    // InternalThicket.g:368:1: entryRuleclassDef : ruleclassDef EOF ;
    public final void entryRuleclassDef() throws RecognitionException {
        try {
            // InternalThicket.g:369:1: ( ruleclassDef EOF )
            // InternalThicket.g:370:1: ruleclassDef EOF
            {
             before(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            ruleclassDef();

            state._fsp--;

             after(grammarAccess.getClassDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleclassDef"


    // $ANTLR start "ruleclassDef"
    // InternalThicket.g:377:1: ruleclassDef : ( ( rule__ClassDef__Group__0 ) ) ;
    public final void ruleclassDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:381:2: ( ( ( rule__ClassDef__Group__0 ) ) )
            // InternalThicket.g:382:1: ( ( rule__ClassDef__Group__0 ) )
            {
            // InternalThicket.g:382:1: ( ( rule__ClassDef__Group__0 ) )
            // InternalThicket.g:383:1: ( rule__ClassDef__Group__0 )
            {
             before(grammarAccess.getClassDefAccess().getGroup()); 
            // InternalThicket.g:384:1: ( rule__ClassDef__Group__0 )
            // InternalThicket.g:384:2: rule__ClassDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleclassDef"


    // $ANTLR start "entryRuletraitDef"
    // InternalThicket.g:396:1: entryRuletraitDef : ruletraitDef EOF ;
    public final void entryRuletraitDef() throws RecognitionException {
        try {
            // InternalThicket.g:397:1: ( ruletraitDef EOF )
            // InternalThicket.g:398:1: ruletraitDef EOF
            {
             before(grammarAccess.getTraitDefRule()); 
            pushFollow(FOLLOW_1);
            ruletraitDef();

            state._fsp--;

             after(grammarAccess.getTraitDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletraitDef"


    // $ANTLR start "ruletraitDef"
    // InternalThicket.g:405:1: ruletraitDef : ( ( rule__TraitDef__Group__0 ) ) ;
    public final void ruletraitDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:409:2: ( ( ( rule__TraitDef__Group__0 ) ) )
            // InternalThicket.g:410:1: ( ( rule__TraitDef__Group__0 ) )
            {
            // InternalThicket.g:410:1: ( ( rule__TraitDef__Group__0 ) )
            // InternalThicket.g:411:1: ( rule__TraitDef__Group__0 )
            {
             before(grammarAccess.getTraitDefAccess().getGroup()); 
            // InternalThicket.g:412:1: ( rule__TraitDef__Group__0 )
            // InternalThicket.g:412:2: rule__TraitDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraitDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletraitDef"


    // $ANTLR start "entryRulemethodClass"
    // InternalThicket.g:424:1: entryRulemethodClass : rulemethodClass EOF ;
    public final void entryRulemethodClass() throws RecognitionException {
        try {
            // InternalThicket.g:425:1: ( rulemethodClass EOF )
            // InternalThicket.g:426:1: rulemethodClass EOF
            {
             before(grammarAccess.getMethodClassRule()); 
            pushFollow(FOLLOW_1);
            rulemethodClass();

            state._fsp--;

             after(grammarAccess.getMethodClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemethodClass"


    // $ANTLR start "rulemethodClass"
    // InternalThicket.g:433:1: rulemethodClass : ( ( rule__MethodClass__Group__0 ) ) ;
    public final void rulemethodClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:437:2: ( ( ( rule__MethodClass__Group__0 ) ) )
            // InternalThicket.g:438:1: ( ( rule__MethodClass__Group__0 ) )
            {
            // InternalThicket.g:438:1: ( ( rule__MethodClass__Group__0 ) )
            // InternalThicket.g:439:1: ( rule__MethodClass__Group__0 )
            {
             before(grammarAccess.getMethodClassAccess().getGroup()); 
            // InternalThicket.g:440:1: ( rule__MethodClass__Group__0 )
            // InternalThicket.g:440:2: rule__MethodClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemethodClass"


    // $ANTLR start "entryRulemethodTrait"
    // InternalThicket.g:452:1: entryRulemethodTrait : rulemethodTrait EOF ;
    public final void entryRulemethodTrait() throws RecognitionException {
        try {
            // InternalThicket.g:453:1: ( rulemethodTrait EOF )
            // InternalThicket.g:454:1: rulemethodTrait EOF
            {
             before(grammarAccess.getMethodTraitRule()); 
            pushFollow(FOLLOW_1);
            rulemethodTrait();

            state._fsp--;

             after(grammarAccess.getMethodTraitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemethodTrait"


    // $ANTLR start "rulemethodTrait"
    // InternalThicket.g:461:1: rulemethodTrait : ( ( rule__MethodTrait__Group__0 ) ) ;
    public final void rulemethodTrait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:465:2: ( ( ( rule__MethodTrait__Group__0 ) ) )
            // InternalThicket.g:466:1: ( ( rule__MethodTrait__Group__0 ) )
            {
            // InternalThicket.g:466:1: ( ( rule__MethodTrait__Group__0 ) )
            // InternalThicket.g:467:1: ( rule__MethodTrait__Group__0 )
            {
             before(grammarAccess.getMethodTraitAccess().getGroup()); 
            // InternalThicket.g:468:1: ( rule__MethodTrait__Group__0 )
            // InternalThicket.g:468:2: rule__MethodTrait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodTraitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemethodTrait"


    // $ANTLR start "entryRuleexpr"
    // InternalThicket.g:480:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {
        try {
            // InternalThicket.g:481:1: ( ruleexpr EOF )
            // InternalThicket.g:482:1: ruleexpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // InternalThicket.g:489:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:493:2: ( ( ( rule__Expr__Group__0 ) ) )
            // InternalThicket.g:494:1: ( ( rule__Expr__Group__0 ) )
            {
            // InternalThicket.g:494:1: ( ( rule__Expr__Group__0 ) )
            // InternalThicket.g:495:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // InternalThicket.g:496:1: ( rule__Expr__Group__0 )
            // InternalThicket.g:496:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuleiexpr"
    // InternalThicket.g:508:1: entryRuleiexpr : ruleiexpr EOF ;
    public final void entryRuleiexpr() throws RecognitionException {
        try {
            // InternalThicket.g:509:1: ( ruleiexpr EOF )
            // InternalThicket.g:510:1: ruleiexpr EOF
            {
             before(grammarAccess.getIexprRule()); 
            pushFollow(FOLLOW_1);
            ruleiexpr();

            state._fsp--;

             after(grammarAccess.getIexprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleiexpr"


    // $ANTLR start "ruleiexpr"
    // InternalThicket.g:517:1: ruleiexpr : ( ( rule__Iexpr__Group__0 ) ) ;
    public final void ruleiexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:521:2: ( ( ( rule__Iexpr__Group__0 ) ) )
            // InternalThicket.g:522:1: ( ( rule__Iexpr__Group__0 ) )
            {
            // InternalThicket.g:522:1: ( ( rule__Iexpr__Group__0 ) )
            // InternalThicket.g:523:1: ( rule__Iexpr__Group__0 )
            {
             before(grammarAccess.getIexprAccess().getGroup()); 
            // InternalThicket.g:524:1: ( rule__Iexpr__Group__0 )
            // InternalThicket.g:524:2: rule__Iexpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Iexpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIexprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleiexpr"


    // $ANTLR start "entryRulesexpr"
    // InternalThicket.g:536:1: entryRulesexpr : rulesexpr EOF ;
    public final void entryRulesexpr() throws RecognitionException {
        try {
            // InternalThicket.g:537:1: ( rulesexpr EOF )
            // InternalThicket.g:538:1: rulesexpr EOF
            {
             before(grammarAccess.getSexprRule()); 
            pushFollow(FOLLOW_1);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getSexprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesexpr"


    // $ANTLR start "rulesexpr"
    // InternalThicket.g:545:1: rulesexpr : ( ( rule__Sexpr__Alternatives ) ) ;
    public final void rulesexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:549:2: ( ( ( rule__Sexpr__Alternatives ) ) )
            // InternalThicket.g:550:1: ( ( rule__Sexpr__Alternatives ) )
            {
            // InternalThicket.g:550:1: ( ( rule__Sexpr__Alternatives ) )
            // InternalThicket.g:551:1: ( rule__Sexpr__Alternatives )
            {
             before(grammarAccess.getSexprAccess().getAlternatives()); 
            // InternalThicket.g:552:1: ( rule__Sexpr__Alternatives )
            // InternalThicket.g:552:2: rule__Sexpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesexpr"


    // $ANTLR start "entryRuleattr"
    // InternalThicket.g:564:1: entryRuleattr : ruleattr EOF ;
    public final void entryRuleattr() throws RecognitionException {
        try {
            // InternalThicket.g:565:1: ( ruleattr EOF )
            // InternalThicket.g:566:1: ruleattr EOF
            {
             before(grammarAccess.getAttrRule()); 
            pushFollow(FOLLOW_1);
            ruleattr();

            state._fsp--;

             after(grammarAccess.getAttrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleattr"


    // $ANTLR start "ruleattr"
    // InternalThicket.g:573:1: ruleattr : ( ( rule__Attr__Group__0 ) ) ;
    public final void ruleattr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:577:2: ( ( ( rule__Attr__Group__0 ) ) )
            // InternalThicket.g:578:1: ( ( rule__Attr__Group__0 ) )
            {
            // InternalThicket.g:578:1: ( ( rule__Attr__Group__0 ) )
            // InternalThicket.g:579:1: ( rule__Attr__Group__0 )
            {
             before(grammarAccess.getAttrAccess().getGroup()); 
            // InternalThicket.g:580:1: ( rule__Attr__Group__0 )
            // InternalThicket.g:580:2: rule__Attr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleattr"


    // $ANTLR start "entryRuleidentOrOp"
    // InternalThicket.g:592:1: entryRuleidentOrOp : ruleidentOrOp EOF ;
    public final void entryRuleidentOrOp() throws RecognitionException {
        try {
            // InternalThicket.g:593:1: ( ruleidentOrOp EOF )
            // InternalThicket.g:594:1: ruleidentOrOp EOF
            {
             before(grammarAccess.getIdentOrOpRule()); 
            pushFollow(FOLLOW_1);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getIdentOrOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleidentOrOp"


    // $ANTLR start "ruleidentOrOp"
    // InternalThicket.g:601:1: ruleidentOrOp : ( ( rule__IdentOrOp__Alternatives ) ) ;
    public final void ruleidentOrOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:605:2: ( ( ( rule__IdentOrOp__Alternatives ) ) )
            // InternalThicket.g:606:1: ( ( rule__IdentOrOp__Alternatives ) )
            {
            // InternalThicket.g:606:1: ( ( rule__IdentOrOp__Alternatives ) )
            // InternalThicket.g:607:1: ( rule__IdentOrOp__Alternatives )
            {
             before(grammarAccess.getIdentOrOpAccess().getAlternatives()); 
            // InternalThicket.g:608:1: ( rule__IdentOrOp__Alternatives )
            // InternalThicket.g:608:2: rule__IdentOrOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IdentOrOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentOrOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleidentOrOp"


    // $ANTLR start "rule__Imports__Alternatives"
    // InternalThicket.g:620:1: rule__Imports__Alternatives : ( ( ( rule__Imports__Group_0__0 ) ) | ( ( rule__Imports__Group_1__0 ) ) );
    public final void rule__Imports__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:624:1: ( ( ( rule__Imports__Group_0__0 ) ) | ( ( rule__Imports__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalThicket.g:625:1: ( ( rule__Imports__Group_0__0 ) )
                    {
                    // InternalThicket.g:625:1: ( ( rule__Imports__Group_0__0 ) )
                    // InternalThicket.g:626:1: ( rule__Imports__Group_0__0 )
                    {
                     before(grammarAccess.getImportsAccess().getGroup_0()); 
                    // InternalThicket.g:627:1: ( rule__Imports__Group_0__0 )
                    // InternalThicket.g:627:2: rule__Imports__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Imports__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:631:6: ( ( rule__Imports__Group_1__0 ) )
                    {
                    // InternalThicket.g:631:6: ( ( rule__Imports__Group_1__0 ) )
                    // InternalThicket.g:632:1: ( rule__Imports__Group_1__0 )
                    {
                     before(grammarAccess.getImportsAccess().getGroup_1()); 
                    // InternalThicket.g:633:1: ( rule__Imports__Group_1__0 )
                    // InternalThicket.g:633:2: rule__Imports__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Imports__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportsAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Alternatives"


    // $ANTLR start "rule__Imports__Alternatives_0_4"
    // InternalThicket.g:642:1: rule__Imports__Alternatives_0_4 : ( ( '*' ) | ( ( rule__Imports__Group_0_4_1__0 ) ) );
    public final void rule__Imports__Alternatives_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:646:1: ( ( '*' ) | ( ( rule__Imports__Group_0_4_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_IDENT||LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalThicket.g:647:1: ( '*' )
                    {
                    // InternalThicket.g:647:1: ( '*' )
                    // InternalThicket.g:648:1: '*'
                    {
                     before(grammarAccess.getImportsAccess().getAsteriskKeyword_0_4_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getImportsAccess().getAsteriskKeyword_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:655:6: ( ( rule__Imports__Group_0_4_1__0 ) )
                    {
                    // InternalThicket.g:655:6: ( ( rule__Imports__Group_0_4_1__0 ) )
                    // InternalThicket.g:656:1: ( rule__Imports__Group_0_4_1__0 )
                    {
                     before(grammarAccess.getImportsAccess().getGroup_0_4_1()); 
                    // InternalThicket.g:657:1: ( rule__Imports__Group_0_4_1__0 )
                    // InternalThicket.g:657:2: rule__Imports__Group_0_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Imports__Group_0_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportsAccess().getGroup_0_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Alternatives_0_4"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalThicket.g:666:1: rule__Entity__Alternatives : ( ( ruletypeDef ) | ( rulesortDef ) | ( ruleobjectDef ) | ( ruleexpressionDef ) | ( ruleclassDef ) | ( ruletraitDef ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:670:1: ( ( ruletypeDef ) | ( rulesortDef ) | ( ruleobjectDef ) | ( ruleexpressionDef ) | ( ruleclassDef ) | ( ruletraitDef ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 37:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalThicket.g:671:1: ( ruletypeDef )
                    {
                    // InternalThicket.g:671:1: ( ruletypeDef )
                    // InternalThicket.g:672:1: ruletypeDef
                    {
                     before(grammarAccess.getEntityAccess().getTypeDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruletypeDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getTypeDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:677:6: ( rulesortDef )
                    {
                    // InternalThicket.g:677:6: ( rulesortDef )
                    // InternalThicket.g:678:1: rulesortDef
                    {
                     before(grammarAccess.getEntityAccess().getSortDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulesortDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getSortDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThicket.g:683:6: ( ruleobjectDef )
                    {
                    // InternalThicket.g:683:6: ( ruleobjectDef )
                    // InternalThicket.g:684:1: ruleobjectDef
                    {
                     before(grammarAccess.getEntityAccess().getObjectDefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleobjectDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getObjectDefParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThicket.g:689:6: ( ruleexpressionDef )
                    {
                    // InternalThicket.g:689:6: ( ruleexpressionDef )
                    // InternalThicket.g:690:1: ruleexpressionDef
                    {
                     before(grammarAccess.getEntityAccess().getExpressionDefParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleexpressionDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getExpressionDefParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThicket.g:695:6: ( ruleclassDef )
                    {
                    // InternalThicket.g:695:6: ( ruleclassDef )
                    // InternalThicket.g:696:1: ruleclassDef
                    {
                     before(grammarAccess.getEntityAccess().getClassDefParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleclassDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getClassDefParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalThicket.g:701:6: ( ruletraitDef )
                    {
                    // InternalThicket.g:701:6: ( ruletraitDef )
                    // InternalThicket.g:702:1: ruletraitDef
                    {
                     before(grammarAccess.getEntityAccess().getTraitDefParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruletraitDef();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getTraitDefParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalThicket.g:712:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:716:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IDENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalThicket.g:717:1: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalThicket.g:717:1: ( ( rule__Type__Group_0__0 ) )
                    // InternalThicket.g:718:1: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalThicket.g:719:1: ( rule__Type__Group_0__0 )
                    // InternalThicket.g:719:2: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:723:6: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalThicket.g:723:6: ( ( rule__Type__Group_1__0 ) )
                    // InternalThicket.g:724:1: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalThicket.g:725:1: ( rule__Type__Group_1__0 )
                    // InternalThicket.g:725:2: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Types__Alternatives_1_0"
    // InternalThicket.g:734:1: rule__Types__Alternatives_1_0 : ( ( ',' ) | ( '->' ) );
    public final void rule__Types__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:738:1: ( ( ',' ) | ( '->' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalThicket.g:739:1: ( ',' )
                    {
                    // InternalThicket.g:739:1: ( ',' )
                    // InternalThicket.g:740:1: ','
                    {
                     before(grammarAccess.getTypesAccess().getCommaKeyword_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypesAccess().getCommaKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:747:6: ( '->' )
                    {
                    // InternalThicket.g:747:6: ( '->' )
                    // InternalThicket.g:748:1: '->'
                    {
                     before(grammarAccess.getTypesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypesAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Alternatives_1_0"


    // $ANTLR start "rule__ClassDef__Alternatives_5"
    // InternalThicket.g:760:1: rule__ClassDef__Alternatives_5 : ( ( ( rule__ClassDef__Group_5_0__0 ) ) | ( ruletparam ) );
    public final void rule__ClassDef__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:764:1: ( ( ( rule__ClassDef__Group_5_0__0 ) ) | ( ruletparam ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_IDENT||LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThicket.g:765:1: ( ( rule__ClassDef__Group_5_0__0 ) )
                    {
                    // InternalThicket.g:765:1: ( ( rule__ClassDef__Group_5_0__0 ) )
                    // InternalThicket.g:766:1: ( rule__ClassDef__Group_5_0__0 )
                    {
                     before(grammarAccess.getClassDefAccess().getGroup_5_0()); 
                    // InternalThicket.g:767:1: ( rule__ClassDef__Group_5_0__0 )
                    // InternalThicket.g:767:2: rule__ClassDef__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDef__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassDefAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:771:6: ( ruletparam )
                    {
                    // InternalThicket.g:771:6: ( ruletparam )
                    // InternalThicket.g:772:1: ruletparam
                    {
                     before(grammarAccess.getClassDefAccess().getTparamParserRuleCall_5_1()); 
                    pushFollow(FOLLOW_2);
                    ruletparam();

                    state._fsp--;

                     after(grammarAccess.getClassDefAccess().getTparamParserRuleCall_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Alternatives_5"


    // $ANTLR start "rule__TraitDef__Alternatives_4"
    // InternalThicket.g:782:1: rule__TraitDef__Alternatives_4 : ( ( ( rule__TraitDef__Group_4_0__0 ) ) | ( ruletparam ) );
    public final void rule__TraitDef__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:786:1: ( ( ( rule__TraitDef__Group_4_0__0 ) ) | ( ruletparam ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_IDENT||LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThicket.g:787:1: ( ( rule__TraitDef__Group_4_0__0 ) )
                    {
                    // InternalThicket.g:787:1: ( ( rule__TraitDef__Group_4_0__0 ) )
                    // InternalThicket.g:788:1: ( rule__TraitDef__Group_4_0__0 )
                    {
                     before(grammarAccess.getTraitDefAccess().getGroup_4_0()); 
                    // InternalThicket.g:789:1: ( rule__TraitDef__Group_4_0__0 )
                    // InternalThicket.g:789:2: rule__TraitDef__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TraitDef__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTraitDefAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:793:6: ( ruletparam )
                    {
                    // InternalThicket.g:793:6: ( ruletparam )
                    // InternalThicket.g:794:1: ruletparam
                    {
                     before(grammarAccess.getTraitDefAccess().getTparamParserRuleCall_4_1()); 
                    pushFollow(FOLLOW_2);
                    ruletparam();

                    state._fsp--;

                     after(grammarAccess.getTraitDefAccess().getTparamParserRuleCall_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Alternatives_4"


    // $ANTLR start "rule__Sexpr__Alternatives"
    // InternalThicket.g:804:1: rule__Sexpr__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_OP ) | ( RULE_DOLL ) | ( ( rule__Sexpr__Group_4__0 ) ) | ( ( rule__Sexpr__Group_5__0 ) ) | ( ( rule__Sexpr__Group_6__0 ) ) | ( ( rule__Sexpr__Group_7__0 ) ) | ( ( rule__Sexpr__Group_8__0 ) ) | ( ( rule__Sexpr__Group_9__0 ) ) | ( RULE_IDENT ) );
    public final void rule__Sexpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:808:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_OP ) | ( RULE_DOLL ) | ( ( rule__Sexpr__Group_4__0 ) ) | ( ( rule__Sexpr__Group_5__0 ) ) | ( ( rule__Sexpr__Group_6__0 ) ) | ( ( rule__Sexpr__Group_7__0 ) ) | ( ( rule__Sexpr__Group_8__0 ) ) | ( ( rule__Sexpr__Group_9__0 ) ) | ( RULE_IDENT ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_OP:
                {
                alt9=3;
                }
                break;
            case RULE_DOLL:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 40:
                {
                alt9=7;
                }
                break;
            case 43:
                {
                alt9=8;
                }
                break;
            case 47:
                {
                alt9=9;
                }
                break;
            case 49:
                {
                alt9=10;
                }
                break;
            case RULE_IDENT:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalThicket.g:809:1: ( RULE_INT )
                    {
                    // InternalThicket.g:809:1: ( RULE_INT )
                    // InternalThicket.g:810:1: RULE_INT
                    {
                     before(grammarAccess.getSexprAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:815:6: ( RULE_STRING )
                    {
                    // InternalThicket.g:815:6: ( RULE_STRING )
                    // InternalThicket.g:816:1: RULE_STRING
                    {
                     before(grammarAccess.getSexprAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThicket.g:821:6: ( RULE_OP )
                    {
                    // InternalThicket.g:821:6: ( RULE_OP )
                    // InternalThicket.g:822:1: RULE_OP
                    {
                     before(grammarAccess.getSexprAccess().getOPTerminalRuleCall_2()); 
                    match(input,RULE_OP,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getOPTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThicket.g:827:6: ( RULE_DOLL )
                    {
                    // InternalThicket.g:827:6: ( RULE_DOLL )
                    // InternalThicket.g:828:1: RULE_DOLL
                    {
                     before(grammarAccess.getSexprAccess().getDOLLTerminalRuleCall_3()); 
                    match(input,RULE_DOLL,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getDOLLTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThicket.g:833:6: ( ( rule__Sexpr__Group_4__0 ) )
                    {
                    // InternalThicket.g:833:6: ( ( rule__Sexpr__Group_4__0 ) )
                    // InternalThicket.g:834:1: ( rule__Sexpr__Group_4__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_4()); 
                    // InternalThicket.g:835:1: ( rule__Sexpr__Group_4__0 )
                    // InternalThicket.g:835:2: rule__Sexpr__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalThicket.g:839:6: ( ( rule__Sexpr__Group_5__0 ) )
                    {
                    // InternalThicket.g:839:6: ( ( rule__Sexpr__Group_5__0 ) )
                    // InternalThicket.g:840:1: ( rule__Sexpr__Group_5__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_5()); 
                    // InternalThicket.g:841:1: ( rule__Sexpr__Group_5__0 )
                    // InternalThicket.g:841:2: rule__Sexpr__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalThicket.g:845:6: ( ( rule__Sexpr__Group_6__0 ) )
                    {
                    // InternalThicket.g:845:6: ( ( rule__Sexpr__Group_6__0 ) )
                    // InternalThicket.g:846:1: ( rule__Sexpr__Group_6__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_6()); 
                    // InternalThicket.g:847:1: ( rule__Sexpr__Group_6__0 )
                    // InternalThicket.g:847:2: rule__Sexpr__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalThicket.g:851:6: ( ( rule__Sexpr__Group_7__0 ) )
                    {
                    // InternalThicket.g:851:6: ( ( rule__Sexpr__Group_7__0 ) )
                    // InternalThicket.g:852:1: ( rule__Sexpr__Group_7__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_7()); 
                    // InternalThicket.g:853:1: ( rule__Sexpr__Group_7__0 )
                    // InternalThicket.g:853:2: rule__Sexpr__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalThicket.g:857:6: ( ( rule__Sexpr__Group_8__0 ) )
                    {
                    // InternalThicket.g:857:6: ( ( rule__Sexpr__Group_8__0 ) )
                    // InternalThicket.g:858:1: ( rule__Sexpr__Group_8__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_8()); 
                    // InternalThicket.g:859:1: ( rule__Sexpr__Group_8__0 )
                    // InternalThicket.g:859:2: rule__Sexpr__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalThicket.g:863:6: ( ( rule__Sexpr__Group_9__0 ) )
                    {
                    // InternalThicket.g:863:6: ( ( rule__Sexpr__Group_9__0 ) )
                    // InternalThicket.g:864:1: ( rule__Sexpr__Group_9__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_9()); 
                    // InternalThicket.g:865:1: ( rule__Sexpr__Group_9__0 )
                    // InternalThicket.g:865:2: rule__Sexpr__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalThicket.g:869:6: ( RULE_IDENT )
                    {
                    // InternalThicket.g:869:6: ( RULE_IDENT )
                    // InternalThicket.g:870:1: RULE_IDENT
                    {
                     before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_10()); 
                    match(input,RULE_IDENT,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Alternatives"


    // $ANTLR start "rule__Sexpr__Alternatives_6_3"
    // InternalThicket.g:880:1: rule__Sexpr__Alternatives_6_3 : ( ( ( rule__Sexpr__Group_6_3_0__0 ) ) | ( '/>' ) );
    public final void rule__Sexpr__Alternatives_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:884:1: ( ( ( rule__Sexpr__Group_6_3_0__0 ) ) | ( '/>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==41) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalThicket.g:885:1: ( ( rule__Sexpr__Group_6_3_0__0 ) )
                    {
                    // InternalThicket.g:885:1: ( ( rule__Sexpr__Group_6_3_0__0 ) )
                    // InternalThicket.g:886:1: ( rule__Sexpr__Group_6_3_0__0 )
                    {
                     before(grammarAccess.getSexprAccess().getGroup_6_3_0()); 
                    // InternalThicket.g:887:1: ( rule__Sexpr__Group_6_3_0__0 )
                    // InternalThicket.g:887:2: rule__Sexpr__Group_6_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_6_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSexprAccess().getGroup_6_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:891:6: ( '/>' )
                    {
                    // InternalThicket.g:891:6: ( '/>' )
                    // InternalThicket.g:892:1: '/>'
                    {
                     before(grammarAccess.getSexprAccess().getSolidusGreaterThanSignKeyword_6_3_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSexprAccess().getSolidusGreaterThanSignKeyword_6_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Alternatives_6_3"


    // $ANTLR start "rule__IdentOrOp__Alternatives"
    // InternalThicket.g:904:1: rule__IdentOrOp__Alternatives : ( ( RULE_IDENT ) | ( ( rule__IdentOrOp__Group_1__0 ) ) );
    public final void rule__IdentOrOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:908:1: ( ( RULE_IDENT ) | ( ( rule__IdentOrOp__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalThicket.g:909:1: ( RULE_IDENT )
                    {
                    // InternalThicket.g:909:1: ( RULE_IDENT )
                    // InternalThicket.g:910:1: RULE_IDENT
                    {
                     before(grammarAccess.getIdentOrOpAccess().getIdentTerminalRuleCall_0()); 
                    match(input,RULE_IDENT,FOLLOW_2); 
                     after(grammarAccess.getIdentOrOpAccess().getIdentTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThicket.g:915:6: ( ( rule__IdentOrOp__Group_1__0 ) )
                    {
                    // InternalThicket.g:915:6: ( ( rule__IdentOrOp__Group_1__0 ) )
                    // InternalThicket.g:916:1: ( rule__IdentOrOp__Group_1__0 )
                    {
                     before(grammarAccess.getIdentOrOpAccess().getGroup_1()); 
                    // InternalThicket.g:917:1: ( rule__IdentOrOp__Group_1__0 )
                    // InternalThicket.g:917:2: rule__IdentOrOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IdentOrOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIdentOrOpAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalThicket.g:928:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:932:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalThicket.g:933:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalThicket.g:940:1: rule__Model__Group__0__Impl : ( 'module' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:944:1: ( ( 'module' ) )
            // InternalThicket.g:945:1: ( 'module' )
            {
            // InternalThicket.g:945:1: ( 'module' )
            // InternalThicket.g:946:1: 'module'
            {
             before(grammarAccess.getModelAccess().getModuleKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalThicket.g:959:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:963:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalThicket.g:964:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalThicket.g:971:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:975:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalThicket.g:976:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalThicket.g:976:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalThicket.g:977:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalThicket.g:978:1: ( rule__Model__NameAssignment_1 )
            // InternalThicket.g:978:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalThicket.g:988:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:992:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalThicket.g:993:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalThicket.g:1000:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1004:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // InternalThicket.g:1005:1: ( ( rule__Model__Group_2__0 )* )
            {
            // InternalThicket.g:1005:1: ( ( rule__Model__Group_2__0 )* )
            // InternalThicket.g:1006:1: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalThicket.g:1007:1: ( rule__Model__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalThicket.g:1007:2: rule__Model__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalThicket.g:1017:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1021:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalThicket.g:1022:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalThicket.g:1029:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1033:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalThicket.g:1034:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalThicket.g:1034:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalThicket.g:1035:1: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // InternalThicket.g:1036:1: ( rule__Model__ImportsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=22 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalThicket.g:1036:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalThicket.g:1046:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1050:1: ( rule__Model__Group__4__Impl )
            // InternalThicket.g:1051:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalThicket.g:1057:1: rule__Model__Group__4__Impl : ( ( rule__Model__EntitiesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1061:1: ( ( ( rule__Model__EntitiesAssignment_4 )* ) )
            // InternalThicket.g:1062:1: ( ( rule__Model__EntitiesAssignment_4 )* )
            {
            // InternalThicket.g:1062:1: ( ( rule__Model__EntitiesAssignment_4 )* )
            // InternalThicket.g:1063:1: ( rule__Model__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_4()); 
            // InternalThicket.g:1064:1: ( rule__Model__EntitiesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24||LA14_0==26||LA14_0==29||LA14_0==35||LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalThicket.g:1064:2: rule__Model__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalThicket.g:1084:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1088:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalThicket.g:1089:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalThicket.g:1096:1: rule__Model__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1100:1: ( ( '.' ) )
            // InternalThicket.g:1101:1: ( '.' )
            {
            // InternalThicket.g:1101:1: ( '.' )
            // InternalThicket.g:1102:1: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalThicket.g:1115:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1119:1: ( rule__Model__Group_2__1__Impl )
            // InternalThicket.g:1120:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalThicket.g:1126:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__NamesAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1130:1: ( ( ( rule__Model__NamesAssignment_2_1 ) ) )
            // InternalThicket.g:1131:1: ( ( rule__Model__NamesAssignment_2_1 ) )
            {
            // InternalThicket.g:1131:1: ( ( rule__Model__NamesAssignment_2_1 ) )
            // InternalThicket.g:1132:1: ( rule__Model__NamesAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getNamesAssignment_2_1()); 
            // InternalThicket.g:1133:1: ( rule__Model__NamesAssignment_2_1 )
            // InternalThicket.g:1133:2: rule__Model__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NamesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Imports__Group_0__0"
    // InternalThicket.g:1147:1: rule__Imports__Group_0__0 : rule__Imports__Group_0__0__Impl rule__Imports__Group_0__1 ;
    public final void rule__Imports__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1151:1: ( rule__Imports__Group_0__0__Impl rule__Imports__Group_0__1 )
            // InternalThicket.g:1152:2: rule__Imports__Group_0__0__Impl rule__Imports__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Imports__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__0"


    // $ANTLR start "rule__Imports__Group_0__0__Impl"
    // InternalThicket.g:1159:1: rule__Imports__Group_0__0__Impl : ( 'from' ) ;
    public final void rule__Imports__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1163:1: ( ( 'from' ) )
            // InternalThicket.g:1164:1: ( 'from' )
            {
            // InternalThicket.g:1164:1: ( 'from' )
            // InternalThicket.g:1165:1: 'from'
            {
             before(grammarAccess.getImportsAccess().getFromKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getFromKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__0__Impl"


    // $ANTLR start "rule__Imports__Group_0__1"
    // InternalThicket.g:1178:1: rule__Imports__Group_0__1 : rule__Imports__Group_0__1__Impl rule__Imports__Group_0__2 ;
    public final void rule__Imports__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1182:1: ( rule__Imports__Group_0__1__Impl rule__Imports__Group_0__2 )
            // InternalThicket.g:1183:2: rule__Imports__Group_0__1__Impl rule__Imports__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Imports__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__1"


    // $ANTLR start "rule__Imports__Group_0__1__Impl"
    // InternalThicket.g:1190:1: rule__Imports__Group_0__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Imports__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1194:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1195:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1195:1: ( RULE_IDENT )
            // InternalThicket.g:1196:1: RULE_IDENT
            {
             before(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_0_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__1__Impl"


    // $ANTLR start "rule__Imports__Group_0__2"
    // InternalThicket.g:1207:1: rule__Imports__Group_0__2 : rule__Imports__Group_0__2__Impl rule__Imports__Group_0__3 ;
    public final void rule__Imports__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1211:1: ( rule__Imports__Group_0__2__Impl rule__Imports__Group_0__3 )
            // InternalThicket.g:1212:2: rule__Imports__Group_0__2__Impl rule__Imports__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Imports__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__2"


    // $ANTLR start "rule__Imports__Group_0__2__Impl"
    // InternalThicket.g:1219:1: rule__Imports__Group_0__2__Impl : ( ( rule__Imports__Group_0_2__0 )* ) ;
    public final void rule__Imports__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1223:1: ( ( ( rule__Imports__Group_0_2__0 )* ) )
            // InternalThicket.g:1224:1: ( ( rule__Imports__Group_0_2__0 )* )
            {
            // InternalThicket.g:1224:1: ( ( rule__Imports__Group_0_2__0 )* )
            // InternalThicket.g:1225:1: ( rule__Imports__Group_0_2__0 )*
            {
             before(grammarAccess.getImportsAccess().getGroup_0_2()); 
            // InternalThicket.g:1226:1: ( rule__Imports__Group_0_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalThicket.g:1226:2: rule__Imports__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Imports__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getImportsAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__2__Impl"


    // $ANTLR start "rule__Imports__Group_0__3"
    // InternalThicket.g:1236:1: rule__Imports__Group_0__3 : rule__Imports__Group_0__3__Impl rule__Imports__Group_0__4 ;
    public final void rule__Imports__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1240:1: ( rule__Imports__Group_0__3__Impl rule__Imports__Group_0__4 )
            // InternalThicket.g:1241:2: rule__Imports__Group_0__3__Impl rule__Imports__Group_0__4
            {
            pushFollow(FOLLOW_9);
            rule__Imports__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__3"


    // $ANTLR start "rule__Imports__Group_0__3__Impl"
    // InternalThicket.g:1248:1: rule__Imports__Group_0__3__Impl : ( 'import' ) ;
    public final void rule__Imports__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1252:1: ( ( 'import' ) )
            // InternalThicket.g:1253:1: ( 'import' )
            {
            // InternalThicket.g:1253:1: ( 'import' )
            // InternalThicket.g:1254:1: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getImportKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__3__Impl"


    // $ANTLR start "rule__Imports__Group_0__4"
    // InternalThicket.g:1267:1: rule__Imports__Group_0__4 : rule__Imports__Group_0__4__Impl ;
    public final void rule__Imports__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1271:1: ( rule__Imports__Group_0__4__Impl )
            // InternalThicket.g:1272:2: rule__Imports__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__4"


    // $ANTLR start "rule__Imports__Group_0__4__Impl"
    // InternalThicket.g:1278:1: rule__Imports__Group_0__4__Impl : ( ( rule__Imports__Alternatives_0_4 ) ) ;
    public final void rule__Imports__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1282:1: ( ( ( rule__Imports__Alternatives_0_4 ) ) )
            // InternalThicket.g:1283:1: ( ( rule__Imports__Alternatives_0_4 ) )
            {
            // InternalThicket.g:1283:1: ( ( rule__Imports__Alternatives_0_4 ) )
            // InternalThicket.g:1284:1: ( rule__Imports__Alternatives_0_4 )
            {
             before(grammarAccess.getImportsAccess().getAlternatives_0_4()); 
            // InternalThicket.g:1285:1: ( rule__Imports__Alternatives_0_4 )
            // InternalThicket.g:1285:2: rule__Imports__Alternatives_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Alternatives_0_4();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getAlternatives_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0__4__Impl"


    // $ANTLR start "rule__Imports__Group_0_2__0"
    // InternalThicket.g:1305:1: rule__Imports__Group_0_2__0 : rule__Imports__Group_0_2__0__Impl rule__Imports__Group_0_2__1 ;
    public final void rule__Imports__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1309:1: ( rule__Imports__Group_0_2__0__Impl rule__Imports__Group_0_2__1 )
            // InternalThicket.g:1310:2: rule__Imports__Group_0_2__0__Impl rule__Imports__Group_0_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Imports__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_2__0"


    // $ANTLR start "rule__Imports__Group_0_2__0__Impl"
    // InternalThicket.g:1317:1: rule__Imports__Group_0_2__0__Impl : ( '.' ) ;
    public final void rule__Imports__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1321:1: ( ( '.' ) )
            // InternalThicket.g:1322:1: ( '.' )
            {
            // InternalThicket.g:1322:1: ( '.' )
            // InternalThicket.g:1323:1: '.'
            {
             before(grammarAccess.getImportsAccess().getFullStopKeyword_0_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getFullStopKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_2__0__Impl"


    // $ANTLR start "rule__Imports__Group_0_2__1"
    // InternalThicket.g:1336:1: rule__Imports__Group_0_2__1 : rule__Imports__Group_0_2__1__Impl ;
    public final void rule__Imports__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1340:1: ( rule__Imports__Group_0_2__1__Impl )
            // InternalThicket.g:1341:2: rule__Imports__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_2__1"


    // $ANTLR start "rule__Imports__Group_0_2__1__Impl"
    // InternalThicket.g:1347:1: rule__Imports__Group_0_2__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Imports__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1351:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1352:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1352:1: ( RULE_IDENT )
            // InternalThicket.g:1353:1: RULE_IDENT
            {
             before(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_0_2_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_2__1__Impl"


    // $ANTLR start "rule__Imports__Group_0_4_1__0"
    // InternalThicket.g:1368:1: rule__Imports__Group_0_4_1__0 : rule__Imports__Group_0_4_1__0__Impl rule__Imports__Group_0_4_1__1 ;
    public final void rule__Imports__Group_0_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1372:1: ( rule__Imports__Group_0_4_1__0__Impl rule__Imports__Group_0_4_1__1 )
            // InternalThicket.g:1373:2: rule__Imports__Group_0_4_1__0__Impl rule__Imports__Group_0_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Imports__Group_0_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1__0"


    // $ANTLR start "rule__Imports__Group_0_4_1__0__Impl"
    // InternalThicket.g:1380:1: rule__Imports__Group_0_4_1__0__Impl : ( ruleidentOrOp ) ;
    public final void rule__Imports__Group_0_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1384:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:1385:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:1385:1: ( ruleidentOrOp )
            // InternalThicket.g:1386:1: ruleidentOrOp
            {
             before(grammarAccess.getImportsAccess().getIdentOrOpParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getIdentOrOpParserRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1__0__Impl"


    // $ANTLR start "rule__Imports__Group_0_4_1__1"
    // InternalThicket.g:1397:1: rule__Imports__Group_0_4_1__1 : rule__Imports__Group_0_4_1__1__Impl ;
    public final void rule__Imports__Group_0_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1401:1: ( rule__Imports__Group_0_4_1__1__Impl )
            // InternalThicket.g:1402:2: rule__Imports__Group_0_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1__1"


    // $ANTLR start "rule__Imports__Group_0_4_1__1__Impl"
    // InternalThicket.g:1408:1: rule__Imports__Group_0_4_1__1__Impl : ( ( ( rule__Imports__Group_0_4_1_1__0 ) ) ( ( rule__Imports__Group_0_4_1_1__0 )* ) ) ;
    public final void rule__Imports__Group_0_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1412:1: ( ( ( ( rule__Imports__Group_0_4_1_1__0 ) ) ( ( rule__Imports__Group_0_4_1_1__0 )* ) ) )
            // InternalThicket.g:1413:1: ( ( ( rule__Imports__Group_0_4_1_1__0 ) ) ( ( rule__Imports__Group_0_4_1_1__0 )* ) )
            {
            // InternalThicket.g:1413:1: ( ( ( rule__Imports__Group_0_4_1_1__0 ) ) ( ( rule__Imports__Group_0_4_1_1__0 )* ) )
            // InternalThicket.g:1414:1: ( ( rule__Imports__Group_0_4_1_1__0 ) ) ( ( rule__Imports__Group_0_4_1_1__0 )* )
            {
            // InternalThicket.g:1414:1: ( ( rule__Imports__Group_0_4_1_1__0 ) )
            // InternalThicket.g:1415:1: ( rule__Imports__Group_0_4_1_1__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup_0_4_1_1()); 
            // InternalThicket.g:1416:1: ( rule__Imports__Group_0_4_1_1__0 )
            // InternalThicket.g:1416:2: rule__Imports__Group_0_4_1_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Imports__Group_0_4_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup_0_4_1_1()); 

            }

            // InternalThicket.g:1419:1: ( ( rule__Imports__Group_0_4_1_1__0 )* )
            // InternalThicket.g:1420:1: ( rule__Imports__Group_0_4_1_1__0 )*
            {
             before(grammarAccess.getImportsAccess().getGroup_0_4_1_1()); 
            // InternalThicket.g:1421:1: ( rule__Imports__Group_0_4_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalThicket.g:1421:2: rule__Imports__Group_0_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Imports__Group_0_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getImportsAccess().getGroup_0_4_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1__1__Impl"


    // $ANTLR start "rule__Imports__Group_0_4_1_1__0"
    // InternalThicket.g:1436:1: rule__Imports__Group_0_4_1_1__0 : rule__Imports__Group_0_4_1_1__0__Impl rule__Imports__Group_0_4_1_1__1 ;
    public final void rule__Imports__Group_0_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1440:1: ( rule__Imports__Group_0_4_1_1__0__Impl rule__Imports__Group_0_4_1_1__1 )
            // InternalThicket.g:1441:2: rule__Imports__Group_0_4_1_1__0__Impl rule__Imports__Group_0_4_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Imports__Group_0_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1_1__0"


    // $ANTLR start "rule__Imports__Group_0_4_1_1__0__Impl"
    // InternalThicket.g:1448:1: rule__Imports__Group_0_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__Imports__Group_0_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1452:1: ( ( ',' ) )
            // InternalThicket.g:1453:1: ( ',' )
            {
            // InternalThicket.g:1453:1: ( ',' )
            // InternalThicket.g:1454:1: ','
            {
             before(grammarAccess.getImportsAccess().getCommaKeyword_0_4_1_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getCommaKeyword_0_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1_1__0__Impl"


    // $ANTLR start "rule__Imports__Group_0_4_1_1__1"
    // InternalThicket.g:1467:1: rule__Imports__Group_0_4_1_1__1 : rule__Imports__Group_0_4_1_1__1__Impl ;
    public final void rule__Imports__Group_0_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1471:1: ( rule__Imports__Group_0_4_1_1__1__Impl )
            // InternalThicket.g:1472:2: rule__Imports__Group_0_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_0_4_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1_1__1"


    // $ANTLR start "rule__Imports__Group_0_4_1_1__1__Impl"
    // InternalThicket.g:1478:1: rule__Imports__Group_0_4_1_1__1__Impl : ( ruleidentOrOp ) ;
    public final void rule__Imports__Group_0_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1482:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:1483:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:1483:1: ( ruleidentOrOp )
            // InternalThicket.g:1484:1: ruleidentOrOp
            {
             before(grammarAccess.getImportsAccess().getIdentOrOpParserRuleCall_0_4_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getIdentOrOpParserRuleCall_0_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_0_4_1_1__1__Impl"


    // $ANTLR start "rule__Imports__Group_1__0"
    // InternalThicket.g:1499:1: rule__Imports__Group_1__0 : rule__Imports__Group_1__0__Impl rule__Imports__Group_1__1 ;
    public final void rule__Imports__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1503:1: ( rule__Imports__Group_1__0__Impl rule__Imports__Group_1__1 )
            // InternalThicket.g:1504:2: rule__Imports__Group_1__0__Impl rule__Imports__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Imports__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__0"


    // $ANTLR start "rule__Imports__Group_1__0__Impl"
    // InternalThicket.g:1511:1: rule__Imports__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1515:1: ( ( 'import' ) )
            // InternalThicket.g:1516:1: ( 'import' )
            {
            // InternalThicket.g:1516:1: ( 'import' )
            // InternalThicket.g:1517:1: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getImportKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__0__Impl"


    // $ANTLR start "rule__Imports__Group_1__1"
    // InternalThicket.g:1530:1: rule__Imports__Group_1__1 : rule__Imports__Group_1__1__Impl rule__Imports__Group_1__2 ;
    public final void rule__Imports__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1534:1: ( rule__Imports__Group_1__1__Impl rule__Imports__Group_1__2 )
            // InternalThicket.g:1535:2: rule__Imports__Group_1__1__Impl rule__Imports__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Imports__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__1"


    // $ANTLR start "rule__Imports__Group_1__1__Impl"
    // InternalThicket.g:1542:1: rule__Imports__Group_1__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Imports__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1546:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1547:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1547:1: ( RULE_IDENT )
            // InternalThicket.g:1548:1: RULE_IDENT
            {
             before(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_1_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__1__Impl"


    // $ANTLR start "rule__Imports__Group_1__2"
    // InternalThicket.g:1559:1: rule__Imports__Group_1__2 : rule__Imports__Group_1__2__Impl ;
    public final void rule__Imports__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1563:1: ( rule__Imports__Group_1__2__Impl )
            // InternalThicket.g:1564:2: rule__Imports__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__2"


    // $ANTLR start "rule__Imports__Group_1__2__Impl"
    // InternalThicket.g:1570:1: rule__Imports__Group_1__2__Impl : ( ( rule__Imports__Group_1_2__0 )* ) ;
    public final void rule__Imports__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1574:1: ( ( ( rule__Imports__Group_1_2__0 )* ) )
            // InternalThicket.g:1575:1: ( ( rule__Imports__Group_1_2__0 )* )
            {
            // InternalThicket.g:1575:1: ( ( rule__Imports__Group_1_2__0 )* )
            // InternalThicket.g:1576:1: ( rule__Imports__Group_1_2__0 )*
            {
             before(grammarAccess.getImportsAccess().getGroup_1_2()); 
            // InternalThicket.g:1577:1: ( rule__Imports__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThicket.g:1577:2: rule__Imports__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Imports__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getImportsAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1__2__Impl"


    // $ANTLR start "rule__Imports__Group_1_2__0"
    // InternalThicket.g:1593:1: rule__Imports__Group_1_2__0 : rule__Imports__Group_1_2__0__Impl rule__Imports__Group_1_2__1 ;
    public final void rule__Imports__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1597:1: ( rule__Imports__Group_1_2__0__Impl rule__Imports__Group_1_2__1 )
            // InternalThicket.g:1598:2: rule__Imports__Group_1_2__0__Impl rule__Imports__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Imports__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1_2__0"


    // $ANTLR start "rule__Imports__Group_1_2__0__Impl"
    // InternalThicket.g:1605:1: rule__Imports__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__Imports__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1609:1: ( ( '.' ) )
            // InternalThicket.g:1610:1: ( '.' )
            {
            // InternalThicket.g:1610:1: ( '.' )
            // InternalThicket.g:1611:1: '.'
            {
             before(grammarAccess.getImportsAccess().getFullStopKeyword_1_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getFullStopKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1_2__0__Impl"


    // $ANTLR start "rule__Imports__Group_1_2__1"
    // InternalThicket.g:1624:1: rule__Imports__Group_1_2__1 : rule__Imports__Group_1_2__1__Impl ;
    public final void rule__Imports__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1628:1: ( rule__Imports__Group_1_2__1__Impl )
            // InternalThicket.g:1629:2: rule__Imports__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1_2__1"


    // $ANTLR start "rule__Imports__Group_1_2__1__Impl"
    // InternalThicket.g:1635:1: rule__Imports__Group_1_2__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Imports__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1639:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1640:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1640:1: ( RULE_IDENT )
            // InternalThicket.g:1641:1: RULE_IDENT
            {
             before(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_1_2_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getIdentTerminalRuleCall_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group_1_2__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalThicket.g:1656:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1660:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalThicket.g:1661:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalThicket.g:1668:1: rule__TypeDef__Group__0__Impl : ( 'typedef' ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1672:1: ( ( 'typedef' ) )
            // InternalThicket.g:1673:1: ( 'typedef' )
            {
            // InternalThicket.g:1673:1: ( 'typedef' )
            // InternalThicket.g:1674:1: 'typedef'
            {
             before(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getTypedefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalThicket.g:1687:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1691:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // InternalThicket.g:1692:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalThicket.g:1699:1: rule__TypeDef__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1703:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1704:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1704:1: ( RULE_IDENT )
            // InternalThicket.g:1705:1: RULE_IDENT
            {
             before(grammarAccess.getTypeDefAccess().getIdentTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getIdentTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // InternalThicket.g:1716:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1720:1: ( rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 )
            // InternalThicket.g:1721:2: rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // InternalThicket.g:1728:1: rule__TypeDef__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1732:1: ( ( rulegenerics ) )
            // InternalThicket.g:1733:1: ( rulegenerics )
            {
            // InternalThicket.g:1733:1: ( rulegenerics )
            // InternalThicket.g:1734:1: rulegenerics
            {
             before(grammarAccess.getTypeDefAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__3"
    // InternalThicket.g:1745:1: rule__TypeDef__Group__3 : rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 ;
    public final void rule__TypeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1749:1: ( rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 )
            // InternalThicket.g:1750:2: rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__TypeDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__3"


    // $ANTLR start "rule__TypeDef__Group__3__Impl"
    // InternalThicket.g:1757:1: rule__TypeDef__Group__3__Impl : ( '=' ) ;
    public final void rule__TypeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1761:1: ( ( '=' ) )
            // InternalThicket.g:1762:1: ( '=' )
            {
            // InternalThicket.g:1762:1: ( '=' )
            // InternalThicket.g:1763:1: '='
            {
             before(grammarAccess.getTypeDefAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__3__Impl"


    // $ANTLR start "rule__TypeDef__Group__4"
    // InternalThicket.g:1776:1: rule__TypeDef__Group__4 : rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5 ;
    public final void rule__TypeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1780:1: ( rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5 )
            // InternalThicket.g:1781:2: rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__TypeDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__4"


    // $ANTLR start "rule__TypeDef__Group__4__Impl"
    // InternalThicket.g:1788:1: rule__TypeDef__Group__4__Impl : ( rulegenerics ) ;
    public final void rule__TypeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1792:1: ( ( rulegenerics ) )
            // InternalThicket.g:1793:1: ( rulegenerics )
            {
            // InternalThicket.g:1793:1: ( rulegenerics )
            // InternalThicket.g:1794:1: rulegenerics
            {
             before(grammarAccess.getTypeDefAccess().getGenericsParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getGenericsParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__4__Impl"


    // $ANTLR start "rule__TypeDef__Group__5"
    // InternalThicket.g:1805:1: rule__TypeDef__Group__5 : rule__TypeDef__Group__5__Impl ;
    public final void rule__TypeDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1809:1: ( rule__TypeDef__Group__5__Impl )
            // InternalThicket.g:1810:2: rule__TypeDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__5"


    // $ANTLR start "rule__TypeDef__Group__5__Impl"
    // InternalThicket.g:1816:1: rule__TypeDef__Group__5__Impl : ( ruletypes ) ;
    public final void rule__TypeDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1820:1: ( ( ruletypes ) )
            // InternalThicket.g:1821:1: ( ruletypes )
            {
            // InternalThicket.g:1821:1: ( ruletypes )
            // InternalThicket.g:1822:1: ruletypes
            {
             before(grammarAccess.getTypeDefAccess().getTypesParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getTypesParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__5__Impl"


    // $ANTLR start "rule__SortDef__Group__0"
    // InternalThicket.g:1845:1: rule__SortDef__Group__0 : rule__SortDef__Group__0__Impl rule__SortDef__Group__1 ;
    public final void rule__SortDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1849:1: ( rule__SortDef__Group__0__Impl rule__SortDef__Group__1 )
            // InternalThicket.g:1850:2: rule__SortDef__Group__0__Impl rule__SortDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SortDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__0"


    // $ANTLR start "rule__SortDef__Group__0__Impl"
    // InternalThicket.g:1857:1: rule__SortDef__Group__0__Impl : ( 'type' ) ;
    public final void rule__SortDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1861:1: ( ( 'type' ) )
            // InternalThicket.g:1862:1: ( 'type' )
            {
            // InternalThicket.g:1862:1: ( 'type' )
            // InternalThicket.g:1863:1: 'type'
            {
             before(grammarAccess.getSortDefAccess().getTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__0__Impl"


    // $ANTLR start "rule__SortDef__Group__1"
    // InternalThicket.g:1876:1: rule__SortDef__Group__1 : rule__SortDef__Group__1__Impl rule__SortDef__Group__2 ;
    public final void rule__SortDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1880:1: ( rule__SortDef__Group__1__Impl rule__SortDef__Group__2 )
            // InternalThicket.g:1881:2: rule__SortDef__Group__1__Impl rule__SortDef__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SortDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__1"


    // $ANTLR start "rule__SortDef__Group__1__Impl"
    // InternalThicket.g:1888:1: rule__SortDef__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__SortDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1892:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:1893:1: ( RULE_IDENT )
            {
            // InternalThicket.g:1893:1: ( RULE_IDENT )
            // InternalThicket.g:1894:1: RULE_IDENT
            {
             before(grammarAccess.getSortDefAccess().getIdentTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getIdentTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__1__Impl"


    // $ANTLR start "rule__SortDef__Group__2"
    // InternalThicket.g:1905:1: rule__SortDef__Group__2 : rule__SortDef__Group__2__Impl rule__SortDef__Group__3 ;
    public final void rule__SortDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1909:1: ( rule__SortDef__Group__2__Impl rule__SortDef__Group__3 )
            // InternalThicket.g:1910:2: rule__SortDef__Group__2__Impl rule__SortDef__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SortDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__2"


    // $ANTLR start "rule__SortDef__Group__2__Impl"
    // InternalThicket.g:1917:1: rule__SortDef__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__SortDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1921:1: ( ( rulegenerics ) )
            // InternalThicket.g:1922:1: ( rulegenerics )
            {
            // InternalThicket.g:1922:1: ( rulegenerics )
            // InternalThicket.g:1923:1: rulegenerics
            {
             before(grammarAccess.getSortDefAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getSortDefAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__2__Impl"


    // $ANTLR start "rule__SortDef__Group__3"
    // InternalThicket.g:1934:1: rule__SortDef__Group__3 : rule__SortDef__Group__3__Impl rule__SortDef__Group__4 ;
    public final void rule__SortDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1938:1: ( rule__SortDef__Group__3__Impl rule__SortDef__Group__4 )
            // InternalThicket.g:1939:2: rule__SortDef__Group__3__Impl rule__SortDef__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__SortDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__3"


    // $ANTLR start "rule__SortDef__Group__3__Impl"
    // InternalThicket.g:1946:1: rule__SortDef__Group__3__Impl : ( '{' ) ;
    public final void rule__SortDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1950:1: ( ( '{' ) )
            // InternalThicket.g:1951:1: ( '{' )
            {
            // InternalThicket.g:1951:1: ( '{' )
            // InternalThicket.g:1952:1: '{'
            {
             before(grammarAccess.getSortDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__3__Impl"


    // $ANTLR start "rule__SortDef__Group__4"
    // InternalThicket.g:1965:1: rule__SortDef__Group__4 : rule__SortDef__Group__4__Impl rule__SortDef__Group__5 ;
    public final void rule__SortDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1969:1: ( rule__SortDef__Group__4__Impl rule__SortDef__Group__5 )
            // InternalThicket.g:1970:2: rule__SortDef__Group__4__Impl rule__SortDef__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__SortDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__4"


    // $ANTLR start "rule__SortDef__Group__4__Impl"
    // InternalThicket.g:1977:1: rule__SortDef__Group__4__Impl : ( ( ( rule__SortDef__Group_4__0 ) ) ( ( rule__SortDef__Group_4__0 )* ) ) ;
    public final void rule__SortDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:1981:1: ( ( ( ( rule__SortDef__Group_4__0 ) ) ( ( rule__SortDef__Group_4__0 )* ) ) )
            // InternalThicket.g:1982:1: ( ( ( rule__SortDef__Group_4__0 ) ) ( ( rule__SortDef__Group_4__0 )* ) )
            {
            // InternalThicket.g:1982:1: ( ( ( rule__SortDef__Group_4__0 ) ) ( ( rule__SortDef__Group_4__0 )* ) )
            // InternalThicket.g:1983:1: ( ( rule__SortDef__Group_4__0 ) ) ( ( rule__SortDef__Group_4__0 )* )
            {
            // InternalThicket.g:1983:1: ( ( rule__SortDef__Group_4__0 ) )
            // InternalThicket.g:1984:1: ( rule__SortDef__Group_4__0 )
            {
             before(grammarAccess.getSortDefAccess().getGroup_4()); 
            // InternalThicket.g:1985:1: ( rule__SortDef__Group_4__0 )
            // InternalThicket.g:1985:2: rule__SortDef__Group_4__0
            {
            pushFollow(FOLLOW_19);
            rule__SortDef__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getSortDefAccess().getGroup_4()); 

            }

            // InternalThicket.g:1988:1: ( ( rule__SortDef__Group_4__0 )* )
            // InternalThicket.g:1989:1: ( rule__SortDef__Group_4__0 )*
            {
             before(grammarAccess.getSortDefAccess().getGroup_4()); 
            // InternalThicket.g:1990:1: ( rule__SortDef__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_IDENT||LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalThicket.g:1990:2: rule__SortDef__Group_4__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SortDef__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSortDefAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__4__Impl"


    // $ANTLR start "rule__SortDef__Group__5"
    // InternalThicket.g:2001:1: rule__SortDef__Group__5 : rule__SortDef__Group__5__Impl ;
    public final void rule__SortDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2005:1: ( rule__SortDef__Group__5__Impl )
            // InternalThicket.g:2006:2: rule__SortDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__5"


    // $ANTLR start "rule__SortDef__Group__5__Impl"
    // InternalThicket.g:2012:1: rule__SortDef__Group__5__Impl : ( '}' ) ;
    public final void rule__SortDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2016:1: ( ( '}' ) )
            // InternalThicket.g:2017:1: ( '}' )
            {
            // InternalThicket.g:2017:1: ( '}' )
            // InternalThicket.g:2018:1: '}'
            {
             before(grammarAccess.getSortDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group__5__Impl"


    // $ANTLR start "rule__SortDef__Group_4__0"
    // InternalThicket.g:2043:1: rule__SortDef__Group_4__0 : rule__SortDef__Group_4__0__Impl rule__SortDef__Group_4__1 ;
    public final void rule__SortDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2047:1: ( rule__SortDef__Group_4__0__Impl rule__SortDef__Group_4__1 )
            // InternalThicket.g:2048:2: rule__SortDef__Group_4__0__Impl rule__SortDef__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__SortDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__0"


    // $ANTLR start "rule__SortDef__Group_4__0__Impl"
    // InternalThicket.g:2055:1: rule__SortDef__Group_4__0__Impl : ( ( 'model' )? ) ;
    public final void rule__SortDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2059:1: ( ( ( 'model' )? ) )
            // InternalThicket.g:2060:1: ( ( 'model' )? )
            {
            // InternalThicket.g:2060:1: ( ( 'model' )? )
            // InternalThicket.g:2061:1: ( 'model' )?
            {
             before(grammarAccess.getSortDefAccess().getModelKeyword_4_0()); 
            // InternalThicket.g:2062:1: ( 'model' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThicket.g:2063:2: 'model'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSortDefAccess().getModelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__0__Impl"


    // $ANTLR start "rule__SortDef__Group_4__1"
    // InternalThicket.g:2074:1: rule__SortDef__Group_4__1 : rule__SortDef__Group_4__1__Impl rule__SortDef__Group_4__2 ;
    public final void rule__SortDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2078:1: ( rule__SortDef__Group_4__1__Impl rule__SortDef__Group_4__2 )
            // InternalThicket.g:2079:2: rule__SortDef__Group_4__1__Impl rule__SortDef__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__SortDef__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__1"


    // $ANTLR start "rule__SortDef__Group_4__1__Impl"
    // InternalThicket.g:2086:1: rule__SortDef__Group_4__1__Impl : ( RULE_IDENT ) ;
    public final void rule__SortDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2090:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:2091:1: ( RULE_IDENT )
            {
            // InternalThicket.g:2091:1: ( RULE_IDENT )
            // InternalThicket.g:2092:1: RULE_IDENT
            {
             before(grammarAccess.getSortDefAccess().getIdentTerminalRuleCall_4_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getIdentTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__1__Impl"


    // $ANTLR start "rule__SortDef__Group_4__2"
    // InternalThicket.g:2103:1: rule__SortDef__Group_4__2 : rule__SortDef__Group_4__2__Impl ;
    public final void rule__SortDef__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2107:1: ( rule__SortDef__Group_4__2__Impl )
            // InternalThicket.g:2108:2: rule__SortDef__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__2"


    // $ANTLR start "rule__SortDef__Group_4__2__Impl"
    // InternalThicket.g:2114:1: rule__SortDef__Group_4__2__Impl : ( ( rule__SortDef__Group_4_2__0 )? ) ;
    public final void rule__SortDef__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2118:1: ( ( ( rule__SortDef__Group_4_2__0 )? ) )
            // InternalThicket.g:2119:1: ( ( rule__SortDef__Group_4_2__0 )? )
            {
            // InternalThicket.g:2119:1: ( ( rule__SortDef__Group_4_2__0 )? )
            // InternalThicket.g:2120:1: ( rule__SortDef__Group_4_2__0 )?
            {
             before(grammarAccess.getSortDefAccess().getGroup_4_2()); 
            // InternalThicket.g:2121:1: ( rule__SortDef__Group_4_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalThicket.g:2121:2: rule__SortDef__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SortDef__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSortDefAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4__2__Impl"


    // $ANTLR start "rule__SortDef__Group_4_2__0"
    // InternalThicket.g:2137:1: rule__SortDef__Group_4_2__0 : rule__SortDef__Group_4_2__0__Impl rule__SortDef__Group_4_2__1 ;
    public final void rule__SortDef__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2141:1: ( rule__SortDef__Group_4_2__0__Impl rule__SortDef__Group_4_2__1 )
            // InternalThicket.g:2142:2: rule__SortDef__Group_4_2__0__Impl rule__SortDef__Group_4_2__1
            {
            pushFollow(FOLLOW_20);
            rule__SortDef__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__0"


    // $ANTLR start "rule__SortDef__Group_4_2__0__Impl"
    // InternalThicket.g:2149:1: rule__SortDef__Group_4_2__0__Impl : ( '{' ) ;
    public final void rule__SortDef__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2153:1: ( ( '{' ) )
            // InternalThicket.g:2154:1: ( '{' )
            {
            // InternalThicket.g:2154:1: ( '{' )
            // InternalThicket.g:2155:1: '{'
            {
             before(grammarAccess.getSortDefAccess().getLeftCurlyBracketKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getLeftCurlyBracketKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__0__Impl"


    // $ANTLR start "rule__SortDef__Group_4_2__1"
    // InternalThicket.g:2168:1: rule__SortDef__Group_4_2__1 : rule__SortDef__Group_4_2__1__Impl rule__SortDef__Group_4_2__2 ;
    public final void rule__SortDef__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2172:1: ( rule__SortDef__Group_4_2__1__Impl rule__SortDef__Group_4_2__2 )
            // InternalThicket.g:2173:2: rule__SortDef__Group_4_2__1__Impl rule__SortDef__Group_4_2__2
            {
            pushFollow(FOLLOW_20);
            rule__SortDef__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__1"


    // $ANTLR start "rule__SortDef__Group_4_2__1__Impl"
    // InternalThicket.g:2180:1: rule__SortDef__Group_4_2__1__Impl : ( ( ruletparam )* ) ;
    public final void rule__SortDef__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2184:1: ( ( ( ruletparam )* ) )
            // InternalThicket.g:2185:1: ( ( ruletparam )* )
            {
            // InternalThicket.g:2185:1: ( ( ruletparam )* )
            // InternalThicket.g:2186:1: ( ruletparam )*
            {
             before(grammarAccess.getSortDefAccess().getTparamParserRuleCall_4_2_1()); 
            // InternalThicket.g:2187:1: ( ruletparam )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_IDENT||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalThicket.g:2187:3: ruletparam
            	    {
            	    pushFollow(FOLLOW_21);
            	    ruletparam();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSortDefAccess().getTparamParserRuleCall_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__1__Impl"


    // $ANTLR start "rule__SortDef__Group_4_2__2"
    // InternalThicket.g:2197:1: rule__SortDef__Group_4_2__2 : rule__SortDef__Group_4_2__2__Impl ;
    public final void rule__SortDef__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2201:1: ( rule__SortDef__Group_4_2__2__Impl )
            // InternalThicket.g:2202:2: rule__SortDef__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortDef__Group_4_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__2"


    // $ANTLR start "rule__SortDef__Group_4_2__2__Impl"
    // InternalThicket.g:2208:1: rule__SortDef__Group_4_2__2__Impl : ( '}' ) ;
    public final void rule__SortDef__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2212:1: ( ( '}' ) )
            // InternalThicket.g:2213:1: ( '}' )
            {
            // InternalThicket.g:2213:1: ( '}' )
            // InternalThicket.g:2214:1: '}'
            {
             before(grammarAccess.getSortDefAccess().getRightCurlyBracketKeyword_4_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSortDefAccess().getRightCurlyBracketKeyword_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDef__Group_4_2__2__Impl"


    // $ANTLR start "rule__ObjectDef__Group__0"
    // InternalThicket.g:2233:1: rule__ObjectDef__Group__0 : rule__ObjectDef__Group__0__Impl rule__ObjectDef__Group__1 ;
    public final void rule__ObjectDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2237:1: ( rule__ObjectDef__Group__0__Impl rule__ObjectDef__Group__1 )
            // InternalThicket.g:2238:2: rule__ObjectDef__Group__0__Impl rule__ObjectDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjectDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__0"


    // $ANTLR start "rule__ObjectDef__Group__0__Impl"
    // InternalThicket.g:2245:1: rule__ObjectDef__Group__0__Impl : ( 'model' ) ;
    public final void rule__ObjectDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2249:1: ( ( 'model' ) )
            // InternalThicket.g:2250:1: ( 'model' )
            {
            // InternalThicket.g:2250:1: ( 'model' )
            // InternalThicket.g:2251:1: 'model'
            {
             before(grammarAccess.getObjectDefAccess().getModelKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjectDefAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__0__Impl"


    // $ANTLR start "rule__ObjectDef__Group__1"
    // InternalThicket.g:2264:1: rule__ObjectDef__Group__1 : rule__ObjectDef__Group__1__Impl rule__ObjectDef__Group__2 ;
    public final void rule__ObjectDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2268:1: ( rule__ObjectDef__Group__1__Impl rule__ObjectDef__Group__2 )
            // InternalThicket.g:2269:2: rule__ObjectDef__Group__1__Impl rule__ObjectDef__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ObjectDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__1"


    // $ANTLR start "rule__ObjectDef__Group__1__Impl"
    // InternalThicket.g:2276:1: rule__ObjectDef__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__ObjectDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2280:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:2281:1: ( RULE_IDENT )
            {
            // InternalThicket.g:2281:1: ( RULE_IDENT )
            // InternalThicket.g:2282:1: RULE_IDENT
            {
             before(grammarAccess.getObjectDefAccess().getIdentTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getObjectDefAccess().getIdentTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__1__Impl"


    // $ANTLR start "rule__ObjectDef__Group__2"
    // InternalThicket.g:2293:1: rule__ObjectDef__Group__2 : rule__ObjectDef__Group__2__Impl rule__ObjectDef__Group__3 ;
    public final void rule__ObjectDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2297:1: ( rule__ObjectDef__Group__2__Impl rule__ObjectDef__Group__3 )
            // InternalThicket.g:2298:2: rule__ObjectDef__Group__2__Impl rule__ObjectDef__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ObjectDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__2"


    // $ANTLR start "rule__ObjectDef__Group__2__Impl"
    // InternalThicket.g:2305:1: rule__ObjectDef__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__ObjectDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2309:1: ( ( rulegenerics ) )
            // InternalThicket.g:2310:1: ( rulegenerics )
            {
            // InternalThicket.g:2310:1: ( rulegenerics )
            // InternalThicket.g:2311:1: rulegenerics
            {
             before(grammarAccess.getObjectDefAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getObjectDefAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__2__Impl"


    // $ANTLR start "rule__ObjectDef__Group__3"
    // InternalThicket.g:2322:1: rule__ObjectDef__Group__3 : rule__ObjectDef__Group__3__Impl ;
    public final void rule__ObjectDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2326:1: ( rule__ObjectDef__Group__3__Impl )
            // InternalThicket.g:2327:2: rule__ObjectDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__3"


    // $ANTLR start "rule__ObjectDef__Group__3__Impl"
    // InternalThicket.g:2333:1: rule__ObjectDef__Group__3__Impl : ( ( rule__ObjectDef__Group_3__0 )? ) ;
    public final void rule__ObjectDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2337:1: ( ( ( rule__ObjectDef__Group_3__0 )? ) )
            // InternalThicket.g:2338:1: ( ( rule__ObjectDef__Group_3__0 )? )
            {
            // InternalThicket.g:2338:1: ( ( rule__ObjectDef__Group_3__0 )? )
            // InternalThicket.g:2339:1: ( rule__ObjectDef__Group_3__0 )?
            {
             before(grammarAccess.getObjectDefAccess().getGroup_3()); 
            // InternalThicket.g:2340:1: ( rule__ObjectDef__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalThicket.g:2340:2: rule__ObjectDef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectDefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group__3__Impl"


    // $ANTLR start "rule__ObjectDef__Group_3__0"
    // InternalThicket.g:2358:1: rule__ObjectDef__Group_3__0 : rule__ObjectDef__Group_3__0__Impl rule__ObjectDef__Group_3__1 ;
    public final void rule__ObjectDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2362:1: ( rule__ObjectDef__Group_3__0__Impl rule__ObjectDef__Group_3__1 )
            // InternalThicket.g:2363:2: rule__ObjectDef__Group_3__0__Impl rule__ObjectDef__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ObjectDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__0"


    // $ANTLR start "rule__ObjectDef__Group_3__0__Impl"
    // InternalThicket.g:2370:1: rule__ObjectDef__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ObjectDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2374:1: ( ( '{' ) )
            // InternalThicket.g:2375:1: ( '{' )
            {
            // InternalThicket.g:2375:1: ( '{' )
            // InternalThicket.g:2376:1: '{'
            {
             before(grammarAccess.getObjectDefAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObjectDefAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__0__Impl"


    // $ANTLR start "rule__ObjectDef__Group_3__1"
    // InternalThicket.g:2389:1: rule__ObjectDef__Group_3__1 : rule__ObjectDef__Group_3__1__Impl rule__ObjectDef__Group_3__2 ;
    public final void rule__ObjectDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2393:1: ( rule__ObjectDef__Group_3__1__Impl rule__ObjectDef__Group_3__2 )
            // InternalThicket.g:2394:2: rule__ObjectDef__Group_3__1__Impl rule__ObjectDef__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__ObjectDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__1"


    // $ANTLR start "rule__ObjectDef__Group_3__1__Impl"
    // InternalThicket.g:2401:1: rule__ObjectDef__Group_3__1__Impl : ( ( ruletparam )* ) ;
    public final void rule__ObjectDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2405:1: ( ( ( ruletparam )* ) )
            // InternalThicket.g:2406:1: ( ( ruletparam )* )
            {
            // InternalThicket.g:2406:1: ( ( ruletparam )* )
            // InternalThicket.g:2407:1: ( ruletparam )*
            {
             before(grammarAccess.getObjectDefAccess().getTparamParserRuleCall_3_1()); 
            // InternalThicket.g:2408:1: ( ruletparam )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_IDENT||LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalThicket.g:2408:3: ruletparam
            	    {
            	    pushFollow(FOLLOW_21);
            	    ruletparam();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getObjectDefAccess().getTparamParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__1__Impl"


    // $ANTLR start "rule__ObjectDef__Group_3__2"
    // InternalThicket.g:2418:1: rule__ObjectDef__Group_3__2 : rule__ObjectDef__Group_3__2__Impl ;
    public final void rule__ObjectDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2422:1: ( rule__ObjectDef__Group_3__2__Impl )
            // InternalThicket.g:2423:2: rule__ObjectDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDef__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__2"


    // $ANTLR start "rule__ObjectDef__Group_3__2__Impl"
    // InternalThicket.g:2429:1: rule__ObjectDef__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ObjectDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2433:1: ( ( '}' ) )
            // InternalThicket.g:2434:1: ( '}' )
            {
            // InternalThicket.g:2434:1: ( '}' )
            // InternalThicket.g:2435:1: '}'
            {
             before(grammarAccess.getObjectDefAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjectDefAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectDef__Group_3__2__Impl"


    // $ANTLR start "rule__Tparam__Group__0"
    // InternalThicket.g:2454:1: rule__Tparam__Group__0 : rule__Tparam__Group__0__Impl rule__Tparam__Group__1 ;
    public final void rule__Tparam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2458:1: ( rule__Tparam__Group__0__Impl rule__Tparam__Group__1 )
            // InternalThicket.g:2459:2: rule__Tparam__Group__0__Impl rule__Tparam__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Tparam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tparam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__0"


    // $ANTLR start "rule__Tparam__Group__0__Impl"
    // InternalThicket.g:2466:1: rule__Tparam__Group__0__Impl : ( ruleidentOrOp ) ;
    public final void rule__Tparam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2470:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:2471:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:2471:1: ( ruleidentOrOp )
            // InternalThicket.g:2472:1: ruleidentOrOp
            {
             before(grammarAccess.getTparamAccess().getIdentOrOpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getTparamAccess().getIdentOrOpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__0__Impl"


    // $ANTLR start "rule__Tparam__Group__1"
    // InternalThicket.g:2483:1: rule__Tparam__Group__1 : rule__Tparam__Group__1__Impl rule__Tparam__Group__2 ;
    public final void rule__Tparam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2487:1: ( rule__Tparam__Group__1__Impl rule__Tparam__Group__2 )
            // InternalThicket.g:2488:2: rule__Tparam__Group__1__Impl rule__Tparam__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Tparam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tparam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__1"


    // $ANTLR start "rule__Tparam__Group__1__Impl"
    // InternalThicket.g:2495:1: rule__Tparam__Group__1__Impl : ( ':' ) ;
    public final void rule__Tparam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2499:1: ( ( ':' ) )
            // InternalThicket.g:2500:1: ( ':' )
            {
            // InternalThicket.g:2500:1: ( ':' )
            // InternalThicket.g:2501:1: ':'
            {
             before(grammarAccess.getTparamAccess().getColonKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTparamAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__1__Impl"


    // $ANTLR start "rule__Tparam__Group__2"
    // InternalThicket.g:2514:1: rule__Tparam__Group__2 : rule__Tparam__Group__2__Impl rule__Tparam__Group__3 ;
    public final void rule__Tparam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2518:1: ( rule__Tparam__Group__2__Impl rule__Tparam__Group__3 )
            // InternalThicket.g:2519:2: rule__Tparam__Group__2__Impl rule__Tparam__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Tparam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tparam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__2"


    // $ANTLR start "rule__Tparam__Group__2__Impl"
    // InternalThicket.g:2526:1: rule__Tparam__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__Tparam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2530:1: ( ( rulegenerics ) )
            // InternalThicket.g:2531:1: ( rulegenerics )
            {
            // InternalThicket.g:2531:1: ( rulegenerics )
            // InternalThicket.g:2532:1: rulegenerics
            {
             before(grammarAccess.getTparamAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getTparamAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__2__Impl"


    // $ANTLR start "rule__Tparam__Group__3"
    // InternalThicket.g:2543:1: rule__Tparam__Group__3 : rule__Tparam__Group__3__Impl ;
    public final void rule__Tparam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2547:1: ( rule__Tparam__Group__3__Impl )
            // InternalThicket.g:2548:2: rule__Tparam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tparam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__3"


    // $ANTLR start "rule__Tparam__Group__3__Impl"
    // InternalThicket.g:2554:1: rule__Tparam__Group__3__Impl : ( ruletypes ) ;
    public final void rule__Tparam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2558:1: ( ( ruletypes ) )
            // InternalThicket.g:2559:1: ( ruletypes )
            {
            // InternalThicket.g:2559:1: ( ruletypes )
            // InternalThicket.g:2560:1: ruletypes
            {
             before(grammarAccess.getTparamAccess().getTypesParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getTparamAccess().getTypesParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tparam__Group__3__Impl"


    // $ANTLR start "rule__Generics__Group__0"
    // InternalThicket.g:2579:1: rule__Generics__Group__0 : rule__Generics__Group__0__Impl rule__Generics__Group__1 ;
    public final void rule__Generics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2583:1: ( rule__Generics__Group__0__Impl rule__Generics__Group__1 )
            // InternalThicket.g:2584:2: rule__Generics__Group__0__Impl rule__Generics__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Generics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__0"


    // $ANTLR start "rule__Generics__Group__0__Impl"
    // InternalThicket.g:2591:1: rule__Generics__Group__0__Impl : ( '[' ) ;
    public final void rule__Generics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2595:1: ( ( '[' ) )
            // InternalThicket.g:2596:1: ( '[' )
            {
            // InternalThicket.g:2596:1: ( '[' )
            // InternalThicket.g:2597:1: '['
            {
             before(grammarAccess.getGenericsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGenericsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__0__Impl"


    // $ANTLR start "rule__Generics__Group__1"
    // InternalThicket.g:2610:1: rule__Generics__Group__1 : rule__Generics__Group__1__Impl rule__Generics__Group__2 ;
    public final void rule__Generics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2614:1: ( rule__Generics__Group__1__Impl rule__Generics__Group__2 )
            // InternalThicket.g:2615:2: rule__Generics__Group__1__Impl rule__Generics__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Generics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__1"


    // $ANTLR start "rule__Generics__Group__1__Impl"
    // InternalThicket.g:2622:1: rule__Generics__Group__1__Impl : ( ( ( RULE_IDENT ) ) ( ( RULE_IDENT )* ) ) ;
    public final void rule__Generics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2626:1: ( ( ( ( RULE_IDENT ) ) ( ( RULE_IDENT )* ) ) )
            // InternalThicket.g:2627:1: ( ( ( RULE_IDENT ) ) ( ( RULE_IDENT )* ) )
            {
            // InternalThicket.g:2627:1: ( ( ( RULE_IDENT ) ) ( ( RULE_IDENT )* ) )
            // InternalThicket.g:2628:1: ( ( RULE_IDENT ) ) ( ( RULE_IDENT )* )
            {
            // InternalThicket.g:2628:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:2629:1: ( RULE_IDENT )
            {
             before(grammarAccess.getGenericsAccess().getIdentTerminalRuleCall_1()); 
            // InternalThicket.g:2630:1: ( RULE_IDENT )
            // InternalThicket.g:2630:3: RULE_IDENT
            {
            match(input,RULE_IDENT,FOLLOW_24); 

            }

             after(grammarAccess.getGenericsAccess().getIdentTerminalRuleCall_1()); 

            }

            // InternalThicket.g:2633:1: ( ( RULE_IDENT )* )
            // InternalThicket.g:2634:1: ( RULE_IDENT )*
            {
             before(grammarAccess.getGenericsAccess().getIdentTerminalRuleCall_1()); 
            // InternalThicket.g:2635:1: ( RULE_IDENT )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_IDENT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalThicket.g:2635:3: RULE_IDENT
            	    {
            	    match(input,RULE_IDENT,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGenericsAccess().getIdentTerminalRuleCall_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__1__Impl"


    // $ANTLR start "rule__Generics__Group__2"
    // InternalThicket.g:2646:1: rule__Generics__Group__2 : rule__Generics__Group__2__Impl ;
    public final void rule__Generics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2650:1: ( rule__Generics__Group__2__Impl )
            // InternalThicket.g:2651:2: rule__Generics__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generics__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__2"


    // $ANTLR start "rule__Generics__Group__2__Impl"
    // InternalThicket.g:2657:1: rule__Generics__Group__2__Impl : ( ']' ) ;
    public final void rule__Generics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2661:1: ( ( ']' ) )
            // InternalThicket.g:2662:1: ( ']' )
            {
            // InternalThicket.g:2662:1: ( ']' )
            // InternalThicket.g:2663:1: ']'
            {
             before(grammarAccess.getGenericsAccess().getRightSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGenericsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generics__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalThicket.g:2682:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2686:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalThicket.g:2687:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalThicket.g:2694:1: rule__Type__Group_0__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2698:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:2699:1: ( RULE_IDENT )
            {
            // InternalThicket.g:2699:1: ( RULE_IDENT )
            // InternalThicket.g:2700:1: RULE_IDENT
            {
             before(grammarAccess.getTypeAccess().getIdentTerminalRuleCall_0_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIdentTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalThicket.g:2711:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2715:1: ( rule__Type__Group_0__1__Impl )
            // InternalThicket.g:2716:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalThicket.g:2722:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__Group_0_1__0 )? ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2726:1: ( ( ( rule__Type__Group_0_1__0 )? ) )
            // InternalThicket.g:2727:1: ( ( rule__Type__Group_0_1__0 )? )
            {
            // InternalThicket.g:2727:1: ( ( rule__Type__Group_0_1__0 )? )
            // InternalThicket.g:2728:1: ( rule__Type__Group_0_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_0_1()); 
            // InternalThicket.g:2729:1: ( rule__Type__Group_0_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalThicket.g:2729:2: rule__Type__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_0_1__0"
    // InternalThicket.g:2743:1: rule__Type__Group_0_1__0 : rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1 ;
    public final void rule__Type__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2747:1: ( rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1 )
            // InternalThicket.g:2748:2: rule__Type__Group_0_1__0__Impl rule__Type__Group_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__0"


    // $ANTLR start "rule__Type__Group_0_1__0__Impl"
    // InternalThicket.g:2755:1: rule__Type__Group_0_1__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2759:1: ( ( '[' ) )
            // InternalThicket.g:2760:1: ( '[' )
            {
            // InternalThicket.g:2760:1: ( '[' )
            // InternalThicket.g:2761:1: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__0__Impl"


    // $ANTLR start "rule__Type__Group_0_1__1"
    // InternalThicket.g:2774:1: rule__Type__Group_0_1__1 : rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2 ;
    public final void rule__Type__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2778:1: ( rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2 )
            // InternalThicket.g:2779:2: rule__Type__Group_0_1__1__Impl rule__Type__Group_0_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__1"


    // $ANTLR start "rule__Type__Group_0_1__1__Impl"
    // InternalThicket.g:2786:1: rule__Type__Group_0_1__1__Impl : ( ( ( ruletypes ) ) ( ( ruletypes )* ) ) ;
    public final void rule__Type__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2790:1: ( ( ( ( ruletypes ) ) ( ( ruletypes )* ) ) )
            // InternalThicket.g:2791:1: ( ( ( ruletypes ) ) ( ( ruletypes )* ) )
            {
            // InternalThicket.g:2791:1: ( ( ( ruletypes ) ) ( ( ruletypes )* ) )
            // InternalThicket.g:2792:1: ( ( ruletypes ) ) ( ( ruletypes )* )
            {
            // InternalThicket.g:2792:1: ( ( ruletypes ) )
            // InternalThicket.g:2793:1: ( ruletypes )
            {
             before(grammarAccess.getTypeAccess().getTypesParserRuleCall_0_1_1()); 
            // InternalThicket.g:2794:1: ( ruletypes )
            // InternalThicket.g:2794:3: ruletypes
            {
            pushFollow(FOLLOW_25);
            ruletypes();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypesParserRuleCall_0_1_1()); 

            }

            // InternalThicket.g:2797:1: ( ( ruletypes )* )
            // InternalThicket.g:2798:1: ( ruletypes )*
            {
             before(grammarAccess.getTypeAccess().getTypesParserRuleCall_0_1_1()); 
            // InternalThicket.g:2799:1: ( ruletypes )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_IDENT||LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalThicket.g:2799:3: ruletypes
            	    {
            	    pushFollow(FOLLOW_25);
            	    ruletypes();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getTypesParserRuleCall_0_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__1__Impl"


    // $ANTLR start "rule__Type__Group_0_1__2"
    // InternalThicket.g:2810:1: rule__Type__Group_0_1__2 : rule__Type__Group_0_1__2__Impl ;
    public final void rule__Type__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2814:1: ( rule__Type__Group_0_1__2__Impl )
            // InternalThicket.g:2815:2: rule__Type__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__2"


    // $ANTLR start "rule__Type__Group_0_1__2__Impl"
    // InternalThicket.g:2821:1: rule__Type__Group_0_1__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2825:1: ( ( ']' ) )
            // InternalThicket.g:2826:1: ( ']' )
            {
            // InternalThicket.g:2826:1: ( ']' )
            // InternalThicket.g:2827:1: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalThicket.g:2846:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2850:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalThicket.g:2851:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalThicket.g:2858:1: rule__Type__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2862:1: ( ( '(' ) )
            // InternalThicket.g:2863:1: ( '(' )
            {
            // InternalThicket.g:2863:1: ( '(' )
            // InternalThicket.g:2864:1: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalThicket.g:2877:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2881:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // InternalThicket.g:2882:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalThicket.g:2889:1: rule__Type__Group_1__1__Impl : ( ruletypes ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2893:1: ( ( ruletypes ) )
            // InternalThicket.g:2894:1: ( ruletypes )
            {
            // InternalThicket.g:2894:1: ( ruletypes )
            // InternalThicket.g:2895:1: ruletypes
            {
             before(grammarAccess.getTypeAccess().getTypesParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypesParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // InternalThicket.g:2906:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2910:1: ( rule__Type__Group_1__2__Impl )
            // InternalThicket.g:2911:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // InternalThicket.g:2917:1: rule__Type__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2921:1: ( ( ')' ) )
            // InternalThicket.g:2922:1: ( ')' )
            {
            // InternalThicket.g:2922:1: ( ')' )
            // InternalThicket.g:2923:1: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__Types__Group__0"
    // InternalThicket.g:2942:1: rule__Types__Group__0 : rule__Types__Group__0__Impl rule__Types__Group__1 ;
    public final void rule__Types__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2946:1: ( rule__Types__Group__0__Impl rule__Types__Group__1 )
            // InternalThicket.g:2947:2: rule__Types__Group__0__Impl rule__Types__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Types__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__0"


    // $ANTLR start "rule__Types__Group__0__Impl"
    // InternalThicket.g:2954:1: rule__Types__Group__0__Impl : ( ruletype ) ;
    public final void rule__Types__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2958:1: ( ( ruletype ) )
            // InternalThicket.g:2959:1: ( ruletype )
            {
            // InternalThicket.g:2959:1: ( ruletype )
            // InternalThicket.g:2960:1: ruletype
            {
             before(grammarAccess.getTypesAccess().getTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypesAccess().getTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__0__Impl"


    // $ANTLR start "rule__Types__Group__1"
    // InternalThicket.g:2971:1: rule__Types__Group__1 : rule__Types__Group__1__Impl ;
    public final void rule__Types__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2975:1: ( rule__Types__Group__1__Impl )
            // InternalThicket.g:2976:2: rule__Types__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__1"


    // $ANTLR start "rule__Types__Group__1__Impl"
    // InternalThicket.g:2982:1: rule__Types__Group__1__Impl : ( ( rule__Types__Group_1__0 )? ) ;
    public final void rule__Types__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:2986:1: ( ( ( rule__Types__Group_1__0 )? ) )
            // InternalThicket.g:2987:1: ( ( rule__Types__Group_1__0 )? )
            {
            // InternalThicket.g:2987:1: ( ( rule__Types__Group_1__0 )? )
            // InternalThicket.g:2988:1: ( rule__Types__Group_1__0 )?
            {
             before(grammarAccess.getTypesAccess().getGroup_1()); 
            // InternalThicket.g:2989:1: ( rule__Types__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=17 && LA27_0<=18)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalThicket.g:2989:2: rule__Types__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group__1__Impl"


    // $ANTLR start "rule__Types__Group_1__0"
    // InternalThicket.g:3003:1: rule__Types__Group_1__0 : rule__Types__Group_1__0__Impl rule__Types__Group_1__1 ;
    public final void rule__Types__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3007:1: ( rule__Types__Group_1__0__Impl rule__Types__Group_1__1 )
            // InternalThicket.g:3008:2: rule__Types__Group_1__0__Impl rule__Types__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Types__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__0"


    // $ANTLR start "rule__Types__Group_1__0__Impl"
    // InternalThicket.g:3015:1: rule__Types__Group_1__0__Impl : ( ( rule__Types__Alternatives_1_0 ) ) ;
    public final void rule__Types__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3019:1: ( ( ( rule__Types__Alternatives_1_0 ) ) )
            // InternalThicket.g:3020:1: ( ( rule__Types__Alternatives_1_0 ) )
            {
            // InternalThicket.g:3020:1: ( ( rule__Types__Alternatives_1_0 ) )
            // InternalThicket.g:3021:1: ( rule__Types__Alternatives_1_0 )
            {
             before(grammarAccess.getTypesAccess().getAlternatives_1_0()); 
            // InternalThicket.g:3022:1: ( rule__Types__Alternatives_1_0 )
            // InternalThicket.g:3022:2: rule__Types__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__0__Impl"


    // $ANTLR start "rule__Types__Group_1__1"
    // InternalThicket.g:3032:1: rule__Types__Group_1__1 : rule__Types__Group_1__1__Impl ;
    public final void rule__Types__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3036:1: ( rule__Types__Group_1__1__Impl )
            // InternalThicket.g:3037:2: rule__Types__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__1"


    // $ANTLR start "rule__Types__Group_1__1__Impl"
    // InternalThicket.g:3043:1: rule__Types__Group_1__1__Impl : ( ruletypes ) ;
    public final void rule__Types__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3047:1: ( ( ruletypes ) )
            // InternalThicket.g:3048:1: ( ruletypes )
            {
            // InternalThicket.g:3048:1: ( ruletypes )
            // InternalThicket.g:3049:1: ruletypes
            {
             before(grammarAccess.getTypesAccess().getTypesParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getTypesAccess().getTypesParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__0"
    // InternalThicket.g:3064:1: rule__ExpressionDef__Group__0 : rule__ExpressionDef__Group__0__Impl rule__ExpressionDef__Group__1 ;
    public final void rule__ExpressionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3068:1: ( rule__ExpressionDef__Group__0__Impl rule__ExpressionDef__Group__1 )
            // InternalThicket.g:3069:2: rule__ExpressionDef__Group__0__Impl rule__ExpressionDef__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__0"


    // $ANTLR start "rule__ExpressionDef__Group__0__Impl"
    // InternalThicket.g:3076:1: rule__ExpressionDef__Group__0__Impl : ( 'def' ) ;
    public final void rule__ExpressionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3080:1: ( ( 'def' ) )
            // InternalThicket.g:3081:1: ( 'def' )
            {
            // InternalThicket.g:3081:1: ( 'def' )
            // InternalThicket.g:3082:1: 'def'
            {
             before(grammarAccess.getExpressionDefAccess().getDefKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__0__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__1"
    // InternalThicket.g:3095:1: rule__ExpressionDef__Group__1 : rule__ExpressionDef__Group__1__Impl rule__ExpressionDef__Group__2 ;
    public final void rule__ExpressionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3099:1: ( rule__ExpressionDef__Group__1__Impl rule__ExpressionDef__Group__2 )
            // InternalThicket.g:3100:2: rule__ExpressionDef__Group__1__Impl rule__ExpressionDef__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__1"


    // $ANTLR start "rule__ExpressionDef__Group__1__Impl"
    // InternalThicket.g:3107:1: rule__ExpressionDef__Group__1__Impl : ( ( 'adapter' )? ) ;
    public final void rule__ExpressionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3111:1: ( ( ( 'adapter' )? ) )
            // InternalThicket.g:3112:1: ( ( 'adapter' )? )
            {
            // InternalThicket.g:3112:1: ( ( 'adapter' )? )
            // InternalThicket.g:3113:1: ( 'adapter' )?
            {
             before(grammarAccess.getExpressionDefAccess().getAdapterKeyword_1()); 
            // InternalThicket.g:3114:1: ( 'adapter' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalThicket.g:3115:2: 'adapter'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpressionDefAccess().getAdapterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__2"
    // InternalThicket.g:3126:1: rule__ExpressionDef__Group__2 : rule__ExpressionDef__Group__2__Impl rule__ExpressionDef__Group__3 ;
    public final void rule__ExpressionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3130:1: ( rule__ExpressionDef__Group__2__Impl rule__ExpressionDef__Group__3 )
            // InternalThicket.g:3131:2: rule__ExpressionDef__Group__2__Impl rule__ExpressionDef__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__2"


    // $ANTLR start "rule__ExpressionDef__Group__2__Impl"
    // InternalThicket.g:3138:1: rule__ExpressionDef__Group__2__Impl : ( ruleidentOrOp ) ;
    public final void rule__ExpressionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3142:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:3143:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:3143:1: ( ruleidentOrOp )
            // InternalThicket.g:3144:1: ruleidentOrOp
            {
             before(grammarAccess.getExpressionDefAccess().getIdentOrOpParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getIdentOrOpParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__2__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__3"
    // InternalThicket.g:3155:1: rule__ExpressionDef__Group__3 : rule__ExpressionDef__Group__3__Impl rule__ExpressionDef__Group__4 ;
    public final void rule__ExpressionDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3159:1: ( rule__ExpressionDef__Group__3__Impl rule__ExpressionDef__Group__4 )
            // InternalThicket.g:3160:2: rule__ExpressionDef__Group__3__Impl rule__ExpressionDef__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ExpressionDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__3"


    // $ANTLR start "rule__ExpressionDef__Group__3__Impl"
    // InternalThicket.g:3167:1: rule__ExpressionDef__Group__3__Impl : ( ( rule__ExpressionDef__Group_3__0 )? ) ;
    public final void rule__ExpressionDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3171:1: ( ( ( rule__ExpressionDef__Group_3__0 )? ) )
            // InternalThicket.g:3172:1: ( ( rule__ExpressionDef__Group_3__0 )? )
            {
            // InternalThicket.g:3172:1: ( ( rule__ExpressionDef__Group_3__0 )? )
            // InternalThicket.g:3173:1: ( rule__ExpressionDef__Group_3__0 )?
            {
             before(grammarAccess.getExpressionDefAccess().getGroup_3()); 
            // InternalThicket.g:3174:1: ( rule__ExpressionDef__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalThicket.g:3174:2: rule__ExpressionDef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionDefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__3__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__4"
    // InternalThicket.g:3184:1: rule__ExpressionDef__Group__4 : rule__ExpressionDef__Group__4__Impl rule__ExpressionDef__Group__5 ;
    public final void rule__ExpressionDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3188:1: ( rule__ExpressionDef__Group__4__Impl rule__ExpressionDef__Group__5 )
            // InternalThicket.g:3189:2: rule__ExpressionDef__Group__4__Impl rule__ExpressionDef__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__4"


    // $ANTLR start "rule__ExpressionDef__Group__4__Impl"
    // InternalThicket.g:3196:1: rule__ExpressionDef__Group__4__Impl : ( '=' ) ;
    public final void rule__ExpressionDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3200:1: ( ( '=' ) )
            // InternalThicket.g:3201:1: ( '=' )
            {
            // InternalThicket.g:3201:1: ( '=' )
            // InternalThicket.g:3202:1: '='
            {
             before(grammarAccess.getExpressionDefAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__4__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__5"
    // InternalThicket.g:3215:1: rule__ExpressionDef__Group__5 : rule__ExpressionDef__Group__5__Impl rule__ExpressionDef__Group__6 ;
    public final void rule__ExpressionDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3219:1: ( rule__ExpressionDef__Group__5__Impl rule__ExpressionDef__Group__6 )
            // InternalThicket.g:3220:2: rule__ExpressionDef__Group__5__Impl rule__ExpressionDef__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__5"


    // $ANTLR start "rule__ExpressionDef__Group__5__Impl"
    // InternalThicket.g:3227:1: rule__ExpressionDef__Group__5__Impl : ( ( rule__ExpressionDef__Group_5__0 )? ) ;
    public final void rule__ExpressionDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3231:1: ( ( ( rule__ExpressionDef__Group_5__0 )? ) )
            // InternalThicket.g:3232:1: ( ( rule__ExpressionDef__Group_5__0 )? )
            {
            // InternalThicket.g:3232:1: ( ( rule__ExpressionDef__Group_5__0 )? )
            // InternalThicket.g:3233:1: ( rule__ExpressionDef__Group_5__0 )?
            {
             before(grammarAccess.getExpressionDefAccess().getGroup_5()); 
            // InternalThicket.g:3234:1: ( rule__ExpressionDef__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENT) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_IDENT||LA30_1==18||LA30_1==30) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalThicket.g:3234:2: rule__ExpressionDef__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionDef__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionDefAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__5__Impl"


    // $ANTLR start "rule__ExpressionDef__Group__6"
    // InternalThicket.g:3244:1: rule__ExpressionDef__Group__6 : rule__ExpressionDef__Group__6__Impl ;
    public final void rule__ExpressionDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3248:1: ( rule__ExpressionDef__Group__6__Impl )
            // InternalThicket.g:3249:2: rule__ExpressionDef__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__6"


    // $ANTLR start "rule__ExpressionDef__Group__6__Impl"
    // InternalThicket.g:3255:1: rule__ExpressionDef__Group__6__Impl : ( rulesexpr ) ;
    public final void rule__ExpressionDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3259:1: ( ( rulesexpr ) )
            // InternalThicket.g:3260:1: ( rulesexpr )
            {
            // InternalThicket.g:3260:1: ( rulesexpr )
            // InternalThicket.g:3261:1: rulesexpr
            {
             before(grammarAccess.getExpressionDefAccess().getSexprParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getSexprParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group__6__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_3__0"
    // InternalThicket.g:3286:1: rule__ExpressionDef__Group_3__0 : rule__ExpressionDef__Group_3__0__Impl rule__ExpressionDef__Group_3__1 ;
    public final void rule__ExpressionDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3290:1: ( rule__ExpressionDef__Group_3__0__Impl rule__ExpressionDef__Group_3__1 )
            // InternalThicket.g:3291:2: rule__ExpressionDef__Group_3__0__Impl rule__ExpressionDef__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__0"


    // $ANTLR start "rule__ExpressionDef__Group_3__0__Impl"
    // InternalThicket.g:3298:1: rule__ExpressionDef__Group_3__0__Impl : ( ':' ) ;
    public final void rule__ExpressionDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3302:1: ( ( ':' ) )
            // InternalThicket.g:3303:1: ( ':' )
            {
            // InternalThicket.g:3303:1: ( ':' )
            // InternalThicket.g:3304:1: ':'
            {
             before(grammarAccess.getExpressionDefAccess().getColonKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__0__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_3__1"
    // InternalThicket.g:3317:1: rule__ExpressionDef__Group_3__1 : rule__ExpressionDef__Group_3__1__Impl rule__ExpressionDef__Group_3__2 ;
    public final void rule__ExpressionDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3321:1: ( rule__ExpressionDef__Group_3__1__Impl rule__ExpressionDef__Group_3__2 )
            // InternalThicket.g:3322:2: rule__ExpressionDef__Group_3__1__Impl rule__ExpressionDef__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__1"


    // $ANTLR start "rule__ExpressionDef__Group_3__1__Impl"
    // InternalThicket.g:3329:1: rule__ExpressionDef__Group_3__1__Impl : ( rulegenerics ) ;
    public final void rule__ExpressionDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3333:1: ( ( rulegenerics ) )
            // InternalThicket.g:3334:1: ( rulegenerics )
            {
            // InternalThicket.g:3334:1: ( rulegenerics )
            // InternalThicket.g:3335:1: rulegenerics
            {
             before(grammarAccess.getExpressionDefAccess().getGenericsParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getGenericsParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_3__2"
    // InternalThicket.g:3346:1: rule__ExpressionDef__Group_3__2 : rule__ExpressionDef__Group_3__2__Impl ;
    public final void rule__ExpressionDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3350:1: ( rule__ExpressionDef__Group_3__2__Impl )
            // InternalThicket.g:3351:2: rule__ExpressionDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__2"


    // $ANTLR start "rule__ExpressionDef__Group_3__2__Impl"
    // InternalThicket.g:3357:1: rule__ExpressionDef__Group_3__2__Impl : ( ruletypes ) ;
    public final void rule__ExpressionDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3361:1: ( ( ruletypes ) )
            // InternalThicket.g:3362:1: ( ruletypes )
            {
            // InternalThicket.g:3362:1: ( ruletypes )
            // InternalThicket.g:3363:1: ruletypes
            {
             before(grammarAccess.getExpressionDefAccess().getTypesParserRuleCall_3_2()); 
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getTypesParserRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_3__2__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5__0"
    // InternalThicket.g:3380:1: rule__ExpressionDef__Group_5__0 : rule__ExpressionDef__Group_5__0__Impl rule__ExpressionDef__Group_5__1 ;
    public final void rule__ExpressionDef__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3384:1: ( rule__ExpressionDef__Group_5__0__Impl rule__ExpressionDef__Group_5__1 )
            // InternalThicket.g:3385:2: rule__ExpressionDef__Group_5__0__Impl rule__ExpressionDef__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpressionDef__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5__0"


    // $ANTLR start "rule__ExpressionDef__Group_5__0__Impl"
    // InternalThicket.g:3392:1: rule__ExpressionDef__Group_5__0__Impl : ( ( ( rule__ExpressionDef__Group_5_0__0 ) ) ( ( rule__ExpressionDef__Group_5_0__0 )* ) ) ;
    public final void rule__ExpressionDef__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3396:1: ( ( ( ( rule__ExpressionDef__Group_5_0__0 ) ) ( ( rule__ExpressionDef__Group_5_0__0 )* ) ) )
            // InternalThicket.g:3397:1: ( ( ( rule__ExpressionDef__Group_5_0__0 ) ) ( ( rule__ExpressionDef__Group_5_0__0 )* ) )
            {
            // InternalThicket.g:3397:1: ( ( ( rule__ExpressionDef__Group_5_0__0 ) ) ( ( rule__ExpressionDef__Group_5_0__0 )* ) )
            // InternalThicket.g:3398:1: ( ( rule__ExpressionDef__Group_5_0__0 ) ) ( ( rule__ExpressionDef__Group_5_0__0 )* )
            {
            // InternalThicket.g:3398:1: ( ( rule__ExpressionDef__Group_5_0__0 ) )
            // InternalThicket.g:3399:1: ( rule__ExpressionDef__Group_5_0__0 )
            {
             before(grammarAccess.getExpressionDefAccess().getGroup_5_0()); 
            // InternalThicket.g:3400:1: ( rule__ExpressionDef__Group_5_0__0 )
            // InternalThicket.g:3400:2: rule__ExpressionDef__Group_5_0__0
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionDef__Group_5_0__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionDefAccess().getGroup_5_0()); 

            }

            // InternalThicket.g:3403:1: ( ( rule__ExpressionDef__Group_5_0__0 )* )
            // InternalThicket.g:3404:1: ( rule__ExpressionDef__Group_5_0__0 )*
            {
             before(grammarAccess.getExpressionDefAccess().getGroup_5_0()); 
            // InternalThicket.g:3405:1: ( rule__ExpressionDef__Group_5_0__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_IDENT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalThicket.g:3405:2: rule__ExpressionDef__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ExpressionDef__Group_5_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExpressionDefAccess().getGroup_5_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5__0__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5__1"
    // InternalThicket.g:3416:1: rule__ExpressionDef__Group_5__1 : rule__ExpressionDef__Group_5__1__Impl ;
    public final void rule__ExpressionDef__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3420:1: ( rule__ExpressionDef__Group_5__1__Impl )
            // InternalThicket.g:3421:2: rule__ExpressionDef__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5__1"


    // $ANTLR start "rule__ExpressionDef__Group_5__1__Impl"
    // InternalThicket.g:3427:1: rule__ExpressionDef__Group_5__1__Impl : ( '->' ) ;
    public final void rule__ExpressionDef__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3431:1: ( ( '->' ) )
            // InternalThicket.g:3432:1: ( '->' )
            {
            // InternalThicket.g:3432:1: ( '->' )
            // InternalThicket.g:3433:1: '->'
            {
             before(grammarAccess.getExpressionDefAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getHyphenMinusGreaterThanSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5_0__0"
    // InternalThicket.g:3450:1: rule__ExpressionDef__Group_5_0__0 : rule__ExpressionDef__Group_5_0__0__Impl rule__ExpressionDef__Group_5_0__1 ;
    public final void rule__ExpressionDef__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3454:1: ( rule__ExpressionDef__Group_5_0__0__Impl rule__ExpressionDef__Group_5_0__1 )
            // InternalThicket.g:3455:2: rule__ExpressionDef__Group_5_0__0__Impl rule__ExpressionDef__Group_5_0__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionDef__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0__0"


    // $ANTLR start "rule__ExpressionDef__Group_5_0__0__Impl"
    // InternalThicket.g:3462:1: rule__ExpressionDef__Group_5_0__0__Impl : ( RULE_IDENT ) ;
    public final void rule__ExpressionDef__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3466:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:3467:1: ( RULE_IDENT )
            {
            // InternalThicket.g:3467:1: ( RULE_IDENT )
            // InternalThicket.g:3468:1: RULE_IDENT
            {
             before(grammarAccess.getExpressionDefAccess().getIdentTerminalRuleCall_5_0_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getIdentTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0__0__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5_0__1"
    // InternalThicket.g:3479:1: rule__ExpressionDef__Group_5_0__1 : rule__ExpressionDef__Group_5_0__1__Impl ;
    public final void rule__ExpressionDef__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3483:1: ( rule__ExpressionDef__Group_5_0__1__Impl )
            // InternalThicket.g:3484:2: rule__ExpressionDef__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0__1"


    // $ANTLR start "rule__ExpressionDef__Group_5_0__1__Impl"
    // InternalThicket.g:3490:1: rule__ExpressionDef__Group_5_0__1__Impl : ( ( rule__ExpressionDef__Group_5_0_1__0 )? ) ;
    public final void rule__ExpressionDef__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3494:1: ( ( ( rule__ExpressionDef__Group_5_0_1__0 )? ) )
            // InternalThicket.g:3495:1: ( ( rule__ExpressionDef__Group_5_0_1__0 )? )
            {
            // InternalThicket.g:3495:1: ( ( rule__ExpressionDef__Group_5_0_1__0 )? )
            // InternalThicket.g:3496:1: ( rule__ExpressionDef__Group_5_0_1__0 )?
            {
             before(grammarAccess.getExpressionDefAccess().getGroup_5_0_1()); 
            // InternalThicket.g:3497:1: ( rule__ExpressionDef__Group_5_0_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalThicket.g:3497:2: rule__ExpressionDef__Group_5_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionDef__Group_5_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionDefAccess().getGroup_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__0"
    // InternalThicket.g:3511:1: rule__ExpressionDef__Group_5_0_1__0 : rule__ExpressionDef__Group_5_0_1__0__Impl rule__ExpressionDef__Group_5_0_1__1 ;
    public final void rule__ExpressionDef__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3515:1: ( rule__ExpressionDef__Group_5_0_1__0__Impl rule__ExpressionDef__Group_5_0_1__1 )
            // InternalThicket.g:3516:2: rule__ExpressionDef__Group_5_0_1__0__Impl rule__ExpressionDef__Group_5_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ExpressionDef__Group_5_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__0"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__0__Impl"
    // InternalThicket.g:3523:1: rule__ExpressionDef__Group_5_0_1__0__Impl : ( ':' ) ;
    public final void rule__ExpressionDef__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3527:1: ( ( ':' ) )
            // InternalThicket.g:3528:1: ( ':' )
            {
            // InternalThicket.g:3528:1: ( ':' )
            // InternalThicket.g:3529:1: ':'
            {
             before(grammarAccess.getExpressionDefAccess().getColonKeyword_5_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpressionDefAccess().getColonKeyword_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__1"
    // InternalThicket.g:3542:1: rule__ExpressionDef__Group_5_0_1__1 : rule__ExpressionDef__Group_5_0_1__1__Impl rule__ExpressionDef__Group_5_0_1__2 ;
    public final void rule__ExpressionDef__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3546:1: ( rule__ExpressionDef__Group_5_0_1__1__Impl rule__ExpressionDef__Group_5_0_1__2 )
            // InternalThicket.g:3547:2: rule__ExpressionDef__Group_5_0_1__1__Impl rule__ExpressionDef__Group_5_0_1__2
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionDef__Group_5_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__1"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__1__Impl"
    // InternalThicket.g:3554:1: rule__ExpressionDef__Group_5_0_1__1__Impl : ( rulegenerics ) ;
    public final void rule__ExpressionDef__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3558:1: ( ( rulegenerics ) )
            // InternalThicket.g:3559:1: ( rulegenerics )
            {
            // InternalThicket.g:3559:1: ( rulegenerics )
            // InternalThicket.g:3560:1: rulegenerics
            {
             before(grammarAccess.getExpressionDefAccess().getGenericsParserRuleCall_5_0_1_1()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getGenericsParserRuleCall_5_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__2"
    // InternalThicket.g:3571:1: rule__ExpressionDef__Group_5_0_1__2 : rule__ExpressionDef__Group_5_0_1__2__Impl ;
    public final void rule__ExpressionDef__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3575:1: ( rule__ExpressionDef__Group_5_0_1__2__Impl )
            // InternalThicket.g:3576:2: rule__ExpressionDef__Group_5_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionDef__Group_5_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__2"


    // $ANTLR start "rule__ExpressionDef__Group_5_0_1__2__Impl"
    // InternalThicket.g:3582:1: rule__ExpressionDef__Group_5_0_1__2__Impl : ( ruletype ) ;
    public final void rule__ExpressionDef__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3586:1: ( ( ruletype ) )
            // InternalThicket.g:3587:1: ( ruletype )
            {
            // InternalThicket.g:3587:1: ( ruletype )
            // InternalThicket.g:3588:1: ruletype
            {
             before(grammarAccess.getExpressionDefAccess().getTypeParserRuleCall_5_0_1_2()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getExpressionDefAccess().getTypeParserRuleCall_5_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionDef__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__ClassDef__Group__0"
    // InternalThicket.g:3605:1: rule__ClassDef__Group__0 : rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 ;
    public final void rule__ClassDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3609:1: ( rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1 )
            // InternalThicket.g:3610:2: rule__ClassDef__Group__0__Impl rule__ClassDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__0"


    // $ANTLR start "rule__ClassDef__Group__0__Impl"
    // InternalThicket.g:3617:1: rule__ClassDef__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3621:1: ( ( 'class' ) )
            // InternalThicket.g:3622:1: ( 'class' )
            {
            // InternalThicket.g:3622:1: ( 'class' )
            // InternalThicket.g:3623:1: 'class'
            {
             before(grammarAccess.getClassDefAccess().getClassKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__0__Impl"


    // $ANTLR start "rule__ClassDef__Group__1"
    // InternalThicket.g:3636:1: rule__ClassDef__Group__1 : rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 ;
    public final void rule__ClassDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3640:1: ( rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2 )
            // InternalThicket.g:3641:2: rule__ClassDef__Group__1__Impl rule__ClassDef__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ClassDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__1"


    // $ANTLR start "rule__ClassDef__Group__1__Impl"
    // InternalThicket.g:3648:1: rule__ClassDef__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__ClassDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3652:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:3653:1: ( RULE_IDENT )
            {
            // InternalThicket.g:3653:1: ( RULE_IDENT )
            // InternalThicket.g:3654:1: RULE_IDENT
            {
             before(grammarAccess.getClassDefAccess().getIdentTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getIdentTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__1__Impl"


    // $ANTLR start "rule__ClassDef__Group__2"
    // InternalThicket.g:3665:1: rule__ClassDef__Group__2 : rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 ;
    public final void rule__ClassDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3669:1: ( rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3 )
            // InternalThicket.g:3670:2: rule__ClassDef__Group__2__Impl rule__ClassDef__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ClassDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__2"


    // $ANTLR start "rule__ClassDef__Group__2__Impl"
    // InternalThicket.g:3677:1: rule__ClassDef__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__ClassDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3681:1: ( ( rulegenerics ) )
            // InternalThicket.g:3682:1: ( rulegenerics )
            {
            // InternalThicket.g:3682:1: ( rulegenerics )
            // InternalThicket.g:3683:1: rulegenerics
            {
             before(grammarAccess.getClassDefAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__2__Impl"


    // $ANTLR start "rule__ClassDef__Group__3"
    // InternalThicket.g:3694:1: rule__ClassDef__Group__3 : rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 ;
    public final void rule__ClassDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3698:1: ( rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4 )
            // InternalThicket.g:3699:2: rule__ClassDef__Group__3__Impl rule__ClassDef__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ClassDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__3"


    // $ANTLR start "rule__ClassDef__Group__3__Impl"
    // InternalThicket.g:3706:1: rule__ClassDef__Group__3__Impl : ( ruletparam ) ;
    public final void rule__ClassDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3710:1: ( ( ruletparam ) )
            // InternalThicket.g:3711:1: ( ruletparam )
            {
            // InternalThicket.g:3711:1: ( ruletparam )
            // InternalThicket.g:3712:1: ruletparam
            {
             before(grammarAccess.getClassDefAccess().getTparamParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruletparam();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getTparamParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__3__Impl"


    // $ANTLR start "rule__ClassDef__Group__4"
    // InternalThicket.g:3723:1: rule__ClassDef__Group__4 : rule__ClassDef__Group__4__Impl rule__ClassDef__Group__5 ;
    public final void rule__ClassDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3727:1: ( rule__ClassDef__Group__4__Impl rule__ClassDef__Group__5 )
            // InternalThicket.g:3728:2: rule__ClassDef__Group__4__Impl rule__ClassDef__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ClassDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__4"


    // $ANTLR start "rule__ClassDef__Group__4__Impl"
    // InternalThicket.g:3735:1: rule__ClassDef__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3739:1: ( ( '{' ) )
            // InternalThicket.g:3740:1: ( '{' )
            {
            // InternalThicket.g:3740:1: ( '{' )
            // InternalThicket.g:3741:1: '{'
            {
             before(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__4__Impl"


    // $ANTLR start "rule__ClassDef__Group__5"
    // InternalThicket.g:3754:1: rule__ClassDef__Group__5 : rule__ClassDef__Group__5__Impl rule__ClassDef__Group__6 ;
    public final void rule__ClassDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3758:1: ( rule__ClassDef__Group__5__Impl rule__ClassDef__Group__6 )
            // InternalThicket.g:3759:2: rule__ClassDef__Group__5__Impl rule__ClassDef__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ClassDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__5"


    // $ANTLR start "rule__ClassDef__Group__5__Impl"
    // InternalThicket.g:3766:1: rule__ClassDef__Group__5__Impl : ( ( rule__ClassDef__Alternatives_5 )* ) ;
    public final void rule__ClassDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3770:1: ( ( ( rule__ClassDef__Alternatives_5 )* ) )
            // InternalThicket.g:3771:1: ( ( rule__ClassDef__Alternatives_5 )* )
            {
            // InternalThicket.g:3771:1: ( ( rule__ClassDef__Alternatives_5 )* )
            // InternalThicket.g:3772:1: ( rule__ClassDef__Alternatives_5 )*
            {
             before(grammarAccess.getClassDefAccess().getAlternatives_5()); 
            // InternalThicket.g:3773:1: ( rule__ClassDef__Alternatives_5 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_IDENT||LA33_0==33||LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalThicket.g:3773:2: rule__ClassDef__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ClassDef__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getClassDefAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__5__Impl"


    // $ANTLR start "rule__ClassDef__Group__6"
    // InternalThicket.g:3783:1: rule__ClassDef__Group__6 : rule__ClassDef__Group__6__Impl rule__ClassDef__Group__7 ;
    public final void rule__ClassDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3787:1: ( rule__ClassDef__Group__6__Impl rule__ClassDef__Group__7 )
            // InternalThicket.g:3788:2: rule__ClassDef__Group__6__Impl rule__ClassDef__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__ClassDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__6"


    // $ANTLR start "rule__ClassDef__Group__6__Impl"
    // InternalThicket.g:3795:1: rule__ClassDef__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3799:1: ( ( '}' ) )
            // InternalThicket.g:3800:1: ( '}' )
            {
            // InternalThicket.g:3800:1: ( '}' )
            // InternalThicket.g:3801:1: '}'
            {
             before(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__6__Impl"


    // $ANTLR start "rule__ClassDef__Group__7"
    // InternalThicket.g:3814:1: rule__ClassDef__Group__7 : rule__ClassDef__Group__7__Impl rule__ClassDef__Group__8 ;
    public final void rule__ClassDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3818:1: ( rule__ClassDef__Group__7__Impl rule__ClassDef__Group__8 )
            // InternalThicket.g:3819:2: rule__ClassDef__Group__7__Impl rule__ClassDef__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__ClassDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__7"


    // $ANTLR start "rule__ClassDef__Group__7__Impl"
    // InternalThicket.g:3826:1: rule__ClassDef__Group__7__Impl : ( '{' ) ;
    public final void rule__ClassDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3830:1: ( ( '{' ) )
            // InternalThicket.g:3831:1: ( '{' )
            {
            // InternalThicket.g:3831:1: ( '{' )
            // InternalThicket.g:3832:1: '{'
            {
             before(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__7__Impl"


    // $ANTLR start "rule__ClassDef__Group__8"
    // InternalThicket.g:3845:1: rule__ClassDef__Group__8 : rule__ClassDef__Group__8__Impl rule__ClassDef__Group__9 ;
    public final void rule__ClassDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3849:1: ( rule__ClassDef__Group__8__Impl rule__ClassDef__Group__9 )
            // InternalThicket.g:3850:2: rule__ClassDef__Group__8__Impl rule__ClassDef__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__ClassDef__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__8"


    // $ANTLR start "rule__ClassDef__Group__8__Impl"
    // InternalThicket.g:3857:1: rule__ClassDef__Group__8__Impl : ( ( rulemethodClass )* ) ;
    public final void rule__ClassDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3861:1: ( ( ( rulemethodClass )* ) )
            // InternalThicket.g:3862:1: ( ( rulemethodClass )* )
            {
            // InternalThicket.g:3862:1: ( ( rulemethodClass )* )
            // InternalThicket.g:3863:1: ( rulemethodClass )*
            {
             before(grammarAccess.getClassDefAccess().getMethodClassParserRuleCall_8()); 
            // InternalThicket.g:3864:1: ( rulemethodClass )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalThicket.g:3864:3: rulemethodClass
            	    {
            	    pushFollow(FOLLOW_35);
            	    rulemethodClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getClassDefAccess().getMethodClassParserRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__8__Impl"


    // $ANTLR start "rule__ClassDef__Group__9"
    // InternalThicket.g:3874:1: rule__ClassDef__Group__9 : rule__ClassDef__Group__9__Impl ;
    public final void rule__ClassDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3878:1: ( rule__ClassDef__Group__9__Impl )
            // InternalThicket.g:3879:2: rule__ClassDef__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__9"


    // $ANTLR start "rule__ClassDef__Group__9__Impl"
    // InternalThicket.g:3885:1: rule__ClassDef__Group__9__Impl : ( '}' ) ;
    public final void rule__ClassDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3889:1: ( ( '}' ) )
            // InternalThicket.g:3890:1: ( '}' )
            {
            // InternalThicket.g:3890:1: ( '}' )
            // InternalThicket.g:3891:1: '}'
            {
             before(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group__9__Impl"


    // $ANTLR start "rule__ClassDef__Group_5_0__0"
    // InternalThicket.g:3924:1: rule__ClassDef__Group_5_0__0 : rule__ClassDef__Group_5_0__0__Impl rule__ClassDef__Group_5_0__1 ;
    public final void rule__ClassDef__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3928:1: ( rule__ClassDef__Group_5_0__0__Impl rule__ClassDef__Group_5_0__1 )
            // InternalThicket.g:3929:2: rule__ClassDef__Group_5_0__0__Impl rule__ClassDef__Group_5_0__1
            {
            pushFollow(FOLLOW_15);
            rule__ClassDef__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDef__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_5_0__0"


    // $ANTLR start "rule__ClassDef__Group_5_0__0__Impl"
    // InternalThicket.g:3936:1: rule__ClassDef__Group_5_0__0__Impl : ( '+' ) ;
    public final void rule__ClassDef__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3940:1: ( ( '+' ) )
            // InternalThicket.g:3941:1: ( '+' )
            {
            // InternalThicket.g:3941:1: ( '+' )
            // InternalThicket.g:3942:1: '+'
            {
             before(grammarAccess.getClassDefAccess().getPlusSignKeyword_5_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClassDefAccess().getPlusSignKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_5_0__0__Impl"


    // $ANTLR start "rule__ClassDef__Group_5_0__1"
    // InternalThicket.g:3955:1: rule__ClassDef__Group_5_0__1 : rule__ClassDef__Group_5_0__1__Impl ;
    public final void rule__ClassDef__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3959:1: ( rule__ClassDef__Group_5_0__1__Impl )
            // InternalThicket.g:3960:2: rule__ClassDef__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDef__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_5_0__1"


    // $ANTLR start "rule__ClassDef__Group_5_0__1__Impl"
    // InternalThicket.g:3966:1: rule__ClassDef__Group_5_0__1__Impl : ( ruletype ) ;
    public final void rule__ClassDef__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3970:1: ( ( ruletype ) )
            // InternalThicket.g:3971:1: ( ruletype )
            {
            // InternalThicket.g:3971:1: ( ruletype )
            // InternalThicket.g:3972:1: ruletype
            {
             before(grammarAccess.getClassDefAccess().getTypeParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getClassDefAccess().getTypeParserRuleCall_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDef__Group_5_0__1__Impl"


    // $ANTLR start "rule__TraitDef__Group__0"
    // InternalThicket.g:3987:1: rule__TraitDef__Group__0 : rule__TraitDef__Group__0__Impl rule__TraitDef__Group__1 ;
    public final void rule__TraitDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:3991:1: ( rule__TraitDef__Group__0__Impl rule__TraitDef__Group__1 )
            // InternalThicket.g:3992:2: rule__TraitDef__Group__0__Impl rule__TraitDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TraitDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__0"


    // $ANTLR start "rule__TraitDef__Group__0__Impl"
    // InternalThicket.g:3999:1: rule__TraitDef__Group__0__Impl : ( 'trait' ) ;
    public final void rule__TraitDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4003:1: ( ( 'trait' ) )
            // InternalThicket.g:4004:1: ( 'trait' )
            {
            // InternalThicket.g:4004:1: ( 'trait' )
            // InternalThicket.g:4005:1: 'trait'
            {
             before(grammarAccess.getTraitDefAccess().getTraitKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getTraitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__0__Impl"


    // $ANTLR start "rule__TraitDef__Group__1"
    // InternalThicket.g:4018:1: rule__TraitDef__Group__1 : rule__TraitDef__Group__1__Impl rule__TraitDef__Group__2 ;
    public final void rule__TraitDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4022:1: ( rule__TraitDef__Group__1__Impl rule__TraitDef__Group__2 )
            // InternalThicket.g:4023:2: rule__TraitDef__Group__1__Impl rule__TraitDef__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TraitDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__1"


    // $ANTLR start "rule__TraitDef__Group__1__Impl"
    // InternalThicket.g:4030:1: rule__TraitDef__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__TraitDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4034:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:4035:1: ( RULE_IDENT )
            {
            // InternalThicket.g:4035:1: ( RULE_IDENT )
            // InternalThicket.g:4036:1: RULE_IDENT
            {
             before(grammarAccess.getTraitDefAccess().getIdentTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getIdentTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__1__Impl"


    // $ANTLR start "rule__TraitDef__Group__2"
    // InternalThicket.g:4047:1: rule__TraitDef__Group__2 : rule__TraitDef__Group__2__Impl rule__TraitDef__Group__3 ;
    public final void rule__TraitDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4051:1: ( rule__TraitDef__Group__2__Impl rule__TraitDef__Group__3 )
            // InternalThicket.g:4052:2: rule__TraitDef__Group__2__Impl rule__TraitDef__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TraitDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__2"


    // $ANTLR start "rule__TraitDef__Group__2__Impl"
    // InternalThicket.g:4059:1: rule__TraitDef__Group__2__Impl : ( rulegenerics ) ;
    public final void rule__TraitDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4063:1: ( ( rulegenerics ) )
            // InternalThicket.g:4064:1: ( rulegenerics )
            {
            // InternalThicket.g:4064:1: ( rulegenerics )
            // InternalThicket.g:4065:1: rulegenerics
            {
             before(grammarAccess.getTraitDefAccess().getGenericsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getTraitDefAccess().getGenericsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__2__Impl"


    // $ANTLR start "rule__TraitDef__Group__3"
    // InternalThicket.g:4076:1: rule__TraitDef__Group__3 : rule__TraitDef__Group__3__Impl rule__TraitDef__Group__4 ;
    public final void rule__TraitDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4080:1: ( rule__TraitDef__Group__3__Impl rule__TraitDef__Group__4 )
            // InternalThicket.g:4081:2: rule__TraitDef__Group__3__Impl rule__TraitDef__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__TraitDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__3"


    // $ANTLR start "rule__TraitDef__Group__3__Impl"
    // InternalThicket.g:4088:1: rule__TraitDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TraitDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4092:1: ( ( '{' ) )
            // InternalThicket.g:4093:1: ( '{' )
            {
            // InternalThicket.g:4093:1: ( '{' )
            // InternalThicket.g:4094:1: '{'
            {
             before(grammarAccess.getTraitDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__3__Impl"


    // $ANTLR start "rule__TraitDef__Group__4"
    // InternalThicket.g:4107:1: rule__TraitDef__Group__4 : rule__TraitDef__Group__4__Impl rule__TraitDef__Group__5 ;
    public final void rule__TraitDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4111:1: ( rule__TraitDef__Group__4__Impl rule__TraitDef__Group__5 )
            // InternalThicket.g:4112:2: rule__TraitDef__Group__4__Impl rule__TraitDef__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__TraitDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__4"


    // $ANTLR start "rule__TraitDef__Group__4__Impl"
    // InternalThicket.g:4119:1: rule__TraitDef__Group__4__Impl : ( ( rule__TraitDef__Alternatives_4 )* ) ;
    public final void rule__TraitDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4123:1: ( ( ( rule__TraitDef__Alternatives_4 )* ) )
            // InternalThicket.g:4124:1: ( ( rule__TraitDef__Alternatives_4 )* )
            {
            // InternalThicket.g:4124:1: ( ( rule__TraitDef__Alternatives_4 )* )
            // InternalThicket.g:4125:1: ( rule__TraitDef__Alternatives_4 )*
            {
             before(grammarAccess.getTraitDefAccess().getAlternatives_4()); 
            // InternalThicket.g:4126:1: ( rule__TraitDef__Alternatives_4 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_IDENT||LA35_0==33||LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalThicket.g:4126:2: rule__TraitDef__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__TraitDef__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTraitDefAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__4__Impl"


    // $ANTLR start "rule__TraitDef__Group__5"
    // InternalThicket.g:4136:1: rule__TraitDef__Group__5 : rule__TraitDef__Group__5__Impl rule__TraitDef__Group__6 ;
    public final void rule__TraitDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4140:1: ( rule__TraitDef__Group__5__Impl rule__TraitDef__Group__6 )
            // InternalThicket.g:4141:2: rule__TraitDef__Group__5__Impl rule__TraitDef__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__TraitDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__5"


    // $ANTLR start "rule__TraitDef__Group__5__Impl"
    // InternalThicket.g:4148:1: rule__TraitDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TraitDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4152:1: ( ( '}' ) )
            // InternalThicket.g:4153:1: ( '}' )
            {
            // InternalThicket.g:4153:1: ( '}' )
            // InternalThicket.g:4154:1: '}'
            {
             before(grammarAccess.getTraitDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__5__Impl"


    // $ANTLR start "rule__TraitDef__Group__6"
    // InternalThicket.g:4167:1: rule__TraitDef__Group__6 : rule__TraitDef__Group__6__Impl rule__TraitDef__Group__7 ;
    public final void rule__TraitDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4171:1: ( rule__TraitDef__Group__6__Impl rule__TraitDef__Group__7 )
            // InternalThicket.g:4172:2: rule__TraitDef__Group__6__Impl rule__TraitDef__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__TraitDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__6"


    // $ANTLR start "rule__TraitDef__Group__6__Impl"
    // InternalThicket.g:4179:1: rule__TraitDef__Group__6__Impl : ( '{' ) ;
    public final void rule__TraitDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4183:1: ( ( '{' ) )
            // InternalThicket.g:4184:1: ( '{' )
            {
            // InternalThicket.g:4184:1: ( '{' )
            // InternalThicket.g:4185:1: '{'
            {
             before(grammarAccess.getTraitDefAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__6__Impl"


    // $ANTLR start "rule__TraitDef__Group__7"
    // InternalThicket.g:4198:1: rule__TraitDef__Group__7 : rule__TraitDef__Group__7__Impl rule__TraitDef__Group__8 ;
    public final void rule__TraitDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4202:1: ( rule__TraitDef__Group__7__Impl rule__TraitDef__Group__8 )
            // InternalThicket.g:4203:2: rule__TraitDef__Group__7__Impl rule__TraitDef__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__TraitDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__7"


    // $ANTLR start "rule__TraitDef__Group__7__Impl"
    // InternalThicket.g:4210:1: rule__TraitDef__Group__7__Impl : ( ( rulemethodTrait )* ) ;
    public final void rule__TraitDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4214:1: ( ( ( rulemethodTrait )* ) )
            // InternalThicket.g:4215:1: ( ( rulemethodTrait )* )
            {
            // InternalThicket.g:4215:1: ( ( rulemethodTrait )* )
            // InternalThicket.g:4216:1: ( rulemethodTrait )*
            {
             before(grammarAccess.getTraitDefAccess().getMethodTraitParserRuleCall_7()); 
            // InternalThicket.g:4217:1: ( rulemethodTrait )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalThicket.g:4217:3: rulemethodTrait
            	    {
            	    pushFollow(FOLLOW_35);
            	    rulemethodTrait();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTraitDefAccess().getMethodTraitParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__7__Impl"


    // $ANTLR start "rule__TraitDef__Group__8"
    // InternalThicket.g:4227:1: rule__TraitDef__Group__8 : rule__TraitDef__Group__8__Impl ;
    public final void rule__TraitDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4231:1: ( rule__TraitDef__Group__8__Impl )
            // InternalThicket.g:4232:2: rule__TraitDef__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraitDef__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__8"


    // $ANTLR start "rule__TraitDef__Group__8__Impl"
    // InternalThicket.g:4238:1: rule__TraitDef__Group__8__Impl : ( '}' ) ;
    public final void rule__TraitDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4242:1: ( ( '}' ) )
            // InternalThicket.g:4243:1: ( '}' )
            {
            // InternalThicket.g:4243:1: ( '}' )
            // InternalThicket.g:4244:1: '}'
            {
             before(grammarAccess.getTraitDefAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group__8__Impl"


    // $ANTLR start "rule__TraitDef__Group_4_0__0"
    // InternalThicket.g:4275:1: rule__TraitDef__Group_4_0__0 : rule__TraitDef__Group_4_0__0__Impl rule__TraitDef__Group_4_0__1 ;
    public final void rule__TraitDef__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4279:1: ( rule__TraitDef__Group_4_0__0__Impl rule__TraitDef__Group_4_0__1 )
            // InternalThicket.g:4280:2: rule__TraitDef__Group_4_0__0__Impl rule__TraitDef__Group_4_0__1
            {
            pushFollow(FOLLOW_15);
            rule__TraitDef__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraitDef__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group_4_0__0"


    // $ANTLR start "rule__TraitDef__Group_4_0__0__Impl"
    // InternalThicket.g:4287:1: rule__TraitDef__Group_4_0__0__Impl : ( '+' ) ;
    public final void rule__TraitDef__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4291:1: ( ( '+' ) )
            // InternalThicket.g:4292:1: ( '+' )
            {
            // InternalThicket.g:4292:1: ( '+' )
            // InternalThicket.g:4293:1: '+'
            {
             before(grammarAccess.getTraitDefAccess().getPlusSignKeyword_4_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTraitDefAccess().getPlusSignKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group_4_0__0__Impl"


    // $ANTLR start "rule__TraitDef__Group_4_0__1"
    // InternalThicket.g:4306:1: rule__TraitDef__Group_4_0__1 : rule__TraitDef__Group_4_0__1__Impl ;
    public final void rule__TraitDef__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4310:1: ( rule__TraitDef__Group_4_0__1__Impl )
            // InternalThicket.g:4311:2: rule__TraitDef__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraitDef__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group_4_0__1"


    // $ANTLR start "rule__TraitDef__Group_4_0__1__Impl"
    // InternalThicket.g:4317:1: rule__TraitDef__Group_4_0__1__Impl : ( ruletype ) ;
    public final void rule__TraitDef__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4321:1: ( ( ruletype ) )
            // InternalThicket.g:4322:1: ( ruletype )
            {
            // InternalThicket.g:4322:1: ( ruletype )
            // InternalThicket.g:4323:1: ruletype
            {
             before(grammarAccess.getTraitDefAccess().getTypeParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTraitDefAccess().getTypeParserRuleCall_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraitDef__Group_4_0__1__Impl"


    // $ANTLR start "rule__MethodClass__Group__0"
    // InternalThicket.g:4338:1: rule__MethodClass__Group__0 : rule__MethodClass__Group__0__Impl rule__MethodClass__Group__1 ;
    public final void rule__MethodClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4342:1: ( rule__MethodClass__Group__0__Impl rule__MethodClass__Group__1 )
            // InternalThicket.g:4343:2: rule__MethodClass__Group__0__Impl rule__MethodClass__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MethodClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__0"


    // $ANTLR start "rule__MethodClass__Group__0__Impl"
    // InternalThicket.g:4350:1: rule__MethodClass__Group__0__Impl : ( 'def' ) ;
    public final void rule__MethodClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4354:1: ( ( 'def' ) )
            // InternalThicket.g:4355:1: ( 'def' )
            {
            // InternalThicket.g:4355:1: ( 'def' )
            // InternalThicket.g:4356:1: 'def'
            {
             before(grammarAccess.getMethodClassAccess().getDefKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMethodClassAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__0__Impl"


    // $ANTLR start "rule__MethodClass__Group__1"
    // InternalThicket.g:4369:1: rule__MethodClass__Group__1 : rule__MethodClass__Group__1__Impl rule__MethodClass__Group__2 ;
    public final void rule__MethodClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4373:1: ( rule__MethodClass__Group__1__Impl rule__MethodClass__Group__2 )
            // InternalThicket.g:4374:2: rule__MethodClass__Group__1__Impl rule__MethodClass__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MethodClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__1"


    // $ANTLR start "rule__MethodClass__Group__1__Impl"
    // InternalThicket.g:4381:1: rule__MethodClass__Group__1__Impl : ( ( rule__MethodClass__Group_1__0 )? ) ;
    public final void rule__MethodClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4385:1: ( ( ( rule__MethodClass__Group_1__0 )? ) )
            // InternalThicket.g:4386:1: ( ( rule__MethodClass__Group_1__0 )? )
            {
            // InternalThicket.g:4386:1: ( ( rule__MethodClass__Group_1__0 )? )
            // InternalThicket.g:4387:1: ( rule__MethodClass__Group_1__0 )?
            {
             before(grammarAccess.getMethodClassAccess().getGroup_1()); 
            // InternalThicket.g:4388:1: ( rule__MethodClass__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==21) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalThicket.g:4388:2: rule__MethodClass__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodClass__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodClassAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__1__Impl"


    // $ANTLR start "rule__MethodClass__Group__2"
    // InternalThicket.g:4398:1: rule__MethodClass__Group__2 : rule__MethodClass__Group__2__Impl rule__MethodClass__Group__3 ;
    public final void rule__MethodClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4402:1: ( rule__MethodClass__Group__2__Impl rule__MethodClass__Group__3 )
            // InternalThicket.g:4403:2: rule__MethodClass__Group__2__Impl rule__MethodClass__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__MethodClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__2"


    // $ANTLR start "rule__MethodClass__Group__2__Impl"
    // InternalThicket.g:4410:1: rule__MethodClass__Group__2__Impl : ( ruleidentOrOp ) ;
    public final void rule__MethodClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4414:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:4415:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:4415:1: ( ruleidentOrOp )
            // InternalThicket.g:4416:1: ruleidentOrOp
            {
             before(grammarAccess.getMethodClassAccess().getIdentOrOpParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getMethodClassAccess().getIdentOrOpParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__2__Impl"


    // $ANTLR start "rule__MethodClass__Group__3"
    // InternalThicket.g:4427:1: rule__MethodClass__Group__3 : rule__MethodClass__Group__3__Impl rule__MethodClass__Group__4 ;
    public final void rule__MethodClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4431:1: ( rule__MethodClass__Group__3__Impl rule__MethodClass__Group__4 )
            // InternalThicket.g:4432:2: rule__MethodClass__Group__3__Impl rule__MethodClass__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__MethodClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__3"


    // $ANTLR start "rule__MethodClass__Group__3__Impl"
    // InternalThicket.g:4439:1: rule__MethodClass__Group__3__Impl : ( ( RULE_IDENT )* ) ;
    public final void rule__MethodClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4443:1: ( ( ( RULE_IDENT )* ) )
            // InternalThicket.g:4444:1: ( ( RULE_IDENT )* )
            {
            // InternalThicket.g:4444:1: ( ( RULE_IDENT )* )
            // InternalThicket.g:4445:1: ( RULE_IDENT )*
            {
             before(grammarAccess.getMethodClassAccess().getIdentTerminalRuleCall_3()); 
            // InternalThicket.g:4446:1: ( RULE_IDENT )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_IDENT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalThicket.g:4446:3: RULE_IDENT
            	    {
            	    match(input,RULE_IDENT,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getMethodClassAccess().getIdentTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__3__Impl"


    // $ANTLR start "rule__MethodClass__Group__4"
    // InternalThicket.g:4456:1: rule__MethodClass__Group__4 : rule__MethodClass__Group__4__Impl rule__MethodClass__Group__5 ;
    public final void rule__MethodClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4460:1: ( rule__MethodClass__Group__4__Impl rule__MethodClass__Group__5 )
            // InternalThicket.g:4461:2: rule__MethodClass__Group__4__Impl rule__MethodClass__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__MethodClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__4"


    // $ANTLR start "rule__MethodClass__Group__4__Impl"
    // InternalThicket.g:4468:1: rule__MethodClass__Group__4__Impl : ( '=' ) ;
    public final void rule__MethodClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4472:1: ( ( '=' ) )
            // InternalThicket.g:4473:1: ( '=' )
            {
            // InternalThicket.g:4473:1: ( '=' )
            // InternalThicket.g:4474:1: '='
            {
             before(grammarAccess.getMethodClassAccess().getEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodClassAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__4__Impl"


    // $ANTLR start "rule__MethodClass__Group__5"
    // InternalThicket.g:4487:1: rule__MethodClass__Group__5 : rule__MethodClass__Group__5__Impl ;
    public final void rule__MethodClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4491:1: ( rule__MethodClass__Group__5__Impl )
            // InternalThicket.g:4492:2: rule__MethodClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__5"


    // $ANTLR start "rule__MethodClass__Group__5__Impl"
    // InternalThicket.g:4498:1: rule__MethodClass__Group__5__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__MethodClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4502:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:4503:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:4503:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:4504:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:4504:1: ( ( ruleexpr ) )
            // InternalThicket.g:4505:1: ( ruleexpr )
            {
             before(grammarAccess.getMethodClassAccess().getExprParserRuleCall_5()); 
            // InternalThicket.g:4506:1: ( ruleexpr )
            // InternalThicket.g:4506:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getMethodClassAccess().getExprParserRuleCall_5()); 

            }

            // InternalThicket.g:4509:1: ( ( ruleexpr )* )
            // InternalThicket.g:4510:1: ( ruleexpr )*
            {
             before(grammarAccess.getMethodClassAccess().getExprParserRuleCall_5()); 
            // InternalThicket.g:4511:1: ( ruleexpr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_IDENT)||LA39_0==27||LA39_0==33||LA39_0==40||LA39_0==43||LA39_0==47||LA39_0==49) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalThicket.g:4511:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getMethodClassAccess().getExprParserRuleCall_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group__5__Impl"


    // $ANTLR start "rule__MethodClass__Group_1__0"
    // InternalThicket.g:4534:1: rule__MethodClass__Group_1__0 : rule__MethodClass__Group_1__0__Impl rule__MethodClass__Group_1__1 ;
    public final void rule__MethodClass__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4538:1: ( rule__MethodClass__Group_1__0__Impl rule__MethodClass__Group_1__1 )
            // InternalThicket.g:4539:2: rule__MethodClass__Group_1__0__Impl rule__MethodClass__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MethodClass__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodClass__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group_1__0"


    // $ANTLR start "rule__MethodClass__Group_1__0__Impl"
    // InternalThicket.g:4546:1: rule__MethodClass__Group_1__0__Impl : ( RULE_IDENT ) ;
    public final void rule__MethodClass__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4550:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:4551:1: ( RULE_IDENT )
            {
            // InternalThicket.g:4551:1: ( RULE_IDENT )
            // InternalThicket.g:4552:1: RULE_IDENT
            {
             before(grammarAccess.getMethodClassAccess().getIdentTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getMethodClassAccess().getIdentTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group_1__0__Impl"


    // $ANTLR start "rule__MethodClass__Group_1__1"
    // InternalThicket.g:4563:1: rule__MethodClass__Group_1__1 : rule__MethodClass__Group_1__1__Impl ;
    public final void rule__MethodClass__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4567:1: ( rule__MethodClass__Group_1__1__Impl )
            // InternalThicket.g:4568:2: rule__MethodClass__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodClass__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group_1__1"


    // $ANTLR start "rule__MethodClass__Group_1__1__Impl"
    // InternalThicket.g:4574:1: rule__MethodClass__Group_1__1__Impl : ( '.' ) ;
    public final void rule__MethodClass__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4578:1: ( ( '.' ) )
            // InternalThicket.g:4579:1: ( '.' )
            {
            // InternalThicket.g:4579:1: ( '.' )
            // InternalThicket.g:4580:1: '.'
            {
             before(grammarAccess.getMethodClassAccess().getFullStopKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMethodClassAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodClass__Group_1__1__Impl"


    // $ANTLR start "rule__MethodTrait__Group__0"
    // InternalThicket.g:4597:1: rule__MethodTrait__Group__0 : rule__MethodTrait__Group__0__Impl rule__MethodTrait__Group__1 ;
    public final void rule__MethodTrait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4601:1: ( rule__MethodTrait__Group__0__Impl rule__MethodTrait__Group__1 )
            // InternalThicket.g:4602:2: rule__MethodTrait__Group__0__Impl rule__MethodTrait__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MethodTrait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__0"


    // $ANTLR start "rule__MethodTrait__Group__0__Impl"
    // InternalThicket.g:4609:1: rule__MethodTrait__Group__0__Impl : ( 'def' ) ;
    public final void rule__MethodTrait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4613:1: ( ( 'def' ) )
            // InternalThicket.g:4614:1: ( 'def' )
            {
            // InternalThicket.g:4614:1: ( 'def' )
            // InternalThicket.g:4615:1: 'def'
            {
             before(grammarAccess.getMethodTraitAccess().getDefKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMethodTraitAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__0__Impl"


    // $ANTLR start "rule__MethodTrait__Group__1"
    // InternalThicket.g:4628:1: rule__MethodTrait__Group__1 : rule__MethodTrait__Group__1__Impl rule__MethodTrait__Group__2 ;
    public final void rule__MethodTrait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4632:1: ( rule__MethodTrait__Group__1__Impl rule__MethodTrait__Group__2 )
            // InternalThicket.g:4633:2: rule__MethodTrait__Group__1__Impl rule__MethodTrait__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__MethodTrait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__1"


    // $ANTLR start "rule__MethodTrait__Group__1__Impl"
    // InternalThicket.g:4640:1: rule__MethodTrait__Group__1__Impl : ( ruleidentOrOp ) ;
    public final void rule__MethodTrait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4644:1: ( ( ruleidentOrOp ) )
            // InternalThicket.g:4645:1: ( ruleidentOrOp )
            {
            // InternalThicket.g:4645:1: ( ruleidentOrOp )
            // InternalThicket.g:4646:1: ruleidentOrOp
            {
             before(grammarAccess.getMethodTraitAccess().getIdentOrOpParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleidentOrOp();

            state._fsp--;

             after(grammarAccess.getMethodTraitAccess().getIdentOrOpParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__1__Impl"


    // $ANTLR start "rule__MethodTrait__Group__2"
    // InternalThicket.g:4657:1: rule__MethodTrait__Group__2 : rule__MethodTrait__Group__2__Impl rule__MethodTrait__Group__3 ;
    public final void rule__MethodTrait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4661:1: ( rule__MethodTrait__Group__2__Impl rule__MethodTrait__Group__3 )
            // InternalThicket.g:4662:2: rule__MethodTrait__Group__2__Impl rule__MethodTrait__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__MethodTrait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__2"


    // $ANTLR start "rule__MethodTrait__Group__2__Impl"
    // InternalThicket.g:4669:1: rule__MethodTrait__Group__2__Impl : ( ( RULE_IDENT )* ) ;
    public final void rule__MethodTrait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4673:1: ( ( ( RULE_IDENT )* ) )
            // InternalThicket.g:4674:1: ( ( RULE_IDENT )* )
            {
            // InternalThicket.g:4674:1: ( ( RULE_IDENT )* )
            // InternalThicket.g:4675:1: ( RULE_IDENT )*
            {
             before(grammarAccess.getMethodTraitAccess().getIdentTerminalRuleCall_2()); 
            // InternalThicket.g:4676:1: ( RULE_IDENT )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_IDENT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalThicket.g:4676:3: RULE_IDENT
            	    {
            	    match(input,RULE_IDENT,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMethodTraitAccess().getIdentTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__2__Impl"


    // $ANTLR start "rule__MethodTrait__Group__3"
    // InternalThicket.g:4686:1: rule__MethodTrait__Group__3 : rule__MethodTrait__Group__3__Impl rule__MethodTrait__Group__4 ;
    public final void rule__MethodTrait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4690:1: ( rule__MethodTrait__Group__3__Impl rule__MethodTrait__Group__4 )
            // InternalThicket.g:4691:2: rule__MethodTrait__Group__3__Impl rule__MethodTrait__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__MethodTrait__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__3"


    // $ANTLR start "rule__MethodTrait__Group__3__Impl"
    // InternalThicket.g:4698:1: rule__MethodTrait__Group__3__Impl : ( '=' ) ;
    public final void rule__MethodTrait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4702:1: ( ( '=' ) )
            // InternalThicket.g:4703:1: ( '=' )
            {
            // InternalThicket.g:4703:1: ( '=' )
            // InternalThicket.g:4704:1: '='
            {
             before(grammarAccess.getMethodTraitAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodTraitAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__3__Impl"


    // $ANTLR start "rule__MethodTrait__Group__4"
    // InternalThicket.g:4717:1: rule__MethodTrait__Group__4 : rule__MethodTrait__Group__4__Impl ;
    public final void rule__MethodTrait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4721:1: ( rule__MethodTrait__Group__4__Impl )
            // InternalThicket.g:4722:2: rule__MethodTrait__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodTrait__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__4"


    // $ANTLR start "rule__MethodTrait__Group__4__Impl"
    // InternalThicket.g:4728:1: rule__MethodTrait__Group__4__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__MethodTrait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4732:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:4733:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:4733:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:4734:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:4734:1: ( ( ruleexpr ) )
            // InternalThicket.g:4735:1: ( ruleexpr )
            {
             before(grammarAccess.getMethodTraitAccess().getExprParserRuleCall_4()); 
            // InternalThicket.g:4736:1: ( ruleexpr )
            // InternalThicket.g:4736:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getMethodTraitAccess().getExprParserRuleCall_4()); 

            }

            // InternalThicket.g:4739:1: ( ( ruleexpr )* )
            // InternalThicket.g:4740:1: ( ruleexpr )*
            {
             before(grammarAccess.getMethodTraitAccess().getExprParserRuleCall_4()); 
            // InternalThicket.g:4741:1: ( ruleexpr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_IDENT)||LA41_0==27||LA41_0==33||LA41_0==40||LA41_0==43||LA41_0==47||LA41_0==49) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalThicket.g:4741:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getMethodTraitAccess().getExprParserRuleCall_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodTrait__Group__4__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // InternalThicket.g:4762:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4766:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalThicket.g:4767:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // InternalThicket.g:4774:1: rule__Expr__Group__0__Impl : ( ruleiexpr ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4778:1: ( ( ruleiexpr ) )
            // InternalThicket.g:4779:1: ( ruleiexpr )
            {
            // InternalThicket.g:4779:1: ( ruleiexpr )
            // InternalThicket.g:4780:1: ruleiexpr
            {
             before(grammarAccess.getExprAccess().getIexprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleiexpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getIexprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // InternalThicket.g:4791:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4795:1: ( rule__Expr__Group__1__Impl )
            // InternalThicket.g:4796:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // InternalThicket.g:4802:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4806:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // InternalThicket.g:4807:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // InternalThicket.g:4807:1: ( ( rule__Expr__Group_1__0 )* )
            // InternalThicket.g:4808:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // InternalThicket.g:4809:1: ( rule__Expr__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalThicket.g:4809:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // InternalThicket.g:4823:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4827:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalThicket.g:4828:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // InternalThicket.g:4835:1: rule__Expr__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4839:1: ( ( ',' ) )
            // InternalThicket.g:4840:1: ( ',' )
            {
            // InternalThicket.g:4840:1: ( ',' )
            // InternalThicket.g:4841:1: ','
            {
             before(grammarAccess.getExprAccess().getCommaKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExprAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // InternalThicket.g:4854:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4858:1: ( rule__Expr__Group_1__1__Impl )
            // InternalThicket.g:4859:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // InternalThicket.g:4865:1: rule__Expr__Group_1__1__Impl : ( ruleiexpr ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4869:1: ( ( ruleiexpr ) )
            // InternalThicket.g:4870:1: ( ruleiexpr )
            {
            // InternalThicket.g:4870:1: ( ruleiexpr )
            // InternalThicket.g:4871:1: ruleiexpr
            {
             before(grammarAccess.getExprAccess().getIexprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleiexpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getIexprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Iexpr__Group__0"
    // InternalThicket.g:4886:1: rule__Iexpr__Group__0 : rule__Iexpr__Group__0__Impl rule__Iexpr__Group__1 ;
    public final void rule__Iexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4890:1: ( rule__Iexpr__Group__0__Impl rule__Iexpr__Group__1 )
            // InternalThicket.g:4891:2: rule__Iexpr__Group__0__Impl rule__Iexpr__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Iexpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iexpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group__0"


    // $ANTLR start "rule__Iexpr__Group__0__Impl"
    // InternalThicket.g:4898:1: rule__Iexpr__Group__0__Impl : ( rulesexpr ) ;
    public final void rule__Iexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4902:1: ( ( rulesexpr ) )
            // InternalThicket.g:4903:1: ( rulesexpr )
            {
            // InternalThicket.g:4903:1: ( rulesexpr )
            // InternalThicket.g:4904:1: rulesexpr
            {
             before(grammarAccess.getIexprAccess().getSexprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getIexprAccess().getSexprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group__0__Impl"


    // $ANTLR start "rule__Iexpr__Group__1"
    // InternalThicket.g:4915:1: rule__Iexpr__Group__1 : rule__Iexpr__Group__1__Impl ;
    public final void rule__Iexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4919:1: ( rule__Iexpr__Group__1__Impl )
            // InternalThicket.g:4920:2: rule__Iexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iexpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group__1"


    // $ANTLR start "rule__Iexpr__Group__1__Impl"
    // InternalThicket.g:4926:1: rule__Iexpr__Group__1__Impl : ( ( rule__Iexpr__Group_1__0 )* ) ;
    public final void rule__Iexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4930:1: ( ( ( rule__Iexpr__Group_1__0 )* ) )
            // InternalThicket.g:4931:1: ( ( rule__Iexpr__Group_1__0 )* )
            {
            // InternalThicket.g:4931:1: ( ( rule__Iexpr__Group_1__0 )* )
            // InternalThicket.g:4932:1: ( rule__Iexpr__Group_1__0 )*
            {
             before(grammarAccess.getIexprAccess().getGroup_1()); 
            // InternalThicket.g:4933:1: ( rule__Iexpr__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==21) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalThicket.g:4933:2: rule__Iexpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Iexpr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getIexprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group__1__Impl"


    // $ANTLR start "rule__Iexpr__Group_1__0"
    // InternalThicket.g:4947:1: rule__Iexpr__Group_1__0 : rule__Iexpr__Group_1__0__Impl rule__Iexpr__Group_1__1 ;
    public final void rule__Iexpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4951:1: ( rule__Iexpr__Group_1__0__Impl rule__Iexpr__Group_1__1 )
            // InternalThicket.g:4952:2: rule__Iexpr__Group_1__0__Impl rule__Iexpr__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Iexpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Iexpr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group_1__0"


    // $ANTLR start "rule__Iexpr__Group_1__0__Impl"
    // InternalThicket.g:4959:1: rule__Iexpr__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Iexpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4963:1: ( ( '.' ) )
            // InternalThicket.g:4964:1: ( '.' )
            {
            // InternalThicket.g:4964:1: ( '.' )
            // InternalThicket.g:4965:1: '.'
            {
             before(grammarAccess.getIexprAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIexprAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group_1__0__Impl"


    // $ANTLR start "rule__Iexpr__Group_1__1"
    // InternalThicket.g:4978:1: rule__Iexpr__Group_1__1 : rule__Iexpr__Group_1__1__Impl ;
    public final void rule__Iexpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4982:1: ( rule__Iexpr__Group_1__1__Impl )
            // InternalThicket.g:4983:2: rule__Iexpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Iexpr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group_1__1"


    // $ANTLR start "rule__Iexpr__Group_1__1__Impl"
    // InternalThicket.g:4989:1: rule__Iexpr__Group_1__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Iexpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:4993:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:4994:1: ( RULE_IDENT )
            {
            // InternalThicket.g:4994:1: ( RULE_IDENT )
            // InternalThicket.g:4995:1: RULE_IDENT
            {
             before(grammarAccess.getIexprAccess().getIdentTerminalRuleCall_1_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getIexprAccess().getIdentTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Iexpr__Group_1__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_4__0"
    // InternalThicket.g:5010:1: rule__Sexpr__Group_4__0 : rule__Sexpr__Group_4__0__Impl rule__Sexpr__Group_4__1 ;
    public final void rule__Sexpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5014:1: ( rule__Sexpr__Group_4__0__Impl rule__Sexpr__Group_4__1 )
            // InternalThicket.g:5015:2: rule__Sexpr__Group_4__0__Impl rule__Sexpr__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__0"


    // $ANTLR start "rule__Sexpr__Group_4__0__Impl"
    // InternalThicket.g:5022:1: rule__Sexpr__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Sexpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5026:1: ( ( '(' ) )
            // InternalThicket.g:5027:1: ( '(' )
            {
            // InternalThicket.g:5027:1: ( '(' )
            // InternalThicket.g:5028:1: '('
            {
             before(grammarAccess.getSexprAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_4__1"
    // InternalThicket.g:5041:1: rule__Sexpr__Group_4__1 : rule__Sexpr__Group_4__1__Impl rule__Sexpr__Group_4__2 ;
    public final void rule__Sexpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5045:1: ( rule__Sexpr__Group_4__1__Impl rule__Sexpr__Group_4__2 )
            // InternalThicket.g:5046:2: rule__Sexpr__Group_4__1__Impl rule__Sexpr__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__Sexpr__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__1"


    // $ANTLR start "rule__Sexpr__Group_4__1__Impl"
    // InternalThicket.g:5053:1: rule__Sexpr__Group_4__1__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5057:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:5058:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:5058:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:5059:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:5059:1: ( ( ruleexpr ) )
            // InternalThicket.g:5060:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_4_1()); 
            // InternalThicket.g:5061:1: ( ruleexpr )
            // InternalThicket.g:5061:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_4_1()); 

            }

            // InternalThicket.g:5064:1: ( ( ruleexpr )* )
            // InternalThicket.g:5065:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_4_1()); 
            // InternalThicket.g:5066:1: ( ruleexpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_IDENT)||LA44_0==27||LA44_0==33||LA44_0==40||LA44_0==43||LA44_0==47||LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalThicket.g:5066:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_4__2"
    // InternalThicket.g:5077:1: rule__Sexpr__Group_4__2 : rule__Sexpr__Group_4__2__Impl ;
    public final void rule__Sexpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5081:1: ( rule__Sexpr__Group_4__2__Impl )
            // InternalThicket.g:5082:2: rule__Sexpr__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__2"


    // $ANTLR start "rule__Sexpr__Group_4__2__Impl"
    // InternalThicket.g:5088:1: rule__Sexpr__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Sexpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5092:1: ( ( ')' ) )
            // InternalThicket.g:5093:1: ( ')' )
            {
            // InternalThicket.g:5093:1: ( ')' )
            // InternalThicket.g:5094:1: ')'
            {
             before(grammarAccess.getSexprAccess().getRightParenthesisKeyword_4_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_4__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_5__0"
    // InternalThicket.g:5113:1: rule__Sexpr__Group_5__0 : rule__Sexpr__Group_5__0__Impl rule__Sexpr__Group_5__1 ;
    public final void rule__Sexpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5117:1: ( rule__Sexpr__Group_5__0__Impl rule__Sexpr__Group_5__1 )
            // InternalThicket.g:5118:2: rule__Sexpr__Group_5__0__Impl rule__Sexpr__Group_5__1
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__0"


    // $ANTLR start "rule__Sexpr__Group_5__0__Impl"
    // InternalThicket.g:5125:1: rule__Sexpr__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Sexpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5129:1: ( ( '{' ) )
            // InternalThicket.g:5130:1: ( '{' )
            {
            // InternalThicket.g:5130:1: ( '{' )
            // InternalThicket.g:5131:1: '{'
            {
             before(grammarAccess.getSexprAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_5__1"
    // InternalThicket.g:5144:1: rule__Sexpr__Group_5__1 : rule__Sexpr__Group_5__1__Impl rule__Sexpr__Group_5__2 ;
    public final void rule__Sexpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5148:1: ( rule__Sexpr__Group_5__1__Impl rule__Sexpr__Group_5__2 )
            // InternalThicket.g:5149:2: rule__Sexpr__Group_5__1__Impl rule__Sexpr__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Sexpr__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__1"


    // $ANTLR start "rule__Sexpr__Group_5__1__Impl"
    // InternalThicket.g:5156:1: rule__Sexpr__Group_5__1__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5160:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:5161:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:5161:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:5162:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:5162:1: ( ( ruleexpr ) )
            // InternalThicket.g:5163:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_5_1()); 
            // InternalThicket.g:5164:1: ( ruleexpr )
            // InternalThicket.g:5164:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_5_1()); 

            }

            // InternalThicket.g:5167:1: ( ( ruleexpr )* )
            // InternalThicket.g:5168:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_5_1()); 
            // InternalThicket.g:5169:1: ( ruleexpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_IDENT)||LA45_0==27||LA45_0==33||LA45_0==40||LA45_0==43||LA45_0==47||LA45_0==49) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalThicket.g:5169:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_5__2"
    // InternalThicket.g:5180:1: rule__Sexpr__Group_5__2 : rule__Sexpr__Group_5__2__Impl ;
    public final void rule__Sexpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5184:1: ( rule__Sexpr__Group_5__2__Impl )
            // InternalThicket.g:5185:2: rule__Sexpr__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__2"


    // $ANTLR start "rule__Sexpr__Group_5__2__Impl"
    // InternalThicket.g:5191:1: rule__Sexpr__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Sexpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5195:1: ( ( '}' ) )
            // InternalThicket.g:5196:1: ( '}' )
            {
            // InternalThicket.g:5196:1: ( '}' )
            // InternalThicket.g:5197:1: '}'
            {
             before(grammarAccess.getSexprAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_5__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_6__0"
    // InternalThicket.g:5216:1: rule__Sexpr__Group_6__0 : rule__Sexpr__Group_6__0__Impl rule__Sexpr__Group_6__1 ;
    public final void rule__Sexpr__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5220:1: ( rule__Sexpr__Group_6__0__Impl rule__Sexpr__Group_6__1 )
            // InternalThicket.g:5221:2: rule__Sexpr__Group_6__0__Impl rule__Sexpr__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Sexpr__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__0"


    // $ANTLR start "rule__Sexpr__Group_6__0__Impl"
    // InternalThicket.g:5228:1: rule__Sexpr__Group_6__0__Impl : ( '<' ) ;
    public final void rule__Sexpr__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5232:1: ( ( '<' ) )
            // InternalThicket.g:5233:1: ( '<' )
            {
            // InternalThicket.g:5233:1: ( '<' )
            // InternalThicket.g:5234:1: '<'
            {
             before(grammarAccess.getSexprAccess().getLessThanSignKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLessThanSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_6__1"
    // InternalThicket.g:5247:1: rule__Sexpr__Group_6__1 : rule__Sexpr__Group_6__1__Impl rule__Sexpr__Group_6__2 ;
    public final void rule__Sexpr__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5251:1: ( rule__Sexpr__Group_6__1__Impl rule__Sexpr__Group_6__2 )
            // InternalThicket.g:5252:2: rule__Sexpr__Group_6__1__Impl rule__Sexpr__Group_6__2
            {
            pushFollow(FOLLOW_38);
            rule__Sexpr__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__1"


    // $ANTLR start "rule__Sexpr__Group_6__1__Impl"
    // InternalThicket.g:5259:1: rule__Sexpr__Group_6__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Sexpr__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5263:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:5264:1: ( RULE_IDENT )
            {
            // InternalThicket.g:5264:1: ( RULE_IDENT )
            // InternalThicket.g:5265:1: RULE_IDENT
            {
             before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_6_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_6__2"
    // InternalThicket.g:5276:1: rule__Sexpr__Group_6__2 : rule__Sexpr__Group_6__2__Impl rule__Sexpr__Group_6__3 ;
    public final void rule__Sexpr__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5280:1: ( rule__Sexpr__Group_6__2__Impl rule__Sexpr__Group_6__3 )
            // InternalThicket.g:5281:2: rule__Sexpr__Group_6__2__Impl rule__Sexpr__Group_6__3
            {
            pushFollow(FOLLOW_38);
            rule__Sexpr__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__2"


    // $ANTLR start "rule__Sexpr__Group_6__2__Impl"
    // InternalThicket.g:5288:1: rule__Sexpr__Group_6__2__Impl : ( ( ruleattr )* ) ;
    public final void rule__Sexpr__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5292:1: ( ( ( ruleattr )* ) )
            // InternalThicket.g:5293:1: ( ( ruleattr )* )
            {
            // InternalThicket.g:5293:1: ( ( ruleattr )* )
            // InternalThicket.g:5294:1: ( ruleattr )*
            {
             before(grammarAccess.getSexprAccess().getAttrParserRuleCall_6_2()); 
            // InternalThicket.g:5295:1: ( ruleattr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_IDENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalThicket.g:5295:3: ruleattr
            	    {
            	    pushFollow(FOLLOW_24);
            	    ruleattr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getAttrParserRuleCall_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_6__3"
    // InternalThicket.g:5305:1: rule__Sexpr__Group_6__3 : rule__Sexpr__Group_6__3__Impl ;
    public final void rule__Sexpr__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5309:1: ( rule__Sexpr__Group_6__3__Impl )
            // InternalThicket.g:5310:2: rule__Sexpr__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__3"


    // $ANTLR start "rule__Sexpr__Group_6__3__Impl"
    // InternalThicket.g:5316:1: rule__Sexpr__Group_6__3__Impl : ( ( rule__Sexpr__Alternatives_6_3 ) ) ;
    public final void rule__Sexpr__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5320:1: ( ( ( rule__Sexpr__Alternatives_6_3 ) ) )
            // InternalThicket.g:5321:1: ( ( rule__Sexpr__Alternatives_6_3 ) )
            {
            // InternalThicket.g:5321:1: ( ( rule__Sexpr__Alternatives_6_3 ) )
            // InternalThicket.g:5322:1: ( rule__Sexpr__Alternatives_6_3 )
            {
             before(grammarAccess.getSexprAccess().getAlternatives_6_3()); 
            // InternalThicket.g:5323:1: ( rule__Sexpr__Alternatives_6_3 )
            // InternalThicket.g:5323:2: rule__Sexpr__Alternatives_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Alternatives_6_3();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getAlternatives_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6__3__Impl"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__0"
    // InternalThicket.g:5341:1: rule__Sexpr__Group_6_3_0__0 : rule__Sexpr__Group_6_3_0__0__Impl rule__Sexpr__Group_6_3_0__1 ;
    public final void rule__Sexpr__Group_6_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5345:1: ( rule__Sexpr__Group_6_3_0__0__Impl rule__Sexpr__Group_6_3_0__1 )
            // InternalThicket.g:5346:2: rule__Sexpr__Group_6_3_0__0__Impl rule__Sexpr__Group_6_3_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_6_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__0"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__0__Impl"
    // InternalThicket.g:5353:1: rule__Sexpr__Group_6_3_0__0__Impl : ( '>' ) ;
    public final void rule__Sexpr__Group_6_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5357:1: ( ( '>' ) )
            // InternalThicket.g:5358:1: ( '>' )
            {
            // InternalThicket.g:5358:1: ( '>' )
            // InternalThicket.g:5359:1: '>'
            {
             before(grammarAccess.getSexprAccess().getGreaterThanSignKeyword_6_3_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getGreaterThanSignKeyword_6_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__1"
    // InternalThicket.g:5372:1: rule__Sexpr__Group_6_3_0__1 : rule__Sexpr__Group_6_3_0__1__Impl rule__Sexpr__Group_6_3_0__2 ;
    public final void rule__Sexpr__Group_6_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5376:1: ( rule__Sexpr__Group_6_3_0__1__Impl rule__Sexpr__Group_6_3_0__2 )
            // InternalThicket.g:5377:2: rule__Sexpr__Group_6_3_0__1__Impl rule__Sexpr__Group_6_3_0__2
            {
            pushFollow(FOLLOW_39);
            rule__Sexpr__Group_6_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__1"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__1__Impl"
    // InternalThicket.g:5384:1: rule__Sexpr__Group_6_3_0__1__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_6_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5388:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:5389:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:5389:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:5390:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:5390:1: ( ( ruleexpr ) )
            // InternalThicket.g:5391:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_6_3_0_1()); 
            // InternalThicket.g:5392:1: ( ruleexpr )
            // InternalThicket.g:5392:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_6_3_0_1()); 

            }

            // InternalThicket.g:5395:1: ( ( ruleexpr )* )
            // InternalThicket.g:5396:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_6_3_0_1()); 
            // InternalThicket.g:5397:1: ( ruleexpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_INT && LA47_0<=RULE_IDENT)||LA47_0==27||LA47_0==33||LA47_0==40||LA47_0==43||LA47_0==47||LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalThicket.g:5397:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_6_3_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__2"
    // InternalThicket.g:5408:1: rule__Sexpr__Group_6_3_0__2 : rule__Sexpr__Group_6_3_0__2__Impl rule__Sexpr__Group_6_3_0__3 ;
    public final void rule__Sexpr__Group_6_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5412:1: ( rule__Sexpr__Group_6_3_0__2__Impl rule__Sexpr__Group_6_3_0__3 )
            // InternalThicket.g:5413:2: rule__Sexpr__Group_6_3_0__2__Impl rule__Sexpr__Group_6_3_0__3
            {
            pushFollow(FOLLOW_40);
            rule__Sexpr__Group_6_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__2"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__2__Impl"
    // InternalThicket.g:5420:1: rule__Sexpr__Group_6_3_0__2__Impl : ( '</' ) ;
    public final void rule__Sexpr__Group_6_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5424:1: ( ( '</' ) )
            // InternalThicket.g:5425:1: ( '</' )
            {
            // InternalThicket.g:5425:1: ( '</' )
            // InternalThicket.g:5426:1: '</'
            {
             before(grammarAccess.getSexprAccess().getLessThanSignSolidusKeyword_6_3_0_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLessThanSignSolidusKeyword_6_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__3"
    // InternalThicket.g:5439:1: rule__Sexpr__Group_6_3_0__3 : rule__Sexpr__Group_6_3_0__3__Impl rule__Sexpr__Group_6_3_0__4 ;
    public final void rule__Sexpr__Group_6_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5443:1: ( rule__Sexpr__Group_6_3_0__3__Impl rule__Sexpr__Group_6_3_0__4 )
            // InternalThicket.g:5444:2: rule__Sexpr__Group_6_3_0__3__Impl rule__Sexpr__Group_6_3_0__4
            {
            pushFollow(FOLLOW_40);
            rule__Sexpr__Group_6_3_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6_3_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__3"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__3__Impl"
    // InternalThicket.g:5451:1: rule__Sexpr__Group_6_3_0__3__Impl : ( ( RULE_IDENT )? ) ;
    public final void rule__Sexpr__Group_6_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5455:1: ( ( ( RULE_IDENT )? ) )
            // InternalThicket.g:5456:1: ( ( RULE_IDENT )? )
            {
            // InternalThicket.g:5456:1: ( ( RULE_IDENT )? )
            // InternalThicket.g:5457:1: ( RULE_IDENT )?
            {
             before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_6_3_0_3()); 
            // InternalThicket.g:5458:1: ( RULE_IDENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_IDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalThicket.g:5458:3: RULE_IDENT
                    {
                    match(input,RULE_IDENT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_6_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__3__Impl"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__4"
    // InternalThicket.g:5468:1: rule__Sexpr__Group_6_3_0__4 : rule__Sexpr__Group_6_3_0__4__Impl ;
    public final void rule__Sexpr__Group_6_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5472:1: ( rule__Sexpr__Group_6_3_0__4__Impl )
            // InternalThicket.g:5473:2: rule__Sexpr__Group_6_3_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_6_3_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__4"


    // $ANTLR start "rule__Sexpr__Group_6_3_0__4__Impl"
    // InternalThicket.g:5479:1: rule__Sexpr__Group_6_3_0__4__Impl : ( '>' ) ;
    public final void rule__Sexpr__Group_6_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5483:1: ( ( '>' ) )
            // InternalThicket.g:5484:1: ( '>' )
            {
            // InternalThicket.g:5484:1: ( '>' )
            // InternalThicket.g:5485:1: '>'
            {
             before(grammarAccess.getSexprAccess().getGreaterThanSignKeyword_6_3_0_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getGreaterThanSignKeyword_6_3_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_6_3_0__4__Impl"


    // $ANTLR start "rule__Sexpr__Group_7__0"
    // InternalThicket.g:5508:1: rule__Sexpr__Group_7__0 : rule__Sexpr__Group_7__0__Impl rule__Sexpr__Group_7__1 ;
    public final void rule__Sexpr__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5512:1: ( rule__Sexpr__Group_7__0__Impl rule__Sexpr__Group_7__1 )
            // InternalThicket.g:5513:2: rule__Sexpr__Group_7__0__Impl rule__Sexpr__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Sexpr__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__0"


    // $ANTLR start "rule__Sexpr__Group_7__0__Impl"
    // InternalThicket.g:5520:1: rule__Sexpr__Group_7__0__Impl : ( 'for' ) ;
    public final void rule__Sexpr__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5524:1: ( ( 'for' ) )
            // InternalThicket.g:5525:1: ( 'for' )
            {
            // InternalThicket.g:5525:1: ( 'for' )
            // InternalThicket.g:5526:1: 'for'
            {
             before(grammarAccess.getSexprAccess().getForKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getForKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_7__1"
    // InternalThicket.g:5539:1: rule__Sexpr__Group_7__1 : rule__Sexpr__Group_7__1__Impl rule__Sexpr__Group_7__2 ;
    public final void rule__Sexpr__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5543:1: ( rule__Sexpr__Group_7__1__Impl rule__Sexpr__Group_7__2 )
            // InternalThicket.g:5544:2: rule__Sexpr__Group_7__1__Impl rule__Sexpr__Group_7__2
            {
            pushFollow(FOLLOW_41);
            rule__Sexpr__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__1"


    // $ANTLR start "rule__Sexpr__Group_7__1__Impl"
    // InternalThicket.g:5551:1: rule__Sexpr__Group_7__1__Impl : ( ( ( rule__Sexpr__Group_7_1__0 ) ) ( ( rule__Sexpr__Group_7_1__0 )* ) ) ;
    public final void rule__Sexpr__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5555:1: ( ( ( ( rule__Sexpr__Group_7_1__0 ) ) ( ( rule__Sexpr__Group_7_1__0 )* ) ) )
            // InternalThicket.g:5556:1: ( ( ( rule__Sexpr__Group_7_1__0 ) ) ( ( rule__Sexpr__Group_7_1__0 )* ) )
            {
            // InternalThicket.g:5556:1: ( ( ( rule__Sexpr__Group_7_1__0 ) ) ( ( rule__Sexpr__Group_7_1__0 )* ) )
            // InternalThicket.g:5557:1: ( ( rule__Sexpr__Group_7_1__0 ) ) ( ( rule__Sexpr__Group_7_1__0 )* )
            {
            // InternalThicket.g:5557:1: ( ( rule__Sexpr__Group_7_1__0 ) )
            // InternalThicket.g:5558:1: ( rule__Sexpr__Group_7_1__0 )
            {
             before(grammarAccess.getSexprAccess().getGroup_7_1()); 
            // InternalThicket.g:5559:1: ( rule__Sexpr__Group_7_1__0 )
            // InternalThicket.g:5559:2: rule__Sexpr__Group_7_1__0
            {
            pushFollow(FOLLOW_24);
            rule__Sexpr__Group_7_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getGroup_7_1()); 

            }

            // InternalThicket.g:5562:1: ( ( rule__Sexpr__Group_7_1__0 )* )
            // InternalThicket.g:5563:1: ( rule__Sexpr__Group_7_1__0 )*
            {
             before(grammarAccess.getSexprAccess().getGroup_7_1()); 
            // InternalThicket.g:5564:1: ( rule__Sexpr__Group_7_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_IDENT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalThicket.g:5564:2: rule__Sexpr__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Sexpr__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getGroup_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_7__2"
    // InternalThicket.g:5575:1: rule__Sexpr__Group_7__2 : rule__Sexpr__Group_7__2__Impl rule__Sexpr__Group_7__3 ;
    public final void rule__Sexpr__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5579:1: ( rule__Sexpr__Group_7__2__Impl rule__Sexpr__Group_7__3 )
            // InternalThicket.g:5580:2: rule__Sexpr__Group_7__2__Impl rule__Sexpr__Group_7__3
            {
            pushFollow(FOLLOW_41);
            rule__Sexpr__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__2"


    // $ANTLR start "rule__Sexpr__Group_7__2__Impl"
    // InternalThicket.g:5587:1: rule__Sexpr__Group_7__2__Impl : ( ( rule__Sexpr__Group_7_2__0 )* ) ;
    public final void rule__Sexpr__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5591:1: ( ( ( rule__Sexpr__Group_7_2__0 )* ) )
            // InternalThicket.g:5592:1: ( ( rule__Sexpr__Group_7_2__0 )* )
            {
            // InternalThicket.g:5592:1: ( ( rule__Sexpr__Group_7_2__0 )* )
            // InternalThicket.g:5593:1: ( rule__Sexpr__Group_7_2__0 )*
            {
             before(grammarAccess.getSexprAccess().getGroup_7_2()); 
            // InternalThicket.g:5594:1: ( rule__Sexpr__Group_7_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==46) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalThicket.g:5594:2: rule__Sexpr__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Sexpr__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_7__3"
    // InternalThicket.g:5604:1: rule__Sexpr__Group_7__3 : rule__Sexpr__Group_7__3__Impl rule__Sexpr__Group_7__4 ;
    public final void rule__Sexpr__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5608:1: ( rule__Sexpr__Group_7__3__Impl rule__Sexpr__Group_7__4 )
            // InternalThicket.g:5609:2: rule__Sexpr__Group_7__3__Impl rule__Sexpr__Group_7__4
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__3"


    // $ANTLR start "rule__Sexpr__Group_7__3__Impl"
    // InternalThicket.g:5616:1: rule__Sexpr__Group_7__3__Impl : ( 'yield' ) ;
    public final void rule__Sexpr__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5620:1: ( ( 'yield' ) )
            // InternalThicket.g:5621:1: ( 'yield' )
            {
            // InternalThicket.g:5621:1: ( 'yield' )
            // InternalThicket.g:5622:1: 'yield'
            {
             before(grammarAccess.getSexprAccess().getYieldKeyword_7_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getYieldKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__3__Impl"


    // $ANTLR start "rule__Sexpr__Group_7__4"
    // InternalThicket.g:5635:1: rule__Sexpr__Group_7__4 : rule__Sexpr__Group_7__4__Impl ;
    public final void rule__Sexpr__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5639:1: ( rule__Sexpr__Group_7__4__Impl )
            // InternalThicket.g:5640:2: rule__Sexpr__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__4"


    // $ANTLR start "rule__Sexpr__Group_7__4__Impl"
    // InternalThicket.g:5646:1: rule__Sexpr__Group_7__4__Impl : ( ruleexpr ) ;
    public final void rule__Sexpr__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5650:1: ( ( ruleexpr ) )
            // InternalThicket.g:5651:1: ( ruleexpr )
            {
            // InternalThicket.g:5651:1: ( ruleexpr )
            // InternalThicket.g:5652:1: ruleexpr
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_7_4()); 
            pushFollow(FOLLOW_2);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7__4__Impl"


    // $ANTLR start "rule__Sexpr__Group_7_1__0"
    // InternalThicket.g:5673:1: rule__Sexpr__Group_7_1__0 : rule__Sexpr__Group_7_1__0__Impl rule__Sexpr__Group_7_1__1 ;
    public final void rule__Sexpr__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5677:1: ( rule__Sexpr__Group_7_1__0__Impl rule__Sexpr__Group_7_1__1 )
            // InternalThicket.g:5678:2: rule__Sexpr__Group_7_1__0__Impl rule__Sexpr__Group_7_1__1
            {
            pushFollow(FOLLOW_43);
            rule__Sexpr__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__0"


    // $ANTLR start "rule__Sexpr__Group_7_1__0__Impl"
    // InternalThicket.g:5685:1: rule__Sexpr__Group_7_1__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Sexpr__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5689:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:5690:1: ( RULE_IDENT )
            {
            // InternalThicket.g:5690:1: ( RULE_IDENT )
            // InternalThicket.g:5691:1: RULE_IDENT
            {
             before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_7_1_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_7_1__1"
    // InternalThicket.g:5702:1: rule__Sexpr__Group_7_1__1 : rule__Sexpr__Group_7_1__1__Impl rule__Sexpr__Group_7_1__2 ;
    public final void rule__Sexpr__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5706:1: ( rule__Sexpr__Group_7_1__1__Impl rule__Sexpr__Group_7_1__2 )
            // InternalThicket.g:5707:2: rule__Sexpr__Group_7_1__1__Impl rule__Sexpr__Group_7_1__2
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__1"


    // $ANTLR start "rule__Sexpr__Group_7_1__1__Impl"
    // InternalThicket.g:5714:1: rule__Sexpr__Group_7_1__1__Impl : ( '<-' ) ;
    public final void rule__Sexpr__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5718:1: ( ( '<-' ) )
            // InternalThicket.g:5719:1: ( '<-' )
            {
            // InternalThicket.g:5719:1: ( '<-' )
            // InternalThicket.g:5720:1: '<-'
            {
             before(grammarAccess.getSexprAccess().getLessThanSignHyphenMinusKeyword_7_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLessThanSignHyphenMinusKeyword_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_7_1__2"
    // InternalThicket.g:5733:1: rule__Sexpr__Group_7_1__2 : rule__Sexpr__Group_7_1__2__Impl ;
    public final void rule__Sexpr__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5737:1: ( rule__Sexpr__Group_7_1__2__Impl )
            // InternalThicket.g:5738:2: rule__Sexpr__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__2"


    // $ANTLR start "rule__Sexpr__Group_7_1__2__Impl"
    // InternalThicket.g:5744:1: rule__Sexpr__Group_7_1__2__Impl : ( rulesexpr ) ;
    public final void rule__Sexpr__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5748:1: ( ( rulesexpr ) )
            // InternalThicket.g:5749:1: ( rulesexpr )
            {
            // InternalThicket.g:5749:1: ( rulesexpr )
            // InternalThicket.g:5750:1: rulesexpr
            {
             before(grammarAccess.getSexprAccess().getSexprParserRuleCall_7_1_2()); 
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getSexprParserRuleCall_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_1__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_7_2__0"
    // InternalThicket.g:5767:1: rule__Sexpr__Group_7_2__0 : rule__Sexpr__Group_7_2__0__Impl rule__Sexpr__Group_7_2__1 ;
    public final void rule__Sexpr__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5771:1: ( rule__Sexpr__Group_7_2__0__Impl rule__Sexpr__Group_7_2__1 )
            // InternalThicket.g:5772:2: rule__Sexpr__Group_7_2__0__Impl rule__Sexpr__Group_7_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_2__0"


    // $ANTLR start "rule__Sexpr__Group_7_2__0__Impl"
    // InternalThicket.g:5779:1: rule__Sexpr__Group_7_2__0__Impl : ( 'if' ) ;
    public final void rule__Sexpr__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5783:1: ( ( 'if' ) )
            // InternalThicket.g:5784:1: ( 'if' )
            {
            // InternalThicket.g:5784:1: ( 'if' )
            // InternalThicket.g:5785:1: 'if'
            {
             before(grammarAccess.getSexprAccess().getIfKeyword_7_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getIfKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_2__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_7_2__1"
    // InternalThicket.g:5798:1: rule__Sexpr__Group_7_2__1 : rule__Sexpr__Group_7_2__1__Impl ;
    public final void rule__Sexpr__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5802:1: ( rule__Sexpr__Group_7_2__1__Impl )
            // InternalThicket.g:5803:2: rule__Sexpr__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_2__1"


    // $ANTLR start "rule__Sexpr__Group_7_2__1__Impl"
    // InternalThicket.g:5809:1: rule__Sexpr__Group_7_2__1__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5813:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:5814:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:5814:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:5815:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:5815:1: ( ( ruleexpr ) )
            // InternalThicket.g:5816:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_7_2_1()); 
            // InternalThicket.g:5817:1: ( ruleexpr )
            // InternalThicket.g:5817:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_7_2_1()); 

            }

            // InternalThicket.g:5820:1: ( ( ruleexpr )* )
            // InternalThicket.g:5821:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_7_2_1()); 
            // InternalThicket.g:5822:1: ( ruleexpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_IDENT)||LA51_0==27||LA51_0==33||LA51_0==40||LA51_0==43||LA51_0==47||LA51_0==49) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalThicket.g:5822:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_7_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_7_2__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__0"
    // InternalThicket.g:5837:1: rule__Sexpr__Group_8__0 : rule__Sexpr__Group_8__0__Impl rule__Sexpr__Group_8__1 ;
    public final void rule__Sexpr__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5841:1: ( rule__Sexpr__Group_8__0__Impl rule__Sexpr__Group_8__1 )
            // InternalThicket.g:5842:2: rule__Sexpr__Group_8__0__Impl rule__Sexpr__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Sexpr__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__0"


    // $ANTLR start "rule__Sexpr__Group_8__0__Impl"
    // InternalThicket.g:5849:1: rule__Sexpr__Group_8__0__Impl : ( 'let' ) ;
    public final void rule__Sexpr__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5853:1: ( ( 'let' ) )
            // InternalThicket.g:5854:1: ( 'let' )
            {
            // InternalThicket.g:5854:1: ( 'let' )
            // InternalThicket.g:5855:1: 'let'
            {
             before(grammarAccess.getSexprAccess().getLetKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getLetKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__1"
    // InternalThicket.g:5868:1: rule__Sexpr__Group_8__1 : rule__Sexpr__Group_8__1__Impl rule__Sexpr__Group_8__2 ;
    public final void rule__Sexpr__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5872:1: ( rule__Sexpr__Group_8__1__Impl rule__Sexpr__Group_8__2 )
            // InternalThicket.g:5873:2: rule__Sexpr__Group_8__1__Impl rule__Sexpr__Group_8__2
            {
            pushFollow(FOLLOW_29);
            rule__Sexpr__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__1"


    // $ANTLR start "rule__Sexpr__Group_8__1__Impl"
    // InternalThicket.g:5880:1: rule__Sexpr__Group_8__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Sexpr__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5884:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:5885:1: ( RULE_IDENT )
            {
            // InternalThicket.g:5885:1: ( RULE_IDENT )
            // InternalThicket.g:5886:1: RULE_IDENT
            {
             before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_8_1()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__2"
    // InternalThicket.g:5897:1: rule__Sexpr__Group_8__2 : rule__Sexpr__Group_8__2__Impl rule__Sexpr__Group_8__3 ;
    public final void rule__Sexpr__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5901:1: ( rule__Sexpr__Group_8__2__Impl rule__Sexpr__Group_8__3 )
            // InternalThicket.g:5902:2: rule__Sexpr__Group_8__2__Impl rule__Sexpr__Group_8__3
            {
            pushFollow(FOLLOW_29);
            rule__Sexpr__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__2"


    // $ANTLR start "rule__Sexpr__Group_8__2__Impl"
    // InternalThicket.g:5909:1: rule__Sexpr__Group_8__2__Impl : ( ( rule__Sexpr__Group_8_2__0 )? ) ;
    public final void rule__Sexpr__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5913:1: ( ( ( rule__Sexpr__Group_8_2__0 )? ) )
            // InternalThicket.g:5914:1: ( ( rule__Sexpr__Group_8_2__0 )? )
            {
            // InternalThicket.g:5914:1: ( ( rule__Sexpr__Group_8_2__0 )? )
            // InternalThicket.g:5915:1: ( rule__Sexpr__Group_8_2__0 )?
            {
             before(grammarAccess.getSexprAccess().getGroup_8_2()); 
            // InternalThicket.g:5916:1: ( rule__Sexpr__Group_8_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==30) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalThicket.g:5916:2: rule__Sexpr__Group_8_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sexpr__Group_8_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSexprAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__3"
    // InternalThicket.g:5926:1: rule__Sexpr__Group_8__3 : rule__Sexpr__Group_8__3__Impl rule__Sexpr__Group_8__4 ;
    public final void rule__Sexpr__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5930:1: ( rule__Sexpr__Group_8__3__Impl rule__Sexpr__Group_8__4 )
            // InternalThicket.g:5931:2: rule__Sexpr__Group_8__3__Impl rule__Sexpr__Group_8__4
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__3"


    // $ANTLR start "rule__Sexpr__Group_8__3__Impl"
    // InternalThicket.g:5938:1: rule__Sexpr__Group_8__3__Impl : ( '=' ) ;
    public final void rule__Sexpr__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5942:1: ( ( '=' ) )
            // InternalThicket.g:5943:1: ( '=' )
            {
            // InternalThicket.g:5943:1: ( '=' )
            // InternalThicket.g:5944:1: '='
            {
             before(grammarAccess.getSexprAccess().getEqualsSignKeyword_8_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getEqualsSignKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__3__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__4"
    // InternalThicket.g:5957:1: rule__Sexpr__Group_8__4 : rule__Sexpr__Group_8__4__Impl rule__Sexpr__Group_8__5 ;
    public final void rule__Sexpr__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5961:1: ( rule__Sexpr__Group_8__4__Impl rule__Sexpr__Group_8__5 )
            // InternalThicket.g:5962:2: rule__Sexpr__Group_8__4__Impl rule__Sexpr__Group_8__5
            {
            pushFollow(FOLLOW_44);
            rule__Sexpr__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__4"


    // $ANTLR start "rule__Sexpr__Group_8__4__Impl"
    // InternalThicket.g:5969:1: rule__Sexpr__Group_8__4__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5973:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:5974:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:5974:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:5975:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:5975:1: ( ( ruleexpr ) )
            // InternalThicket.g:5976:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_8_4()); 
            // InternalThicket.g:5977:1: ( ruleexpr )
            // InternalThicket.g:5977:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_8_4()); 

            }

            // InternalThicket.g:5980:1: ( ( ruleexpr )* )
            // InternalThicket.g:5981:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_8_4()); 
            // InternalThicket.g:5982:1: ( ruleexpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_IDENT)||LA53_0==27||LA53_0==33||LA53_0==40||LA53_0==43||LA53_0==47||LA53_0==49) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalThicket.g:5982:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_8_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__4__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__5"
    // InternalThicket.g:5993:1: rule__Sexpr__Group_8__5 : rule__Sexpr__Group_8__5__Impl rule__Sexpr__Group_8__6 ;
    public final void rule__Sexpr__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:5997:1: ( rule__Sexpr__Group_8__5__Impl rule__Sexpr__Group_8__6 )
            // InternalThicket.g:5998:2: rule__Sexpr__Group_8__5__Impl rule__Sexpr__Group_8__6
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_8__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__5"


    // $ANTLR start "rule__Sexpr__Group_8__5__Impl"
    // InternalThicket.g:6005:1: rule__Sexpr__Group_8__5__Impl : ( 'in' ) ;
    public final void rule__Sexpr__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6009:1: ( ( 'in' ) )
            // InternalThicket.g:6010:1: ( 'in' )
            {
            // InternalThicket.g:6010:1: ( 'in' )
            // InternalThicket.g:6011:1: 'in'
            {
             before(grammarAccess.getSexprAccess().getInKeyword_8_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getInKeyword_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__5__Impl"


    // $ANTLR start "rule__Sexpr__Group_8__6"
    // InternalThicket.g:6024:1: rule__Sexpr__Group_8__6 : rule__Sexpr__Group_8__6__Impl ;
    public final void rule__Sexpr__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6028:1: ( rule__Sexpr__Group_8__6__Impl )
            // InternalThicket.g:6029:2: rule__Sexpr__Group_8__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__6"


    // $ANTLR start "rule__Sexpr__Group_8__6__Impl"
    // InternalThicket.g:6035:1: rule__Sexpr__Group_8__6__Impl : ( ruleexpr ) ;
    public final void rule__Sexpr__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6039:1: ( ( ruleexpr ) )
            // InternalThicket.g:6040:1: ( ruleexpr )
            {
            // InternalThicket.g:6040:1: ( ruleexpr )
            // InternalThicket.g:6041:1: ruleexpr
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_8_6()); 
            pushFollow(FOLLOW_2);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_8_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8__6__Impl"


    // $ANTLR start "rule__Sexpr__Group_8_2__0"
    // InternalThicket.g:6066:1: rule__Sexpr__Group_8_2__0 : rule__Sexpr__Group_8_2__0__Impl rule__Sexpr__Group_8_2__1 ;
    public final void rule__Sexpr__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6070:1: ( rule__Sexpr__Group_8_2__0__Impl rule__Sexpr__Group_8_2__1 )
            // InternalThicket.g:6071:2: rule__Sexpr__Group_8_2__0__Impl rule__Sexpr__Group_8_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Sexpr__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__0"


    // $ANTLR start "rule__Sexpr__Group_8_2__0__Impl"
    // InternalThicket.g:6078:1: rule__Sexpr__Group_8_2__0__Impl : ( ':' ) ;
    public final void rule__Sexpr__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6082:1: ( ( ':' ) )
            // InternalThicket.g:6083:1: ( ':' )
            {
            // InternalThicket.g:6083:1: ( ':' )
            // InternalThicket.g:6084:1: ':'
            {
             before(grammarAccess.getSexprAccess().getColonKeyword_8_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getColonKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_8_2__1"
    // InternalThicket.g:6097:1: rule__Sexpr__Group_8_2__1 : rule__Sexpr__Group_8_2__1__Impl rule__Sexpr__Group_8_2__2 ;
    public final void rule__Sexpr__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6101:1: ( rule__Sexpr__Group_8_2__1__Impl rule__Sexpr__Group_8_2__2 )
            // InternalThicket.g:6102:2: rule__Sexpr__Group_8_2__1__Impl rule__Sexpr__Group_8_2__2
            {
            pushFollow(FOLLOW_15);
            rule__Sexpr__Group_8_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__1"


    // $ANTLR start "rule__Sexpr__Group_8_2__1__Impl"
    // InternalThicket.g:6109:1: rule__Sexpr__Group_8_2__1__Impl : ( rulegenerics ) ;
    public final void rule__Sexpr__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6113:1: ( ( rulegenerics ) )
            // InternalThicket.g:6114:1: ( rulegenerics )
            {
            // InternalThicket.g:6114:1: ( rulegenerics )
            // InternalThicket.g:6115:1: rulegenerics
            {
             before(grammarAccess.getSexprAccess().getGenericsParserRuleCall_8_2_1()); 
            pushFollow(FOLLOW_2);
            rulegenerics();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getGenericsParserRuleCall_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_8_2__2"
    // InternalThicket.g:6126:1: rule__Sexpr__Group_8_2__2 : rule__Sexpr__Group_8_2__2__Impl ;
    public final void rule__Sexpr__Group_8_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6130:1: ( rule__Sexpr__Group_8_2__2__Impl )
            // InternalThicket.g:6131:2: rule__Sexpr__Group_8_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_8_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__2"


    // $ANTLR start "rule__Sexpr__Group_8_2__2__Impl"
    // InternalThicket.g:6137:1: rule__Sexpr__Group_8_2__2__Impl : ( ruletype ) ;
    public final void rule__Sexpr__Group_8_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6141:1: ( ( ruletype ) )
            // InternalThicket.g:6142:1: ( ruletype )
            {
            // InternalThicket.g:6142:1: ( ruletype )
            // InternalThicket.g:6143:1: ruletype
            {
             before(grammarAccess.getSexprAccess().getTypeParserRuleCall_8_2_2()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getTypeParserRuleCall_8_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_8_2__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_9__0"
    // InternalThicket.g:6160:1: rule__Sexpr__Group_9__0 : rule__Sexpr__Group_9__0__Impl rule__Sexpr__Group_9__1 ;
    public final void rule__Sexpr__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6164:1: ( rule__Sexpr__Group_9__0__Impl rule__Sexpr__Group_9__1 )
            // InternalThicket.g:6165:2: rule__Sexpr__Group_9__0__Impl rule__Sexpr__Group_9__1
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__0"


    // $ANTLR start "rule__Sexpr__Group_9__0__Impl"
    // InternalThicket.g:6172:1: rule__Sexpr__Group_9__0__Impl : ( 'new' ) ;
    public final void rule__Sexpr__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6176:1: ( ( 'new' ) )
            // InternalThicket.g:6177:1: ( 'new' )
            {
            // InternalThicket.g:6177:1: ( 'new' )
            // InternalThicket.g:6178:1: 'new'
            {
             before(grammarAccess.getSexprAccess().getNewKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getNewKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_9__1"
    // InternalThicket.g:6191:1: rule__Sexpr__Group_9__1 : rule__Sexpr__Group_9__1__Impl rule__Sexpr__Group_9__2 ;
    public final void rule__Sexpr__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6195:1: ( rule__Sexpr__Group_9__1__Impl rule__Sexpr__Group_9__2 )
            // InternalThicket.g:6196:2: rule__Sexpr__Group_9__1__Impl rule__Sexpr__Group_9__2
            {
            pushFollow(FOLLOW_45);
            rule__Sexpr__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__1"


    // $ANTLR start "rule__Sexpr__Group_9__1__Impl"
    // InternalThicket.g:6203:1: rule__Sexpr__Group_9__1__Impl : ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) ;
    public final void rule__Sexpr__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6207:1: ( ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) ) )
            // InternalThicket.g:6208:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            {
            // InternalThicket.g:6208:1: ( ( ( ruleexpr ) ) ( ( ruleexpr )* ) )
            // InternalThicket.g:6209:1: ( ( ruleexpr ) ) ( ( ruleexpr )* )
            {
            // InternalThicket.g:6209:1: ( ( ruleexpr ) )
            // InternalThicket.g:6210:1: ( ruleexpr )
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_9_1()); 
            // InternalThicket.g:6211:1: ( ruleexpr )
            // InternalThicket.g:6211:3: ruleexpr
            {
            pushFollow(FOLLOW_37);
            ruleexpr();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_9_1()); 

            }

            // InternalThicket.g:6214:1: ( ( ruleexpr )* )
            // InternalThicket.g:6215:1: ( ruleexpr )*
            {
             before(grammarAccess.getSexprAccess().getExprParserRuleCall_9_1()); 
            // InternalThicket.g:6216:1: ( ruleexpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_IDENT)||LA54_0==27||LA54_0==33||LA54_0==40||LA54_0==43||LA54_0==47||LA54_0==49) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalThicket.g:6216:3: ruleexpr
            	    {
            	    pushFollow(FOLLOW_37);
            	    ruleexpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getExprParserRuleCall_9_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_9__2"
    // InternalThicket.g:6227:1: rule__Sexpr__Group_9__2 : rule__Sexpr__Group_9__2__Impl rule__Sexpr__Group_9__3 ;
    public final void rule__Sexpr__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6231:1: ( rule__Sexpr__Group_9__2__Impl rule__Sexpr__Group_9__3 )
            // InternalThicket.g:6232:2: rule__Sexpr__Group_9__2__Impl rule__Sexpr__Group_9__3
            {
            pushFollow(FOLLOW_3);
            rule__Sexpr__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__2"


    // $ANTLR start "rule__Sexpr__Group_9__2__Impl"
    // InternalThicket.g:6239:1: rule__Sexpr__Group_9__2__Impl : ( 'with' ) ;
    public final void rule__Sexpr__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6243:1: ( ( 'with' ) )
            // InternalThicket.g:6244:1: ( 'with' )
            {
            // InternalThicket.g:6244:1: ( 'with' )
            // InternalThicket.g:6245:1: 'with'
            {
             before(grammarAccess.getSexprAccess().getWithKeyword_9_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getWithKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__2__Impl"


    // $ANTLR start "rule__Sexpr__Group_9__3"
    // InternalThicket.g:6258:1: rule__Sexpr__Group_9__3 : rule__Sexpr__Group_9__3__Impl ;
    public final void rule__Sexpr__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6262:1: ( rule__Sexpr__Group_9__3__Impl )
            // InternalThicket.g:6263:2: rule__Sexpr__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__3"


    // $ANTLR start "rule__Sexpr__Group_9__3__Impl"
    // InternalThicket.g:6269:1: rule__Sexpr__Group_9__3__Impl : ( ( ( rule__Sexpr__Group_9_3__0 ) ) ( ( rule__Sexpr__Group_9_3__0 )* ) ) ;
    public final void rule__Sexpr__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6273:1: ( ( ( ( rule__Sexpr__Group_9_3__0 ) ) ( ( rule__Sexpr__Group_9_3__0 )* ) ) )
            // InternalThicket.g:6274:1: ( ( ( rule__Sexpr__Group_9_3__0 ) ) ( ( rule__Sexpr__Group_9_3__0 )* ) )
            {
            // InternalThicket.g:6274:1: ( ( ( rule__Sexpr__Group_9_3__0 ) ) ( ( rule__Sexpr__Group_9_3__0 )* ) )
            // InternalThicket.g:6275:1: ( ( rule__Sexpr__Group_9_3__0 ) ) ( ( rule__Sexpr__Group_9_3__0 )* )
            {
            // InternalThicket.g:6275:1: ( ( rule__Sexpr__Group_9_3__0 ) )
            // InternalThicket.g:6276:1: ( rule__Sexpr__Group_9_3__0 )
            {
             before(grammarAccess.getSexprAccess().getGroup_9_3()); 
            // InternalThicket.g:6277:1: ( rule__Sexpr__Group_9_3__0 )
            // InternalThicket.g:6277:2: rule__Sexpr__Group_9_3__0
            {
            pushFollow(FOLLOW_24);
            rule__Sexpr__Group_9_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSexprAccess().getGroup_9_3()); 

            }

            // InternalThicket.g:6280:1: ( ( rule__Sexpr__Group_9_3__0 )* )
            // InternalThicket.g:6281:1: ( rule__Sexpr__Group_9_3__0 )*
            {
             before(grammarAccess.getSexprAccess().getGroup_9_3()); 
            // InternalThicket.g:6282:1: ( rule__Sexpr__Group_9_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_IDENT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalThicket.g:6282:2: rule__Sexpr__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Sexpr__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getSexprAccess().getGroup_9_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9__3__Impl"


    // $ANTLR start "rule__Sexpr__Group_9_3__0"
    // InternalThicket.g:6301:1: rule__Sexpr__Group_9_3__0 : rule__Sexpr__Group_9_3__0__Impl rule__Sexpr__Group_9_3__1 ;
    public final void rule__Sexpr__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6305:1: ( rule__Sexpr__Group_9_3__0__Impl rule__Sexpr__Group_9_3__1 )
            // InternalThicket.g:6306:2: rule__Sexpr__Group_9_3__0__Impl rule__Sexpr__Group_9_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Sexpr__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__0"


    // $ANTLR start "rule__Sexpr__Group_9_3__0__Impl"
    // InternalThicket.g:6313:1: rule__Sexpr__Group_9_3__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Sexpr__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6317:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:6318:1: ( RULE_IDENT )
            {
            // InternalThicket.g:6318:1: ( RULE_IDENT )
            // InternalThicket.g:6319:1: RULE_IDENT
            {
             before(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_9_3_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getIdentTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__0__Impl"


    // $ANTLR start "rule__Sexpr__Group_9_3__1"
    // InternalThicket.g:6330:1: rule__Sexpr__Group_9_3__1 : rule__Sexpr__Group_9_3__1__Impl rule__Sexpr__Group_9_3__2 ;
    public final void rule__Sexpr__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6334:1: ( rule__Sexpr__Group_9_3__1__Impl rule__Sexpr__Group_9_3__2 )
            // InternalThicket.g:6335:2: rule__Sexpr__Group_9_3__1__Impl rule__Sexpr__Group_9_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Sexpr__Group_9_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__1"


    // $ANTLR start "rule__Sexpr__Group_9_3__1__Impl"
    // InternalThicket.g:6342:1: rule__Sexpr__Group_9_3__1__Impl : ( '=' ) ;
    public final void rule__Sexpr__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6346:1: ( ( '=' ) )
            // InternalThicket.g:6347:1: ( '=' )
            {
            // InternalThicket.g:6347:1: ( '=' )
            // InternalThicket.g:6348:1: '='
            {
             before(grammarAccess.getSexprAccess().getEqualsSignKeyword_9_3_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSexprAccess().getEqualsSignKeyword_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__1__Impl"


    // $ANTLR start "rule__Sexpr__Group_9_3__2"
    // InternalThicket.g:6361:1: rule__Sexpr__Group_9_3__2 : rule__Sexpr__Group_9_3__2__Impl ;
    public final void rule__Sexpr__Group_9_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6365:1: ( rule__Sexpr__Group_9_3__2__Impl )
            // InternalThicket.g:6366:2: rule__Sexpr__Group_9_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sexpr__Group_9_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__2"


    // $ANTLR start "rule__Sexpr__Group_9_3__2__Impl"
    // InternalThicket.g:6372:1: rule__Sexpr__Group_9_3__2__Impl : ( rulesexpr ) ;
    public final void rule__Sexpr__Group_9_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6376:1: ( ( rulesexpr ) )
            // InternalThicket.g:6377:1: ( rulesexpr )
            {
            // InternalThicket.g:6377:1: ( rulesexpr )
            // InternalThicket.g:6378:1: rulesexpr
            {
             before(grammarAccess.getSexprAccess().getSexprParserRuleCall_9_3_2()); 
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getSexprAccess().getSexprParserRuleCall_9_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sexpr__Group_9_3__2__Impl"


    // $ANTLR start "rule__Attr__Group__0"
    // InternalThicket.g:6395:1: rule__Attr__Group__0 : rule__Attr__Group__0__Impl rule__Attr__Group__1 ;
    public final void rule__Attr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6399:1: ( rule__Attr__Group__0__Impl rule__Attr__Group__1 )
            // InternalThicket.g:6400:2: rule__Attr__Group__0__Impl rule__Attr__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Attr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__0"


    // $ANTLR start "rule__Attr__Group__0__Impl"
    // InternalThicket.g:6407:1: rule__Attr__Group__0__Impl : ( RULE_IDENT ) ;
    public final void rule__Attr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6411:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:6412:1: ( RULE_IDENT )
            {
            // InternalThicket.g:6412:1: ( RULE_IDENT )
            // InternalThicket.g:6413:1: RULE_IDENT
            {
             before(grammarAccess.getAttrAccess().getIdentTerminalRuleCall_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getAttrAccess().getIdentTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__0__Impl"


    // $ANTLR start "rule__Attr__Group__1"
    // InternalThicket.g:6424:1: rule__Attr__Group__1 : rule__Attr__Group__1__Impl rule__Attr__Group__2 ;
    public final void rule__Attr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6428:1: ( rule__Attr__Group__1__Impl rule__Attr__Group__2 )
            // InternalThicket.g:6429:2: rule__Attr__Group__1__Impl rule__Attr__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Attr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__1"


    // $ANTLR start "rule__Attr__Group__1__Impl"
    // InternalThicket.g:6436:1: rule__Attr__Group__1__Impl : ( '=' ) ;
    public final void rule__Attr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6440:1: ( ( '=' ) )
            // InternalThicket.g:6441:1: ( '=' )
            {
            // InternalThicket.g:6441:1: ( '=' )
            // InternalThicket.g:6442:1: '='
            {
             before(grammarAccess.getAttrAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttrAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__1__Impl"


    // $ANTLR start "rule__Attr__Group__2"
    // InternalThicket.g:6455:1: rule__Attr__Group__2 : rule__Attr__Group__2__Impl ;
    public final void rule__Attr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6459:1: ( rule__Attr__Group__2__Impl )
            // InternalThicket.g:6460:2: rule__Attr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__2"


    // $ANTLR start "rule__Attr__Group__2__Impl"
    // InternalThicket.g:6466:1: rule__Attr__Group__2__Impl : ( rulesexpr ) ;
    public final void rule__Attr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6470:1: ( ( rulesexpr ) )
            // InternalThicket.g:6471:1: ( rulesexpr )
            {
            // InternalThicket.g:6471:1: ( rulesexpr )
            // InternalThicket.g:6472:1: rulesexpr
            {
             before(grammarAccess.getAttrAccess().getSexprParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;

             after(grammarAccess.getAttrAccess().getSexprParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr__Group__2__Impl"


    // $ANTLR start "rule__IdentOrOp__Group_1__0"
    // InternalThicket.g:6489:1: rule__IdentOrOp__Group_1__0 : rule__IdentOrOp__Group_1__0__Impl rule__IdentOrOp__Group_1__1 ;
    public final void rule__IdentOrOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6493:1: ( rule__IdentOrOp__Group_1__0__Impl rule__IdentOrOp__Group_1__1 )
            // InternalThicket.g:6494:2: rule__IdentOrOp__Group_1__0__Impl rule__IdentOrOp__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__IdentOrOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdentOrOp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__0"


    // $ANTLR start "rule__IdentOrOp__Group_1__0__Impl"
    // InternalThicket.g:6501:1: rule__IdentOrOp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__IdentOrOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6505:1: ( ( '(' ) )
            // InternalThicket.g:6506:1: ( '(' )
            {
            // InternalThicket.g:6506:1: ( '(' )
            // InternalThicket.g:6507:1: '('
            {
             before(grammarAccess.getIdentOrOpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIdentOrOpAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__0__Impl"


    // $ANTLR start "rule__IdentOrOp__Group_1__1"
    // InternalThicket.g:6520:1: rule__IdentOrOp__Group_1__1 : rule__IdentOrOp__Group_1__1__Impl rule__IdentOrOp__Group_1__2 ;
    public final void rule__IdentOrOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6524:1: ( rule__IdentOrOp__Group_1__1__Impl rule__IdentOrOp__Group_1__2 )
            // InternalThicket.g:6525:2: rule__IdentOrOp__Group_1__1__Impl rule__IdentOrOp__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__IdentOrOp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdentOrOp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__1"


    // $ANTLR start "rule__IdentOrOp__Group_1__1__Impl"
    // InternalThicket.g:6532:1: rule__IdentOrOp__Group_1__1__Impl : ( RULE_OP ) ;
    public final void rule__IdentOrOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6536:1: ( ( RULE_OP ) )
            // InternalThicket.g:6537:1: ( RULE_OP )
            {
            // InternalThicket.g:6537:1: ( RULE_OP )
            // InternalThicket.g:6538:1: RULE_OP
            {
             before(grammarAccess.getIdentOrOpAccess().getOPTerminalRuleCall_1_1()); 
            match(input,RULE_OP,FOLLOW_2); 
             after(grammarAccess.getIdentOrOpAccess().getOPTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__1__Impl"


    // $ANTLR start "rule__IdentOrOp__Group_1__2"
    // InternalThicket.g:6549:1: rule__IdentOrOp__Group_1__2 : rule__IdentOrOp__Group_1__2__Impl ;
    public final void rule__IdentOrOp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6553:1: ( rule__IdentOrOp__Group_1__2__Impl )
            // InternalThicket.g:6554:2: rule__IdentOrOp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdentOrOp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__2"


    // $ANTLR start "rule__IdentOrOp__Group_1__2__Impl"
    // InternalThicket.g:6560:1: rule__IdentOrOp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__IdentOrOp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6564:1: ( ( ')' ) )
            // InternalThicket.g:6565:1: ( ')' )
            {
            // InternalThicket.g:6565:1: ( ')' )
            // InternalThicket.g:6566:1: ')'
            {
             before(grammarAccess.getIdentOrOpAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIdentOrOpAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentOrOp__Group_1__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalThicket.g:6586:1: rule__Model__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6590:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:6591:1: ( RULE_IDENT )
            {
            // InternalThicket.g:6591:1: ( RULE_IDENT )
            // InternalThicket.g:6592:1: RULE_IDENT
            {
             before(grammarAccess.getModelAccess().getNameIdentTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIdentTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__NamesAssignment_2_1"
    // InternalThicket.g:6601:1: rule__Model__NamesAssignment_2_1 : ( RULE_IDENT ) ;
    public final void rule__Model__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6605:1: ( ( RULE_IDENT ) )
            // InternalThicket.g:6606:1: ( RULE_IDENT )
            {
            // InternalThicket.g:6606:1: ( RULE_IDENT )
            // InternalThicket.g:6607:1: RULE_IDENT
            {
             before(grammarAccess.getModelAccess().getNamesIdentTerminalRuleCall_2_1_0()); 
            match(input,RULE_IDENT,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNamesIdentTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NamesAssignment_2_1"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // InternalThicket.g:6616:1: rule__Model__ImportsAssignment_3 : ( ruleimports ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6620:1: ( ( ruleimports ) )
            // InternalThicket.g:6621:1: ( ruleimports )
            {
            // InternalThicket.g:6621:1: ( ruleimports )
            // InternalThicket.g:6622:1: ruleimports
            {
             before(grammarAccess.getModelAccess().getImportsImportsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleimports();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__EntitiesAssignment_4"
    // InternalThicket.g:6631:1: rule__Model__EntitiesAssignment_4 : ( ruleentity ) ;
    public final void rule__Model__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalThicket.g:6635:1: ( ( ruleentity ) )
            // InternalThicket.g:6636:1: ( ruleentity )
            {
            // InternalThicket.g:6636:1: ( ruleentity )
            // InternalThicket.g:6637:1: ruleentity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000A825E00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000A825000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200010100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000102L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000210010100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200010102L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000102L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001200010100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00028902080001F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004210010100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004200010102L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00028902080001F2L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000080100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});

}