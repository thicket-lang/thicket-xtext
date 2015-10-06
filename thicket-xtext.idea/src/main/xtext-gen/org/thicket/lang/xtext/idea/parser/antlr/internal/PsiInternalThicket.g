/*
 * generated by Xtext 2.9.0.beta5
 */
grammar PsiInternalThicket;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.thicket.lang.xtext.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.thicket.lang.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.thicket.lang.xtext.idea.lang.ThicketElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.thicket.lang.xtext.services.ThicketGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

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

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	EOF;

// Rule Model
ruleModel:
	(
		{
			markLeaf(elementTypeProvider.getModel_ModuleKeyword_0ElementType());
		}
		otherlv_0='module'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getModel_NameIdentTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_IDENT
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getModel_FullStopKeyword_2_0ElementType());
			}
			otherlv_2='.'
			{
				doneLeaf(otherlv_2);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getModel_NamesIdentTerminalRuleCall_2_1_0ElementType());
					}
					lv_names_3_0=RULE_IDENT
					{
						doneLeaf(lv_names_3_0);
					}
				)
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getModel_ImportsImportsParserRuleCall_3_0ElementType());
				}
				lv_imports_4_0=ruleimports
				{
					doneComposite();
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getModel_EntitiesEntityParserRuleCall_4_0ElementType());
				}
				lv_entities_5_0=ruleentity
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleimports
entryRuleimports:
	{ markComposite(elementTypeProvider.getImportsElementType()); }
	ruleimports
	EOF;

// Rule imports
ruleimports:
	(
		(
			{
				markLeaf(elementTypeProvider.getImports_FromKeyword_0_0ElementType());
			}
			kw='from'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_0_1ElementType());
			}
			this_ident_1=RULE_IDENT
			{
				doneLeaf(this_ident_1);
			}
			(
				{
					markLeaf(elementTypeProvider.getImports_FullStopKeyword_0_2_0ElementType());
				}
				kw='.'
				{
					doneLeaf(kw);
				}
				{
					markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_0_2_1ElementType());
				}
				this_ident_3=RULE_IDENT
				{
					doneLeaf(this_ident_3);
				}
			)*
			{
				markLeaf(elementTypeProvider.getImports_ImportKeyword_0_3ElementType());
			}
			kw='import'
			{
				doneLeaf(kw);
			}
			(
				{
					markLeaf(elementTypeProvider.getImports_AsteriskKeyword_0_4_0ElementType());
				}
				kw='*'
				{
					doneLeaf(kw);
				}
				    |
				(
					{
						markComposite(elementTypeProvider.getImports_IdentOrOpParserRuleCall_0_4_1_0ElementType());
					}
					ruleidentOrOp
					{
						doneComposite();
					}
					(
						{
							markLeaf(elementTypeProvider.getImports_CommaKeyword_0_4_1_1_0ElementType());
						}
						kw=','
						{
							doneLeaf(kw);
						}
						{
							markComposite(elementTypeProvider.getImports_IdentOrOpParserRuleCall_0_4_1_1_1ElementType());
						}
						ruleidentOrOp
						{
							doneComposite();
						}
					)+
				)
			)
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getImports_ImportKeyword_1_0ElementType());
			}
			kw='import'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_1_1ElementType());
			}
			this_ident_10=RULE_IDENT
			{
				doneLeaf(this_ident_10);
			}
			(
				{
					markLeaf(elementTypeProvider.getImports_FullStopKeyword_1_2_0ElementType());
				}
				kw='.'
				{
					doneLeaf(kw);
				}
				{
					markLeaf(elementTypeProvider.getImports_IdentTerminalRuleCall_1_2_1ElementType());
				}
				this_ident_12=RULE_IDENT
				{
					doneLeaf(this_ident_12);
				}
			)*
		)
	)
;

//Entry rule entryRuleentity
entryRuleentity:
	{ markComposite(elementTypeProvider.getEntityElementType()); }
	ruleentity
	EOF;

