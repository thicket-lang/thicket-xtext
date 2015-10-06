package org.thicket.lang.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.thicket.lang.xtext.idea.lang.ThicketElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.thicket.lang.xtext.services.ThicketGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalThicketParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_INT", "RULE_STRING", "RULE_OP", "RULE_DOLL", "RULE_ID", "RULE_SOP", "RULE_EOP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'.'", "'from'", "'import'", "'*'", "','", "'typedef'", "'='", "'type'", "'{'", "'model'", "'}'", "':'", "'['", "']'", "'('", "')'", "'->'", "'def'", "'adapter'", "'class'", "'+'", "'trait'", "'<'", "'>'", "'</'", "'/>'", "'for'", "'<-'", "'if'", "'yield'", "'let'", "'in'", "'new'", "'with'"
    };
    public static final int T__50=50;
    public static final int RULE_SOP=10;
    public static final int RULE_DOLL=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_EOP=11;
    public static final int RULE_OP=7;
    public static final int RULE_ID=9;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


        public PsiInternalThicketParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalThicketParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalThicketParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalThicket.g"; }



    	protected ThicketGrammarAccess grammarAccess;

    	protected ThicketElementTypeProvider elementTypeProvider;

    	public PsiInternalThicketParser(PsiBuilder builder, TokenStream input, ThicketElementTypeProvider elementTypeProvider, ThicketGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalThicket.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // PsiInternalThicket.g:52:15: ( ruleModel EOF )
            // PsiInternalThicket.g:53:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

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
    // PsiInternalThicket.g:58:1: ruleModel : (otherlv_0= 'module' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )* ( (lv_imports_4_0= ruleimports ) )* ( (lv_entities_5_0= ruleentity ) )* ) ;
    public final void ruleModel() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;

        try {
            // PsiInternalThicket.g:58:10: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )* ( (lv_imports_4_0= ruleimports ) )* ( (lv_entities_5_0= ruleentity ) )* ) )
            // PsiInternalThicket.g:59:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )* ( (lv_imports_4_0= ruleimports ) )* ( (lv_entities_5_0= ruleentity ) )* )
            {
            // PsiInternalThicket.g:59:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )* ( (lv_imports_4_0= ruleimports ) )* ( (lv_entities_5_0= ruleentity ) )* )
            // PsiInternalThicket.g:60:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )* ( (lv_imports_4_0= ruleimports ) )* ( (lv_entities_5_0= ruleentity ) )*
            {

            			markLeaf(elementTypeProvider.getModel_ModuleKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalThicket.g:67:3: ( (lv_name_1_0= RULE_IDENT ) )
            // PsiInternalThicket.g:68:4: (lv_name_1_0= RULE_IDENT )
            {
            // PsiInternalThicket.g:68:4: (lv_name_1_0= RULE_IDENT )
            // PsiInternalThicket.g:69:5: lv_name_1_0= RULE_IDENT
            {

            					markLeaf(elementTypeProvider.getModel_NameIdentTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_4); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalThicket.g:78:3: (otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalThicket.g:79:4: otherlv_2= '.' ( (lv_names_3_0= RULE_IDENT ) )
            	    {

            	    				markLeaf(elementTypeProvider.getModel_FullStopKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalThicket.g:86:4: ( (lv_names_3_0= RULE_IDENT ) )
            	    // PsiInternalThicket.g:87:5: (lv_names_3_0= RULE_IDENT )
            	    {
            	    // PsiInternalThicket.g:87:5: (lv_names_3_0= RULE_IDENT )
            	    // PsiInternalThicket.g:88:6: lv_names_3_0= RULE_IDENT
            	    {

            	    						markLeaf(elementTypeProvider.getModel_NamesIdentTerminalRuleCall_2_1_0ElementType());
            	    					
            	    lv_names_3_0=(Token)match(input,RULE_IDENT,FOLLOW_4); 

            	    						doneLeaf(lv_names_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalThicket.g:98:3: ( (lv_imports_4_0= ruleimports ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalThicket.g:99:4: (lv_imports_4_0= ruleimports )
            	    {
            	    // PsiInternalThicket.g:99:4: (lv_imports_4_0= ruleimports )
            	    // PsiInternalThicket.g:100:5: lv_imports_4_0= ruleimports
            	    {

            	    					markComposite(elementTypeProvider.getModel_ImportsImportsParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_5);
            	    ruleimports();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // PsiInternalThicket.g:109:3: ( (lv_entities_5_0= ruleentity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22||LA3_0==24||LA3_0==26||LA3_0==34||LA3_0==36||LA3_0==38) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalThicket.g:110:4: (lv_entities_5_0= ruleentity )
            	    {
            	    // PsiInternalThicket.g:110:4: (lv_entities_5_0= ruleentity )
            	    // PsiInternalThicket.g:111:5: lv_entities_5_0= ruleentity
            	    {

            	    					markComposite(elementTypeProvider.getModel_EntitiesEntityParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FOLLOW_6);
            	    ruleentity();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleimports"
    // PsiInternalThicket.g:124:1: entryRuleimports : ruleimports EOF ;
    public final void entryRuleimports() throws RecognitionException {
        try {
            // PsiInternalThicket.g:124:17: ( ruleimports EOF )
            // PsiInternalThicket.g:125:2: ruleimports EOF
            {
             markComposite(elementTypeProvider.getImportsElementType()); 
            pushFollow(FOLLOW_1);
            ruleimports();

            state._fsp--;

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
    // PsiInternalThicket.g:130:1: ruleimports : ( (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) ) | (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* ) ) ;
    public final void ruleimports() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;
        Token this_ident_3=null;
        Token this_ident_10=null;
        Token this_ident_12=null;

        try {
            // PsiInternalThicket.g:130:12: ( ( (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) ) | (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* ) ) )
            // PsiInternalThicket.g:131:2: ( (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) ) | (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* ) )
            {
            // PsiInternalThicket.g:131:2: ( (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) ) | (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalThicket.g:132:3: (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) )
                    {
                    // PsiInternalThicket.g:132:3: (kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) ) )
                    // PsiInternalThicket.g:133:4: kw= 'from' this_ident_1= RULE_IDENT (kw= '.' this_ident_3= RULE_IDENT )* kw= 'import' (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) )
                    {

                    				markLeaf(elementTypeProvider.getImports_FromKeyword_0_0ElementType());
                    			
                    kw=(Token)match(input,18,FOLLOW_3); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_0_1ElementType());
                    			
                    this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_7); 

                    				doneLeaf(this_ident_1);
                    			
                    // PsiInternalThicket.g:147:4: (kw= '.' this_ident_3= RULE_IDENT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // PsiInternalThicket.g:148:5: kw= '.' this_ident_3= RULE_IDENT
                    	    {

                    	    					markLeaf(elementTypeProvider.getImports_FullStopKeyword_0_2_0ElementType());
                    	    				
                    	    kw=(Token)match(input,17,FOLLOW_3); 

                    	    					doneLeaf(kw);
                    	    				

                    	    					markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_0_2_1ElementType());
                    	    				
                    	    this_ident_3=(Token)match(input,RULE_IDENT,FOLLOW_7); 

                    	    					doneLeaf(this_ident_3);
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getImports_ImportKeyword_0_3ElementType());
                    			
                    kw=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:170:4: (kw= '*' | ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_IDENT||LA6_0==31) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // PsiInternalThicket.g:171:5: kw= '*'
                            {

                            					markLeaf(elementTypeProvider.getImports_AsteriskKeyword_0_4_0ElementType());
                            				
                            kw=(Token)match(input,20,FOLLOW_2); 

                            					doneLeaf(kw);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalThicket.g:179:5: ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ )
                            {
                            // PsiInternalThicket.g:179:5: ( ruleidentOrOp (kw= ',' ruleidentOrOp )+ )
                            // PsiInternalThicket.g:180:6: ruleidentOrOp (kw= ',' ruleidentOrOp )+
                            {

                            						markComposite(elementTypeProvider.getImports_IdentOrOpParserRuleCall_0_4_1_0ElementType());
                            					
                            pushFollow(FOLLOW_9);
                            ruleidentOrOp();

                            state._fsp--;


                            						doneComposite();
                            					
                            // PsiInternalThicket.g:187:6: (kw= ',' ruleidentOrOp )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==21) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // PsiInternalThicket.g:188:7: kw= ',' ruleidentOrOp
                            	    {

                            	    							markLeaf(elementTypeProvider.getImports_CommaKeyword_0_4_1_1_0ElementType());
                            	    						
                            	    kw=(Token)match(input,21,FOLLOW_8); 

                            	    							doneLeaf(kw);
                            	    						

                            	    							markComposite(elementTypeProvider.getImports_IdentOrOpParserRuleCall_0_4_1_1_1ElementType());
                            	    						
                            	    pushFollow(FOLLOW_10);
                            	    ruleidentOrOp();

                            	    state._fsp--;


                            	    							doneComposite();
                            	    						

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


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:207:3: (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* )
                    {
                    // PsiInternalThicket.g:207:3: (kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )* )
                    // PsiInternalThicket.g:208:4: kw= 'import' this_ident_10= RULE_IDENT (kw= '.' this_ident_12= RULE_IDENT )*
                    {

                    				markLeaf(elementTypeProvider.getImports_ImportKeyword_1_0ElementType());
                    			
                    kw=(Token)match(input,19,FOLLOW_3); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_1_1ElementType());
                    			
                    this_ident_10=(Token)match(input,RULE_IDENT,FOLLOW_11); 

                    				doneLeaf(this_ident_10);
                    			
                    // PsiInternalThicket.g:222:4: (kw= '.' this_ident_12= RULE_IDENT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // PsiInternalThicket.g:223:5: kw= '.' this_ident_12= RULE_IDENT
                    	    {

                    	    					markLeaf(elementTypeProvider.getImports_FullStopKeyword_1_2_0ElementType());
                    	    				
                    	    kw=(Token)match(input,17,FOLLOW_3); 

                    	    					doneLeaf(kw);
                    	    				

                    	    					markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_1_2_1ElementType());
                    	    				
                    	    this_ident_12=(Token)match(input,RULE_IDENT,FOLLOW_11); 

                    	    					doneLeaf(this_ident_12);
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleimports"


    // $ANTLR start "entryRuleentity"
    // PsiInternalThicket.g:243:1: entryRuleentity : ruleentity EOF ;
    public final void entryRuleentity() throws RecognitionException {
        try {
            // PsiInternalThicket.g:243:16: ( ruleentity EOF )
            // PsiInternalThicket.g:244:2: ruleentity EOF
            {
             markComposite(elementTypeProvider.getEntityElementType()); 
            pushFollow(FOLLOW_1);
            ruleentity();

            state._fsp--;

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
    // PsiInternalThicket.g:249:1: ruleentity : ( ruletypeDef | rulesortDef | ruleobjectDef | ruleexpressionDef | ruleclassDef | ruletraitDef ) ;
    public final void ruleentity() throws RecognitionException {
        try {
            // PsiInternalThicket.g:249:11: ( ( ruletypeDef | rulesortDef | ruleobjectDef | ruleexpressionDef | ruleclassDef | ruletraitDef ) )
            // PsiInternalThicket.g:250:2: ( ruletypeDef | rulesortDef | ruleobjectDef | ruleexpressionDef | ruleclassDef | ruletraitDef )
            {
            // PsiInternalThicket.g:250:2: ( ruletypeDef | rulesortDef | ruleobjectDef | ruleexpressionDef | ruleclassDef | ruletraitDef )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 38:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // PsiInternalThicket.g:251:3: ruletypeDef
                    {

                    			markComposite(elementTypeProvider.getEntity_TypeDefParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruletypeDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:259:3: rulesortDef
                    {

                    			markComposite(elementTypeProvider.getEntity_SortDefParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    rulesortDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalThicket.g:267:3: ruleobjectDef
                    {

                    			markComposite(elementTypeProvider.getEntity_ObjectDefParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleobjectDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalThicket.g:275:3: ruleexpressionDef
                    {

                    			markComposite(elementTypeProvider.getEntity_ExpressionDefParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleexpressionDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalThicket.g:283:3: ruleclassDef
                    {

                    			markComposite(elementTypeProvider.getEntity_ClassDefParserRuleCall_4ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruleclassDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 6 :
                    // PsiInternalThicket.g:291:3: ruletraitDef
                    {

                    			markComposite(elementTypeProvider.getEntity_TraitDefParserRuleCall_5ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    ruletraitDef();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleentity"


    // $ANTLR start "entryRuletypeDef"
    // PsiInternalThicket.g:302:1: entryRuletypeDef : ruletypeDef EOF ;
    public final void entryRuletypeDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:302:17: ( ruletypeDef EOF )
            // PsiInternalThicket.g:303:2: ruletypeDef EOF
            {
             markComposite(elementTypeProvider.getTypeDefElementType()); 
            pushFollow(FOLLOW_1);
            ruletypeDef();

            state._fsp--;

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
    // PsiInternalThicket.g:308:1: ruletypeDef : (kw= 'typedef' this_ident_1= RULE_IDENT rulegenerics kw= '=' rulegenerics ruletypes ) ;
    public final void ruletypeDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;

        try {
            // PsiInternalThicket.g:308:12: ( (kw= 'typedef' this_ident_1= RULE_IDENT rulegenerics kw= '=' rulegenerics ruletypes ) )
            // PsiInternalThicket.g:309:2: (kw= 'typedef' this_ident_1= RULE_IDENT rulegenerics kw= '=' rulegenerics ruletypes )
            {
            // PsiInternalThicket.g:309:2: (kw= 'typedef' this_ident_1= RULE_IDENT rulegenerics kw= '=' rulegenerics ruletypes )
            // PsiInternalThicket.g:310:3: kw= 'typedef' this_ident_1= RULE_IDENT rulegenerics kw= '=' rulegenerics ruletypes
            {

            			markLeaf(elementTypeProvider.getTypeDef_TypedefKeyword_0ElementType());
            		
            kw=(Token)match(input,22,FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getTypeDef_IdentTerminalRuleCall_1ElementType());
            		
            this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_12); 

            			doneLeaf(this_ident_1);
            		

            			markComposite(elementTypeProvider.getTypeDef_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_13);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getTypeDef_EqualsSignKeyword_3ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_14); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getTypeDef_GenericsParserRuleCall_4ElementType());
            		
            pushFollow(FOLLOW_14);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markComposite(elementTypeProvider.getTypeDef_TypesParserRuleCall_5ElementType());
            		
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;


            			doneComposite();
            		

            }


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
    // $ANTLR end "ruletypeDef"


    // $ANTLR start "entryRulesortDef"
    // PsiInternalThicket.g:356:1: entryRulesortDef : rulesortDef EOF ;
    public final void entryRulesortDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:356:17: ( rulesortDef EOF )
            // PsiInternalThicket.g:357:2: rulesortDef EOF
            {
             markComposite(elementTypeProvider.getSortDefElementType()); 
            pushFollow(FOLLOW_1);
            rulesortDef();

            state._fsp--;

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
    // PsiInternalThicket.g:362:1: rulesortDef : (kw= 'type' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+ kw= '}' ) ;
    public final void rulesortDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;
        Token this_ident_5=null;

        try {
            // PsiInternalThicket.g:362:12: ( (kw= 'type' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+ kw= '}' ) )
            // PsiInternalThicket.g:363:2: (kw= 'type' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+ kw= '}' )
            {
            // PsiInternalThicket.g:363:2: (kw= 'type' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+ kw= '}' )
            // PsiInternalThicket.g:364:3: kw= 'type' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+ kw= '}'
            {

            			markLeaf(elementTypeProvider.getSortDef_TypeKeyword_0ElementType());
            		
            kw=(Token)match(input,24,FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getSortDef_IdentTerminalRuleCall_1ElementType());
            		
            this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            			doneLeaf(this_ident_1);
            		

            			markComposite(elementTypeProvider.getSortDef_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_16);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getSortDef_LeftCurlyBracketKeyword_3ElementType());
            		
            kw=(Token)match(input,25,FOLLOW_17); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:392:3: ( (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )? )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_IDENT||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PsiInternalThicket.g:393:4: (kw= 'model' )? this_ident_5= RULE_IDENT (kw= '{' ( ruletparam )* kw= '}' )?
            	    {
            	    // PsiInternalThicket.g:393:4: (kw= 'model' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==26) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // PsiInternalThicket.g:394:5: kw= 'model'
            	            {

            	            					markLeaf(elementTypeProvider.getSortDef_ModelKeyword_4_0ElementType());
            	            				
            	            kw=(Token)match(input,26,FOLLOW_3); 

            	            					doneLeaf(kw);
            	            				

            	            }
            	            break;

            	    }


            	    				markLeaf(elementTypeProvider.getSortDef_IdentTerminalRuleCall_4_1ElementType());
            	    			
            	    this_ident_5=(Token)match(input,RULE_IDENT,FOLLOW_18); 

            	    				doneLeaf(this_ident_5);
            	    			
            	    // PsiInternalThicket.g:409:4: (kw= '{' ( ruletparam )* kw= '}' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==25) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // PsiInternalThicket.g:410:5: kw= '{' ( ruletparam )* kw= '}'
            	            {

            	            					markLeaf(elementTypeProvider.getSortDef_LeftCurlyBracketKeyword_4_2_0ElementType());
            	            				
            	            kw=(Token)match(input,25,FOLLOW_19); 

            	            					doneLeaf(kw);
            	            				
            	            // PsiInternalThicket.g:417:5: ( ruletparam )*
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==RULE_IDENT||LA11_0==31) ) {
            	                    alt11=1;
            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // PsiInternalThicket.g:418:6: ruletparam
            	            	    {

            	            	    						markComposite(elementTypeProvider.getSortDef_TparamParserRuleCall_4_2_1ElementType());
            	            	    					
            	            	    pushFollow(FOLLOW_19);
            	            	    ruletparam();

            	            	    state._fsp--;


            	            	    						doneComposite();
            	            	    					

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop11;
            	                }
            	            } while (true);


            	            					markLeaf(elementTypeProvider.getSortDef_RightCurlyBracketKeyword_4_2_2ElementType());
            	            				
            	            kw=(Token)match(input,27,FOLLOW_20); 

            	            					doneLeaf(kw);
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            			markLeaf(elementTypeProvider.getSortDef_RightCurlyBracketKeyword_5ElementType());
            		
            kw=(Token)match(input,27,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


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
    // $ANTLR end "rulesortDef"


    // $ANTLR start "entryRuleobjectDef"
    // PsiInternalThicket.g:446:1: entryRuleobjectDef : ruleobjectDef EOF ;
    public final void entryRuleobjectDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:446:19: ( ruleobjectDef EOF )
            // PsiInternalThicket.g:447:2: ruleobjectDef EOF
            {
             markComposite(elementTypeProvider.getObjectDefElementType()); 
            pushFollow(FOLLOW_1);
            ruleobjectDef();

            state._fsp--;

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
    // PsiInternalThicket.g:452:1: ruleobjectDef : (kw= 'model' this_ident_1= RULE_IDENT rulegenerics (kw= '{' ( ruletparam )* kw= '}' )? ) ;
    public final void ruleobjectDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;

        try {
            // PsiInternalThicket.g:452:14: ( (kw= 'model' this_ident_1= RULE_IDENT rulegenerics (kw= '{' ( ruletparam )* kw= '}' )? ) )
            // PsiInternalThicket.g:453:2: (kw= 'model' this_ident_1= RULE_IDENT rulegenerics (kw= '{' ( ruletparam )* kw= '}' )? )
            {
            // PsiInternalThicket.g:453:2: (kw= 'model' this_ident_1= RULE_IDENT rulegenerics (kw= '{' ( ruletparam )* kw= '}' )? )
            // PsiInternalThicket.g:454:3: kw= 'model' this_ident_1= RULE_IDENT rulegenerics (kw= '{' ( ruletparam )* kw= '}' )?
            {

            			markLeaf(elementTypeProvider.getObjectDef_ModelKeyword_0ElementType());
            		
            kw=(Token)match(input,26,FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getObjectDef_IdentTerminalRuleCall_1ElementType());
            		
            this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            			doneLeaf(this_ident_1);
            		

            			markComposite(elementTypeProvider.getObjectDef_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_21);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:475:3: (kw= '{' ( ruletparam )* kw= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalThicket.g:476:4: kw= '{' ( ruletparam )* kw= '}'
                    {

                    				markLeaf(elementTypeProvider.getObjectDef_LeftCurlyBracketKeyword_3_0ElementType());
                    			
                    kw=(Token)match(input,25,FOLLOW_19); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:483:4: ( ruletparam )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_IDENT||LA14_0==31) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // PsiInternalThicket.g:484:5: ruletparam
                    	    {

                    	    					markComposite(elementTypeProvider.getObjectDef_TparamParserRuleCall_3_1ElementType());
                    	    				
                    	    pushFollow(FOLLOW_19);
                    	    ruletparam();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getObjectDef_RightCurlyBracketKeyword_3_2ElementType());
                    			
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleobjectDef"


    // $ANTLR start "entryRuletparam"
    // PsiInternalThicket.g:504:1: entryRuletparam : ruletparam EOF ;
    public final void entryRuletparam() throws RecognitionException {
        try {
            // PsiInternalThicket.g:504:16: ( ruletparam EOF )
            // PsiInternalThicket.g:505:2: ruletparam EOF
            {
             markComposite(elementTypeProvider.getTparamElementType()); 
            pushFollow(FOLLOW_1);
            ruletparam();

            state._fsp--;

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
    // PsiInternalThicket.g:510:1: ruletparam : ( ruleidentOrOp kw= ':' rulegenerics ruletypes ) ;
    public final void ruletparam() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalThicket.g:510:11: ( ( ruleidentOrOp kw= ':' rulegenerics ruletypes ) )
            // PsiInternalThicket.g:511:2: ( ruleidentOrOp kw= ':' rulegenerics ruletypes )
            {
            // PsiInternalThicket.g:511:2: ( ruleidentOrOp kw= ':' rulegenerics ruletypes )
            // PsiInternalThicket.g:512:3: ruleidentOrOp kw= ':' rulegenerics ruletypes
            {

            			markComposite(elementTypeProvider.getTparam_IdentOrOpParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_22);
            ruleidentOrOp();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getTparam_ColonKeyword_1ElementType());
            		
            kw=(Token)match(input,28,FOLLOW_14); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getTparam_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_14);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markComposite(elementTypeProvider.getTparam_TypesParserRuleCall_3ElementType());
            		
            pushFollow(FOLLOW_2);
            ruletypes();

            state._fsp--;


            			doneComposite();
            		

            }


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
    // $ANTLR end "ruletparam"


    // $ANTLR start "entryRulegenerics"
    // PsiInternalThicket.g:544:1: entryRulegenerics : rulegenerics EOF ;
    public final void entryRulegenerics() throws RecognitionException {
        try {
            // PsiInternalThicket.g:544:18: ( rulegenerics EOF )
            // PsiInternalThicket.g:545:2: rulegenerics EOF
            {
             markComposite(elementTypeProvider.getGenericsElementType()); 
            pushFollow(FOLLOW_1);
            rulegenerics();

            state._fsp--;

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
    // PsiInternalThicket.g:550:1: rulegenerics : (kw= '[' (this_ident_1= RULE_IDENT )+ kw= ']' )? ;
    public final void rulegenerics() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;

        try {
            // PsiInternalThicket.g:550:13: ( (kw= '[' (this_ident_1= RULE_IDENT )+ kw= ']' )? )
            // PsiInternalThicket.g:551:2: (kw= '[' (this_ident_1= RULE_IDENT )+ kw= ']' )?
            {
            // PsiInternalThicket.g:551:2: (kw= '[' (this_ident_1= RULE_IDENT )+ kw= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalThicket.g:552:3: kw= '[' (this_ident_1= RULE_IDENT )+ kw= ']'
                    {

                    			markLeaf(elementTypeProvider.getGenerics_LeftSquareBracketKeyword_0ElementType());
                    		
                    kw=(Token)match(input,29,FOLLOW_3); 

                    			doneLeaf(kw);
                    		
                    // PsiInternalThicket.g:559:3: (this_ident_1= RULE_IDENT )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_IDENT) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // PsiInternalThicket.g:560:4: this_ident_1= RULE_IDENT
                    	    {

                    	    				markLeaf(elementTypeProvider.getGenerics_IdentTerminalRuleCall_1ElementType());
                    	    			
                    	    this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_23); 

                    	    				doneLeaf(this_ident_1);
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    			markLeaf(elementTypeProvider.getGenerics_RightSquareBracketKeyword_2ElementType());
                    		
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

            }


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
    // $ANTLR end "rulegenerics"


    // $ANTLR start "entryRuletype"
    // PsiInternalThicket.g:579:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // PsiInternalThicket.g:579:14: ( ruletype EOF )
            // PsiInternalThicket.g:580:2: ruletype EOF
            {
             markComposite(elementTypeProvider.getTypeElementType()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

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
    // PsiInternalThicket.g:585:1: ruletype : ( (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? ) | (kw= '(' ruletypes kw= ')' ) ) ;
    public final void ruletype() throws RecognitionException {
        Token this_ident_0=null;
        Token kw=null;

        try {
            // PsiInternalThicket.g:585:9: ( ( (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? ) | (kw= '(' ruletypes kw= ')' ) ) )
            // PsiInternalThicket.g:586:2: ( (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? ) | (kw= '(' ruletypes kw= ')' ) )
            {
            // PsiInternalThicket.g:586:2: ( (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? ) | (kw= '(' ruletypes kw= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENT) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalThicket.g:587:3: (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? )
                    {
                    // PsiInternalThicket.g:587:3: (this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )? )
                    // PsiInternalThicket.g:588:4: this_ident_0= RULE_IDENT (kw= '[' ( ruletypes )+ kw= ']' )?
                    {

                    				markLeaf(elementTypeProvider.getType_IdentTerminalRuleCall_0_0ElementType());
                    			
                    this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_24); 

                    				doneLeaf(this_ident_0);
                    			
                    // PsiInternalThicket.g:595:4: (kw= '[' ( ruletypes )+ kw= ']' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // PsiInternalThicket.g:596:5: kw= '[' ( ruletypes )+ kw= ']'
                            {

                            					markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_0_1_0ElementType());
                            				
                            kw=(Token)match(input,29,FOLLOW_14); 

                            					doneLeaf(kw);
                            				
                            // PsiInternalThicket.g:603:5: ( ruletypes )+
                            int cnt18=0;
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_IDENT||LA18_0==31) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // PsiInternalThicket.g:604:6: ruletypes
                            	    {

                            	    						markComposite(elementTypeProvider.getType_TypesParserRuleCall_0_1_1ElementType());
                            	    					
                            	    pushFollow(FOLLOW_25);
                            	    ruletypes();

                            	    state._fsp--;


                            	    						doneComposite();
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt18 >= 1 ) break loop18;
                                        EarlyExitException eee =
                                            new EarlyExitException(18, input);
                                        throw eee;
                                }
                                cnt18++;
                            } while (true);


                            					markLeaf(elementTypeProvider.getType_RightSquareBracketKeyword_0_1_2ElementType());
                            				
                            kw=(Token)match(input,30,FOLLOW_2); 

                            					doneLeaf(kw);
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:622:3: (kw= '(' ruletypes kw= ')' )
                    {
                    // PsiInternalThicket.g:622:3: (kw= '(' ruletypes kw= ')' )
                    // PsiInternalThicket.g:623:4: kw= '(' ruletypes kw= ')'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_1_0ElementType());
                    			
                    kw=(Token)match(input,31,FOLLOW_14); 

                    				doneLeaf(kw);
                    			

                    				markComposite(elementTypeProvider.getType_TypesParserRuleCall_1_1ElementType());
                    			
                    pushFollow(FOLLOW_26);
                    ruletypes();

                    state._fsp--;


                    				doneComposite();
                    			

                    				markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_1_2ElementType());
                    			
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRuletypes"
    // PsiInternalThicket.g:649:1: entryRuletypes : ruletypes EOF ;
    public final void entryRuletypes() throws RecognitionException {
        try {
            // PsiInternalThicket.g:649:15: ( ruletypes EOF )
            // PsiInternalThicket.g:650:2: ruletypes EOF
            {
             markComposite(elementTypeProvider.getTypesElementType()); 
            pushFollow(FOLLOW_1);
            ruletypes();

            state._fsp--;

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
    // PsiInternalThicket.g:655:1: ruletypes : ( ruletype ( (kw= ',' | kw= '->' ) ruletypes )? ) ;
    public final void ruletypes() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalThicket.g:655:10: ( ( ruletype ( (kw= ',' | kw= '->' ) ruletypes )? ) )
            // PsiInternalThicket.g:656:2: ( ruletype ( (kw= ',' | kw= '->' ) ruletypes )? )
            {
            // PsiInternalThicket.g:656:2: ( ruletype ( (kw= ',' | kw= '->' ) ruletypes )? )
            // PsiInternalThicket.g:657:3: ruletype ( (kw= ',' | kw= '->' ) ruletypes )?
            {

            			markComposite(elementTypeProvider.getTypes_TypeParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_27);
            ruletype();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:664:3: ( (kw= ',' | kw= '->' ) ruletypes )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21||LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalThicket.g:665:4: (kw= ',' | kw= '->' ) ruletypes
                    {
                    // PsiInternalThicket.g:665:4: (kw= ',' | kw= '->' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==33) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // PsiInternalThicket.g:666:5: kw= ','
                            {

                            					markLeaf(elementTypeProvider.getTypes_CommaKeyword_1_0_0ElementType());
                            				
                            kw=(Token)match(input,21,FOLLOW_14); 

                            					doneLeaf(kw);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalThicket.g:674:5: kw= '->'
                            {

                            					markLeaf(elementTypeProvider.getTypes_HyphenMinusGreaterThanSignKeyword_1_0_1ElementType());
                            				
                            kw=(Token)match(input,33,FOLLOW_14); 

                            					doneLeaf(kw);
                            				

                            }
                            break;

                    }


                    				markComposite(elementTypeProvider.getTypes_TypesParserRuleCall_1_1ElementType());
                    			
                    pushFollow(FOLLOW_2);
                    ruletypes();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruletypes"


    // $ANTLR start "entryRuleexpressionDef"
    // PsiInternalThicket.g:694:1: entryRuleexpressionDef : ruleexpressionDef EOF ;
    public final void entryRuleexpressionDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:694:23: ( ruleexpressionDef EOF )
            // PsiInternalThicket.g:695:2: ruleexpressionDef EOF
            {
             markComposite(elementTypeProvider.getExpressionDefElementType()); 
            pushFollow(FOLLOW_1);
            ruleexpressionDef();

            state._fsp--;

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
    // PsiInternalThicket.g:700:1: ruleexpressionDef : (kw= 'def' (kw= 'adapter' )? ruleidentOrOp (kw= ':' rulegenerics ruletypes )? kw= '=' ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )? rulesexpr ) ;
    public final void ruleexpressionDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_7=null;

        try {
            // PsiInternalThicket.g:700:18: ( (kw= 'def' (kw= 'adapter' )? ruleidentOrOp (kw= ':' rulegenerics ruletypes )? kw= '=' ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )? rulesexpr ) )
            // PsiInternalThicket.g:701:2: (kw= 'def' (kw= 'adapter' )? ruleidentOrOp (kw= ':' rulegenerics ruletypes )? kw= '=' ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )? rulesexpr )
            {
            // PsiInternalThicket.g:701:2: (kw= 'def' (kw= 'adapter' )? ruleidentOrOp (kw= ':' rulegenerics ruletypes )? kw= '=' ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )? rulesexpr )
            // PsiInternalThicket.g:702:3: kw= 'def' (kw= 'adapter' )? ruleidentOrOp (kw= ':' rulegenerics ruletypes )? kw= '=' ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )? rulesexpr
            {

            			markLeaf(elementTypeProvider.getExpressionDef_DefKeyword_0ElementType());
            		
            kw=(Token)match(input,34,FOLLOW_28); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:709:3: (kw= 'adapter' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalThicket.g:710:4: kw= 'adapter'
                    {

                    				markLeaf(elementTypeProvider.getExpressionDef_AdapterKeyword_1ElementType());
                    			
                    kw=(Token)match(input,35,FOLLOW_8); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            			markComposite(elementTypeProvider.getExpressionDef_IdentOrOpParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_29);
            ruleidentOrOp();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:725:3: (kw= ':' rulegenerics ruletypes )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalThicket.g:726:4: kw= ':' rulegenerics ruletypes
                    {

                    				markLeaf(elementTypeProvider.getExpressionDef_ColonKeyword_3_0ElementType());
                    			
                    kw=(Token)match(input,28,FOLLOW_14); 

                    				doneLeaf(kw);
                    			

                    				markComposite(elementTypeProvider.getExpressionDef_GenericsParserRuleCall_3_1ElementType());
                    			
                    pushFollow(FOLLOW_14);
                    rulegenerics();

                    state._fsp--;


                    				doneComposite();
                    			

                    				markComposite(elementTypeProvider.getExpressionDef_TypesParserRuleCall_3_2ElementType());
                    			
                    pushFollow(FOLLOW_13);
                    ruletypes();

                    state._fsp--;


                    				doneComposite();
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getExpressionDef_EqualsSignKeyword_4ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_30); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:755:3: ( (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENT) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_IDENT||LA27_1==28||LA27_1==33) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalThicket.g:756:4: (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+ kw= '->'
                    {
                    // PsiInternalThicket.g:756:4: (this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )? )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_IDENT) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // PsiInternalThicket.g:757:5: this_ident_7= RULE_IDENT (kw= ':' rulegenerics ruletype )?
                    	    {

                    	    					markLeaf(elementTypeProvider.getExpressionDef_IdentTerminalRuleCall_5_0_0ElementType());
                    	    				
                    	    this_ident_7=(Token)match(input,RULE_IDENT,FOLLOW_31); 

                    	    					doneLeaf(this_ident_7);
                    	    				
                    	    // PsiInternalThicket.g:764:5: (kw= ':' rulegenerics ruletype )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==28) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // PsiInternalThicket.g:765:6: kw= ':' rulegenerics ruletype
                    	            {

                    	            						markLeaf(elementTypeProvider.getExpressionDef_ColonKeyword_5_0_1_0ElementType());
                    	            					
                    	            kw=(Token)match(input,28,FOLLOW_14); 

                    	            						doneLeaf(kw);
                    	            					

                    	            						markComposite(elementTypeProvider.getExpressionDef_GenericsParserRuleCall_5_0_1_1ElementType());
                    	            					
                    	            pushFollow(FOLLOW_14);
                    	            rulegenerics();

                    	            state._fsp--;


                    	            						doneComposite();
                    	            					

                    	            						markComposite(elementTypeProvider.getExpressionDef_TypeParserRuleCall_5_0_1_2ElementType());
                    	            					
                    	            pushFollow(FOLLOW_32);
                    	            ruletype();

                    	            state._fsp--;


                    	            						doneComposite();
                    	            					

                    	            }
                    	            break;

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


                    				markLeaf(elementTypeProvider.getExpressionDef_HyphenMinusGreaterThanSignKeyword_5_1ElementType());
                    			
                    kw=(Token)match(input,33,FOLLOW_30); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            			markComposite(elementTypeProvider.getExpressionDef_SexprParserRuleCall_6ElementType());
            		
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;


            			doneComposite();
            		

            }


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
    // $ANTLR end "ruleexpressionDef"


    // $ANTLR start "entryRuleclassDef"
    // PsiInternalThicket.g:807:1: entryRuleclassDef : ruleclassDef EOF ;
    public final void entryRuleclassDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:807:18: ( ruleclassDef EOF )
            // PsiInternalThicket.g:808:2: ruleclassDef EOF
            {
             markComposite(elementTypeProvider.getClassDefElementType()); 
            pushFollow(FOLLOW_1);
            ruleclassDef();

            state._fsp--;

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
    // PsiInternalThicket.g:813:1: ruleclassDef : (kw= 'class' this_ident_1= RULE_IDENT rulegenerics ruletparam kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodClass )* kw= '}' ) ;
    public final void ruleclassDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;

        try {
            // PsiInternalThicket.g:813:13: ( (kw= 'class' this_ident_1= RULE_IDENT rulegenerics ruletparam kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodClass )* kw= '}' ) )
            // PsiInternalThicket.g:814:2: (kw= 'class' this_ident_1= RULE_IDENT rulegenerics ruletparam kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodClass )* kw= '}' )
            {
            // PsiInternalThicket.g:814:2: (kw= 'class' this_ident_1= RULE_IDENT rulegenerics ruletparam kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodClass )* kw= '}' )
            // PsiInternalThicket.g:815:3: kw= 'class' this_ident_1= RULE_IDENT rulegenerics ruletparam kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodClass )* kw= '}'
            {

            			markLeaf(elementTypeProvider.getClassDef_ClassKeyword_0ElementType());
            		
            kw=(Token)match(input,36,FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getClassDef_IdentTerminalRuleCall_1ElementType());
            		
            this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_33); 

            			doneLeaf(this_ident_1);
            		

            			markComposite(elementTypeProvider.getClassDef_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_8);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markComposite(elementTypeProvider.getClassDef_TparamParserRuleCall_3ElementType());
            		
            pushFollow(FOLLOW_16);
            ruletparam();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getClassDef_LeftCurlyBracketKeyword_4ElementType());
            		
            kw=(Token)match(input,25,FOLLOW_34); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:850:3: ( (kw= '+' ruletype ) | ruletparam )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }
                else if ( (LA28_0==RULE_IDENT||LA28_0==31) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // PsiInternalThicket.g:851:4: (kw= '+' ruletype )
            	    {
            	    // PsiInternalThicket.g:851:4: (kw= '+' ruletype )
            	    // PsiInternalThicket.g:852:5: kw= '+' ruletype
            	    {

            	    					markLeaf(elementTypeProvider.getClassDef_PlusSignKeyword_5_0_0ElementType());
            	    				
            	    kw=(Token)match(input,37,FOLLOW_14); 

            	    					doneLeaf(kw);
            	    				

            	    					markComposite(elementTypeProvider.getClassDef_TypeParserRuleCall_5_0_1ElementType());
            	    				
            	    pushFollow(FOLLOW_34);
            	    ruletype();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalThicket.g:868:4: ruletparam
            	    {

            	    				markComposite(elementTypeProvider.getClassDef_TparamParserRuleCall_5_1ElementType());
            	    			
            	    pushFollow(FOLLOW_34);
            	    ruletparam();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getClassDef_RightCurlyBracketKeyword_6ElementType());
            		
            kw=(Token)match(input,27,FOLLOW_16); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getClassDef_LeftCurlyBracketKeyword_7ElementType());
            		
            kw=(Token)match(input,25,FOLLOW_35); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:890:3: ( rulemethodClass )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PsiInternalThicket.g:891:4: rulemethodClass
            	    {

            	    				markComposite(elementTypeProvider.getClassDef_MethodClassParserRuleCall_8ElementType());
            	    			
            	    pushFollow(FOLLOW_35);
            	    rulemethodClass();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getClassDef_RightCurlyBracketKeyword_9ElementType());
            		
            kw=(Token)match(input,27,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


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
    // $ANTLR end "ruleclassDef"


    // $ANTLR start "entryRuletraitDef"
    // PsiInternalThicket.g:910:1: entryRuletraitDef : ruletraitDef EOF ;
    public final void entryRuletraitDef() throws RecognitionException {
        try {
            // PsiInternalThicket.g:910:18: ( ruletraitDef EOF )
            // PsiInternalThicket.g:911:2: ruletraitDef EOF
            {
             markComposite(elementTypeProvider.getTraitDefElementType()); 
            pushFollow(FOLLOW_1);
            ruletraitDef();

            state._fsp--;

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
    // PsiInternalThicket.g:916:1: ruletraitDef : (kw= 'trait' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodTrait )* kw= '}' ) ;
    public final void ruletraitDef() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;

        try {
            // PsiInternalThicket.g:916:13: ( (kw= 'trait' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodTrait )* kw= '}' ) )
            // PsiInternalThicket.g:917:2: (kw= 'trait' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodTrait )* kw= '}' )
            {
            // PsiInternalThicket.g:917:2: (kw= 'trait' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodTrait )* kw= '}' )
            // PsiInternalThicket.g:918:3: kw= 'trait' this_ident_1= RULE_IDENT rulegenerics kw= '{' ( (kw= '+' ruletype ) | ruletparam )* kw= '}' kw= '{' ( rulemethodTrait )* kw= '}'
            {

            			markLeaf(elementTypeProvider.getTraitDef_TraitKeyword_0ElementType());
            		
            kw=(Token)match(input,38,FOLLOW_3); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getTraitDef_IdentTerminalRuleCall_1ElementType());
            		
            this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            			doneLeaf(this_ident_1);
            		

            			markComposite(elementTypeProvider.getTraitDef_GenericsParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_16);
            rulegenerics();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf(elementTypeProvider.getTraitDef_LeftCurlyBracketKeyword_3ElementType());
            		
            kw=(Token)match(input,25,FOLLOW_34); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:946:3: ( (kw= '+' ruletype ) | ruletparam )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }
                else if ( (LA30_0==RULE_IDENT||LA30_0==31) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // PsiInternalThicket.g:947:4: (kw= '+' ruletype )
            	    {
            	    // PsiInternalThicket.g:947:4: (kw= '+' ruletype )
            	    // PsiInternalThicket.g:948:5: kw= '+' ruletype
            	    {

            	    					markLeaf(elementTypeProvider.getTraitDef_PlusSignKeyword_4_0_0ElementType());
            	    				
            	    kw=(Token)match(input,37,FOLLOW_14); 

            	    					doneLeaf(kw);
            	    				

            	    					markComposite(elementTypeProvider.getTraitDef_TypeParserRuleCall_4_0_1ElementType());
            	    				
            	    pushFollow(FOLLOW_34);
            	    ruletype();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalThicket.g:964:4: ruletparam
            	    {

            	    				markComposite(elementTypeProvider.getTraitDef_TparamParserRuleCall_4_1ElementType());
            	    			
            	    pushFollow(FOLLOW_34);
            	    ruletparam();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getTraitDef_RightCurlyBracketKeyword_5ElementType());
            		
            kw=(Token)match(input,27,FOLLOW_16); 

            			doneLeaf(kw);
            		

            			markLeaf(elementTypeProvider.getTraitDef_LeftCurlyBracketKeyword_6ElementType());
            		
            kw=(Token)match(input,25,FOLLOW_35); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:986:3: ( rulemethodTrait )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // PsiInternalThicket.g:987:4: rulemethodTrait
            	    {

            	    				markComposite(elementTypeProvider.getTraitDef_MethodTraitParserRuleCall_7ElementType());
            	    			
            	    pushFollow(FOLLOW_35);
            	    rulemethodTrait();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getTraitDef_RightCurlyBracketKeyword_8ElementType());
            		
            kw=(Token)match(input,27,FOLLOW_2); 

            			doneLeaf(kw);
            		

            }


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
    // $ANTLR end "ruletraitDef"


    // $ANTLR start "entryRulemethodClass"
    // PsiInternalThicket.g:1006:1: entryRulemethodClass : rulemethodClass EOF ;
    public final void entryRulemethodClass() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1006:21: ( rulemethodClass EOF )
            // PsiInternalThicket.g:1007:2: rulemethodClass EOF
            {
             markComposite(elementTypeProvider.getMethodClassElementType()); 
            pushFollow(FOLLOW_1);
            rulemethodClass();

            state._fsp--;

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
    // PsiInternalThicket.g:1012:1: rulemethodClass : (kw= 'def' (this_ident_1= RULE_IDENT kw= '.' )? ruleidentOrOp (this_ident_4= RULE_IDENT )* kw= '=' ( ruleexpr )+ ) ;
    public final void rulemethodClass() throws RecognitionException {
        Token kw=null;
        Token this_ident_1=null;
        Token this_ident_4=null;

        try {
            // PsiInternalThicket.g:1012:16: ( (kw= 'def' (this_ident_1= RULE_IDENT kw= '.' )? ruleidentOrOp (this_ident_4= RULE_IDENT )* kw= '=' ( ruleexpr )+ ) )
            // PsiInternalThicket.g:1013:2: (kw= 'def' (this_ident_1= RULE_IDENT kw= '.' )? ruleidentOrOp (this_ident_4= RULE_IDENT )* kw= '=' ( ruleexpr )+ )
            {
            // PsiInternalThicket.g:1013:2: (kw= 'def' (this_ident_1= RULE_IDENT kw= '.' )? ruleidentOrOp (this_ident_4= RULE_IDENT )* kw= '=' ( ruleexpr )+ )
            // PsiInternalThicket.g:1014:3: kw= 'def' (this_ident_1= RULE_IDENT kw= '.' )? ruleidentOrOp (this_ident_4= RULE_IDENT )* kw= '=' ( ruleexpr )+
            {

            			markLeaf(elementTypeProvider.getMethodClass_DefKeyword_0ElementType());
            		
            kw=(Token)match(input,34,FOLLOW_8); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:1021:3: (this_ident_1= RULE_IDENT kw= '.' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==17) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalThicket.g:1022:4: this_ident_1= RULE_IDENT kw= '.'
                    {

                    				markLeaf(elementTypeProvider.getMethodClass_IdentTerminalRuleCall_1_0ElementType());
                    			
                    this_ident_1=(Token)match(input,RULE_IDENT,FOLLOW_36); 

                    				doneLeaf(this_ident_1);
                    			

                    				markLeaf(elementTypeProvider.getMethodClass_FullStopKeyword_1_1ElementType());
                    			
                    kw=(Token)match(input,17,FOLLOW_8); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            			markComposite(elementTypeProvider.getMethodClass_IdentOrOpParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_37);
            ruleidentOrOp();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:1044:3: (this_ident_4= RULE_IDENT )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_IDENT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // PsiInternalThicket.g:1045:4: this_ident_4= RULE_IDENT
            	    {

            	    				markLeaf(elementTypeProvider.getMethodClass_IdentTerminalRuleCall_3ElementType());
            	    			
            	    this_ident_4=(Token)match(input,RULE_IDENT,FOLLOW_37); 

            	    				doneLeaf(this_ident_4);
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getMethodClass_EqualsSignKeyword_4ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_30); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:1060:3: ( ruleexpr )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_IDENT && LA34_0<=RULE_DOLL)||LA34_0==25||LA34_0==31||LA34_0==39||LA34_0==43||LA34_0==47||LA34_0==49) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // PsiInternalThicket.g:1061:4: ruleexpr
            	    {

            	    				markComposite(elementTypeProvider.getMethodClass_ExprParserRuleCall_5ElementType());
            	    			
            	    pushFollow(FOLLOW_38);
            	    ruleexpr();

            	    state._fsp--;


            	    				doneComposite();
            	    			

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
    // $ANTLR end "rulemethodClass"


    // $ANTLR start "entryRulemethodTrait"
    // PsiInternalThicket.g:1073:1: entryRulemethodTrait : rulemethodTrait EOF ;
    public final void entryRulemethodTrait() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1073:21: ( rulemethodTrait EOF )
            // PsiInternalThicket.g:1074:2: rulemethodTrait EOF
            {
             markComposite(elementTypeProvider.getMethodTraitElementType()); 
            pushFollow(FOLLOW_1);
            rulemethodTrait();

            state._fsp--;

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
    // PsiInternalThicket.g:1079:1: rulemethodTrait : (kw= 'def' ruleidentOrOp (this_ident_2= RULE_IDENT )* kw= '=' ( ruleexpr )+ ) ;
    public final void rulemethodTrait() throws RecognitionException {
        Token kw=null;
        Token this_ident_2=null;

        try {
            // PsiInternalThicket.g:1079:16: ( (kw= 'def' ruleidentOrOp (this_ident_2= RULE_IDENT )* kw= '=' ( ruleexpr )+ ) )
            // PsiInternalThicket.g:1080:2: (kw= 'def' ruleidentOrOp (this_ident_2= RULE_IDENT )* kw= '=' ( ruleexpr )+ )
            {
            // PsiInternalThicket.g:1080:2: (kw= 'def' ruleidentOrOp (this_ident_2= RULE_IDENT )* kw= '=' ( ruleexpr )+ )
            // PsiInternalThicket.g:1081:3: kw= 'def' ruleidentOrOp (this_ident_2= RULE_IDENT )* kw= '=' ( ruleexpr )+
            {

            			markLeaf(elementTypeProvider.getMethodTrait_DefKeyword_0ElementType());
            		
            kw=(Token)match(input,34,FOLLOW_8); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getMethodTrait_IdentOrOpParserRuleCall_1ElementType());
            		
            pushFollow(FOLLOW_37);
            ruleidentOrOp();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:1095:3: (this_ident_2= RULE_IDENT )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_IDENT) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // PsiInternalThicket.g:1096:4: this_ident_2= RULE_IDENT
            	    {

            	    				markLeaf(elementTypeProvider.getMethodTrait_IdentTerminalRuleCall_2ElementType());
            	    			
            	    this_ident_2=(Token)match(input,RULE_IDENT,FOLLOW_37); 

            	    				doneLeaf(this_ident_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getMethodTrait_EqualsSignKeyword_3ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_30); 

            			doneLeaf(kw);
            		
            // PsiInternalThicket.g:1111:3: ( ruleexpr )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_IDENT && LA36_0<=RULE_DOLL)||LA36_0==25||LA36_0==31||LA36_0==39||LA36_0==43||LA36_0==47||LA36_0==49) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // PsiInternalThicket.g:1112:4: ruleexpr
            	    {

            	    				markComposite(elementTypeProvider.getMethodTrait_ExprParserRuleCall_4ElementType());
            	    			
            	    pushFollow(FOLLOW_38);
            	    ruleexpr();

            	    state._fsp--;


            	    				doneComposite();
            	    			

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


            }


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
    // $ANTLR end "rulemethodTrait"


    // $ANTLR start "entryRuleexpr"
    // PsiInternalThicket.g:1124:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1124:14: ( ruleexpr EOF )
            // PsiInternalThicket.g:1125:2: ruleexpr EOF
            {
             markComposite(elementTypeProvider.getExprElementType()); 
            pushFollow(FOLLOW_1);
            ruleexpr();

            state._fsp--;

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
    // PsiInternalThicket.g:1130:1: ruleexpr : ( ruleiexpr (kw= ',' ruleiexpr )* ) ;
    public final void ruleexpr() throws RecognitionException {
        Token kw=null;

        try {
            // PsiInternalThicket.g:1130:9: ( ( ruleiexpr (kw= ',' ruleiexpr )* ) )
            // PsiInternalThicket.g:1131:2: ( ruleiexpr (kw= ',' ruleiexpr )* )
            {
            // PsiInternalThicket.g:1131:2: ( ruleiexpr (kw= ',' ruleiexpr )* )
            // PsiInternalThicket.g:1132:3: ruleiexpr (kw= ',' ruleiexpr )*
            {

            			markComposite(elementTypeProvider.getExpr_IexprParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_10);
            ruleiexpr();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:1139:3: (kw= ',' ruleiexpr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // PsiInternalThicket.g:1140:4: kw= ',' ruleiexpr
            	    {

            	    				markLeaf(elementTypeProvider.getExpr_CommaKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,21,FOLLOW_30); 

            	    				doneLeaf(kw);
            	    			

            	    				markComposite(elementTypeProvider.getExpr_IexprParserRuleCall_1_1ElementType());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleiexpr();

            	    state._fsp--;


            	    				doneComposite();
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuleiexpr"
    // PsiInternalThicket.g:1159:1: entryRuleiexpr : ruleiexpr EOF ;
    public final void entryRuleiexpr() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1159:15: ( ruleiexpr EOF )
            // PsiInternalThicket.g:1160:2: ruleiexpr EOF
            {
             markComposite(elementTypeProvider.getIexprElementType()); 
            pushFollow(FOLLOW_1);
            ruleiexpr();

            state._fsp--;

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
    // PsiInternalThicket.g:1165:1: ruleiexpr : ( rulesexpr (kw= '.' this_ident_2= RULE_IDENT )* ) ;
    public final void ruleiexpr() throws RecognitionException {
        Token kw=null;
        Token this_ident_2=null;

        try {
            // PsiInternalThicket.g:1165:10: ( ( rulesexpr (kw= '.' this_ident_2= RULE_IDENT )* ) )
            // PsiInternalThicket.g:1166:2: ( rulesexpr (kw= '.' this_ident_2= RULE_IDENT )* )
            {
            // PsiInternalThicket.g:1166:2: ( rulesexpr (kw= '.' this_ident_2= RULE_IDENT )* )
            // PsiInternalThicket.g:1167:3: rulesexpr (kw= '.' this_ident_2= RULE_IDENT )*
            {

            			markComposite(elementTypeProvider.getIexpr_SexprParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_11);
            rulesexpr();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalThicket.g:1174:3: (kw= '.' this_ident_2= RULE_IDENT )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // PsiInternalThicket.g:1175:4: kw= '.' this_ident_2= RULE_IDENT
            	    {

            	    				markLeaf(elementTypeProvider.getIexpr_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,17,FOLLOW_3); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getIexpr_IdentTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ident_2=(Token)match(input,RULE_IDENT,FOLLOW_11); 

            	    				doneLeaf(this_ident_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleiexpr"


    // $ANTLR start "entryRulesexpr"
    // PsiInternalThicket.g:1194:1: entryRulesexpr : rulesexpr EOF ;
    public final void entryRulesexpr() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1194:15: ( rulesexpr EOF )
            // PsiInternalThicket.g:1195:2: rulesexpr EOF
            {
             markComposite(elementTypeProvider.getSexprElementType()); 
            pushFollow(FOLLOW_1);
            rulesexpr();

            state._fsp--;

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
    // PsiInternalThicket.g:1200:1: rulesexpr : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_OP_2= RULE_OP | this_DOLL_3= RULE_DOLL | (kw= '(' ( ruleexpr )+ kw= ')' ) | (kw= '{' ( ruleexpr )+ kw= '}' ) | (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) ) | (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr ) | (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr ) | (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ ) | this_ident_42= RULE_IDENT ) ;
    public final void rulesexpr() throws RecognitionException {
        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_OP_2=null;
        Token this_DOLL_3=null;
        Token kw=null;
        Token this_ident_11=null;
        Token this_ident_16=null;
        Token this_ident_20=null;
        Token this_ident_28=null;
        Token this_ident_39=null;
        Token this_ident_42=null;

        try {
            // PsiInternalThicket.g:1200:10: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_OP_2= RULE_OP | this_DOLL_3= RULE_DOLL | (kw= '(' ( ruleexpr )+ kw= ')' ) | (kw= '{' ( ruleexpr )+ kw= '}' ) | (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) ) | (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr ) | (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr ) | (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ ) | this_ident_42= RULE_IDENT ) )
            // PsiInternalThicket.g:1201:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_OP_2= RULE_OP | this_DOLL_3= RULE_DOLL | (kw= '(' ( ruleexpr )+ kw= ')' ) | (kw= '{' ( ruleexpr )+ kw= '}' ) | (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) ) | (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr ) | (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr ) | (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ ) | this_ident_42= RULE_IDENT )
            {
            // PsiInternalThicket.g:1201:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_OP_2= RULE_OP | this_DOLL_3= RULE_DOLL | (kw= '(' ( ruleexpr )+ kw= ')' ) | (kw= '{' ( ruleexpr )+ kw= '}' ) | (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) ) | (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr ) | (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr ) | (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ ) | this_ident_42= RULE_IDENT )
            int alt52=11;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case RULE_OP:
                {
                alt52=3;
                }
                break;
            case RULE_DOLL:
                {
                alt52=4;
                }
                break;
            case 31:
                {
                alt52=5;
                }
                break;
            case 25:
                {
                alt52=6;
                }
                break;
            case 39:
                {
                alt52=7;
                }
                break;
            case 43:
                {
                alt52=8;
                }
                break;
            case 47:
                {
                alt52=9;
                }
                break;
            case 49:
                {
                alt52=10;
                }
                break;
            case RULE_IDENT:
                {
                alt52=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // PsiInternalThicket.g:1202:3: this_INT_0= RULE_INT
                    {

                    			markLeaf(elementTypeProvider.getSexpr_INTTerminalRuleCall_0ElementType());
                    		
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			doneLeaf(this_INT_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:1210:3: this_STRING_1= RULE_STRING
                    {

                    			markLeaf(elementTypeProvider.getSexpr_STRINGTerminalRuleCall_1ElementType());
                    		
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			doneLeaf(this_STRING_1);
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalThicket.g:1218:3: this_OP_2= RULE_OP
                    {

                    			markLeaf(elementTypeProvider.getSexpr_OPTerminalRuleCall_2ElementType());
                    		
                    this_OP_2=(Token)match(input,RULE_OP,FOLLOW_2); 

                    			doneLeaf(this_OP_2);
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalThicket.g:1226:3: this_DOLL_3= RULE_DOLL
                    {

                    			markLeaf(elementTypeProvider.getSexpr_DOLLTerminalRuleCall_3ElementType());
                    		
                    this_DOLL_3=(Token)match(input,RULE_DOLL,FOLLOW_2); 

                    			doneLeaf(this_DOLL_3);
                    		

                    }
                    break;
                case 5 :
                    // PsiInternalThicket.g:1234:3: (kw= '(' ( ruleexpr )+ kw= ')' )
                    {
                    // PsiInternalThicket.g:1234:3: (kw= '(' ( ruleexpr )+ kw= ')' )
                    // PsiInternalThicket.g:1235:4: kw= '(' ( ruleexpr )+ kw= ')'
                    {

                    				markLeaf(elementTypeProvider.getSexpr_LeftParenthesisKeyword_4_0ElementType());
                    			
                    kw=(Token)match(input,31,FOLLOW_30); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1242:4: ( ruleexpr )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=RULE_IDENT && LA39_0<=RULE_DOLL)||LA39_0==25||LA39_0==31||LA39_0==39||LA39_0==43||LA39_0==47||LA39_0==49) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1243:5: ruleexpr
                    	    {

                    	    					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_4_1ElementType());
                    	    				
                    	    pushFollow(FOLLOW_39);
                    	    ruleexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

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


                    				markLeaf(elementTypeProvider.getSexpr_RightParenthesisKeyword_4_2ElementType());
                    			
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }


                    }
                    break;
                case 6 :
                    // PsiInternalThicket.g:1260:3: (kw= '{' ( ruleexpr )+ kw= '}' )
                    {
                    // PsiInternalThicket.g:1260:3: (kw= '{' ( ruleexpr )+ kw= '}' )
                    // PsiInternalThicket.g:1261:4: kw= '{' ( ruleexpr )+ kw= '}'
                    {

                    				markLeaf(elementTypeProvider.getSexpr_LeftCurlyBracketKeyword_5_0ElementType());
                    			
                    kw=(Token)match(input,25,FOLLOW_30); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1268:4: ( ruleexpr )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_IDENT && LA40_0<=RULE_DOLL)||LA40_0==25||LA40_0==31||LA40_0==39||LA40_0==43||LA40_0==47||LA40_0==49) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1269:5: ruleexpr
                    	    {

                    	    					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_5_1ElementType());
                    	    				
                    	    pushFollow(FOLLOW_40);
                    	    ruleexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

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


                    				markLeaf(elementTypeProvider.getSexpr_RightCurlyBracketKeyword_5_2ElementType());
                    			
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }


                    }
                    break;
                case 7 :
                    // PsiInternalThicket.g:1286:3: (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) )
                    {
                    // PsiInternalThicket.g:1286:3: (kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' ) )
                    // PsiInternalThicket.g:1287:4: kw= '<' this_ident_11= RULE_IDENT ( ruleattr )* ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' )
                    {

                    				markLeaf(elementTypeProvider.getSexpr_LessThanSignKeyword_6_0ElementType());
                    			
                    kw=(Token)match(input,39,FOLLOW_3); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_6_1ElementType());
                    			
                    this_ident_11=(Token)match(input,RULE_IDENT,FOLLOW_41); 

                    				doneLeaf(this_ident_11);
                    			
                    // PsiInternalThicket.g:1301:4: ( ruleattr )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_IDENT) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1302:5: ruleattr
                    	    {

                    	    					markComposite(elementTypeProvider.getSexpr_AttrParserRuleCall_6_2ElementType());
                    	    				
                    	    pushFollow(FOLLOW_41);
                    	    ruleattr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // PsiInternalThicket.g:1310:4: ( (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' ) | kw= '/>' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==40) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==42) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // PsiInternalThicket.g:1311:5: (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' )
                            {
                            // PsiInternalThicket.g:1311:5: (kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>' )
                            // PsiInternalThicket.g:1312:6: kw= '>' ( ruleexpr )+ kw= '</' (this_ident_16= RULE_IDENT )? kw= '>'
                            {

                            						markLeaf(elementTypeProvider.getSexpr_GreaterThanSignKeyword_6_3_0_0ElementType());
                            					
                            kw=(Token)match(input,40,FOLLOW_30); 

                            						doneLeaf(kw);
                            					
                            // PsiInternalThicket.g:1319:6: ( ruleexpr )+
                            int cnt42=0;
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( ((LA42_0>=RULE_IDENT && LA42_0<=RULE_DOLL)||LA42_0==25||LA42_0==31||LA42_0==39||LA42_0==43||LA42_0==47||LA42_0==49) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // PsiInternalThicket.g:1320:7: ruleexpr
                            	    {

                            	    							markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_6_3_0_1ElementType());
                            	    						
                            	    pushFollow(FOLLOW_42);
                            	    ruleexpr();

                            	    state._fsp--;


                            	    							doneComposite();
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt42 >= 1 ) break loop42;
                                        EarlyExitException eee =
                                            new EarlyExitException(42, input);
                                        throw eee;
                                }
                                cnt42++;
                            } while (true);


                            						markLeaf(elementTypeProvider.getSexpr_LessThanSignSolidusKeyword_6_3_0_2ElementType());
                            					
                            kw=(Token)match(input,41,FOLLOW_43); 

                            						doneLeaf(kw);
                            					
                            // PsiInternalThicket.g:1335:6: (this_ident_16= RULE_IDENT )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==RULE_IDENT) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // PsiInternalThicket.g:1336:7: this_ident_16= RULE_IDENT
                                    {

                                    							markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_6_3_0_3ElementType());
                                    						
                                    this_ident_16=(Token)match(input,RULE_IDENT,FOLLOW_44); 

                                    							doneLeaf(this_ident_16);
                                    						

                                    }
                                    break;

                            }


                            						markLeaf(elementTypeProvider.getSexpr_GreaterThanSignKeyword_6_3_0_4ElementType());
                            					
                            kw=(Token)match(input,40,FOLLOW_2); 

                            						doneLeaf(kw);
                            					

                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalThicket.g:1353:5: kw= '/>'
                            {

                            					markLeaf(elementTypeProvider.getSexpr_SolidusGreaterThanSignKeyword_6_3_1ElementType());
                            				
                            kw=(Token)match(input,42,FOLLOW_2); 

                            					doneLeaf(kw);
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // PsiInternalThicket.g:1363:3: (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr )
                    {
                    // PsiInternalThicket.g:1363:3: (kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr )
                    // PsiInternalThicket.g:1364:4: kw= 'for' (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+ (kw= 'if' ( ruleexpr )+ )* kw= 'yield' ruleexpr
                    {

                    				markLeaf(elementTypeProvider.getSexpr_ForKeyword_7_0ElementType());
                    			
                    kw=(Token)match(input,43,FOLLOW_3); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1371:4: (this_ident_20= RULE_IDENT kw= '<-' rulesexpr )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_IDENT) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1372:5: this_ident_20= RULE_IDENT kw= '<-' rulesexpr
                    	    {

                    	    					markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_7_1_0ElementType());
                    	    				
                    	    this_ident_20=(Token)match(input,RULE_IDENT,FOLLOW_45); 

                    	    					doneLeaf(this_ident_20);
                    	    				

                    	    					markLeaf(elementTypeProvider.getSexpr_LessThanSignHyphenMinusKeyword_7_1_1ElementType());
                    	    				
                    	    kw=(Token)match(input,44,FOLLOW_30); 

                    	    					doneLeaf(kw);
                    	    				

                    	    					markComposite(elementTypeProvider.getSexpr_SexprParserRuleCall_7_1_2ElementType());
                    	    				
                    	    pushFollow(FOLLOW_46);
                    	    rulesexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    // PsiInternalThicket.g:1394:4: (kw= 'if' ( ruleexpr )+ )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==45) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1395:5: kw= 'if' ( ruleexpr )+
                    	    {

                    	    					markLeaf(elementTypeProvider.getSexpr_IfKeyword_7_2_0ElementType());
                    	    				
                    	    kw=(Token)match(input,45,FOLLOW_30); 

                    	    					doneLeaf(kw);
                    	    				
                    	    // PsiInternalThicket.g:1402:5: ( ruleexpr )+
                    	    int cnt46=0;
                    	    loop46:
                    	    do {
                    	        int alt46=2;
                    	        int LA46_0 = input.LA(1);

                    	        if ( ((LA46_0>=RULE_IDENT && LA46_0<=RULE_DOLL)||LA46_0==25||LA46_0==31||LA46_0==39||LA46_0==43||LA46_0==47||LA46_0==49) ) {
                    	            alt46=1;
                    	        }


                    	        switch (alt46) {
                    	    	case 1 :
                    	    	    // PsiInternalThicket.g:1403:6: ruleexpr
                    	    	    {

                    	    	    						markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_7_2_1ElementType());
                    	    	    					
                    	    	    pushFollow(FOLLOW_47);
                    	    	    ruleexpr();

                    	    	    state._fsp--;


                    	    	    						doneComposite();
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt46 >= 1 ) break loop46;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(46, input);
                    	                throw eee;
                    	        }
                    	        cnt46++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getSexpr_YieldKeyword_7_3ElementType());
                    			
                    kw=(Token)match(input,46,FOLLOW_30); 

                    				doneLeaf(kw);
                    			

                    				markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_7_4ElementType());
                    			
                    pushFollow(FOLLOW_2);
                    ruleexpr();

                    state._fsp--;


                    				doneComposite();
                    			

                    }


                    }
                    break;
                case 9 :
                    // PsiInternalThicket.g:1428:3: (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr )
                    {
                    // PsiInternalThicket.g:1428:3: (kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr )
                    // PsiInternalThicket.g:1429:4: kw= 'let' this_ident_28= RULE_IDENT (kw= ':' rulegenerics ruletype )? kw= '=' ( ruleexpr )+ kw= 'in' ruleexpr
                    {

                    				markLeaf(elementTypeProvider.getSexpr_LetKeyword_8_0ElementType());
                    			
                    kw=(Token)match(input,47,FOLLOW_3); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_8_1ElementType());
                    			
                    this_ident_28=(Token)match(input,RULE_IDENT,FOLLOW_29); 

                    				doneLeaf(this_ident_28);
                    			
                    // PsiInternalThicket.g:1443:4: (kw= ':' rulegenerics ruletype )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==28) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // PsiInternalThicket.g:1444:5: kw= ':' rulegenerics ruletype
                            {

                            					markLeaf(elementTypeProvider.getSexpr_ColonKeyword_8_2_0ElementType());
                            				
                            kw=(Token)match(input,28,FOLLOW_14); 

                            					doneLeaf(kw);
                            				

                            					markComposite(elementTypeProvider.getSexpr_GenericsParserRuleCall_8_2_1ElementType());
                            				
                            pushFollow(FOLLOW_14);
                            rulegenerics();

                            state._fsp--;


                            					doneComposite();
                            				

                            					markComposite(elementTypeProvider.getSexpr_TypeParserRuleCall_8_2_2ElementType());
                            				
                            pushFollow(FOLLOW_13);
                            ruletype();

                            state._fsp--;


                            					doneComposite();
                            				

                            }
                            break;

                    }


                    				markLeaf(elementTypeProvider.getSexpr_EqualsSignKeyword_8_3ElementType());
                    			
                    kw=(Token)match(input,23,FOLLOW_30); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1473:4: ( ruleexpr )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=RULE_IDENT && LA49_0<=RULE_DOLL)||LA49_0==25||LA49_0==31||LA49_0==39||LA49_0==43||LA49_0==47||LA49_0==49) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1474:5: ruleexpr
                    	    {

                    	    					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_8_4ElementType());
                    	    				
                    	    pushFollow(FOLLOW_48);
                    	    ruleexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    				markLeaf(elementTypeProvider.getSexpr_InKeyword_8_5ElementType());
                    			
                    kw=(Token)match(input,48,FOLLOW_30); 

                    				doneLeaf(kw);
                    			

                    				markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_8_6ElementType());
                    			
                    pushFollow(FOLLOW_2);
                    ruleexpr();

                    state._fsp--;


                    				doneComposite();
                    			

                    }


                    }
                    break;
                case 10 :
                    // PsiInternalThicket.g:1498:3: (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ )
                    {
                    // PsiInternalThicket.g:1498:3: (kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+ )
                    // PsiInternalThicket.g:1499:4: kw= 'new' ( ruleexpr )+ kw= 'with' (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+
                    {

                    				markLeaf(elementTypeProvider.getSexpr_NewKeyword_9_0ElementType());
                    			
                    kw=(Token)match(input,49,FOLLOW_30); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1506:4: ( ruleexpr )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_IDENT && LA50_0<=RULE_DOLL)||LA50_0==25||LA50_0==31||LA50_0==39||LA50_0==43||LA50_0==47||LA50_0==49) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1507:5: ruleexpr
                    	    {

                    	    					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_9_1ElementType());
                    	    				
                    	    pushFollow(FOLLOW_49);
                    	    ruleexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    				markLeaf(elementTypeProvider.getSexpr_WithKeyword_9_2ElementType());
                    			
                    kw=(Token)match(input,50,FOLLOW_3); 

                    				doneLeaf(kw);
                    			
                    // PsiInternalThicket.g:1522:4: (this_ident_39= RULE_IDENT kw= '=' rulesexpr )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_IDENT) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1523:5: this_ident_39= RULE_IDENT kw= '=' rulesexpr
                    	    {

                    	    					markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_9_3_0ElementType());
                    	    				
                    	    this_ident_39=(Token)match(input,RULE_IDENT,FOLLOW_13); 

                    	    					doneLeaf(this_ident_39);
                    	    				

                    	    					markLeaf(elementTypeProvider.getSexpr_EqualsSignKeyword_9_3_1ElementType());
                    	    				
                    	    kw=(Token)match(input,23,FOLLOW_30); 

                    	    					doneLeaf(kw);
                    	    				

                    	    					markComposite(elementTypeProvider.getSexpr_SexprParserRuleCall_9_3_2ElementType());
                    	    				
                    	    pushFollow(FOLLOW_50);
                    	    rulesexpr();

                    	    state._fsp--;


                    	    					doneComposite();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);


                    }


                    }
                    break;
                case 11 :
                    // PsiInternalThicket.g:1547:3: this_ident_42= RULE_IDENT
                    {

                    			markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_10ElementType());
                    		
                    this_ident_42=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    			doneLeaf(this_ident_42);
                    		

                    }
                    break;

            }


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
    // $ANTLR end "rulesexpr"


    // $ANTLR start "entryRuleattr"
    // PsiInternalThicket.g:1558:1: entryRuleattr : ruleattr EOF ;
    public final void entryRuleattr() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1558:14: ( ruleattr EOF )
            // PsiInternalThicket.g:1559:2: ruleattr EOF
            {
             markComposite(elementTypeProvider.getAttrElementType()); 
            pushFollow(FOLLOW_1);
            ruleattr();

            state._fsp--;

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
    // PsiInternalThicket.g:1564:1: ruleattr : (this_ident_0= RULE_IDENT kw= '=' rulesexpr ) ;
    public final void ruleattr() throws RecognitionException {
        Token this_ident_0=null;
        Token kw=null;

        try {
            // PsiInternalThicket.g:1564:9: ( (this_ident_0= RULE_IDENT kw= '=' rulesexpr ) )
            // PsiInternalThicket.g:1565:2: (this_ident_0= RULE_IDENT kw= '=' rulesexpr )
            {
            // PsiInternalThicket.g:1565:2: (this_ident_0= RULE_IDENT kw= '=' rulesexpr )
            // PsiInternalThicket.g:1566:3: this_ident_0= RULE_IDENT kw= '=' rulesexpr
            {

            			markLeaf(elementTypeProvider.getAttr_IdentTerminalRuleCall_0ElementType());
            		
            this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_13); 

            			doneLeaf(this_ident_0);
            		

            			markLeaf(elementTypeProvider.getAttr_EqualsSignKeyword_1ElementType());
            		
            kw=(Token)match(input,23,FOLLOW_30); 

            			doneLeaf(kw);
            		

            			markComposite(elementTypeProvider.getAttr_SexprParserRuleCall_2ElementType());
            		
            pushFollow(FOLLOW_2);
            rulesexpr();

            state._fsp--;


            			doneComposite();
            		

            }


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
    // $ANTLR end "ruleattr"


    // $ANTLR start "entryRuleidentOrOp"
    // PsiInternalThicket.g:1591:1: entryRuleidentOrOp : ruleidentOrOp EOF ;
    public final void entryRuleidentOrOp() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1591:19: ( ruleidentOrOp EOF )
            // PsiInternalThicket.g:1592:2: ruleidentOrOp EOF
            {
             markComposite(elementTypeProvider.getIdentOrOpElementType()); 
            pushFollow(FOLLOW_1);
            ruleidentOrOp();

            state._fsp--;

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
    // PsiInternalThicket.g:1597:1: ruleidentOrOp : (this_ident_0= RULE_IDENT | (kw= '(' this_OP_2= RULE_OP kw= ')' ) ) ;
    public final void ruleidentOrOp() throws RecognitionException {
        Token this_ident_0=null;
        Token kw=null;
        Token this_OP_2=null;

        try {
            // PsiInternalThicket.g:1597:14: ( (this_ident_0= RULE_IDENT | (kw= '(' this_OP_2= RULE_OP kw= ')' ) ) )
            // PsiInternalThicket.g:1598:2: (this_ident_0= RULE_IDENT | (kw= '(' this_OP_2= RULE_OP kw= ')' ) )
            {
            // PsiInternalThicket.g:1598:2: (this_ident_0= RULE_IDENT | (kw= '(' this_OP_2= RULE_OP kw= ')' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_IDENT) ) {
                alt53=1;
            }
            else if ( (LA53_0==31) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalThicket.g:1599:3: this_ident_0= RULE_IDENT
                    {

                    			markLeaf(elementTypeProvider.getIdentOrOp_IdentTerminalRuleCall_0ElementType());
                    		
                    this_ident_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    			doneLeaf(this_ident_0);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:1607:3: (kw= '(' this_OP_2= RULE_OP kw= ')' )
                    {
                    // PsiInternalThicket.g:1607:3: (kw= '(' this_OP_2= RULE_OP kw= ')' )
                    // PsiInternalThicket.g:1608:4: kw= '(' this_OP_2= RULE_OP kw= ')'
                    {

                    				markLeaf(elementTypeProvider.getIdentOrOp_LeftParenthesisKeyword_1_0ElementType());
                    			
                    kw=(Token)match(input,31,FOLLOW_51); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getIdentOrOp_OPTerminalRuleCall_1_1ElementType());
                    			
                    this_OP_2=(Token)match(input,RULE_OP,FOLLOW_26); 

                    				doneLeaf(this_OP_2);
                    			

                    				markLeaf(elementTypeProvider.getIdentOrOp_RightParenthesisKeyword_1_2ElementType());
                    			
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleidentOrOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000054054E0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000054054C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000005405400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080100010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000A0000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000088100010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000880100010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00028880820001F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000210000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000A0100010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002088100010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00028880820001F2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00028881820001F0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000288808A0001F0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000050000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00028A80820001F0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002E880820001F0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00038880820001F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00068880820001F0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});

}