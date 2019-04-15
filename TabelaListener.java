// Generated from Tabela.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TabelaParser}.
 */
public interface TabelaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TabelaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TabelaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TabelaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(TabelaParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(TabelaParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TabelaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TabelaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(TabelaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(TabelaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#newTable}.
	 * @param ctx the parse tree
	 */
	void enterNewTable(TabelaParser.NewTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#newTable}.
	 * @param ctx the parse tree
	 */
	void exitNewTable(TabelaParser.NewTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#saveFile}.
	 * @param ctx the parse tree
	 */
	void enterSaveFile(TabelaParser.SaveFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#saveFile}.
	 * @param ctx the parse tree
	 */
	void exitSaveFile(TabelaParser.SaveFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#removeColumn}.
	 * @param ctx the parse tree
	 */
	void enterRemoveColumn(TabelaParser.RemoveColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#removeColumn}.
	 * @param ctx the parse tree
	 */
	void exitRemoveColumn(TabelaParser.RemoveColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#removeLine}.
	 * @param ctx the parse tree
	 */
	void enterRemoveLine(TabelaParser.RemoveLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#removeLine}.
	 * @param ctx the parse tree
	 */
	void exitRemoveLine(TabelaParser.RemoveLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#addColumn}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(TabelaParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#addColumn}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(TabelaParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#addLine}.
	 * @param ctx the parse tree
	 */
	void enterAddLine(TabelaParser.AddLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#addLine}.
	 * @param ctx the parse tree
	 */
	void exitAddLine(TabelaParser.AddLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#printTable}.
	 * @param ctx the parse tree
	 */
	void enterPrintTable(TabelaParser.PrintTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#printTable}.
	 * @param ctx the parse tree
	 */
	void exitPrintTable(TabelaParser.PrintTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(TabelaParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(TabelaParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#getColumn}.
	 * @param ctx the parse tree
	 */
	void enterGetColumn(TabelaParser.GetColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#getColumn}.
	 * @param ctx the parse tree
	 */
	void exitGetColumn(TabelaParser.GetColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#getLine}.
	 * @param ctx the parse tree
	 */
	void enterGetLine(TabelaParser.GetLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#getLine}.
	 * @param ctx the parse tree
	 */
	void exitGetLine(TabelaParser.GetLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TabelaParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(TabelaParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TabelaParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(TabelaParser.SumContext ctx);
}