// Rule entity
ruleentity:
	(
		{
			markComposite(elementTypeProvider.getEntity_TypeDefParserRuleCall_0ElementType());
		}
		ruletypeDef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntity_SortDefParserRuleCall_1ElementType());
		}
		rulesortDef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntity_ObjectDefParserRuleCall_2ElementType());
		}
		ruleobjectDef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntity_ExpressionDefParserRuleCall_3ElementType());
		}
		ruleexpressionDef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntity_ClassDefParserRuleCall_4ElementType());
		}
		ruleclassDef
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntity_TraitDefParserRuleCall_5ElementType());
		}
		ruletraitDef
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuletypeDef
entryRuletypeDef:
	{ markComposite(elementTypeProvider.getTypeDefElementType()); }
	ruletypeDef
	EOF;

// Rule typeDef
ruletypeDef:
	(
		{
			markLeaf(elementTypeProvider.getTypeDef_TypedefKeyword_0ElementType());
		}
		kw='typedef'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getTypeDef_IdentTerminalRuleCall_1ElementType());
		}
		this_ident_1=RULE_IDENT
		{
			doneLeaf(this_ident_1);
		}
		{
			markComposite(elementTypeProvider.getTypeDef_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getTypeDef_EqualsSignKeyword_3ElementType());
		}
		kw='='
		{
			doneLeaf(kw);
		}
		{
			markComposite(elementTypeProvider.getTypeDef_GenericsParserRuleCall_4ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markComposite(elementTypeProvider.getTypeDef_TypesParserRuleCall_5ElementType());
		}
		ruletypes
		{
			doneComposite();
		}
	)
;

//Entry rule entryRulesortDef
entryRulesortDef:
	{ markComposite(elementTypeProvider.getSortDefElementType()); }
	rulesortDef
	EOF;

// Rule sortDef
rulesortDef:
	(
		{
			markLeaf(elementTypeProvider.getSortDef_TypeKeyword_0ElementType());
		}
		kw='type'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getSortDef_IdentTerminalRuleCall_1ElementType());
		}
		this_ident_1=RULE_IDENT
		{
			doneLeaf(this_ident_1);
		}
		{
			markComposite(elementTypeProvider.getSortDef_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getSortDef_LeftCurlyBracketKeyword_3ElementType());
		}
		kw='{'
		{
			doneLeaf(kw);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getSortDef_ModelKeyword_4_0ElementType());
				}
				kw='model'
				{
					doneLeaf(kw);
				}
			)?
			{
				markLeaf(elementTypeProvider.getSortDef_IdentTerminalRuleCall_4_1ElementType());
			}
			this_ident_5=RULE_IDENT
			{
				doneLeaf(this_ident_5);
			}
			(
				{
					markLeaf(elementTypeProvider.getSortDef_LeftCurlyBracketKeyword_4_2_0ElementType());
				}
				kw='{'
				{
					doneLeaf(kw);
				}
				(
					{
						markComposite(elementTypeProvider.getSortDef_TparamParserRuleCall_4_2_1ElementType());
					}
					ruletparam
					{
						doneComposite();
					}
				)*
				{
					markLeaf(elementTypeProvider.getSortDef_RightCurlyBracketKeyword_4_2_2ElementType());
				}
				kw='}'
				{
					doneLeaf(kw);
				}
			)?
		)+
		{
			markLeaf(elementTypeProvider.getSortDef_RightCurlyBracketKeyword_5ElementType());
		}
		kw='}'
		{
			doneLeaf(kw);
		}
	)
;

//Entry rule entryRuleobjectDef
entryRuleobjectDef:
	{ markComposite(elementTypeProvider.getObjectDefElementType()); }
	ruleobjectDef
	EOF;

// Rule objectDef
ruleobjectDef:
	(
		{
			markLeaf(elementTypeProvider.getObjectDef_ModelKeyword_0ElementType());
		}
		kw='model'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getObjectDef_IdentTerminalRuleCall_1ElementType());
		}
		this_ident_1=RULE_IDENT
		{
			doneLeaf(this_ident_1);
		}
		{
			markComposite(elementTypeProvider.getObjectDef_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getObjectDef_LeftCurlyBracketKeyword_3_0ElementType());
			}
			kw='{'
			{
				doneLeaf(kw);
			}
			(
				{
					markComposite(elementTypeProvider.getObjectDef_TparamParserRuleCall_3_1ElementType());
				}
				ruletparam
				{
					doneComposite();
				}
			)*
			{
				markLeaf(elementTypeProvider.getObjectDef_RightCurlyBracketKeyword_3_2ElementType());
			}
			kw='}'
			{
				doneLeaf(kw);
			}
		)?
	)
