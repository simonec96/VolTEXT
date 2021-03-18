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
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, NOTVAL=37, UNIT=38, FORMATVAL=39, 
		ORIENTATION=40, TXTATF=41, COLORVAL=42, ALIGNVAL=43, TFVAL=44, POSVAL=45, 
		NVAL=46, ENDLINE=47, ENDNLINE=48, O=49, A=50, C=51, STRING=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'height'", "'img'", "'id:'", "'colorT-bullet:'", "'font-family-ttf'", 
		"'oob:'", "'item:'", "'stylesheet'", "'ordered:'", "'color-bullet:'", 
		"'list'", "'color:'", "'fit-y'", "'pos-x'", "'font-family'", "'format:'", 
		"'orientation:'", "'title:'", "'angle-rotation'", "'position:'", "'page'", 
		"'colorT:'", "':'", "'URL:'", "'width'", "'bullet:'", "'string:'", "'@'", 
		"'pos-y'", "'fit-x'", "'text'", "'div'", "'author:'", "'alignment:'", 
		"'path:'", "'font-size'", "'-'", "UNIT", "FORMATVAL", "ORIENTATION", "TXTATF", 
		"COLORVAL", "ALIGNVAL", "TFVAL", "POSVAL", "NVAL", "'\";'", "';'", "':{'", 
		"'{'", "'}'", "STRING", "WS"
	};
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_elemd = 8, 
		RULE_img = 9, RULE_imgattr = 10, RULE_imgElem = 11, RULE_list = 12, RULE_listElem = 13, 
		RULE_text = 14, RULE_txtattr = 15, RULE_txtElem = 16, RULE_fitAttr = 17, 
		RULE_imganumber = 18, RULE_idval = 19, RULE_listattr = 20, RULE_txtval = 21, 
		RULE_colorBullet = 22, RULE_color = 23, RULE_positionv = 24, RULE_alignment = 25, 
		RULE_pageattr = 26;
	public static final String[] ruleNames = {
		"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
		"div", "elemd", "img", "imgattr", "imgElem", "list", "listElem", "text", 
		"txtattr", "txtElem", "fitAttr", "imganumber", "idval", "listattr", "txtval", 
		"colorBullet", "color", "positionv", "alignment", "pageattr"
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
			setState(54); match(A);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__3) | (1L << T__1))) != 0)) {
				{
				{
				setState(55); pdfattr();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(61); stylesheet();
				}
			}

			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); page();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(69); match(C);
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
			setState(80);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(T__18);
				setState(72); match(STRING);
				setState(73); match(ENDNLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(T__3);
				setState(75); match(STRING);
				setState(76); match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); match(T__1);
				setState(78); match(STRING);
				setState(79); match(ENDNLINE);
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
			setState(82); match(T__28);
			setState(83); match(O);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(84); element();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(C);
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
			setState(92); match(T__8);
			setState(93); match(STRING);
			setState(94); match(O);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__17) | (1L << T__16) | (1L << T__11) | (1L << T__7) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(95); attrStyle();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101); match(C);
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
			setState(106);
			switch (_input.LA(1)) {
			case T__35:
			case T__22:
			case T__17:
			case T__11:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); imganumber();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); positionv();
				}
				break;
			case T__31:
			case T__21:
			case T__0:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); txtval();
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
			setState(108); match(T__15);
			setState(109); match(O);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__30) | (1L << T__20) | (1L << T__19) | (1L << T__11))) != 0)) {
				{
				{
				setState(110); pageattr();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__25) | (1L << T__5) | (1L << T__4))) != 0)) {
				{
				{
				setState(116); pae();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); match(C);
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
			setState(126);
			switch (_input.LA(1)) {
			case T__34:
			case T__25:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); elemd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); div();
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
			setState(128); match(T__4);
			setState(129); match(O);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__25) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__11) | (1L << T__7) | (1L << T__6) | (1L << T__5))) != 0)) {
				{
				setState(136);
				switch (_input.LA(1)) {
				case T__24:
				case T__14:
					{
					setState(130); color();
					}
					break;
				case T__33:
					{
					setState(131); idval();
					}
					break;
				case T__35:
				case T__22:
				case T__17:
				case T__11:
				case T__7:
					{
					setState(132); imganumber();
					}
					break;
				case T__34:
				case T__25:
				case T__5:
					{
					setState(133); elemd();
					}
					break;
				case T__16:
					{
					setState(134); positionv();
					}
					break;
				case T__23:
				case T__6:
					{
					setState(135); fitAttr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141); match(C);
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
			setState(146);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); text();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); list();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); img();
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
			setState(148); match(T__34);
			setState(149); match(O);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__23) | (1L << T__22) | (1L << T__17) | (1L << T__16) | (1L << T__11) | (1L << T__7) | (1L << T__6))) != 0)) {
				{
				{
				setState(150); imgattr();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); imgElem();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__23) | (1L << T__22) | (1L << T__17) | (1L << T__16) | (1L << T__11) | (1L << T__7) | (1L << T__6))) != 0)) {
				{
				{
				setState(157); imgattr();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(C);
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
			setState(169);
			switch (_input.LA(1)) {
			case T__33:
				{
				setState(165); idval();
				}
				break;
			case T__35:
			case T__22:
			case T__17:
			case T__11:
			case T__7:
				{
				setState(166); imganumber();
				}
				break;
			case T__16:
				{
				setState(167); positionv();
				}
				break;
			case T__23:
			case T__6:
				{
				setState(168); fitAttr();
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
			setState(171); match(T__12);
			setState(172); match(STRING);
			setState(173); match(ENDNLINE);
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
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(T__25);
			setState(176); match(O);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__27) | (1L << T__26) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__11) | (1L << T__10) | (1L << T__7) | (1L << T__6) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				setState(179);
				switch (_input.LA(1)) {
				case T__35:
				case T__33:
				case T__32:
				case T__31:
				case T__27:
				case T__26:
				case T__24:
				case T__23:
				case T__22:
				case T__21:
				case T__17:
				case T__16:
				case T__14:
				case T__11:
				case T__10:
				case T__7:
				case T__6:
				case T__0:
				case TXTATF:
					{
					setState(177); listattr();
					}
					break;
				case T__29:
					{
					setState(178); listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(C);
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
		enterRule(_localctx, 26, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(T__29);
			setState(187); match(STRING);
			setState(188); match(ENDNLINE);
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
		enterRule(_localctx, 28, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(T__5);
			setState(191); match(O);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192); txtattr();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198); txtElem();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204); txtattr();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(210); txtElem();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__33) | (1L << T__31) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__21) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__11) | (1L << T__7) | (1L << T__6) | (1L << T__2) | (1L << T__0) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(216); txtattr();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222); match(C);
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
		enterRule(_localctx, 30, RULE_txtattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch (_input.LA(1)) {
			case T__24:
			case T__14:
				{
				setState(224); color();
				}
				break;
			case T__33:
				{
				setState(225); idval();
				}
				break;
			case T__35:
			case T__22:
			case T__17:
			case T__11:
			case T__7:
				{
				setState(226); imganumber();
				}
				break;
			case T__16:
				{
				setState(227); positionv();
				}
				break;
			case T__2:
				{
				setState(228); alignment();
				}
				break;
			case T__31:
			case T__21:
			case T__0:
			case TXTATF:
				{
				setState(229); txtval();
				}
				break;
			case T__23:
			case T__6:
				{
				setState(230); fitAttr();
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
		enterRule(_localctx, 32, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(T__9);
			setState(234); match(STRING);
			setState(235); match(ENDNLINE);
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
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(238); match(T__13);
			setState(239); match(TFVAL);
			setState(240); match(ENDNLINE);
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
			setState(259);
			switch (_input.LA(1)) {
			case T__22:
			case T__17:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__17) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(243); match(T__13);
				setState(245);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(244); match(NOTVAL);
					}
				}

				setState(247); match(NVAL);
				setState(249);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(248); match(UNIT);
					}
				}

				setState(251); match(ENDNLINE);
				}
				break;
			case T__35:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(253); match(T__13);
				setState(254); match(NVAL);
				setState(256);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(255); match(UNIT);
					}
				}

				setState(258); match(ENDNLINE);
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
			setState(261); match(T__33);
			setState(262); match(STRING);
			setState(263); match(ENDNLINE);
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
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ColorBulletContext colorBullet() {
			return getRuleContext(ColorBulletContext.class,0);
		}
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
		enterRule(_localctx, 40, RULE_listattr);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(T__27);
				setState(266); match(TFVAL);
				setState(267); match(ENDNLINE);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(T__10);
				setState(269); match(STRING);
				setState(270); match(ENDNLINE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(271); idval();
				}
				break;
			case T__35:
			case T__22:
			case T__17:
			case T__11:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(272); imganumber();
				}
				break;
			case T__31:
			case T__21:
			case T__0:
			case TXTATF:
				enterOuterAlt(_localctx, 5);
				{
				setState(273); txtval();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(274); positionv();
				}
				break;
			case T__24:
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(275); color();
				}
				break;
			case T__32:
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(276); colorBullet();
				}
				break;
			case T__23:
			case T__6:
				enterOuterAlt(_localctx, 9);
				{
				setState(277); fitAttr();
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
		enterRule(_localctx, 42, RULE_txtval);
		int _la;
		try {
			setState(292);
			switch (_input.LA(1)) {
			case T__31:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(281); match(T__13);
				setState(282); match(STRING);
				setState(283); match(ENDLINE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); match(T__0);
				setState(285); match(T__13);
				setState(286); match(NVAL);
				setState(287); match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(288); match(TXTATF);
				setState(289); match(T__13);
				setState(290); match(TFVAL);
				setState(291); match(ENDNLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
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
		enterRule(_localctx, 44, RULE_colorBullet);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); match(T__32);
				setState(295); match(STRING);
				setState(296); match(ENDNLINE);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); match(T__26);
				setState(298); match(COLORVAL);
				setState(299); match(ENDNLINE);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
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
		enterRule(_localctx, 46, RULE_color);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(T__14);
				setState(303); match(STRING);
				setState(304); match(ENDNLINE);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(T__24);
				setState(306); match(COLORVAL);
				setState(307); match(ENDNLINE);
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
		enterRule(_localctx, 48, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(T__16);
			setState(311); match(POSVAL);
			setState(312); match(ENDNLINE);
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
		enterRule(_localctx, 50, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(T__2);
			setState(315); match(ALIGNVAL);
			setState(316); match(ENDLINE);
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
		enterRule(_localctx, 52, RULE_pageattr);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(T__19);
				setState(319); match(ORIENTATION);
				setState(320); match(ENDNLINE);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(T__30);
				setState(322); match(TFVAL);
				setState(323); match(ENDNLINE);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); match(T__11);
				setState(325); match(T__13);
				setState(326); match(NVAL);
				setState(327); match(ENDNLINE);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(328); match(T__35);
				setState(329); match(T__13);
				setState(330); match(NVAL);
				setState(331); match(ENDNLINE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(332); match(T__20);
				setState(333); match(FORMATVAL);
				setState(334); match(ENDNLINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\5\2"+
		"A\n\2\3\2\6\2D\n\2\r\2\16\2E\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\7"+
		"\7r\n\7\f\7\16\7u\13\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\5\b"+
		"\u0081\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13\7\13\u009a\n\13"+
		"\f\13\16\13\u009d\13\13\3\13\3\13\7\13\u00a1\n\13\f\13\16\13\u00a4\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00b6\n\16\f\16\16\16\u00b9\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20"+
		"\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\20\7\20\u00d0\n\20\f\20\16\20"+
		"\u00d3\13\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\20\7\20\u00dc"+
		"\n\20\f\20\16\20\u00df\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00ea\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\5\24\u00f8\n\24\3\24\3\24\5\24\u00fc\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u0103\n\24\3\24\5\24\u0106\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0119"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0127\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012f\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0137\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0152\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2\17\17  \5\2\20\20\25\25"+
		"\37\37\4\2\3\3\33\33\4\2\7\7\21\21\u0172\28\3\2\2\2\4R\3\2\2\2\6T\3\2"+
		"\2\2\b^\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16\u0080\3\2\2\2\20\u0082\3\2\2"+
		"\2\22\u0094\3\2\2\2\24\u0096\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2"+
		"\32\u00b1\3\2\2\2\34\u00bc\3\2\2\2\36\u00c0\3\2\2\2 \u00e9\3\2\2\2\"\u00eb"+
		"\3\2\2\2$\u00ef\3\2\2\2&\u0105\3\2\2\2(\u0107\3\2\2\2*\u0118\3\2\2\2,"+
		"\u0126\3\2\2\2.\u012e\3\2\2\2\60\u0136\3\2\2\2\62\u0138\3\2\2\2\64\u013c"+
		"\3\2\2\2\66\u0151\3\2\2\28<\7\64\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\5\6\4\2@?\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2BD\5\f\7\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\65\2\2H\3\3\2\2\2IJ\7\24\2\2JK\7\66\2\2KS\7\62\2\2LM\7#\2\2MN\7\66\2"+
		"\2NS\7\62\2\2OP\7%\2\2PQ\7\66\2\2QS\7\62\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2"+
		"\2\2S\5\3\2\2\2TU\7\n\2\2UY\7\63\2\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\65\2\2]\7\3\2\2\2^_\7\36\2"+
		"\2_`\7\66\2\2`d\7\63\2\2ac\5\n\6\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eg\3\2\2\2fd\3\2\2\2gh\7\65\2\2h\t\3\2\2\2im\5&\24\2jm\5\62\32\2k"+
		"m\5,\27\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\13\3\2\2\2no\7\27\2\2os\7\63"+
		"\2\2pr\5\66\34\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2us\3"+
		"\2\2\2vx\5\16\b\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y"+
		"\3\2\2\2|}\7\65\2\2}\r\3\2\2\2~\u0081\5\22\n\2\177\u0081\5\20\t\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083\7\"\2\2\u0083"+
		"\u008c\7\63\2\2\u0084\u008b\5\60\31\2\u0085\u008b\5(\25\2\u0086\u008b"+
		"\5&\24\2\u0087\u008b\5\22\n\2\u0088\u008b\5\62\32\2\u0089\u008b\5$\23"+
		"\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\65\2\2\u0090\21\3\2\2\2\u0091\u0095\5\36\20\2\u0092"+
		"\u0095\5\32\16\2\u0093\u0095\5\24\13\2\u0094\u0091\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097\7\4\2\2\u0097"+
		"\u009b\7\63\2\2\u0098\u009a\5\26\f\2\u0099\u0098\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a2\5\30\r\2\u009f\u00a1\5\26\f\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\65\2\2\u00a6\25\3\2\2"+
		"\2\u00a7\u00ac\5(\25\2\u00a8\u00ac\5&\24\2\u00a9\u00ac\5\62\32\2\u00aa"+
		"\u00ac\5$\23\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00af"+
		"\7\66\2\2\u00af\u00b0\7\62\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2"+
		"\u00b7\7\63\2\2\u00b3\u00b6\5*\26\2\u00b4\u00b6\5\34\17\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\65"+
		"\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\7\66\2\2\u00be\u00bf"+
		"\7\62\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c5\7\63\2\2\u00c2"+
		"\u00c4\5 \21\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\5\"\22\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\5 \21\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\5\"\22\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5 \21\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7\65\2\2\u00e1\37\3\2\2\2\u00e2\u00ea\5\60\31\2\u00e3\u00ea\5("+
		"\25\2\u00e4\u00ea\5&\24\2\u00e5\u00ea\5\62\32\2\u00e6\u00ea\5\64\33\2"+
		"\u00e7\u00ea\5,\27\2\u00e8\u00ea\5$\23\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3"+
		"\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7\35\2\2"+
		"\u00ec\u00ed\7\66\2\2\u00ed\u00ee\7\62\2\2\u00ee#\3\2\2\2\u00ef\u00f0"+
		"\t\2\2\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\7.\2\2\u00f2\u00f3\7\62\2\2"+
		"\u00f3%\3\2\2\2\u00f4\u00f5\t\3\2\2\u00f5\u00f7\7\31\2\2\u00f6\u00f8\7"+
		"\'\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\7\60\2\2\u00fa\u00fc\7(\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0106\7\62\2\2\u00fe\u00ff\t\4\2\2\u00ff"+
		"\u0100\7\31\2\2\u0100\u0102\7\60\2\2\u0101\u0103\7(\2\2\u0102\u0101\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\62\2\2\u0105"+
		"\u00f4\3\2\2\2\u0105\u00fe\3\2\2\2\u0106\'\3\2\2\2\u0107\u0108\7\5\2\2"+
		"\u0108\u0109\7\66\2\2\u0109\u010a\7\62\2\2\u010a)\3\2\2\2\u010b\u010c"+
		"\7\13\2\2\u010c\u010d\7.\2\2\u010d\u0119\7\62\2\2\u010e\u010f\7\34\2\2"+
		"\u010f\u0110\7\66\2\2\u0110\u0119\7\62\2\2\u0111\u0119\5(\25\2\u0112\u0119"+
		"\5&\24\2\u0113\u0119\5,\27\2\u0114\u0119\5\62\32\2\u0115\u0119\5\60\31"+
		"\2\u0116\u0119\5.\30\2\u0117\u0119\5$\23\2\u0118\u010b\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119+\3\2\2\2\u011a\u011b\t\5\2\2\u011b\u011c\7\31\2\2\u011c\u011d"+
		"\7\66\2\2\u011d\u0127\7\61\2\2\u011e\u011f\7&\2\2\u011f\u0120\7\31\2\2"+
		"\u0120\u0121\7\60\2\2\u0121\u0127\7\62\2\2\u0122\u0123\7+\2\2\u0123\u0124"+
		"\7\31\2\2\u0124\u0125\7.\2\2\u0125\u0127\7\62\2\2\u0126\u011a\3\2\2\2"+
		"\u0126\u011e\3\2\2\2\u0126\u0122\3\2\2\2\u0127-\3\2\2\2\u0128\u0129\7"+
		"\6\2\2\u0129\u012a\7\66\2\2\u012a\u012f\7\62\2\2\u012b\u012c\7\f\2\2\u012c"+
		"\u012d\7,\2\2\u012d\u012f\7\62\2\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012f/\3\2\2\2\u0130\u0131\7\30\2\2\u0131\u0132\7\66\2\2\u0132\u0137"+
		"\7\62\2\2\u0133\u0134\7\16\2\2\u0134\u0135\7,\2\2\u0135\u0137\7\62\2\2"+
		"\u0136\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137\61\3\2\2\2\u0138\u0139"+
		"\7\26\2\2\u0139\u013a\7/\2\2\u013a\u013b\7\62\2\2\u013b\63\3\2\2\2\u013c"+
		"\u013d\7$\2\2\u013d\u013e\7-\2\2\u013e\u013f\7\61\2\2\u013f\65\3\2\2\2"+
		"\u0140\u0141\7\23\2\2\u0141\u0142\7*\2\2\u0142\u0152\7\62\2\2\u0143\u0144"+
		"\7\b\2\2\u0144\u0145\7.\2\2\u0145\u0152\7\62\2\2\u0146\u0147\7\33\2\2"+
		"\u0147\u0148\7\31\2\2\u0148\u0149\7\60\2\2\u0149\u0152\7\62\2\2\u014a"+
		"\u014b\7\3\2\2\u014b\u014c\7\31\2\2\u014c\u014d\7\60\2\2\u014d\u0152\7"+
		"\62\2\2\u014e\u014f\7\22\2\2\u014f\u0150\7)\2\2\u0150\u0152\7\62\2\2\u0151"+
		"\u0140\3\2\2\2\u0151\u0143\3\2\2\2\u0151\u0146\3\2\2\2\u0151\u014a\3\2"+
		"\2\2\u0151\u014e\3\2\2\2\u0152\67\3\2\2\2#<@ERYdlsy\u0080\u008a\u008c"+
		"\u0094\u009b\u00a2\u00ab\u00b5\u00b7\u00c5\u00cb\u00d1\u00d7\u00dd\u00e9"+
		"\u00f7\u00fb\u0102\u0105\u0118\u0126\u012e\u0136\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}