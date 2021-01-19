// Generated from Hello.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, DIVANUMBER=16, 
		TXTATF=17, TXTANUMBER=18, COLORVAL=19, SVAL=20, TFVAL=21, IMGANUMBER=22, 
		POSVAL=23, NVAL=24, ENDLINE=25, ENDNLINE=26, O=27, A=28, C=29, SPECIALC=30, 
		STRING=31, URL=32, URL2=33, VAL=34, WS=35;
	public static final int
		RULE_pdf = 0, RULE_stylesheet = 1, RULE_element = 2, RULE_attrStyle = 3, 
		RULE_page = 4, RULE_pae = 5, RULE_elemp = 6, RULE_divae = 7, RULE_elemd = 8, 
		RULE_img = 9, RULE_imgElem = 10, RULE_text = 11, RULE_txtElem = 12, RULE_list = 13, 
		RULE_lae = 14, RULE_listElem = 15, RULE_pageattr = 16, RULE_divattr = 17, 
		RULE_listattr = 18, RULE_txtattr = 19, RULE_imgattr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"pdf", "stylesheet", "element", "attrStyle", "page", "pae", "elemp", 
			"divae", "elemd", "img", "imgElem", "text", "txtElem", "list", "lae", 
			"listElem", "pageattr", "divattr", "listattr", "txtattr", "imgattr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stylesheet'", "'page'", "'div'", "'img'", "'URL:\"'", "'text'", 
			"'Text:'", "'list'", "'item:'", "'id:\"'", "':'", "'ordered:'", "'font-family:\"'", 
			"'color:'", "'position:'", null, null, null, null, null, null, null, 
			null, null, "'\";'", "';'", "':{'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "DIVANUMBER", "TXTATF", "TXTANUMBER", "COLORVAL", 
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PdfContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(HelloParser.A, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPdf(this);
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
			setState(42);
			match(A);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(43);
				stylesheet();
				}
			}

			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				page();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(51);
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

	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			match(O);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAL) {
				{
				{
				setState(55);
				element();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		public TerminalNode VAL() { return getToken(HelloParser.VAL, 0); }
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VAL);
			setState(64);
			match(O);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << DIVANUMBER) | (1L << TXTATF) | (1L << TXTANUMBER) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(65);
				attrStyle();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAttrStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAttrStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAttrStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrStyleContext attrStyle() throws RecognitionException {
		AttrStyleContext _localctx = new AttrStyleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrStyle);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				imgattr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				txtattr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				listattr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
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
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__1);
			setState(80);
			match(O);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__9))) != 0)) {
				{
				{
				setState(81);
				pae();
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

	public static class PaeContext extends ParserRuleContext {
		public PageattrContext pageattr() {
			return getRuleContext(PageattrContext.class,0);
		}
		public ElempContext elemp() {
			return getRuleContext(ElempContext.class,0);
		}
		public PaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaeContext pae() throws RecognitionException {
		PaeContext _localctx = new PaeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pae);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				pageattr();
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				elemp();
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

	public static class ElempContext extends ParserRuleContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
		public List<DivaeContext> divae() {
			return getRuleContexts(DivaeContext.class);
		}
		public DivaeContext divae(int i) {
			return getRuleContext(DivaeContext.class,i);
		}
		public ElempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElemp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElemp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElempContext elemp() throws RecognitionException {
		ElempContext _localctx = new ElempContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elemp);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				img();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__2);
				setState(95);
				match(O);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << DIVANUMBER))) != 0)) {
					{
					{
					setState(96);
					divae();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(C);
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDivae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDivae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDivae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivaeContext divae() throws RecognitionException {
		DivaeContext _localctx = new DivaeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divae);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case DIVANUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				divattr();
				}
				break;
			case T__2:
			case T__3:
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
		public ElempContext elemp() {
			return getRuleContext(ElempContext.class,0);
		}
		public ElemdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElemd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElemd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElemd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemdContext elemd() throws RecognitionException {
		ElemdContext _localctx = new ElemdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elemd);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				text();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				list();
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				elemp();
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
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
		public List<ImgattrContext> imgattr() {
			return getRuleContexts(ImgattrContext.class);
		}
		public ImgattrContext imgattr(int i) {
			return getRuleContext(ImgattrContext.class,i);
		}
		public ImgElemContext imgElem() {
			return getRuleContext(ImgElemContext.class,0);
		}
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_img);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__3);
			setState(115);
			match(O);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					imgattr();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(122);
				imgElem();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << IMGANUMBER))) != 0)) {
				{
				{
				setState(125);
				imgattr();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
		public TerminalNode URL() { return getToken(HelloParser.URL, 0); }
		public TerminalNode ENDLINE() { return getToken(HelloParser.ENDLINE, 0); }
		public ImgElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterImgElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitImgElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitImgElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElemContext imgElem() throws RecognitionException {
		ImgElemContext _localctx = new ImgElemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__4);
			setState(134);
			match(URL);
			setState(135);
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
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__5);
			setState(138);
			match(O);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					txtattr();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(145);
				txtElem();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << TXTATF) | (1L << TXTANUMBER))) != 0)) {
				{
				{
				setState(148);
				txtattr();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public TxtElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTxtElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTxtElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTxtElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtElemContext txtElem() throws RecognitionException {
		TxtElemContext _localctx = new TxtElemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__6);
			setState(157);
			match(STRING);
			setState(158);
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
		public TerminalNode O() { return getToken(HelloParser.O, 0); }
		public TerminalNode C() { return getToken(HelloParser.C, 0); }
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__7);
			setState(161);
			match(O);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__11) {
				{
				{
				setState(162);
				lae();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LaeContext lae() throws RecognitionException {
		LaeContext _localctx = new LaeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lae);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				listattr();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public ListElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitListElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElemContext listElem() throws RecognitionException {
		ListElemContext _localctx = new ListElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__8);
			setState(175);
			match(STRING);
			setState(176);
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
		public TerminalNode VAL() { return getToken(HelloParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(HelloParser.ENDLINE, 0); }
		public PageattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPageattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPageattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPageattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageattrContext pageattr() throws RecognitionException {
		PageattrContext _localctx = new PageattrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pageattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__9);
			setState(179);
			match(VAL);
			setState(180);
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

	public static class DivattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(HelloParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(HelloParser.ENDLINE, 0); }
		public TerminalNode DIVANUMBER() { return getToken(HelloParser.DIVANUMBER, 0); }
		public TerminalNode NVAL() { return getToken(HelloParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public DivattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDivattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDivattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDivattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivattrContext divattr() throws RecognitionException {
		DivattrContext _localctx = new DivattrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_divattr);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__9);
				setState(183);
				match(VAL);
				setState(184);
				match(ENDLINE);
				}
				break;
			case DIVANUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(DIVANUMBER);
				setState(186);
				match(T__10);
				setState(187);
				match(NVAL);
				setState(188);
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
		public TerminalNode TFVAL() { return getToken(HelloParser.TFVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public ListattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitListattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListattrContext listattr() throws RecognitionException {
		ListattrContext _localctx = new ListattrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(192);
			match(TFVAL);
			setState(193);
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

	public static class TxtattrContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(HelloParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(HelloParser.ENDLINE, 0); }
		public TerminalNode SVAL() { return getToken(HelloParser.SVAL, 0); }
		public TerminalNode TXTANUMBER() { return getToken(HelloParser.TXTANUMBER, 0); }
		public TerminalNode NVAL() { return getToken(HelloParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(HelloParser.COLORVAL, 0); }
		public TerminalNode TXTATF() { return getToken(HelloParser.TXTATF, 0); }
		public TerminalNode TFVAL() { return getToken(HelloParser.TFVAL, 0); }
		public TerminalNode POSVAL() { return getToken(HelloParser.POSVAL, 0); }
		public TxtattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTxtattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTxtattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTxtattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtattrContext txtattr() throws RecognitionException {
		TxtattrContext _localctx = new TxtattrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_txtattr);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__9);
				setState(196);
				match(VAL);
				setState(197);
				match(ENDLINE);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__12);
				setState(199);
				match(SVAL);
				setState(200);
				match(ENDLINE);
				}
				break;
			case TXTANUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(TXTANUMBER);
				setState(202);
				match(T__10);
				setState(203);
				match(NVAL);
				setState(204);
				match(ENDNLINE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__13);
				setState(206);
				match(COLORVAL);
				setState(207);
				match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(TXTATF);
				setState(209);
				match(T__10);
				setState(210);
				match(TFVAL);
				setState(211);
				match(ENDNLINE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(T__14);
				setState(213);
				match(POSVAL);
				setState(214);
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
		public TerminalNode VAL() { return getToken(HelloParser.VAL, 0); }
		public TerminalNode ENDLINE() { return getToken(HelloParser.ENDLINE, 0); }
		public TerminalNode IMGANUMBER() { return getToken(HelloParser.IMGANUMBER, 0); }
		public TerminalNode NVAL() { return getToken(HelloParser.NVAL, 0); }
		public TerminalNode ENDNLINE() { return getToken(HelloParser.ENDNLINE, 0); }
		public TerminalNode POSVAL() { return getToken(HelloParser.POSVAL, 0); }
		public ImgattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterImgattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitImgattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitImgattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgattrContext imgattr() throws RecognitionException {
		ImgattrContext _localctx = new ImgattrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_imgattr);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__9);
				setState(218);
				match(VAL);
				setState(219);
				match(ENDLINE);
				}
				break;
			case IMGANUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(IMGANUMBER);
				setState(221);
				match(T__10);
				setState(222);
				match(NVAL);
				setState(223);
				match(ENDNLINE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__14);
				setState(225);
				match(POSVAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\2\6\2\62\n"+
		"\2\r\2\16\2\63\3\2\3\2\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5P\n\5\3\6"+
		"\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\7\3\7\5\7^\n\7\3\b\3\b\3\b"+
		"\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\5\bj\n\b\3\t\3\t\5\tn\n\t\3\n\3\n\3\n"+
		"\5\ns\n\n\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\13\5\13~\n\13"+
		"\3\13\7\13\u0081\n\13\f\13\16\13\u0084\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\7\r\u008f\n\r\f\r\16\r\u0092\13\r\3\r\5\r\u0095\n\r\3\r\7"+
		"\r\u0098\n\r\f\r\16\r\u009b\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u00a6\n\17\f\17\16\17\u00a9\13\17\3\17\3\17\3\20\3\20\5\20"+
		"\u00af\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00c0\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00da\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00e6\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\2\2\u00f0\2,\3\2\2\2\4\67\3\2\2\2\6A\3\2\2\2\bO\3\2\2\2\n"+
		"Q\3\2\2\2\f]\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2\26"+
		"\u0087\3\2\2\2\30\u008b\3\2\2\2\32\u009e\3\2\2\2\34\u00a2\3\2\2\2\36\u00ae"+
		"\3\2\2\2 \u00b0\3\2\2\2\"\u00b4\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2"+
		"(\u00d9\3\2\2\2*\u00e5\3\2\2\2,.\7\36\2\2-/\5\4\3\2.-\3\2\2\2./\3\2\2"+
		"\2/\61\3\2\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\37\2\2\66\3\3\2\2\2\678\7\3\2\28"+
		"<\7\35\2\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2"+
		"><\3\2\2\2?@\7\37\2\2@\5\3\2\2\2AB\7$\2\2BF\7\35\2\2CE\5\b\5\2DC\3\2\2"+
		"\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\37\2\2J\7\3\2"+
		"\2\2KP\5*\26\2LP\5(\25\2MP\5&\24\2NP\5$\23\2OK\3\2\2\2OL\3\2\2\2OM\3\2"+
		"\2\2ON\3\2\2\2P\t\3\2\2\2QR\7\4\2\2RV\7\35\2\2SU\5\f\7\2TS\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\37\2\2Z\13\3\2\2\2"+
		"[^\5\"\22\2\\^\5\16\b\2][\3\2\2\2]\\\3\2\2\2^\r\3\2\2\2_j\5\24\13\2`a"+
		"\7\5\2\2ae\7\35\2\2bd\5\20\t\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"fh\3\2\2\2ge\3\2\2\2hj\7\37\2\2i_\3\2\2\2i`\3\2\2\2j\17\3\2\2\2kn\5$\23"+
		"\2ln\5\22\n\2mk\3\2\2\2ml\3\2\2\2n\21\3\2\2\2os\5\30\r\2ps\5\34\17\2q"+
		"s\5\16\b\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\23\3\2\2\2tu\7\6\2\2uy\7\35"+
		"\2\2vx\5*\26\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2|~\5\26\f\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177\u0081\5*\26\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\37\2\2\u0086"+
		"\25\3\2\2\2\u0087\u0088\7\7\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7\33\2"+
		"\2\u008a\27\3\2\2\2\u008b\u008c\7\b\2\2\u008c\u0090\7\35\2\2\u008d\u008f"+
		"\5(\25\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\32"+
		"\16\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0098\5(\25\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7\37\2\2\u009d\31\3\2\2\2\u009e\u009f\7\t\2\2\u009f\u00a0\7!\2"+
		"\2\u00a0\u00a1\7\34\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a7"+
		"\7\35\2\2\u00a4\u00a6\5\36\20\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ab\7\37\2\2\u00ab\35\3\2\2\2\u00ac\u00af\5&\24\2\u00ad"+
		"\u00af\5 \21\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2"+
		"\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"!\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7$\2\2\u00b6\u00b7\7\33\2\2"+
		"\u00b7#\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\7$\2\2\u00ba\u00c0\7\33"+
		"\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\7\32\2\2\u00be"+
		"\u00c0\7\34\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0%\3\2\2\2"+
		"\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4\7\34\2\2\u00c4"+
		"\'\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7$\2\2\u00c7\u00da\7\33\2\2"+
		"\u00c8\u00c9\7\17\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00da\7\33\2\2\u00cb"+
		"\u00cc\7\24\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00da\7"+
		"\34\2\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\7\25\2\2\u00d1\u00da\7\34\2\2"+
		"\u00d2\u00d3\7\23\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00da"+
		"\7\34\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00da\7\34\2"+
		"\2\u00d9\u00c5\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00cf"+
		"\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da)\3\2\2\2\u00db"+
		"\u00dc\7\f\2\2\u00dc\u00dd\7$\2\2\u00dd\u00e6\7\33\2\2\u00de\u00df\7\30"+
		"\2\2\u00df\u00e0\7\r\2\2\u00e0\u00e1\7\32\2\2\u00e1\u00e6\7\34\2\2\u00e2"+
		"\u00e3\7\21\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e6\7\34\2\2\u00e5\u00db"+
		"\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6+\3\2\2\2\30.\63"+
		"<FOV]eimry}\u0082\u0090\u0094\u0099\u00a7\u00ae\u00bf\u00d9\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}