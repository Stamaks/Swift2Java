// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftToJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, FOR=2, IN=3, BREAK=4, IF=5, ELSE=6, PRINT=7, INTEGER=8, FLOAT=9, 
		ASSIGN=10, PLUS=11, MINUS=12, EQUAL=13, GREATER=14, GROREQ=15, LESS=16, 
		LESSOREQ=17, XOR=18, AND=19, OR=20, NOT=21, MULT=22, MOD=23, QUEST=24, 
		COLON=25, SCOLON=26, ID=27, INT=28, FL=29, STRING=30, LCURBR=31, RCURBR=32, 
		LRBR=33, RBR=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "FOR", "IN", "BREAK", "IF", "ELSE", "PRINT", "INTEGER", "FLOAT", 
		"ASSIGN", "PLUS", "MINUS", "EQUAL", "GREATER", "GROREQ", "LESS", "LESSOREQ", 
		"XOR", "AND", "OR", "NOT", "MULT", "MOD", "QUEST", "COLON", "SCOLON", 
		"ID", "DIGIT", "INT", "FL", "QUOTATIONMARK", "STRING", "LCURBR", "RCURBR", 
		"LRBR", "RBR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'for'", "'in'", "'break'", "'if'", "'else'", "'print'", 
		"'Int'", "'Float'", "'='", "'+'", "'-'", "'=='", "'>'", "'>='", "'<'", 
		"'<='", "'^'", "'&&'", "'||'", "'!'", "'*'", "'%'", "'?'", "':'", "';'", 
		null, null, null, null, "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FOR", "IN", "BREAK", "IF", "ELSE", "PRINT", "INTEGER", "FLOAT", 
		"ASSIGN", "PLUS", "MINUS", "EQUAL", "GREATER", "GROREQ", "LESS", "LESSOREQ", 
		"XOR", "AND", "OR", "NOT", "MULT", "MOD", "QUEST", "COLON", "SCOLON", 
		"ID", "INT", "FL", "STRING", "LCURBR", "RCURBR", "LRBR", "RBR", "WS"
	};
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




	public SwiftToJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftToJava.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 Skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u009f\n\34\r\34\16"+
		"\34\u00a0\3\34\3\34\3\35\3\35\3\36\6\36\u00a8\n\36\r\36\16\36\u00a9\3"+
		"\37\6\37\u00ad\n\37\r\37\16\37\u00ae\3\37\3\37\6\37\u00b3\n\37\r\37\16"+
		"\37\u00b4\3 \3 \3!\3!\6!\u00bb\n!\r!\16!\u00bc\3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\6&\u00ca\n&\r&\16&\u00cb\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\36=\37?\2A C!E\"G#I$K%\3"+
		"\2\6\4\2C\\c|\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u00d2\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5Q"+
		"\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13^\3\2\2\2\ra\3\2\2\2\17f\3\2\2\2\21l"+
		"\3\2\2\2\23p\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33|\3\2\2\2\35"+
		"\177\3\2\2\2\37\u0081\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0089\3\2"+
		"\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0095"+
		"\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3"+
		"\2\2\29\u00a4\3\2\2\2;\u00a7\3\2\2\2=\u00ac\3\2\2\2?\u00b6\3\2\2\2A\u00b8"+
		"\3\2\2\2C\u00c0\3\2\2\2E\u00c2\3\2\2\2G\u00c4\3\2\2\2I\u00c6\3\2\2\2K"+
		"\u00c9\3\2\2\2MN\7x\2\2NO\7c\2\2OP\7t\2\2P\4\3\2\2\2QR\7h\2\2RS\7q\2\2"+
		"ST\7t\2\2T\6\3\2\2\2UV\7k\2\2VW\7p\2\2W\b\3\2\2\2XY\7d\2\2YZ\7t\2\2Z["+
		"\7g\2\2[\\\7c\2\2\\]\7m\2\2]\n\3\2\2\2^_\7k\2\2_`\7h\2\2`\f\3\2\2\2ab"+
		"\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\16\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7k"+
		"\2\2ij\7p\2\2jk\7v\2\2k\20\3\2\2\2lm\7K\2\2mn\7p\2\2no\7v\2\2o\22\3\2"+
		"\2\2pq\7H\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7v\2\2u\24\3\2\2\2vw\7?\2\2"+
		"w\26\3\2\2\2xy\7-\2\2y\30\3\2\2\2z{\7/\2\2{\32\3\2\2\2|}\7?\2\2}~\7?\2"+
		"\2~\34\3\2\2\2\177\u0080\7@\2\2\u0080\36\3\2\2\2\u0081\u0082\7@\2\2\u0082"+
		"\u0083\7?\2\2\u0083 \3\2\2\2\u0084\u0085\7>\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7>\2\2\u0087\u0088\7?\2\2\u0088$\3\2\2\2\u0089\u008a\7`\2\2\u008a"+
		"&\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d(\3\2\2\2\u008e\u008f"+
		"\7~\2\2\u008f\u0090\7~\2\2\u0090*\3\2\2\2\u0091\u0092\7#\2\2\u0092,\3"+
		"\2\2\2\u0093\u0094\7,\2\2\u0094.\3\2\2\2\u0095\u0096\7\'\2\2\u0096\60"+
		"\3\2\2\2\u0097\u0098\7A\2\2\u0098\62\3\2\2\2\u0099\u009a\7<\2\2\u009a"+
		"\64\3\2\2\2\u009b\u009c\7=\2\2\u009c\66\3\2\2\2\u009d\u009f\t\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\34\2\2\u00a38\3\2\2\2\u00a4\u00a5"+
		"\t\3\2\2\u00a5:\3\2\2\2\u00a6\u00a8\59\35\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa<\3\2\2\2"+
		"\u00ab\u00ad\59\35\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\7\60\2\2"+
		"\u00b1\u00b3\59\35\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7@"+
		"\3\2\2\2\u00b8\u00ba\5? \2\u00b9\u00bb\n\4\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\5? \2\u00bfB\3\2\2\2\u00c0\u00c1\7}\2\2\u00c1D\3\2\2"+
		"\2\u00c2\u00c3\7\177\2\2\u00c3F\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5H\3\2"+
		"\2\2\u00c6\u00c7\7+\2\2\u00c7J\3\2\2\2\u00c8\u00ca\t\5\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\b&\3\2\u00ceL\3\2\2\2\t\2\u00a0\u00a9\u00ae"+
		"\u00b4\u00bc\u00cb\4\3\34\2\3&\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}