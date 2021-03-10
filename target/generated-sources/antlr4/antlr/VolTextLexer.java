// Generated from VolText.g4 by ANTLR 4.4

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VolTextLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		NOTVAL=33, UNIT=34, FORMATVAL=35, ORIENTATION=36, TXTATF=37, COLORVAL=38, 
		ALIGNVAL=39, TFVAL=40, POSVAL=41, NVAL=42, ENDLINE=43, ENDNLINE=44, O=45, 
		A=46, C=47, STRING=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'"
	};
	public static final String[] ruleNames = {
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NOTVAL", 
		"UNIT", "FORMATVAL", "ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", 
		"TFVAL", "POSVAL", "NVAL", "ENDLINE", "ENDNLINE", "O", "A", "C", "STRING", 
		"WS"
	};


	public VolTextLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u01f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3#\3#\3#\3#\3#\5#\u0158\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\5$\u0168\n$\3%\3%\3%\3%\3%\3%\5%\u0170\n%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0186\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\5(\u01a8\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01b3"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01c7\n*"+
		"\3+\6+\u01ca\n+\r+\16+\u01cb\3+\3+\6+\u01d0\n+\r+\16+\u01d1\5+\u01d4\n"+
		"+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\6\61\u01e4\n\61\r"+
		"\61\16\61\u01e5\3\61\3\61\3\62\6\62\u01eb\n\62\r\62\16\62\u01ec\3\62\3"+
		"\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\6\5"+
		"\2\62;CHch\3\2\62;\4\2\13\f\17\17\5\2\13\f\17\17\"\"\u020b\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\3e\3\2\2\2\5l\3\2\2\2\7p\3\2\2\2\tt\3\2\2\2\13\u0084\3\2\2\2\r\u0089"+
		"\3\2\2\2\17\u008f\3\2\2\2\21\u009a\3\2\2\2\23\u00a3\3\2\2\2\25\u00a8\3"+
		"\2\2\2\27\u00af\3\2\2\2\31\u00b5\3\2\2\2\33\u00bb\3\2\2\2\35\u00c7\3\2"+
		"\2\2\37\u00cf\3\2\2\2!\u00dc\3\2\2\2#\u00e3\3\2\2\2%\u00f2\3\2\2\2\'\u00fc"+
		"\3\2\2\2)\u0101\3\2\2\2+\u0103\3\2\2\2-\u0108\3\2\2\2/\u010e\3\2\2\2\61"+
		"\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u011e\3\2\2\2\67\u0124\3\2\2\29\u0129"+
		"\3\2\2\2;\u012d\3\2\2\2=\u0135\3\2\2\2?\u0140\3\2\2\2A\u0146\3\2\2\2C"+
		"\u0150\3\2\2\2E\u0157\3\2\2\2G\u0167\3\2\2\2I\u016f\3\2\2\2K\u0185\3\2"+
		"\2\2M\u0187\3\2\2\2O\u01a7\3\2\2\2Q\u01b2\3\2\2\2S\u01c6\3\2\2\2U\u01c9"+
		"\3\2\2\2W\u01d5\3\2\2\2Y\u01d8\3\2\2\2[\u01da\3\2\2\2]\u01dd\3\2\2\2_"+
		"\u01df\3\2\2\2a\u01e1\3\2\2\2c\u01ea\3\2\2\2ef\7j\2\2fg\7g\2\2gh\7k\2"+
		"\2hi\7i\2\2ij\7j\2\2jk\7v\2\2k\4\3\2\2\2lm\7k\2\2mn\7o\2\2no\7i\2\2o\6"+
		"\3\2\2\2pq\7k\2\2qr\7f\2\2rs\7<\2\2s\b\3\2\2\2tu\7h\2\2uv\7q\2\2vw\7p"+
		"\2\2wx\7v\2\2xy\7/\2\2yz\7h\2\2z{\7c\2\2{|\7o\2\2|}\7k\2\2}~\7n\2\2~\177"+
		"\7{\2\2\177\u0080\7/\2\2\u0080\u0081\7v\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7h\2\2\u0083\n\3\2\2\2\u0084\u0085\7q\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7d\2\2\u0087\u0088\7<\2\2\u0088\f\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7o\2\2\u008d\u008e\7<\2\2\u008e"+
		"\16\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7{\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\u0095\7u\2\2\u0095\u0096\7j\2\2"+
		"\u0096\u0097\7g\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099\20\3\2"+
		"\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7f\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad\u00ae\7<\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7"+
		"k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\7{\2\2\u00b4\30"+
		"\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7/\2\2\u00b9\u00ba\7z\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7/\2\2"+
		"\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7{\2\2\u00c6\34\3\2\2\2\u00c7\u00c8"+
		"\7h\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7o\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7<\2\2\u00ce\36\3\2\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7"+
		"\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7<\2\2\u00db \3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7v\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7<\2\2"+
		"\u00e2\"\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7i"+
		"\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7c\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7p\2\2"+
		"\u00f1$\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7u\2"+
		"\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7<\2\2\u00fb&\3\2\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7g\2\2\u0100"+
		"(\3\2\2\2\u0101\u0102\7<\2\2\u0102*\3\2\2\2\u0103\u0104\7W\2\2\u0104\u0105"+
		"\7T\2\2\u0105\u0106\7N\2\2\u0106\u0107\7<\2\2\u0107,\3\2\2\2\u0108\u0109"+
		"\7y\2\2\u0109\u010a\7k\2\2\u010a\u010b\7f\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7j\2\2\u010d.\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7i\2\2"+
		"\u0114\u0115\7<\2\2\u0115\60\3\2\2\2\u0116\u0117\7B\2\2\u0117\62\3\2\2"+
		"\2\u0118\u0119\7r\2\2\u0119\u011a\7q\2\2\u011a\u011b\7u\2\2\u011b\u011c"+
		"\7/\2\2\u011c\u011d\7{\2\2\u011d\64\3\2\2\2\u011e\u011f\7h\2\2\u011f\u0120"+
		"\7k\2\2\u0120\u0121\7v\2\2\u0121\u0122\7/\2\2\u0122\u0123\7z\2\2\u0123"+
		"\66\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7g\2\2\u0126\u0127\7z\2\2\u0127"+
		"\u0128\7v\2\2\u01288\3\2\2\2\u0129\u012a\7f\2\2\u012a\u012b\7k\2\2\u012b"+
		"\u012c\7x\2\2\u012c:\3\2\2\2\u012d\u012e\7c\2\2\u012e\u012f\7w\2\2\u012f"+
		"\u0130\7v\2\2\u0130\u0131\7j\2\2\u0131\u0132\7q\2\2\u0132\u0133\7t\2\2"+
		"\u0133\u0134\7<\2\2\u0134<\3\2\2\2\u0135\u0136\7c\2\2\u0136\u0137\7n\2"+
		"\2\u0137\u0138\7k\2\2\u0138\u0139\7i\2\2\u0139\u013a\7p\2\2\u013a\u013b"+
		"\7o\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7<\2\2\u013f>\3\2\2\2\u0140\u0141\7r\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144\u0145\7<\2\2\u0145@\3\2\2\2\u0146"+
		"\u0147\7h\2\2\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2"+
		"\u014a\u014b\7/\2\2\u014b\u014c\7u\2\2\u014c\u014d\7k\2\2\u014d\u014e"+
		"\7|\2\2\u014e\u014f\7g\2\2\u014fB\3\2\2\2\u0150\u0151\7/\2\2\u0151D\3"+
		"\2\2\2\u0152\u0153\7o\2\2\u0153\u0158\7o\2\2\u0154\u0158\7\'\2\2\u0155"+
		"\u0156\7r\2\2\u0156\u0158\7v\2\2\u0157\u0152\3\2\2\2\u0157\u0154\3\2\2"+
		"\2\u0157\u0155\3\2\2\2\u0158F\3\2\2\2\u0159\u015a\7C\2\2\u015a\u0168\7"+
		"\62\2\2\u015b\u015c\7C\2\2\u015c\u0168\7\63\2\2\u015d\u015e\7C\2\2\u015e"+
		"\u0168\7\64\2\2\u015f\u0160\7C\2\2\u0160\u0168\7\65\2\2\u0161\u0162\7"+
		"C\2\2\u0162\u0168\7\66\2\2\u0163\u0164\7C\2\2\u0164\u0168\7\67\2\2\u0165"+
		"\u0166\7C\2\2\u0166\u0168\78\2\2\u0167\u0159\3\2\2\2\u0167\u015b\3\2\2"+
		"\2\u0167\u015d\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0163"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168H\3\2\2\2\u0169\u016a\7j\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u0170\7t\2\2\u016c\u016d\7x\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u0170\7t\2\2\u016f\u0169\3\2\2\2\u016f\u016c\3\2\2\2\u0170J\3\2\2\2\u0171"+
		"\u0172\7d\2\2\u0172\u0173\7q\2\2\u0173\u0174\7n\2\2\u0174\u0186\7f\2\2"+
		"\u0175\u0176\7k\2\2\u0176\u0177\7v\2\2\u0177\u0178\7c\2\2\u0178\u0179"+
		"\7n\2\2\u0179\u017a\7k\2\2\u017a\u017b\7e\2\2\u017b\u0186\7u\2\2\u017c"+
		"\u017d\7w\2\2\u017d\u017e\7p\2\2\u017e\u017f\7f\2\2\u017f\u0180\7g\2\2"+
		"\u0180\u0181\7t\2\2\u0181\u0182\7n\2\2\u0182\u0183\7k\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0186\7g\2\2\u0185\u0171\3\2\2\2\u0185\u0175\3\2\2\2\u0185"+
		"\u017c\3\2\2\2\u0186L\3\2\2\2\u0187\u0188\7%\2\2\u0188\u0189\t\2\2\2\u0189"+
		"\u018a\t\2\2\2\u018a\u018b\t\2\2\2\u018b\u018c\t\2\2\2\u018c\u018d\t\2"+
		"\2\2\u018d\u018e\t\2\2\2\u018e\u018f\t\2\2\2\u018f\u0190\t\2\2\2\u0190"+
		"N\3\2\2\2\u0191\u0192\7n\2\2\u0192\u0193\7g\2\2\u0193\u0194\7h\2\2\u0194"+
		"\u01a8\7v\2\2\u0195\u0196\7e\2\2\u0196\u0197\7g\2\2\u0197\u0198\7p\2\2"+
		"\u0198\u0199\7v\2\2\u0199\u019a\7g\2\2\u019a\u01a8\7t\2\2\u019b\u019c"+
		"\7t\2\2\u019c\u019d\7k\2\2\u019d\u019e\7i\2\2\u019e\u019f\7j\2\2\u019f"+
		"\u01a8\7v\2\2\u01a0\u01a1\7l\2\2\u01a1\u01a2\7w\2\2\u01a2\u01a3\7u\2\2"+
		"\u01a3\u01a4\7v\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a8"+
		"\7{\2\2\u01a7\u0191\3\2\2\2\u01a7\u0195\3\2\2\2\u01a7\u019b\3\2\2\2\u01a7"+
		"\u01a0\3\2\2\2\u01a8P\3\2\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7t\2\2\u01ab"+
		"\u01ac\7w\2\2\u01ac\u01b3\7g\2\2\u01ad\u01ae\7h\2\2\u01ae\u01af\7c\2\2"+
		"\u01af\u01b0\7n\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b3\7g\2\2\u01b2\u01a9"+
		"\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b3R\3\2\2\2\u01b4\u01b5\7n\2\2\u01b5\u01c7"+
		"\7v\2\2\u01b6\u01b7\7e\2\2\u01b7\u01c7\7v\2\2\u01b8\u01b9\7t\2\2\u01b9"+
		"\u01c7\7v\2\2\u01ba\u01bb\7n\2\2\u01bb\u01c7\7e\2\2\u01bc\u01bd\7e\2\2"+
		"\u01bd\u01c7\7e\2\2\u01be\u01bf\7t\2\2\u01bf\u01c7\7e\2\2\u01c0\u01c1"+
		"\7n\2\2\u01c1\u01c7\7d\2\2\u01c2\u01c3\7e\2\2\u01c3\u01c7\7d\2\2\u01c4"+
		"\u01c5\7t\2\2\u01c5\u01c7\7d\2\2\u01c6\u01b4\3\2\2\2\u01c6\u01b6\3\2\2"+
		"\2\u01c6\u01b8\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c6\u01be"+
		"\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"T\3\2\2\2\u01c8\u01ca\t\3\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d3\3\2\2\2\u01cd\u01cf"+
		"\7\60\2\2\u01ce\u01d0\t\3\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cd"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4V\3\2\2\2\u01d5\u01d6\7$\2\2\u01d6\u01d7"+
		"\7=\2\2\u01d7X\3\2\2\2\u01d8\u01d9\7=\2\2\u01d9Z\3\2\2\2\u01da\u01db\7"+
		"<\2\2\u01db\u01dc\7}\2\2\u01dc\\\3\2\2\2\u01dd\u01de\7}\2\2\u01de^\3\2"+
		"\2\2\u01df\u01e0\7\177\2\2\u01e0`\3\2\2\2\u01e1\u01e3\7$\2\2\u01e2\u01e4"+
		"\n\4\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7$\2\2\u01e8b\3\2\2\2\u01e9"+
		"\u01eb\t\5\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\b\62\2\2\u01ef"+
		"d\3\2\2\2\17\2\u0157\u0167\u016f\u0185\u01a7\u01b2\u01c6\u01cb\u01d1\u01d3"+
		"\u01e5\u01ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}