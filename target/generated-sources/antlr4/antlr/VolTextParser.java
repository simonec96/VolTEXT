// Generated from VolText.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, NOTVAL=34, UNIT=35, FORMATVAL=36, ORIENTATION=37, TXTATF=38, 
		COLORVAL=39, ALIGNVAL=40, TFVAL=41, POSVAL=42, NVAL=43, ENDLINE=44, ENDNLINE=45, 
		O=46, A=47, C=48, STRING=49, WS=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'height'", "'img'", "'id:'", "'font-family-ttf'", "'oob:'", 
		"'item:'", "'stylesheet'", "'ordered:'", "'list'", "'color:'", "'fit-y'", 
		"'pos-x'", "'font-family'", "'format:'", "'orientation:'", "'title:'", 
		"'angle-rotation'", "'position:'", "'page'", "'colorT:'", "':'", "'URL:'", 
		"'width'", "'string:'", "'@'", "'pos-y'", "'fit-x'", "'text'", "'div'", 
		"'author:'", "'alignment:'", "'path:'", "'font-size'", "'-'", "UNIT", 
		"FORMATVAL", "ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", "TFVAL", 
		"POSVAL", "NVAL", "'\";'", "';'", "':{'", "'{'", "'}'", "STRING", "WS"
	};
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_elemd = 8, 
		RULE_img = 9, RULE_imgattr = 10, RULE_imgElem = 11, RULE_text = 12, RULE_txtattr = 13, 
		RULE_txtElem = 14, RULE_list = 15, RULE_listElem = 16, RULE_fitAttr = 17, 
		RULE_imganumber = 18, RULE_idval = 19, RULE_txtval = 20, RULE_color = 21, 
		RULE_positionv = 22, RULE_alignment = 23, RULE_pageattr = 24, RULE_listattr = 25;
	public static final String[] ruleNames = {
		"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
		"div", "elemd", "img", "imgattr", "imgElem", "text", "txtattr", "txtElem", 
		"list", "listElem", "fitAttr", "imganumber", "idval", "txtval", "color", 
		"positionv", "alignment", "pageattr", "listattr"
	};

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<PdfattrContext> pdfattr() {
			return getRuleContexts(PdfattrContext.class);
		}
		public TerminalNode A() { return getToken(VolTextParser.A, 0); }
		public PdfattrContext pdfattr(int i) {
			return getRuleContext(PdfattrContext.class,i);
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
			setState(52); match(A);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__3) | (1L << T__1))) != 0)) {
				{
				{
				setState(53); pdfattr();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(59); stylesheet();
				}
			}

			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); page();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(67); match(C);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(78);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(T__17);
				setState(70); match(STRING);
				setState(71); match(ENDNLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(T__3);
				setState(73); match(STRING);
				setState(74); match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(75); match(T__1);
				setState(76); match(STRING);
				setState(77); match(ENDNLINE);
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
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
			setState(80); match(T__26);
			setState(81); match(O);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(82); element();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(C);
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
		public AttrStyleContext attrStyle(int i) {
			return getRuleContext(AttrStyleContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<AttrStyleContext> attrStyle() {
			return getRuleContexts(AttrStyleContext.class);
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
			setState(90); match(T__8);
			setState(91); match(STRING);
			setState(92); match(O);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__29) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__15) | (1L << T__10) | (1L << T__7) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(93); attrStyle();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(C);
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
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
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
			setState(104);
			switch (_input.LA(1)) {
			case T__32:
			case T__21:
			case T__16:
			case T__10:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); imganumber();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); positionv();
				}
				break;
			case T__29:
			case T__20:
			case T__0:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); txtval();
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
		public List<PageattrContext> pageattr() {
			return getRuleContexts(PageattrContext.class);
		}
		public PaeContext pae(int i) {
			return getRuleContext(PaeContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public PageattrContext pageattr(int i) {
			return getRuleContext(PageattrContext.class,i);
		}
		public List<PaeContext> pae() {
			return getRuleContexts(PaeContext.class);
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
			setState(106); match(T__14);
			setState(107); match(O);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__28) | (1L << T__19) | (1L << T__18) | (1L << T__10))) != 0)) {
				{
				{
				setState(108); pageattr();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__24) | (1L << T__5) | (1L << T__4))) != 0)) {
				{
				{
				setState(114); pae();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(C);
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
			setState(124);
			switch (_input.LA(1)) {
			case T__31:
			case T__24:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); elemd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); div();
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
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public List<FitAttrContext> fitAttr() {
			return getRuleContexts(FitAttrContext.class);
		}
		public List<IdvalContext> idval() {
			return getRuleContexts(IdvalContext.class);
		}
		public FitAttrContext fitAttr(int i) {
			return getRuleContext(FitAttrContext.class,i);
		}
		public ImganumberContext imganumber(int i) {
			return getRuleContext(ImganumberContext.class,i);
		}
		public PositionvContext positionv(int i) {
			return getRuleContext(PositionvContext.class,i);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<ImganumberContext> imganumber() {
			return getRuleContexts(ImganumberContext.class);
		}
		public IdvalContext idval(int i) {
			return getRuleContext(IdvalContext.class,i);
		}
		public List<ElemdContext> elemd() {
			return getRuleContexts(ElemdContext.class);
		}
		public List<PositionvContext> positionv() {
			return getRuleContexts(PositionvContext.class);
		}
		public ElemdContext elemd(int i) {
			return getRuleContext(ElemdContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
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
			setState(126); match(T__4);
			setState(127); match(O);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__30) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__7) | (1L << T__6) | (1L << T__5))) != 0)) {
				{
				setState(134);
				switch (_input.LA(1)) {
				case T__23:
				case T__13:
					{
					setState(128); color();
					}
					break;
				case T__30:
					{
					setState(129); idval();
					}
					break;
				case T__32:
				case T__21:
				case T__16:
				case T__10:
				case T__7:
					{
					setState(130); imganumber();
					}
					break;
				case T__31:
				case T__24:
				case T__5:
					{
					setState(131); elemd();
					}
					break;
				case T__15:
					{
					setState(132); positionv();
					}
					break;
				case T__22:
				case T__6:
					{
					setState(133); fitAttr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(C);
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
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
			setState(144);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); text();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); list();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); img();
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
		public ImgattrContext imgattr(int i) {
			return getRuleContext(ImgattrContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public List<ImgattrContext> imgattr() {
			return getRuleContexts(ImgattrContext.class);
		}
		public ImgElemContext imgElem() {
			return getRuleContext(ImgElemContext.class,0);
		}
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
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
			setState(146); match(T__31);
			setState(147); match(O);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__30) | (1L << T__22) | (1L << T__21) | (1L << T__16) | (1L << T__15) | (1L << T__10) | (1L << T__7) | (1L << T__6))) != 0)) {
				{
				{
				setState(148); imgattr();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); imgElem();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__30) | (1L << T__22) | (1L << T__21) | (1L << T__16) | (1L << T__15) | (1L << T__10) | (1L << T__7) | (1L << T__6))) != 0)) {
				{
				{
				setState(155); imgattr();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(C);
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
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
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
			setState(167);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(163); idval();
				}
				break;
			case T__32:
			case T__21:
			case T__16:
			case T__10:
			case T__7:
				{
				setState(164); imganumber();
				}
				break;
			case T__15:
				{
				setState(165); positionv();
				}
				break;
			case T__22:
			case T__6:
				{
				setState(166); fitAttr();
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(169); match(T__11);
			setState(170); match(STRING);
			setState(171); match(ENDNLINE);
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
		public TxtattrContext txtattr(int i) {
			return getRuleContext(TxtattrContext.class,i);
		}
		public TxtElemContext txtElem(int i) {
			return getRuleContext(TxtElemContext.class,i);
		}
		public List<TxtattrContext> txtattr() {
			return getRuleContexts(TxtattrContext.class);
		}
		public List<TxtElemContext> txtElem() {
			return getRuleContexts(TxtElemContext.class);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
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
			setState(173); match(T__5);
			setState(174); match(O);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175); txtattr();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181); txtElem();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187); txtattr();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(193); txtElem();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__30) | (1L << T__29) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__7) | (1L << T__6) | (1L << T__2) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(199); txtattr();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(C);
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
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
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
			setState(214);
			switch (_input.LA(1)) {
			case T__23:
			case T__13:
				{
				setState(207); color();
				}
				break;
			case T__30:
				{
				setState(208); idval();
				}
				break;
			case T__32:
			case T__21:
			case T__16:
			case T__10:
			case T__7:
				{
				setState(209); imganumber();
				}
				break;
			case T__15:
				{
				setState(210); positionv();
				}
				break;
			case T__2:
				{
				setState(211); alignment();
				}
				break;
			case T__29:
			case T__20:
			case T__0:
			case TXTATF:
				{
				setState(212); txtval();
				}
				break;
			case T__22:
			case T__6:
				{
				setState(213); fitAttr();
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(216); match(T__9);
			setState(217); match(STRING);
			setState(218); match(ENDNLINE);
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
		public List<ListElemContext> listElem() {
			return getRuleContexts(ListElemContext.class);
		}
		public ListattrContext listattr(int i) {
			return getRuleContext(ListattrContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ListattrContext> listattr() {
			return getRuleContexts(ListattrContext.class);
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
			setState(220); match(T__24);
			setState(221); match(O);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__29) | (1L << T__27) | (1L << T__25) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__7) | (1L << T__6) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				setState(224);
				switch (_input.LA(1)) {
				case T__32:
				case T__29:
				case T__25:
				case T__23:
				case T__22:
				case T__21:
				case T__20:
				case T__16:
				case T__15:
				case T__13:
				case T__10:
				case T__7:
				case T__6:
				case T__0:
				case TXTATF:
					{
					setState(222); listattr();
					}
					break;
				case T__27:
					{
					setState(223); listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229); match(C);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(231); match(T__27);
			setState(232); match(STRING);
			setState(233); match(ENDNLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
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
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(236); match(T__12);
			setState(237); match(TFVAL);
			setState(238); match(ENDNLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NOTVAL() { return getToken(VolTextParser.NOTVAL, 0); }
		public TerminalNode UNIT() { return getToken(VolTextParser.UNIT, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
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
			setState(257);
			switch (_input.LA(1)) {
			case T__21:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(241); match(T__12);
				setState(243);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(242); match(NOTVAL);
					}
				}

				setState(245); match(NVAL);
				setState(247);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(246); match(UNIT);
					}
				}

				setState(249); match(ENDNLINE);
				}
				break;
			case T__32:
			case T__16:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__16) | (1L << T__10))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(251); match(T__12);
				setState(252); match(NVAL);
				setState(254);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(253); match(UNIT);
					}
				}

				setState(256); match(ENDNLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(259); match(T__30);
			setState(260); match(STRING);
			setState(261); match(ENDNLINE);
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
		public TerminalNode TXTATF() { return getToken(VolTextParser.TXTATF, 0); }
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
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
		int _la;
		try {
			setState(275);
			switch (_input.LA(1)) {
			case T__29:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(264); match(T__12);
				setState(265); match(STRING);
				setState(266); match(ENDLINE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(267); match(T__0);
				setState(268); match(T__12);
				setState(269); match(NVAL);
				setState(270); match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(271); match(TXTATF);
				setState(272); match(T__12);
				setState(273); match(TFVAL);
				setState(274); match(ENDNLINE);
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
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
			setState(283);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(T__23);
				setState(278); match(COLORVAL);
				setState(279); match(ENDNLINE);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(T__13);
				setState(281); match(STRING);
				setState(282); match(ENDLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
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
			setState(285); match(T__15);
			setState(286); match(POSVAL);
			setState(287); match(ENDNLINE);
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
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode ALIGNVAL() { return getToken(VolTextParser.ALIGNVAL, 0); }
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
		enterRule(_localctx, 46, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(T__2);
			setState(290); match(ALIGNVAL);
			setState(291); match(ENDLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
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
		enterRule(_localctx, 48, RULE_pageattr);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(T__18);
				setState(294); match(ORIENTATION);
				setState(295); match(ENDNLINE);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(T__28);
				setState(297); match(TFVAL);
				setState(298); match(ENDNLINE);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(299); match(T__10);
				setState(300); match(T__12);
				setState(301); match(NVAL);
				setState(302); match(ENDNLINE);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(303); match(T__32);
				setState(304); match(T__12);
				setState(305); match(NVAL);
				setState(306); match(ENDNLINE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); match(T__19);
				setState(308); match(FORMATVAL);
				setState(309); match(ENDNLINE);
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
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
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
		enterRule(_localctx, 50, RULE_listattr);
		try {
			setState(320);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); match(T__25);
				setState(313); match(TFVAL);
				setState(314); match(ENDNLINE);
				}
				break;
			case T__32:
			case T__21:
			case T__16:
			case T__10:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); imganumber();
				}
				break;
			case T__29:
			case T__20:
			case T__0:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); txtval();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); positionv();
				}
				break;
			case T__23:
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(318); color();
				}
				break;
			case T__22:
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319); fitAttr();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u0145\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\5\2?\n\2\3\2"+
		"\6\2B\n\2\r\2\16\2C\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5a\n"+
		"\5\f\5\16\5d\13\5\3\5\3\5\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\7\7p\n\7\f"+
		"\7\16\7s\13\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\3\7\3\b\3\b\5\b\177\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16"+
		"\13\u009b\13\13\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u00b3\n\16\f\16\16\16\u00b6\13\16\3\16\7\16\u00b9\n\16\f\16\16\16\u00bc"+
		"\13\16\3\16\7\16\u00bf\n\16\f\16\16\16\u00c2\13\16\3\16\7\16\u00c5\n\16"+
		"\f\16\16\16\u00c8\13\16\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\5\24\u00f6\n\24\3\24\3\24\5\24\u00fa\n\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0101\n\24\3\24\5\24\u0104\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0116\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u011e\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0139\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0143\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\6\4\2\r\r\35\35\4\2\16\16\34\34\5\2\3\3\23\23"+
		"\31\31\4\2\6\6\17\17\u0160\2\66\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2\b\\\3\2"+
		"\2\2\nj\3\2\2\2\fl\3\2\2\2\16~\3\2\2\2\20\u0080\3\2\2\2\22\u0092\3\2\2"+
		"\2\24\u0094\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32\u00af\3\2\2\2"+
		"\34\u00d8\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2\2\2\"\u00e9\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u0103\3\2\2\2(\u0105\3\2\2\2*\u0115\3\2\2\2,\u011d\3\2\2\2."+
		"\u011f\3\2\2\2\60\u0123\3\2\2\2\62\u0138\3\2\2\2\64\u0142\3\2\2\2\66:"+
		"\7\61\2\2\679\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2"+
		"\2\2<:\3\2\2\2=?\5\6\4\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@B\5\f\7\2A@\3\2"+
		"\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\62\2\2F\3\3\2\2\2GH\7"+
		"\22\2\2HI\7\63\2\2IQ\7/\2\2JK\7 \2\2KL\7\63\2\2LQ\7/\2\2MN\7\"\2\2NO\7"+
		"\63\2\2OQ\7/\2\2PG\3\2\2\2PJ\3\2\2\2PM\3\2\2\2Q\5\3\2\2\2RS\7\t\2\2SW"+
		"\7\60\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2"+
		"YW\3\2\2\2Z[\7\62\2\2[\7\3\2\2\2\\]\7\33\2\2]^\7\63\2\2^b\7\60\2\2_a\5"+
		"\n\6\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7"+
		"\62\2\2f\t\3\2\2\2gk\5&\24\2hk\5.\30\2ik\5*\26\2jg\3\2\2\2jh\3\2\2\2j"+
		"i\3\2\2\2k\13\3\2\2\2lm\7\25\2\2mq\7\60\2\2np\5\62\32\2on\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\5\16\b\2ut\3\2\2\2vy"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\62\2\2{\r\3\2\2\2"+
		"|\177\5\22\n\2}\177\5\20\t\2~|\3\2\2\2~}\3\2\2\2\177\17\3\2\2\2\u0080"+
		"\u0081\7\37\2\2\u0081\u008a\7\60\2\2\u0082\u0089\5,\27\2\u0083\u0089\5"+
		"(\25\2\u0084\u0089\5&\24\2\u0085\u0089\5\22\n\2\u0086\u0089\5.\30\2\u0087"+
		"\u0089\5$\23\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2"+
		"\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\62\2\2\u008e\21\3\2\2\2\u008f\u0093"+
		"\5\32\16\2\u0090\u0093\5 \21\2\u0091\u0093\5\24\13\2\u0092\u008f\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\23\3\2\2\2\u0094\u0095"+
		"\7\4\2\2\u0095\u0099\7\60\2\2\u0096\u0098\5\26\f\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\5\30\r\2\u009d\u009f\5\26\f\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\62\2\2"+
		"\u00a4\25\3\2\2\2\u00a5\u00aa\5(\25\2\u00a6\u00aa\5&\24\2\u00a7\u00aa"+
		"\5.\30\2\u00a8\u00aa\5$\23\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\7\30\2"+
		"\2\u00ac\u00ad\7\63\2\2\u00ad\u00ae\7/\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7\36\2\2\u00b0\u00b4\7\60\2\2\u00b1\u00b3\5\34\17\2\u00b2\u00b1\3\2\2"+
		"\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\5\36\20\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c6"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\36\20\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cc"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5\34\17\2\u00ca\u00c9\3\2\2\2"+
		"\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\62\2\2\u00d0\33\3\2\2\2\u00d1"+
		"\u00d9\5,\27\2\u00d2\u00d9\5(\25\2\u00d3\u00d9\5&\24\2\u00d4\u00d9\5."+
		"\30\2\u00d5\u00d9\5\60\31\2\u00d6\u00d9\5*\26\2\u00d7\u00d9\5$\23\2\u00d8"+
		"\u00d1\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\35\3\2\2\2\u00da\u00db\7\32\2\2\u00db\u00dc\7\63\2\2\u00dc\u00dd\7/\2"+
		"\2\u00dd\37\3\2\2\2\u00de\u00df\7\13\2\2\u00df\u00e4\7\60\2\2\u00e0\u00e3"+
		"\5\64\33\2\u00e1\u00e3\5\"\22\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2"+
		"\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\62\2\2\u00e8!\3\2\2\2\u00e9"+
		"\u00ea\7\b\2\2\u00ea\u00eb\7\63\2\2\u00eb\u00ec\7/\2\2\u00ec#\3\2\2\2"+
		"\u00ed\u00ee\t\2\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\7+\2\2\u00f0\u00f1"+
		"\7/\2\2\u00f1%\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3\u00f5\7\27\2\2\u00f4"+
		"\u00f6\7$\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\7-\2\2\u00f8\u00fa\7%\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0104\7/\2\2\u00fc\u00fd\t\4\2\2\u00fd"+
		"\u00fe\7\27\2\2\u00fe\u0100\7-\2\2\u00ff\u0101\7%\2\2\u0100\u00ff\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\7/\2\2\u0103"+
		"\u00f2\3\2\2\2\u0103\u00fc\3\2\2\2\u0104\'\3\2\2\2\u0105\u0106\7\5\2\2"+
		"\u0106\u0107\7\63\2\2\u0107\u0108\7/\2\2\u0108)\3\2\2\2\u0109\u010a\t"+
		"\5\2\2\u010a\u010b\7\27\2\2\u010b\u010c\7\63\2\2\u010c\u0116\7.\2\2\u010d"+
		"\u010e\7#\2\2\u010e\u010f\7\27\2\2\u010f\u0110\7-\2\2\u0110\u0116\7/\2"+
		"\2\u0111\u0112\7(\2\2\u0112\u0113\7\27\2\2\u0113\u0114\7+\2\2\u0114\u0116"+
		"\7/\2\2\u0115\u0109\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u0111\3\2\2\2\u0116"+
		"+\3\2\2\2\u0117\u0118\7\f\2\2\u0118\u0119\7)\2\2\u0119\u011e\7/\2\2\u011a"+
		"\u011b\7\26\2\2\u011b\u011c\7\63\2\2\u011c\u011e\7.\2\2\u011d\u0117\3"+
		"\2\2\2\u011d\u011a\3\2\2\2\u011e-\3\2\2\2\u011f\u0120\7\24\2\2\u0120\u0121"+
		"\7,\2\2\u0121\u0122\7/\2\2\u0122/\3\2\2\2\u0123\u0124\7!\2\2\u0124\u0125"+
		"\7*\2\2\u0125\u0126\7.\2\2\u0126\61\3\2\2\2\u0127\u0128\7\21\2\2\u0128"+
		"\u0129\7\'\2\2\u0129\u0139\7/\2\2\u012a\u012b\7\7\2\2\u012b\u012c\7+\2"+
		"\2\u012c\u0139\7/\2\2\u012d\u012e\7\31\2\2\u012e\u012f\7\27\2\2\u012f"+
		"\u0130\7-\2\2\u0130\u0139\7/\2\2\u0131\u0132\7\3\2\2\u0132\u0133\7\27"+
		"\2\2\u0133\u0134\7-\2\2\u0134\u0139\7/\2\2\u0135\u0136\7\20\2\2\u0136"+
		"\u0137\7&\2\2\u0137\u0139\7/\2\2\u0138\u0127\3\2\2\2\u0138\u012a\3\2\2"+
		"\2\u0138\u012d\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0135\3\2\2\2\u0139\63"+
		"\3\2\2\2\u013a\u013b\7\n\2\2\u013b\u013c\7+\2\2\u013c\u0143\7/\2\2\u013d"+
		"\u0143\5&\24\2\u013e\u0143\5*\26\2\u013f\u0143\5.\30\2\u0140\u0143\5,"+
		"\27\2\u0141\u0143\5$\23\2\u0142\u013a\3\2\2\2\u0142\u013d\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\65\3\2\2\2\":>CPWbjqw~\u0088\u008a\u0092\u0099\u00a0\u00a9"+
		"\u00b4\u00ba\u00c0\u00c6\u00cc\u00d8\u00e2\u00e4\u00f5\u00f9\u0100\u0103"+
		"\u0115\u011d\u0138\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}