package org.thicket.lang.xtext.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalThicketLexer extends Lexer {
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

    public PsiInternalThicketLexer() {;} 
    public PsiInternalThicketLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PsiInternalThicketLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "PsiInternalThicket.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:11:7: ( 'module' )
            // PsiInternalThicket.g:11:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:12:7: ( '.' )
            // PsiInternalThicket.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:13:7: ( 'from' )
            // PsiInternalThicket.g:13:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:14:7: ( 'import' )
            // PsiInternalThicket.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:15:7: ( '*' )
            // PsiInternalThicket.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:16:7: ( ',' )
            // PsiInternalThicket.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:17:7: ( 'typedef' )
            // PsiInternalThicket.g:17:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:18:7: ( '=' )
            // PsiInternalThicket.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:19:7: ( 'type' )
            // PsiInternalThicket.g:19:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:20:7: ( '{' )
            // PsiInternalThicket.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:21:7: ( 'model' )
            // PsiInternalThicket.g:21:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:22:7: ( '}' )
            // PsiInternalThicket.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:23:7: ( ':' )
            // PsiInternalThicket.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:24:7: ( '[' )
            // PsiInternalThicket.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:25:7: ( ']' )
            // PsiInternalThicket.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:26:7: ( '(' )
            // PsiInternalThicket.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:27:7: ( ')' )
            // PsiInternalThicket.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:28:7: ( '->' )
            // PsiInternalThicket.g:28:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:29:7: ( 'def' )
            // PsiInternalThicket.g:29:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:30:7: ( 'adapter' )
            // PsiInternalThicket.g:30:9: 'adapter'
            {
            match("adapter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:31:7: ( 'class' )
            // PsiInternalThicket.g:31:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:32:7: ( '+' )
            // PsiInternalThicket.g:32:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:33:7: ( 'trait' )
            // PsiInternalThicket.g:33:9: 'trait'
            {
            match("trait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:34:7: ( '<' )
            // PsiInternalThicket.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:35:7: ( '>' )
            // PsiInternalThicket.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:36:7: ( '</' )
            // PsiInternalThicket.g:36:9: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:37:7: ( '/>' )
            // PsiInternalThicket.g:37:9: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:38:7: ( 'for' )
            // PsiInternalThicket.g:38:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:39:7: ( '<-' )
            // PsiInternalThicket.g:39:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:40:7: ( 'if' )
            // PsiInternalThicket.g:40:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:41:7: ( 'yield' )
            // PsiInternalThicket.g:41:9: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:42:7: ( 'let' )
            // PsiInternalThicket.g:42:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:43:7: ( 'in' )
            // PsiInternalThicket.g:43:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:44:7: ( 'new' )
            // PsiInternalThicket.g:44:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:45:7: ( 'with' )
            // PsiInternalThicket.g:45:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1633:12: ( RULE_ID )
            // PsiInternalThicket.g:1633:14: RULE_ID
            {
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_DOLL"
    public final void mRULE_DOLL() throws RecognitionException {
        try {
            int _type = RULE_DOLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1635:11: ( '$' )
            // PsiInternalThicket.g:1635:13: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLL"

    // $ANTLR start "RULE_OP"
    public final void mRULE_OP() throws RecognitionException {
        try {
            int _type = RULE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1637:9: ( ( RULE_SOP ( RULE_SOP | RULE_EOP )* | RULE_EOP ( RULE_SOP | RULE_EOP )+ ) )
            // PsiInternalThicket.g:1637:11: ( RULE_SOP ( RULE_SOP | RULE_EOP )* | RULE_EOP ( RULE_SOP | RULE_EOP )+ )
            {
            // PsiInternalThicket.g:1637:11: ( RULE_SOP ( RULE_SOP | RULE_EOP )* | RULE_EOP ( RULE_SOP | RULE_EOP )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!'||LA3_0=='#'||(LA3_0>='%' && LA3_0<='&')||(LA3_0>='*' && LA3_0<='+')||LA3_0=='-'||LA3_0=='/'||LA3_0==';'||(LA3_0>='=' && LA3_0<='@')||LA3_0=='['||LA3_0=='^'||LA3_0=='|'||LA3_0=='~') ) {
                alt3=1;
            }
            else if ( (LA3_0=='$'||LA3_0=='.'||LA3_0==':'||LA3_0=='<') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalThicket.g:1637:12: RULE_SOP ( RULE_SOP | RULE_EOP )*
                    {
                    mRULE_SOP(); 
                    // PsiInternalThicket.g:1637:21: ( RULE_SOP | RULE_EOP )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='-' && LA1_0<='/')||(LA1_0>=':' && LA1_0<='@')||LA1_0=='['||LA1_0=='^'||LA1_0=='|'||LA1_0=='~') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // PsiInternalThicket.g:
                    	    {
                    	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||input.LA(1)=='['||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:1637:42: RULE_EOP ( RULE_SOP | RULE_EOP )+
                    {
                    mRULE_EOP(); 
                    // PsiInternalThicket.g:1637:51: ( RULE_SOP | RULE_EOP )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='!'||(LA2_0>='#' && LA2_0<='&')||(LA2_0>='*' && LA2_0<='+')||(LA2_0>='-' && LA2_0<='/')||(LA2_0>=':' && LA2_0<='@')||LA2_0=='['||LA2_0=='^'||LA2_0=='|'||LA2_0=='~') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // PsiInternalThicket.g:
                    	    {
                    	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||input.LA(1)=='['||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP"

    // $ANTLR start "RULE_SOP"
    public final void mRULE_SOP() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1639:19: ( ( '~' | '#' | '?' | ';' | '@' | '&' | '!' | '%' | '>' | '=' | '+' | '*' | '/' | '|' | '^' | '-' | '[' ) )
            // PsiInternalThicket.g:1639:21: ( '~' | '#' | '?' | ';' | '@' | '&' | '!' | '%' | '>' | '=' | '+' | '*' | '/' | '|' | '^' | '-' | '[' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||input.LA(1)==';'||(input.LA(1)>='=' && input.LA(1)<='@')||input.LA(1)=='['||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SOP"

    // $ANTLR start "RULE_EOP"
    public final void mRULE_EOP() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1641:19: ( ( '$' | '<' | '.' | ':' ) )
            // PsiInternalThicket.g:1641:21: ( '$' | '<' | '.' | ':' )
            {
            if ( input.LA(1)=='$'||input.LA(1)=='.'||input.LA(1)==':'||input.LA(1)=='<' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // PsiInternalThicket.g:1643:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // PsiInternalThicket.g:1643:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // PsiInternalThicket.g:1643:20: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalThicket.g:1643:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // PsiInternalThicket.g:1643:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalThicket.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1645:10: ( ( '0' .. '9' )+ )
            // PsiInternalThicket.g:1645:12: ( '0' .. '9' )+
            {
            // PsiInternalThicket.g:1645:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalThicket.g:1645:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1647:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // PsiInternalThicket.g:1647:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // PsiInternalThicket.g:1647:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalThicket.g:1647:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // PsiInternalThicket.g:1647:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1647:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // PsiInternalThicket.g:1647:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // PsiInternalThicket.g:1647:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // PsiInternalThicket.g:1647:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // PsiInternalThicket.g:1647:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // PsiInternalThicket.g:1647:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1649:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // PsiInternalThicket.g:1649:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // PsiInternalThicket.g:1649:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalThicket.g:1649:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1651:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // PsiInternalThicket.g:1651:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // PsiInternalThicket.g:1651:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // PsiInternalThicket.g:1651:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // PsiInternalThicket.g:1651:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalThicket.g:1651:41: ( '\\r' )? '\\n'
                    {
                    // PsiInternalThicket.g:1651:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // PsiInternalThicket.g:1651:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1653:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // PsiInternalThicket.g:1653:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // PsiInternalThicket.g:1653:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalThicket.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PsiInternalThicket.g:1655:16: ( . )
            // PsiInternalThicket.g:1655:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // PsiInternalThicket.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_IDENT | RULE_DOLL | RULE_OP | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=44;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // PsiInternalThicket.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // PsiInternalThicket.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // PsiInternalThicket.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // PsiInternalThicket.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // PsiInternalThicket.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // PsiInternalThicket.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // PsiInternalThicket.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // PsiInternalThicket.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // PsiInternalThicket.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // PsiInternalThicket.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // PsiInternalThicket.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // PsiInternalThicket.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // PsiInternalThicket.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // PsiInternalThicket.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // PsiInternalThicket.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // PsiInternalThicket.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // PsiInternalThicket.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // PsiInternalThicket.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // PsiInternalThicket.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // PsiInternalThicket.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // PsiInternalThicket.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // PsiInternalThicket.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // PsiInternalThicket.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // PsiInternalThicket.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // PsiInternalThicket.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // PsiInternalThicket.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // PsiInternalThicket.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // PsiInternalThicket.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // PsiInternalThicket.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // PsiInternalThicket.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // PsiInternalThicket.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // PsiInternalThicket.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // PsiInternalThicket.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // PsiInternalThicket.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // PsiInternalThicket.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // PsiInternalThicket.g:1:220: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 37 :
                // PsiInternalThicket.g:1:231: RULE_DOLL
                {
                mRULE_DOLL(); 

                }
                break;
            case 38 :
                // PsiInternalThicket.g:1:241: RULE_OP
                {
                mRULE_OP(); 

                }
                break;
            case 39 :
                // PsiInternalThicket.g:1:249: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // PsiInternalThicket.g:1:258: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // PsiInternalThicket.g:1:270: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // PsiInternalThicket.g:1:286: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // PsiInternalThicket.g:1:302: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // PsiInternalThicket.g:1:310: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\46\1\47\2\46\1\56\1\uffff\1\46\1\62\2\uffff\1\65\1\66\3\uffff\1\50\3\46\1\76\1\101\1\102\1\50\4\46\1\50\1\uffff\1\112\2\uffff\2\44\2\uffff\1\46\3\uffff\3\46\1\122\1\123\2\uffff\2\46\10\uffff\1\126\3\46\1\uffff\1\132\1\133\2\uffff\1\134\2\50\4\46\4\uffff\2\46\1\151\1\46\2\uffff\2\46\1\uffff\1\155\2\46\3\uffff\2\50\1\uffff\1\50\1\uffff\1\46\1\162\1\163\3\46\1\167\1\uffff\1\46\1\172\1\46\1\uffff\2\46\1\50\1\46\2\uffff\1\177\1\46\1\u0081\1\uffff\2\46\1\uffff\1\u0084\1\46\1\u0086\1\u0087\1\uffff\1\u0088\1\uffff\1\u0089\1\46\1\uffff\1\46\4\uffff\1\u008c\1\u008d\2\uffff";
    static final String DFA15_eofS =
        "\u008e\uffff";
    static final String DFA15_minS =
        "\1\0\1\157\1\41\1\157\1\146\1\41\1\uffff\1\162\1\41\2\uffff\2\41\3\uffff\1\76\1\145\1\144\1\154\3\41\1\52\1\151\2\145\1\151\1\101\1\uffff\1\41\2\uffff\2\0\2\uffff\1\144\3\uffff\1\157\1\162\1\160\2\60\2\uffff\1\160\1\141\10\uffff\1\41\1\146\2\141\1\uffff\2\41\2\uffff\1\41\2\0\1\145\1\164\1\167\1\164\4\uffff\1\145\1\155\1\60\1\157\2\uffff\1\145\1\151\1\uffff\1\60\1\160\1\163\3\uffff\2\0\1\uffff\1\0\1\uffff\1\154\2\60\1\150\2\154\1\60\1\uffff\1\162\1\60\1\164\1\uffff\1\164\1\163\1\0\1\144\2\uffff\1\60\1\145\1\60\1\uffff\1\164\1\145\1\uffff\1\60\1\145\2\60\1\uffff\1\60\1\uffff\1\60\1\146\1\uffff\1\162\4\uffff\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\157\1\176\1\162\1\156\1\176\1\uffff\1\171\1\176\2\uffff\2\176\3\uffff\1\76\1\145\1\144\1\154\3\176\1\76\1\151\2\145\1\151\1\172\1\uffff\1\176\2\uffff\2\uffff\2\uffff\1\144\3\uffff\1\157\1\162\1\160\2\172\2\uffff\1\160\1\141\10\uffff\1\176\1\146\2\141\1\uffff\2\176\2\uffff\1\176\2\uffff\1\145\1\164\1\167\1\164\4\uffff\1\165\1\155\1\172\1\157\2\uffff\1\145\1\151\1\uffff\1\172\1\160\1\163\3\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\154\2\172\1\150\2\154\1\172\1\uffff\1\162\1\172\1\164\1\uffff\1\164\1\163\1\uffff\1\144\2\uffff\1\172\1\145\1\172\1\uffff\1\164\1\145\1\uffff\1\172\1\145\2\172\1\uffff\1\172\1\uffff\1\172\1\146\1\uffff\1\162\4\uffff\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\6\2\uffff\1\12\1\14\2\uffff\1\17\1\20\1\21\15\uffff\1\44\1\uffff\1\46\1\47\2\uffff\1\53\1\54\1\uffff\1\44\1\2\1\46\5\uffff\1\5\1\6\2\uffff\1\10\1\12\1\14\1\15\1\16\1\17\1\20\1\21\4\uffff\1\26\2\uffff\1\30\1\31\7\uffff\1\45\1\47\1\50\1\53\4\uffff\1\36\1\41\2\uffff\1\22\3\uffff\1\32\1\35\1\33\2\uffff\1\51\1\uffff\1\52\7\uffff\1\34\3\uffff\1\23\4\uffff\1\40\1\42\3\uffff\1\3\2\uffff\1\11\4\uffff\1\43\1\uffff\1\13\2\uffff\1\27\1\uffff\1\25\1\37\1\1\1\4\2\uffff\1\7\1\24";
    static final String DFA15_specialS =
        "\1\7\40\uffff\1\5\1\1\41\uffff\1\10\1\3\27\uffff\1\2\1\6\1\uffff\1\0\17\uffff\1\4\35\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\37\1\41\1\37\1\36\2\37\1\42\1\16\1\17\1\5\1\24\1\6\1\20\1\2\1\27\12\40\1\13\1\37\1\25\1\10\1\26\2\37\32\35\1\14\1\44\1\15\1\34\1\35\1\44\1\22\1\35\1\23\1\21\1\35\1\3\2\35\1\4\2\35\1\31\1\1\1\32\5\35\1\7\2\35\1\33\1\35\1\30\1\35\1\11\1\37\1\12\1\37\uff81\44",
            "\1\45",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\52\2\uffff\1\51",
            "\1\54\6\uffff\1\53\1\55",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "",
            "\1\61\6\uffff\1\60",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "",
            "",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\1\100\1\50\1\77\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\104\4\uffff\1\105\16\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "",
            "",
            "\0\114",
            "\0\114",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "",
            "",
            "\1\50\1\uffff\4\50\3\uffff\2\50\1\uffff\3\50\12\uffff\7\50\32\uffff\1\50\2\uffff\1\50\35\uffff\1\50\1\uffff\1\50",
            "\41\137\1\136\1\137\4\136\3\137\1\135\1\136\1\137\3\136\12\137\7\136\32\137\1\136\2\137\1\136\35\137\1\136\1\137\1\136\uff81\137",
            "\41\141\1\140\1\141\4\140\3\141\2\140\1\141\3\140\12\141\7\140\32\141\1\140\2\141\1\140\35\141\1\140\1\141\1\140\uff81\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "",
            "\1\147\17\uffff\1\146",
            "\1\150",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\152",
            "",
            "",
            "\1\153",
            "\1\154",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "\41\137\1\136\1\137\4\136\3\137\1\135\1\136\1\137\2\136\1\160\12\137\7\136\32\137\1\136\2\137\1\136\35\137\1\136\1\137\1\136\uff81\137",
            "\41\137\1\136\1\137\4\136\3\137\1\135\1\136\1\137\3\136\12\137\7\136\32\137\1\136\2\137\1\136\35\137\1\136\1\137\1\136\uff81\137",
            "",
            "\41\141\1\140\1\141\4\140\3\141\2\140\1\141\3\140\12\141\7\140\32\141\1\140\2\141\1\140\35\141\1\140\1\141\1\140\uff81\141",
            "",
            "\1\161",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\170",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\171\26\46",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\41\137\1\136\1\137\4\136\3\137\1\135\1\136\1\137\3\136\12\137\7\136\32\137\1\136\2\137\1\136\35\137\1\136\1\137\1\136\uff81\137",
            "\1\176",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0080",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0085",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_IDENT | RULE_DOLL | RULE_OP | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_96 = input.LA(1);

                        s = -1;
                        if ( ((LA15_96>='\u0000' && LA15_96<=' ')||LA15_96=='\"'||(LA15_96>='\'' && LA15_96<=')')||LA15_96==','||(LA15_96>='0' && LA15_96<='9')||(LA15_96>='A' && LA15_96<='Z')||(LA15_96>='\\' && LA15_96<=']')||(LA15_96>='_' && LA15_96<='{')||LA15_96=='}'||(LA15_96>='\u007F' && LA15_96<='\uFFFF')) ) {s = 97;}

                        else if ( (LA15_96=='!'||(LA15_96>='#' && LA15_96<='&')||(LA15_96>='*' && LA15_96<='+')||(LA15_96>='-' && LA15_96<='/')||(LA15_96>=':' && LA15_96<='@')||LA15_96=='['||LA15_96=='^'||LA15_96=='|'||LA15_96=='~') ) {s = 96;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( ((LA15_34>='\u0000' && LA15_34<='\uFFFF')) ) {s = 76;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_93 = input.LA(1);

                        s = -1;
                        if ( (LA15_93=='/') ) {s = 112;}

                        else if ( (LA15_93=='*') ) {s = 93;}

                        else if ( (LA15_93=='!'||(LA15_93>='#' && LA15_93<='&')||LA15_93=='+'||(LA15_93>='-' && LA15_93<='.')||(LA15_93>=':' && LA15_93<='@')||LA15_93=='['||LA15_93=='^'||LA15_93=='|'||LA15_93=='~') ) {s = 94;}

                        else if ( ((LA15_93>='\u0000' && LA15_93<=' ')||LA15_93=='\"'||(LA15_93>='\'' && LA15_93<=')')||LA15_93==','||(LA15_93>='0' && LA15_93<='9')||(LA15_93>='A' && LA15_93<='Z')||(LA15_93>='\\' && LA15_93<=']')||(LA15_93>='_' && LA15_93<='{')||LA15_93=='}'||(LA15_93>='\u007F' && LA15_93<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_69 = input.LA(1);

                        s = -1;
                        if ( (LA15_69=='!'||(LA15_69>='#' && LA15_69<='&')||(LA15_69>='*' && LA15_69<='+')||(LA15_69>='-' && LA15_69<='/')||(LA15_69>=':' && LA15_69<='@')||LA15_69=='['||LA15_69=='^'||LA15_69=='|'||LA15_69=='~') ) {s = 96;}

                        else if ( ((LA15_69>='\u0000' && LA15_69<=' ')||LA15_69=='\"'||(LA15_69>='\'' && LA15_69<=')')||LA15_69==','||(LA15_69>='0' && LA15_69<='9')||(LA15_69>='A' && LA15_69<='Z')||(LA15_69>='\\' && LA15_69<=']')||(LA15_69>='_' && LA15_69<='{')||LA15_69=='}'||(LA15_69>='\u007F' && LA15_69<='\uFFFF')) ) {s = 97;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_112 = input.LA(1);

                        s = -1;
                        if ( (LA15_112=='*') ) {s = 93;}

                        else if ( (LA15_112=='!'||(LA15_112>='#' && LA15_112<='&')||LA15_112=='+'||(LA15_112>='-' && LA15_112<='/')||(LA15_112>=':' && LA15_112<='@')||LA15_112=='['||LA15_112=='^'||LA15_112=='|'||LA15_112=='~') ) {s = 94;}

                        else if ( ((LA15_112>='\u0000' && LA15_112<=' ')||LA15_112=='\"'||(LA15_112>='\'' && LA15_112<=')')||LA15_112==','||(LA15_112>='0' && LA15_112<='9')||(LA15_112>='A' && LA15_112<='Z')||(LA15_112>='\\' && LA15_112<=']')||(LA15_112>='_' && LA15_112<='{')||LA15_112=='}'||(LA15_112>='\u007F' && LA15_112<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) ) {s = 76;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_94 = input.LA(1);

                        s = -1;
                        if ( (LA15_94=='*') ) {s = 93;}

                        else if ( (LA15_94=='!'||(LA15_94>='#' && LA15_94<='&')||LA15_94=='+'||(LA15_94>='-' && LA15_94<='/')||(LA15_94>=':' && LA15_94<='@')||LA15_94=='['||LA15_94=='^'||LA15_94=='|'||LA15_94=='~') ) {s = 94;}

                        else if ( ((LA15_94>='\u0000' && LA15_94<=' ')||LA15_94=='\"'||(LA15_94>='\'' && LA15_94<=')')||LA15_94==','||(LA15_94>='0' && LA15_94<='9')||(LA15_94>='A' && LA15_94<='Z')||(LA15_94>='\\' && LA15_94<=']')||(LA15_94>='_' && LA15_94<='{')||LA15_94=='}'||(LA15_94>='\u007F' && LA15_94<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='m') ) {s = 1;}

                        else if ( (LA15_0=='.') ) {s = 2;}

                        else if ( (LA15_0=='f') ) {s = 3;}

                        else if ( (LA15_0=='i') ) {s = 4;}

                        else if ( (LA15_0=='*') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0=='t') ) {s = 7;}

                        else if ( (LA15_0=='=') ) {s = 8;}

                        else if ( (LA15_0=='{') ) {s = 9;}

                        else if ( (LA15_0=='}') ) {s = 10;}

                        else if ( (LA15_0==':') ) {s = 11;}

                        else if ( (LA15_0=='[') ) {s = 12;}

                        else if ( (LA15_0==']') ) {s = 13;}

                        else if ( (LA15_0=='(') ) {s = 14;}

                        else if ( (LA15_0==')') ) {s = 15;}

                        else if ( (LA15_0=='-') ) {s = 16;}

                        else if ( (LA15_0=='d') ) {s = 17;}

                        else if ( (LA15_0=='a') ) {s = 18;}

                        else if ( (LA15_0=='c') ) {s = 19;}

                        else if ( (LA15_0=='+') ) {s = 20;}

                        else if ( (LA15_0=='<') ) {s = 21;}

                        else if ( (LA15_0=='>') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( (LA15_0=='y') ) {s = 24;}

                        else if ( (LA15_0=='l') ) {s = 25;}

                        else if ( (LA15_0=='n') ) {s = 26;}

                        else if ( (LA15_0=='w') ) {s = 27;}

                        else if ( (LA15_0=='^') ) {s = 28;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='e'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='o' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='v')||LA15_0=='x'||LA15_0=='z') ) {s = 29;}

                        else if ( (LA15_0=='$') ) {s = 30;}

                        else if ( (LA15_0=='!'||LA15_0=='#'||(LA15_0>='%' && LA15_0<='&')||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||LA15_0=='|'||LA15_0=='~') ) {s = 31;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 32;}

                        else if ( (LA15_0=='\"') ) {s = 33;}

                        else if ( (LA15_0=='\'') ) {s = 34;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 35;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_68 = input.LA(1);

                        s = -1;
                        if ( (LA15_68=='*') ) {s = 93;}

                        else if ( (LA15_68=='!'||(LA15_68>='#' && LA15_68<='&')||LA15_68=='+'||(LA15_68>='-' && LA15_68<='/')||(LA15_68>=':' && LA15_68<='@')||LA15_68=='['||LA15_68=='^'||LA15_68=='|'||LA15_68=='~') ) {s = 94;}

                        else if ( ((LA15_68>='\u0000' && LA15_68<=' ')||LA15_68=='\"'||(LA15_68>='\'' && LA15_68<=')')||LA15_68==','||(LA15_68>='0' && LA15_68<='9')||(LA15_68>='A' && LA15_68<='Z')||(LA15_68>='\\' && LA15_68<=']')||(LA15_68>='_' && LA15_68<='{')||LA15_68=='}'||(LA15_68>='\u007F' && LA15_68<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}