;

//Entry rule entryRuletparam
entryRuletparam:
	{ markComposite(elementTypeProvider.getTparamElementType()); }
	ruletparam
	EOF;

// Rule tparam
ruletparam:
	(
		{
			markComposite(elementTypeProvider.getTparam_IdentOrOpParserRuleCall_0ElementType());
		}
		ruleidentOrOp
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getTparam_ColonKeyword_1ElementType());
		}
		kw=':'
		{
			doneLeaf(kw);
		}
		{
			markComposite(elementTypeProvider.getTparam_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markComposite(elementTypeProvider.getTparam_TypesParserRuleCall_3ElementType());
		}
		ruletypes
		{
			doneComposite();
		}
	)
;

//Entry rule entryRulegenerics
entryRulegenerics:
	{ markComposite(elementTypeProvider.getGenericsElementType()); }
	rulegenerics
	EOF;

// Rule generics
rulegenerics:
	(
		{
			markLeaf(elementTypeProvider.getGenerics_LeftSquareBracketKeyword_0ElementType());
		}
		kw='['
		{
			doneLeaf(kw);
		}
		(
			{
				markLeaf(elementTypeProvider.getGenerics_IdentTerminalRuleCall_1ElementType());
			}
			this_ident_1=RULE_IDENT
			{
				doneLeaf(this_ident_1);
			}
		)+
		{
			markLeaf(elementTypeProvider.getGenerics_RightSquareBracketKeyword_2ElementType());
		}
		kw=']'
		{
			doneLeaf(kw);
		}
	)?
;

//Entry rule entryRuletype
entryRuletype:
	{ markComposite(elementTypeProvider.getTypeElementType()); }
	ruletype
	EOF;

// Rule type
ruletype:
	(
		(
			{
				markLeaf(elementTypeProvider.getType_IdentTerminalRuleCall_0_0ElementType());
			}
			this_ident_0=RULE_IDENT
			{
				doneLeaf(this_ident_0);
			}
			(
				{
					markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_0_1_0ElementType());
				}
				kw='['
				{
					doneLeaf(kw);
				}
				(
					{
						markComposite(elementTypeProvider.getType_TypesParserRuleCall_0_1_1ElementType());
					}
					ruletypes
					{
						doneComposite();
					}
				)+
				{
					markLeaf(elementTypeProvider.getType_RightSquareBracketKeyword_0_1_2ElementType());
				}
				kw=']'
				{
					doneLeaf(kw);
				}
			)?
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_1_0ElementType());
			}
			kw='('
			{
				doneLeaf(kw);
			}
			{
				markComposite(elementTypeProvider.getType_TypesParserRuleCall_1_1ElementType());
			}
			ruletypes
			{
				doneComposite();
			}
			{
				markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_1_2ElementType());
			}
			kw=')'
			{
				doneLeaf(kw);
			}
		)
	)
;

//Entry rule entryRuletypes
entryRuletypes:
	{ markComposite(elementTypeProvider.getTypesElementType()); }
	ruletypes
	EOF;

// Rule types
ruletypes:
	(
		{
			markComposite(elementTypeProvider.getTypes_TypeParserRuleCall_0ElementType());
		}
		ruletype
		{
			doneComposite();
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getTypes_CommaKeyword_1_0_0ElementType());
				}
				kw=','
				{
					doneLeaf(kw);
				}
				    |
				{
					markLeaf(elementTypeProvider.getTypes_HyphenMinusGreaterThanSignKeyword_1_0_1ElementType());
				}
				kw='->'
				{
					doneLeaf(kw);
				}
			)
			{
				markComposite(elementTypeProvider.getTypes_TypesParserRuleCall_1_1ElementType());
			}
			ruletypes
			{
				doneComposite();
			}
		)?
	)
