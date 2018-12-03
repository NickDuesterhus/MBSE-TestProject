package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")

public class InternalMyDslParser extends AbstractInternalContentAssistParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_FLOAT", 
		"RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", 
		"RULE_WS", "'endfacet'", "'endloop'", "'endsolid'", "'facet'", "'loop'", 
		"'normal'", "'outer'", "'solid'", "'vertex'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_FLOAT=5;
	public static final int RULE_ID=6;
	public static final int RULE_INT=7;
	public static final int RULE_ML_COMMENT=8;
	public static final int RULE_SL_COMMENT=9;
	public static final int RULE_STRING=10;
	public static final int RULE_WS=11;

	// delegates
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
	}

	// delegators


	public InternalMyDslParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalMyDsl.g"; }


		private MyDslGrammarAccess grammarAccess;

		public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



	// $ANTLR start "entryRuleSolid"
	// InternalMyDsl.g:53:1: entryRuleSolid : ruleSolid EOF ;
	public final void entryRuleSolid() throws RecognitionException {
		try {
			// InternalMyDsl.g:54:1: ( ruleSolid EOF )
			// InternalMyDsl.g:55:1: ruleSolid EOF
			{
			 before(grammarAccess.getSolidRule()); 
			pushFollow(FOLLOW_1);
			ruleSolid();
			state._fsp--;

			 after(grammarAccess.getSolidRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleSolid"



	// $ANTLR start "ruleSolid"
	// InternalMyDsl.g:62:1: ruleSolid : ( ( rule__Solid__Group__0 ) ) ;
	public final void ruleSolid() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:66:2: ( ( ( rule__Solid__Group__0 ) ) )
			// InternalMyDsl.g:67:2: ( ( rule__Solid__Group__0 ) )
			{
			// InternalMyDsl.g:67:2: ( ( rule__Solid__Group__0 ) )
			// InternalMyDsl.g:68:3: ( rule__Solid__Group__0 )
			{
			 before(grammarAccess.getSolidAccess().getGroup()); 
			// InternalMyDsl.g:69:3: ( rule__Solid__Group__0 )
			// InternalMyDsl.g:69:4: rule__Solid__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Solid__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleSolid"



	// $ANTLR start "entryRuleFacet"
	// InternalMyDsl.g:78:1: entryRuleFacet : ruleFacet EOF ;
	public final void entryRuleFacet() throws RecognitionException {
		try {
			// InternalMyDsl.g:79:1: ( ruleFacet EOF )
			// InternalMyDsl.g:80:1: ruleFacet EOF
			{
			 before(grammarAccess.getFacetRule()); 
			pushFollow(FOLLOW_1);
			ruleFacet();
			state._fsp--;

			 after(grammarAccess.getFacetRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleFacet"



	// $ANTLR start "ruleFacet"
	// InternalMyDsl.g:87:1: ruleFacet : ( ( rule__Facet__Group__0 ) ) ;
	public final void ruleFacet() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:91:2: ( ( ( rule__Facet__Group__0 ) ) )
			// InternalMyDsl.g:92:2: ( ( rule__Facet__Group__0 ) )
			{
			// InternalMyDsl.g:92:2: ( ( rule__Facet__Group__0 ) )
			// InternalMyDsl.g:93:3: ( rule__Facet__Group__0 )
			{
			 before(grammarAccess.getFacetAccess().getGroup()); 
			// InternalMyDsl.g:94:3: ( rule__Facet__Group__0 )
			// InternalMyDsl.g:94:4: rule__Facet__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Facet__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleFacet"



	// $ANTLR start "entryRuleVector"
	// InternalMyDsl.g:103:1: entryRuleVector : ruleVector EOF ;
	public final void entryRuleVector() throws RecognitionException {
		try {
			// InternalMyDsl.g:104:1: ( ruleVector EOF )
			// InternalMyDsl.g:105:1: ruleVector EOF
			{
			 before(grammarAccess.getVectorRule()); 
			pushFollow(FOLLOW_1);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getVectorRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleVector"



	// $ANTLR start "ruleVector"
	// InternalMyDsl.g:112:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
	public final void ruleVector() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:116:2: ( ( ( rule__Vector__Group__0 ) ) )
			// InternalMyDsl.g:117:2: ( ( rule__Vector__Group__0 ) )
			{
			// InternalMyDsl.g:117:2: ( ( rule__Vector__Group__0 ) )
			// InternalMyDsl.g:118:3: ( rule__Vector__Group__0 )
			{
			 before(grammarAccess.getVectorAccess().getGroup()); 
			// InternalMyDsl.g:119:3: ( rule__Vector__Group__0 )
			// InternalMyDsl.g:119:4: rule__Vector__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Vector__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleVector"



	// $ANTLR start "entryRuleNormalvector"
	// InternalMyDsl.g:128:1: entryRuleNormalvector : ruleNormalvector EOF ;
	public final void entryRuleNormalvector() throws RecognitionException {
		try {
			// InternalMyDsl.g:129:1: ( ruleNormalvector EOF )
			// InternalMyDsl.g:130:1: ruleNormalvector EOF
			{
			 before(grammarAccess.getNormalvectorRule()); 
			pushFollow(FOLLOW_1);
			ruleNormalvector();
			state._fsp--;

			 after(grammarAccess.getNormalvectorRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleNormalvector"



	// $ANTLR start "ruleNormalvector"
	// InternalMyDsl.g:137:1: ruleNormalvector : ( ( rule__Normalvector__Group__0 ) ) ;
	public final void ruleNormalvector() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:141:2: ( ( ( rule__Normalvector__Group__0 ) ) )
			// InternalMyDsl.g:142:2: ( ( rule__Normalvector__Group__0 ) )
			{
			// InternalMyDsl.g:142:2: ( ( rule__Normalvector__Group__0 ) )
			// InternalMyDsl.g:143:3: ( rule__Normalvector__Group__0 )
			{
			 before(grammarAccess.getNormalvectorAccess().getGroup()); 
			// InternalMyDsl.g:144:3: ( rule__Normalvector__Group__0 )
			// InternalMyDsl.g:144:4: rule__Normalvector__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Normalvector__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getNormalvectorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleNormalvector"



	// $ANTLR start "rule__Solid__Group__0"
	// InternalMyDsl.g:152:1: rule__Solid__Group__0 : rule__Solid__Group__0__Impl rule__Solid__Group__1 ;
	public final void rule__Solid__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:156:2: ( rule__Solid__Group__0__Impl rule__Solid__Group__1 )
			// InternalMyDsl.g:157:2: rule__Solid__Group__0__Impl rule__Solid__Group__1
			{
			pushFollow(FOLLOW_3);
			rule__Solid__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__0"



	// $ANTLR start "rule__Solid__Group__0__Impl"
	// InternalMyDsl.g:164:1: rule__Solid__Group__0__Impl : ( 'solid' ) ;
	public final void rule__Solid__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:168:2: ( ( 'solid' ) )
			// InternalMyDsl.g:169:2: ( 'solid' )
			{
			// InternalMyDsl.g:169:2: ( 'solid' )
			// InternalMyDsl.g:170:2: 'solid'
			{
			 before(grammarAccess.getSolidAccess().getSolidKeyword_0()); 
			match(input,19,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getSolidKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__0__Impl"



	// $ANTLR start "rule__Solid__Group__1"
	// InternalMyDsl.g:179:1: rule__Solid__Group__1 : rule__Solid__Group__1__Impl rule__Solid__Group__2 ;
	public final void rule__Solid__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:183:2: ( rule__Solid__Group__1__Impl rule__Solid__Group__2 )
			// InternalMyDsl.g:184:2: rule__Solid__Group__1__Impl rule__Solid__Group__2
			{
			pushFollow(FOLLOW_4);
			rule__Solid__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__1"



	// $ANTLR start "rule__Solid__Group__1__Impl"
	// InternalMyDsl.g:191:1: rule__Solid__Group__1__Impl : ( ( rule__Solid__NameAssignment_1 ) ) ;
	public final void rule__Solid__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:195:2: ( ( ( rule__Solid__NameAssignment_1 ) ) )
			// InternalMyDsl.g:196:2: ( ( rule__Solid__NameAssignment_1 ) )
			{
			// InternalMyDsl.g:196:2: ( ( rule__Solid__NameAssignment_1 ) )
			// InternalMyDsl.g:197:2: ( rule__Solid__NameAssignment_1 )
			{
			 before(grammarAccess.getSolidAccess().getNameAssignment_1()); 
			// InternalMyDsl.g:198:2: ( rule__Solid__NameAssignment_1 )
			// InternalMyDsl.g:198:3: rule__Solid__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Solid__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__1__Impl"



	// $ANTLR start "rule__Solid__Group__2"
	// InternalMyDsl.g:206:1: rule__Solid__Group__2 : rule__Solid__Group__2__Impl rule__Solid__Group__3 ;
	public final void rule__Solid__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:210:2: ( rule__Solid__Group__2__Impl rule__Solid__Group__3 )
			// InternalMyDsl.g:211:2: rule__Solid__Group__2__Impl rule__Solid__Group__3
			{
			pushFollow(FOLLOW_5);
			rule__Solid__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__2"



	// $ANTLR start "rule__Solid__Group__2__Impl"
	// InternalMyDsl.g:218:1: rule__Solid__Group__2__Impl : ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) ) ;
	public final void rule__Solid__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:222:2: ( ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) ) )
			// InternalMyDsl.g:223:2: ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) )
			{
			// InternalMyDsl.g:223:2: ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) )
			// InternalMyDsl.g:224:2: ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* )
			{
			// InternalMyDsl.g:224:2: ( ( rule__Solid__FacetsAssignment_2 ) )
			// InternalMyDsl.g:225:3: ( rule__Solid__FacetsAssignment_2 )
			{
			 before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			// InternalMyDsl.g:226:3: ( rule__Solid__FacetsAssignment_2 )
			// InternalMyDsl.g:226:4: rule__Solid__FacetsAssignment_2
			{
			pushFollow(FOLLOW_6);
			rule__Solid__FacetsAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			}

			// InternalMyDsl.g:229:2: ( ( rule__Solid__FacetsAssignment_2 )* )
			// InternalMyDsl.g:230:3: ( rule__Solid__FacetsAssignment_2 )*
			{
			 before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			// InternalMyDsl.g:231:3: ( rule__Solid__FacetsAssignment_2 )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==15) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalMyDsl.g:231:4: rule__Solid__FacetsAssignment_2
					{
					pushFollow(FOLLOW_6);
					rule__Solid__FacetsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			 after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__2__Impl"



	// $ANTLR start "rule__Solid__Group__3"
	// InternalMyDsl.g:240:1: rule__Solid__Group__3 : rule__Solid__Group__3__Impl rule__Solid__Group__4 ;
	public final void rule__Solid__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:244:2: ( rule__Solid__Group__3__Impl rule__Solid__Group__4 )
			// InternalMyDsl.g:245:2: rule__Solid__Group__3__Impl rule__Solid__Group__4
			{
			pushFollow(FOLLOW_3);
			rule__Solid__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__3"



	// $ANTLR start "rule__Solid__Group__3__Impl"
	// InternalMyDsl.g:252:1: rule__Solid__Group__3__Impl : ( 'endsolid' ) ;
	public final void rule__Solid__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:256:2: ( ( 'endsolid' ) )
			// InternalMyDsl.g:257:2: ( 'endsolid' )
			{
			// InternalMyDsl.g:257:2: ( 'endsolid' )
			// InternalMyDsl.g:258:2: 'endsolid'
			{
			 before(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); 
			match(input,14,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__3__Impl"



	// $ANTLR start "rule__Solid__Group__4"
	// InternalMyDsl.g:267:1: rule__Solid__Group__4 : rule__Solid__Group__4__Impl ;
	public final void rule__Solid__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:271:2: ( rule__Solid__Group__4__Impl )
			// InternalMyDsl.g:272:2: rule__Solid__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Solid__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__4"



	// $ANTLR start "rule__Solid__Group__4__Impl"
	// InternalMyDsl.g:278:1: rule__Solid__Group__4__Impl : ( RULE_ID ) ;
	public final void rule__Solid__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:282:2: ( ( RULE_ID ) )
			// InternalMyDsl.g:283:2: ( RULE_ID )
			{
			// InternalMyDsl.g:283:2: ( RULE_ID )
			// InternalMyDsl.g:284:2: RULE_ID
			{
			 before(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__4__Impl"



	// $ANTLR start "rule__Facet__Group__0"
	// InternalMyDsl.g:294:1: rule__Facet__Group__0 : rule__Facet__Group__0__Impl rule__Facet__Group__1 ;
	public final void rule__Facet__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:298:2: ( rule__Facet__Group__0__Impl rule__Facet__Group__1 )
			// InternalMyDsl.g:299:2: rule__Facet__Group__0__Impl rule__Facet__Group__1
			{
			pushFollow(FOLLOW_7);
			rule__Facet__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__0"



	// $ANTLR start "rule__Facet__Group__0__Impl"
	// InternalMyDsl.g:306:1: rule__Facet__Group__0__Impl : ( 'facet' ) ;
	public final void rule__Facet__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:310:2: ( ( 'facet' ) )
			// InternalMyDsl.g:311:2: ( 'facet' )
			{
			// InternalMyDsl.g:311:2: ( 'facet' )
			// InternalMyDsl.g:312:2: 'facet'
			{
			 before(grammarAccess.getFacetAccess().getFacetKeyword_0()); 
			match(input,15,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getFacetKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__0__Impl"



	// $ANTLR start "rule__Facet__Group__1"
	// InternalMyDsl.g:321:1: rule__Facet__Group__1 : rule__Facet__Group__1__Impl rule__Facet__Group__2 ;
	public final void rule__Facet__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:325:2: ( rule__Facet__Group__1__Impl rule__Facet__Group__2 )
			// InternalMyDsl.g:326:2: rule__Facet__Group__1__Impl rule__Facet__Group__2
			{
			pushFollow(FOLLOW_8);
			rule__Facet__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__1"



	// $ANTLR start "rule__Facet__Group__1__Impl"
	// InternalMyDsl.g:333:1: rule__Facet__Group__1__Impl : ( ( rule__Facet__NormalAssignment_1 ) ) ;
	public final void rule__Facet__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:337:2: ( ( ( rule__Facet__NormalAssignment_1 ) ) )
			// InternalMyDsl.g:338:2: ( ( rule__Facet__NormalAssignment_1 ) )
			{
			// InternalMyDsl.g:338:2: ( ( rule__Facet__NormalAssignment_1 ) )
			// InternalMyDsl.g:339:2: ( rule__Facet__NormalAssignment_1 )
			{
			 before(grammarAccess.getFacetAccess().getNormalAssignment_1()); 
			// InternalMyDsl.g:340:2: ( rule__Facet__NormalAssignment_1 )
			// InternalMyDsl.g:340:3: rule__Facet__NormalAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Facet__NormalAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getNormalAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__1__Impl"



	// $ANTLR start "rule__Facet__Group__2"
	// InternalMyDsl.g:348:1: rule__Facet__Group__2 : rule__Facet__Group__2__Impl rule__Facet__Group__3 ;
	public final void rule__Facet__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:352:2: ( rule__Facet__Group__2__Impl rule__Facet__Group__3 )
			// InternalMyDsl.g:353:2: rule__Facet__Group__2__Impl rule__Facet__Group__3
			{
			pushFollow(FOLLOW_9);
			rule__Facet__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__2"



	// $ANTLR start "rule__Facet__Group__2__Impl"
	// InternalMyDsl.g:360:1: rule__Facet__Group__2__Impl : ( 'outer' ) ;
	public final void rule__Facet__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:364:2: ( ( 'outer' ) )
			// InternalMyDsl.g:365:2: ( 'outer' )
			{
			// InternalMyDsl.g:365:2: ( 'outer' )
			// InternalMyDsl.g:366:2: 'outer'
			{
			 before(grammarAccess.getFacetAccess().getOuterKeyword_2()); 
			match(input,18,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getOuterKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__2__Impl"



	// $ANTLR start "rule__Facet__Group__3"
	// InternalMyDsl.g:375:1: rule__Facet__Group__3 : rule__Facet__Group__3__Impl rule__Facet__Group__4 ;
	public final void rule__Facet__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:379:2: ( rule__Facet__Group__3__Impl rule__Facet__Group__4 )
			// InternalMyDsl.g:380:2: rule__Facet__Group__3__Impl rule__Facet__Group__4
			{
			pushFollow(FOLLOW_10);
			rule__Facet__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__3"



	// $ANTLR start "rule__Facet__Group__3__Impl"
	// InternalMyDsl.g:387:1: rule__Facet__Group__3__Impl : ( 'loop' ) ;
	public final void rule__Facet__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:391:2: ( ( 'loop' ) )
			// InternalMyDsl.g:392:2: ( 'loop' )
			{
			// InternalMyDsl.g:392:2: ( 'loop' )
			// InternalMyDsl.g:393:2: 'loop'
			{
			 before(grammarAccess.getFacetAccess().getLoopKeyword_3()); 
			match(input,16,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getLoopKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__3__Impl"



	// $ANTLR start "rule__Facet__Group__4"
	// InternalMyDsl.g:402:1: rule__Facet__Group__4 : rule__Facet__Group__4__Impl rule__Facet__Group__5 ;
	public final void rule__Facet__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:406:2: ( rule__Facet__Group__4__Impl rule__Facet__Group__5 )
			// InternalMyDsl.g:407:2: rule__Facet__Group__4__Impl rule__Facet__Group__5
			{
			pushFollow(FOLLOW_10);
			rule__Facet__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__4"



	// $ANTLR start "rule__Facet__Group__4__Impl"
	// InternalMyDsl.g:414:1: rule__Facet__Group__4__Impl : ( ( rule__Facet__V1Assignment_4 ) ) ;
	public final void rule__Facet__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:418:2: ( ( ( rule__Facet__V1Assignment_4 ) ) )
			// InternalMyDsl.g:419:2: ( ( rule__Facet__V1Assignment_4 ) )
			{
			// InternalMyDsl.g:419:2: ( ( rule__Facet__V1Assignment_4 ) )
			// InternalMyDsl.g:420:2: ( rule__Facet__V1Assignment_4 )
			{
			 before(grammarAccess.getFacetAccess().getV1Assignment_4()); 
			// InternalMyDsl.g:421:2: ( rule__Facet__V1Assignment_4 )
			// InternalMyDsl.g:421:3: rule__Facet__V1Assignment_4
			{
			pushFollow(FOLLOW_2);
			rule__Facet__V1Assignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getV1Assignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__4__Impl"



	// $ANTLR start "rule__Facet__Group__5"
	// InternalMyDsl.g:429:1: rule__Facet__Group__5 : rule__Facet__Group__5__Impl rule__Facet__Group__6 ;
	public final void rule__Facet__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:433:2: ( rule__Facet__Group__5__Impl rule__Facet__Group__6 )
			// InternalMyDsl.g:434:2: rule__Facet__Group__5__Impl rule__Facet__Group__6
			{
			pushFollow(FOLLOW_10);
			rule__Facet__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__5"



	// $ANTLR start "rule__Facet__Group__5__Impl"
	// InternalMyDsl.g:441:1: rule__Facet__Group__5__Impl : ( ( rule__Facet__V2Assignment_5 ) ) ;
	public final void rule__Facet__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:445:2: ( ( ( rule__Facet__V2Assignment_5 ) ) )
			// InternalMyDsl.g:446:2: ( ( rule__Facet__V2Assignment_5 ) )
			{
			// InternalMyDsl.g:446:2: ( ( rule__Facet__V2Assignment_5 ) )
			// InternalMyDsl.g:447:2: ( rule__Facet__V2Assignment_5 )
			{
			 before(grammarAccess.getFacetAccess().getV2Assignment_5()); 
			// InternalMyDsl.g:448:2: ( rule__Facet__V2Assignment_5 )
			// InternalMyDsl.g:448:3: rule__Facet__V2Assignment_5
			{
			pushFollow(FOLLOW_2);
			rule__Facet__V2Assignment_5();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getV2Assignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__5__Impl"



	// $ANTLR start "rule__Facet__Group__6"
	// InternalMyDsl.g:456:1: rule__Facet__Group__6 : rule__Facet__Group__6__Impl rule__Facet__Group__7 ;
	public final void rule__Facet__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:460:2: ( rule__Facet__Group__6__Impl rule__Facet__Group__7 )
			// InternalMyDsl.g:461:2: rule__Facet__Group__6__Impl rule__Facet__Group__7
			{
			pushFollow(FOLLOW_11);
			rule__Facet__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__6"



	// $ANTLR start "rule__Facet__Group__6__Impl"
	// InternalMyDsl.g:468:1: rule__Facet__Group__6__Impl : ( ( rule__Facet__V3Assignment_6 ) ) ;
	public final void rule__Facet__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:472:2: ( ( ( rule__Facet__V3Assignment_6 ) ) )
			// InternalMyDsl.g:473:2: ( ( rule__Facet__V3Assignment_6 ) )
			{
			// InternalMyDsl.g:473:2: ( ( rule__Facet__V3Assignment_6 ) )
			// InternalMyDsl.g:474:2: ( rule__Facet__V3Assignment_6 )
			{
			 before(grammarAccess.getFacetAccess().getV3Assignment_6()); 
			// InternalMyDsl.g:475:2: ( rule__Facet__V3Assignment_6 )
			// InternalMyDsl.g:475:3: rule__Facet__V3Assignment_6
			{
			pushFollow(FOLLOW_2);
			rule__Facet__V3Assignment_6();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getV3Assignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__6__Impl"



	// $ANTLR start "rule__Facet__Group__7"
	// InternalMyDsl.g:483:1: rule__Facet__Group__7 : rule__Facet__Group__7__Impl rule__Facet__Group__8 ;
	public final void rule__Facet__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:487:2: ( rule__Facet__Group__7__Impl rule__Facet__Group__8 )
			// InternalMyDsl.g:488:2: rule__Facet__Group__7__Impl rule__Facet__Group__8
			{
			pushFollow(FOLLOW_12);
			rule__Facet__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__7"



	// $ANTLR start "rule__Facet__Group__7__Impl"
	// InternalMyDsl.g:495:1: rule__Facet__Group__7__Impl : ( 'endloop' ) ;
	public final void rule__Facet__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:499:2: ( ( 'endloop' ) )
			// InternalMyDsl.g:500:2: ( 'endloop' )
			{
			// InternalMyDsl.g:500:2: ( 'endloop' )
			// InternalMyDsl.g:501:2: 'endloop'
			{
			 before(grammarAccess.getFacetAccess().getEndloopKeyword_7()); 
			match(input,13,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getEndloopKeyword_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__7__Impl"



	// $ANTLR start "rule__Facet__Group__8"
	// InternalMyDsl.g:510:1: rule__Facet__Group__8 : rule__Facet__Group__8__Impl ;
	public final void rule__Facet__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:514:2: ( rule__Facet__Group__8__Impl )
			// InternalMyDsl.g:515:2: rule__Facet__Group__8__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Facet__Group__8__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__8"



	// $ANTLR start "rule__Facet__Group__8__Impl"
	// InternalMyDsl.g:521:1: rule__Facet__Group__8__Impl : ( 'endfacet' ) ;
	public final void rule__Facet__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:525:2: ( ( 'endfacet' ) )
			// InternalMyDsl.g:526:2: ( 'endfacet' )
			{
			// InternalMyDsl.g:526:2: ( 'endfacet' )
			// InternalMyDsl.g:527:2: 'endfacet'
			{
			 before(grammarAccess.getFacetAccess().getEndfacetKeyword_8()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getEndfacetKeyword_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__8__Impl"



	// $ANTLR start "rule__Vector__Group__0"
	// InternalMyDsl.g:537:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
	public final void rule__Vector__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:541:2: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
			// InternalMyDsl.g:542:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
			{
			pushFollow(FOLLOW_13);
			rule__Vector__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__0"



	// $ANTLR start "rule__Vector__Group__0__Impl"
	// InternalMyDsl.g:549:1: rule__Vector__Group__0__Impl : ( 'vertex' ) ;
	public final void rule__Vector__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:553:2: ( ( 'vertex' ) )
			// InternalMyDsl.g:554:2: ( 'vertex' )
			{
			// InternalMyDsl.g:554:2: ( 'vertex' )
			// InternalMyDsl.g:555:2: 'vertex'
			{
			 before(grammarAccess.getVectorAccess().getVertexKeyword_0()); 
			match(input,20,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getVertexKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__0__Impl"



	// $ANTLR start "rule__Vector__Group__1"
	// InternalMyDsl.g:564:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
	public final void rule__Vector__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:568:2: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
			// InternalMyDsl.g:569:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
			{
			pushFollow(FOLLOW_13);
			rule__Vector__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__1"



	// $ANTLR start "rule__Vector__Group__1__Impl"
	// InternalMyDsl.g:576:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__X1Assignment_1 ) ) ;
	public final void rule__Vector__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:580:2: ( ( ( rule__Vector__X1Assignment_1 ) ) )
			// InternalMyDsl.g:581:2: ( ( rule__Vector__X1Assignment_1 ) )
			{
			// InternalMyDsl.g:581:2: ( ( rule__Vector__X1Assignment_1 ) )
			// InternalMyDsl.g:582:2: ( rule__Vector__X1Assignment_1 )
			{
			 before(grammarAccess.getVectorAccess().getX1Assignment_1()); 
			// InternalMyDsl.g:583:2: ( rule__Vector__X1Assignment_1 )
			// InternalMyDsl.g:583:3: rule__Vector__X1Assignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Vector__X1Assignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getX1Assignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__1__Impl"



	// $ANTLR start "rule__Vector__Group__2"
	// InternalMyDsl.g:591:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
	public final void rule__Vector__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:595:2: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
			// InternalMyDsl.g:596:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
			{
			pushFollow(FOLLOW_13);
			rule__Vector__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__2"



	// $ANTLR start "rule__Vector__Group__2__Impl"
	// InternalMyDsl.g:603:1: rule__Vector__Group__2__Impl : ( ( rule__Vector__X2Assignment_2 ) ) ;
	public final void rule__Vector__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:607:2: ( ( ( rule__Vector__X2Assignment_2 ) ) )
			// InternalMyDsl.g:608:2: ( ( rule__Vector__X2Assignment_2 ) )
			{
			// InternalMyDsl.g:608:2: ( ( rule__Vector__X2Assignment_2 ) )
			// InternalMyDsl.g:609:2: ( rule__Vector__X2Assignment_2 )
			{
			 before(grammarAccess.getVectorAccess().getX2Assignment_2()); 
			// InternalMyDsl.g:610:2: ( rule__Vector__X2Assignment_2 )
			// InternalMyDsl.g:610:3: rule__Vector__X2Assignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Vector__X2Assignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getX2Assignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__2__Impl"



	// $ANTLR start "rule__Vector__Group__3"
	// InternalMyDsl.g:618:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl ;
	public final void rule__Vector__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:622:2: ( rule__Vector__Group__3__Impl )
			// InternalMyDsl.g:623:2: rule__Vector__Group__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Vector__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__3"



	// $ANTLR start "rule__Vector__Group__3__Impl"
	// InternalMyDsl.g:629:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__X3Assignment_3 ) ) ;
	public final void rule__Vector__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:633:2: ( ( ( rule__Vector__X3Assignment_3 ) ) )
			// InternalMyDsl.g:634:2: ( ( rule__Vector__X3Assignment_3 ) )
			{
			// InternalMyDsl.g:634:2: ( ( rule__Vector__X3Assignment_3 ) )
			// InternalMyDsl.g:635:2: ( rule__Vector__X3Assignment_3 )
			{
			 before(grammarAccess.getVectorAccess().getX3Assignment_3()); 
			// InternalMyDsl.g:636:2: ( rule__Vector__X3Assignment_3 )
			// InternalMyDsl.g:636:3: rule__Vector__X3Assignment_3
			{
			pushFollow(FOLLOW_2);
			rule__Vector__X3Assignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getX3Assignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__3__Impl"



	// $ANTLR start "rule__Normalvector__Group__0"
	// InternalMyDsl.g:645:1: rule__Normalvector__Group__0 : rule__Normalvector__Group__0__Impl rule__Normalvector__Group__1 ;
	public final void rule__Normalvector__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:649:2: ( rule__Normalvector__Group__0__Impl rule__Normalvector__Group__1 )
			// InternalMyDsl.g:650:2: rule__Normalvector__Group__0__Impl rule__Normalvector__Group__1
			{
			pushFollow(FOLLOW_13);
			rule__Normalvector__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Normalvector__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__0"



	// $ANTLR start "rule__Normalvector__Group__0__Impl"
	// InternalMyDsl.g:657:1: rule__Normalvector__Group__0__Impl : ( 'normal' ) ;
	public final void rule__Normalvector__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:661:2: ( ( 'normal' ) )
			// InternalMyDsl.g:662:2: ( 'normal' )
			{
			// InternalMyDsl.g:662:2: ( 'normal' )
			// InternalMyDsl.g:663:2: 'normal'
			{
			 before(grammarAccess.getNormalvectorAccess().getNormalKeyword_0()); 
			match(input,17,FOLLOW_2); 
			 after(grammarAccess.getNormalvectorAccess().getNormalKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__0__Impl"



	// $ANTLR start "rule__Normalvector__Group__1"
	// InternalMyDsl.g:672:1: rule__Normalvector__Group__1 : rule__Normalvector__Group__1__Impl rule__Normalvector__Group__2 ;
	public final void rule__Normalvector__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:676:2: ( rule__Normalvector__Group__1__Impl rule__Normalvector__Group__2 )
			// InternalMyDsl.g:677:2: rule__Normalvector__Group__1__Impl rule__Normalvector__Group__2
			{
			pushFollow(FOLLOW_13);
			rule__Normalvector__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Normalvector__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__1"



	// $ANTLR start "rule__Normalvector__Group__1__Impl"
	// InternalMyDsl.g:684:1: rule__Normalvector__Group__1__Impl : ( ( rule__Normalvector__X1Assignment_1 ) ) ;
	public final void rule__Normalvector__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:688:2: ( ( ( rule__Normalvector__X1Assignment_1 ) ) )
			// InternalMyDsl.g:689:2: ( ( rule__Normalvector__X1Assignment_1 ) )
			{
			// InternalMyDsl.g:689:2: ( ( rule__Normalvector__X1Assignment_1 ) )
			// InternalMyDsl.g:690:2: ( rule__Normalvector__X1Assignment_1 )
			{
			 before(grammarAccess.getNormalvectorAccess().getX1Assignment_1()); 
			// InternalMyDsl.g:691:2: ( rule__Normalvector__X1Assignment_1 )
			// InternalMyDsl.g:691:3: rule__Normalvector__X1Assignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Normalvector__X1Assignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalvectorAccess().getX1Assignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__1__Impl"



	// $ANTLR start "rule__Normalvector__Group__2"
	// InternalMyDsl.g:699:1: rule__Normalvector__Group__2 : rule__Normalvector__Group__2__Impl rule__Normalvector__Group__3 ;
	public final void rule__Normalvector__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:703:2: ( rule__Normalvector__Group__2__Impl rule__Normalvector__Group__3 )
			// InternalMyDsl.g:704:2: rule__Normalvector__Group__2__Impl rule__Normalvector__Group__3
			{
			pushFollow(FOLLOW_13);
			rule__Normalvector__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Normalvector__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__2"



	// $ANTLR start "rule__Normalvector__Group__2__Impl"
	// InternalMyDsl.g:711:1: rule__Normalvector__Group__2__Impl : ( ( rule__Normalvector__X2Assignment_2 ) ) ;
	public final void rule__Normalvector__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:715:2: ( ( ( rule__Normalvector__X2Assignment_2 ) ) )
			// InternalMyDsl.g:716:2: ( ( rule__Normalvector__X2Assignment_2 ) )
			{
			// InternalMyDsl.g:716:2: ( ( rule__Normalvector__X2Assignment_2 ) )
			// InternalMyDsl.g:717:2: ( rule__Normalvector__X2Assignment_2 )
			{
			 before(grammarAccess.getNormalvectorAccess().getX2Assignment_2()); 
			// InternalMyDsl.g:718:2: ( rule__Normalvector__X2Assignment_2 )
			// InternalMyDsl.g:718:3: rule__Normalvector__X2Assignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Normalvector__X2Assignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getNormalvectorAccess().getX2Assignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__2__Impl"



	// $ANTLR start "rule__Normalvector__Group__3"
	// InternalMyDsl.g:726:1: rule__Normalvector__Group__3 : rule__Normalvector__Group__3__Impl ;
	public final void rule__Normalvector__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:730:2: ( rule__Normalvector__Group__3__Impl )
			// InternalMyDsl.g:731:2: rule__Normalvector__Group__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Normalvector__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__3"



	// $ANTLR start "rule__Normalvector__Group__3__Impl"
	// InternalMyDsl.g:737:1: rule__Normalvector__Group__3__Impl : ( ( rule__Normalvector__X3Assignment_3 ) ) ;
	public final void rule__Normalvector__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:741:2: ( ( ( rule__Normalvector__X3Assignment_3 ) ) )
			// InternalMyDsl.g:742:2: ( ( rule__Normalvector__X3Assignment_3 ) )
			{
			// InternalMyDsl.g:742:2: ( ( rule__Normalvector__X3Assignment_3 ) )
			// InternalMyDsl.g:743:2: ( rule__Normalvector__X3Assignment_3 )
			{
			 before(grammarAccess.getNormalvectorAccess().getX3Assignment_3()); 
			// InternalMyDsl.g:744:2: ( rule__Normalvector__X3Assignment_3 )
			// InternalMyDsl.g:744:3: rule__Normalvector__X3Assignment_3
			{
			pushFollow(FOLLOW_2);
			rule__Normalvector__X3Assignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getNormalvectorAccess().getX3Assignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__Group__3__Impl"



	// $ANTLR start "rule__Solid__NameAssignment_1"
	// InternalMyDsl.g:753:1: rule__Solid__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__Solid__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:757:2: ( ( RULE_ID ) )
			// InternalMyDsl.g:758:2: ( RULE_ID )
			{
			// InternalMyDsl.g:758:2: ( RULE_ID )
			// InternalMyDsl.g:759:3: RULE_ID
			{
			 before(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__NameAssignment_1"



	// $ANTLR start "rule__Solid__FacetsAssignment_2"
	// InternalMyDsl.g:768:1: rule__Solid__FacetsAssignment_2 : ( ruleFacet ) ;
	public final void rule__Solid__FacetsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:772:2: ( ( ruleFacet ) )
			// InternalMyDsl.g:773:2: ( ruleFacet )
			{
			// InternalMyDsl.g:773:2: ( ruleFacet )
			// InternalMyDsl.g:774:3: ruleFacet
			{
			 before(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleFacet();
			state._fsp--;

			 after(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__FacetsAssignment_2"



	// $ANTLR start "rule__Facet__NormalAssignment_1"
	// InternalMyDsl.g:783:1: rule__Facet__NormalAssignment_1 : ( ruleNormalvector ) ;
	public final void rule__Facet__NormalAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:787:2: ( ( ruleNormalvector ) )
			// InternalMyDsl.g:788:2: ( ruleNormalvector )
			{
			// InternalMyDsl.g:788:2: ( ruleNormalvector )
			// InternalMyDsl.g:789:3: ruleNormalvector
			{
			 before(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleNormalvector();
			state._fsp--;

			 after(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__NormalAssignment_1"



	// $ANTLR start "rule__Facet__V1Assignment_4"
	// InternalMyDsl.g:798:1: rule__Facet__V1Assignment_4 : ( ruleVector ) ;
	public final void rule__Facet__V1Assignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:802:2: ( ( ruleVector ) )
			// InternalMyDsl.g:803:2: ( ruleVector )
			{
			// InternalMyDsl.g:803:2: ( ruleVector )
			// InternalMyDsl.g:804:3: ruleVector
			{
			 before(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0()); 
			pushFollow(FOLLOW_2);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__V1Assignment_4"



	// $ANTLR start "rule__Facet__V2Assignment_5"
	// InternalMyDsl.g:813:1: rule__Facet__V2Assignment_5 : ( ruleVector ) ;
	public final void rule__Facet__V2Assignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:817:2: ( ( ruleVector ) )
			// InternalMyDsl.g:818:2: ( ruleVector )
			{
			// InternalMyDsl.g:818:2: ( ruleVector )
			// InternalMyDsl.g:819:3: ruleVector
			{
			 before(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0()); 
			pushFollow(FOLLOW_2);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__V2Assignment_5"



	// $ANTLR start "rule__Facet__V3Assignment_6"
	// InternalMyDsl.g:828:1: rule__Facet__V3Assignment_6 : ( ruleVector ) ;
	public final void rule__Facet__V3Assignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:832:2: ( ( ruleVector ) )
			// InternalMyDsl.g:833:2: ( ruleVector )
			{
			// InternalMyDsl.g:833:2: ( ruleVector )
			// InternalMyDsl.g:834:3: ruleVector
			{
			 before(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0()); 
			pushFollow(FOLLOW_2);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__V3Assignment_6"



	// $ANTLR start "rule__Vector__X1Assignment_1"
	// InternalMyDsl.g:843:1: rule__Vector__X1Assignment_1 : ( RULE_FLOAT ) ;
	public final void rule__Vector__X1Assignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:847:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:848:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:848:2: ( RULE_FLOAT )
			// InternalMyDsl.g:849:3: RULE_FLOAT
			{
			 before(grammarAccess.getVectorAccess().getX1FLOATTerminalRuleCall_1_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getX1FLOATTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__X1Assignment_1"



	// $ANTLR start "rule__Vector__X2Assignment_2"
	// InternalMyDsl.g:858:1: rule__Vector__X2Assignment_2 : ( RULE_FLOAT ) ;
	public final void rule__Vector__X2Assignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:862:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:863:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:863:2: ( RULE_FLOAT )
			// InternalMyDsl.g:864:3: RULE_FLOAT
			{
			 before(grammarAccess.getVectorAccess().getX2FLOATTerminalRuleCall_2_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getX2FLOATTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__X2Assignment_2"



	// $ANTLR start "rule__Vector__X3Assignment_3"
	// InternalMyDsl.g:873:1: rule__Vector__X3Assignment_3 : ( RULE_FLOAT ) ;
	public final void rule__Vector__X3Assignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:877:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:878:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:878:2: ( RULE_FLOAT )
			// InternalMyDsl.g:879:3: RULE_FLOAT
			{
			 before(grammarAccess.getVectorAccess().getX3FLOATTerminalRuleCall_3_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getX3FLOATTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__X3Assignment_3"



	// $ANTLR start "rule__Normalvector__X1Assignment_1"
	// InternalMyDsl.g:888:1: rule__Normalvector__X1Assignment_1 : ( RULE_FLOAT ) ;
	public final void rule__Normalvector__X1Assignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:892:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:893:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:893:2: ( RULE_FLOAT )
			// InternalMyDsl.g:894:3: RULE_FLOAT
			{
			 before(grammarAccess.getNormalvectorAccess().getX1FLOATTerminalRuleCall_1_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getNormalvectorAccess().getX1FLOATTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__X1Assignment_1"



	// $ANTLR start "rule__Normalvector__X2Assignment_2"
	// InternalMyDsl.g:903:1: rule__Normalvector__X2Assignment_2 : ( RULE_FLOAT ) ;
	public final void rule__Normalvector__X2Assignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:907:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:908:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:908:2: ( RULE_FLOAT )
			// InternalMyDsl.g:909:3: RULE_FLOAT
			{
			 before(grammarAccess.getNormalvectorAccess().getX2FLOATTerminalRuleCall_2_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getNormalvectorAccess().getX2FLOATTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__X2Assignment_2"



	// $ANTLR start "rule__Normalvector__X3Assignment_3"
	// InternalMyDsl.g:918:1: rule__Normalvector__X3Assignment_3 : ( RULE_FLOAT ) ;
	public final void rule__Normalvector__X3Assignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:922:2: ( ( RULE_FLOAT ) )
			// InternalMyDsl.g:923:2: ( RULE_FLOAT )
			{
			// InternalMyDsl.g:923:2: ( RULE_FLOAT )
			// InternalMyDsl.g:924:3: RULE_FLOAT
			{
			 before(grammarAccess.getNormalvectorAccess().getX3FLOATTerminalRuleCall_3_0()); 
			match(input,RULE_FLOAT,FOLLOW_2); 
			 after(grammarAccess.getNormalvectorAccess().getX3FLOATTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Normalvector__X3Assignment_3"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
}
