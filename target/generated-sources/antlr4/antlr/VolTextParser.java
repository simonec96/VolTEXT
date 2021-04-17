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
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, NOTVAL=43, UNIT=44, FORMATVAL=45, 
		ORIENTATION=46, TXTATF=47, COLORVAL=48, ALIGNVAL=49, TFVAL=50, POSVAL=51, 
		NVAL=52, ENDLINE=53, ENDNLINE=54, O=55, A=56, C=57, STRING=58, WS=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'height'", "'RECTANGLE'", "'img'", "'id:'", "'colorT-bullet:'", 
		"'font-family-otf:'", "'oob:'", "'item:'", "'stylesheet'", "'ordered:'", 
		"'color-bullet:'", "'list'", "'color:'", "'fit-y'", "'pos-x'", "'format:'", 
		"'orientation:'", "'shape:\"'", "'title:'", "'TRIANGLE'", "'angle-rotation'", 
		"'position:'", "'page'", "'colorT:'", "':'", "'URL:'", "'CIRCLE'", "'width'", 
		"'font-family-ttf:'", "'bullet:'", "'font-family:'", "'string:'", "'@'", 
		"'pos-y'", "'fit-x'", "'text'", "'div'", "'font-size:'", "'author:'", 
		"'alignment:'", "'path:'", "'cross-point:'", "'-'", "UNIT", "FORMATVAL", 
		"ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", "TFVAL", "POSVAL", "NVAL", 
		"'\";'", "';'", "':{'", "'{'", "'}'", "STRING", "WS"
	};
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_tvalue = 8, 
		RULE_figure = 9, RULE_elemd = 10, RULE_img = 11, RULE_imgattr = 12, RULE_imgElem = 13, 
		RULE_list = 14, RULE_listElem = 15, RULE_text = 16, RULE_txtattr = 17, 
		RULE_txtElem = 18, RULE_fitAttr = 19, RULE_imganumber = 20, RULE_idval = 21, 
		RULE_listattr = 22, RULE_txtval = 23, RULE_colorBullet = 24, RULE_color = 25, 
		RULE_positionv = 26, RULE_alignment = 27, RULE_pageattr = 28;
	public static final String[] ruleNames = {
		"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
		"div", "tvalue", "figure", "elemd", "img", "imgattr", "imgElem", "list", 
		"listElem", "text", "txtattr", "txtElem", "fitAttr", "imganumber", "idval", 
		"listattr", "txtval", "colorBullet", "color", "positionv", "alignment", 
		"pageattr"
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
			setState(58); match(A);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__3) | (1L << T__1))) != 0)) {
				{
				{
				setState(59); pdfattr();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(65); stylesheet();
				}
			}

			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); page();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(73); match(C);
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
			setState(84);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(T__23);
				setState(76); match(STRING);
				setState(77); match(ENDNLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(T__3);
				setState(79); match(STRING);
				setState(80); match(ENDNLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); match(T__1);
				setState(82); match(STRING);
				setState(83); match(ENDNLINE);
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
			setState(86); match(T__33);
			setState(87); match(O);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(88); element();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(C);
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
			setState(96); match(T__9);
			setState(97); match(STRING);
			setState(98); match(O);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__36) | (1L << T__27) | (1L << T__21) | (1L << T__20) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__4) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(99); attrStyle();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(C);
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
			setState(110);
			switch (_input.LA(1)) {
			case T__41:
			case T__27:
			case T__21:
			case T__14:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); imganumber();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); positionv();
				}
				break;
			case T__36:
			case T__13:
			case T__11:
			case T__4:
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); txtval();
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
			setState(112); match(T__19);
			setState(113); match(O);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__35) | (1L << T__26) | (1L << T__25) | (1L << T__14))) != 0)) {
				{
				{
				setState(114); pageattr();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__30) | (1L << T__6) | (1L << T__5))) != 0)) {
				{
				{
				setState(120); pae();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(C);
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
			setState(130);
			switch (_input.LA(1)) {
			case T__39:
			case T__30:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); elemd();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); div();
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
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public List<ElemdContext> elemd() {
			return getRuleContexts(ElemdContext.class);
		}
		public List<PositionvContext> positionv() {
			return getRuleContexts(PositionvContext.class);
		}
		public TvalueContext tvalue(int i) {
			return getRuleContext(TvalueContext.class,i);
		}
		public List<TvalueContext> tvalue() {
			return getRuleContexts(TvalueContext.class);
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
			setState(132); match(T__5);
			setState(133); match(O);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__39) | (1L << T__38) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__14) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				setState(142);
				switch (_input.LA(1)) {
				case T__29:
				case T__18:
					{
					setState(134); color();
					}
					break;
				case T__38:
					{
					setState(135); idval();
					}
					break;
				case T__41:
				case T__27:
				case T__21:
				case T__14:
				case T__8:
					{
					setState(136); imganumber();
					}
					break;
				case T__39:
				case T__30:
				case T__6:
					{
					setState(137); elemd();
					}
					break;
				case T__20:
					{
					setState(138); positionv();
					}
					break;
				case T__28:
				case T__7:
					{
					setState(139); fitAttr();
					}
					break;
				case T__24:
					{
					setState(140); figure();
					}
					break;
				case T__0:
					{
					setState(141); tvalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(C);
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
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
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
			setState(149); match(T__0);
			setState(150); match(NVAL);
			setState(151); match(ENDNLINE);
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
			setState(153); match(T__24);
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__22) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(155); match(ENDLINE);
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
		enterRule(_localctx, 20, RULE_elemd);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); text();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); list();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); img();
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
		enterRule(_localctx, 22, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__39);
			setState(163); match(O);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__28) | (1L << T__27) | (1L << T__21) | (1L << T__20) | (1L << T__14) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				{
				setState(164); imgattr();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170); imgElem();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__28) | (1L << T__27) | (1L << T__21) | (1L << T__20) | (1L << T__14) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				{
				setState(171); imgattr();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(C);
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
		enterRule(_localctx, 24, RULE_imgattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(179); idval();
				}
				break;
			case T__41:
			case T__27:
			case T__21:
			case T__14:
			case T__8:
				{
				setState(180); imganumber();
				}
				break;
			case T__20:
				{
				setState(181); positionv();
				}
				break;
			case T__28:
			case T__7:
				{
				setState(182); fitAttr();
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
		enterRule(_localctx, 26, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__16);
			setState(186); match(STRING);
			setState(187); match(ENDNLINE);
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
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__30);
			setState(190); match(O);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__37) | (1L << T__36) | (1L << T__34) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << TXTATF))) != 0)) {
				{
				setState(193);
				switch (_input.LA(1)) {
				case T__41:
				case T__38:
				case T__37:
				case T__36:
				case T__32:
				case T__31:
				case T__29:
				case T__28:
				case T__27:
				case T__21:
				case T__20:
				case T__18:
				case T__14:
				case T__13:
				case T__12:
				case T__11:
				case T__8:
				case T__7:
				case T__4:
				case TXTATF:
					{
					setState(191); listattr();
					}
					break;
				case T__34:
					{
					setState(192); listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(C);
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
		enterRule(_localctx, 30, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(T__34);
			setState(201); match(STRING);
			setState(202); match(ENDNLINE);
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
		enterRule(_localctx, 32, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(T__6);
			setState(205); match(O);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206); txtattr();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212); txtElem();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218); txtattr();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(224); txtElem();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__36) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__21) | (1L << T__20) | (1L << T__18) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << T__2) | (1L << TXTATF))) != 0)) {
				{
				{
				setState(230); txtattr();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236); match(C);
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
		enterRule(_localctx, 34, RULE_txtattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch (_input.LA(1)) {
			case T__29:
			case T__18:
				{
				setState(238); color();
				}
				break;
			case T__38:
				{
				setState(239); idval();
				}
				break;
			case T__41:
			case T__27:
			case T__21:
			case T__14:
			case T__8:
				{
				setState(240); imganumber();
				}
				break;
			case T__20:
				{
				setState(241); positionv();
				}
				break;
			case T__2:
				{
				setState(242); alignment();
				}
				break;
			case T__36:
			case T__13:
			case T__11:
			case T__4:
			case TXTATF:
				{
				setState(243); txtval();
				}
				break;
			case T__28:
			case T__7:
				{
				setState(244); fitAttr();
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
		enterRule(_localctx, 36, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(T__10);
			setState(248); match(STRING);
			setState(249); match(ENDNLINE);
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
		enterRule(_localctx, 38, RULE_fitAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(252); match(T__17);
			setState(253); match(TFVAL);
			setState(254); match(ENDNLINE);
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
		enterRule(_localctx, 40, RULE_imganumber);
		int _la;
		try {
			setState(273);
			switch (_input.LA(1)) {
			case T__27:
			case T__21:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__21) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(257); match(T__17);
				setState(259);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(258); match(NOTVAL);
					}
				}

				setState(261); match(NVAL);
				setState(263);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(262); match(UNIT);
					}
				}

				setState(265); match(ENDNLINE);
				}
				break;
			case T__41:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==T__41 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(267); match(T__17);
				setState(268); match(NVAL);
				setState(270);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(269); match(UNIT);
					}
				}

				setState(272); match(ENDNLINE);
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
		enterRule(_localctx, 42, RULE_idval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(T__38);
			setState(276); match(STRING);
			setState(277); match(ENDNLINE);
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
		enterRule(_localctx, 44, RULE_listattr);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(T__32);
				setState(280); match(TFVAL);
				setState(281); match(ENDNLINE);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(T__12);
				setState(283); match(STRING);
				setState(284); match(ENDNLINE);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(285); idval();
				}
				break;
			case T__41:
			case T__27:
			case T__21:
			case T__14:
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(286); imganumber();
				}
				break;
			case T__36:
			case T__13:
			case T__11:
			case T__4:
			case TXTATF:
				enterOuterAlt(_localctx, 5);
				{
				setState(287); txtval();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(288); positionv();
				}
				break;
			case T__29:
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(289); color();
				}
				break;
			case T__37:
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(290); colorBullet();
				}
				break;
			case T__28:
			case T__7:
				enterOuterAlt(_localctx, 9);
				{
				setState(291); fitAttr();
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
		enterRule(_localctx, 46, RULE_txtval);
		int _la;
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__36:
			case T__13:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__13) | (1L << T__11))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(295); match(STRING);
				setState(296); match(ENDNLINE);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); match(T__4);
				setState(298); match(NVAL);
				setState(299); match(ENDNLINE);
				}
				break;
			case TXTATF:
				enterOuterAlt(_localctx, 3);
				{
				setState(300); match(TXTATF);
				setState(301); match(T__17);
				setState(302); match(TFVAL);
				setState(303); match(ENDNLINE);
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
		enterRule(_localctx, 48, RULE_colorBullet);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); match(T__37);
				setState(307); match(STRING);
				setState(308); match(ENDNLINE);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(T__31);
				setState(310); match(COLORVAL);
				setState(311); match(ENDNLINE);
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
		enterRule(_localctx, 50, RULE_color);
		try {
			setState(320);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); match(T__18);
				setState(315); match(STRING);
				setState(316); match(ENDNLINE);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); match(T__29);
				setState(318); match(COLORVAL);
				setState(319); match(ENDNLINE);
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
		enterRule(_localctx, 52, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(T__20);
			setState(323); match(POSVAL);
			setState(324); match(ENDNLINE);
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
		enterRule(_localctx, 54, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(T__2);
			setState(327); match(ALIGNVAL);
			setState(328); match(ENDLINE);
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
		enterRule(_localctx, 56, RULE_pageattr);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); match(T__25);
				setState(331); match(ORIENTATION);
				setState(332); match(ENDNLINE);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); match(T__35);
				setState(334); match(TFVAL);
				setState(335); match(ENDNLINE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); match(T__14);
				setState(337); match(T__17);
				setState(338); match(NVAL);
				setState(339); match(ENDNLINE);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 4);
				{
				setState(340); match(T__41);
				setState(341); match(T__17);
				setState(342); match(NVAL);
				setState(343); match(ENDNLINE);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(344); match(T__26);
				setState(345); match(FORMATVAL);
				setState(346); match(ENDNLINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\6\3\6\3\6\5"+
		"\6q\n\6\3\7\3\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\7\7|\n\7\f\7\16\7\177"+
		"\13\7\3\7\3\7\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\7\r\u00a8\n\r\f"+
		"\r\16\r\u00ab\13\r\3\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u00d2\n\22\f\22\16\22\u00d5\13\22\3\22\7\22"+
		"\u00d8\n\22\f\22\16\22\u00db\13\22\3\22\7\22\u00de\n\22\f\22\16\22\u00e1"+
		"\13\22\3\22\7\22\u00e4\n\22\f\22\16\22\u00e7\13\22\3\22\7\22\u00ea\n\22"+
		"\f\22\16\22\u00ed\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00f8\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u0106\n\26\3\26\3\26\5\26\u010a\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0111\n\26\3\26\5\26\u0114\n\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0127\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0133\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u013b\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0143\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u015e\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\7\5\2\4\4\26\26\35\35\4\2\20\20%%\5\2\21\21\27"+
		"\27$$\4\2\3\3\36\36\5\2\b\b\37\37!!\u017e\2<\3\2\2\2\4V\3\2\2\2\6X\3\2"+
		"\2\2\bb\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3\2\2"+
		"\2\22\u0097\3\2\2\2\24\u009b\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2"+
		"\32\u00b9\3\2\2\2\34\u00bb\3\2\2\2\36\u00bf\3\2\2\2 \u00ca\3\2\2\2\"\u00ce"+
		"\3\2\2\2$\u00f7\3\2\2\2&\u00f9\3\2\2\2(\u00fd\3\2\2\2*\u0113\3\2\2\2,"+
		"\u0115\3\2\2\2.\u0126\3\2\2\2\60\u0132\3\2\2\2\62\u013a\3\2\2\2\64\u0142"+
		"\3\2\2\2\66\u0144\3\2\2\28\u0148\3\2\2\2:\u015d\3\2\2\2<@\7:\2\2=?\5\4"+
		"\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\5\6"+
		"\4\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\f\7\2GF\3\2\2\2HI\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2JK\3\2\2\2KL\7;\2\2L\3\3\2\2\2MN\7\25\2\2NO\7<\2\2OW\78"+
		"\2\2PQ\7)\2\2QR\7<\2\2RW\78\2\2ST\7+\2\2TU\7<\2\2UW\78\2\2VM\3\2\2\2V"+
		"P\3\2\2\2VS\3\2\2\2W\5\3\2\2\2XY\7\13\2\2Y]\79\2\2Z\\\5\b\5\2[Z\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7;\2\2a\7\3\2"+
		"\2\2bc\7#\2\2cd\7<\2\2dh\79\2\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7;\2\2l\t\3\2\2\2mq\5*\26\2nq\5\66"+
		"\34\2oq\5\60\31\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\13\3\2\2\2rs\7\31\2\2"+
		"sw\79\2\2tv\5:\36\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x}\3\2\2\2"+
		"yw\3\2\2\2z|\5\16\b\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7;\2\2\u0081\r\3\2\2\2\u0082\u0085\5"+
		"\26\f\2\u0083\u0085\5\20\t\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\17\3\2\2\2\u0086\u0087\7\'\2\2\u0087\u0092\79\2\2\u0088\u0091\5\64\33"+
		"\2\u0089\u0091\5,\27\2\u008a\u0091\5*\26\2\u008b\u0091\5\26\f\2\u008c"+
		"\u0091\5\66\34\2\u008d\u0091\5(\25\2\u008e\u0091\5\24\13\2\u008f\u0091"+
		"\5\22\n\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2"+
		"\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7;"+
		"\2\2\u0096\21\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\7\66\2\2\u0099\u009a"+
		"\78\2\2\u009a\23\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\t\2\2\2\u009d"+
		"\u009e\7\67\2\2\u009e\25\3\2\2\2\u009f\u00a3\5\"\22\2\u00a0\u00a3\5\36"+
		"\20\2\u00a1\u00a3\5\30\r\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a9\79\2\2"+
		"\u00a6\u00a8\5\32\16\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00b0\5\34\17\2\u00ad\u00af\5\32\16\2\u00ae\u00ad\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7;\2\2\u00b4\31\3\2\2\2\u00b5\u00ba\5,\27\2"+
		"\u00b6\u00ba\5*\26\2\u00b7\u00ba\5\66\34\2\u00b8\u00ba\5(\25\2\u00b9\u00b5"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\7<\2\2\u00bd\u00be\78\2\2"+
		"\u00be\35\3\2\2\2\u00bf\u00c0\7\16\2\2\u00c0\u00c5\79\2\2\u00c1\u00c4"+
		"\5.\30\2\u00c2\u00c4\5 \21\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7;\2\2\u00c9\37\3\2\2\2\u00ca\u00cb"+
		"\7\n\2\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\78\2\2\u00cd!\3\2\2\2\u00ce\u00cf"+
		"\7&\2\2\u00cf\u00d3\79\2\2\u00d0\u00d2\5$\23\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00df\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\5$\23\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5$\23\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7;\2\2\u00ef#\3\2\2\2\u00f0\u00f8"+
		"\5\64\33\2\u00f1\u00f8\5,\27\2\u00f2\u00f8\5*\26\2\u00f3\u00f8\5\66\34"+
		"\2\u00f4\u00f8\58\35\2\u00f5\u00f8\5\60\31\2\u00f6\u00f8\5(\25\2\u00f7"+
		"\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"%\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7<\2\2\u00fb\u00fc\78\2\2\u00fc"+
		"\'\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\7\64\2"+
		"\2\u0100\u0101\78\2\2\u0101)\3\2\2\2\u0102\u0103\t\4\2\2\u0103\u0105\7"+
		"\33\2\2\u0104\u0106\7-\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0109\7\66\2\2\u0108\u010a\7.\2\2\u0109\u0108\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0114\78\2\2\u010c"+
		"\u010d\t\5\2\2\u010d\u010e\7\33\2\2\u010e\u0110\7\66\2\2\u010f\u0111\7"+
		".\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\78\2\2\u0113\u0102\3\2\2\2\u0113\u010c\3\2\2\2\u0114+\3\2\2\2\u0115"+
		"\u0116\7\6\2\2\u0116\u0117\7<\2\2\u0117\u0118\78\2\2\u0118-\3\2\2\2\u0119"+
		"\u011a\7\f\2\2\u011a\u011b\7\64\2\2\u011b\u0127\78\2\2\u011c\u011d\7 "+
		"\2\2\u011d\u011e\7<\2\2\u011e\u0127\78\2\2\u011f\u0127\5,\27\2\u0120\u0127"+
		"\5*\26\2\u0121\u0127\5\60\31\2\u0122\u0127\5\66\34\2\u0123\u0127\5\64"+
		"\33\2\u0124\u0127\5\62\32\2\u0125\u0127\5(\25\2\u0126\u0119\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2"+
		"\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127/\3\2\2\2\u0128\u0129\t\6\2\2\u0129\u012a\7<\2\2\u012a"+
		"\u0133\78\2\2\u012b\u012c\7(\2\2\u012c\u012d\7\66\2\2\u012d\u0133\78\2"+
		"\2\u012e\u012f\7\61\2\2\u012f\u0130\7\33\2\2\u0130\u0131\7\64\2\2\u0131"+
		"\u0133\78\2\2\u0132\u0128\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u012e\3\2"+
		"\2\2\u0133\61\3\2\2\2\u0134\u0135\7\7\2\2\u0135\u0136\7<\2\2\u0136\u013b"+
		"\78\2\2\u0137\u0138\7\r\2\2\u0138\u0139\7\62\2\2\u0139\u013b\78\2\2\u013a"+
		"\u0134\3\2\2\2\u013a\u0137\3\2\2\2\u013b\63\3\2\2\2\u013c\u013d\7\32\2"+
		"\2\u013d\u013e\7<\2\2\u013e\u0143\78\2\2\u013f\u0140\7\17\2\2\u0140\u0141"+
		"\7\62\2\2\u0141\u0143\78\2\2\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143"+
		"\65\3\2\2\2\u0144\u0145\7\30\2\2\u0145\u0146\7\65\2\2\u0146\u0147\78\2"+
		"\2\u0147\67\3\2\2\2\u0148\u0149\7*\2\2\u0149\u014a\7\63\2\2\u014a\u014b"+
		"\7\67\2\2\u014b9\3\2\2\2\u014c\u014d\7\23\2\2\u014d\u014e\7\60\2\2\u014e"+
		"\u015e\78\2\2\u014f\u0150\7\t\2\2\u0150\u0151\7\64\2\2\u0151\u015e\78"+
		"\2\2\u0152\u0153\7\36\2\2\u0153\u0154\7\33\2\2\u0154\u0155\7\66\2\2\u0155"+
		"\u015e\78\2\2\u0156\u0157\7\3\2\2\u0157\u0158\7\33\2\2\u0158\u0159\7\66"+
		"\2\2\u0159\u015e\78\2\2\u015a\u015b\7\22\2\2\u015b\u015c\7/\2\2\u015c"+
		"\u015e\78\2\2\u015d\u014c\3\2\2\2\u015d\u014f\3\2\2\2\u015d\u0152\3\2"+
		"\2\2\u015d\u0156\3\2\2\2\u015d\u015a\3\2\2\2\u015e;\3\2\2\2#@DIV]hpw}"+
		"\u0084\u0090\u0092\u00a2\u00a9\u00b0\u00b9\u00c3\u00c5\u00d3\u00d9\u00df"+
		"\u00e5\u00eb\u00f7\u0105\u0109\u0110\u0113\u0126\u0132\u013a\u0142\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}