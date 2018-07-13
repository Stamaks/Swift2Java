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
	    public void assigned(String id, String type){
	        if (table.containsKey(id)) {
	                throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
	                                                    ": variable " + id + " is already assigned!");
	            }
	            if (reservedNames.contains(id)) {
	                if (table.containsKey(id)) {
	                        throw new KeyAlreadyExistsException("Line: " + getContext().start.getLine() +
	                                                            ": variable _" + id + " is already assigned!");
	                }
	                table.put("_" + id, type);
	            }
	            else {
	                table.put(id, type);
	            }
	    }

	    public void exists(String id){
	        if (!table.containsKey(id)) {
	            if (reservedNames.contains(id) && !table.containsKey("_" + id)) {
	                throw new NoSuchElementException("Line: " + getContext().start.getLine() +
	                                           ": variable _" + id + " wasn't assigned!");
	            }
	        }
	    }

	    public String getID(String id){
	        if (reservedNames.contains(id))
	            return "_" + id;
	        else
	            return id;
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

				        assigned((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "float");
				        if (reservedNames.contains((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null)))
				            sout("\t\tfloat _" + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
				        else
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

				        assigned((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "int");
				        if (reservedNames.contains((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null)))
				            sout("\t\tint _" + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
				        else
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

			        exists((((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null));
			        if (reservedNames.contains((((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null)))
			            sout("\t\t_" + (((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null) + " = ");
			        else
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
			setState(95);
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
				setState(69);
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
					exists((((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71);
				match(RANGE);
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(72);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(73);
					((ForCycleContext)_localctx).b = match(ID);
					exists((((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				match(LCURBR);

				        String a_id = (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null);
				        if (!a_id.matches("[.0-9]+"))
				            a_id = getID(a_id);

				        String b_id = (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null);
				        if (!b_id.matches("[.0-9]+"))
				            b_id = getID(b_id);

				        assigned((((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null), "float");
				        String i_id = getID((((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null));

				        sout("\t\tfor (int " + i_id + " = " + a_id + "; " + i_id + " <= " + b_id + "; " + i_id + "++) {\n\t\t\t");
				    
				}
				break;
			case 2:
				{
				setState(79);
				match(FOR);
				setState(80);
				((ForCycleContext)_localctx).i = match(ID);
				setState(81);
				match(IN);
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(82);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(83);
					((ForCycleContext)_localctx).a = match(ID);
					exists((((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				match(RANGEB);
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(88);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(89);
					((ForCycleContext)_localctx).b = match(ID);
					exists((((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				match(LCURBR);

				        String a_id = (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null);
				        if (!a_id.matches("[.0-9]+"))
				            a_id = getID(a_id);

				        String b_id = (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null);
				        if (!b_id.matches("[.0-9]+"))
				            b_id = getID(b_id);

				        assigned((((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null), "float");
				        String i_id = getID((((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null));

				        sout("\t\tfor (int " + i_id + " = " + a_id + "; " + i_id + " <= " + b_id + "; " + i_id + "++) {\n\t\t\t");
				    
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case FOR:
				case PRINT:
				case ID:
					{
					setState(97);
					possibleBlocks();
					}
					break;
				case IF:
					{
					setState(98);
					ifStatCycle();
					}
					break;
				case BREAK:
					{
					setState(99);
					breakRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(RCURBR);

			        sout("\t\t}\n");
			    
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				match(IF);
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(109);
					match(LBR);
					sout("\t\tif (");
					setState(111);
					boolForm();
					setState(112);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(115);
					boolForm();
					setState(116);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(121);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(122);
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
				setState(127);
				match(IF);
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(128);
					match(LBR);
					sout("\t\tif (");
					setState(130);
					boolForm();
					setState(131);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(134);
					boolForm();
					setState(135);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(141);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(142);
						ifStatAverage();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(RCURBR);
				sout("}\n");
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(151);
					match(ELSE);
					setState(152);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(156);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(154);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(155);
							ifStatAverage();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(161);
					match(RCURBR);
					sout("}\n");
					}
					break;
				case 3:
					{
					setState(163);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(165);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(166);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174);
				match(IF);
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(175);
					match(LBR);
					sout("\t\tif (");
					setState(177);
					boolForm();
					setState(178);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(181);
					boolForm();
					setState(182);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(187);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(188);
					ifStatCycle();
					}
					break;
				case 3:
					{
					setState(189);
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
				setState(194);
				match(IF);
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(195);
					match(LBR);
					sout("\t\tif (");
					setState(197);
					boolForm();
					setState(198);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(201);
					boolForm();
					setState(202);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(211);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(208);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(209);
						ifStatCycle();
						}
						break;
					case BREAK:
						{
						setState(210);
						breakRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(RCURBR);
				sout("}\n");
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(219);
					match(ELSE);
					setState(220);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(225);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(222);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(223);
							ifStatCycle();
							}
							break;
						case BREAK:
							{
							setState(224);
							breakRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(230);
					match(RCURBR);
					sout("}\n");
					}
					break;
				case 3:
					{
					setState(232);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(234);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(235);
						ifStatCycle();
						}
						break;
					case 3:
						{
						setState(236);
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
			setState(244);
			match(PRINT);
			setState(245);
			match(LBR);
			sout("\t\tSystem.out.println(");
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(247);
				((PrintComContext)_localctx).STRING = match(STRING);
				sout((((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
				{
				setState(249);
				((PrintComContext)_localctx).ID = match(ID);

				        exists((((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null));
				        sout(getID((((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null)));
				        
				}
				break;
			case PLUS:
			case RBR:
				break;
			default:
				break;
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(253);
					match(PLUS);
					setState(254);
					((PrintComContext)_localctx).ID = match(ID);

					        exists((((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null));
					        sout(" + " + getID((((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null)));
					        
					}
					break;
				case 2:
					{
					setState(256);
					match(PLUS);
					setState(257);
					((PrintComContext)_localctx).STRING = match(STRING);
					sout(" + " + (((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
					}
					break;
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
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
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(267);
				initialization();
				}
				break;
			case ID:
				{
				setState(268);
				varChange();
				}
				break;
			case PRINT:
				{
				setState(269);
				printCom();
				}
				break;
			case FOR:
				{
				setState(270);
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
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NOT);
				setState(274);
				match(LBR);
				sout("!(");
				setState(276);
				boolForm();
				setState(277);
				match(RBR);
				sout(")");
				}
				break;
			case ID:
			case INT:
			case FL:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(280);
					intValue();
					}
					break;
				case 2:
					{
					setState(281);
					floatValue();
					}
					break;
				}
				setState(290);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(284);
					((BoolFormContext)_localctx).s = match(EQUAL);
					}
					break;
				case NEQUAL:
					{
					setState(285);
					((BoolFormContext)_localctx).s = match(NEQUAL);
					}
					break;
				case GREATER:
					{
					setState(286);
					((BoolFormContext)_localctx).s = match(GREATER);
					}
					break;
				case GROREQ:
					{
					setState(287);
					((BoolFormContext)_localctx).s = match(GROREQ);
					}
					break;
				case LESS:
					{
					setState(288);
					((BoolFormContext)_localctx).s = match(LESS);
					}
					break;
				case LESSOREQ:
					{
					setState(289);
					((BoolFormContext)_localctx).s = match(LESSOREQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" " + (((BoolFormContext)_localctx).s!=null?((BoolFormContext)_localctx).s.getText():null) + " ");
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(293);
					intValue();
					}
					break;
				case 2:
					{
					setState(294);
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
			setState(299);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FL:
				{
				setState(302);
				((FloatValueContext)_localctx).FL = match(FL);
				sout((((FloatValueContext)_localctx).FL!=null?((FloatValueContext)_localctx).FL.getText():null) + "f");
				}
				break;
			case INT:
				{
				setState(304);
				((FloatValueContext)_localctx).INT = match(INT);
				sout((((FloatValueContext)_localctx).INT!=null?((FloatValueContext)_localctx).INT.getText():null) + "f");
				}
				break;
			case ID:
				{
				setState(306);
				((FloatValueContext)_localctx).ID = match(ID);

				    exists((((FloatValueContext)_localctx).ID!=null?((FloatValueContext)_localctx).ID.getText():null));
				    sout(getID((((FloatValueContext)_localctx).ID!=null?((FloatValueContext)_localctx).ID.getText():null)));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(314);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(310);
						((FloatValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(311);
						((FloatValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(312);
						((FloatValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(313);
						((FloatValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(320);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FL:
						{
						setState(316);
						((FloatValueContext)_localctx).a = match(FL);
						}
						break;
					case INT:
						{
						setState(317);
						((FloatValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(318);
						((FloatValueContext)_localctx).a = match(ID);
						exists((((FloatValueContext)_localctx).a!=null?((FloatValueContext)_localctx).a.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}

					        String a_id = (((FloatValueContext)_localctx).a!=null?((FloatValueContext)_localctx).a.getText():null);
					        if (!a_id.matches("[.0-9]+"))
					            a_id = getID(a_id);
					        else
					            a_id += "f";
					        sout(" " + (((FloatValueContext)_localctx).s!=null?((FloatValueContext)_localctx).s.getText():null) + " " + a_id);
					    
					}
					break;
				case LBR:
					{
					setState(323);
					match(LBR);
					sout(" (");
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(325);
						intValue();
						}
						break;
					case 2:
						{
						setState(326);
						floatValue();
						}
						break;
					}
					setState(329);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(338);
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
		public Token b;
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(339);
				((IntValueContext)_localctx).a = match(INT);
				}
				break;
			case ID:
				{
				setState(340);
				((IntValueContext)_localctx).a = match(ID);
				exists((((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        String a_id = (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null);
			        if (!a_id.matches("[.0-9]+"))
			            a_id = getID(a_id);
			        sout(a_id);
			    
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << XOR) | (1L << AND) | (1L << OR) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(349);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(345);
						((IntValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(346);
						((IntValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(347);
						((IntValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(348);
						((IntValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(354);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(351);
						((IntValueContext)_localctx).b = match(INT);
						}
						break;
					case ID:
						{
						setState(352);
						((IntValueContext)_localctx).b = match(ID);
						exists((((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}

					        String b_id = (((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null);
					        if (!b_id.matches("[.0-9]+"))
					            b_id = getID(b_id);
					        sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + b_id);
					    
					}
					break;
				case XOR:
				case AND:
				case OR:
					{
					setState(360);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR:
						{
						setState(357);
						((IntValueContext)_localctx).s = match(OR);
						}
						break;
					case AND:
						{
						setState(358);
						((IntValueContext)_localctx).s = match(AND);
						}
						break;
					case XOR:
						{
						setState(359);
						((IntValueContext)_localctx).s = match(XOR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(362);
						((IntValueContext)_localctx).b = match(INT);
						}
						break;
					case ID:
						{
						setState(363);
						((IntValueContext)_localctx).b = match(ID);
						exists((((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}

					        String b_id = (((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null);
					        if (!b_id.matches("[.0-9]+"))
					            b_id = getID(b_id);
					        sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + b_id);
					    
					}
					break;
				case LBR:
					{
					setState(368);
					match(LBR);
					sout(" (");
					setState(370);
					intValue();
					setState(371);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(380);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\67\n\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5H\n\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5X"+
		"\n\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\5\5b\n\5\3\5\3\5\3\5\7\5g\n\5\f"+
		"\5\16\5j\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"y\n\6\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u008c\n\6\3\6\3\6\3\6\3\6\7\6\u0092\n\6\f\6\16\6\u0095\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00aa\n\6\3\6\5\6\u00ad\n\6\5\6\u00af\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bb\n\7\3\7\3\7\3\7\3\7\5\7\u00c1"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cf\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00e4\n\7\f\7\16\7\u00e7\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00f0\n\7\3\7\5\7\u00f3\n\7\5\7\u00f5\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00fe\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0106\n\b\f\b\16"+
		"\b\u0109\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0112\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u011d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0125"+
		"\n\n\3\n\3\n\3\n\5\n\u012a\n\n\5\n\u012c\n\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0137\n\f\3\f\3\f\3\f\3\f\5\f\u013d\n\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0143\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u014a\n\f\3\f\3\f\3\f\5\f\u014f"+
		"\n\f\7\f\u0151\n\f\f\f\16\f\u0154\13\f\3\r\3\r\3\r\5\r\u0159\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0160\n\r\3\r\3\r\3\r\5\r\u0165\n\r\3\r\3\r\3\r\3\r"+
		"\5\r\u016b\n\r\3\r\3\r\3\r\5\r\u0170\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0179\n\r\7\r\u017b\n\r\f\r\16\r\u017e\13\r\3\r\2\2\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\2\2\u01c4\2!\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\ba\3"+
		"\2\2\2\n\u00ae\3\2\2\2\f\u00f4\3\2\2\2\16\u00f6\3\2\2\2\20\u0111\3\2\2"+
		"\2\22\u012b\3\2\2\2\24\u012d\3\2\2\2\26\u0136\3\2\2\2\30\u0158\3\2\2\2"+
		"\32 \5\4\3\2\33 \5\b\5\2\34 \5\n\6\2\35 \5\6\4\2\36 \5\16\b\2\37\32\3"+
		"\2\2\2\37\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\7\3\2\2%&\7\37\2\2&"+
		"\'\7\34\2\2\'(\7\13\2\2()\7\f\2\2)*\b\3\1\2*+\5\26\f\2+,\b\3\1\2,\67\3"+
		"\2\2\2-.\7\3\2\2./\7\37\2\2/\60\7\34\2\2\60\61\7\n\2\2\61\62\7\f\2\2\62"+
		"\63\b\3\1\2\63\64\5\30\r\2\64\65\b\3\1\2\65\67\3\2\2\2\66$\3\2\2\2\66"+
		"-\3\2\2\2\67\5\3\2\2\289\7\37\2\29:\7\f\2\2:=\b\4\1\2;>\5\30\r\2<>\5\26"+
		"\f\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?@\b\4\1\2@\7\3\2\2\2AB\7\4\2\2BC\7"+
		"\37\2\2CG\7\5\2\2DH\7 \2\2EF\7\37\2\2FH\b\5\1\2GD\3\2\2\2GE\3\2\2\2HI"+
		"\3\2\2\2IM\7\35\2\2JN\7 \2\2KL\7\37\2\2LN\b\5\1\2MJ\3\2\2\2MK\3\2\2\2"+
		"NO\3\2\2\2OP\7#\2\2Pb\b\5\1\2QR\7\4\2\2RS\7\37\2\2SW\7\5\2\2TX\7 \2\2"+
		"UV\7\37\2\2VX\b\5\1\2WT\3\2\2\2WU\3\2\2\2XY\3\2\2\2Y]\7\36\2\2Z^\7 \2"+
		"\2[\\\7\37\2\2\\^\b\5\1\2]Z\3\2\2\2][\3\2\2\2^_\3\2\2\2_`\7#\2\2`b\b\5"+
		"\1\2aA\3\2\2\2aQ\3\2\2\2bh\3\2\2\2cg\5\20\t\2dg\5\f\7\2eg\5\24\13\2fc"+
		"\3\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2j"+
		"h\3\2\2\2kl\7$\2\2lm\b\5\1\2m\t\3\2\2\2nx\7\7\2\2op\7%\2\2pq\b\6\1\2q"+
		"r\5\22\n\2rs\7&\2\2st\b\6\1\2ty\3\2\2\2uv\5\22\n\2vw\7&\2\2wy\3\2\2\2"+
		"xo\3\2\2\2xu\3\2\2\2yz\3\2\2\2z}\b\6\1\2{~\5\20\t\2|~\5\n\6\2}{\3\2\2"+
		"\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\6\1\2\u0080\u00af\3\2"+
		"\2\2\u0081\u008b\7\7\2\2\u0082\u0083\7%\2\2\u0083\u0084\b\6\1\2\u0084"+
		"\u0085\5\22\n\2\u0085\u0086\7&\2\2\u0086\u0087\b\6\1\2\u0087\u008c\3\2"+
		"\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7&\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0082\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7#"+
		"\2\2\u008e\u0093\b\6\1\2\u008f\u0092\5\20\t\2\u0090\u0092\5\n\6\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\7$\2\2\u0097\u00ac\b\6\1\2\u0098\u00ad\3\2\2\2\u0099\u009a\7\b"+
		"\2\2\u009a\u009b\7#\2\2\u009b\u00a0\b\6\1\2\u009c\u009f\5\20\t\2\u009d"+
		"\u009f\5\n\6\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4\u00ad\b\6\1\2\u00a5\u00a6\7\b"+
		"\2\2\u00a6\u00a9\b\6\1\2\u00a7\u00aa\5\20\t\2\u00a8\u00aa\5\n\6\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\b\6\1\2\u00ac\u0098\3\2\2\2\u00ac\u0099\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ad\u00af\3\2\2\2\u00aen\3\2\2\2\u00ae\u0081\3\2\2\2"+
		"\u00af\13\3\2\2\2\u00b0\u00ba\7\7\2\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\b"+
		"\7\1\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7&\2\2\u00b5\u00b6\b\7\1\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7&\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00c0\b\7\1\2\u00bd\u00c1\5\20\t\2\u00be\u00c1\5\f\7\2\u00bf\u00c1\5"+
		"\24\13\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\7\1\2\u00c3\u00f5\3\2"+
		"\2\2\u00c4\u00ce\7\7\2\2\u00c5\u00c6\7%\2\2\u00c6\u00c7\b\7\1\2\u00c7"+
		"\u00c8\5\22\n\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00cf\3\2"+
		"\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7&\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00c5\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7#"+
		"\2\2\u00d1\u00d7\b\7\1\2\u00d2\u00d6\5\20\t\2\u00d3\u00d6\5\f\7\2\u00d4"+
		"\u00d6\5\24\13\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db\u00f2\b\7"+
		"\1\2\u00dc\u00f3\3\2\2\2\u00dd\u00de\7\b\2\2\u00de\u00df\7#\2\2\u00df"+
		"\u00e5\b\7\1\2\u00e0\u00e4\5\20\t\2\u00e1\u00e4\5\f\7\2\u00e2\u00e4\5"+
		"\24\13\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9\u00f3\b\7\1\2\u00ea"+
		"\u00eb\7\b\2\2\u00eb\u00ef\b\7\1\2\u00ec\u00f0\5\20\t\2\u00ed\u00f0\5"+
		"\f\7\2\u00ee\u00f0\5\24\13\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\b\7"+
		"\1\2\u00f2\u00dc\3\2\2\2\u00f2\u00dd\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00b0\3\2\2\2\u00f4\u00c4\3\2\2\2\u00f5\r\3\2\2\2"+
		"\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7%\2\2\u00f8\u00fd\b\b\1\2\u00f9\u00fa"+
		"\7\"\2\2\u00fa\u00fe\b\b\1\2\u00fb\u00fc\7\37\2\2\u00fc\u00fe\b\b\1\2"+
		"\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107"+
		"\3\2\2\2\u00ff\u0100\7\r\2\2\u0100\u0101\7\37\2\2\u0101\u0106\b\b\1\2"+
		"\u0102\u0103\7\r\2\2\u0103\u0104\7\"\2\2\u0104\u0106\b\b\1\2\u0105\u00ff"+
		"\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7&"+
		"\2\2\u010b\u010c\b\b\1\2\u010c\17\3\2\2\2\u010d\u0112\5\4\3\2\u010e\u0112"+
		"\5\6\4\2\u010f\u0112\5\16\b\2\u0110\u0112\5\b\5\2\u0111\u010d\3\2\2\2"+
		"\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\21"+
		"\3\2\2\2\u0113\u0114\7\30\2\2\u0114\u0115\7%\2\2\u0115\u0116\b\n\1\2\u0116"+
		"\u0117\5\22\n\2\u0117\u0118\7&\2\2\u0118\u0119\b\n\1\2\u0119\u012c\3\2"+
		"\2\2\u011a\u011d\5\30\r\2\u011b\u011d\5\26\f\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0124\3\2\2\2\u011e\u0125\7\17\2\2\u011f\u0125\7"+
		"\20\2\2\u0120\u0125\7\21\2\2\u0121\u0125\7\22\2\2\u0122\u0125\7\23\2\2"+
		"\u0123\u0125\7\24\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120"+
		"\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0129\b\n\1\2\u0127\u012a\5\30\r\2\u0128\u012a\5"+
		"\26\f\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0113\3\2\2\2\u012b\u011c\3\2\2\2\u012c\23\3\2\2\2\u012d\u012e\7\6\2"+
		"\2\u012e\u012f\b\13\1\2\u012f\25\3\2\2\2\u0130\u0131\7!\2\2\u0131\u0137"+
		"\b\f\1\2\u0132\u0133\7 \2\2\u0133\u0137\b\f\1\2\u0134\u0135\7\37\2\2\u0135"+
		"\u0137\b\f\1\2\u0136\u0130\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0152\3\2\2\2\u0138\u013d\7\r\2\2\u0139\u013d\7\16\2\2\u013a"+
		"\u013d\7\31\2\2\u013b\u013d\7\32\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u0142\3\2\2\2\u013e"+
		"\u0143\7!\2\2\u013f\u0143\7 \2\2\u0140\u0141\7\37\2\2\u0141\u0143\b\f"+
		"\1\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u014f\b\f\1\2\u0145\u0146\7%\2\2\u0146\u0149\b\f"+
		"\1\2\u0147\u014a\5\30\r\2\u0148\u014a\5\26\f\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7&\2\2\u014c\u014d\b\f"+
		"\1\2\u014d\u014f\3\2\2\2\u014e\u013c\3\2\2\2\u014e\u0145\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\27\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159"+
		"\7 \2\2\u0156\u0157\7\37\2\2\u0157\u0159\b\r\1\2\u0158\u0155\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u017c\b\r\1\2\u015b\u0160\7\r"+
		"\2\2\u015c\u0160\7\16\2\2\u015d\u0160\7\31\2\2\u015e\u0160\7\32\2\2\u015f"+
		"\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160\u0164\3\2\2\2\u0161\u0165\7 \2\2\u0162\u0163\7\37\2\2\u0163"+
		"\u0165\b\r\1\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0179\b\r\1\2\u0167\u016b\7\27\2\2\u0168\u016b\7\26\2\2\u0169"+
		"\u016b\7\25\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3"+
		"\2\2\2\u016b\u016f\3\2\2\2\u016c\u0170\7 \2\2\u016d\u016e\7\37\2\2\u016e"+
		"\u0170\b\r\1\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0179\b\r\1\2\u0172\u0173\7%\2\2\u0173\u0174\b\r\1\2\u0174"+
		"\u0175\5\30\r\2\u0175\u0176\7&\2\2\u0176\u0177\b\r\1\2\u0177\u0179\3\2"+
		"\2\2\u0178\u015f\3\2\2\2\u0178\u016a\3\2\2\2\u0178\u0172\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\31\3\2\2\2\u017e\u017c\3\2\2\2\66\37!\66"+
		"=GMW]afhx}\u008b\u0091\u0093\u009e\u00a0\u00a9\u00ac\u00ae\u00ba\u00c0"+
		"\u00ce\u00d5\u00d7\u00e3\u00e5\u00ef\u00f2\u00f4\u00fd\u0105\u0107\u0111"+
		"\u011c\u0124\u0129\u012b\u0136\u013c\u0142\u0149\u014e\u0152\u0158\u015f"+
		"\u0164\u016a\u016f\u0178\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}