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
		T__17=18, T__18=19, TXTATF=20, COLORVAL=21, SVAL=22, TFVAL=23, IMGANUMBER=24, 
		POSVAL=25, NVAL=26, ENDLINE=27, ENDNLINE=28, O=29, A=30, C=31, SPECIALC=32, 
		STRING=33, URL=34, URL2=35, VAL=36, WS=37;
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
			"T__17", "T__18", "TXTATF", "COLORVAL", "SVAL", "TFVAL", "IMGANUMBER", 
			"POSVAL", "NVAL", "ENDLINE", "ENDNLINE", "O", "A", "C", "SPECIALC", "STRING", 
			"URL", "URL2", "VAL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0198\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27"+
		"\u00fa\n\27\r\27\16\27\u00fb\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013b"+
		"\n\32\3\33\6\33\u013e\n\33\r\33\16\33\u013f\3\33\3\33\6\33\u0144\n\33"+
		"\r\33\16\33\u0145\5\33\u0148\n\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u016a\n!\3\"\3\"\6\"\u016e\n\"\r\"\16\"\u016f\3\"\3\"\3"+
		"#\3#\3#\3#\5#\u0178\n#\3#\3#\3#\3#\3#\5#\u017f\n#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u018b\n$\3%\6%\u018e\n%\r%\16%\u018f\3&\6&\u0193\n&\r&\16"+
		"&\u0194\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\n\5\2\62;CHch\4\2C\\c|\4\2"+
		"hhvv\3\2\62;\4\2\13\f\17\17\3\2\61\61\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\2\u01b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3\2\2\2\7]\3\2\2\2\th"+
		"\3\2\2\2\13m\3\2\2\2\rq\3\2\2\2\17u\3\2\2\2\21{\3\2\2\2\23\u0080\3\2\2"+
		"\2\25\u0086\3\2\2\2\27\u008b\3\2\2\2\31\u0091\3\2\2\2\33\u0096\3\2\2\2"+
		"\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!\u00b1\3\2\2\2#\u00bf\3\2\2\2%\u00c9"+
		"\3\2\2\2\'\u00d0\3\2\2\2)\u00ee\3\2\2\2+\u00f0\3\2\2\2-\u00f9\3\2\2\2"+
		"/\u00fd\3\2\2\2\61\u0126\3\2\2\2\63\u013a\3\2\2\2\65\u013d\3\2\2\2\67"+
		"\u0149\3\2\2\29\u014c\3\2\2\2;\u014e\3\2\2\2=\u0151\3\2\2\2?\u0153\3\2"+
		"\2\2A\u0169\3\2\2\2C\u016b\3\2\2\2E\u017e\3\2\2\2G\u018a\3\2\2\2I\u018d"+
		"\3\2\2\2K\u0192\3\2\2\2MN\7v\2\2NO\7k\2\2OP\7v\2\2PQ\7n\2\2QR\7g\2\2R"+
		"S\7<\2\2S\4\3\2\2\2TU\7c\2\2UV\7w\2\2VW\7v\2\2WX\7j\2\2XY\7q\2\2YZ\7t"+
		"\2\2Z[\7<\2\2[\\\7$\2\2\\\6\3\2\2\2]^\7u\2\2^_\7v\2\2_`\7{\2\2`a\7n\2"+
		"\2ab\7g\2\2bc\7u\2\2cd\7j\2\2de\7g\2\2ef\7g\2\2fg\7v\2\2g\b\3\2\2\2hi"+
		"\7r\2\2ij\7c\2\2jk\7i\2\2kl\7g\2\2l\n\3\2\2\2mn\7f\2\2no\7k\2\2op\7x\2"+
		"\2p\f\3\2\2\2qr\7k\2\2rs\7o\2\2st\7i\2\2t\16\3\2\2\2uv\7W\2\2vw\7T\2\2"+
		"wx\7N\2\2xy\7<\2\2yz\7$\2\2z\20\3\2\2\2{|\7v\2\2|}\7g\2\2}~\7z\2\2~\177"+
		"\7v\2\2\177\22\3\2\2\2\u0080\u0081\7V\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7z\2\2\u0083\u0084\7v\2\2\u0084\u0085\7<\2\2\u0085\24\3\2\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7k\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7o\2\2\u008f\u0090\7<\2\2\u0090\30\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7f\2\2\u0093\u0094\7<\2\2\u0094\u0095\7$\2\2\u0095\32\3\2\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2\u0099\u009a\7n\2\2"+
		"\u009a\u009b\7g\2\2\u009b\u009c\7/\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7<\2\2"+
		"\u00a5\34\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7q\2"+
		"\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7<\2\2\u00b0"+
		" \3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2"+
		"\u00b8\u00b9\7o\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc"+
		"\7{\2\2\u00bc\u00bd\7<\2\2\u00bd\u00be\7$\2\2\u00be\"\3\2\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7/\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7|\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7q\2"+
		"\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf"+
		"\7<\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6"+
		"\u00d7\7q\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7<\2\2\u00d9(\3\2\2\2\u00da"+
		"\u00db\7d\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd\u00ef\7f\2\2"+
		"\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7n\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7e\2\2\u00e4\u00ef\7u\2\2\u00e5"+
		"\u00e6\7w\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7t\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ef\7g\2\2\u00ee\u00da\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee"+
		"\u00e5\3\2\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7%\2\2\u00f1\u00f2\t\2\2\2\u00f2"+
		"\u00f3\t\2\2\2\u00f3\u00f4\t\2\2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f6\t\2"+
		"\2\2\u00f6\u00f7\t\2\2\2\u00f7,\3\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		".\3\2\2\2\u00fd\u00fe\t\4\2\2\u00fe\60\3\2\2\2\u00ff\u0100\7r\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7u\2\2\u0102\u0103\7/\2\2\u0103\u0127\7z\2\2"+
		"\u0104\u0105\7r\2\2\u0105\u0106\7q\2\2\u0106\u0107\7u\2\2\u0107\u0108"+
		"\7/\2\2\u0108\u0127\7{\2\2\u0109\u010a\7c\2\2\u010a\u010b\7p\2\2\u010b"+
		"\u010c\7i\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\u010f\7/\2\2"+
		"\u010f\u0110\7t\2\2\u0110\u0111\7q\2\2\u0111\u0112\7v\2\2\u0112\u0113"+
		"\7c\2\2\u0113\u0114\7v\2\2\u0114\u0115\7k\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0127\7p\2\2\u0117\u0118\7j\2\2\u0118\u0119\7/\2\2\u0119\u011a\7k\2\2"+
		"\u011a\u011b\7o\2\2\u011b\u0127\7i\2\2\u011c\u011d\7y\2\2\u011d\u011e"+
		"\7/\2\2\u011e\u011f\7k\2\2\u011f\u0120\7o\2\2\u0120\u0127\7i\2\2\u0121"+
		"\u0122\7n\2\2\u0122\u0123\7c\2\2\u0123\u0124\7{\2\2\u0124\u0125\7g\2\2"+
		"\u0125\u0127\7t\2\2\u0126\u00ff\3\2\2\2\u0126\u0104\3\2\2\2\u0126\u0109"+
		"\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0121\3\2\2\2\u0127"+
		"\62\3\2\2\2\u0128\u0129\7n\2\2\u0129\u013b\7w\2\2\u012a\u012b\7e\2\2\u012b"+
		"\u013b\7w\2\2\u012c\u012d\7t\2\2\u012d\u013b\7w\2\2\u012e\u012f\7n\2\2"+
		"\u012f\u013b\7e\2\2\u0130\u0131\7e\2\2\u0131\u013b\7e\2\2\u0132\u0133"+
		"\7t\2\2\u0133\u013b\7e\2\2\u0134\u0135\7n\2\2\u0135\u013b\7d\2\2\u0136"+
		"\u0137\7e\2\2\u0137\u013b\7d\2\2\u0138\u0139\7t\2\2\u0139\u013b\7d\2\2"+
		"\u013a\u0128\3\2\2\2\u013a\u012a\3\2\2\2\u013a\u012c\3\2\2\2\u013a\u012e"+
		"\3\2\2\2\u013a\u0130\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0134\3\2\2\2\u013a"+
		"\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b\64\3\2\2\2\u013c\u013e\t\5\2"+
		"\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0147\3\2\2\2\u0141\u0143\7\60\2\2\u0142\u0144\t\5\2\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\66\3\2\2\2\u0149\u014a\7$\2\2\u014a\u014b\7=\2\2\u014b8\3\2\2\2\u014c"+
		"\u014d\7=\2\2\u014d:\3\2\2\2\u014e\u014f\7<\2\2\u014f\u0150\7}\2\2\u0150"+
		"<\3\2\2\2\u0151\u0152\7}\2\2\u0152>\3\2\2\2\u0153\u0154\7\177\2\2\u0154"+
		"@\3\2\2\2\u0155\u0156\7r\2\2\u0156\u0157\7i\2\2\u0157\u016a\7c\2\2\u0158"+
		"\u0159\7r\2\2\u0159\u015a\7i\2\2\u015a\u016a\7e\2\2\u015b\u015c\7u\2\2"+
		"\u015c\u016a\7s\2\2\u015d\u015e\7f\2\2\u015e\u016a\7s\2\2\u015f\u0160"+
		"\7d\2\2\u0160\u016a\7u\2\2\u0161\u0162\7f\2\2\u0162\u016a\7r\2\2\u0163"+
		"\u0164\7r\2\2\u0164\u016a\7x\2\2\u0165\u0166\7r\2\2\u0166\u016a\7r\2\2"+
		"\u0167\u0168\7u\2\2\u0168\u016a\7u\2\2\u0169\u0155\3\2\2\2\u0169\u0158"+
		"\3\2\2\2\u0169\u015b\3\2\2\2\u0169\u015d\3\2\2\2\u0169\u015f\3\2\2\2\u0169"+
		"\u0161\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016aB\3\2\2\2\u016b\u016d\7$\2\2\u016c\u016e\n\6\2\2\u016d\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\7$\2\2\u0172D\3\2\2\2\u0173\u0174\5I%\2\u0174"+
		"\u0175\7<\2\2\u0175\u0177\7\61\2\2\u0176\u0178\t\7\2\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u017f\3\2\2\2\u0179\u017a\7\60\2\2\u017a"+
		"\u017f\7\61\2\2\u017b\u017c\7\60\2\2\u017c\u017d\7\60\2\2\u017d\u017f"+
		"\7\61\2\2\u017e\u0173\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017b\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0181\5G$\2\u0181F\3\2\2\2\u0182\u0183\5I%"+
		"\2\u0183\u0184\7\61\2\2\u0184\u0185\5G$\2\u0185\u018b\3\2\2\2\u0186\u0187"+
		"\5I%\2\u0187\u0188\7\60\2\2\u0188\u0189\5I%\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0182\3\2\2\2\u018a\u0186\3\2\2\2\u018bH\3\2\2\2\u018c\u018e\t\b\2\2"+
		"\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190J\3\2\2\2\u0191\u0193\t\t\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\b&\2\2\u0197L\3\2\2\2\22\2\u00ee\u00fb\u0126\u013a\u013f"+
		"\u0145\u0147\u0169\u016f\u0177\u017e\u018a\u018d\u018f\u0194\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}