;

//Entry rule entryRuleexpressionDef
entryRuleexpressionDef:
	{ markComposite(elementTypeProvider.getExpressionDefElementType()); }
	ruleexpressionDef
	EOF;

// Rule expressionDef
ruleexpressionDef:
	(
		{
			markLeaf(elementTypeProvider.getExpressionDef_DefKeyword_0ElementType());
		}
		kw='def'
		{
			doneLeaf(kw);
		}
		(
			{
				markLeaf(elementTypeProvider.getExpressionDef_AdapterKeyword_1ElementType());
			}
			kw='adapter'
			{
				doneLeaf(kw);
			}
		)?
		{
			markComposite(elementTypeProvider.getExpressionDef_IdentOrOpParserRuleCall_2ElementType());
		}
		ruleidentOrOp
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getExpressionDef_ColonKeyword_3_0ElementType());
			}
			kw=':'
			{
				doneLeaf(kw);
			}
			{
				markComposite(elementTypeProvider.getExpressionDef_GenericsParserRuleCall_3_1ElementType());
			}
			rulegenerics
			{
				doneComposite();
			}
			{
				markComposite(elementTypeProvider.getExpressionDef_TypesParserRuleCall_3_2ElementType());
			}
			ruletypes
			{
				doneComposite();
			}
		)?
		{
			markLeaf(elementTypeProvider.getExpressionDef_EqualsSignKeyword_4ElementType());
		}
		kw='='
		{
			doneLeaf(kw);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getExpressionDef_IdentTerminalRuleCall_5_0_0ElementType());
				}
				this_ident_7=RULE_IDENT
				{
					doneLeaf(this_ident_7);
				}
				(
					{
						markLeaf(elementTypeProvider.getExpressionDef_ColonKeyword_5_0_1_0ElementType());
					}
					kw=':'
					{
						doneLeaf(kw);
					}
					{
						markComposite(elementTypeProvider.getExpressionDef_GenericsParserRuleCall_5_0_1_1ElementType());
					}
					rulegenerics
					{
						doneComposite();
					}
					{
						markComposite(elementTypeProvider.getExpressionDef_TypeParserRuleCall_5_0_1_2ElementType());
					}
					ruletype
					{
						doneComposite();
					}
				)?
			)+
			{
				markLeaf(elementTypeProvider.getExpressionDef_HyphenMinusGreaterThanSignKeyword_5_1ElementType());
			}
			kw='->'
			{
				doneLeaf(kw);
			}
		)?
		{
			markComposite(elementTypeProvider.getExpressionDef_SexprParserRuleCall_6ElementType());
		}
		rulesexpr
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleclassDef
entryRuleclassDef:
	{ markComposite(elementTypeProvider.getClassDefElementType()); }
	ruleclassDef
	EOF;

// Rule classDef
ruleclassDef:
	(
		{
			markLeaf(elementTypeProvider.getClassDef_ClassKeyword_0ElementType());
		}
		kw='class'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getClassDef_IdentTerminalRuleCall_1ElementType());
		}
		this_ident_1=RULE_IDENT
		{
			doneLeaf(this_ident_1);
		}
		{
			markComposite(elementTypeProvider.getClassDef_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markComposite(elementTypeProvider.getClassDef_TparamParserRuleCall_3ElementType());
		}
		ruletparam
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getClassDef_LeftCurlyBracketKeyword_4ElementType());
		}
		kw='{'
		{
			doneLeaf(kw);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getClassDef_PlusSignKeyword_5_0_0ElementType());
				}
				kw='+'
				{
					doneLeaf(kw);
				}
				{
					markComposite(elementTypeProvider.getClassDef_TypeParserRuleCall_5_0_1ElementType());
				}
				ruletype
				{
					doneComposite();
				}
			)
			    |
			{
				markComposite(elementTypeProvider.getClassDef_TparamParserRuleCall_5_1ElementType());
			}
			ruletparam
			{
				doneComposite();
			}
		)*
		{
			markLeaf(elementTypeProvider.getClassDef_RightCurlyBracketKeyword_6ElementType());
		}
		kw='}'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getClassDef_LeftCurlyBracketKeyword_7ElementType());
		}
		kw='{'
		{
			doneLeaf(kw);
		}
		(
			{
				markComposite(elementTypeProvider.getClassDef_MethodClassParserRuleCall_8ElementType());
			}
			rulemethodClass
			{
				doneComposite();
			}
		)*
		{
			markLeaf(elementTypeProvider.getClassDef_RightCurlyBracketKeyword_9ElementType());
		}
		kw='}'
		{
			doneLeaf(kw);
		}
	)
