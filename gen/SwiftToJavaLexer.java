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
		ASSIGN=10, PLUS=11, MINUS=12, EQUAL=13, NEQUAL=14, GREATER=15, GROREQ=16, 
		LESS=17, LESSOREQ=18, XOR=19, AND=20, OR=21, NOT=22, MULT=23, MOD=24, 
		QUEST=25, COLON=26, RANGE=27, RANGEB=28, ID=29, INT=30, FL=31, STRING=32, 
		LCURBR=33, RCURBR=34, LBR=35, RBR=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VAR", "FOR", "IN", "BREAK", "IF", "ELSE", "PRINT", "INTEGER", "FLOAT", 
		"ASSIGN", "PLUS", "MINUS", "EQUAL", "NEQUAL", "GREATER", "GROREQ", "LESS", 
		"LESSOREQ", "XOR", "AND", "OR", "NOT", "MULT", "MOD", "QUEST", "COLON", 
		"RANGE", "RANGEB", "ID", "DIGIT", "INT", "FL", "QUOTATIONMARK", "STRING", 
		"LCURBR", "RCURBR", "LBR", "RBR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'for'", "'in'", "'break'", "'if'", "'else'", "'print'", 
		"'Int'", "'Float'", "'='", "'+'", "'-'", "'=='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'^'", "'&&'", "'||'", "'!'", "'*'", "'%'", "'?'", "':'", 
		"'...'", "'..<'", null, null, null, null, "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "FOR", "IN", "BREAK", "IF", "ELSE", "PRINT", "INTEGER", "FLOAT", 
		"ASSIGN", "PLUS", "MINUS", "EQUAL", "NEQUAL", "GREATER", "GROREQ", "LESS", 
		"LESSOREQ", "XOR", "AND", "OR", "NOT", "MULT", "MOD", "QUEST", "COLON", 
		"RANGE", "RANGEB", "ID", "INT", "FL", "STRING", "LCURBR", "RCURBR", "LBR", 
		"RBR", "WS"
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
		case 28:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\6\36\u00ac\n\36\r\36\16\36\u00ad\3"+
		"\36\3\36\3\37\3\37\3 \6 \u00b5\n \r \16 \u00b6\3!\6!\u00ba\n!\r!\16!\u00bb"+
		"\3!\3!\6!\u00c0\n!\r!\16!\u00c1\3\"\3\"\3#\3#\6#\u00c8\n#\r#\16#\u00c9"+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\6(\u00d7\n(\r(\16(\u00d8\3(\3(\2\2"+
		")\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"=\2? A!C\2E\"G#I$K%M&O\'\3\2\6\5\2C\\aac|\3\2\62;\3\2$$\6\2\13\f\17\17"+
		"\"\"==\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7Y\3\2\2"+
		"\2\t\\\3\2\2\2\13b\3\2\2\2\re\3\2\2\2\17j\3\2\2\2\21p\3\2\2\2\23t\3\2"+
		"\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0083\3\2"+
		"\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u0090"+
		"\3\2\2\2)\u0092\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61"+
		"\u009c\3\2\2\2\63\u009e\3\2\2\2\65\u00a0\3\2\2\2\67\u00a2\3\2\2\29\u00a6"+
		"\3\2\2\2;\u00ab\3\2\2\2=\u00b1\3\2\2\2?\u00b4\3\2\2\2A\u00b9\3\2\2\2C"+
		"\u00c3\3\2\2\2E\u00c5\3\2\2\2G\u00cd\3\2\2\2I\u00cf\3\2\2\2K\u00d1\3\2"+
		"\2\2M\u00d3\3\2\2\2O\u00d6\3\2\2\2QR\7x\2\2RS\7c\2\2ST\7t\2\2T\4\3\2\2"+
		"\2UV\7h\2\2VW\7q\2\2WX\7t\2\2X\6\3\2\2\2YZ\7k\2\2Z[\7p\2\2[\b\3\2\2\2"+
		"\\]\7d\2\2]^\7t\2\2^_\7g\2\2_`\7c\2\2`a\7m\2\2a\n\3\2\2\2bc\7k\2\2cd\7"+
		"h\2\2d\f\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\16\3\2\2\2jk\7r"+
		"\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7v\2\2o\20\3\2\2\2pq\7K\2\2qr\7p\2\2"+
		"rs\7v\2\2s\22\3\2\2\2tu\7H\2\2uv\7n\2\2vw\7q\2\2wx\7c\2\2xy\7v\2\2y\24"+
		"\3\2\2\2z{\7?\2\2{\26\3\2\2\2|}\7-\2\2}\30\3\2\2\2~\177\7/\2\2\177\32"+
		"\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2\2\u0082\34\3\2\2\2\u0083"+
		"\u0084\7#\2\2\u0084\u0085\7?\2\2\u0085\36\3\2\2\2\u0086\u0087\7@\2\2\u0087"+
		" \3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a\7?\2\2\u008a\"\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c$\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f"+
		"&\3\2\2\2\u0090\u0091\7`\2\2\u0091(\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0094"+
		"\7(\2\2\u0094*\3\2\2\2\u0095\u0096\7~\2\2\u0096\u0097\7~\2\2\u0097,\3"+
		"\2\2\2\u0098\u0099\7#\2\2\u0099.\3\2\2\2\u009a\u009b\7,\2\2\u009b\60\3"+
		"\2\2\2\u009c\u009d\7\'\2\2\u009d\62\3\2\2\2\u009e\u009f\7A\2\2\u009f\64"+
		"\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3"+
		"\u00a4\7\60\2\2\u00a4\u00a5\7\60\2\2\u00a58\3\2\2\2\u00a6\u00a7\7\60\2"+
		"\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\7>\2\2\u00a9:\3\2\2\2\u00aa\u00ac"+
		"\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\36\2\2\u00b0<\3\2\2\2"+
		"\u00b1\u00b2\t\3\2\2\u00b2>\3\2\2\2\u00b3\u00b5\5=\37\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"@\3\2\2\2\u00b8\u00ba\5=\37\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\7\60\2\2\u00be\u00c0\5=\37\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7"+
		"$\2\2\u00c4D\3\2\2\2\u00c5\u00c7\5C\"\2\u00c6\u00c8\n\4\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\5C\"\2\u00ccF\3\2\2\2\u00cd\u00ce\7}\2\2\u00ce"+
		"H\3\2\2\2\u00cf\u00d0\7\177\2\2\u00d0J\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2"+
		"L\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4N\3\2\2\2\u00d5\u00d7\t\5\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b(\3\2\u00dbP\3\2\2\2\t\2\u00ad\u00b6"+
		"\u00bb\u00c1\u00c9\u00d8\4\3\36\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}