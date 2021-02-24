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
		T__24=25, T__25=26, T__26=27, ORIENTATION=28, TXTATF=29, COLORVAL=30, 
		SVAL=31, TFVAL=32, POSVAL=33, NVAL=34, ENDLINE=35, ENDNLINE=36, O=37, 
		A=38, C=39, STRING=40, WS=41;
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_elemd = 8, 
		RULE_img = 9, RULE_imgattr = 10, RULE_imgElem = 11, RULE_text = 12, RULE_txtattr = 13, 
		RULE_txtElem = 14, RULE_list = 15, RULE_listElem = 16, RULE_imganumber = 17, 
		RULE_idval = 18, RULE_txtval = 19, RULE_color = 20, RULE_positionv = 21, 
		RULE_pageattr = 22, RULE_listattr = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
			"div", "elemd", "img", "imgattr", "imgElem", "text", "txtattr", "txtElem", 
			"list", "listElem", "imganumber", "idval", "txtval", "color", "positionv", 
			"pageattr", "listattr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'title:'", "'author:'", "'path:'", "'stylesheet'", "'@'", "'page'", 
			"'div'", "'img'", "'URL:'", "'text'", "'String:'", "'list'", "'item:'", 
			"'pos-x'", "'pos-y'", "'angle-rotation'", "'h-img'", "'w-img'", "'layer'", 
			"':'", "'id:'", "'font-family:'", "'font-size'", "'color:'", "'position:'", 
			"'orientation:'", "'ordered:'", null, null, null, null, null, null, null, 
			"'\";'", "';'", "':{'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ORIENTATION", "TXTATF", "COLORVAL", "SVAL", 
			"TFVAL", "POSVAL", "NVAL", "ENDLINE", "ENDNLINE", "O", "A", "C", "STRING", 
			"WS"
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
			setState(48);
			match(A);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(49);
				pdfattr();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(55);
				stylesheet();
				}
			}

			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				page();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(63);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__0);
				setState(66);
				match(STRING);
				setState(67);
				match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__1);
				setState(69);
				match(STRING);
				setState(70);
				match(ENDNLINE);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__2);
				setState(72);
				match(STRING);
				setState(73);
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
			setState(76);
			match(T__3);
			setState(77);
			match(O);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(78);
				element();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
			match(T__4);
			setState(87);
			match(STRING);
			setState(88);
			match(O);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(89);
				attrStyle();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				imganumber();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				positionv();
				}
				break;
			case T__21:
			case T__22:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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
			setState(102);
			match(T__5);
			setState(103);
			match(O);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__25))) != 0)) {
				{
				{
				setState(104);
				pae();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				pageattr();
				}
				break;
			case T__7:
			case T__9:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				elemd();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
			setState(117);
			match(T__6);
			setState(118);
			match(O);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(119);
					color();
					}
					break;
				case T__20:
					{
					setState(120);
					idval();
					}
					break;
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
					{
					setState(121);
					imganumber();
					}
					break;
				case T__7:
				case T__9:
				case T__11:
					{
					setState(122);
					elemd();
					}
					break;
				case T__24:
					{
					setState(123);
					positionv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				text();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
			setState(136);
			match(T__7);
			setState(137);
			match(O);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__24))) != 0)) {
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
			imgElem();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__24))) != 0)) {
				{
				{
				setState(145);
				imgattr();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(153);
				idval();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(154);
				imganumber();
				}
				break;
			case T__24:
				{
				setState(155);
				positionv();
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
			setState(158);
			match(T__8);
			setState(159);
			match(STRING);
			setState(160);
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
			setState(162);
			match(T__9);
			setState(163);
			match(O);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					txtattr();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(170);
				txtElem();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(173);
				txtattr();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(181);
				color();
				}
				break;
			case T__20:
				{
				setState(182);
				idval();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				{
				setState(183);
				imganumber();
				}
				break;
			case T__24:
				{
				setState(184);
				positionv();
				}
				break;
			case T__21:
			case T__22:
			case TXTATF:
				{
				setState(185);
				txtval();
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
			setState(188);
			match(T__10);
			setState(189);
			match(STRING);
			setState(190);
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
			setState(192);
			match(T__11);
			setState(193);
			match(O);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << TXTATF))) != 0)) {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__26:
				case TXTATF:
					{
					setState(194);
					listattr();
					}
					break;
				case T__12:
					{
					setState(195);
					listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(203);
			match(T__12);
			setState(204);
			match(STRING);
			setState(205);
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
		enterRule(_localctx, 34, RULE_imganumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			match(T__19);
			setState(209);
			match(NVAL);
			setState(210);
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
		enterRule(_localctx, 36, RULE_idval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__20);
			setState(213);
			match(STRING);
			setState(214);
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
		enterRule(_localctx, 38, RULE_txtval);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__21);
				setState(217);
				match(STRING);
				setState(218);
				match(ENDNLINE);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__22);
				setState(220);
				match(T__19);
				setState(221);
				match(NVAL);
				setState(222);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(TXTATF);
				setState(224);
				match(T__19);
				setState(225);
				match(TFVAL);
				setState(226);
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
		enterRule(_localctx, 40, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__23);
			setState(230);
			match(COLORVAL);
			setState(231);
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
		enterRule(_localctx, 42, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__24);
			setState(234);
			match(POSVAL);
			setState(235);
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
		enterRule(_localctx, 44, RULE_pageattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__25);
			setState(238);
			match(ORIENTATION);
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
		enterRule(_localctx, 46, RULE_listattr);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__26);
				setState(241);
				match(TFVAL);
				setState(242);
				match(ENDNLINE);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				imganumber();
				}
				break;
			case T__21:
			case T__22:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				txtval();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				positionv();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				color();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\5\2;\n\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\7\4"+
		"R\n\4\f\4\16\4U\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16"+
		"\t\u0082\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\7\13\u008e"+
		"\n\13\f\13\16\13\u0091\13\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16\3\16\5\16\u00ae\n\16\3\16\7"+
		"\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00bd\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c7"+
		"\n\21\f\21\16\21\u00ca\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00e6\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00fa\n\31"+
		"\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3"+
		"\2\20\25\2\u0109\2\62\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\bX\3\2\2\2\nf\3\2"+
		"\2\2\fh\3\2\2\2\16u\3\2\2\2\20w\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2"+
		"\2\2\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00a4\3\2\2\2\34\u00bc\3\2\2"+
		"\2\36\u00be\3\2\2\2 \u00c2\3\2\2\2\"\u00cd\3\2\2\2$\u00d1\3\2\2\2&\u00d6"+
		"\3\2\2\2(\u00e5\3\2\2\2*\u00e7\3\2\2\2,\u00eb\3\2\2\2.\u00ef\3\2\2\2\60"+
		"\u00f9\3\2\2\2\62\66\7(\2\2\63\65\5\4\3\2\64\63\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29;\5\6\4\2:9\3\2\2\2"+
		":;\3\2\2\2;=\3\2\2\2<>\5\f\7\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@A\3\2\2\2AB\7)\2\2B\3\3\2\2\2CD\7\3\2\2DE\7*\2\2EM\7&\2\2FG\7\4\2\2G"+
		"H\7*\2\2HM\7&\2\2IJ\7\5\2\2JK\7*\2\2KM\7&\2\2LC\3\2\2\2LF\3\2\2\2LI\3"+
		"\2\2\2M\5\3\2\2\2NO\7\6\2\2OS\7\'\2\2PR\5\b\5\2QP\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7)\2\2W\7\3\2\2\2XY\7\7\2\2Y"+
		"Z\7*\2\2Z^\7\'\2\2[]\5\n\6\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_a\3\2\2\2`^\3\2\2\2ab\7)\2\2b\t\3\2\2\2cg\5$\23\2dg\5,\27\2eg\5(\25\2"+
		"fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hi\7\b\2\2im\7\'\2\2jl\5\16"+
		"\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7)"+
		"\2\2q\r\3\2\2\2rv\5.\30\2sv\5\22\n\2tv\5\20\t\2ur\3\2\2\2us\3\2\2\2ut"+
		"\3\2\2\2v\17\3\2\2\2wx\7\t\2\2x\u0080\7\'\2\2y\177\5*\26\2z\177\5&\24"+
		"\2{\177\5$\23\2|\177\5\22\n\2}\177\5,\27\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2"+
		"\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7)\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0089\5\32\16\2\u0086\u0089\5 \21\2\u0087\u0089\5\24"+
		"\13\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\23\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008f\7\'\2\2\u008c\u008e\5\26\f"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\5\30\r\2"+
		"\u0093\u0095\5\26\f\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7)\2\2\u009a\25\3\2\2\2\u009b\u009f\5&\24\2\u009c\u009f\5$\23\2"+
		"\u009d\u009f\5,\27\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7*\2\2\u00a2"+
		"\u00a3\7&\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a9\7\'\2\2"+
		"\u00a6\u00a8\5\34\17\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3"+
		"\2\2\2\u00af\u00b1\5\34\17\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7)\2\2\u00b6\33\3\2\2\2\u00b7\u00bd\5*\26\2\u00b8\u00bd"+
		"\5&\24\2\u00b9\u00bd\5$\23\2\u00ba\u00bd\5,\27\2\u00bb\u00bd\5(\25\2\u00bc"+
		"\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c0"+
		"\7*\2\2\u00c0\u00c1\7&\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\16\2\2\u00c3"+
		"\u00c8\7\'\2\2\u00c4\u00c7\5\60\31\2\u00c5\u00c7\5\"\22\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7)"+
		"\2\2\u00cc!\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\7*\2\2\u00cf\u00d0"+
		"\7&\2\2\u00d0#\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\7\26\2\2\u00d3"+
		"\u00d4\7$\2\2\u00d4\u00d5\7&\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7\27\2\2\u00d7"+
		"\u00d8\7*\2\2\u00d8\u00d9\7&\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\30\2\2"+
		"\u00db\u00dc\7*\2\2\u00dc\u00e6\7&\2\2\u00dd\u00de\7\31\2\2\u00de\u00df"+
		"\7\26\2\2\u00df\u00e0\7$\2\2\u00e0\u00e6\7&\2\2\u00e1\u00e2\7\37\2\2\u00e2"+
		"\u00e3\7\26\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e6\7&\2\2\u00e5\u00da\3\2"+
		"\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e8"+
		"\7\32\2\2\u00e8\u00e9\7 \2\2\u00e9\u00ea\7&\2\2\u00ea+\3\2\2\2\u00eb\u00ec"+
		"\7\33\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7&\2\2\u00ee-\3\2\2\2\u00ef\u00f0"+
		"\7\34\2\2\u00f0\u00f1\7\36\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7\35\2\2\u00f3"+
		"\u00f4\7\"\2\2\u00f4\u00fa\7&\2\2\u00f5\u00fa\5$\23\2\u00f6\u00fa\5(\25"+
		"\2\u00f7\u00fa\5,\27\2\u00f8\u00fa\5*\26\2\u00f9\u00f2\3\2\2\2\u00f9\u00f5"+
		"\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\61\3\2\2\2\31\66:?LS^fmu~\u0080\u0088\u008f\u0096\u009e\u00a9\u00ad\u00b2"+
		"\u00bc\u00c6\u00c8\u00e5\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}