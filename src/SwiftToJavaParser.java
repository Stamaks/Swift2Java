// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7

    import java.util.*;
    import javax.management.openmbean.KeyAlreadyExistsException;

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
		ASSIGN=10, PLUS=11, MINUS=12, EQUAL=13, NEQUAL=14, GREATER=15, GROREQ=16, 
		LESS=17, LESSOREQ=18, XOR=19, AND=20, OR=21, NOT=22, MULT=23, MOD=24, 
		QUEST=25, COLON=26, RANGE=27, RANGEB=28, ID=29, INT=30, FL=31, STRING=32, 
		LCURBR=33, RCURBR=34, LBR=35, RBR=36, WS=37;
	public static final int
		RULE_startRule = 0, RULE_initialization = 1, RULE_varChange = 2, RULE_forCycle = 3, 
		RULE_ifStatAverage = 4, RULE_ifStatCycle = 5, RULE_printCom = 6, RULE_possibleBlocks = 7, 
		RULE_boolForm = 8, RULE_breakRule = 9, RULE_floatValue = 10, RULE_intValue = 11;
	public static final String[] ruleNames = {
		"startRule", "initialization", "varChange", "forCycle", "ifStatAverage", 
		"ifStatCycle", "printCom", "possibleBlocks", "boolForm", "breakRule", 
		"floatValue", "intValue"
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

	    static Map<String, String> table = new HashMap<>();

	    static ArrayList<String> reservedNames = new ArrayList<String>(
	                           Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case",
	                                   "catch", "char", "class", "const", "continue", "default", "double", "do", "else", "enum",
	                                   "extends", "false",
	                           "final", "finally", "float", "for", "goto", "if",
	                           "implements", "import", "instanceof", "int", "interface", "long",
	                           "native", "new", "null", "package", "private", "protected",
	                           "public", "return", "short", "static", "strictfp", "super",
	                           "switch", "synchronized", "this", "throw", "throws", "transient",
	                           "true", "try", "void", "volatile", "while"));

	//    public static void main(String args[]){
	//        CharStream input = CharStreams.fromStream(System.in);
	//        // create a lexer that feeds off of input CharStream
	//        SwiftToJavaLexer lexer = new SwiftToJavaLexer(input);
	//        // create a buffer of tokens pulled from the lexer
	//        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
	//        // create a parser that feeds off the tokens buffer
	//        SwiftToJavaParser parser = new SwiftToJavaParser(tokens);
	//
	//        sout(prefixCodeGen);
	//        ParseTree tree = parser.startRule();
	//        sout(suffixCodeGen);
	//
	//    }

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
		public List<ForCycleContext> forCycle() {
			return getRuleContexts(ForCycleContext.class);
		}
		public ForCycleContext forCycle(int i) {
			return getRuleContext(ForCycleContext.class,i);
		}
		public List<IfStatAverageContext> ifStatAverage() {
			return getRuleContexts(IfStatAverageContext.class);
		}
		public IfStatAverageContext ifStatAverage(int i) {
			return getRuleContext(IfStatAverageContext.class,i);
		}
		public List<VarChangeContext> varChange() {
			return getRuleContexts(VarChangeContext.class);
		}
		public VarChangeContext varChange(int i) {
			return getRuleContext(VarChangeContext.class,i);
		}
		public List<PrintComContext> printCom() {
			return getRuleContexts(PrintComContext.class);
		}
		public PrintComContext printCom(int i) {
			return getRuleContext(PrintComContext.class,i);
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
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(24);
					initialization();
					}
					break;
				case FOR:
					{
					setState(25);
					forCycle();
					}
					break;
				case IF:
					{
					setState(26);
					ifStatAverage();
					}
					break;
				case ID:
					{
					setState(27);
					varChange();
					}
					break;
				case PRINT:
					{
					setState(28);
					printCom();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
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
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(SwiftToJavaParser.INTEGER, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
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
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initialization);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(VAR);
				setState(35);
				((InitializationContext)_localctx).ID = match(ID);
				setState(36);
				match(COLON);
				setState(37);
				match(FLOAT);
				setState(38);
				match(ASSIGN);

				        if (table.containsKey((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null))) {
				            throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
				                                                ": variable " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " is already assigned!");
				        }
				        if (reservedNames.contains((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null)))
				            table.put("_" + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "float");
				        else
				            table.put((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "float");
				        sout("\t\tfloat " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
				    
				setState(40);
				floatValue();
				sout(";\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(VAR);
				setState(44);
				((InitializationContext)_localctx).ID = match(ID);
				setState(45);
				match(COLON);
				setState(46);
				match(INTEGER);
				setState(47);
				match(ASSIGN);

				        if (table.containsKey((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null))) {
				                    throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
				                                                        ": variable " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " is already assigned!");
				        }
				        table.put((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "int");
				        sout("\t\tint " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
				    
				setState(49);
				intValue();
				sout(";\n");
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

	public static class VarChangeContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(SwiftToJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SwiftToJavaParser.ASSIGN, 0); }
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public FloatValueContext floatValue() {
			return getRuleContext(FloatValueContext.class,0);
		}
		public VarChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterVarChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitVarChange(this);
		}
	}

	public final VarChangeContext varChange() throws RecognitionException {
		VarChangeContext _localctx = new VarChangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((VarChangeContext)_localctx).ID = match(ID);
			setState(55);
			match(ASSIGN);

			        sout("\t\t" + (((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null) + " = ");
			    
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				intValue();
				}
				break;
			case 2:
				{
				setState(58);
				floatValue();
				}
				break;
			}
			sout(";\n");
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

	public static class ForCycleContext extends ParserRuleContext {
		public Token i;
		public Token a;
		public Token b;
		public TerminalNode RCURBR() { return getToken(SwiftToJavaParser.RCURBR, 0); }
		public TerminalNode FOR() { return getToken(SwiftToJavaParser.FOR, 0); }
		public TerminalNode IN() { return getToken(SwiftToJavaParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(SwiftToJavaParser.RANGE, 0); }
		public TerminalNode LCURBR() { return getToken(SwiftToJavaParser.LCURBR, 0); }
		public TerminalNode RANGEB() { return getToken(SwiftToJavaParser.RANGEB, 0); }
		public List<TerminalNode> ID() { return getTokens(SwiftToJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftToJavaParser.ID, i);
		}
		public List<PossibleBlocksContext> possibleBlocks() {
			return getRuleContexts(PossibleBlocksContext.class);
		}
		public PossibleBlocksContext possibleBlocks(int i) {
			return getRuleContext(PossibleBlocksContext.class,i);
		}
		public List<IfStatCycleContext> ifStatCycle() {
			return getRuleContexts(IfStatCycleContext.class);
		}
		public IfStatCycleContext ifStatCycle(int i) {
			return getRuleContext(IfStatCycleContext.class,i);
		}
		public List<BreakRuleContext> breakRule() {
			return getRuleContexts(BreakRuleContext.class);
		}
		public BreakRuleContext breakRule(int i) {
			return getRuleContext(BreakRuleContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(SwiftToJavaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SwiftToJavaParser.INT, i);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitForCycle(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(63);
				match(FOR);
				setState(64);
				((ForCycleContext)_localctx).i = match(ID);
				setState(65);
				match(IN);
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(66);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(67);
					((ForCycleContext)_localctx).a = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70);
				match(RANGE);
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(71);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(72);
					((ForCycleContext)_localctx).b = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				match(LCURBR);

				        sout("\t\tfor (int " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " = " + (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " <= " + (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + "++) {\n\t\t\t");
				    
				}
				break;
			case 2:
				{
				setState(77);
				match(FOR);
				setState(78);
				((ForCycleContext)_localctx).i = match(ID);
				setState(79);
				match(IN);
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(80);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(81);
					((ForCycleContext)_localctx).a = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84);
				match(RANGEB);
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(85);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(86);
					((ForCycleContext)_localctx).b = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89);
				match(LCURBR);

				        sout("\t\tfor (int " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " = " + (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " < " + (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + "++) {\n\t\t\t");
				    
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case FOR:
				case PRINT:
				case ID:
					{
					setState(93);
					possibleBlocks();
					}
					break;
				case IF:
					{
					setState(94);
					ifStatCycle();
					}
					break;
				case BREAK:
					{
					setState(95);
					breakRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RCURBR);

			        sout("\t\t}");
			    
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

	public static class IfStatAverageContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SwiftToJavaParser.IF, 0); }
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public BoolFormContext boolForm() {
			return getRuleContext(BoolFormContext.class,0);
		}
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public List<PossibleBlocksContext> possibleBlocks() {
			return getRuleContexts(PossibleBlocksContext.class);
		}
		public PossibleBlocksContext possibleBlocks(int i) {
			return getRuleContext(PossibleBlocksContext.class,i);
		}
		public List<IfStatAverageContext> ifStatAverage() {
			return getRuleContexts(IfStatAverageContext.class);
		}
		public IfStatAverageContext ifStatAverage(int i) {
			return getRuleContext(IfStatAverageContext.class,i);
		}
		public List<TerminalNode> LCURBR() { return getTokens(SwiftToJavaParser.LCURBR); }
		public TerminalNode LCURBR(int i) {
			return getToken(SwiftToJavaParser.LCURBR, i);
		}
		public List<TerminalNode> RCURBR() { return getTokens(SwiftToJavaParser.RCURBR); }
		public TerminalNode RCURBR(int i) {
			return getToken(SwiftToJavaParser.RCURBR, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftToJavaParser.ELSE, 0); }
		public IfStatAverageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatAverage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterIfStatAverage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitIfStatAverage(this);
		}
	}

	public final IfStatAverageContext ifStatAverage() throws RecognitionException {
		IfStatAverageContext _localctx = new IfStatAverageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatAverage);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				match(IF);
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(105);
					match(LBR);
					sout("\t\tif (");
					setState(107);
					boolForm();
					setState(108);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(111);
					boolForm();
					setState(112);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(117);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(118);
					ifStatAverage();
					}
					break;
				}
				sout("\n");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IF);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(124);
					match(LBR);
					sout("\t\tif (");
					setState(126);
					boolForm();
					setState(127);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(130);
					boolForm();
					setState(131);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(137);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(138);
						ifStatAverage();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(RCURBR);
				sout("}\n");
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(147);
					match(ELSE);
					setState(148);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(152);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(150);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(151);
							ifStatAverage();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(157);
					match(RCURBR);
					sout("}\n");
					}
					break;
				case 3:
					{
					setState(159);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(161);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(162);
						ifStatAverage();
						}
						break;
					}
					sout("\n");
					}
					break;
				}
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

	public static class IfStatCycleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SwiftToJavaParser.IF, 0); }
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public BoolFormContext boolForm() {
			return getRuleContext(BoolFormContext.class,0);
		}
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public List<PossibleBlocksContext> possibleBlocks() {
			return getRuleContexts(PossibleBlocksContext.class);
		}
		public PossibleBlocksContext possibleBlocks(int i) {
			return getRuleContext(PossibleBlocksContext.class,i);
		}
		public List<IfStatCycleContext> ifStatCycle() {
			return getRuleContexts(IfStatCycleContext.class);
		}
		public IfStatCycleContext ifStatCycle(int i) {
			return getRuleContext(IfStatCycleContext.class,i);
		}
		public List<BreakRuleContext> breakRule() {
			return getRuleContexts(BreakRuleContext.class);
		}
		public BreakRuleContext breakRule(int i) {
			return getRuleContext(BreakRuleContext.class,i);
		}
		public List<TerminalNode> LCURBR() { return getTokens(SwiftToJavaParser.LCURBR); }
		public TerminalNode LCURBR(int i) {
			return getToken(SwiftToJavaParser.LCURBR, i);
		}
		public List<TerminalNode> RCURBR() { return getTokens(SwiftToJavaParser.RCURBR); }
		public TerminalNode RCURBR(int i) {
			return getToken(SwiftToJavaParser.RCURBR, i);
		}
		public TerminalNode ELSE() { return getToken(SwiftToJavaParser.ELSE, 0); }
		public IfStatCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterIfStatCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitIfStatCycle(this);
		}
	}

	public final IfStatCycleContext ifStatCycle() throws RecognitionException {
		IfStatCycleContext _localctx = new IfStatCycleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatCycle);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(170);
				match(IF);
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(171);
					match(LBR);
					sout("\t\tif (");
					setState(173);
					boolForm();
					setState(174);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(177);
					boolForm();
					setState(178);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(183);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(184);
					ifStatCycle();
					}
					break;
				case 3:
					{
					setState(185);
					breakRule();
					}
					break;
				}
				sout("\n");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(IF);
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(191);
					match(LBR);
					sout("\t\tif (");
					setState(193);
					boolForm();
					setState(194);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(197);
					boolForm();
					setState(198);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(204);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(205);
						ifStatCycle();
						}
						break;
					case BREAK:
						{
						setState(206);
						breakRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(RCURBR);
				sout("}\n");
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(215);
					match(ELSE);
					setState(216);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(221);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(218);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(219);
							ifStatCycle();
							}
							break;
						case BREAK:
							{
							setState(220);
							breakRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					match(RCURBR);
					sout("}\n");
					}
					break;
				case 3:
					{
					setState(228);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(230);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(231);
						ifStatCycle();
						}
						break;
					case 3:
						{
						setState(232);
						breakRule();
						}
						break;
					}
					sout("\n");
					}
					break;
				}
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

	public static class PrintComContext extends ParserRuleContext {
		public Token STRING;
		public Token ID;
		public TerminalNode PRINT() { return getToken(SwiftToJavaParser.PRINT, 0); }
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public List<TerminalNode> STRING() { return getTokens(SwiftToJavaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SwiftToJavaParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(SwiftToJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftToJavaParser.ID, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SwiftToJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SwiftToJavaParser.PLUS, i);
		}
		public PrintComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterPrintCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitPrintCom(this);
		}
	}

	public final PrintComContext printCom() throws RecognitionException {
		PrintComContext _localctx = new PrintComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printCom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PRINT);
			setState(241);
			match(LBR);
			sout("\t\tSystem.out.println(");
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(243);
				((PrintComContext)_localctx).STRING = match(STRING);
				sout((((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
				{
				setState(245);
				((PrintComContext)_localctx).ID = match(ID);
				sout((((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null));
				}
				break;
			case PLUS:
			case RBR:
				break;
			default:
				break;
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(249);
					match(PLUS);
					setState(250);
					((PrintComContext)_localctx).ID = match(ID);
					sout(" + " + (((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null));
					}
					break;
				case 2:
					{
					setState(252);
					match(PLUS);
					setState(253);
					((PrintComContext)_localctx).STRING = match(STRING);
					sout(" + " + (((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
					}
					break;
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(RBR);
			sout(");\n");
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

	public static class PossibleBlocksContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public VarChangeContext varChange() {
			return getRuleContext(VarChangeContext.class,0);
		}
		public PrintComContext printCom() {
			return getRuleContext(PrintComContext.class,0);
		}
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public PossibleBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterPossibleBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitPossibleBlocks(this);
		}
	}

	public final PossibleBlocksContext possibleBlocks() throws RecognitionException {
		PossibleBlocksContext _localctx = new PossibleBlocksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_possibleBlocks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(263);
				initialization();
				}
				break;
			case ID:
				{
				setState(264);
				varChange();
				}
				break;
			case PRINT:
				{
				setState(265);
				printCom();
				}
				break;
			case FOR:
				{
				setState(266);
				forCycle();
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

	public static class BoolFormContext extends ParserRuleContext {
		public Token s;
		public TerminalNode NOT() { return getToken(SwiftToJavaParser.NOT, 0); }
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public BoolFormContext boolForm() {
			return getRuleContext(BoolFormContext.class,0);
		}
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public List<IntValueContext> intValue() {
			return getRuleContexts(IntValueContext.class);
		}
		public IntValueContext intValue(int i) {
			return getRuleContext(IntValueContext.class,i);
		}
		public List<FloatValueContext> floatValue() {
			return getRuleContexts(FloatValueContext.class);
		}
		public FloatValueContext floatValue(int i) {
			return getRuleContext(FloatValueContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SwiftToJavaParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(SwiftToJavaParser.NEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SwiftToJavaParser.GREATER, 0); }
		public TerminalNode GROREQ() { return getToken(SwiftToJavaParser.GROREQ, 0); }
		public TerminalNode LESS() { return getToken(SwiftToJavaParser.LESS, 0); }
		public TerminalNode LESSOREQ() { return getToken(SwiftToJavaParser.LESSOREQ, 0); }
		public BoolFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterBoolForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitBoolForm(this);
		}
	}

	public final BoolFormContext boolForm() throws RecognitionException {
		BoolFormContext _localctx = new BoolFormContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolForm);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(NOT);
				setState(270);
				match(LBR);
				sout("!(");
				setState(272);
				boolForm();
				setState(273);
				match(RBR);
				sout(")");
				}
				break;
			case ID:
			case INT:
			case FL:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(276);
					intValue();
					}
					break;
				case 2:
					{
					setState(277);
					floatValue();
					}
					break;
				}
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(280);
					((BoolFormContext)_localctx).s = match(EQUAL);
					}
					break;
				case NEQUAL:
					{
					setState(281);
					((BoolFormContext)_localctx).s = match(NEQUAL);
					}
					break;
				case GREATER:
					{
					setState(282);
					((BoolFormContext)_localctx).s = match(GREATER);
					}
					break;
				case GROREQ:
					{
					setState(283);
					((BoolFormContext)_localctx).s = match(GROREQ);
					}
					break;
				case LESS:
					{
					setState(284);
					((BoolFormContext)_localctx).s = match(LESS);
					}
					break;
				case LESSOREQ:
					{
					setState(285);
					((BoolFormContext)_localctx).s = match(LESSOREQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" " + (((BoolFormContext)_localctx).s!=null?((BoolFormContext)_localctx).s.getText():null) + " ");
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(289);
					intValue();
					}
					break;
				case 2:
					{
					setState(290);
					floatValue();
					}
					break;
				}
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

	public static class BreakRuleContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(SwiftToJavaParser.BREAK, 0); }
		public BreakRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterBreakRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitBreakRule(this);
		}
	}

	public final BreakRuleContext breakRule() throws RecognitionException {
		BreakRuleContext _localctx = new BreakRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(BREAK);
			sout("\t\t\tbreak;\n");
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

	public static class FloatValueContext extends ParserRuleContext {
		public Token FL;
		public Token INT;
		public Token ID;
		public Token s;
		public Token a;
		public List<TerminalNode> FL() { return getTokens(SwiftToJavaParser.FL); }
		public TerminalNode FL(int i) {
			return getToken(SwiftToJavaParser.FL, i);
		}
		public List<TerminalNode> INT() { return getTokens(SwiftToJavaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SwiftToJavaParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(SwiftToJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftToJavaParser.ID, i);
		}
		public List<TerminalNode> LBR() { return getTokens(SwiftToJavaParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(SwiftToJavaParser.LBR, i);
		}
		public List<TerminalNode> RBR() { return getTokens(SwiftToJavaParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(SwiftToJavaParser.RBR, i);
		}
		public List<IntValueContext> intValue() {
			return getRuleContexts(IntValueContext.class);
		}
		public IntValueContext intValue(int i) {
			return getRuleContext(IntValueContext.class,i);
		}
		public List<FloatValueContext> floatValue() {
			return getRuleContexts(FloatValueContext.class);
		}
		public FloatValueContext floatValue(int i) {
			return getRuleContext(FloatValueContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SwiftToJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SwiftToJavaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SwiftToJavaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SwiftToJavaParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(SwiftToJavaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SwiftToJavaParser.MULT, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SwiftToJavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SwiftToJavaParser.MOD, i);
		}
		public FloatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitFloatValue(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FL:
				{
				setState(298);
				((FloatValueContext)_localctx).FL = match(FL);
				sout((((FloatValueContext)_localctx).FL!=null?((FloatValueContext)_localctx).FL.getText():null) + "f");
				}
				break;
			case INT:
				{
				setState(300);
				((FloatValueContext)_localctx).INT = match(INT);
				sout((((FloatValueContext)_localctx).INT!=null?((FloatValueContext)_localctx).INT.getText():null) + "f");
				}
				break;
			case ID:
				{
				setState(302);
				((FloatValueContext)_localctx).ID = match(ID);
				sout((((FloatValueContext)_localctx).ID!=null?((FloatValueContext)_localctx).ID.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(310);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(306);
						((FloatValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(307);
						((FloatValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(308);
						((FloatValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(309);
						((FloatValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(315);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FL:
						{
						setState(312);
						((FloatValueContext)_localctx).a = match(FL);
						}
						break;
					case INT:
						{
						setState(313);
						((FloatValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(314);
						((FloatValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((FloatValueContext)_localctx).s!=null?((FloatValueContext)_localctx).s.getText():null) + " " + (((FloatValueContext)_localctx).a!=null?((FloatValueContext)_localctx).a.getText():null));
					}
					break;
				case LBR:
					{
					setState(318);
					match(LBR);
					sout(" (");
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(320);
						intValue();
						}
						break;
					case 2:
						{
						setState(321);
						floatValue();
						}
						break;
					}
					setState(324);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(333);
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

	public static class IntValueContext extends ParserRuleContext {
		public Token a;
		public Token s;
		public List<TerminalNode> INT() { return getTokens(SwiftToJavaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SwiftToJavaParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(SwiftToJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftToJavaParser.ID, i);
		}
		public List<TerminalNode> LBR() { return getTokens(SwiftToJavaParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(SwiftToJavaParser.LBR, i);
		}
		public List<IntValueContext> intValue() {
			return getRuleContexts(IntValueContext.class);
		}
		public IntValueContext intValue(int i) {
			return getRuleContext(IntValueContext.class,i);
		}
		public List<TerminalNode> RBR() { return getTokens(SwiftToJavaParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(SwiftToJavaParser.RBR, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SwiftToJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SwiftToJavaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SwiftToJavaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SwiftToJavaParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(SwiftToJavaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SwiftToJavaParser.MULT, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SwiftToJavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SwiftToJavaParser.MOD, i);
		}
		public List<TerminalNode> OR() { return getTokens(SwiftToJavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SwiftToJavaParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(SwiftToJavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SwiftToJavaParser.AND, i);
		}
		public List<TerminalNode> XOR() { return getTokens(SwiftToJavaParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(SwiftToJavaParser.XOR, i);
		}
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitIntValue(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(334);
				((IntValueContext)_localctx).a = match(INT);
				}
				break;
			case ID:
				{
				setState(335);
				((IntValueContext)_localctx).a = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			sout((((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null));
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << XOR) | (1L << AND) | (1L << OR) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(343);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(339);
						((IntValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(340);
						((IntValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(341);
						((IntValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(342);
						((IntValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(347);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(345);
						((IntValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(346);
						((IntValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null));
					}
					break;
				case XOR:
				case AND:
				case OR:
					{
					setState(353);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR:
						{
						setState(350);
						((IntValueContext)_localctx).s = match(OR);
						}
						break;
					case AND:
						{
						setState(351);
						((IntValueContext)_localctx).s = match(AND);
						}
						break;
					case XOR:
						{
						setState(352);
						((IntValueContext)_localctx).s = match(XOR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(357);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(355);
						((IntValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(356);
						((IntValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null));
					}
					break;
				case LBR:
					{
					setState(360);
					match(LBR);
					sout(" (");
					setState(362);
					intValue();
					setState(363);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(372);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\67\n\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5G"+
		"\n\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3\5\3\5"+
		"\3\5\5\5Z\n\5\3\5\3\5\5\5^\n\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\6\3\6\3\6"+
		"\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0088\n"+
		"\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00a6\n\6\3\6\5\6\u00a9\n\6\5\6\u00ab\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cb\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00d2\n\7\f\7\16\7\u00d5\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00e0\n\7\f\7\16\7\u00e3\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00ec\n\7\3\7\5\7\u00ef\n\7\5\7\u00f1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00fa\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0102\n\b\f\b\16\b\u0105\13"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u010e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0119\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0121\n\n\3\n\3\n"+
		"\3\n\5\n\u0126\n\n\5\n\u0128\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0133\n\f\3\f\3\f\3\f\3\f\5\f\u0139\n\f\3\f\3\f\3\f\5\f\u013e\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0145\n\f\3\f\3\f\3\f\5\f\u014a\n\f\7\f\u014c"+
		"\n\f\f\f\16\f\u014f\13\f\3\r\3\r\5\r\u0153\n\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u015a\n\r\3\r\3\r\5\r\u015e\n\r\3\r\3\r\3\r\3\r\5\r\u0164\n\r\3\r\3\r"+
		"\5\r\u0168\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0171\n\r\7\r\u0173\n\r"+
		"\f\r\16\r\u0176\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u01bc"+
		"\2!\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b]\3\2\2\2\n\u00aa\3\2\2\2\f\u00f0"+
		"\3\2\2\2\16\u00f2\3\2\2\2\20\u010d\3\2\2\2\22\u0127\3\2\2\2\24\u0129\3"+
		"\2\2\2\26\u0132\3\2\2\2\30\u0152\3\2\2\2\32 \5\4\3\2\33 \5\b\5\2\34 \5"+
		"\n\6\2\35 \5\6\4\2\36 \5\16\b\2\37\32\3\2\2\2\37\33\3\2\2\2\37\34\3\2"+
		"\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3"+
		"\3\2\2\2#!\3\2\2\2$%\7\3\2\2%&\7\37\2\2&\'\7\34\2\2\'(\7\13\2\2()\7\f"+
		"\2\2)*\b\3\1\2*+\5\26\f\2+,\b\3\1\2,\67\3\2\2\2-.\7\3\2\2./\7\37\2\2/"+
		"\60\7\34\2\2\60\61\7\n\2\2\61\62\7\f\2\2\62\63\b\3\1\2\63\64\5\30\r\2"+
		"\64\65\b\3\1\2\65\67\3\2\2\2\66$\3\2\2\2\66-\3\2\2\2\67\5\3\2\2\289\7"+
		"\37\2\29:\7\f\2\2:=\b\4\1\2;>\5\30\r\2<>\5\26\f\2=;\3\2\2\2=<\3\2\2\2"+
		">?\3\2\2\2?@\b\4\1\2@\7\3\2\2\2AB\7\4\2\2BC\7\37\2\2CF\7\5\2\2DG\7 \2"+
		"\2EG\7\37\2\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HK\7\35\2\2IL\7 \2\2JL\7\37"+
		"\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\7#\2\2N^\b\5\1\2OP\7\4\2\2PQ\7\37"+
		"\2\2QT\7\5\2\2RU\7 \2\2SU\7\37\2\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VY\7\36"+
		"\2\2WZ\7 \2\2XZ\7\37\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7#\2\2\\^\b"+
		"\5\1\2]A\3\2\2\2]O\3\2\2\2^d\3\2\2\2_c\5\20\t\2`c\5\f\7\2ac\5\24\13\2"+
		"b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fd\3\2\2\2gh\7$\2\2hi\b\5\1\2i\t\3\2\2\2jt\7\7\2\2kl\7%\2\2lm\b\6\1\2"+
		"mn\5\22\n\2no\7&\2\2op\b\6\1\2pu\3\2\2\2qr\5\22\n\2rs\7&\2\2su\3\2\2\2"+
		"tk\3\2\2\2tq\3\2\2\2uv\3\2\2\2vy\b\6\1\2wz\5\20\t\2xz\5\n\6\2yw\3\2\2"+
		"\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\6\1\2|\u00ab\3\2\2\2}\u0087\7\7\2"+
		"\2~\177\7%\2\2\177\u0080\b\6\1\2\u0080\u0081\5\22\n\2\u0081\u0082\7&\2"+
		"\2\u0082\u0083\b\6\1\2\u0083\u0088\3\2\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0086\7&\2\2\u0086\u0088\3\2\2\2\u0087~\3\2\2\2\u0087\u0084\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008f\b\6\1\2\u008b\u008e\5\20"+
		"\t\2\u008c\u008e\5\n\6\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\u00a8\b\6\1\2\u0094"+
		"\u00a9\3\2\2\2\u0095\u0096\7\b\2\2\u0096\u0097\7#\2\2\u0097\u009c\b\6"+
		"\1\2\u0098\u009b\5\20\t\2\u0099\u009b\5\n\6\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0"+
		"\u00a9\b\6\1\2\u00a1\u00a2\7\b\2\2\u00a2\u00a5\b\6\1\2\u00a3\u00a6\5\20"+
		"\t\2\u00a4\u00a6\5\n\6\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\b\6\1\2\u00a8\u0094\3\2"+
		"\2\2\u00a8\u0095\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"j\3\2\2\2\u00aa}\3\2\2\2\u00ab\13\3\2\2\2\u00ac\u00b6\7\7\2\2\u00ad\u00ae"+
		"\7%\2\2\u00ae\u00af\b\7\1\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\7&\2\2\u00b1"+
		"\u00b2\b\7\1\2\u00b2\u00b7\3\2\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7"+
		"&\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00bc\b\7\1\2\u00b9\u00bd\5\20\t\2\u00ba\u00bd\5"+
		"\f\7\2\u00bb\u00bd\5\24\13\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\7"+
		"\1\2\u00bf\u00f1\3\2\2\2\u00c0\u00ca\7\7\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c3\b\7\1\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\b\7"+
		"\1\2\u00c6\u00cb\3\2\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\7&\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\7#\2\2\u00cd\u00d3\b\7\1\2\u00ce\u00d2\5\20\t\2\u00cf"+
		"\u00d2\5\f\7\2\u00d0\u00d2\5\24\13\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7$"+
		"\2\2\u00d7\u00ee\b\7\1\2\u00d8\u00ef\3\2\2\2\u00d9\u00da\7\b\2\2\u00da"+
		"\u00db\7#\2\2\u00db\u00e1\b\7\1\2\u00dc\u00e0\5\20\t\2\u00dd\u00e0\5\f"+
		"\7\2\u00de\u00e0\5\24\13\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5"+
		"\u00ef\b\7\1\2\u00e6\u00e7\7\b\2\2\u00e7\u00eb\b\7\1\2\u00e8\u00ec\5\20"+
		"\t\2\u00e9\u00ec\5\f\7\2\u00ea\u00ec\5\24\13\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\b\7\1\2\u00ee\u00d8\3\2\2\2\u00ee\u00d9\3\2\2\2\u00ee"+
		"\u00e6\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ac\3\2\2\2\u00f0\u00c0\3\2"+
		"\2\2\u00f1\r\3\2\2\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\7%\2\2\u00f4\u00f9"+
		"\b\b\1\2\u00f5\u00f6\7\"\2\2\u00f6\u00fa\b\b\1\2\u00f7\u00f8\7\37\2\2"+
		"\u00f8\u00fa\b\b\1\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\7\37\2\2"+
		"\u00fd\u0102\b\b\1\2\u00fe\u00ff\7\r\2\2\u00ff\u0100\7\"\2\2\u0100\u0102"+
		"\b\b\1\2\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\7&\2\2\u0107\u0108\b\b\1\2\u0108\17\3\2\2\2\u0109\u010e"+
		"\5\4\3\2\u010a\u010e\5\6\4\2\u010b\u010e\5\16\b\2\u010c\u010e\5\b\5\2"+
		"\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\21\3\2\2\2\u010f\u0110\7\30\2\2\u0110\u0111\7%\2\2\u0111"+
		"\u0112\b\n\1\2\u0112\u0113\5\22\n\2\u0113\u0114\7&\2\2\u0114\u0115\b\n"+
		"\1\2\u0115\u0128\3\2\2\2\u0116\u0119\5\30\r\2\u0117\u0119\5\26\f\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u0121\7\17"+
		"\2\2\u011b\u0121\7\20\2\2\u011c\u0121\7\21\2\2\u011d\u0121\7\22\2\2\u011e"+
		"\u0121\7\23\2\2\u011f\u0121\7\24\2\2\u0120\u011a\3\2\2\2\u0120\u011b\3"+
		"\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\b\n\1\2\u0123\u0126\5\30"+
		"\r\2\u0124\u0126\5\26\f\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u010f\3\2\2\2\u0127\u0118\3\2\2\2\u0128\23\3\2\2"+
		"\2\u0129\u012a\7\6\2\2\u012a\u012b\b\13\1\2\u012b\25\3\2\2\2\u012c\u012d"+
		"\7!\2\2\u012d\u0133\b\f\1\2\u012e\u012f\7 \2\2\u012f\u0133\b\f\1\2\u0130"+
		"\u0131\7\37\2\2\u0131\u0133\b\f\1\2\u0132\u012c\3\2\2\2\u0132\u012e\3"+
		"\2\2\2\u0132\u0130\3\2\2\2\u0133\u014d\3\2\2\2\u0134\u0139\7\r\2\2\u0135"+
		"\u0139\7\16\2\2\u0136\u0139\7\31\2\2\u0137\u0139\7\32\2\2\u0138\u0134"+
		"\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013d\3\2\2\2\u013a\u013e\7!\2\2\u013b\u013e\7 \2\2\u013c\u013e\7\37"+
		"\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u014a\b\f\1\2\u0140\u0141\7%\2\2\u0141\u0144\b\f"+
		"\1\2\u0142\u0145\5\30\r\2\u0143\u0145\5\26\f\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7&\2\2\u0147\u0148\b\f"+
		"\1\2\u0148\u014a\3\2\2\2\u0149\u0138\3\2\2\2\u0149\u0140\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\27\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\7 \2\2\u0151\u0153\7\37\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0174\b\r\1\2\u0155\u015a\7\r\2\2\u0156\u015a\7\16"+
		"\2\2\u0157\u015a\7\31\2\2\u0158\u015a\7\32\2\2\u0159\u0155\3\2\2\2\u0159"+
		"\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u015e\7 \2\2\u015c\u015e\7\37\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0171\b\r\1\2\u0160\u0164\7\27"+
		"\2\2\u0161\u0164\7\26\2\2\u0162\u0164\7\25\2\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0168\7 "+
		"\2\2\u0166\u0168\7\37\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0171\b\r\1\2\u016a\u016b\7%\2\2\u016b\u016c\b\r"+
		"\1\2\u016c\u016d\5\30\r\2\u016d\u016e\7&\2\2\u016e\u016f\b\r\1\2\u016f"+
		"\u0171\3\2\2\2\u0170\u0159\3\2\2\2\u0170\u0163\3\2\2\2\u0170\u016a\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\31\3\2\2\2\u0176\u0174\3\2\2"+
		"\2\66\37!\66=FKTY]bdty\u0087\u008d\u008f\u009a\u009c\u00a5\u00a8\u00aa"+
		"\u00b6\u00bc\u00ca\u00d1\u00d3\u00df\u00e1\u00eb\u00ee\u00f0\u00f9\u0101"+
		"\u0103\u010d\u0118\u0120\u0125\u0127\u0132\u0138\u013d\u0144\u0149\u014d"+
		"\u0152\u0159\u015d\u0163\u0167\u0170\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}