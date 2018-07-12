// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftToJavaParser extends Parser {
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
	public static final int
		RULE_startRule = 0, RULE_initialization = 1, RULE_rightFloatValue = 2;
	public static final String[] ruleNames = {
		"startRule", "initialization", "rightFloatValue"
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

	@Override
	public String getGrammarFileName() { return "SwiftToJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		static String prefixCodeGen = "public class Main\n{\n\tpublic static void main(String args[]){\n";

	    static String suffixCodeGen = "\t}\n}";

	    public static void main(String args[]){
	        // create a CharStream that reads from standard input
	        ANTLRInputStream input = new ANTLRInputStream(System.in);
	        // create a lexer that feeds off of input CharStream
	        ArrayInitLexer lexer = new ArrayInitLexer(input);
	        // create a buffer of tokens pulled from the lexer
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        // create a parser that feeds off the tokens buffer
	        ArrayInitParser parser = new ArrayInitParser(tokens);

	        sout(prefixCodeGen);
	        ParseTree tree = parser.init();
	        sout(suffixCodeGen);

	        // begin parsing at init rule
	        // print LISP-style tree
	        //System.out.println(tree.toStringTree(parser));
	    }

	    public static void sout(String str){
	        System.out.print(str);
	    }

	public SwiftToJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartRuleContext extends ParserRuleContext {
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(6);
				initialization();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InitializationContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR() { return getToken(SwiftToJavaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SwiftToJavaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SwiftToJavaParser.COLON, 0); }
		public TerminalNode FLOAT() { return getToken(SwiftToJavaParser.FLOAT, 0); }
		public TerminalNode ASSIGN() { return getToken(SwiftToJavaParser.ASSIGN, 0); }
		public RightFloatValueContext rightFloatValue() {
			return getRuleContext(RightFloatValueContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(VAR);
			setState(13);
			((InitializationContext)_localctx).ID = match(ID);
			setState(14);
			match(COLON);
			setState(15);
			match(FLOAT);
			setState(16);
			match(ASSIGN);

			        sout("\t\tfloat " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
			    
			setState(18);
			rightFloatValue();
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

	public static class RightFloatValueContext extends ParserRuleContext {
		public Token FL;
		public Token INT;
		public List<TerminalNode> FL() { return getTokens(SwiftToJavaParser.FL); }
		public TerminalNode FL(int i) {
			return getToken(SwiftToJavaParser.FL, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SwiftToJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SwiftToJavaParser.PLUS, i);
		}
		public List<TerminalNode> INT() { return getTokens(SwiftToJavaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SwiftToJavaParser.INT, i);
		}
		public RightFloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightFloatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterRightFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitRightFloatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitRightFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightFloatValueContext rightFloatValue() throws RecognitionException {
		RightFloatValueContext _localctx = new RightFloatValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rightFloatValue);
		int _la;
		try {
			int _alt;
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FL:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				((RightFloatValueContext)_localctx).FL = match(FL);
				sout((((RightFloatValueContext)_localctx).FL!=null?((RightFloatValueContext)_localctx).FL.getText():null))
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(22);
						match(PLUS);
						setState(23);
						((RightFloatValueContext)_localctx).FL = match(FL);
						sout(" + " + (((RightFloatValueContext)_localctx).FL!=null?((RightFloatValueContext)_localctx).FL.getText():null))
						setState(30);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(25);
								match(PLUS);
								setState(26);
								((RightFloatValueContext)_localctx).INT = match(INT);
								sout(" + " + (((RightFloatValueContext)_localctx).INT!=null?((RightFloatValueContext)_localctx).INT.getText():null))
								}
								} 
							}
							setState(32);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						}
						}
						} 
					}
					setState(37);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(38);
					match(PLUS);
					setState(39);
					((RightFloatValueContext)_localctx).INT = match(INT);
					sout(" + " + (((RightFloatValueContext)_localctx).INT!=null?((RightFloatValueContext)_localctx).INT.getText():null))
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(41);
							match(PLUS);
							setState(42);
							((RightFloatValueContext)_localctx).FL = match(FL);
							sout(" + " + (((RightFloatValueContext)_localctx).FL!=null?((RightFloatValueContext)_localctx).FL.getText():null))
							}
							} 
						}
						setState(48);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				sout(";\n")
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((RightFloatValueContext)_localctx).INT = match(INT);
				sout((((RightFloatValueContext)_localctx).INT!=null?((RightFloatValueContext)_localctx).INT.getText():null))
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						match(PLUS);
						setState(58);
						((RightFloatValueContext)_localctx).FL = match(FL);
						sout(" + " + (((RightFloatValueContext)_localctx).FL!=null?((RightFloatValueContext)_localctx).FL.getText():null))
						setState(65);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(60);
								match(PLUS);
								setState(61);
								((RightFloatValueContext)_localctx).INT = match(INT);
								sout(" + " + (((RightFloatValueContext)_localctx).INT!=null?((RightFloatValueContext)_localctx).INT.getText():null))
								}
								} 
							}
							setState(67);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						}
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(73);
					match(PLUS);
					setState(74);
					((RightFloatValueContext)_localctx).INT = match(INT);
					sout(" + " + (((RightFloatValueContext)_localctx).INT!=null?((RightFloatValueContext)_localctx).INT.getText():null))
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(76);
							match(PLUS);
							setState(77);
							((RightFloatValueContext)_localctx).FL = match(FL);
							sout(" + " + (((RightFloatValueContext)_localctx).FL!=null?((RightFloatValueContext)_localctx).FL.getText():null))
							}
							} 
						}
						setState(83);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				sout(";\n")
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%_\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4"+
		"\16\4E\13\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f"+
		"\4\16\4U\13\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\5\4]\n\4\3\4\2\2\5\2\4\6\2\2"+
		"\2e\2\13\3\2\2\2\4\16\3\2\2\2\6\\\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r"+
		"\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\3"+
		"\2\2\17\20\7\35\2\2\20\21\7\33\2\2\21\22\7\13\2\2\22\23\7\f\2\2\23\24"+
		"\b\3\1\2\24\25\5\6\4\2\25\5\3\2\2\2\26\27\7\37\2\2\27%\b\4\1\2\30\31\7"+
		"\r\2\2\31\32\7\37\2\2\32 \b\4\1\2\33\34\7\r\2\2\34\35\7\36\2\2\35\37\b"+
		"\4\1\2\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3"+
		"\2\2\2#\30\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\65\3\2\2\2\'%\3\2\2"+
		"\2()\7\r\2\2)*\7\36\2\2*\60\b\4\1\2+,\7\r\2\2,-\7\37\2\2-/\b\4\1\2.+\3"+
		"\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2"+
		"\2\63(\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"\65\3\2\2\28]\b\4\1\29:\7\36\2\2:H\b\4\1\2;<\7\r\2\2<=\7\37\2\2=C\b\4"+
		"\1\2>?\7\r\2\2?@\7\36\2\2@B\b\4\1\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DG\3\2\2\2EC\3\2\2\2F;\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IX\3"+
		"\2\2\2JH\3\2\2\2KL\7\r\2\2LM\7\36\2\2MS\b\4\1\2NO\7\r\2\2OP\7\37\2\2P"+
		"R\b\4\1\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"VK\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[]\b\4\1\2"+
		"\\\26\3\2\2\2\\9\3\2\2\2]\7\3\2\2\2\f\13 %\60\65CHSX\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}