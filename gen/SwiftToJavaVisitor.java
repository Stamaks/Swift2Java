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
	 * Visit a parse tree produced by {@link SwiftToJavaParser#rightFloatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightFloatValue(SwiftToJavaParser.RightFloatValueContext ctx);
}