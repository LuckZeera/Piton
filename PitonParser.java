// Generated from Piton.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PitonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ATR=6, OP_ART=7, PARA=8, ATE=9, 
		ENQ=10, OP_REL=11, OP_LOG=12, VAZ=13, ENT=14, SAI=15, IF=16, ELSE=17, 
		ELIF=18, RET=19, END=20, ID=21, NUM=22, AP=23, FP=24, EB=25, ErrorChar=26;
	public static final int
		RULE_inicio = 0, RULE_declaracoes = 1, RULE_argumento = 2, RULE_algoritmo = 3, 
		RULE_instr = 4, RULE_atrib = 5, RULE_acao = 6, RULE_operacao = 7, RULE_operando = 8, 
		RULE_operacao_cauda = 9, RULE_se = 10, RULE_condicao = 11, RULE_logica = 12, 
		RULE_senao = 13, RULE_senao_se = 14, RULE_enquanto = 15, RULE_para = 16, 
		RULE_funcao_vazio = 17, RULE_funcao_nao_vazio = 18, RULE_retorna = 19, 
		RULE_chamada_funcao = 20, RULE_tipo = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracoes", "argumento", "algoritmo", "instr", "atrib", 
			"acao", "operacao", "operando", "operacao_cauda", "se", "condicao", "logica", 
			"senao", "senao_se", "enquanto", "para", "funcao_vazio", "funcao_nao_vazio", 
			"retorna", "chamada_funcao", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'I'", "'C'", "'B'", "'S'", "'F'", "':'", null, "'PARA'", "'ATE'", 
			"'ENQUANTO'", null, null, "'VAZIO'", "'ENTRADA'", "'SAIDA'", "'?'", "'%'", 
			"'%?'", "'RETORNA'", "'END'", null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ATR", "OP_ART", "PARA", "ATE", "ENQ", 
			"OP_REL", "OP_LOG", "VAZ", "ENT", "SAI", "IF", "ELSE", "ELIF", "RET", 
			"END", "ID", "NUM", "AP", "FP", "EB", "ErrorChar"
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
	public String getGrammarFileName() { return "Piton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PitonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NInicioContext extends InicioContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PitonParser.EOF, 0); }
		public NInicioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			algoritmo();
			setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	 
		public DeclaracoesContext() { }
		public void copyFrom(DeclaracoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NDeclaracao2Context extends DeclaracoesContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PitonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PitonParser.ID, i);
		}
		public TerminalNode ATR() { return getToken(PitonParser.ATR, 0); }
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public TerminalNode AP() { return getToken(PitonParser.AP, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(PitonParser.FP, 0); }
		public NDeclaracao2Context(DeclaracoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNDeclaracao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNDeclaracao2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NDeclaracao1Context extends DeclaracoesContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public NDeclaracao1Context(DeclaracoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNDeclaracao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNDeclaracao1(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NDeclaracao1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				tipo();
				setState(48);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NDeclaracao2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				tipo();
				setState(51);
				match(ID);
				setState(52);
				match(ATR);
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(53);
					match(ID);
					}
					break;
				case NUM:
					{
					setState(54);
					match(NUM);
					}
					break;
				case AP:
					{
					setState(55);
					match(AP);
					setState(56);
					operacao();
					setState(57);
					match(FP);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	 
		public ArgumentoContext() { }
		public void copyFrom(ArgumentoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NArgumento3Context extends ArgumentoContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public NArgumento3Context(ArgumentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNArgumento3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNArgumento3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NArgumento2Context extends ArgumentoContext {
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public NArgumento2Context(ArgumentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNArgumento2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNArgumento2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NArgumento1Context extends ArgumentoContext {
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public NArgumento1Context(ArgumentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNArgumento1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNArgumento1(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argumento);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new NArgumento1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NArgumento2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new NArgumento3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				operacao();
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
	public static class AlgoritmoContext extends ParserRuleContext {
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	 
		public AlgoritmoContext() { }
		public void copyFrom(AlgoritmoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoAlgoritmoContext extends AlgoritmoContext {
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public BlocoAlgoritmoContext(AlgoritmoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_algoritmo);
		int _la;
		try {
			_localctx = new BlocoAlgoritmoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				instr();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6939966L) != 0) );
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
	public static class InstrContext extends ParserRuleContext {
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	 
		public InstrContext() { }
		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao2Context extends InstrContext {
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public BlocoInstrucao2Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao1Context extends InstrContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public BlocoInstrucao1Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao4Context extends InstrContext {
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public BlocoInstrucao4Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao3Context extends InstrContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public BlocoInstrucao3Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao6Context extends InstrContext {
		public Funcao_vazioContext funcao_vazio() {
			return getRuleContext(Funcao_vazioContext.class,0);
		}
		public BlocoInstrucao6Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao6(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao5Context extends InstrContext {
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public BlocoInstrucao5Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao5(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao8Context extends InstrContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public BlocoInstrucao8Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao8(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao7Context extends InstrContext {
		public Funcao_nao_vazioContext funcao_nao_vazio() {
			return getRuleContext(Funcao_nao_vazioContext.class,0);
		}
		public BlocoInstrucao7Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao7(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInstrucao9Context extends InstrContext {
		public RetornaContext retorna() {
			return getRuleContext(RetornaContext.class,0);
		}
		public BlocoInstrucao9Context(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoInstrucao9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoInstrucao9(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instr);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BlocoInstrucao1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				atrib();
				}
				break;
			case 2:
				_localctx = new BlocoInstrucao2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				acao();
				}
				break;
			case 3:
				_localctx = new BlocoInstrucao3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				se();
				}
				break;
			case 4:
				_localctx = new BlocoInstrucao4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				enquanto();
				}
				break;
			case 5:
				_localctx = new BlocoInstrucao5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				para();
				}
				break;
			case 6:
				_localctx = new BlocoInstrucao6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				funcao_vazio();
				}
				break;
			case 7:
				_localctx = new BlocoInstrucao7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				funcao_nao_vazio();
				}
				break;
			case 8:
				_localctx = new BlocoInstrucao8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				declaracoes();
				}
				break;
			case 9:
				_localctx = new BlocoInstrucao9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				retorna();
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
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NAtribuicaoContext extends AtribContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode ATR() { return getToken(PitonParser.ATR, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public NAtribuicaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNAtribuicao(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atrib);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			operacao();
			setState(85);
			match(ATR);
			setState(86);
			match(ID);
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
	public static class AcaoContext extends ParserRuleContext {
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
	 
		public AcaoContext() { }
		public void copyFrom(AcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoAcao2Context extends AcaoContext {
		public TerminalNode ENT() { return getToken(PitonParser.ENT, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public BlocoAcao2Context(AcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoAcao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoAcao2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoAcao1Context extends AcaoContext {
		public TerminalNode SAI() { return getToken(PitonParser.SAI, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public BlocoAcao1Context(AcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterBlocoAcao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitBlocoAcao1(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_acao);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAI:
				_localctx = new BlocoAcao1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(SAI);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(89);
					match(ID);
					}
					break;
				case 2:
					{
					setState(90);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(91);
					operacao();
					}
					break;
				}
				}
				break;
			case ENT:
				_localctx = new BlocoAcao2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ENT);
				setState(95);
				match(ID);
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
	public static class OperacaoContext extends ParserRuleContext {
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOperacaoContext extends OperacaoContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caudaContext operacao_cauda() {
			return getRuleContext(Operacao_caudaContext.class,0);
		}
		public NOperacaoContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacao);
		int _la;
		try {
			_localctx = new NOperacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			operando();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ART) {
				{
				setState(99);
				operacao_cauda();
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
	public static class OperandoContext extends ParserRuleContext {
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	 
		public OperandoContext() { }
		public void copyFrom(OperandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOperando2Context extends OperandoContext {
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public NOperando2Context(OperandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNOperando2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNOperando2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOperando3Context extends OperandoContext {
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public NOperando3Context(OperandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNOperando3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNOperando3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOperando1Context extends OperandoContext {
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public NOperando1Context(OperandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNOperando1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNOperando1(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operando);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new NOperando1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new NOperando2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				}
				break;
			case 3:
				_localctx = new NOperando3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				chamada_funcao();
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
	public static class Operacao_caudaContext extends ParserRuleContext {
		public Operacao_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_cauda; }
	 
		public Operacao_caudaContext() { }
		public void copyFrom(Operacao_caudaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOperacaoCaudaContext extends Operacao_caudaContext {
		public TerminalNode OP_ART() { return getToken(PitonParser.OP_ART, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<Operacao_caudaContext> operacao_cauda() {
			return getRuleContexts(Operacao_caudaContext.class);
		}
		public Operacao_caudaContext operacao_cauda(int i) {
			return getRuleContext(Operacao_caudaContext.class,i);
		}
		public NOperacaoCaudaContext(Operacao_caudaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNOperacaoCauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNOperacaoCauda(this);
		}
	}

	public final Operacao_caudaContext operacao_cauda() throws RecognitionException {
		Operacao_caudaContext _localctx = new Operacao_caudaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacao_cauda);
		try {
			int _alt;
			_localctx = new NOperacaoCaudaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OP_ART);
			setState(108);
			operando();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					operacao_cauda();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class SeContext extends ParserRuleContext {
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	 
		public SeContext() { }
		public void copyFrom(SeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NSeContext extends SeContext {
		public TerminalNode IF() { return getToken(PitonParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public Senao_seContext senao_se() {
			return getRuleContext(Senao_seContext.class,0);
		}
		public NSeContext(SeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_se);
		try {
			int _alt;
			_localctx = new NSeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			condicao();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					instr();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				senao();
				}
				break;
			case 2:
				{
				setState(124);
				senao_se();
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
	public static class CondicaoContext extends ParserRuleContext {
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	 
		public CondicaoContext() { }
		public void copyFrom(CondicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NCondicaoContext extends CondicaoContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(PitonParser.OP_REL, 0); }
		public List<LogicaContext> logica() {
			return getRuleContexts(LogicaContext.class);
		}
		public LogicaContext logica(int i) {
			return getRuleContext(LogicaContext.class,i);
		}
		public NCondicaoContext(CondicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicao);
		try {
			int _alt;
			_localctx = new NCondicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			operando();
			setState(128);
			match(OP_REL);
			setState(129);
			operando();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					logica();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class LogicaContext extends ParserRuleContext {
		public LogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logica; }
	 
		public LogicaContext() { }
		public void copyFrom(LogicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NLogicaContext extends LogicaContext {
		public TerminalNode OP_LOG() { return getToken(PitonParser.OP_LOG, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public NLogicaContext(LogicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNLogica(this);
		}
	}

	public final LogicaContext logica() throws RecognitionException {
		LogicaContext _localctx = new LogicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logica);
		try {
			_localctx = new NLogicaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OP_LOG);
			{
			setState(137);
			condicao();
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
	public static class SenaoContext extends ParserRuleContext {
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	 
		public SenaoContext() { }
		public void copyFrom(SenaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NSenaoContext extends SenaoContext {
		public TerminalNode ELSE() { return getToken(PitonParser.ELSE, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public NSenaoContext(SenaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_senao);
		try {
			int _alt;
			_localctx = new NSenaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ELSE);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					instr();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class Senao_seContext extends ParserRuleContext {
		public Senao_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_se; }
	 
		public Senao_seContext() { }
		public void copyFrom(Senao_seContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NSenao_seContext extends Senao_seContext {
		public TerminalNode ELIF() { return getToken(PitonParser.ELIF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Senao_seContext senao_se() {
			return getRuleContext(Senao_seContext.class,0);
		}
		public NSenao_seContext(Senao_seContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNSenao_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNSenao_se(this);
		}
	}

	public final Senao_seContext senao_se() throws RecognitionException {
		Senao_seContext _localctx = new Senao_seContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_senao_se);
		try {
			int _alt;
			_localctx = new NSenao_seContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ELIF);
			setState(147);
			condicao();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					instr();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(154);
				senao_se();
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
	public static class EnquantoContext extends ParserRuleContext {
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	 
		public EnquantoContext() { }
		public void copyFrom(EnquantoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NEnquantoContext extends EnquantoContext {
		public TerminalNode ENQ() { return getToken(PitonParser.ENQ, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public NEnquantoContext(EnquantoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enquanto);
		try {
			int _alt;
			_localctx = new NEnquantoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ENQ);
			setState(158);
			condicao();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					instr();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class ParaContext extends ParserRuleContext {
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	 
		public ParaContext() { }
		public void copyFrom(ParaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NParaContext extends ParaContext {
		public TerminalNode PARA() { return getToken(PitonParser.PARA, 0); }
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode ATE() { return getToken(PitonParser.ATE, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public NParaContext(ParaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_para);
		int _la;
		try {
			int _alt;
			_localctx = new NParaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PARA);
			setState(166);
			atrib();
			setState(167);
			match(ATE);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					instr();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class Funcao_vazioContext extends ParserRuleContext {
		public Funcao_vazioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_vazio; }
	 
		public Funcao_vazioContext() { }
		public void copyFrom(Funcao_vazioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NFuncao_vazioContext extends Funcao_vazioContext {
		public TerminalNode VAZ() { return getToken(PitonParser.VAZ, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode AP() { return getToken(PitonParser.AP, 0); }
		public TerminalNode FP() { return getToken(PitonParser.FP, 0); }
		public TerminalNode END() { return getToken(PitonParser.END, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public NFuncao_vazioContext(Funcao_vazioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNFuncao_vazio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNFuncao_vazio(this);
		}
	}

	public final Funcao_vazioContext funcao_vazio() throws RecognitionException {
		Funcao_vazioContext _localctx = new Funcao_vazioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcao_vazio);
		int _la;
		try {
			_localctx = new NFuncao_vazioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(VAZ);
			setState(176);
			match(ID);
			setState(177);
			match(AP);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(178);
				declaracoes();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(FP);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6939966L) != 0)) {
				{
				{
				setState(185);
				instr();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
	public static class Funcao_nao_vazioContext extends ParserRuleContext {
		public Funcao_nao_vazioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_nao_vazio; }
	 
		public Funcao_nao_vazioContext() { }
		public void copyFrom(Funcao_nao_vazioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NFuncao_nao_vazioContext extends Funcao_nao_vazioContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode AP() { return getToken(PitonParser.AP, 0); }
		public TerminalNode FP() { return getToken(PitonParser.FP, 0); }
		public TerminalNode END() { return getToken(PitonParser.END, 0); }
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public NFuncao_nao_vazioContext(Funcao_nao_vazioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNFuncao_nao_vazio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNFuncao_nao_vazio(this);
		}
	}

	public final Funcao_nao_vazioContext funcao_nao_vazio() throws RecognitionException {
		Funcao_nao_vazioContext _localctx = new Funcao_nao_vazioContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcao_nao_vazio);
		int _la;
		try {
			_localctx = new NFuncao_nao_vazioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			tipo();
			setState(194);
			match(ID);
			setState(195);
			match(AP);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(196);
				declaracoes();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(FP);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6939966L) != 0)) {
				{
				{
				setState(203);
				instr();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
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
	public static class RetornaContext extends ParserRuleContext {
		public RetornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna; }
	 
		public RetornaContext() { }
		public void copyFrom(RetornaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NRetornaContext extends RetornaContext {
		public TerminalNode RET() { return getToken(PitonParser.RET, 0); }
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode NUM() { return getToken(PitonParser.NUM, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public NRetornaContext(RetornaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNRetorna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNRetorna(this);
		}
	}

	public final RetornaContext retorna() throws RecognitionException {
		RetornaContext _localctx = new RetornaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retorna);
		try {
			_localctx = new NRetornaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(RET);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(212);
				match(ID);
				}
				break;
			case 2:
				{
				setState(213);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(214);
				operacao();
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
	public static class Chamada_funcaoContext extends ParserRuleContext {
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
	 
		public Chamada_funcaoContext() { }
		public void copyFrom(Chamada_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NChamada_funcaoContext extends Chamada_funcaoContext {
		public TerminalNode ID() { return getToken(PitonParser.ID, 0); }
		public TerminalNode AP() { return getToken(PitonParser.AP, 0); }
		public TerminalNode FP() { return getToken(PitonParser.FP, 0); }
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public NChamada_funcaoContext(Chamada_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterNChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitNChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_chamada_funcao);
		int _la;
		try {
			_localctx = new NChamada_funcaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(218);
			match(AP);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUM) {
				{
				{
				setState(219);
				argumento();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(FP);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PitonListener ) ((PitonListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
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
		"\u0004\u0001\u001a\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0003"+
		"\u0001>\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0004\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006]\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007e\b\u0007\u0001\b\u0001\b\u0001\b\u0003\bj\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0005\to\b\t\n\t\f\tr\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nw\b\n\n\n\f\nz\t\n\u0001\n\u0001\n\u0003\n~\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0084\b\u000b\n\u000b"+
		"\f\u000b\u0087\t\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r"+
		"\u008e\b\r\n\r\f\r\u0091\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0096\b\u000e\n\u000e\f\u000e\u0099\t\u000e\u0001\u000e\u0003\u000e"+
		"\u009c\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a1\b"+
		"\u000f\n\u000f\f\u000f\u00a4\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00ab\b\u0010\n\u0010\f\u0010\u00ae"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b4"+
		"\b\u0011\n\u0011\f\u0011\u00b7\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00bb\b\u0011\n\u0011\f\u0011\u00be\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c6\b\u0012\n"+
		"\u0012\f\u0012\u00c9\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00cd"+
		"\b\u0012\n\u0012\f\u0012\u00d0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d8\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00dd\b\u0014\n\u0014\f\u0014\u00e0"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000"+
		"\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*\u0000\u0002\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u0001\u0005\u00f4\u0000,\u0001\u0000\u0000\u0000\u0002=\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bR\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\f`\u0001\u0000"+
		"\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000"+
		"\u0012k\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016\u007f"+
		"\u0001\u0000\u0000\u0000\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u008b"+
		"\u0001\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u009d"+
		"\u0001\u0000\u0000\u0000 \u00a5\u0001\u0000\u0000\u0000\"\u00af\u0001"+
		"\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00d3\u0001\u0000\u0000"+
		"\u0000(\u00d9\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,"+
		"-\u0003\u0006\u0003\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000"+
		"\u0000\u0000/0\u0003*\u0015\u000001\u0005\u0015\u0000\u00001>\u0001\u0000"+
		"\u0000\u000023\u0003*\u0015\u000034\u0005\u0015\u0000\u00004;\u0005\u0006"+
		"\u0000\u00005<\u0005\u0015\u0000\u00006<\u0005\u0016\u0000\u000078\u0005"+
		"\u0017\u0000\u000089\u0003\u000e\u0007\u00009:\u0005\u0018\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000"+
		"\u0000;7\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=/\u0001\u0000"+
		"\u0000\u0000=2\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000"+
		"?C\u0005\u0015\u0000\u0000@C\u0005\u0016\u0000\u0000AC\u0003\u000e\u0007"+
		"\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DF\u0003\b\u0004\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IS\u0003\n\u0005"+
		"\u0000JS\u0003\f\u0006\u0000KS\u0003\u0014\n\u0000LS\u0003\u001e\u000f"+
		"\u0000MS\u0003 \u0010\u0000NS\u0003\"\u0011\u0000OS\u0003$\u0012\u0000"+
		"PS\u0003\u0002\u0001\u0000QS\u0003&\u0013\u0000RI\u0001\u0000\u0000\u0000"+
		"RJ\u0001\u0000\u0000\u0000RK\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000"+
		"\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\t\u0001"+
		"\u0000\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0005\u0006\u0000\u0000"+
		"VW\u0005\u0015\u0000\u0000W\u000b\u0001\u0000\u0000\u0000X\\\u0005\u000f"+
		"\u0000\u0000Y]\u0005\u0015\u0000\u0000Z]\u0005\u0016\u0000\u0000[]\u0003"+
		"\u000e\u0007\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]a\u0001\u0000\u0000\u0000^_\u0005\u000e\u0000"+
		"\u0000_a\u0005\u0015\u0000\u0000`X\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000a\r\u0001\u0000\u0000\u0000bd\u0003\u0010\b\u0000ce\u0003"+
		"\u0012\t\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000f"+
		"\u0001\u0000\u0000\u0000fj\u0005\u0016\u0000\u0000gj\u0005\u0015\u0000"+
		"\u0000hj\u0003(\u0014\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0007\u0000\u0000lp\u0003\u0010\b\u0000mo\u0003\u0012\t\u0000nm\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u0010\u0000\u0000tx\u0003\u0016\u000b\u0000uw\u0003"+
		"\b\u0004\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y}\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{~\u0003\u001a\r\u0000|~\u0003\u001c\u000e\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000"+
		"\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u0085\u0003\u0010\b\u0000\u0082"+
		"\u0084\u0003\u0018\f\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u008a\u0003"+
		"\u0016\u000b\u0000\u008a\u0019\u0001\u0000\u0000\u0000\u008b\u008f\u0005"+
		"\u0011\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u001b\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0012"+
		"\u0000\u0000\u0093\u0097\u0003\u0016\u000b\u0000\u0094\u0096\u0003\b\u0004"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\n\u0000\u0000\u009e\u00a2\u0003\u0016\u000b\u0000"+
		"\u009f\u00a1\u0003\b\u0004\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\b\u0000\u0000\u00a6\u00a7"+
		"\u0003\n\u0005\u0000\u00a7\u00a8\u0005\t\u0000\u0000\u00a8\u00ac\u0007"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0003\b\u0004\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad!\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\r\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b5\u0005\u0017\u0000\u0000"+
		"\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u0018\u0000\u0000"+
		"\u00b9\u00bb\u0003\b\u0004\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0014\u0000\u0000\u00c0"+
		"#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003*\u0015\u0000\u00c2\u00c3\u0005"+
		"\u0015\u0000\u0000\u00c3\u00c7\u0005\u0017\u0000\u0000\u00c4\u00c6\u0003"+
		"\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00ca\u00ce\u0005\u0018\u0000\u0000\u00cb\u00cd\u0003"+
		"\b\u0004\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0014\u0000\u0000\u00d2%\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d7\u0005\u0013\u0000\u0000\u00d4\u00d8\u0005\u0015\u0000"+
		"\u0000\u00d5\u00d8\u0005\u0016\u0000\u0000\u00d6\u00d8\u0003\u000e\u0007"+
		"\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u0015\u0000\u0000\u00da\u00de\u0005\u0017\u0000\u0000"+
		"\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000"+
		"\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\u0001\u0000\u0000\u00e4"+
		"+\u0001\u0000\u0000\u0000\u0018;=BGR\\`dipx}\u0085\u008f\u0097\u009b\u00a2"+
		"\u00ac\u00b5\u00bc\u00c7\u00ce\u00d7\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}