;

//Entry rule entryRuletraitDef
entryRuletraitDef:
	{ markComposite(elementTypeProvider.getTraitDefElementType()); }
	ruletraitDef
	EOF;

// Rule traitDef
ruletraitDef:
	(
		{
			markLeaf(elementTypeProvider.getTraitDef_TraitKeyword_0ElementType());
		}
		kw='trait'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getTraitDef_IdentTerminalRuleCall_1ElementType());
		}
		this_ident_1=RULE_IDENT
		{
			doneLeaf(this_ident_1);
		}
		{
			markComposite(elementTypeProvider.getTraitDef_GenericsParserRuleCall_2ElementType());
		}
		rulegenerics
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getTraitDef_LeftCurlyBracketKeyword_3ElementType());
		}
		kw='{'
		{
			doneLeaf(kw);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getTraitDef_PlusSignKeyword_4_0_0ElementType());
				}
				kw='+'
				{
					doneLeaf(kw);
				}
				{
					markComposite(elementTypeProvider.getTraitDef_TypeParserRuleCall_4_0_1ElementType());
				}
				ruletype
				{
					doneComposite();
				}
			)
			    |
			{
				markComposite(elementTypeProvider.getTraitDef_TparamParserRuleCall_4_1ElementType());
			}
			ruletparam
			{
				doneComposite();
			}
		)*
		{
			markLeaf(elementTypeProvider.getTraitDef_RightCurlyBracketKeyword_5ElementType());
		}
		kw='}'
		{
			doneLeaf(kw);
		}
		{
			markLeaf(elementTypeProvider.getTraitDef_LeftCurlyBracketKeyword_6ElementType());
		}
		kw='{'
		{
			doneLeaf(kw);
		}
		(
			{
				markComposite(elementTypeProvider.getTraitDef_MethodTraitParserRuleCall_7ElementType());
			}
			rulemethodTrait
			{
				doneComposite();
			}
		)*
		{
			markLeaf(elementTypeProvider.getTraitDef_RightCurlyBracketKeyword_8ElementType());
		}
		kw='}'
		{
			doneLeaf(kw);
		}
	)
;

//Entry rule entryRulemethodClass
entryRulemethodClass:
	{ markComposite(elementTypeProvider.getMethodClassElementType()); }
	rulemethodClass
	EOF;

// Rule methodClass
rulemethodClass:
	(
		{
			markLeaf(elementTypeProvider.getMethodClass_DefKeyword_0ElementType());
		}
		kw='def'
		{
			doneLeaf(kw);
		}
		(
			{
				markLeaf(elementTypeProvider.getMethodClass_IdentTerminalRuleCall_1_0ElementType());
			}
			this_ident_1=RULE_IDENT
			{
				doneLeaf(this_ident_1);
			}
			{
				markLeaf(elementTypeProvider.getMethodClass_FullStopKeyword_1_1ElementType());
			}
			kw='.'
			{
				doneLeaf(kw);
			}
		)?
		{
			markComposite(elementTypeProvider.getMethodClass_IdentOrOpParserRuleCall_2ElementType());
		}
		ruleidentOrOp
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getMethodClass_IdentTerminalRuleCall_3ElementType());
			}
			this_ident_4=RULE_IDENT
			{
				doneLeaf(this_ident_4);
			}
		)*
		{
			markLeaf(elementTypeProvider.getMethodClass_EqualsSignKeyword_4ElementType());
		}
		kw='='
		{
			doneLeaf(kw);
		}
		(
			{
				markComposite(elementTypeProvider.getMethodClass_ExprParserRuleCall_5ElementType());
			}
			ruleexpr
			{
				doneComposite();
			}
		)+
	)
