// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7

    import java.util.*;
    import javax.management.openmbean.KeyAlreadyExistsException;
    import com.sun.corba.se.impl.io.TypeMismatchException;
    import java.io.File;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.nio.file.StandardOpenOption;
    import java.lang.invoke.WrongMethodTypeException;

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
		RULE_boolForm = 8, RULE_breakRule = 9, RULE_floatValue = 10, RULE_intValue = 11, 
		RULE_wrongStatements = 12;
	public static final String[] ruleNames = {
		"startRule", "initialization", "varChange", "forCycle", "ifStatAverage", 
		"ifStatCycle", "printCom", "possibleBlocks", "boolForm", "breakRule", 
		"floatValue", "intValue", "wrongStatements"
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

	    public boolean isVarChange = false;
	    public String varChangeType = "";

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

	    public void typeMismatch(String id, String wrongType){
	        if (table.get(id).equals(wrongType)) {
	            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
	                                                          ": variable " + id + " has wrong type!");
	        }
	    }

	    public static void sout(String str){
	        System.out.print(str);

	        String path = "translatedCode.java";
	        File f = new File(path);
	        if(!f.exists() && !f.isDirectory()) {
	            try{
	                f.createNewFile();
	            } catch (IOException e) {
	                System.err.println(e);
	            }
	        }
	        try {
	            Files.write(Paths.get(path), str.getBytes(), StandardOpenOption.APPEND);
	        } catch (IOException e) {
	            System.err.println(e);
	        }
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
		public List<WrongStatementsContext> wrongStatements() {
			return getRuleContexts(WrongStatementsContext.class);
		}
		public WrongStatementsContext wrongStatements(int i) {
			return getRuleContext(WrongStatementsContext.class,i);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << INTEGER) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					initialization();
					}
					break;
				case 2:
					{
					setState(27);
					forCycle();
					}
					break;
				case 3:
					{
					setState(28);
					ifStatAverage();
					}
					break;
				case 4:
					{
					setState(29);
					varChange();
					}
					break;
				case 5:
					{
					setState(30);
					printCom();
					}
					break;
				case 6:
					{
					setState(31);
					wrongStatements();
					}
					break;
				}
				}
				setState(36);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(VAR);
				setState(38);
				((InitializationContext)_localctx).ID = match(ID);
				setState(39);
				match(COLON);
				setState(40);
				match(FLOAT);
				setState(41);
				match(ASSIGN);

				        assigned((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "float");
				        sout("\t\tfloat " + getID((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null)) + " = ");

				    
				setState(43);
				floatValue();
				sout(";\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(VAR);
				setState(47);
				((InitializationContext)_localctx).ID = match(ID);
				setState(48);
				match(COLON);
				setState(49);
				match(INTEGER);
				setState(50);
				match(ASSIGN);

				        assigned((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null), "int");
				        sout("\t\tint " + getID((((InitializationContext)_localctx).ID!=null?((InitializationContext)_localctx).ID.getText():null)) + " = ");

				    
				setState(52);
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
			setState(57);
			((VarChangeContext)_localctx).ID = match(ID);
			setState(58);
			match(ASSIGN);

			        exists((((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null));
			        sout("\t\t" + getID((((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null)) + " = ");
			        isVarChange = true;
			        varChangeType = table.get(getID((((VarChangeContext)_localctx).ID!=null?((VarChangeContext)_localctx).ID.getText():null)));
			    
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(60);
				intValue();
				}
				break;
			case 2:
				{
				setState(61);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(66);
				match(FOR);
				setState(67);
				((ForCycleContext)_localctx).i = match(ID);
				setState(68);
				match(IN);
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(69);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(70);
					((ForCycleContext)_localctx).a = match(ID);
					exists((((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74);
				match(RANGE);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(75);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(76);
					((ForCycleContext)_localctx).b = match(ID);
					exists((((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80);
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
				setState(82);
				match(FOR);
				setState(83);
				((ForCycleContext)_localctx).i = match(ID);
				setState(84);
				match(IN);
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(85);
					((ForCycleContext)_localctx).a = match(INT);
					}
					break;
				case ID:
					{
					setState(86);
					((ForCycleContext)_localctx).a = match(ID);
					exists((((ForCycleContext)_localctx).a!=null?((ForCycleContext)_localctx).a.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				match(RANGEB);
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(91);
					((ForCycleContext)_localctx).b = match(INT);
					}
					break;
				case ID:
					{
					setState(92);
					((ForCycleContext)_localctx).b = match(ID);
					exists((((ForCycleContext)_localctx).b!=null?((ForCycleContext)_localctx).b.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case FOR:
				case PRINT:
				case ID:
					{
					setState(100);
					possibleBlocks();
					}
					break;
				case IF:
					{
					setState(101);
					ifStatCycle();
					}
					break;
				case BREAK:
					{
					setState(102);
					breakRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(111);
				match(IF);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(112);
					match(LBR);
					sout("\t\tif (");
					setState(114);
					boolForm();
					setState(115);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(118);
					boolForm();
					setState(119);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(124);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(125);
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
				setState(130);
				match(IF);
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(131);
					match(LBR);
					sout("\t\tif (");
					setState(133);
					boolForm();
					setState(134);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(137);
					boolForm();
					setState(138);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(144);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(145);
						ifStatAverage();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(RCURBR);
				sout("\t\t}\n");
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(154);
					match(ELSE);
					setState(155);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(159);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(157);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(158);
							ifStatAverage();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(164);
					match(RCURBR);
					sout("\t\t}\n");
					}
					break;
				case 3:
					{
					setState(166);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(168);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(169);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(177);
				match(IF);
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(178);
					match(LBR);
					sout("\t\tif (");
					setState(180);
					boolForm();
					setState(181);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(184);
					boolForm();
					setState(185);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" \n\t\t\t");
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(190);
					possibleBlocks();
					}
					break;
				case 2:
					{
					setState(191);
					ifStatCycle();
					}
					break;
				case 3:
					{
					setState(192);
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
				setState(197);
				match(IF);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBR:
					{
					setState(198);
					match(LBR);
					sout("\t\tif (");
					setState(200);
					boolForm();
					setState(201);
					match(RBR);
					sout(")");
					}
					break;
				case NOT:
				case ID:
				case INT:
				case FL:
					{
					setState(204);
					boolForm();
					setState(205);
					match(RBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				match(LCURBR);
				sout(" {\n\t\t\t");
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(214);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case FOR:
					case PRINT:
					case ID:
						{
						setState(211);
						possibleBlocks();
						}
						break;
					case IF:
						{
						setState(212);
						ifStatCycle();
						}
						break;
					case BREAK:
						{
						setState(213);
						breakRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(RCURBR);
				sout("}\n");
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(222);
					match(ELSE);
					setState(223);
					match(LCURBR);
					sout("\t\telse {\n\t\t\t");
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FOR) | (1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
						{
						setState(228);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VAR:
						case FOR:
						case PRINT:
						case ID:
							{
							setState(225);
							possibleBlocks();
							}
							break;
						case IF:
							{
							setState(226);
							ifStatCycle();
							}
							break;
						case BREAK:
							{
							setState(227);
							breakRule();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(233);
					match(RCURBR);
					sout("}\n");
					}
					break;
				case 3:
					{
					setState(235);
					match(ELSE);
					sout("\t\telse \n\t\t\t");
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(237);
						possibleBlocks();
						}
						break;
					case 2:
						{
						setState(238);
						ifStatCycle();
						}
						break;
					case 3:
						{
						setState(239);
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
		public TerminalNode PRINT() { return getToken(SwiftToJavaParser.PRINT, 0); }
		public TerminalNode LBR() { return getToken(SwiftToJavaParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(SwiftToJavaParser.RBR, 0); }
		public List<TerminalNode> STRING() { return getTokens(SwiftToJavaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SwiftToJavaParser.STRING, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SwiftToJavaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SwiftToJavaParser.PLUS, i);
		}
		public List<FloatValueContext> floatValue() {
			return getRuleContexts(FloatValueContext.class);
		}
		public FloatValueContext floatValue(int i) {
			return getRuleContext(FloatValueContext.class,i);
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
			setState(247);
			match(PRINT);
			setState(248);
			match(LBR);
			sout("\t\tSystem.out.println(");
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(250);
				((PrintComContext)_localctx).STRING = match(STRING);
				sout((((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
			case INT:
			case FL:
				{
				{
				setState(252);
				floatValue();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(255);
					match(PLUS);
					{
					setState(256);
					floatValue();
					}
					}
					break;
				case 2:
					{
					setState(257);
					match(PLUS);
					setState(258);
					((PrintComContext)_localctx).STRING = match(STRING);
					sout(" + " + (((PrintComContext)_localctx).STRING!=null?((PrintComContext)_localctx).STRING.getText():null));
					}
					break;
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(268);
				initialization();
				}
				break;
			case ID:
				{
				setState(269);
				varChange();
				}
				break;
			case PRINT:
				{
				setState(270);
				printCom();
				}
				break;
			case FOR:
				{
				setState(271);
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
				setState(274);
				match(NOT);
				setState(275);
				match(LBR);
				sout("!(");
				setState(277);
				boolForm();
				setState(278);
				match(RBR);
				sout(")");
				}
				break;
			case ID:
			case INT:
			case FL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(281);
				floatValue();
				}
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(282);
					((BoolFormContext)_localctx).s = match(EQUAL);
					}
					break;
				case NEQUAL:
					{
					setState(283);
					((BoolFormContext)_localctx).s = match(NEQUAL);
					}
					break;
				case GREATER:
					{
					setState(284);
					((BoolFormContext)_localctx).s = match(GREATER);
					}
					break;
				case GROREQ:
					{
					setState(285);
					((BoolFormContext)_localctx).s = match(GROREQ);
					}
					break;
				case LESS:
					{
					setState(286);
					((BoolFormContext)_localctx).s = match(LESS);
					}
					break;
				case LESSOREQ:
					{
					setState(287);
					((BoolFormContext)_localctx).s = match(LESSOREQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				sout(" " + (((BoolFormContext)_localctx).s!=null?((BoolFormContext)_localctx).s.getText():null) + " ");
				{
				setState(291);
				floatValue();
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
		try {
			int _alt;
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

				    if (isVarChange) {
				        if (varChangeType.equals("int")) {
				            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
				                                                        ": cannot assign float to int!");
				        }
				        isVarChange = false;
				    }
				    exists((((FloatValueContext)_localctx).ID!=null?((FloatValueContext)_localctx).ID.getText():null));
				    sout(getID((((FloatValueContext)_localctx).ID!=null?((FloatValueContext)_localctx).ID.getText():null)));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
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
						setState(316);
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
						setState(319);
						match(LBR);
						sout(" (");
						setState(323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(321);
							intValue();
							}
							break;
						case 2:
							{
							setState(322);
							floatValue();
							}
							break;
						}
						setState(325);
						match(RBR);
						sout(")");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(335);
				((IntValueContext)_localctx).a = match(INT);
				}
				break;
			case ID:
				{
				setState(336);
				((IntValueContext)_localctx).a = match(ID);
				exists((((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        String a_id = (((IntValueContext)_localctx).a!=null?((IntValueContext)_localctx).a.getText():null);
			        if (!a_id.matches("[.0-9]+")) {
			            a_id = getID(a_id);
			            if (isVarChange) {
			                if (!varChangeType.equals("float")) {
			                    typeMismatch(a_id, "float");
			                }
			            }
			            else {
			                typeMismatch(a_id, "float");
			            }
			        }
			        if (a_id.contains(".")) {
			            throw new TypeMismatchException("Line: " + getContext().start.getLine() +
			                                                                      ": number " + a_id + " has wrong type!");
			        }
			        sout(a_id);
			    
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << XOR) | (1L << AND) | (1L << OR) | (1L << MULT) | (1L << MOD) | (1L << LBR))) != 0)) {
				{
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case MOD:
					{
					setState(345);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(341);
						((IntValueContext)_localctx).s = match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(342);
						((IntValueContext)_localctx).s = match(MINUS);
						}
						break;
					case MULT:
						{
						setState(343);
						((IntValueContext)_localctx).s = match(MULT);
						}
						break;
					case MOD:
						{
						setState(344);
						((IntValueContext)_localctx).s = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(350);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(347);
						((IntValueContext)_localctx).b = match(INT);
						}
						break;
					case ID:
						{
						setState(348);
						((IntValueContext)_localctx).b = match(ID);
						exists((((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}

					        String b_id = (((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null);
					        if (!b_id.matches("[.0-9]+")) {
					            b_id = getID(b_id);
					            if (isVarChange) {
					                if (!varChangeType.equals("float")) {
					                    typeMismatch(b_id, "float");
					                }
					            }
					            else {
					                typeMismatch(b_id, "float");
					            }
					        }
					        sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + b_id);
					    
					}
					break;
				case XOR:
				case AND:
				case OR:
					{
					setState(356);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OR:
						{
						setState(353);
						((IntValueContext)_localctx).s = match(OR);
						}
						break;
					case AND:
						{
						setState(354);
						((IntValueContext)_localctx).s = match(AND);
						}
						break;
					case XOR:
						{
						setState(355);
						((IntValueContext)_localctx).s = match(XOR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(361);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(358);
						((IntValueContext)_localctx).b = match(INT);
						}
						break;
					case ID:
						{
						setState(359);
						((IntValueContext)_localctx).b = match(ID);
						exists((((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}

					        String b_id = (((IntValueContext)_localctx).b!=null?((IntValueContext)_localctx).b.getText():null);
					        if (!b_id.matches("[.0-9]+")){
					             b_id = getID(b_id);
					             if (isVarChange) {
					                 if (!varChangeType.equals("float")) {
					                     typeMismatch(b_id, "int");
					                 }
					             }
					             else {
					                 typeMismatch(b_id, "float");
					             }
					        }
					        sout(" " + (((IntValueContext)_localctx).s!=null?((IntValueContext)_localctx).s.getText():null) + " " + b_id);
					    
					}
					break;
				case LBR:
					{
					setState(364);
					match(LBR);
					sout(" (");
					setState(366);
					intValue();
					setState(367);
					match(RBR);
					sout(")");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(376);
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

	public static class WrongStatementsContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SwiftToJavaParser.FLOAT, 0); }
		public TerminalNode EQUAL() { return getToken(SwiftToJavaParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(SwiftToJavaParser.INTEGER, 0); }
		public TerminalNode VAR() { return getToken(SwiftToJavaParser.VAR, 0); }
		public WrongStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrongStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).enterWrongStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftToJavaListener ) ((SwiftToJavaListener)listener).exitWrongStatements(this);
		}
	}

	public final WrongStatementsContext wrongStatements() throws RecognitionException {
		WrongStatementsContext _localctx = new WrongStatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wrongStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(377);
				match(FLOAT);
				setState(378);
				match(EQUAL);
				}
				break;
			case 2:
				{
				setState(379);
				match(INTEGER);
				setState(380);
				match(EQUAL);
				}
				break;
			case 3:
				{
				setState(381);
				match(FLOAT);
				setState(382);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(383);
				match(INTEGER);
				setState(384);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(385);
				match(VAR);
				setState(386);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(387);
				match(VAR);
				setState(388);
				match(INTEGER);
				}
				break;
			}

			        throw new WrongMethodTypeException("Line: " + getContext().start.getLine() +
			                                                                                              ": illegal expression!");
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\5\5e\n\5\3\5\3\5\3\5"+
		"\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6|\n\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16"+
		"\6\u0098\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\6\5\6\u00b0\n\6\5\6\u00b2"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00c4\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00d2\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e7\n\7\f\7\16\7\u00ea\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f3\n\7\3\7\5\7\u00f6\n\7\5\7\u00f8\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0100\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0107\n\b"+
		"\f\b\16\b\u010a\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0113\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0123\n\n\3\n\3\n"+
		"\3\n\5\n\u0128\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0133\n"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0139\n\f\3\f\3\f\3\f\3\f\5\f\u013f\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0146\n\f\3\f\3\f\3\f\5\f\u014b\n\f\7\f\u014d\n\f\f\f"+
		"\16\f\u0150\13\f\3\r\3\r\3\r\5\r\u0155\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u015c"+
		"\n\r\3\r\3\r\3\r\5\r\u0161\n\r\3\r\3\r\3\r\3\r\5\r\u0167\n\r\3\r\3\r\3"+
		"\r\5\r\u016c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0175\n\r\7\r\u0177\n"+
		"\r\f\r\16\r\u017a\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0188\n\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\2\2\u01d2\2$\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bd\3\2\2"+
		"\2\n\u00b1\3\2\2\2\f\u00f7\3\2\2\2\16\u00f9\3\2\2\2\20\u0112\3\2\2\2\22"+
		"\u0127\3\2\2\2\24\u0129\3\2\2\2\26\u0132\3\2\2\2\30\u0154\3\2\2\2\32\u0187"+
		"\3\2\2\2\34#\5\4\3\2\35#\5\b\5\2\36#\5\n\6\2\37#\5\6\4\2 #\5\16\b\2!#"+
		"\5\32\16\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2"+
		"\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\'"+
		"(\7\3\2\2()\7\37\2\2)*\7\34\2\2*+\7\13\2\2+,\7\f\2\2,-\b\3\1\2-.\5\26"+
		"\f\2./\b\3\1\2/:\3\2\2\2\60\61\7\3\2\2\61\62\7\37\2\2\62\63\7\34\2\2\63"+
		"\64\7\n\2\2\64\65\7\f\2\2\65\66\b\3\1\2\66\67\5\30\r\2\678\b\3\1\28:\3"+
		"\2\2\29\'\3\2\2\29\60\3\2\2\2:\5\3\2\2\2;<\7\37\2\2<=\7\f\2\2=@\b\4\1"+
		"\2>A\5\30\r\2?A\5\26\f\2@>\3\2\2\2@?\3\2\2\2AB\3\2\2\2BC\b\4\1\2C\7\3"+
		"\2\2\2DE\7\4\2\2EF\7\37\2\2FJ\7\5\2\2GK\7 \2\2HI\7\37\2\2IK\b\5\1\2JG"+
		"\3\2\2\2JH\3\2\2\2KL\3\2\2\2LP\7\35\2\2MQ\7 \2\2NO\7\37\2\2OQ\b\5\1\2"+
		"PM\3\2\2\2PN\3\2\2\2QR\3\2\2\2RS\7#\2\2Se\b\5\1\2TU\7\4\2\2UV\7\37\2\2"+
		"VZ\7\5\2\2W[\7 \2\2XY\7\37\2\2Y[\b\5\1\2ZW\3\2\2\2ZX\3\2\2\2[\\\3\2\2"+
		"\2\\`\7\36\2\2]a\7 \2\2^_\7\37\2\2_a\b\5\1\2`]\3\2\2\2`^\3\2\2\2ab\3\2"+
		"\2\2bc\7#\2\2ce\b\5\1\2dD\3\2\2\2dT\3\2\2\2ek\3\2\2\2fj\5\20\t\2gj\5\f"+
		"\7\2hj\5\24\13\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2op\b\5\1\2p\t\3\2\2\2q{\7\7\2\2rs\7"+
		"%\2\2st\b\6\1\2tu\5\22\n\2uv\7&\2\2vw\b\6\1\2w|\3\2\2\2xy\5\22\n\2yz\7"+
		"&\2\2z|\3\2\2\2{r\3\2\2\2{x\3\2\2\2|}\3\2\2\2}\u0080\b\6\1\2~\u0081\5"+
		"\20\t\2\177\u0081\5\n\6\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\6\1\2\u0083\u00b2\3\2\2\2\u0084"+
		"\u008e\7\7\2\2\u0085\u0086\7%\2\2\u0086\u0087\b\6\1\2\u0087\u0088\5\22"+
		"\n\2\u0088\u0089\7&\2\2\u0089\u008a\b\6\1\2\u008a\u008f\3\2\2\2\u008b"+
		"\u008c\5\22\n\2\u008c\u008d\7&\2\2\u008d\u008f\3\2\2\2\u008e\u0085\3\2"+
		"\2\2\u008e\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7#\2\2\u0091"+
		"\u0096\b\6\1\2\u0092\u0095\5\20\t\2\u0093\u0095\5\n\6\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$"+
		"\2\2\u009a\u00af\b\6\1\2\u009b\u00b0\3\2\2\2\u009c\u009d\7\b\2\2\u009d"+
		"\u009e\7#\2\2\u009e\u00a3\b\6\1\2\u009f\u00a2\5\20\t\2\u00a0\u00a2\5\n"+
		"\6\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7$\2\2\u00a7\u00b0\b\6\1\2\u00a8\u00a9\7\b\2\2\u00a9"+
		"\u00ac\b\6\1\2\u00aa\u00ad\5\20\t\2\u00ab\u00ad\5\n\6\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\b\6\1\2\u00af\u009b\3\2\2\2\u00af\u009c\3\2\2\2\u00af\u00a8\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1q\3\2\2\2\u00b1\u0084\3\2\2\2\u00b2\13\3"+
		"\2\2\2\u00b3\u00bd\7\7\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\b\7\1\2\u00b6"+
		"\u00b7\5\22\n\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\b\7\1\2\u00b9\u00be\3\2"+
		"\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\7&\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\b\7"+
		"\1\2\u00c0\u00c4\5\20\t\2\u00c1\u00c4\5\f\7\2\u00c2\u00c4\5\24\13\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\7\1\2\u00c6\u00f8\3\2\2\2\u00c7"+
		"\u00d1\7\7\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00cb\5\22"+
		"\n\2\u00cb\u00cc\7&\2\2\u00cc\u00cd\b\7\1\2\u00cd\u00d2\3\2\2\2\u00ce"+
		"\u00cf\5\22\n\2\u00cf\u00d0\7&\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c8\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4"+
		"\u00da\b\7\1\2\u00d5\u00d9\5\20\t\2\u00d6\u00d9\5\f\7\2\u00d7\u00d9\5"+
		"\24\13\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00f5\b\7\1\2\u00df"+
		"\u00f6\3\2\2\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e8\b\7"+
		"\1\2\u00e3\u00e7\5\20\t\2\u00e4\u00e7\5\f\7\2\u00e5\u00e7\5\24\13\2\u00e6"+
		"\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ec\u00f6\b\7\1\2\u00ed\u00ee\7\b"+
		"\2\2\u00ee\u00f2\b\7\1\2\u00ef\u00f3\5\20\t\2\u00f0\u00f3\5\f\7\2\u00f1"+
		"\u00f3\5\24\13\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\b\7\1\2\u00f5"+
		"\u00df\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00b3\3\2\2\2\u00f7\u00c7\3\2\2\2\u00f8\r\3\2\2\2\u00f9\u00fa"+
		"\7\t\2\2\u00fa\u00fb\7%\2\2\u00fb\u00ff\b\b\1\2\u00fc\u00fd\7\"\2\2\u00fd"+
		"\u0100\b\b\1\2\u00fe\u0100\5\26\f\2\u00ff\u00fc\3\2\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\u0108\3\2\2\2\u0101\u0102\7\r\2\2\u0102\u0107\5\26\f\2\u0103"+
		"\u0104\7\r\2\2\u0104\u0105\7\"\2\2\u0105\u0107\b\b\1\2\u0106\u0101\3\2"+
		"\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7&"+
		"\2\2\u010c\u010d\b\b\1\2\u010d\17\3\2\2\2\u010e\u0113\5\4\3\2\u010f\u0113"+
		"\5\6\4\2\u0110\u0113\5\16\b\2\u0111\u0113\5\b\5\2\u0112\u010e\3\2\2\2"+
		"\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\21"+
		"\3\2\2\2\u0114\u0115\7\30\2\2\u0115\u0116\7%\2\2\u0116\u0117\b\n\1\2\u0117"+
		"\u0118\5\22\n\2\u0118\u0119\7&\2\2\u0119\u011a\b\n\1\2\u011a\u0128\3\2"+
		"\2\2\u011b\u0122\5\26\f\2\u011c\u0123\7\17\2\2\u011d\u0123\7\20\2\2\u011e"+
		"\u0123\7\21\2\2\u011f\u0123\7\22\2\2\u0120\u0123\7\23\2\2\u0121\u0123"+
		"\7\24\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2"+
		"\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\b\n\1\2\u0125\u0126\5\26\f\2\u0126\u0128\3\2\2\2"+
		"\u0127\u0114\3\2\2\2\u0127\u011b\3\2\2\2\u0128\23\3\2\2\2\u0129\u012a"+
		"\7\6\2\2\u012a\u012b\b\13\1\2\u012b\25\3\2\2\2\u012c\u012d\7!\2\2\u012d"+
		"\u0133\b\f\1\2\u012e\u012f\7 \2\2\u012f\u0133\b\f\1\2\u0130\u0131\7\37"+
		"\2\2\u0131\u0133\b\f\1\2\u0132\u012c\3\2\2\2\u0132\u012e\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u014e\3\2\2\2\u0134\u0139\7\r\2\2\u0135\u0139\7\16"+
		"\2\2\u0136\u0139\7\31\2\2\u0137\u0139\7\32\2\2\u0138\u0134\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013e\3\2"+
		"\2\2\u013a\u013f\7!\2\2\u013b\u013f\7 \2\2\u013c\u013d\7\37\2\2\u013d"+
		"\u013f\b\f\1\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u014b\b\f\1\2\u0141\u0142\7%\2\2\u0142"+
		"\u0145\b\f\1\2\u0143\u0146\5\30\r\2\u0144\u0146\5\26\f\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7&\2\2\u0148"+
		"\u0149\b\f\1\2\u0149\u014b\3\2\2\2\u014a\u0138\3\2\2\2\u014a\u0141\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\27\3\2\2\2\u0150\u014e\3\2\2"+
		"\2\u0151\u0155\7 \2\2\u0152\u0153\7\37\2\2\u0153\u0155\b\r\1\2\u0154\u0151"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0178\b\r\1\2\u0157"+
		"\u015c\7\r\2\2\u0158\u015c\7\16\2\2\u0159\u015c\7\31\2\2\u015a\u015c\7"+
		"\32\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\u0160\3\2\2\2\u015d\u0161\7 \2\2\u015e\u015f\7\37"+
		"\2\2\u015f\u0161\b\r\1\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0175\b\r\1\2\u0163\u0167\7\27\2\2\u0164\u0167\7"+
		"\26\2\2\u0165\u0167\7\25\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u016c\7 \2\2\u0169\u016a\7\37"+
		"\2\2\u016a\u016c\b\r\1\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u0175\b\r\1\2\u016e\u016f\7%\2\2\u016f\u0170\b\r"+
		"\1\2\u0170\u0171\5\30\r\2\u0171\u0172\7&\2\2\u0172\u0173\b\r\1\2\u0173"+
		"\u0175\3\2\2\2\u0174\u015b\3\2\2\2\u0174\u0166\3\2\2\2\u0174\u016e\3\2"+
		"\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\31\3\2\2\2\u017a\u0178\3\2\2"+
		"\2\u017b\u017c\7\13\2\2\u017c\u0188\7\17\2\2\u017d\u017e\7\n\2\2\u017e"+
		"\u0188\7\17\2\2\u017f\u0180\7\13\2\2\u0180\u0188\7\n\2\2\u0181\u0182\7"+
		"\n\2\2\u0182\u0188\7\13\2\2\u0183\u0184\7\3\2\2\u0184\u0188\7\13\2\2\u0185"+
		"\u0186\7\3\2\2\u0186\u0188\7\n\2\2\u0187\u017b\3\2\2\2\u0187\u017d\3\2"+
		"\2\2\u0187\u017f\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0183\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\16\1\2\u018a\33\3\2\2"+
		"\2\65\"$9@JPZ`dik{\u0080\u008e\u0094\u0096\u00a1\u00a3\u00ac\u00af\u00b1"+
		"\u00bd\u00c3\u00d1\u00d8\u00da\u00e6\u00e8\u00f2\u00f5\u00f7\u00ff\u0106"+
		"\u0108\u0112\u0122\u0127\u0132\u0138\u013e\u0145\u014a\u014e\u0154\u015b"+
		"\u0160\u0166\u016b\u0174\u0178\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}