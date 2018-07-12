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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF))) != 0)) {
				{
				setState(27);
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
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(VAR);
				setState(33);
				((InitializationContext)_localctx).ID = match(ID);
				setState(34);
				match(COLON);
				setState(35);
				match(FLOAT);
				setState(36);
				match(ASSIGN);

				        sout("\t\tfloat " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ");
				    
				setState(38);
				floatValue();
				sout(";\n")
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(VAR);
				setState(42);
				((InitializationContext)_localctx).ID = match(ID);
				setState(43);
				match(COLON);
				setState(44);
				match(INTEGER);
				setState(45);
				match(ASSIGN);

				        sout("\t\tint " + (((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null) + " = ")
				    
				setState(47);
				intValue();
				sout(";\n")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitVarChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarChangeContext varChange() throws RecognitionException {
		VarChangeContext _localctx = new VarChangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((VarChangeContext)_localctx).ID = match(ID);
			setState(53);
			match(ASSIGN);

			        sout("\t\t" + (((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null) + " = ");
			    
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55);
				intValue();
				}
				break;
			case 2:
				{
				setState(56);
				floatValue();
				}
				break;
			}
			sout(";\n")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(61);
				match(FOR);
				setState(62);
				((ForCycleContext)_localctx).i = match(ID);
				setState(63);
				match(IN);
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(64);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(65);
					((ForCycleContext)_localctx).a = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68);
				match(RANGE);
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(69);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(70);
					((ForCycleContext)_localctx).b = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73);
				match(LCURBR);

				        sout("\t\tfor (int " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " = " + (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " <= " + (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + "++) {\n\t\t\t");
				    
				}
				break;
			case 2:
				{
				setState(75);
				match(FOR);
				setState(76);
				((ForCycleContext)_localctx).i = match(ID);
				setState(77);
				match(IN);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(78);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(79);
					((ForCycleContext)_localctx).a = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(RANGEB);
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(83);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(84);
					((ForCycleContext)_localctx).b = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				match(LCURBR);

				        sout("\t\tfor (int " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " = " + (((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + " < " + (((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null) + "; " + (((ForCycleContext)_localctx).i!=null?((ForCycleContext)_localctx).i.getText():null) + "++) {\n\t\t\t");
				    
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case FOR:
				case PRINT:
				case ID:
					{
					setState(91);
					possibleBlocks();
					}
					break;
				case IF:
					{
					setState(92);
					ifStatCycle();
					}
					break;
				case BREAK:
					{
					setState(93);
					breakRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		public List<TerminalNode> LCURBR() { return getTokens(SwiftToJavaParser.LCURBR); }
		public TerminalNode LCURBR(int i) {
			return getToken(SwiftToJavaParser.LCURBR, i);
		}
		public List<TerminalNode> RCURBR() { return getTokens(SwiftToJavaParser.RCURBR); }
		public TerminalNode RCURBR(int i) {
			return getToken(SwiftToJavaParser.RCURBR, i);
		}
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public BoolFormContext boolForm() {
			return getRuleContext(BoolFormContext.class,0);
		}
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public TerminalNode ELSE() { return getToken(SwiftToJavaParser.ELSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitIfStatAverage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatAverageContext ifStatAverage() throws RecognitionException {
		IfStatAverageContext _localctx = new IfStatAverageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatAverage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBR:
				{
				setState(103);
				match(LBR);
				sout("\t\tif (");
				setState(105);
				boolForm();
				setState(106);
				match(RBR);
				sout(")");
				}
				break;
			case NOT:
			case ID:
			case INT:
			case FL:
				{
				setState(109);
				boolForm();
				setState(110);
				match(RBR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			match(LCURBR);
			sout(" {\n\t\t\t");
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case FOR:
				case PRINT:
				case ID:
					{
					setState(116);
					possibleBlocks();
					}
					break;
				case IF:
					{
					setState(117);
					ifStatAverage();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(RCURBR);
			sout("}\n");
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case VAR:
			case FOR:
			case IF:
			case PRINT:
			case ID:
			case RCURBR:
				{
				}
				break;
			case ELSE:
				{
				setState(126);
				match(ELSE);
				setState(127);
				match(LCURBR);
				sout("\t\telse {"\n\t\t\t);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(131);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(129);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(130);
						ifStatAverage();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(RCURBR);
				sout("}\n");
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

	public static class IfStatCycleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SwiftToJavaParser.IF, 0); }
		public List<TerminalNode> LCURBR() { return getTokens(SwiftToJavaParser.LCURBR); }
		public TerminalNode LCURBR(int i) {
			return getToken(SwiftToJavaParser.LCURBR, i);
		}
		public List<TerminalNode> RCURBR() { return getTokens(SwiftToJavaParser.RCURBR); }
		public TerminalNode RCURBR(int i) {
			return getToken(SwiftToJavaParser.RCURBR, i);
		}
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public BoolFormContext boolForm() {
			return getRuleContext(BoolFormContext.class,0);
		}
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public TerminalNode ELSE() { return getToken(SwiftToJavaParser.ELSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitIfStatCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatCycleContext ifStatCycle() throws RecognitionException {
		IfStatCycleContext _localctx = new IfStatCycleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBR:
				{
				setState(141);
				match(LBR);
				sout("\t\tif (");
				setState(143);
				boolForm();
				setState(144);
				match(RBR);
				sout(")");
				}
				break;
			case NOT:
			case ID:
			case INT:
			case FL:
				{
				setState(147);
				boolForm();
				setState(148);
				match(RBR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(LCURBR);
			sout(" {\n\t\t\t");
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(157);
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
					ifStatCycle();
					}
					break;
				case BREAK:
					{
					setState(156);
					breakRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(RCURBR);
			sout("}\n");
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case FOR:
			case BREAK:
			case IF:
			case PRINT:
			case ID:
			case RCURBR:
				{
				}
				break;
			case ELSE:
				{
				setState(165);
				match(ELSE);
				setState(166);
				match(LCURBR);
				sout("\t\telse {"\n\t\t\t);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(171);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(168);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(169);
						ifStatCycle();
						}
						break;
					case BREAK:
						{
						setState(170);
						breakRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(RCURBR);
				sout("}\n");
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitPrintCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintComContext printCom() throws RecognitionException {
		PrintComContext _localctx = new PrintComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printCom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PRINT);
			setState(181);
			match(LBR);
			sout("\t\tSystem.out.println(");
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(183);
				((PrintComContext)_localctx).STRING = match(STRING);
				sout((((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
				{
				setState(185);
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
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(189);
					match(PLUS);
					setState(190);
					((PrintComContext)_localctx).ID = match(ID);
					sout(" + " + (((PrintComContext)_localctx).ID!=null?((PrintComContext)_localctx).ID.getText():null))
					}
					break;
				case 2:
					{
					setState(192);
					match(PLUS);
					setState(193);
					((PrintComContext)_localctx).STRING = match(STRING);
					sout(" + " + (((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null))
					}
					break;
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitPossibleBlocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleBlocksContext possibleBlocks() throws RecognitionException {
		PossibleBlocksContext _localctx = new PossibleBlocksContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_possibleBlocks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(203);
				initialization();
				}
				break;
			case ID:
				{
				setState(204);
				varChange();
				}
				break;
			case PRINT:
				{
				setState(205);
				printCom();
				}
				break;
			case FOR:
				{
				setState(206);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitBoolForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolFormContext boolForm() throws RecognitionException {
		BoolFormContext _localctx = new BoolFormContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolForm);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(NOT);
				setState(210);
				match(LBR);
				sout("!(");
				setState(212);
				boolForm();
				setState(213);
				match(RBR);
				sout(")");
				}
				break;
			case ID:
			case INT:
			case FL:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(216);
					intValue();
					}
					break;
				case 2:
					{
					setState(217);
					floatValue();
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(220);
					((BoolFormContext)_localctx).s = match(EQUAL);
					}
					break;
				case NEQUAL:
					{
					setState(221);
					((BoolFormContext)_localctx).s = match(NEQUAL);
					}
					break;
				case GREATER:
					{
					setState(222);
					((BoolFormContext)_localctx).s = match(GREATER);
					}
					break;
				case GROREQ:
					{
					setState(223);
					((BoolFormContext)_localctx).s = match(GROREQ);
					}
					break;
				case LESS:
					{
					setState(224);
					((BoolFormContext)_localctx).s = match(LESS);
					}
					break;
				case LESSOREQ:
					{
					setState(225);
					((BoolFormContext)_localctx).s = match(LESSOREQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" " + (((BoolFormContext)_localctx).s!=null?((BoolFormContext)_localctx).s.getText():null) + " ")
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(229);
					intValue();
					}
					break;
				case 2:
					{
					setState(230);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitBreakRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakRuleContext breakRule() throws RecognitionException {
		BreakRuleContext _localctx = new BreakRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(BREAK);
			sout("\t\t\tbreak;\n")
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
		public Token a;
		public Token s;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatValueContext floatValue() throws RecognitionException {
		FloatValueContext _localctx = new FloatValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FL:
				{
				setState(238);
				((FloatValueContext)_localctx).a = match(FL);
				}
				break;
			case INT:
				{
				setState(239);
				((FloatValueContext)_localctx).a = match(INT);
				}
				break;
			case ID:
				{
				setState(240);
				((FloatValueContext)_localctx).a = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			sout((((FloatValueContext)_localctx).a!=null?((FloatValueContext)_localctx).a.getText():null))
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(248);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(244);
						((FloatValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(245);
						((FloatValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(246);
						((FloatValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(247);
						((FloatValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(253);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FL:
						{
						setState(250);
						((FloatValueContext)_localctx).a = match(FL);
						}
						break;
					case INT:
						{
						setState(251);
						((FloatValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(252);
						((FloatValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((FloatValueContext)_localctx).s!=null?((FloatValueContext)_localctx).s.getText():null) + " " + (((FloatValueContext)_localctx).a!=null?((FloatValueContext)_localctx).a.getText():null))
					}
					break;
				case LBR:
					{
					setState(256);
					match(LBR);
					sout(" (");
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(258);
						intValue();
						}
						break;
					case 2:
						{
						setState(259);
						floatValue();
						}
						break;
					}
					setState(262);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftToJavaVisitor ) return ((SwiftToJavaVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(272);
				((IntValueContext)_localctx).a = match(INT);
				}
				break;
			case ID:
				{
				setState(273);
				((IntValueContext)_localctx).a = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			sout((((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null))
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << XOR) | (1L << AND) | (1L << OR) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(281);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(277);
						((IntValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(278);
						((IntValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(279);
						((IntValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(280);
						((IntValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(285);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(283);
						((IntValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(284);
						((IntValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null))
					}
					break;
				case XOR:
				case AND:
				case OR:
					{
					setState(291);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR:
						{
						setState(288);
						((IntValueContext)_localctx).s = match(OR);
						}
						break;
					case AND:
						{
						setState(289);
						((IntValueContext)_localctx).s = match(AND);
						}
						break;
					case XOR:
						{
						setState(290);
						((IntValueContext)_localctx).s = match(XOR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(295);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(293);
						((IntValueContext)_localctx).a = match(INT);
						}
						break;
					case ID:
						{
						setState(294);
						((IntValueContext)_localctx).a = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null)[0] + " " + (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null))
					}
					break;
				case LBR:
					{
					setState(298);
					match(LBR);
					sout(" (");
					setState(300);
					intValue();
					setState(301);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(310);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3"+
		"\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\5\3\5\3\5\5"+
		"\5X\n\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\6\3\6\3\6\3\6"+
		"\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6"+
		"\f\6\16\6\u0089\13\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0099\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a0\n\7\f\7\16\7"+
		"\u00a3\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7"+
		"\u00b1\13\7\3\7\3\7\5\7\u00b5\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c6\n\b\f\b\16\b\u00c9\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00dd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3\n\3\n\3\n\5\n\u00ea"+
		"\n\n\5\n\u00ec\n\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00f4\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00fb\n\f\3\f\3\f\3\f\5\f\u0100\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0107\n\f\3\f\3\f\3\f\5\f\u010c\n\f\7\f\u010e\n\f\f\f\16\f\u0111"+
		"\13\f\3\r\3\r\5\r\u0115\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c\n\r\3\r\3\r"+
		"\5\r\u0120\n\r\3\r\3\r\3\r\3\r\5\r\u0126\n\r\3\r\3\r\5\r\u012a\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0133\n\r\7\r\u0135\n\r\f\r\16\r\u0138\13"+
		"\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u016c\2\37\3\2\2\2\4"+
		"\64\3\2\2\2\6\66\3\2\2\2\b[\3\2\2\2\nh\3\2\2\2\f\u008e\3\2\2\2\16\u00b6"+
		"\3\2\2\2\20\u00d1\3\2\2\2\22\u00eb\3\2\2\2\24\u00ed\3\2\2\2\26\u00f3\3"+
		"\2\2\2\30\u0114\3\2\2\2\32\36\5\4\3\2\33\36\5\b\5\2\34\36\5\n\6\2\35\32"+
		"\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\7\3\2\2#$\7\37\2\2$%\7\34\2\2%&\7\13\2"+
		"\2&\'\7\f\2\2\'(\b\3\1\2()\5\26\f\2)*\b\3\1\2*\65\3\2\2\2+,\7\3\2\2,-"+
		"\7\37\2\2-.\7\34\2\2./\7\n\2\2/\60\7\f\2\2\60\61\b\3\1\2\61\62\5\30\r"+
		"\2\62\63\b\3\1\2\63\65\3\2\2\2\64\"\3\2\2\2\64+\3\2\2\2\65\5\3\2\2\2\66"+
		"\67\7\37\2\2\678\7\f\2\28;\b\4\1\29<\5\30\r\2:<\5\26\f\2;9\3\2\2\2;:\3"+
		"\2\2\2<=\3\2\2\2=>\b\4\1\2>\7\3\2\2\2?@\7\4\2\2@A\7\37\2\2AD\7\5\2\2B"+
		"E\7 \2\2CE\7\37\2\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FI\7\35\2\2GJ\7 \2\2"+
		"HJ\7\37\2\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KL\7#\2\2L\\\b\5\1\2MN\7\4\2"+
		"\2NO\7\37\2\2OR\7\5\2\2PS\7 \2\2QS\7\37\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TW\7\36\2\2UX\7 \2\2VX\7\37\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7"+
		"#\2\2Z\\\b\5\1\2[?\3\2\2\2[M\3\2\2\2\\b\3\2\2\2]a\5\20\t\2^a\5\f\7\2_"+
		"a\5\24\13\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2fg\b\5\1\2g\t\3\2\2\2hr\7\7\2\2ij\7%\2"+
		"\2jk\b\6\1\2kl\5\22\n\2lm\7&\2\2mn\b\6\1\2ns\3\2\2\2op\5\22\n\2pq\7&\2"+
		"\2qs\3\2\2\2ri\3\2\2\2ro\3\2\2\2st\3\2\2\2tu\7#\2\2uz\b\6\1\2vy\5\20\t"+
		"\2wy\5\n\6\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|z\3\2\2\2}~\7$\2\2~\u008c\b\6\1\2\177\u008d\3\2\2\2\u0080\u0081\7\b"+
		"\2\2\u0081\u0082\7#\2\2\u0082\u0087\b\6\1\2\u0083\u0086\5\20\t\2\u0084"+
		"\u0086\5\n\6\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008d\b\6\1\2\u008c\177\3\2\2"+
		"\2\u008c\u0080\3\2\2\2\u008d\13\3\2\2\2\u008e\u0098\7\7\2\2\u008f\u0090"+
		"\7%\2\2\u0090\u0091\b\7\1\2\u0091\u0092\5\22\n\2\u0092\u0093\7&\2\2\u0093"+
		"\u0094\b\7\1\2\u0094\u0099\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7"+
		"&\2\2\u0097\u0099\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0095\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7#\2\2\u009b\u00a1\b\7\1\2\u009c\u00a0\5\20"+
		"\t\2\u009d\u00a0\5\f\7\2\u009e\u00a0\5\24\13\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7$\2\2\u00a5\u00b4\b\7\1\2\u00a6\u00b5\3\2\2\2\u00a7\u00a8\7\b"+
		"\2\2\u00a8\u00a9\7#\2\2\u00a9\u00af\b\7\1\2\u00aa\u00ae\5\20\t\2\u00ab"+
		"\u00ae\5\f\7\2\u00ac\u00ae\5\24\13\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7$"+
		"\2\2\u00b3\u00b5\b\7\1\2\u00b4\u00a6\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b5"+
		"\r\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7%\2\2\u00b8\u00bd\b\b\1\2"+
		"\u00b9\u00ba\7\"\2\2\u00ba\u00be\b\b\1\2\u00bb\u00bc\7\37\2\2\u00bc\u00be"+
		"\b\b\1\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c7\3\2\2\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00c6\b"+
		"\b\1\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c6\b\b\1\2\u00c5"+
		"\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7&\2\2\u00cb\u00cc\b\b\1\2\u00cc\17\3\2\2\2\u00cd\u00d2\5\4\3\2"+
		"\u00ce\u00d2\5\6\4\2\u00cf\u00d2\5\16\b\2\u00d0\u00d2\5\b\5\2\u00d1\u00cd"+
		"\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\21\3\2\2\2\u00d3\u00d4\7\30\2\2\u00d4\u00d5\7%\2\2\u00d5\u00d6\b\n\1"+
		"\2\u00d6\u00d7\5\22\n\2\u00d7\u00d8\7&\2\2\u00d8\u00d9\b\n\1\2\u00d9\u00ec"+
		"\3\2\2\2\u00da\u00dd\5\30\r\2\u00db\u00dd\5\26\f\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00e4\3\2\2\2\u00de\u00e5\7\17\2\2\u00df\u00e5"+
		"\7\20\2\2\u00e0\u00e5\7\21\2\2\u00e1\u00e5\7\22\2\2\u00e2\u00e5\7\23\2"+
		"\2\u00e3\u00e5\7\24\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\b\n\1\2\u00e7\u00ea\5\30\r\2\u00e8"+
		"\u00ea\5\26\f\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00d3\3\2\2\2\u00eb\u00dc\3\2\2\2\u00ec\23\3\2\2\2\u00ed"+
		"\u00ee\7\6\2\2\u00ee\u00ef\b\13\1\2\u00ef\25\3\2\2\2\u00f0\u00f4\7!\2"+
		"\2\u00f1\u00f4\7 \2\2\u00f2\u00f4\7\37\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u010f\b\f\1\2\u00f6"+
		"\u00fb\7\r\2\2\u00f7\u00fb\7\16\2\2\u00f8\u00fb\7\31\2\2\u00f9\u00fb\7"+
		"\32\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u0100\7!\2\2\u00fd\u0100\7 \2"+
		"\2\u00fe\u0100\7\37\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010c\b\f\1\2\u0102\u0103\7%"+
		"\2\2\u0103\u0106\b\f\1\2\u0104\u0107\5\30\r\2\u0105\u0107\5\26\f\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7&"+
		"\2\2\u0109\u010a\b\f\1\2\u010a\u010c\3\2\2\2\u010b\u00fa\3\2\2\2\u010b"+
		"\u0102\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\27\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0115\7 \2\2\u0113\u0115\7\37\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0136\b\r\1\2\u0117\u011c\7\r"+
		"\2\2\u0118\u011c\7\16\2\2\u0119\u011c\7\31\2\2\u011a\u011c\7\32\2\2\u011b"+
		"\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u0120\7 \2\2\u011e\u0120\7\37\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0133\b\r"+
		"\1\2\u0122\u0126\7\27\2\2\u0123\u0126\7\26\2\2\u0124\u0126\7\25\2\2\u0125"+
		"\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u012a\7 \2\2\u0128\u012a\7\37\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0133\b\r\1\2\u012c\u012d\7%"+
		"\2\2\u012d\u012e\b\r\1\2\u012e\u012f\5\30\r\2\u012f\u0130\7&\2\2\u0130"+
		"\u0131\b\r\1\2\u0131\u0133\3\2\2\2\u0132\u011b\3\2\2\2\u0132\u0125\3\2"+
		"\2\2\u0132\u012c\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\31\3\2\2"+
		"\2\u0138\u0136\3\2\2\2.\35\37\64;DIRW[`brxz\u0085\u0087\u008c\u0098\u009f"+
		"\u00a1\u00ad\u00af\u00b4\u00bd\u00c5\u00c7\u00d1\u00dc\u00e4\u00e9\u00eb"+
		"\u00f3\u00fa\u00ff\u0106\u010b\u010f\u0114\u011b\u011f\u0125\u0129\u0132"+
		"\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}