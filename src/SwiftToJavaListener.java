// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7

    import java.util.*;
    import javax.management.openmbean.KeyAlreadyExistsException;
    import com.sun.corba.se.impl.io.TypeMismatchException;
    import java.io.File;
    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.nio.file.StandardOpenOption;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftToJavaParser}.
 */
public interface SwiftToJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(SwiftToJavaParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(SwiftToJavaParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(SwiftToJavaParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(SwiftToJavaParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#varChange}.
	 * @param ctx the parse tree
	 */
	void enterVarChange(SwiftToJavaParser.VarChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#varChange}.
	 * @param ctx the parse tree
	 */
	void exitVarChange(SwiftToJavaParser.VarChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(SwiftToJavaParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(SwiftToJavaParser.ForCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#ifStatAverage}.
	 * @param ctx the parse tree
	 */
	void enterIfStatAverage(SwiftToJavaParser.IfStatAverageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#ifStatAverage}.
	 * @param ctx the parse tree
	 */
	void exitIfStatAverage(SwiftToJavaParser.IfStatAverageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#ifStatCycle}.
	 * @param ctx the parse tree
	 */
	void enterIfStatCycle(SwiftToJavaParser.IfStatCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#ifStatCycle}.
	 * @param ctx the parse tree
	 */
	void exitIfStatCycle(SwiftToJavaParser.IfStatCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#printCom}.
	 * @param ctx the parse tree
	 */
	void enterPrintCom(SwiftToJavaParser.PrintComContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#printCom}.
	 * @param ctx the parse tree
	 */
	void exitPrintCom(SwiftToJavaParser.PrintComContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#possibleBlocks}.
	 * @param ctx the parse tree
	 */
	void enterPossibleBlocks(SwiftToJavaParser.PossibleBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#possibleBlocks}.
	 * @param ctx the parse tree
	 */
	void exitPossibleBlocks(SwiftToJavaParser.PossibleBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#boolForm}.
	 * @param ctx the parse tree
	 */
	void enterBoolForm(SwiftToJavaParser.BoolFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#boolForm}.
	 * @param ctx the parse tree
	 */
	void exitBoolForm(SwiftToJavaParser.BoolFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#breakRule}.
	 * @param ctx the parse tree
	 */
	void enterBreakRule(SwiftToJavaParser.BreakRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#breakRule}.
	 * @param ctx the parse tree
	 */
	void exitBreakRule(SwiftToJavaParser.BreakRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(SwiftToJavaParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(SwiftToJavaParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftToJavaParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(SwiftToJavaParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(SwiftToJavaParser.IntValueContext ctx);
}