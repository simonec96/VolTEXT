// Generated from VolText.g4 by ANTLR 4.9

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VolTextParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, NOTVAL=45, 
		UNIT=46, FORMATVAL=47, ORIENTATION=48, TXTATF=49, COLORVAL=50, ALIGNVAL=51, 
		TFVAL=52, POSVAL=53, NVAL=54, ENDLINE=55, ENDNLINE=56, O=57, A=58, C=59, 
		STRING=60, WS=61;
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_tvalue = 8, 
		RULE_figure = 9, RULE_elemd = 10, RULE_img = 11, RULE_imgattr = 12, RULE_imgElem = 13, 
		RULE_list = 14, RULE_listElem = 15, RULE_text = 16, RULE_txtattr = 17, 
		RULE_txtElem = 18, RULE_fitAttr = 19, RULE_imganumber = 20, RULE_idval = 21, 
		RULE_listattr = 22, RULE_txtval = 23, RULE_colorBullet = 24, RULE_color = 25, 
		RULE_positionv = 26, RULE_alignment = 27, RULE_pageattr = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
			"div", "tvalue", "figure", "elemd", "img", "imgattr", "imgElem", "list", 
			"listElem", "text", "txtattr", "txtElem", "fitAttr", "imganumber", "idval", 
			"listattr", "txtval", "colorBullet", "color", "positionv", "alignment", 
			"pageattr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'title:'", "'author:'", "'path:'", "'stylesheet'", "'@'", "'cross-point:'", 
			"'shape:\"'", "'RECTANGLE'", "'CIRCLE'", "'TRIANGLE'", "'fit-x'", "'fit-y'", 
			"':'", "'pos-x'", "'pos-y'", "'angle-rotation'", "'height'", "'width'", 
			"'p_height'", "'p_width'", "'ordered:'", "'bullet:'", "'font-family:'", 
			"'font-family-ttf:'", "'font-family-otf:'", "'font-size:'", "'colorT-bullet:'", 
			"'color-bullet:'", "'colorT:'", "'color:'", "'position:'", "'alignment:'", 
			"'orientation:'", "'oob:'", "'format:'", "'page'", "'div'", "'img'", 
			"'URL:'", "'list'", "'item:'", "'text'", "'string:'", "'id:'", "'-'", 
			null, null, null, null, null, null, null, null, null, "'\";'", "';'", 
			"':{'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NOTVAL", "UNIT", 
			"FORMATVAL", "ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", "TFVAL", 
			"POSVAL", "NVAL", "ENDLINE", "ENDNLINE", "O", "A", "C", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VolTextParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PdfContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(VolTextParser.A, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<PdfattrContext> pdfattr() {
			return getRuleContexts(PdfattrContext.class);
		}
		public PdfattrContext pdfattr(int i) {
			return getRuleContext(PdfattrContext.class,i);
		}
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public PdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdfContext pdf() throws RecognitionException {
		PdfContext _localctx = new PdfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pdf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(A);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(59);
				pdfattr();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(65);
				stylesheet();
				}
			}

			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				page();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 );
			setState(73);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PdfattrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public PdfattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdfattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPdfattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPdfattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPdfattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdfattrContext pdfattr() throws RecognitionException {
		PdfattrContext _localctx = new PdfattrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pdfattr);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__0);
				setState(76);
				match(STRING);
				setState(77);
				match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__1);
				setState(79);
				match(STRING);
				setState(80);
				match(ENDNLINE);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__2);
				setState(82);
				match(STRING);
				setState(83);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__3);
			setState(87);
			match(O);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(88);
				element();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<AttrStyleContext> attrStyle() {
			return getRuleContexts(AttrStyleContext.class);
		}
		public AttrStyleContext attrStyle(int i) {
			return getRuleContext(AttrStyleContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
			match(STRING);
			setState(98);
			match(O);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(99);
				attrStyle();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrStyleContext extends ParserRuleContext {
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode NOTVAL() { return getToken(VolTextParser.NOTVAL, 0); }
		public TerminalNode UNIT() { return getToken(VolTextParser.UNIT, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode TXTATF() { return getToken(VolTextParser.TXTATF, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
		public TerminalNode ALIGNVAL() { return getToken(VolTextParser.ALIGNVAL, 0); }
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
		public AttrStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterAttrStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitAttrStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitAttrStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrStyleContext attrStyle() throws RecognitionException {
		AttrStyleContext _localctx = new AttrStyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attrStyle);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__5);
				setState(108);
				match(NVAL);
				setState(109);
				match(ENDNLINE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__6);
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				match(ENDLINE);
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				match(T__12);
				setState(115);
				match(TFVAL);
				setState(116);
				match(ENDNLINE);
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(T__12);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(119);
					match(NOTVAL);
					}
				}

				setState(122);
				match(NVAL);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(123);
					match(UNIT);
					}
				}

				setState(126);
				match(ENDNLINE);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(T__15);
				setState(128);
				match(T__12);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(129);
					match(NOTVAL);
					}
				}

				setState(132);
				match(NVAL);
				setState(133);
				match(ENDNLINE);
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				match(T__12);
				setState(136);
				match(NVAL);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(137);
					match(UNIT);
					}
				}

				setState(140);
				match(ENDNLINE);
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				match(T__12);
				setState(143);
				match(NVAL);
				setState(144);
				match(ENDNLINE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(T__20);
				setState(146);
				match(TFVAL);
				setState(147);
				match(ENDNLINE);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				match(T__21);
				setState(149);
				match(STRING);
				setState(150);
				match(ENDNLINE);
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				match(STRING);
				setState(153);
				match(ENDNLINE);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				match(T__25);
				setState(155);
				match(NVAL);
				setState(156);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				match(TXTATF);
				setState(158);
				match(T__12);
				setState(159);
				match(TFVAL);
				setState(160);
				match(ENDNLINE);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 13);
				{
				setState(161);
				match(T__26);
				setState(162);
				match(STRING);
				setState(163);
				match(ENDNLINE);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 14);
				{
				setState(164);
				match(T__27);
				setState(165);
				match(COLORVAL);
				setState(166);
				match(ENDNLINE);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 15);
				{
				setState(167);
				match(T__28);
				setState(168);
				match(STRING);
				setState(169);
				match(ENDNLINE);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 16);
				{
				setState(170);
				match(T__29);
				setState(171);
				match(COLORVAL);
				setState(172);
				match(ENDNLINE);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 17);
				{
				setState(173);
				match(T__30);
				setState(174);
				match(POSVAL);
				setState(175);
				match(ENDNLINE);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 18);
				{
				setState(176);
				match(T__31);
				setState(177);
				match(ALIGNVAL);
				setState(178);
				match(ENDLINE);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 19);
				{
				setState(179);
				match(T__32);
				setState(180);
				match(ORIENTATION);
				setState(181);
				match(ENDNLINE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 20);
				{
				setState(182);
				match(T__33);
				setState(183);
				match(TFVAL);
				setState(184);
				match(ENDNLINE);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 21);
				{
				setState(185);
				match(T__34);
				setState(186);
				match(FORMATVAL);
				setState(187);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<PageattrContext> pageattr() {
			return getRuleContexts(PageattrContext.class);
		}
		public PageattrContext pageattr(int i) {
			return getRuleContext(PageattrContext.class,i);
		}
		public List<PaeContext> pae() {
			return getRuleContexts(PaeContext.class);
		}
		public PaeContext pae(int i) {
			return getRuleContext(PaeContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__35);
			setState(191);
			match(O);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__43))) != 0)) {
				{
				{
				setState(192);
				pageattr();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41))) != 0)) {
				{
				{
				setState(198);
				pae();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaeContext extends ParserRuleContext {
		public ElemdContext elemd() {
			return getRuleContext(ElemdContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public PaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaeContext pae() throws RecognitionException {
		PaeContext _localctx = new PaeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pae);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__39:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				elemd();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				div();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<IdvalContext> idval() {
			return getRuleContexts(IdvalContext.class);
		}
		public IdvalContext idval(int i) {
			return getRuleContext(IdvalContext.class,i);
		}
		public List<ImganumberContext> imganumber() {
			return getRuleContexts(ImganumberContext.class);
		}
		public ImganumberContext imganumber(int i) {
			return getRuleContext(ImganumberContext.class,i);
		}
		public List<ElemdContext> elemd() {
			return getRuleContexts(ElemdContext.class);
		}
		public ElemdContext elemd(int i) {
			return getRuleContext(ElemdContext.class,i);
		}
		public List<PositionvContext> positionv() {
			return getRuleContexts(PositionvContext.class);
		}
		public PositionvContext positionv(int i) {
			return getRuleContext(PositionvContext.class,i);
		}
		public List<FitAttrContext> fitAttr() {
			return getRuleContexts(FitAttrContext.class);
		}
		public FitAttrContext fitAttr(int i) {
			return getRuleContext(FitAttrContext.class,i);
		}
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public List<TvalueContext> tvalue() {
			return getRuleContexts(TvalueContext.class);
		}
		public TvalueContext tvalue(int i) {
			return getRuleContext(TvalueContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__36);
			setState(211);
			match(O);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__43))) != 0)) {
				{
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
				case T__29:
					{
					setState(212);
					color();
					}
					break;
				case T__43:
					{
					setState(213);
					idval();
					}
					break;
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
					{
					setState(214);
					imganumber();
					}
					break;
				case T__37:
				case T__39:
				case T__41:
					{
					setState(215);
					elemd();
					}
					break;
				case T__30:
					{
					setState(216);
					positionv();
					}
					break;
				case T__10:
				case T__11:
					{
					setState(217);
					fitAttr();
					}
					break;
				case T__6:
					{
					setState(218);
					figure();
					}
					break;
				case T__5:
					{
					setState(219);
					tvalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TvalueContext extends ParserRuleContext {
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvalueContext tvalue() throws RecognitionException {
		TvalueContext _localctx = new TvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__5);
			setState(228);
			match(NVAL);
			setState(229);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FigureContext extends ParserRuleContext {
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_figure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__6);
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(233);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemdContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public ElemdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterElemd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitElemd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitElemd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemdContext elemd() throws RecognitionException {
		ElemdContext _localctx = new ElemdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elemd);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				text();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				list();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				img();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImgContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public ImgElemContext imgElem() {
			return getRuleContext(ImgElemContext.class,0);
		}
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ImgattrContext> imgattr() {
			return getRuleContexts(ImgattrContext.class);
		}
		public ImgattrContext imgattr(int i) {
			return getRuleContext(ImgattrContext.class,i);
		}
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__37);
			setState(241);
			match(O);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__43))) != 0)) {
				{
				{
				setState(242);
				imgattr();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			imgElem();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__43))) != 0)) {
				{
				{
				setState(249);
				imgattr();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImgattrContext extends ParserRuleContext {
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public ImgattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImgattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImgattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImgattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgattrContext imgattr() throws RecognitionException {
		ImgattrContext _localctx = new ImgattrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imgattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				{
				setState(257);
				idval();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				{
				setState(258);
				imganumber();
				}
				break;
			case T__30:
				{
				setState(259);
				positionv();
				}
				break;
			case T__10:
			case T__11:
				{
				setState(260);
				fitAttr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImgElemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public ImgElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImgElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImgElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImgElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElemContext imgElem() throws RecognitionException {
		ImgElemContext _localctx = new ImgElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__38);
			setState(264);
			match(STRING);
			setState(265);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ListattrContext> listattr() {
			return getRuleContexts(ListattrContext.class);
		}
		public ListattrContext listattr(int i) {
			return getRuleContext(ListattrContext.class,i);
		}
		public List<ListElemContext> listElem() {
			return getRuleContexts(ListElemContext.class);
		}
		public ListElemContext listElem(int i) {
			return getRuleContext(ListElemContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__39);
			setState(268);
			match(O);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__40) | (1L << T__43) | (1L << TXTATF))) != 0)) {
				{
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__43:
				case TXTATF:
					{
					setState(269);
					listattr();
					}
					break;
				case T__40:
					{
					setState(270);
					listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListElemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public ListElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterListElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitListElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitListElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElemContext listElem() throws RecognitionException {
		ListElemContext _localctx = new ListElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__40);
			setState(279);
			match(STRING);
			setState(280);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<TxtattrContext> txtattr() {
			return getRuleContexts(TxtattrContext.class);
		}
		public TxtattrContext txtattr(int i) {
			return getRuleContext(TxtattrContext.class,i);
		}
		public List<TxtElemContext> txtElem() {
			return getRuleContexts(TxtElemContext.class);
		}
		public TxtElemContext txtElem(int i) {
			return getRuleContext(TxtElemContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__41);
			setState(283);
			match(O);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					txtattr();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					txtElem();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					txtattr();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(302);
				txtElem();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(308);
				txtattr();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TxtattrContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public TxtattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtattrContext txtattr() throws RecognitionException {
		TxtattrContext _localctx = new TxtattrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_txtattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
				{
				setState(316);
				color();
				}
				break;
			case T__43:
				{
				setState(317);
				idval();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				{
				setState(318);
				imganumber();
				}
				break;
			case T__30:
				{
				setState(319);
				positionv();
				}
				break;
			case T__31:
				{
				setState(320);
				alignment();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case TXTATF:
				{
				setState(321);
				txtval();
				}
				break;
			case T__10:
			case T__11:
				{
				setState(322);
				fitAttr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TxtElemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TxtElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtElemContext txtElem() throws RecognitionException {
		TxtElemContext _localctx = new TxtElemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__42);
			setState(326);
			match(STRING);
			setState(327);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FitAttrContext extends ParserRuleContext {
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public FitAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fitAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterFitAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitFitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitFitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FitAttrContext fitAttr() throws RecognitionException {
		FitAttrContext _localctx = new FitAttrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fitAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(330);
			match(T__12);
			setState(331);
			match(TFVAL);
			setState(332);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImganumberContext extends ParserRuleContext {
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NOTVAL() { return getToken(VolTextParser.NOTVAL, 0); }
		public TerminalNode UNIT() { return getToken(VolTextParser.UNIT, 0); }
		public ImganumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imganumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImganumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImganumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImganumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImganumberContext imganumber() throws RecognitionException {
		ImganumberContext _localctx = new ImganumberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_imganumber);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				match(T__12);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(336);
					match(NOTVAL);
					}
				}

				setState(339);
				match(NVAL);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(340);
					match(UNIT);
					}
				}

				setState(343);
				match(ENDNLINE);
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(345);
				match(T__12);
				setState(346);
				match(NVAL);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(347);
					match(UNIT);
					}
				}

				setState(350);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdvalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public IdvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterIdval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitIdval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitIdval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdvalContext idval() throws RecognitionException {
		IdvalContext _localctx = new IdvalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__43);
			setState(354);
			match(STRING);
			setState(355);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListattrContext extends ParserRuleContext {
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ColorBulletContext colorBullet() {
			return getRuleContext(ColorBulletContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public ListattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterListattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitListattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitListattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListattrContext listattr() throws RecognitionException {
		ListattrContext _localctx = new ListattrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listattr);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__20);
				setState(358);
				match(TFVAL);
				setState(359);
				match(ENDNLINE);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(T__21);
				setState(361);
				match(STRING);
				setState(362);
				match(ENDNLINE);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				idval();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				imganumber();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case TXTATF:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				txtval();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
				positionv();
				}
				break;
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				color();
				}
				break;
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(368);
				colorBullet();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(369);
				fitAttr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TxtvalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode TXTATF() { return getToken(VolTextParser.TXTATF, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TxtvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtvalContext txtval() throws RecognitionException {
		TxtvalContext _localctx = new TxtvalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_txtval);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				match(STRING);
				setState(374);
				match(ENDNLINE);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__25);
				setState(376);
				match(NVAL);
				setState(377);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(TXTATF);
				setState(379);
				match(T__12);
				setState(380);
				match(TFVAL);
				setState(381);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorBulletContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public ColorBulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorBullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterColorBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitColorBullet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitColorBullet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorBulletContext colorBullet() throws RecognitionException {
		ColorBulletContext _localctx = new ColorBulletContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_colorBullet);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__26);
				setState(385);
				match(STRING);
				setState(386);
				match(ENDNLINE);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__27);
				setState(388);
				match(COLORVAL);
				setState(389);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_color);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(T__28);
				setState(393);
				match(STRING);
				setState(394);
				match(ENDNLINE);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__29);
				setState(396);
				match(COLORVAL);
				setState(397);
				match(ENDNLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionvContext extends ParserRuleContext {
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public PositionvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPositionv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPositionv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPositionv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionvContext positionv() throws RecognitionException {
		PositionvContext _localctx = new PositionvContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__30);
			setState(401);
			match(POSVAL);
			setState(402);
			match(ENDNLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode ALIGNVAL() { return getToken(VolTextParser.ALIGNVAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__31);
			setState(405);
			match(ALIGNVAL);
			setState(406);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PageattrContext extends ParserRuleContext {
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public PageattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPageattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPageattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPageattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageattrContext pageattr() throws RecognitionException {
		PageattrContext _localctx = new PageattrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pageattr);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(T__32);
				setState(409);
				match(ORIENTATION);
				setState(410);
				match(ENDNLINE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__33);
				setState(412);
				match(TFVAL);
				setState(413);
				match(ENDNLINE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(T__19);
				setState(415);
				match(T__12);
				setState(416);
				match(NVAL);
				setState(417);
				match(ENDNLINE);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(T__18);
				setState(419);
				match(T__12);
				setState(420);
				match(NVAL);
				setState(421);
				match(ENDNLINE);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				match(T__34);
				setState(423);
				match(FORMATVAL);
				setState(424);
				match(ENDNLINE);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				idval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u01af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\5\6\177\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\3\7\3\7"+
		"\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\7\7\7\u00ca\n\7\f\7\16\7\u00cd"+
		"\13\7\3\7\3\7\3\b\3\b\5\b\u00d3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00df\n\t\f\t\16\t\u00e2\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00f1\n\f\3\r\3\r\3\r\7\r\u00f6\n\r\f"+
		"\r\16\r\u00f9\13\r\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16\u0108\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u0120\n\22\f\22\16\22\u0123\13\22\3\22\7\22"+
		"\u0126\n\22\f\22\16\22\u0129\13\22\3\22\7\22\u012c\n\22\f\22\16\22\u012f"+
		"\13\22\3\22\7\22\u0132\n\22\f\22\16\22\u0135\13\22\3\22\7\22\u0138\n\22"+
		"\f\22\16\22\u013b\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0146\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u0154\n\26\3\26\3\26\5\26\u0158\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u015f\n\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0175\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0181\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0189\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0191\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01ad\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:\2\t\3\2\n\f\3\2\r\16\3\2\20\21\3\2\23\24\3"+
		"\2\25\26\3\2\31\33\3\2\20\22\2\u01e4\2<\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2"+
		"\bb\3\2\2\2\n\u00be\3\2\2\2\f\u00c0\3\2\2\2\16\u00d2\3\2\2\2\20\u00d4"+
		"\3\2\2\2\22\u00e5\3\2\2\2\24\u00e9\3\2\2\2\26\u00f0\3\2\2\2\30\u00f2\3"+
		"\2\2\2\32\u0107\3\2\2\2\34\u0109\3\2\2\2\36\u010d\3\2\2\2 \u0118\3\2\2"+
		"\2\"\u011c\3\2\2\2$\u0145\3\2\2\2&\u0147\3\2\2\2(\u014b\3\2\2\2*\u0161"+
		"\3\2\2\2,\u0163\3\2\2\2.\u0174\3\2\2\2\60\u0180\3\2\2\2\62\u0188\3\2\2"+
		"\2\64\u0190\3\2\2\2\66\u0192\3\2\2\28\u0196\3\2\2\2:\u01ac\3\2\2\2<@\7"+
		"<\2\2=?\5\4\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2CE\5\6\4\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\f\7\2GF\3\2\2\2HI\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7=\2\2L\3\3\2\2\2MN\7\3\2\2NO\7"+
		">\2\2OW\7:\2\2PQ\7\4\2\2QR\7>\2\2RW\7:\2\2ST\7\5\2\2TU\7>\2\2UW\7:\2\2"+
		"VM\3\2\2\2VP\3\2\2\2VS\3\2\2\2W\5\3\2\2\2XY\7\6\2\2Y]\7;\2\2Z\\\5\b\5"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7=\2"+
		"\2a\7\3\2\2\2bc\7\7\2\2cd\7>\2\2dh\7;\2\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7=\2\2l\t\3\2\2\2mn\7\b\2"+
		"\2no\78\2\2o\u00bf\7:\2\2pq\7\t\2\2qr\t\2\2\2r\u00bf\79\2\2st\t\3\2\2"+
		"tu\7\17\2\2uv\7\66\2\2v\u00bf\7:\2\2wx\t\4\2\2xz\7\17\2\2y{\7/\2\2zy\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2|~\78\2\2}\177\7\60\2\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u00bf\7:\2\2\u0081\u0082\7\22\2\2\u0082\u0084"+
		"\7\17\2\2\u0083\u0085\7/\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\78\2\2\u0087\u00bf\7:\2\2\u0088\u0089\t\5\2"+
		"\2\u0089\u008a\7\17\2\2\u008a\u008c\78\2\2\u008b\u008d\7\60\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00bf\7:"+
		"\2\2\u008f\u0090\t\6\2\2\u0090\u0091\7\17\2\2\u0091\u0092\78\2\2\u0092"+
		"\u00bf\7:\2\2\u0093\u0094\7\27\2\2\u0094\u0095\7\66\2\2\u0095\u00bf\7"+
		":\2\2\u0096\u0097\7\30\2\2\u0097\u0098\7>\2\2\u0098\u00bf\7:\2\2\u0099"+
		"\u009a\t\7\2\2\u009a\u009b\7>\2\2\u009b\u00bf\7:\2\2\u009c\u009d\7\34"+
		"\2\2\u009d\u009e\78\2\2\u009e\u00bf\7:\2\2\u009f\u00a0\7\63\2\2\u00a0"+
		"\u00a1\7\17\2\2\u00a1\u00a2\7\66\2\2\u00a2\u00bf\7:\2\2\u00a3\u00a4\7"+
		"\35\2\2\u00a4\u00a5\7>\2\2\u00a5\u00bf\7:\2\2\u00a6\u00a7\7\36\2\2\u00a7"+
		"\u00a8\7\64\2\2\u00a8\u00bf\7:\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\7"+
		">\2\2\u00ab\u00bf\7:\2\2\u00ac\u00ad\7 \2\2\u00ad\u00ae\7\64\2\2\u00ae"+
		"\u00bf\7:\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\67\2\2\u00b1\u00bf\7:\2"+
		"\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00bf\79\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00bf\7:\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		"\u00ba\7\66\2\2\u00ba\u00bf\7:\2\2\u00bb\u00bc\7%\2\2\u00bc\u00bd\7\61"+
		"\2\2\u00bd\u00bf\7:\2\2\u00bem\3\2\2\2\u00bep\3\2\2\2\u00bes\3\2\2\2\u00be"+
		"w\3\2\2\2\u00be\u0081\3\2\2\2\u00be\u0088\3\2\2\2\u00be\u008f\3\2\2\2"+
		"\u00be\u0093\3\2\2\2\u00be\u0096\3\2\2\2\u00be\u0099\3\2\2\2\u00be\u009c"+
		"\3\2\2\2\u00be\u009f\3\2\2\2\u00be\u00a3\3\2\2\2\u00be\u00a6\3\2\2\2\u00be"+
		"\u00a9\3\2\2\2\u00be\u00ac\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b2\3\2"+
		"\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf"+
		"\13\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c5\7;\2\2\u00c2\u00c4\5:\36\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\16\b\2"+
		"\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf"+
		"\r\3\2\2\2\u00d0\u00d3\5\26\f\2\u00d1\u00d3\5\20\t\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5\u00e0"+
		"\7;\2\2\u00d6\u00df\5\64\33\2\u00d7\u00df\5,\27\2\u00d8\u00df\5*\26\2"+
		"\u00d9\u00df\5\26\f\2\u00da\u00df\5\66\34\2\u00db\u00df\5(\25\2\u00dc"+
		"\u00df\5\24\13\2\u00dd\u00df\5\22\n\2\u00de\u00d6\3\2\2\2\u00de\u00d7"+
		"\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4\21\3\2\2\2\u00e5\u00e6\7\b\2\2"+
		"\u00e6\u00e7\78\2\2\u00e7\u00e8\7:\2\2\u00e8\23\3\2\2\2\u00e9\u00ea\7"+
		"\t\2\2\u00ea\u00eb\t\2\2\2\u00eb\u00ec\79\2\2\u00ec\25\3\2\2\2\u00ed\u00f1"+
		"\5\"\22\2\u00ee\u00f1\5\36\20\2\u00ef\u00f1\5\30\r\2\u00f0\u00ed\3\2\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f3"+
		"\7(\2\2\u00f3\u00f7\7;\2\2\u00f4\u00f6\5\32\16\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\5\34\17\2\u00fb\u00fd\5\32\16\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7=\2\2\u0102"+
		"\31\3\2\2\2\u0103\u0108\5,\27\2\u0104\u0108\5*\26\2\u0105\u0108\5\66\34"+
		"\2\u0106\u0108\5(\25\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108\33\3\2\2\2\u0109\u010a\7)\2\2\u010a"+
		"\u010b\7>\2\2\u010b\u010c\7:\2\2\u010c\35\3\2\2\2\u010d\u010e\7*\2\2\u010e"+
		"\u0113\7;\2\2\u010f\u0112\5.\30\2\u0110\u0112\5 \21\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7="+
		"\2\2\u0117\37\3\2\2\2\u0118\u0119\7+\2\2\u0119\u011a\7>\2\2\u011a\u011b"+
		"\7:\2\2\u011b!\3\2\2\2\u011c\u011d\7,\2\2\u011d\u0121\7;\2\2\u011e\u0120"+
		"\5$\23\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0127\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\5&"+
		"\24\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5$"+
		"\23\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0133\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\5&"+
		"\24\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0139\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\5$"+
		"\23\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7="+
		"\2\2\u013d#\3\2\2\2\u013e\u0146\5\64\33\2\u013f\u0146\5,\27\2\u0140\u0146"+
		"\5*\26\2\u0141\u0146\5\66\34\2\u0142\u0146\58\35\2\u0143\u0146\5\60\31"+
		"\2\u0144\u0146\5(\25\2\u0145\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0140"+
		"\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146%\3\2\2\2\u0147\u0148\7-\2\2\u0148\u0149\7>\2\2\u0149"+
		"\u014a\7:\2\2\u014a\'\3\2\2\2\u014b\u014c\t\3\2\2\u014c\u014d\7\17\2\2"+
		"\u014d\u014e\7\66\2\2\u014e\u014f\7:\2\2\u014f)\3\2\2\2\u0150\u0151\t"+
		"\b\2\2\u0151\u0153\7\17\2\2\u0152\u0154\7/\2\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\78\2\2\u0156\u0158\7\60"+
		"\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0162\7:\2\2\u015a\u015b\t\5\2\2\u015b\u015c\7\17\2\2\u015c\u015e\78"+
		"\2\2\u015d\u015f\7\60\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\7:\2\2\u0161\u0150\3\2\2\2\u0161\u015a\3\2"+
		"\2\2\u0162+\3\2\2\2\u0163\u0164\7.\2\2\u0164\u0165\7>\2\2\u0165\u0166"+
		"\7:\2\2\u0166-\3\2\2\2\u0167\u0168\7\27\2\2\u0168\u0169\7\66\2\2\u0169"+
		"\u0175\7:\2\2\u016a\u016b\7\30\2\2\u016b\u016c\7>\2\2\u016c\u0175\7:\2"+
		"\2\u016d\u0175\5,\27\2\u016e\u0175\5*\26\2\u016f\u0175\5\60\31\2\u0170"+
		"\u0175\5\66\34\2\u0171\u0175\5\64\33\2\u0172\u0175\5\62\32\2\u0173\u0175"+
		"\5(\25\2\u0174\u0167\3\2\2\2\u0174\u016a\3\2\2\2\u0174\u016d\3\2\2\2\u0174"+
		"\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0171\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175/\3\2\2\2\u0176\u0177"+
		"\t\7\2\2\u0177\u0178\7>\2\2\u0178\u0181\7:\2\2\u0179\u017a\7\34\2\2\u017a"+
		"\u017b\78\2\2\u017b\u0181\7:\2\2\u017c\u017d\7\63\2\2\u017d\u017e\7\17"+
		"\2\2\u017e\u017f\7\66\2\2\u017f\u0181\7:\2\2\u0180\u0176\3\2\2\2\u0180"+
		"\u0179\3\2\2\2\u0180\u017c\3\2\2\2\u0181\61\3\2\2\2\u0182\u0183\7\35\2"+
		"\2\u0183\u0184\7>\2\2\u0184\u0189\7:\2\2\u0185\u0186\7\36\2\2\u0186\u0187"+
		"\7\64\2\2\u0187\u0189\7:\2\2\u0188\u0182\3\2\2\2\u0188\u0185\3\2\2\2\u0189"+
		"\63\3\2\2\2\u018a\u018b\7\37\2\2\u018b\u018c\7>\2\2\u018c\u0191\7:\2\2"+
		"\u018d\u018e\7 \2\2\u018e\u018f\7\64\2\2\u018f\u0191\7:\2\2\u0190\u018a"+
		"\3\2\2\2\u0190\u018d\3\2\2\2\u0191\65\3\2\2\2\u0192\u0193\7!\2\2\u0193"+
		"\u0194\7\67\2\2\u0194\u0195\7:\2\2\u0195\67\3\2\2\2\u0196\u0197\7\"\2"+
		"\2\u0197\u0198\7\65\2\2\u0198\u0199\79\2\2\u01999\3\2\2\2\u019a\u019b"+
		"\7#\2\2\u019b\u019c\7\62\2\2\u019c\u01ad\7:\2\2\u019d\u019e\7$\2\2\u019e"+
		"\u019f\7\66\2\2\u019f\u01ad\7:\2\2\u01a0\u01a1\7\26\2\2\u01a1\u01a2\7"+
		"\17\2\2\u01a2\u01a3\78\2\2\u01a3\u01ad\7:\2\2\u01a4\u01a5\7\25\2\2\u01a5"+
		"\u01a6\7\17\2\2\u01a6\u01a7\78\2\2\u01a7\u01ad\7:\2\2\u01a8\u01a9\7%\2"+
		"\2\u01a9\u01aa\7\61\2\2\u01aa\u01ad\7:\2\2\u01ab\u01ad\5,\27\2\u01ac\u019a"+
		"\3\2\2\2\u01ac\u019d\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac"+
		"\u01a8\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad;\3\2\2\2\'@DIV]hz~\u0084\u008c"+
		"\u00be\u00c5\u00cb\u00d2\u00de\u00e0\u00f0\u00f7\u00fe\u0107\u0111\u0113"+
		"\u0121\u0127\u012d\u0133\u0139\u0145\u0153\u0157\u015e\u0161\u0174\u0180"+
		"\u0188\u0190\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}