// Generated from VolText.g4 by ANTLR 4.9
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "ORIENTATION", "TXTATF", "COLORVAL", "SVAL", "TFVAL", 
			"POSVAL", "NVAL", "ENDLINE", "ENDNLINE", "O", "A", "C", "STRING", "WS"
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


	public VolTextLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u018a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0119"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012f\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u0140\n \r \16"+
		" \u0141\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u014d\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0161\n\"\3#\6#\u0164"+
		"\n#\r#\16#\u0165\3#\3#\6#\u016a\n#\r#\16#\u016b\5#\u016e\n#\3$\3$\3$\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\6)\u017e\n)\r)\16)\u017f\3)\3)\3*\6"+
		"*\u0185\n*\r*\16*\u0186\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\5"+
		"\2\62;CHch\4\2C\\c|\3\2\62;\4\2\13\f\17\17\5\2\13\f\17\17\"\"\2\u019b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5\\\3\2\2\2\7d\3\2\2\2\tj\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17"+
		"|\3\2\2\2\21\u0080\3\2\2\2\23\u0084\3\2\2\2\25\u0089\3\2\2\2\27\u008e"+
		"\3\2\2\2\31\u0096\3\2\2\2\33\u009b\3\2\2\2\35\u00a1\3\2\2\2\37\u00a7\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00bc\3\2\2\2%\u00c2\3\2\2\2\'\u00c8\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00d0\3\2\2\2-\u00d4\3\2\2\2/\u00e1\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00f2\3\2\2\2\65\u00fc\3\2\2\2\67\u0109\3\2\2\29\u0118\3\2\2\2;\u012e"+
		"\3\2\2\2=\u0130\3\2\2\2?\u013f\3\2\2\2A\u014c\3\2\2\2C\u0160\3\2\2\2E"+
		"\u0163\3\2\2\2G\u016f\3\2\2\2I\u0172\3\2\2\2K\u0174\3\2\2\2M\u0177\3\2"+
		"\2\2O\u0179\3\2\2\2Q\u017b\3\2\2\2S\u0184\3\2\2\2UV\7v\2\2VW\7k\2\2WX"+
		"\7v\2\2XY\7n\2\2YZ\7g\2\2Z[\7<\2\2[\4\3\2\2\2\\]\7c\2\2]^\7w\2\2^_\7v"+
		"\2\2_`\7j\2\2`a\7q\2\2ab\7t\2\2bc\7<\2\2c\6\3\2\2\2de\7r\2\2ef\7c\2\2"+
		"fg\7v\2\2gh\7j\2\2hi\7<\2\2i\b\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7{\2\2mn\7"+
		"n\2\2no\7g\2\2op\7u\2\2pq\7j\2\2qr\7g\2\2rs\7g\2\2st\7v\2\2t\n\3\2\2\2"+
		"uv\7B\2\2v\f\3\2\2\2wx\7r\2\2xy\7c\2\2yz\7i\2\2z{\7g\2\2{\16\3\2\2\2|"+
		"}\7f\2\2}~\7k\2\2~\177\7x\2\2\177\20\3\2\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7o\2\2\u0082\u0083\7i\2\2\u0083\22\3\2\2\2\u0084\u0085\7W\2\2\u0085"+
		"\u0086\7T\2\2\u0086\u0087\7N\2\2\u0087\u0088\7<\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7z\2\2\u008c\u008d\7v\2\2"+
		"\u008d\26\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7v\2\2\u0090\u0091\7"+
		"t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7i\2\2\u0094\u0095"+
		"\7<\2\2\u0095\30\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7u\2\2\u0099\u009a\7v\2\2\u009a\32\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7<\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7/\2\2\u00a5\u00a6\7z\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\7{\2\2"+
		"\u00ac \3\2\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7i\2"+
		"\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\"\3\2\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7/\2\2\u00be\u00bf\7k"+
		"\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7i\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\7y\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7o\2\2\u00c6"+
		"\u00c7\7i\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7{\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\7<\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\u00d3\7<\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7h\2\2"+
		"\u00da\u00db\7c\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7{\2\2\u00df\u00e0\7<\2\2\u00e0.\3\2\2\2\u00e1\u00e2"+
		"\7h\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7/\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7|\2\2"+
		"\u00e9\u00ea\7g\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7"+
		"q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1"+
		"\7<\2\2\u00f1\62\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5"+
		"\7u\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7<\2\2\u00fb\64\3\2\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7g\2\2"+
		"\u0100\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7c\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\7<\2\2\u0108\66\3\2\2\2\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010b"+
		"\u010c\7f\2\2\u010c\u010d\7g\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2"+
		"\u010f\u0110\7f\2\2\u0110\u0111\7<\2\2\u01118\3\2\2\2\u0112\u0113\7j\2"+
		"\2\u0113\u0114\7q\2\2\u0114\u0119\7t\2\2\u0115\u0116\7x\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0119\7t\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		":\3\2\2\2\u011a\u011b\7d\2\2\u011b\u011c\7q\2\2\u011c\u011d\7n\2\2\u011d"+
		"\u012f\7f\2\2\u011e\u011f\7k\2\2\u011f\u0120\7v\2\2\u0120\u0121\7c\2\2"+
		"\u0121\u0122\7n\2\2\u0122\u0123\7k\2\2\u0123\u0124\7e\2\2\u0124\u012f"+
		"\7u\2\2\u0125\u0126\7w\2\2\u0126\u0127\7p\2\2\u0127\u0128\7f\2\2\u0128"+
		"\u0129\7g\2\2\u0129\u012a\7t\2\2\u012a\u012b\7n\2\2\u012b\u012c\7k\2\2"+
		"\u012c\u012d\7p\2\2\u012d\u012f\7g\2\2\u012e\u011a\3\2\2\2\u012e\u011e"+
		"\3\2\2\2\u012e\u0125\3\2\2\2\u012f<\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132"+
		"\7%\2\2\u0132\u0133\3\2\2\2\u0133\u0134\t\2\2\2\u0134\u0135\t\2\2\2\u0135"+
		"\u0136\t\2\2\2\u0136\u0137\t\2\2\2\u0137\u0138\t\2\2\2\u0138\u0139\t\2"+
		"\2\2\u0139\u013a\t\2\2\2\u013a\u013b\t\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\7$\2\2\u013d>\3\2\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142@\3\2\2\2"+
		"\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7w\2\2\u0146\u014d"+
		"\7g\2\2\u0147\u0148\7h\2\2\u0148\u0149\7c\2\2\u0149\u014a\7n\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014d\7g\2\2\u014c\u0143\3\2\2\2\u014c\u0147\3\2\2"+
		"\2\u014dB\3\2\2\2\u014e\u014f\7n\2\2\u014f\u0161\7w\2\2\u0150\u0151\7"+
		"e\2\2\u0151\u0161\7w\2\2\u0152\u0153\7t\2\2\u0153\u0161\7w\2\2\u0154\u0155"+
		"\7n\2\2\u0155\u0161\7e\2\2\u0156\u0157\7e\2\2\u0157\u0161\7e\2\2\u0158"+
		"\u0159\7t\2\2\u0159\u0161\7e\2\2\u015a\u015b\7n\2\2\u015b\u0161\7d\2\2"+
		"\u015c\u015d\7e\2\2\u015d\u0161\7d\2\2\u015e\u015f\7t\2\2\u015f\u0161"+
		"\7d\2\2\u0160\u014e\3\2\2\2\u0160\u0150\3\2\2\2\u0160\u0152\3\2\2\2\u0160"+
		"\u0154\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u015a\3\2"+
		"\2\2\u0160\u015c\3\2\2\2\u0160\u015e\3\2\2\2\u0161D\3\2\2\2\u0162\u0164"+
		"\t\4\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u016d\3\2\2\2\u0167\u0169\7\60\2\2\u0168\u016a\t"+
		"\4\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0167\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016eF\3\2\2\2\u016f\u0170\7$\2\2\u0170\u0171\7=\2\2\u0171H\3\2\2"+
		"\2\u0172\u0173\7=\2\2\u0173J\3\2\2\2\u0174\u0175\7<\2\2\u0175\u0176\7"+
		"}\2\2\u0176L\3\2\2\2\u0177\u0178\7}\2\2\u0178N\3\2\2\2\u0179\u017a\7\177"+
		"\2\2\u017aP\3\2\2\2\u017b\u017d\7$\2\2\u017c\u017e\n\5\2\2\u017d\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\7$\2\2\u0182R\3\2\2\2\u0183\u0185\t\6\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b*\2\2\u0189T\3\2\2\2\r\2\u0118\u012e"+
		"\u0141\u014c\u0160\u0165\u016b\u016d\u017f\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}