// Generated from /home/alena/IdeaProjects/practice/src/SwiftToJava.g4 by ANTLR 4.7


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
	 * Enter a parse tree produced by {@link SwiftToJavaParser#rightFloatValue}.
	 * @param ctx the parse tree
	 */
	void enterRightFloatValue(SwiftToJavaParser.RightFloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftToJavaParser#rightFloatValue}.
	 * @param ctx the parse tree
	 */
	void exitRightFloatValue(SwiftToJavaParser.RightFloatValueContext ctx);
}