;

//Entry rule entryRulemethodTrait
entryRulemethodTrait:
	{ markComposite(elementTypeProvider.getMethodTraitElementType()); }
	rulemethodTrait
	EOF;

// Rule methodTrait
rulemethodTrait:
	(
		{
			markLeaf(elementTypeProvider.getMethodTrait_DefKeyword_0ElementType());
		}
		kw='def'
		{
			doneLeaf(kw);
		}
		{
			markComposite(elementTypeProvider.getMethodTrait_IdentOrOpParserRuleCall_1ElementType());
		}
		ruleidentOrOp
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getMethodTrait_IdentTerminalRuleCall_2ElementType());
			}
			this_ident_2=RULE_IDENT
			{
				doneLeaf(this_ident_2);
			}
		)*
		{
			markLeaf(elementTypeProvider.getMethodTrait_EqualsSignKeyword_3ElementType());
		}
		kw='='
		{
			doneLeaf(kw);
		}
		(
			{
				markComposite(elementTypeProvider.getMethodTrait_ExprParserRuleCall_4ElementType());
			}
			ruleexpr
			{
				doneComposite();
			}
		)+
	)
;

//Entry rule entryRuleexpr
entryRuleexpr:
	{ markComposite(elementTypeProvider.getExprElementType()); }
	ruleexpr
	EOF;

// Rule expr
ruleexpr:
	(
		{
			markComposite(elementTypeProvider.getExpr_IexprParserRuleCall_0ElementType());
		}
		ruleiexpr
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getExpr_CommaKeyword_1_0ElementType());
			}
			kw=','
			{
				doneLeaf(kw);
			}
			{
				markComposite(elementTypeProvider.getExpr_IexprParserRuleCall_1_1ElementType());
			}
			ruleiexpr
			{
				doneComposite();
			}
		)*
	)
;

//Entry rule entryRuleiexpr
entryRuleiexpr:
	{ markComposite(elementTypeProvider.getIexprElementType()); }
	ruleiexpr
	EOF;

// Rule iexpr
ruleiexpr:
	(
		{
			markComposite(elementTypeProvider.getIexpr_SexprParserRuleCall_0ElementType());
		}
		rulesexpr
		{
			doneComposite();
		}
		(
			{
				markLeaf(elementTypeProvider.getIexpr_FullStopKeyword_1_0ElementType());
			}
			kw='.'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getIexpr_IdentTerminalRuleCall_1_1ElementType());
			}
			this_ident_2=RULE_IDENT
			{
				doneLeaf(this_ident_2);
			}
		)*
	)
;

//Entry rule entryRulesexpr
entryRulesexpr:
	{ markComposite(elementTypeProvider.getSexprElementType()); }
	rulesexpr
	EOF;

