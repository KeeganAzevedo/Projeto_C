// Generated from SafeLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SafeLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USE=1, TYPE=2, UNIT=3, PREFIX=4, WRITE=5, WRITELN=6, READ=7, FORMAT=8, 
		INTEGER=9, REAL=10, STRING=11, TRY=12, RESCUE=13, RETRY=14, END=15, TRY_ASSIGN=16, 
		DECL_ASSIGN=17, INT_DIV=18, REM=19, REAL_DIV=20, POW=21, PLUS=22, MINUS=23, 
		MUL=24, COLON=25, SEMI=26, COMMA=27, LPAREN=28, RPAREN=29, LBRACK=30, 
		RBRACK=31, REAL_LITERAL=32, INTEGER_LITERAL=33, STRING_LITERAL=34, ID=35, 
		MULTILINE_COMMENT=36, LINE_COMMENT=37, WS=38;
	public static final int
		RULE_program = 0, RULE_separator = 1, RULE_statement = 2, RULE_statementList = 3, 
		RULE_tryStmt = 4, RULE_retryStmt = 5, RULE_useStmt = 6, RULE_typeDef = 7, 
		RULE_typeDimExpr = 8, RULE_unitSpec = 9, RULE_numericType = 10, RULE_unitDef = 11, 
		RULE_prefixDef = 12, RULE_varDecl = 13, RULE_varDeclAssign = 14, RULE_assignment = 15, 
		RULE_assignOp = 16, RULE_typeRef = 17, RULE_writeStmt = 18, RULE_writelnStmt = 19, 
		RULE_exprList = 20, RULE_dimensionExpr = 21, RULE_dimensionProduct = 22, 
		RULE_dimensionPower = 23, RULE_dimensionAtom = 24, RULE_expr = 25, RULE_additive = 26, 
		RULE_multiplicative = 27, RULE_power = 28, RULE_unary = 29, RULE_primary = 30, 
		RULE_conversion = 31, RULE_conversionType = 32, RULE_formatExpr = 33, 
		RULE_readExpr = 34, RULE_literal = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "separator", "statement", "statementList", "tryStmt", "retryStmt", 
			"useStmt", "typeDef", "typeDimExpr", "unitSpec", "numericType", "unitDef", 
			"prefixDef", "varDecl", "varDeclAssign", "assignment", "assignOp", "typeRef", 
			"writeStmt", "writelnStmt", "exprList", "dimensionExpr", "dimensionProduct", 
			"dimensionPower", "dimensionAtom", "expr", "additive", "multiplicative", 
			"power", "unary", "primary", "conversion", "conversionType", "formatExpr", 
			"readExpr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'type'", "'unit'", "'prefix'", "'write'", "'writeln'", 
			"'read'", "'format'", "'integer'", "'real'", "'string'", "'try'", "'rescue'", 
			"'retry'", "'end'", "':=?'", "':='", "'//'", "'\\\\'", "'/'", "'^'", 
			"'+'", "'-'", "'*'", "':'", "';'", "','", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USE", "TYPE", "UNIT", "PREFIX", "WRITE", "WRITELN", "READ", "FORMAT", 
			"INTEGER", "REAL", "STRING", "TRY", "RESCUE", "RETRY", "END", "TRY_ASSIGN", 
			"DECL_ASSIGN", "INT_DIV", "REM", "REAL_DIV", "POW", "PLUS", "MINUS", 
			"MUL", "COLON", "SEMI", "COMMA", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"REAL_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", "ID", "MULTILINE_COMMENT", 
			"LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SafeLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SafeLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SafeLangParser.EOF, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(72);
					separator();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				statement();
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(79);
							separator();
							}
							}
							setState(82); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SEMI );
						setState(84);
						statement();
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(91);
					separator();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(99);
					separator();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SafeLangParser.SEMI, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public UnitDefContext unitDef() {
			return getRuleContext(UnitDefContext.class,0);
		}
		public PrefixDefContext prefixDef() {
			return getRuleContext(PrefixDefContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclAssignContext varDeclAssign() {
			return getRuleContext(VarDeclAssignContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public WritelnStmtContext writelnStmt() {
			return getRuleContext(WritelnStmtContext.class,0);
		}
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public RetryStmtContext retryStmt() {
			return getRuleContext(RetryStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				useStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				typeDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				unitDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				prefixDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				varDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				varDeclAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				writeStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				writelnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				tryStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				retryStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(123);
				separator();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359758974L) != 0)) {
				{
				{
				setState(129);
				statement();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(130);
					separator();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryStmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(SafeLangParser.TRY, 0); }
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode END() { return getToken(SafeLangParser.END, 0); }
		public TerminalNode RESCUE() { return getToken(SafeLangParser.RESCUE, 0); }
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterTryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitTryStmt(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tryStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TRY);
			setState(142);
			statementList();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESCUE) {
				{
				setState(143);
				match(RESCUE);
				setState(144);
				statementList();
				}
			}

			setState(147);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetryStmtContext extends ParserRuleContext {
		public TerminalNode RETRY() { return getToken(SafeLangParser.RETRY, 0); }
		public RetryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterRetryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitRetryStmt(this);
		}
	}

	public final RetryStmtContext retryStmt() throws RecognitionException {
		RetryStmtContext _localctx = new RetryStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retryStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(RETRY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SafeLangParser.USE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SafeLangParser.STRING_LITERAL, 0); }
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitUseStmt(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(USE);
			setState(152);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SafeLangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SafeLangParser.COLON, 0); }
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnitSpecContext unitSpec() {
			return getRuleContext(UnitSpecContext.class,0);
		}
		public TypeDimExprContext typeDimExpr() {
			return getRuleContext(TypeDimExprContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(TYPE);
			setState(155);
			match(ID);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(156);
				unitSpec();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECL_ASSIGN) {
				{
				setState(159);
				typeDimExpr();
				}
			}

			setState(162);
			match(COLON);
			setState(163);
			numericType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDimExprContext extends ParserRuleContext {
		public TerminalNode DECL_ASSIGN() { return getToken(SafeLangParser.DECL_ASSIGN, 0); }
		public DimensionExprContext dimensionExpr() {
			return getRuleContext(DimensionExprContext.class,0);
		}
		public TypeDimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterTypeDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitTypeDimExpr(this);
		}
	}

	public final TypeDimExprContext typeDimExpr() throws RecognitionException {
		TypeDimExprContext _localctx = new TypeDimExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(DECL_ASSIGN);
			setState(166);
			dimensionExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitSpecContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SafeLangParser.LBRACK, 0); }
		public List<TerminalNode> ID() { return getTokens(SafeLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SafeLangParser.ID, i);
		}
		public TerminalNode RBRACK() { return getToken(SafeLangParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(SafeLangParser.COMMA, 0); }
		public UnitSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterUnitSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitUnitSpec(this);
		}
	}

	public final UnitSpecContext unitSpec() throws RecognitionException {
		UnitSpecContext _localctx = new UnitSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unitSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LBRACK);
			setState(169);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(170);
				match(COMMA);
				setState(171);
				match(ID);
				}
			}

			setState(174);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SafeLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(SafeLangParser.REAL, 0); }
		public TerminalNode LBRACK() { return getToken(SafeLangParser.LBRACK, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(SafeLangParser.INTEGER_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(SafeLangParser.RBRACK, 0); }
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(177);
				match(LBRACK);
				setState(178);
				match(INTEGER_LITERAL);
				setState(179);
				match(RBRACK);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitDefContext extends ParserRuleContext {
		public TerminalNode UNIT() { return getToken(SafeLangParser.UNIT, 0); }
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public UnitSpecContext unitSpec() {
			return getRuleContext(UnitSpecContext.class,0);
		}
		public TerminalNode DECL_ASSIGN() { return getToken(SafeLangParser.DECL_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterUnitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitUnitDef(this);
		}
	}

	public final UnitDefContext unitDef() throws RecognitionException {
		UnitDefContext _localctx = new UnitDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unitDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(UNIT);
			setState(183);
			match(ID);
			setState(184);
			unitSpec();
			setState(185);
			match(DECL_ASSIGN);
			setState(186);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixDefContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(SafeLangParser.PREFIX, 0); }
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TerminalNode DECL_ASSIGN() { return getToken(SafeLangParser.DECL_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SafeLangParser.COLON, 0); }
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrefixDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterPrefixDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitPrefixDef(this);
		}
	}

	public final PrefixDefContext prefixDef() throws RecognitionException {
		PrefixDefContext _localctx = new PrefixDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(PREFIX);
			setState(189);
			match(ID);
			setState(190);
			match(DECL_ASSIGN);
			setState(191);
			expr();
			setState(192);
			match(COLON);
			setState(193);
			numericType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SafeLangParser.COLON, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(COLON);
			setState(197);
			typeRef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclAssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SafeLangParser.COLON, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VarDeclAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterVarDeclAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitVarDeclAssign(this);
		}
	}

	public final VarDeclAssignContext varDeclAssign() throws RecognitionException {
		VarDeclAssignContext _localctx = new VarDeclAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDeclAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			assignOp();
			setState(201);
			expr();
			setState(202);
			match(COLON);
			setState(203);
			typeRef();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			assignOp();
			setState(207);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode DECL_ASSIGN() { return getToken(SafeLangParser.DECL_ASSIGN, 0); }
		public TerminalNode TRY_ASSIGN() { return getToken(SafeLangParser.TRY_ASSIGN, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==TRY_ASSIGN || _la==DECL_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeRefContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SafeLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(SafeLangParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(SafeLangParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitTypeRef(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359741952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(SafeLangParser.WRITE, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitWriteStmt(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WRITE);
			setState(214);
			exprList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WritelnStmtContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(SafeLangParser.WRITELN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public WritelnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writelnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterWritelnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitWritelnStmt(this);
		}
	}

	public final WritelnStmtContext writelnStmt() throws RecognitionException {
		WritelnStmtContext _localctx = new WritelnStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_writelnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WRITELN);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(217);
				exprList();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SafeLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SafeLangParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expr();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				expr();
				}
				}
				setState(227);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionExprContext extends ParserRuleContext {
		public DimensionProductContext dimensionProduct() {
			return getRuleContext(DimensionProductContext.class,0);
		}
		public DimensionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterDimensionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitDimensionExpr(this);
		}
	}

	public final DimensionExprContext dimensionExpr() throws RecognitionException {
		DimensionExprContext _localctx = new DimensionExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dimensionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			dimensionProduct();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionProductContext extends ParserRuleContext {
		public List<DimensionPowerContext> dimensionPower() {
			return getRuleContexts(DimensionPowerContext.class);
		}
		public DimensionPowerContext dimensionPower(int i) {
			return getRuleContext(DimensionPowerContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(SafeLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(SafeLangParser.MUL, i);
		}
		public List<TerminalNode> REAL_DIV() { return getTokens(SafeLangParser.REAL_DIV); }
		public TerminalNode REAL_DIV(int i) {
			return getToken(SafeLangParser.REAL_DIV, i);
		}
		public DimensionProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterDimensionProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitDimensionProduct(this);
		}
	}

	public final DimensionProductContext dimensionProduct() throws RecognitionException {
		DimensionProductContext _localctx = new DimensionProductContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dimensionProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			dimensionPower();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REAL_DIV || _la==MUL) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==REAL_DIV || _la==MUL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				dimensionPower();
				}
				}
				setState(237);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionPowerContext extends ParserRuleContext {
		public DimensionAtomContext dimensionAtom() {
			return getRuleContext(DimensionAtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(SafeLangParser.POW, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(SafeLangParser.INTEGER_LITERAL, 0); }
		public DimensionPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterDimensionPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitDimensionPower(this);
		}
	}

	public final DimensionPowerContext dimensionPower() throws RecognitionException {
		DimensionPowerContext _localctx = new DimensionPowerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dimensionPower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			dimensionAtom();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(239);
				match(POW);
				setState(240);
				match(INTEGER_LITERAL);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionAtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SafeLangParser.LPAREN, 0); }
		public DimensionExprContext dimensionExpr() {
			return getRuleContext(DimensionExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SafeLangParser.RPAREN, 0); }
		public DimensionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterDimensionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitDimensionAtom(this);
		}
	}

	public final DimensionAtomContext dimensionAtom() throws RecognitionException {
		DimensionAtomContext _localctx = new DimensionAtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dimensionAtom);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(LPAREN);
				setState(245);
				dimensionExpr();
				setState(246);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			additive();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SafeLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SafeLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SafeLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SafeLangParser.MINUS, i);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitAdditive(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			multiplicative();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				multiplicative();
				}
				}
				setState(259);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeContext extends ParserRuleContext {
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(SafeLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(SafeLangParser.MUL, i);
		}
		public List<TerminalNode> REAL_DIV() { return getTokens(SafeLangParser.REAL_DIV); }
		public TerminalNode REAL_DIV(int i) {
			return getToken(SafeLangParser.REAL_DIV, i);
		}
		public List<TerminalNode> INT_DIV() { return getTokens(SafeLangParser.INT_DIV); }
		public TerminalNode INT_DIV(int i) {
			return getToken(SafeLangParser.INT_DIV, i);
		}
		public List<TerminalNode> REM() { return getTokens(SafeLangParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(SafeLangParser.REM, i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			power();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18612224L) != 0)) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 18612224L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				power();
				}
				}
				setState(267);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode POW() { return getToken(SafeLangParser.POW, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			unary();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(269);
				match(POW);
				setState(270);
				power();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SafeLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SafeLangParser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				unary();
				}
				break;
			case READ:
			case FORMAT:
			case INTEGER:
			case REAL:
			case STRING:
			case LPAREN:
			case REAL_LITERAL:
			case INTEGER_LITERAL:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				primary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public FormatExprContext formatExpr() {
			return getRuleContext(FormatExprContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SafeLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SafeLangParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				conversion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				formatExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				readExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(LPAREN);
				setState(284);
				expr();
				setState(285);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionContext extends ParserRuleContext {
		public ConversionTypeContext conversionType() {
			return getRuleContext(ConversionTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SafeLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SafeLangParser.RPAREN, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			conversionType();
			setState(290);
			match(LPAREN);
			setState(291);
			expr();
			setState(292);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SafeLangParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(SafeLangParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(SafeLangParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SafeLangParser.ID, 0); }
		public ConversionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterConversionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitConversionType(this);
		}
	}

	public final ConversionTypeContext conversionType() throws RecognitionException {
		ConversionTypeContext _localctx = new ConversionTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conversionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359741952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormatExprContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(SafeLangParser.FORMAT, 0); }
		public TerminalNode LPAREN() { return getToken(SafeLangParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SafeLangParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SafeLangParser.RPAREN, 0); }
		public FormatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterFormatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitFormatExpr(this);
		}
	}

	public final FormatExprContext formatExpr() throws RecognitionException {
		FormatExprContext _localctx = new FormatExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FORMAT);
			setState(297);
			match(LPAREN);
			setState(298);
			expr();
			setState(299);
			match(COMMA);
			setState(300);
			expr();
			setState(301);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadExprContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SafeLangParser.READ, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SafeLangParser.STRING_LITERAL, 0); }
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitReadExpr(this);
		}
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(READ);
			setState(304);
			match(STRING_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(SafeLangParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(SafeLangParser.REAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SafeLangParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SafeLangListener ) ((SafeLangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001&\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000Q\b\u0000\u000b\u0000\f\u0000R\u0001\u0000"+
		"\u0001\u0000\u0005\u0000W\b\u0000\n\u0000\f\u0000Z\t\u0000\u0001\u0000"+
		"\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000e\b\u0000\n\u0000\f\u0000h\t\u0000\u0001\u0000"+
		"\u0003\u0000k\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002z\b\u0002\u0001\u0003"+
		"\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0084\b\u0003\n\u0003\f\u0003\u0087\t\u0003\u0005\u0003"+
		"\u0089\b\u0003\n\u0003\f\u0003\u008c\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u009e\b\u0007\u0001\u0007\u0003\u0007\u00a1"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00b5\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00db\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e0\b"+
		"\u0014\n\u0014\f\u0014\u00e3\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00ea\b\u0016\n\u0016\f\u0016\u00ed"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f2\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00f9\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0100\b\u001a\n\u001a\f\u001a\u0103\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0108\b\u001b\n\u001b\f\u001b\u010b\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0110\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0115\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0120\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0000\u0000"+
		"$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0007\u0001\u0000\t\n\u0001\u0000"+
		"\u0010\u0011\u0002\u0000\t\u000b##\u0002\u0000\u0014\u0014\u0018\u0018"+
		"\u0001\u0000\u0016\u0017\u0002\u0000\u0012\u0014\u0018\u0018\u0001\u0000"+
		" \"\u0136\u0000j\u0001\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000"+
		"\u0004y\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000\u0000\b\u008d"+
		"\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u0097\u0001"+
		"\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000\u0000\u0010\u00a5\u0001"+
		"\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014\u00b0\u0001"+
		"\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000\u0000\u0018\u00bc\u0001"+
		"\u0000\u0000\u0000\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00c7\u0001"+
		"\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000"+
		"\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000"+
		"\u0000&\u00d8\u0001\u0000\u0000\u0000(\u00dc\u0001\u0000\u0000\u0000*"+
		"\u00e4\u0001\u0000\u0000\u0000,\u00e6\u0001\u0000\u0000\u0000.\u00ee\u0001"+
		"\u0000\u0000\u00000\u00f8\u0001\u0000\u0000\u00002\u00fa\u0001\u0000\u0000"+
		"\u00004\u00fc\u0001\u0000\u0000\u00006\u0104\u0001\u0000\u0000\u00008"+
		"\u010c\u0001\u0000\u0000\u0000:\u0114\u0001\u0000\u0000\u0000<\u011f\u0001"+
		"\u0000\u0000\u0000>\u0121\u0001\u0000\u0000\u0000@\u0126\u0001\u0000\u0000"+
		"\u0000B\u0128\u0001\u0000\u0000\u0000D\u012f\u0001\u0000\u0000\u0000F"+
		"\u0132\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NX\u0003\u0004\u0002\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0004\u0002\u0000UW\u0001"+
		"\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y^\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[]\u0003\u0002\u0001\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"ab\u0005\u0000\u0000\u0001bk\u0001\u0000\u0000\u0000ce\u0003\u0002\u0001"+
		"\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000ik\u0005\u0000\u0000\u0001jK\u0001\u0000\u0000\u0000"+
		"jf\u0001\u0000\u0000\u0000k\u0001\u0001\u0000\u0000\u0000lm\u0005\u001a"+
		"\u0000\u0000m\u0003\u0001\u0000\u0000\u0000nz\u0003\f\u0006\u0000oz\u0003"+
		"\u000e\u0007\u0000pz\u0003\u0016\u000b\u0000qz\u0003\u0018\f\u0000rz\u0003"+
		"\u001a\r\u0000sz\u0003\u001c\u000e\u0000tz\u0003\u001e\u000f\u0000uz\u0003"+
		"$\u0012\u0000vz\u0003&\u0013\u0000wz\u0003\b\u0004\u0000xz\u0003\n\u0005"+
		"\u0000yn\u0001\u0000\u0000\u0000yo\u0001\u0000\u0000\u0000yp\u0001\u0000"+
		"\u0000\u0000yq\u0001\u0000\u0000\u0000yr\u0001\u0000\u0000\u0000ys\u0001"+
		"\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000"+
		"yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\u0005\u0001\u0000\u0000\u0000{}\u0003\u0002\u0001\u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u008a\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0003\u0004\u0002\u0000\u0082"+
		"\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0007\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u0091"+
		"\u0003\u0006\u0003\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090\u0092\u0003"+
		"\u0006\u0003\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u000f\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000e"+
		"\u0000\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0001"+
		"\u0000\u0000\u0098\u0099\u0005\"\u0000\u0000\u0099\r\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0002\u0000\u0000\u009b\u009d\u0005#\u0000\u0000"+
		"\u009c\u009e\u0003\u0012\t\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0003\u0010\b\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0019\u0000\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u000f\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6\u00a7\u0003"+
		"*\u0015\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001e"+
		"\u0000\u0000\u00a9\u00ac\u0005#\u0000\u0000\u00aa\u00ab\u0005\u001b\u0000"+
		"\u0000\u00ab\u00ad\u0005#\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u001f\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b4\u0007\u0000\u0000\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000"+
		"\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b5\u0005\u001f\u0000\u0000\u00b4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u0015\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7"+
		"\u00b8\u0005#\u0000\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9\u00ba"+
		"\u0005\u0011\u0000\u0000\u00ba\u00bb\u00032\u0019\u0000\u00bb\u0017\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0005"+
		"#\u0000\u0000\u00be\u00bf\u0005\u0011\u0000\u0000\u00bf\u00c0\u00032\u0019"+
		"\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0003\u0014\n\u0000"+
		"\u00c2\u0019\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005#\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0019\u0000\u0000\u00c5\u00c6\u0003\"\u0011\u0000\u00c6\u001b"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005#\u0000\u0000\u00c8\u00c9\u0003"+
		" \u0010\u0000\u00c9\u00ca\u00032\u0019\u0000\u00ca\u00cb\u0005\u0019\u0000"+
		"\u0000\u00cb\u00cc\u0003\"\u0011\u0000\u00cc\u001d\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005#\u0000\u0000\u00ce\u00cf\u0003 \u0010\u0000\u00cf\u00d0"+
		"\u00032\u0019\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007"+
		"\u0001\u0000\u0000\u00d2!\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0002"+
		"\u0000\u0000\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0005\u0000"+
		"\u0000\u00d6\u00d7\u0003(\u0014\u0000\u00d7%\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0005\u0006\u0000\u0000\u00d9\u00db\u0003(\u0014\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\'\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e1\u00032\u0019\u0000\u00dd\u00de\u0005\u001b"+
		"\u0000\u0000\u00de\u00e0\u00032\u0019\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003,\u0016\u0000\u00e5"+
		"+\u0001\u0000\u0000\u0000\u00e6\u00eb\u0003.\u0017\u0000\u00e7\u00e8\u0007"+
		"\u0003\u0000\u0000\u00e8\u00ea\u0003.\u0017\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec-\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u00030\u0018\u0000"+
		"\u00ef\u00f0\u0005\u0015\u0000\u0000\u00f0\u00f2\u0005!\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"/\u0001\u0000\u0000\u0000\u00f3\u00f9\u0005#\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001c\u0000\u0000\u00f5\u00f6\u0003*\u0015\u0000\u00f6\u00f7\u0005\u001d"+
		"\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f91\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u00034\u001a\u0000\u00fb3\u0001\u0000\u0000\u0000\u00fc"+
		"\u0101\u00036\u001b\u0000\u00fd\u00fe\u0007\u0004\u0000\u0000\u00fe\u0100"+
		"\u00036\u001b\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u01025\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0109\u00038\u001c\u0000\u0105\u0106\u0007\u0005\u0000"+
		"\u0000\u0106\u0108\u00038\u001c\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a7\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0003:\u001d\u0000\u010d\u010e"+
		"\u0005\u0015\u0000\u0000\u010e\u0110\u00038\u001c\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u01109\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0007\u0004\u0000\u0000\u0112\u0115\u0003:\u001d"+
		"\u0000\u0113\u0115\u0003<\u001e\u0000\u0114\u0111\u0001\u0000\u0000\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0115;\u0001\u0000\u0000\u0000\u0116"+
		"\u0120\u0003F#\u0000\u0117\u0120\u0003>\u001f\u0000\u0118\u0120\u0003"+
		"B!\u0000\u0119\u0120\u0003D\"\u0000\u011a\u0120\u0005#\u0000\u0000\u011b"+
		"\u011c\u0005\u001c\u0000\u0000\u011c\u011d\u00032\u0019\u0000\u011d\u011e"+
		"\u0005\u001d\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0116"+
		"\u0001\u0000\u0000\u0000\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u0118"+
		"\u0001\u0000\u0000\u0000\u011f\u0119\u0001\u0000\u0000\u0000\u011f\u011a"+
		"\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u0120=\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0003@ \u0000\u0122\u0123\u0005\u001c\u0000"+
		"\u0000\u0123\u0124\u00032\u0019\u0000\u0124\u0125\u0005\u001d\u0000\u0000"+
		"\u0125?\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0002\u0000\u0000\u0127"+
		"A\u0001\u0000\u0000\u0000\u0128\u0129\u0005\b\u0000\u0000\u0129\u012a"+
		"\u0005\u001c\u0000\u0000\u012a\u012b\u00032\u0019\u0000\u012b\u012c\u0005"+
		"\u001b\u0000\u0000\u012c\u012d\u00032\u0019\u0000\u012d\u012e\u0005\u001d"+
		"\u0000\u0000\u012eC\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0007\u0000"+
		"\u0000\u0130\u0131\u0005\"\u0000\u0000\u0131E\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0007\u0006\u0000\u0000\u0133G\u0001\u0000\u0000\u0000\u0019"+
		"KRX^fjy~\u0085\u008a\u0091\u009d\u00a0\u00ac\u00b4\u00da\u00e1\u00eb\u00f1"+
		"\u00f8\u0101\u0109\u010f\u0114\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}