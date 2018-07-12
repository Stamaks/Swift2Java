// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SwiftToJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SwiftToJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(SwiftToJavaParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(SwiftToJavaParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#varChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarChange(SwiftToJavaParser.VarChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(SwiftToJavaParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#ifStatAverage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatAverage(SwiftToJavaParser.IfStatAverageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#ifStatCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatCycle(SwiftToJavaParser.IfStatCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#printCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCom(SwiftToJavaParser.PrintComContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#possibleBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleBlocks(SwiftToJavaParser.PossibleBlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#boolForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolForm(SwiftToJavaParser.BoolFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#breakRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakRule(SwiftToJavaParser.BreakRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#floatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(SwiftToJavaParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftToJavaParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(SwiftToJavaParser.IntValueContext ctx);
}