// Rule sexpr
rulesexpr:
	(
		{
			markLeaf(elementTypeProvider.getSexpr_INTTerminalRuleCall_0ElementType());
		}
		this_INT_0=RULE_INT
		{
			doneLeaf(this_INT_0);
		}
		    |
		{
			markLeaf(elementTypeProvider.getSexpr_STRINGTerminalRuleCall_1ElementType());
		}
		this_STRING_1=RULE_STRING
		{
			doneLeaf(this_STRING_1);
		}
		    |
		{
			markLeaf(elementTypeProvider.getSexpr_OPTerminalRuleCall_2ElementType());
		}
		this_OP_2=RULE_OP
		{
			doneLeaf(this_OP_2);
		}
		    |
		{
			markLeaf(elementTypeProvider.getSexpr_DOLLTerminalRuleCall_3ElementType());
		}
		this_DOLL_3=RULE_DOLL
		{
			doneLeaf(this_DOLL_3);
		}
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_LeftParenthesisKeyword_4_0ElementType());
			}
			kw='('
			{
				doneLeaf(kw);
			}
			(
				{
					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_4_1ElementType());
				}
				ruleexpr
				{
					doneComposite();
				}
			)+
			{
				markLeaf(elementTypeProvider.getSexpr_RightParenthesisKeyword_4_2ElementType());
			}
			kw=')'
			{
				doneLeaf(kw);
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_LeftCurlyBracketKeyword_5_0ElementType());
			}
			kw='{'
			{
				doneLeaf(kw);
			}
			(
				{
					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_5_1ElementType());
				}
				ruleexpr
				{
					doneComposite();
				}
			)+
			{
				markLeaf(elementTypeProvider.getSexpr_RightCurlyBracketKeyword_5_2ElementType());
			}
			kw='}'
			{
				doneLeaf(kw);
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_LessThanSignKeyword_6_0ElementType());
			}
			kw='<'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_6_1ElementType());
			}
			this_ident_11=RULE_IDENT
			{
				doneLeaf(this_ident_11);
			}
			(
				{
					markComposite(elementTypeProvider.getSexpr_AttrParserRuleCall_6_2ElementType());
				}
				ruleattr
				{
					doneComposite();
				}
			)*
			(
				(
					{
						markLeaf(elementTypeProvider.getSexpr_GreaterThanSignKeyword_6_3_0_0ElementType());
					}
					kw='>'
					{
						doneLeaf(kw);
					}
					(
						{
							markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_6_3_0_1ElementType());
						}
						ruleexpr
						{
							doneComposite();
						}
					)+
					{
						markLeaf(elementTypeProvider.getSexpr_LessThanSignSolidusKeyword_6_3_0_2ElementType());
					}
					kw='</'
					{
						doneLeaf(kw);
					}
					(
						{
							markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_6_3_0_3ElementType());
						}
						this_ident_16=RULE_IDENT
						{
							doneLeaf(this_ident_16);
						}
					)?
					{
						markLeaf(elementTypeProvider.getSexpr_GreaterThanSignKeyword_6_3_0_4ElementType());
					}
					kw='>'
					{
						doneLeaf(kw);
					}
				)
				    |
				{
					markLeaf(elementTypeProvider.getSexpr_SolidusGreaterThanSignKeyword_6_3_1ElementType());
				}
				kw='/>'
				{
					doneLeaf(kw);
				}
			)
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_ForKeyword_7_0ElementType());
			}
			kw='for'
			{
				doneLeaf(kw);
			}
			(
				{
					markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_7_1_0ElementType());
				}
				this_ident_20=RULE_IDENT
				{
					doneLeaf(this_ident_20);
				}
				{
					markLeaf(elementTypeProvider.getSexpr_LessThanSignHyphenMinusKeyword_7_1_1ElementType());
				}
				kw='<-'
				{
					doneLeaf(kw);
				}
				{
					markComposite(elementTypeProvider.getSexpr_SexprParserRuleCall_7_1_2ElementType());
				}
				rulesexpr
				{
					doneComposite();
				}
			)+
			(
				{
					markLeaf(elementTypeProvider.getSexpr_IfKeyword_7_2_0ElementType());
				}
				kw='if'
				{
					doneLeaf(kw);
				}
				(
					{
						markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_7_2_1ElementType());
					}
					ruleexpr
					{
						doneComposite();
					}
				)+
			)*
			{
				markLeaf(elementTypeProvider.getSexpr_YieldKeyword_7_3ElementType());
			}
			kw='yield'
			{
				doneLeaf(kw);
			}
			{
				markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_7_4ElementType());
			}
			ruleexpr
			{
				doneComposite();
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_LetKeyword_8_0ElementType());
			}
			kw='let'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_8_1ElementType());
			}
			this_ident_28=RULE_IDENT
			{
				doneLeaf(this_ident_28);
			}
			(
				{
					markLeaf(elementTypeProvider.getSexpr_ColonKeyword_8_2_0ElementType());
				}
				kw=':'
				{
					doneLeaf(kw);
				}
				{
					markComposite(elementTypeProvider.getSexpr_GenericsParserRuleCall_8_2_1ElementType());
				}
				rulegenerics
				{
					doneComposite();
				}
				{
					markComposite(elementTypeProvider.getSexpr_TypeParserRuleCall_8_2_2ElementType());
				}
				ruletype
				{
					doneComposite();
				}
			)?
			{
				markLeaf(elementTypeProvider.getSexpr_EqualsSignKeyword_8_3ElementType());
			}
			kw='='
			{
				doneLeaf(kw);
			}
			(
				{
					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_8_4ElementType());
				}
				ruleexpr
				{
					doneComposite();
				}
			)+
			{
				markLeaf(elementTypeProvider.getSexpr_InKeyword_8_5ElementType());
			}
			kw='in'
			{
				doneLeaf(kw);
			}
			{
				markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_8_6ElementType());
			}
			ruleexpr
			{
				doneComposite();
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getSexpr_NewKeyword_9_0ElementType());
			}
			kw='new'
			{
				doneLeaf(kw);
			}
			(
				{
					markComposite(elementTypeProvider.getSexpr_ExprParserRuleCall_9_1ElementType());
				}
				ruleexpr
				{
					doneComposite();
				}
			)+
			{
				markLeaf(elementTypeProvider.getSexpr_WithKeyword_9_2ElementType());
			}
			kw='with'
			{
				doneLeaf(kw);
			}
			(
				{
					markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_9_3_0ElementType());
				}
				this_ident_39=RULE_IDENT
				{
					doneLeaf(this_ident_39);
				}
				{
					markLeaf(elementTypeProvider.getSexpr_EqualsSignKeyword_9_3_1ElementType());
				}
				kw='='
				{
					doneLeaf(kw);
				}
				{
					markComposite(elementTypeProvider.getSexpr_SexprParserRuleCall_9_3_2ElementType());
				}
				rulesexpr
				{
					doneComposite();
				}
			)+
		)
		    |
		{
			markLeaf(elementTypeProvider.getSexpr_IdentTerminalRuleCall_10ElementType());
		}
		this_ident_42=RULE_IDENT
		{
			doneLeaf(this_ident_42);
		}
	)
