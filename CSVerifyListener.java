// Generated from CSVerify.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVerifyParser}.
 */
public interface CSVerifyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVerifyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CSVerifyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVerifyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CSVerifyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVerifyParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CSVerifyParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVerifyParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CSVerifyParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVerifyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CSVerifyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVerifyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CSVerifyParser.TypeContext ctx);
}