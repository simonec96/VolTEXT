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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, NOTVAL=31, 
		UNIT=32, FORMATVAL=33, ORIENTATION=34, TXTATF=35, COLORVAL=36, TFVAL=37, 
		POSVAL=38, NVAL=39, ENDLINE=40, ENDNLINE=41, O=42, A=43, C=44, STRING=45, 
		WS=46;
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_elemd = 8, 
		RULE_img = 9, RULE_imgattr = 10, RULE_imgElem = 11, RULE_text = 12, RULE_txtattr = 13, 
		RULE_txtElem = 14, RULE_list = 15, RULE_listElem = 16, RULE_fitAttr = 17, 
		RULE_imganumber = 18, RULE_idval = 19, RULE_txtval = 20, RULE_color = 21, 
		RULE_positionv = 22, RULE_pageattr = 23, RULE_listattr = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
			"div", "elemd", "img", "imgattr", "imgElem", "text", "txtattr", "txtElem", 
			"list", "listElem", "fitAttr", "imganumber", "idval", "txtval", "color", 
			"positionv", "pageattr", "listattr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'title:'", "'author:'", "'path:'", "'stylesheet'", "'@'", "'page'", 
			"'div'", "'img'", "'URL:'", "'text'", "'String:'", "'list'", "'item:'", 
			"'fit-x'", "'fit-y'", "':'", "'pos-x'", "'pos-y'", "'angle-rotation'", 
			"'height'", "'width'", "'id:'", "'font-family:'", "'font-size'", "'color:'", 
			"'position:'", "'orientation:'", "'oob:'", "'format:'", "'ordered:'", 
			"'-'", null, null, null, null, null, null, null, null, "'\";'", "';'", 
			"':{'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NOTVAL", "UNIT", "FORMATVAL", 
			"ORIENTATION", "TXTATF", "COLORVAL", "TFVAL", "POSVAL", "NVAL", "ENDLINE", 
			"ENDNLINE", "O", "A", "C", "STRING", "WS"
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
			setState(50);
			match(A);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(51);
				pdfattr();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(57);
				stylesheet();
				}
			}

			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				page();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(65);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__0);
				setState(68);
				match(STRING);
				setState(69);
				match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__1);
				setState(71);
				match(STRING);
				setState(72);
				match(ENDNLINE);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__2);
				setState(74);
				match(STRING);
				setState(75);
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
			setState(78);
			match(T__3);
			setState(79);
			match(O);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				element();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(88);
			match(T__4);
			setState(89);
			match(STRING);
			setState(90);
			match(O);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(91);
				attrStyle();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				imganumber();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				positionv();
				}
				break;
			case T__22:
			case T__23:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				txtval();
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
			setState(104);
			match(T__5);
			setState(105);
			match(O);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
				{
				{
				setState(106);
				pageattr();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11))) != 0)) {
				{
				{
				setState(112);
				pae();
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__9:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				elemd();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(124);
			match(T__6);
			setState(125);
			match(O);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(126);
					color();
					}
					break;
				case T__21:
					{
					setState(127);
					idval();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
					{
					setState(128);
					imganumber();
					}
					break;
				case T__7:
				case T__9:
				case T__11:
					{
					setState(129);
					elemd();
					}
					break;
				case T__25:
					{
					setState(130);
					positionv();
					}
					break;
				case T__13:
				case T__14:
					{
					setState(131);
					fitAttr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
		enterRule(_localctx, 16, RULE_elemd);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				text();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
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
		enterRule(_localctx, 18, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__7);
			setState(145);
			match(O);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25))) != 0)) {
				{
				{
				setState(146);
				imgattr();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			imgElem();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25))) != 0)) {
				{
				{
				setState(153);
				imgattr();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
		enterRule(_localctx, 20, RULE_imgattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(161);
				idval();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(162);
				imganumber();
				}
				break;
			case T__25:
				{
				setState(163);
				positionv();
				}
				break;
			case T__13:
			case T__14:
				{
				setState(164);
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
		enterRule(_localctx, 22, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__8);
			setState(168);
			match(STRING);
			setState(169);
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
			setState(171);
			match(T__9);
			setState(172);
			match(O);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					txtattr();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(179);
				txtElem();
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(182);
				txtattr();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
		enterRule(_localctx, 26, RULE_txtattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(190);
				color();
				}
				break;
			case T__21:
				{
				setState(191);
				idval();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(192);
				imganumber();
				}
				break;
			case T__25:
				{
				setState(193);
				positionv();
				}
				break;
			case T__22:
			case T__23:
			case TXTATF:
				{
				setState(194);
				txtval();
				}
				break;
			case T__13:
			case T__14:
				{
				setState(195);
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
		enterRule(_localctx, 28, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__10);
			setState(199);
			match(STRING);
			setState(200);
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
		enterRule(_localctx, 30, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__11);
			setState(203);
			match(O);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << TXTATF))) != 0)) {
				{
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__14:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__29:
				case TXTATF:
					{
					setState(204);
					listattr();
					}
					break;
				case T__12:
					{
					setState(205);
					listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
		enterRule(_localctx, 32, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__12);
			setState(214);
			match(STRING);
			setState(215);
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
		enterRule(_localctx, 34, RULE_fitAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(T__15);
			setState(219);
			match(TFVAL);
			setState(220);
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
		enterRule(_localctx, 36, RULE_imganumber);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				match(T__15);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(224);
					match(NOTVAL);
					}
				}

				setState(227);
				match(NVAL);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(228);
					match(UNIT);
					}
				}

				setState(231);
				match(ENDNLINE);
				}
				break;
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(T__15);
				setState(234);
				match(NVAL);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(235);
					match(UNIT);
					}
				}

				setState(238);
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
		enterRule(_localctx, 38, RULE_idval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__21);
			setState(242);
			match(STRING);
			setState(243);
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
		enterRule(_localctx, 40, RULE_txtval);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__22);
				setState(246);
				match(STRING);
				setState(247);
				match(ENDNLINE);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__23);
				setState(249);
				match(T__15);
				setState(250);
				match(NVAL);
				setState(251);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(TXTATF);
				setState(253);
				match(T__15);
				setState(254);
				match(TFVAL);
				setState(255);
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
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
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
		enterRule(_localctx, 42, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__24);
			setState(259);
			match(COLORVAL);
			setState(260);
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
		enterRule(_localctx, 44, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__25);
			setState(263);
			match(POSVAL);
			setState(264);
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
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
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
		enterRule(_localctx, 46, RULE_pageattr);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__26);
				setState(267);
				match(ORIENTATION);
				setState(268);
				match(ENDNLINE);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__27);
				setState(270);
				match(TFVAL);
				setState(271);
				match(ENDNLINE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(T__20);
				setState(273);
				match(T__15);
				setState(274);
				match(NVAL);
				setState(275);
				match(ENDNLINE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(T__19);
				setState(277);
				match(T__15);
				setState(278);
				match(NVAL);
				setState(279);
				match(ENDNLINE);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(T__28);
				setState(281);
				match(FORMATVAL);
				setState(282);
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
		enterRule(_localctx, 48, RULE_listattr);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__29);
				setState(286);
				match(TFVAL);
				setState(287);
				match(ENDNLINE);
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				imganumber();
				}
				break;
			case T__22:
			case T__23:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				txtval();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				positionv();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				color();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\5\2=\n\2\3\2\6\2@\n\2"+
		"\r\2\16\2A\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\3\5\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13"+
		"\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\n\u0091\n\n\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13"+
		"\3\13\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00a8\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b1\n\16\f"+
		"\16\16\16\u00b4\13\16\3\16\5\16\u00b7\n\16\3\16\7\16\u00ba\n\16\f\16\16"+
		"\16\u00bd\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00d1\n\21\f\21\16\21\u00d4"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u00e4\n\24\3\24\3\24\5\24\u00e8\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00ef\n\24\3\24\5\24\u00f2\n\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0103\n\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011e\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0128\n\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2\20\21\3\2\23\24\3\2"+
		"\25\27\2\u0142\2\64\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bZ\3\2\2\2\nh\3\2\2"+
		"\2\fj\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2"+
		"\2\26\u00a7\3\2\2\2\30\u00a9\3\2\2\2\32\u00ad\3\2\2\2\34\u00c6\3\2\2\2"+
		"\36\u00c8\3\2\2\2 \u00cc\3\2\2\2\"\u00d7\3\2\2\2$\u00db\3\2\2\2&\u00f1"+
		"\3\2\2\2(\u00f3\3\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0108\3\2\2\2\60"+
		"\u011d\3\2\2\2\62\u0127\3\2\2\2\648\7-\2\2\65\67\5\4\3\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;=\5\6\4\2<;\3\2"+
		"\2\2<=\3\2\2\2=?\3\2\2\2>@\5\f\7\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BC\3\2\2\2CD\7.\2\2D\3\3\2\2\2EF\7\3\2\2FG\7/\2\2GO\7+\2\2HI\7\4\2"+
		"\2IJ\7/\2\2JO\7+\2\2KL\7\5\2\2LM\7/\2\2MO\7+\2\2NE\3\2\2\2NH\3\2\2\2N"+
		"K\3\2\2\2O\5\3\2\2\2PQ\7\6\2\2QU\7,\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7.\2\2Y\7\3\2\2\2Z[\7\7\2\2"+
		"[\\\7/\2\2\\`\7,\2\2]_\5\n\6\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ac\3\2\2\2b`\3\2\2\2cd\7.\2\2d\t\3\2\2\2ei\5&\24\2fi\5.\30\2gi\5*\26\2"+
		"he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jk\7\b\2\2ko\7,\2\2ln\5\60\31"+
		"\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2rt\5\16"+
		"\b\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7."+
		"\2\2y\r\3\2\2\2z}\5\22\n\2{}\5\20\t\2|z\3\2\2\2|{\3\2\2\2}\17\3\2\2\2"+
		"~\177\7\t\2\2\177\u0088\7,\2\2\u0080\u0087\5,\27\2\u0081\u0087\5(\25\2"+
		"\u0082\u0087\5&\24\2\u0083\u0087\5\22\n\2\u0084\u0087\5.\30\2\u0085\u0087"+
		"\5$\23\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7.\2\2\u008c\21\3\2\2\2\u008d\u0091\5\32\16"+
		"\2\u008e\u0091\5 \21\2\u008f\u0091\5\24\13\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\n\2"+
		"\2\u0093\u0097\7,\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009e\5\30\r\2\u009b\u009d\5\26\f\2\u009c\u009b\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\25\3\2\2\2"+
		"\u00a3\u00a8\5(\25\2\u00a4\u00a8\5&\24\2\u00a5\u00a8\5.\30\2\u00a6\u00a8"+
		"\5$\23\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7/\2"+
		"\2\u00ab\u00ac\7+\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00b2"+
		"\7,\2\2\u00af\u00b1\5\34\17\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b7\5\36\20\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00bb\3\2\2\2\u00b8\u00ba\5\34\17\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7.\2\2\u00bf\33\3\2\2\2\u00c0\u00c7\5,\27\2"+
		"\u00c1\u00c7\5(\25\2\u00c2\u00c7\5&\24\2\u00c3\u00c7\5.\30\2\u00c4\u00c7"+
		"\5*\26\2\u00c5\u00c7\5$\23\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb"+
		"\7+\2\2\u00cb\37\3\2\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00d2\7,\2\2\u00ce"+
		"\u00d1\5\62\32\2\u00cf\u00d1\5\"\22\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6!\3\2\2\2\u00d7"+
		"\u00d8\7\17\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7+\2\2\u00da#\3\2\2\2\u00db"+
		"\u00dc\t\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\7"+
		"+\2\2\u00df%\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1\u00e3\7\22\2\2\u00e2\u00e4"+
		"\7!\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\7)\2\2\u00e6\u00e8\7\"\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f2\7+\2\2\u00ea\u00eb\t\4\2\2\u00eb"+
		"\u00ec\7\22\2\2\u00ec\u00ee\7)\2\2\u00ed\u00ef\7\"\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7+\2\2\u00f1"+
		"\u00e0\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\30\2"+
		"\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7+\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7"+
		"\31\2\2\u00f8\u00f9\7/\2\2\u00f9\u0103\7+\2\2\u00fa\u00fb\7\32\2\2\u00fb"+
		"\u00fc\7\22\2\2\u00fc\u00fd\7)\2\2\u00fd\u0103\7+\2\2\u00fe\u00ff\7%\2"+
		"\2\u00ff\u0100\7\22\2\2\u0100\u0101\7\'\2\2\u0101\u0103\7+\2\2\u0102\u00f7"+
		"\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103+\3\2\2\2\u0104"+
		"\u0105\7\33\2\2\u0105\u0106\7&\2\2\u0106\u0107\7+\2\2\u0107-\3\2\2\2\u0108"+
		"\u0109\7\34\2\2\u0109\u010a\7(\2\2\u010a\u010b\7+\2\2\u010b/\3\2\2\2\u010c"+
		"\u010d\7\35\2\2\u010d\u010e\7$\2\2\u010e\u011e\7+\2\2\u010f\u0110\7\36"+
		"\2\2\u0110\u0111\7\'\2\2\u0111\u011e\7+\2\2\u0112\u0113\7\27\2\2\u0113"+
		"\u0114\7\22\2\2\u0114\u0115\7)\2\2\u0115\u011e\7+\2\2\u0116\u0117\7\26"+
		"\2\2\u0117\u0118\7\22\2\2\u0118\u0119\7)\2\2\u0119\u011e\7+\2\2\u011a"+
		"\u011b\7\37\2\2\u011b\u011c\7#\2\2\u011c\u011e\7+\2\2\u011d\u010c\3\2"+
		"\2\2\u011d\u010f\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0116\3\2\2\2\u011d"+
		"\u011a\3\2\2\2\u011e\61\3\2\2\2\u011f\u0120\7 \2\2\u0120\u0121\7\'\2\2"+
		"\u0121\u0128\7+\2\2\u0122\u0128\5&\24\2\u0123\u0128\5*\26\2\u0124\u0128"+
		"\5.\30\2\u0125\u0128\5,\27\2\u0126\u0128\5$\23\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0126\3\2\2\2\u0128\63\3\2\2\2\378<ANU`hou|\u0086\u0088\u0090"+
		"\u0097\u009e\u00a7\u00b2\u00b6\u00bb\u00c6\u00d0\u00d2\u00e3\u00e7\u00ee"+
		"\u00f1\u0102\u011d\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}