;

//Entry rule entryRuleattr
entryRuleattr:
	{ markComposite(elementTypeProvider.getAttrElementType()); }
	ruleattr
	EOF;

// Rule attr
ruleattr:
	(
		{
			markLeaf(elementTypeProvider.getAttr_IdentTerminalRuleCall_0ElementType());
		}
		this_ident_0=RULE_IDENT
		{
			doneLeaf(this_ident_0);
		}
		{
			markLeaf(elementTypeProvider.getAttr_EqualsSignKeyword_1ElementType());
		}
		kw='='
		{
			doneLeaf(kw);
		}
		{
			markComposite(elementTypeProvider.getAttr_SexprParserRuleCall_2ElementType());
		}
		rulesexpr
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleidentOrOp
entryRuleidentOrOp:
	{ markComposite(elementTypeProvider.getIdentOrOpElementType()); }
	ruleidentOrOp
	EOF;

// Rule identOrOp
ruleidentOrOp:
	(
		{
			markLeaf(elementTypeProvider.getIdentOrOp_IdentTerminalRuleCall_0ElementType());
		}
		this_ident_0=RULE_IDENT
		{
			doneLeaf(this_ident_0);
		}
		    |
		(
			{
				markLeaf(elementTypeProvider.getIdentOrOp_LeftParenthesisKeyword_1_0ElementType());
			}
			kw='('
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getIdentOrOp_OPTerminalRuleCall_1_1ElementType());
			}
			this_OP_2=RULE_OP
			{
				doneLeaf(this_OP_2);
			}
			{
				markLeaf(elementTypeProvider.getIdentOrOp_RightParenthesisKeyword_1_2ElementType());
			}
			kw=')'
			{
				doneLeaf(kw);
			}
		)
	)
;

RULE_IDENT : RULE_ID;

RULE_DOLL : '$';

RULE_OP : (RULE_SOP (RULE_SOP|RULE_EOP)*|RULE_EOP (RULE_SOP|RULE_EOP)+);

fragment RULE_SOP : ('~'|'#'|'?'|';'|'@'|'&'|'!'|'%'|'>'|'='|'+'|'*'|'/'|'|'|'^'|'-'|'[');

fragment RULE_EOP : ('$'|'<'|'.'|':');

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;