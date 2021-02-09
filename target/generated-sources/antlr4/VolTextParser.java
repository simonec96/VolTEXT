// Generated from VolText.g4 by ANTLR 4.9
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
		T__17=18, T__18=19, TXTATF=20, COLORVAL=21, SVAL=22, TFVAL=23, IMGANUMBER=24, 
		POSVAL=25, NVAL=26, ENDLINE=27, ENDNLINE=28, O=29, A=30, C=31, SPECIALC=32, 
		STRING=33, URL=34, URL2=35, VAL=36, WS=37;
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_divae = 8, 
		RULE_elemd = 9, RULE_img = 10, RULE_imgElem = 11, RULE_text = 12, RULE_txtElem = 13, 
		RULE_list = 14, RULE_lae = 15, RULE_listElem = 16, RULE_pageattr = 17, 
		RULE_divattr = 18, RULE_listattr = 19, RULE_txtattr = 20, RULE_imgattr = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
			"div", "divae", "elemd", "img", "imgElem", "text", "txtElem", "list", 
			"lae", "listElem", "pageattr", "divattr", "listattr", "txtattr", "imgattr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'title:'", "'author:\"'", "'stylesheet'", "'page'", "'div'", "'img'", 
			"'URL:\"'", "'text'", "'Text:'", "'list'", "'item:'", "'id:\"'", "'angle-rotation:'", 
			"':'", "'ordered:'", "'font-family:\"'", "'font-size'", "'color:'", "'position:'", 
			null, null, null, null, null, null, null, "'\";'", "';'", "':{'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TXTATF", "COLORVAL", 
			"SVAL", "TFVAL", "IMGANUMBER", "POSVAL", "NVAL", "ENDLINE", "ENDNLINE", 
			"O", "A", "C", "SPECIALC", "STRING", "URL", "URL2", "VAL", "WS"
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
			setState(44);
			match(A);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(45);
				pdfattr();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(51);
				stylesheet();
				}
			}

			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				page();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(59);
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
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__0);
				setState(62);
				match(VAL);
				setState(63);
				match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__1);
				setState(65);
				match(VAL);
				setState(66);
				match(ENDLINE);
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
			setState(69);
			match(T__2);
			setState(70);
			match(O);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL) {
				{
				{
				setState(71);
				element();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
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
			setState(79);
			match(VAL);
			setState(80);
			match(O);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << TXTATF) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(81);
				attrStyle();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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
		public ImgattrContext imgattr() {
			return getRuleContext(ImgattrContext.class,0);
		}
		public TxtattrContext txtattr() {
			return getRuleContext(TxtattrContext.class,0);
		}
		public ListattrContext listattr() {
			return getRuleContext(ListattrContext.class,0);
		}
		public DivattrContext divattr() {
			return getRuleContext(DivattrContext.class,0);
		}
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
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				imgattr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				txtattr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				listattr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				divattr();
				}
				break;
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
			setState(95);
			match(T__3);
			setState(96);
			match(O);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(97);
				pae();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
		public PageattrContext pageattr() {
			return getRuleContext(PageattrContext.class,0);
		}
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				pageattr();
				}
				break;
			case T__5:
			case T__7:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				elemd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
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
		public List<DivaeContext> divae() {
			return getRuleContexts(DivaeContext.class);
		}
		public DivaeContext divae(int i) {
			return getRuleContext(DivaeContext.class,i);
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
			setState(110);
			match(T__4);
			setState(111);
			match(O);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(112);
				divae();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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

	public static class DivaeContext extends ParserRuleContext {
		public DivattrContext divattr() {
			return getRuleContext(DivattrContext.class,0);
		}
		public ElemdContext elemd() {
			return getRuleContext(ElemdContext.class,0);
		}
		public DivaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterDivae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitDivae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitDivae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivaeContext divae() throws RecognitionException {
		DivaeContext _localctx = new DivaeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_divae);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case IMGANUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				divattr();
				}
				break;
			case T__5:
			case T__7:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				elemd();
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
		enterRule(_localctx, 18, RULE_elemd);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				text();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				list();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		enterRule(_localctx, 20, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__5);
			setState(130);
			match(O);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__18) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(131);
				imgattr();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			imgElem();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__18) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(138);
				imgattr();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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

	public static class ImgElemContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(VolTextParser.URL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
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
		enterRule(_localctx, 22, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__6);
			setState(147);
			match(URL);
			setState(148);
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<TxtattrContext> txtattr() {
			return getRuleContexts(TxtattrContext.class);
		}
		public TxtattrContext txtattr(int i) {
			return getRuleContext(TxtattrContext.class,i);
		}
		public TxtElemContext txtElem() {
			return getRuleContext(TxtElemContext.class,0);
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
		enterRule(_localctx, 24, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__7);
			setState(151);
			match(O);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					txtattr();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(158);
				txtElem();
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << TXTATF) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(161);
				txtattr();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
		enterRule(_localctx, 26, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			setState(170);
			match(STRING);
			setState(171);
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
		public List<LaeContext> lae() {
			return getRuleContexts(LaeContext.class);
		}
		public LaeContext lae(int i) {
			return getRuleContext(LaeContext.class,i);
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
			setState(173);
			match(T__9);
			setState(174);
			match(O);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << TXTATF) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(175);
				lae();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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

	public static class LaeContext extends ParserRuleContext {
		public ListattrContext listattr() {
			return getRuleContext(ListattrContext.class,0);
		}
		public ListElemContext listElem() {
			return getRuleContext(ListElemContext.class,0);
		}
		public LaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterLae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitLae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitLae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaeContext lae() throws RecognitionException {
		LaeContext _localctx = new LaeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lae);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case TXTATF:
			case IMGANUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				listattr();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				listElem();
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
		enterRule(_localctx, 32, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__10);
			setState(188);
			match(STRING);
			setState(189);
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

	public static class PageattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
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
		enterRule(_localctx, 34, RULE_pageattr);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__11);
				setState(192);
				match(VAL);
				setState(193);
				match(ENDLINE);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__12);
				setState(195);
				match(NVAL);
				setState(196);
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

	public static class DivattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode IMGANUMBER() { return getToken(VolTextParser.IMGANUMBER, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public DivattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterDivattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitDivattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitDivattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivattrContext divattr() throws RecognitionException {
		DivattrContext _localctx = new DivattrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_divattr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__11);
				setState(200);
				match(VAL);
				setState(201);
				match(ENDLINE);
				}
				break;
			case IMGANUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(IMGANUMBER);
				setState(203);
				match(T__13);
				setState(204);
				match(NVAL);
				setState(205);
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

	public static class ListattrContext extends ParserRuleContext {
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TxtattrContext txtattr() {
			return getRuleContext(TxtattrContext.class,0);
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
		enterRule(_localctx, 38, RULE_listattr);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__14);
				setState(209);
				match(TFVAL);
				setState(210);
				match(ENDNLINE);
				}
				break;
			case T__11:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case TXTATF:
			case IMGANUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				txtattr();
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

	public static class TxtattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode SVAL() { return getToken(VolTextParser.SVAL, 0); }
		public TerminalNode URL() { return getToken(VolTextParser.URL, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode IMGANUMBER() { return getToken(VolTextParser.IMGANUMBER, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode TXTATF() { return getToken(VolTextParser.TXTATF, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
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
		enterRule(_localctx, 40, RULE_txtattr);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__11);
				setState(215);
				match(VAL);
				setState(216);
				match(ENDLINE);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__15);
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==SVAL || _la==URL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				match(ENDLINE);
				}
				break;
			case T__16:
			case IMGANUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==IMGANUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				match(T__13);
				setState(222);
				match(NVAL);
				setState(223);
				match(ENDNLINE);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(T__17);
				setState(225);
				match(COLORVAL);
				setState(226);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(TXTATF);
				setState(228);
				match(T__13);
				setState(229);
				match(TFVAL);
				setState(230);
				match(ENDNLINE);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(T__18);
				setState(232);
				match(POSVAL);
				setState(233);
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

	public static class ImgattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(VolTextParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode IMGANUMBER() { return getToken(VolTextParser.IMGANUMBER, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
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
		enterRule(_localctx, 42, RULE_imgattr);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__11);
				setState(237);
				match(VAL);
				setState(238);
				match(ENDLINE);
				}
				break;
			case IMGANUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(IMGANUMBER);
				setState(240);
				match(T__13);
				setState(241);
				match(NVAL);
				setState(242);
				match(ENDNLINE);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__18);
				setState(244);
				match(POSVAL);
				setState(245);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\5\2\67\n\2\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6`\n"+
		"\6\3\7\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\5\bo\n\b\3"+
		"\t\3\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\n\3\n\5\n}\n\n\3\13\3\13"+
		"\3\13\5\13\u0082\n\13\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3"+
		"\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u009c\n\16\f\16\16\16\u009f\13\16\3\16\5\16\u00a2\n\16"+
		"\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u00b3\n\20\f\20\16\20\u00b6\13\20\3\20\3\20"+
		"\3\21\3\21\5\21\u00bc\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00c8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d1\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u00d7\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00ed\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00f9\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",\2\4\4\2\30\30$$\4\2\23\23\32\32\2\u0105\2.\3\2\2\2\4E\3\2\2\2\6G\3\2"+
		"\2\2\bQ\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22|\3\2"+
		"\2\2\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0094\3\2\2\2\32\u0098\3\2\2"+
		"\2\34\u00ab\3\2\2\2\36\u00af\3\2\2\2 \u00bb\3\2\2\2\"\u00bd\3\2\2\2$\u00c7"+
		"\3\2\2\2&\u00d0\3\2\2\2(\u00d6\3\2\2\2*\u00ec\3\2\2\2,\u00f8\3\2\2\2."+
		"\62\7 \2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3"+
		"\2\2\2\679\3\2\2\28:\5\f\7\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"=\3\2\2\2=>\7!\2\2>\3\3\2\2\2?@\7\3\2\2@A\7&\2\2AF\7\36\2\2BC\7\4\2\2"+
		"CD\7&\2\2DF\7\35\2\2E?\3\2\2\2EB\3\2\2\2F\5\3\2\2\2GH\7\5\2\2HL\7\37\2"+
		"\2IK\5\b\5\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7!\2\2P\7\3\2\2\2QR\7&\2\2RV\7\37\2\2SU\5\n\6\2TS\3\2\2\2UX\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7!\2\2Z\t\3\2\2\2[`\5,\27"+
		"\2\\`\5*\26\2]`\5(\25\2^`\5&\24\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2"+
		"\2\2`\13\3\2\2\2ab\7\6\2\2bf\7\37\2\2ce\5\16\b\2dc\3\2\2\2eh\3\2\2\2f"+
		"d\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7!\2\2j\r\3\2\2\2ko\5$\23\2"+
		"lo\5\24\13\2mo\5\20\t\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\7"+
		"\7\2\2qu\7\37\2\2rt\5\22\n\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v"+
		"x\3\2\2\2wu\3\2\2\2xy\7!\2\2y\21\3\2\2\2z}\5&\24\2{}\5\24\13\2|z\3\2\2"+
		"\2|{\3\2\2\2}\23\3\2\2\2~\u0082\5\32\16\2\177\u0082\5\36\20\2\u0080\u0082"+
		"\5\26\f\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\25"+
		"\3\2\2\2\u0083\u0084\7\b\2\2\u0084\u0088\7\37\2\2\u0085\u0087\5,\27\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008f\5\30\r\2"+
		"\u008c\u008e\5,\27\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7!\2\2\u0093\27\3\2\2\2\u0094\u0095\7\t\2\2\u0095\u0096\7$\2\2"+
		"\u0096\u0097\7\35\2\2\u0097\31\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009d"+
		"\7\37\2\2\u009a\u009c\5*\26\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a2\5\34\17\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a6\3\2\2\2\u00a3\u00a5\5*\26\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7!\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\7\13\2"+
		"\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7\36\2\2\u00ae\35\3\2\2\2\u00af\u00b0"+
		"\7\f\2\2\u00b0\u00b4\7\37\2\2\u00b1\u00b3\5 \21\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7!\2\2\u00b8\37\3\2\2\2\u00b9"+
		"\u00bc\5(\25\2\u00ba\u00bc\5\"\22\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc!\3\2\2\2\u00bd\u00be\7\r\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0"+
		"\7\36\2\2\u00c0#\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7&\2\2\u00c3"+
		"\u00c8\7\35\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c8"+
		"\7\36\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8%\3\2\2\2\u00c9"+
		"\u00ca\7\16\2\2\u00ca\u00cb\7&\2\2\u00cb\u00d1\7\35\2\2\u00cc\u00cd\7"+
		"\32\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d1\7\36\2\2"+
		"\u00d0\u00c9\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7"+
		"\21\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d7\7\36\2\2\u00d5\u00d7\5*\26\2"+
		"\u00d6\u00d2\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00d9\7"+
		"\16\2\2\u00d9\u00da\7&\2\2\u00da\u00ed\7\35\2\2\u00db\u00dc\7\22\2\2\u00dc"+
		"\u00dd\t\2\2\2\u00dd\u00ed\7\35\2\2\u00de\u00df\t\3\2\2\u00df\u00e0\7"+
		"\20\2\2\u00e0\u00e1\7\34\2\2\u00e1\u00ed\7\36\2\2\u00e2\u00e3\7\24\2\2"+
		"\u00e3\u00e4\7\27\2\2\u00e4\u00ed\7\36\2\2\u00e5\u00e6\7\26\2\2\u00e6"+
		"\u00e7\7\20\2\2\u00e7\u00e8\7\31\2\2\u00e8\u00ed\7\36\2\2\u00e9\u00ea"+
		"\7\25\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00ed\7\36\2\2\u00ec\u00d8\3\2\2"+
		"\2\u00ec\u00db\3\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00e2\3\2\2\2\u00ec\u00e5"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef\7\16\2\2\u00ef"+
		"\u00f0\7&\2\2\u00f0\u00f9\7\35\2\2\u00f1\u00f2\7\32\2\2\u00f2\u00f3\7"+
		"\20\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f9\7\36\2\2\u00f5\u00f6\7\25\2\2"+
		"\u00f6\u00f7\7\33\2\2\u00f7\u00f9\7\36\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f1"+
		"\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9-\3\2\2\2\32\62\66;ELV_fnu|\u0081\u0088"+
		"\u008f\u009d\u00a1\u00a6\u00b4\u00bb\u00c7\u00d0\u00d6\u00ec\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}