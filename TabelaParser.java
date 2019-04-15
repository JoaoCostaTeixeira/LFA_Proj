// Generated from Tabela.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TabelaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID2=16, NEWLINE=17, 
		WS=18;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_stat = 2, RULE_read = 3, RULE_newTable = 4, 
		RULE_saveFile = 5, RULE_removeColumn = 6, RULE_removeLine = 7, RULE_addColumn = 8, 
		RULE_addLine = 9, RULE_printTable = 10, RULE_equals = 11, RULE_getColumn = 12, 
		RULE_getLine = 13, RULE_sum = 14;
	public static final String[] ruleNames = {
		"program", "statList", "stat", "read", "newTable", "saveFile", "removeColumn", 
		"removeLine", "addColumn", "addLine", "printTable", "equals", "getColumn", 
		"getLine", "sum"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.read('", "'.csv)'", "'.newTable('", "','", "')'", "'.saveFile('", 
		"'.removeColumn('", "'.removeLine('", "'.addColumn('", "'.addLine()'", 
		"'.printTable()'", "'='", "'.getColumn('", "'.getLine('", "'.sum('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID2", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Tabela.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TabelaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TabelaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			statList();
			setState(31);
			match(EOF);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitStatList(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID2) {
				{
				{
				setState(33);
				stat();
				}
				}
				setState(38);
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

	public static class StatContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TabelaParser.NEWLINE, 0); }
		public NewTableContext newTable() {
			return getRuleContext(NewTableContext.class,0);
		}
		public SaveFileContext saveFile() {
			return getRuleContext(SaveFileContext.class,0);
		}
		public RemoveColumnContext removeColumn() {
			return getRuleContext(RemoveColumnContext.class,0);
		}
		public RemoveLineContext removeLine() {
			return getRuleContext(RemoveLineContext.class,0);
		}
		public AddColumnContext addColumn() {
			return getRuleContext(AddColumnContext.class,0);
		}
		public AddLineContext addLine() {
			return getRuleContext(AddLineContext.class,0);
		}
		public PrintTableContext printTable() {
			return getRuleContext(PrintTableContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public GetColumnContext getColumn() {
			return getRuleContext(GetColumnContext.class,0);
		}
		public GetLineContext getLine() {
			return getRuleContext(GetLineContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				read();
				setState(40);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				newTable();
				setState(43);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				saveFile();
				setState(46);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				removeColumn();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				removeLine();
				setState(52);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				addColumn();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				addLine();
				setState(58);
				match(NEWLINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				printTable();
				setState(61);
				match(NEWLINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				equals();
				setState(64);
				match(NEWLINE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(66);
				getColumn();
				setState(67);
				match(NEWLINE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				getLine();
				setState(70);
				match(NEWLINE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(72);
				sum();
				setState(73);
				match(NEWLINE);
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

	public static class ReadContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((ReadContext)_localctx).e1 = match(ID2);
			setState(78);
			match(T__0);
			setState(79);
			((ReadContext)_localctx).e2 = match(ID2);
			setState(80);
			match(T__1);
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

	public static class NewTableContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public Token e3;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public NewTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterNewTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitNewTable(this);
		}
	}

	public final NewTableContext newTable() throws RecognitionException {
		NewTableContext _localctx = new NewTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((NewTableContext)_localctx).e1 = match(ID2);
			setState(83);
			match(T__2);
			setState(84);
			((NewTableContext)_localctx).e2 = match(ID2);
			setState(85);
			match(T__3);
			setState(86);
			((NewTableContext)_localctx).e3 = match(ID2);
			setState(87);
			match(T__4);
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

	public static class SaveFileContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public SaveFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterSaveFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitSaveFile(this);
		}
	}

	public final SaveFileContext saveFile() throws RecognitionException {
		SaveFileContext _localctx = new SaveFileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_saveFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((SaveFileContext)_localctx).e1 = match(ID2);
			setState(90);
			match(T__5);
			setState(91);
			((SaveFileContext)_localctx).e2 = match(ID2);
			setState(92);
			match(T__1);
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

	public static class RemoveColumnContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public RemoveColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterRemoveColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitRemoveColumn(this);
		}
	}

	public final RemoveColumnContext removeColumn() throws RecognitionException {
		RemoveColumnContext _localctx = new RemoveColumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_removeColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((RemoveColumnContext)_localctx).e1 = match(ID2);
			setState(95);
			match(T__6);
			setState(96);
			((RemoveColumnContext)_localctx).e2 = match(ID2);
			setState(97);
			match(T__4);
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

	public static class RemoveLineContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public RemoveLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterRemoveLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitRemoveLine(this);
		}
	}

	public final RemoveLineContext removeLine() throws RecognitionException {
		RemoveLineContext _localctx = new RemoveLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_removeLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((RemoveLineContext)_localctx).e1 = match(ID2);
			setState(100);
			match(T__7);
			setState(101);
			((RemoveLineContext)_localctx).e2 = match(ID2);
			setState(102);
			match(T__4);
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

	public static class AddColumnContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public AddColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitAddColumn(this);
		}
	}

	public final AddColumnContext addColumn() throws RecognitionException {
		AddColumnContext _localctx = new AddColumnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((AddColumnContext)_localctx).e1 = match(ID2);
			setState(105);
			match(T__8);
			setState(106);
			((AddColumnContext)_localctx).e2 = match(ID2);
			setState(107);
			match(T__4);
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

	public static class AddLineContext extends ParserRuleContext {
		public Token e1;
		public TerminalNode ID2() { return getToken(TabelaParser.ID2, 0); }
		public AddLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterAddLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitAddLine(this);
		}
	}

	public final AddLineContext addLine() throws RecognitionException {
		AddLineContext _localctx = new AddLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((AddLineContext)_localctx).e1 = match(ID2);
			setState(110);
			match(T__9);
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

	public static class PrintTableContext extends ParserRuleContext {
		public Token e1;
		public TerminalNode ID2() { return getToken(TabelaParser.ID2, 0); }
		public PrintTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterPrintTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitPrintTable(this);
		}
	}

	public final PrintTableContext printTable() throws RecognitionException {
		PrintTableContext _localctx = new PrintTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((PrintTableContext)_localctx).e1 = match(ID2);
			setState(113);
			match(T__10);
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

	public static class EqualsContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((EqualsContext)_localctx).e1 = match(ID2);
			setState(116);
			match(T__11);
			setState(117);
			((EqualsContext)_localctx).e2 = match(ID2);
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

	public static class GetColumnContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public GetColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterGetColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitGetColumn(this);
		}
	}

	public final GetColumnContext getColumn() throws RecognitionException {
		GetColumnContext _localctx = new GetColumnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_getColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((GetColumnContext)_localctx).e1 = match(ID2);
			setState(120);
			match(T__12);
			setState(121);
			((GetColumnContext)_localctx).e2 = match(ID2);
			setState(122);
			match(T__4);
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

	public static class GetLineContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public GetLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterGetLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitGetLine(this);
		}
	}

	public final GetLineContext getLine() throws RecognitionException {
		GetLineContext _localctx = new GetLineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_getLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((GetLineContext)_localctx).e1 = match(ID2);
			setState(125);
			match(T__13);
			setState(126);
			((GetLineContext)_localctx).e2 = match(ID2);
			setState(127);
			match(T__4);
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

	public static class SumContext extends ParserRuleContext {
		public Token e1;
		public Token e2;
		public Token e3;
		public List<TerminalNode> ID2() { return getTokens(TabelaParser.ID2); }
		public TerminalNode ID2(int i) {
			return getToken(TabelaParser.ID2, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabelaListener ) ((TabelaListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((SumContext)_localctx).e1 = match(ID2);
			setState(130);
			match(T__14);
			setState(131);
			((SumContext)_localctx).e2 = match(ID2);
			setState(132);
			match(T__3);
			setState(133);
			((SumContext)_localctx).e3 = match(ID2);
			setState(134);
			match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u0087"+
		"\2 \3\2\2\2\4&\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nT\3\2\2\2\f[\3\2\2\2\16"+
		"`\3\2\2\2\20e\3\2\2\2\22j\3\2\2\2\24o\3\2\2\2\26r\3\2\2\2\30u\3\2\2\2"+
		"\32y\3\2\2\2\34~\3\2\2\2\36\u0083\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2"+
		"\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&"+
		"\3\2\2\2)*\5\b\5\2*+\7\23\2\2+N\3\2\2\2,-\5\n\6\2-.\7\23\2\2.N\3\2\2\2"+
		"/\60\5\f\7\2\60\61\7\23\2\2\61N\3\2\2\2\62\63\5\16\b\2\63\64\7\23\2\2"+
		"\64N\3\2\2\2\65\66\5\20\t\2\66\67\7\23\2\2\67N\3\2\2\289\5\22\n\29:\7"+
		"\23\2\2:N\3\2\2\2;<\5\24\13\2<=\7\23\2\2=N\3\2\2\2>?\5\26\f\2?@\7\23\2"+
		"\2@N\3\2\2\2AB\5\30\r\2BC\7\23\2\2CN\3\2\2\2DE\5\32\16\2EF\7\23\2\2FN"+
		"\3\2\2\2GH\5\34\17\2HI\7\23\2\2IN\3\2\2\2JK\5\36\20\2KL\7\23\2\2LN\3\2"+
		"\2\2M)\3\2\2\2M,\3\2\2\2M/\3\2\2\2M\62\3\2\2\2M\65\3\2\2\2M8\3\2\2\2M"+
		";\3\2\2\2M>\3\2\2\2MA\3\2\2\2MD\3\2\2\2MG\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2"+
		"OP\7\22\2\2PQ\7\3\2\2QR\7\22\2\2RS\7\4\2\2S\t\3\2\2\2TU\7\22\2\2UV\7\5"+
		"\2\2VW\7\22\2\2WX\7\6\2\2XY\7\22\2\2YZ\7\7\2\2Z\13\3\2\2\2[\\\7\22\2\2"+
		"\\]\7\b\2\2]^\7\22\2\2^_\7\4\2\2_\r\3\2\2\2`a\7\22\2\2ab\7\t\2\2bc\7\22"+
		"\2\2cd\7\7\2\2d\17\3\2\2\2ef\7\22\2\2fg\7\n\2\2gh\7\22\2\2hi\7\7\2\2i"+
		"\21\3\2\2\2jk\7\22\2\2kl\7\13\2\2lm\7\22\2\2mn\7\7\2\2n\23\3\2\2\2op\7"+
		"\22\2\2pq\7\f\2\2q\25\3\2\2\2rs\7\22\2\2st\7\r\2\2t\27\3\2\2\2uv\7\22"+
		"\2\2vw\7\16\2\2wx\7\22\2\2x\31\3\2\2\2yz\7\22\2\2z{\7\17\2\2{|\7\22\2"+
		"\2|}\7\7\2\2}\33\3\2\2\2~\177\7\22\2\2\177\u0080\7\20\2\2\u0080\u0081"+
		"\7\22\2\2\u0081\u0082\7\7\2\2\u0082\35\3\2\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0085\7\21\2\2\u0085\u0086\7\22\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7"+
		"\22\2\2\u0088\u0089\7\7\2\2\u0089\37\3\2\2\2\4&M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}