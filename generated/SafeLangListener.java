// Generated from SafeLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SafeLangParser}.
 */
public interface SafeLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SafeLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SafeLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(SafeLangParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(SafeLangParser.SeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SafeLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SafeLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SafeLangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SafeLangParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(SafeLangParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(SafeLangParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#retryStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetryStmt(SafeLangParser.RetryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#retryStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetryStmt(SafeLangParser.RetryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(SafeLangParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(SafeLangParser.UseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(SafeLangParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(SafeLangParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#typeDimExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeDimExpr(SafeLangParser.TypeDimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#typeDimExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeDimExpr(SafeLangParser.TypeDimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#unitSpec}.
	 * @param ctx the parse tree
	 */
	void enterUnitSpec(SafeLangParser.UnitSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#unitSpec}.
	 * @param ctx the parse tree
	 */
	void exitUnitSpec(SafeLangParser.UnitSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(SafeLangParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(SafeLangParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void enterUnitDef(SafeLangParser.UnitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void exitUnitDef(SafeLangParser.UnitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#prefixDef}.
	 * @param ctx the parse tree
	 */
	void enterPrefixDef(SafeLangParser.PrefixDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#prefixDef}.
	 * @param ctx the parse tree
	 */
	void exitPrefixDef(SafeLangParser.PrefixDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SafeLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SafeLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#varDeclAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAssign(SafeLangParser.VarDeclAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#varDeclAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAssign(SafeLangParser.VarDeclAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SafeLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SafeLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(SafeLangParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(SafeLangParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterTypeRef(SafeLangParser.TypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitTypeRef(SafeLangParser.TypeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(SafeLangParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(SafeLangParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#writelnStmt}.
	 * @param ctx the parse tree
	 */
	void enterWritelnStmt(SafeLangParser.WritelnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#writelnStmt}.
	 * @param ctx the parse tree
	 */
	void exitWritelnStmt(SafeLangParser.WritelnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SafeLangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SafeLangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#dimensionExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimensionExpr(SafeLangParser.DimensionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#dimensionExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimensionExpr(SafeLangParser.DimensionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#dimensionProduct}.
	 * @param ctx the parse tree
	 */
	void enterDimensionProduct(SafeLangParser.DimensionProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#dimensionProduct}.
	 * @param ctx the parse tree
	 */
	void exitDimensionProduct(SafeLangParser.DimensionProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#dimensionPower}.
	 * @param ctx the parse tree
	 */
	void enterDimensionPower(SafeLangParser.DimensionPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#dimensionPower}.
	 * @param ctx the parse tree
	 */
	void exitDimensionPower(SafeLangParser.DimensionPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#dimensionAtom}.
	 * @param ctx the parse tree
	 */
	void enterDimensionAtom(SafeLangParser.DimensionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#dimensionAtom}.
	 * @param ctx the parse tree
	 */
	void exitDimensionAtom(SafeLangParser.DimensionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SafeLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SafeLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(SafeLangParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(SafeLangParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(SafeLangParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(SafeLangParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(SafeLangParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(SafeLangParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(SafeLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(SafeLangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SafeLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SafeLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(SafeLangParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(SafeLangParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#conversionType}.
	 * @param ctx the parse tree
	 */
	void enterConversionType(SafeLangParser.ConversionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#conversionType}.
	 * @param ctx the parse tree
	 */
	void exitConversionType(SafeLangParser.ConversionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#formatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFormatExpr(SafeLangParser.FormatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#formatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFormatExpr(SafeLangParser.FormatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(SafeLangParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(SafeLangParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SafeLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SafeLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SafeLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SafeLangParser.LiteralContext ctx);
}