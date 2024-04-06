// Generated from Piton.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PitonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ATR=6, OP_ART=7, PARA=8, ATE=9, 
		ENQ=10, OP_REL=11, OP_LOG=12, VAZ=13, ENT=14, SAI=15, IF=16, ELSE=17, 
		ELIF=18, RET=19, ID=20, NUM=21, AP=22, FP=23, EB=24, ErrorChar=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ATR", "OP_ART", "PARA", "ATE", 
			"ENQ", "OP_REL", "OP_LOG", "VAZ", "ENT", "SAI", "IF", "ELSE", "ELIF", 
			"RET", "ID", "NUM", "LETRA", "DIGITO", "AP", "FP", "EB", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'I'", "'C'", "'B'", "'S'", "'F'", "':'", null, "'PARA'", "'ATE'", 
			"'ENQUANTO'", null, null, "'VAZIO'", "'ENTRADA'", "'SAIDA'", "'?'", "'%'", 
			"'%?'", "'RETORNA'", null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ATR", "OP_ART", "PARA", "ATE", "ENQ", 
			"OP_REL", "OP_LOG", "VAZ", "ENT", "SAI", "IF", "ELSE", "ELIF", "RET", 
			"ID", "NUM", "AP", "FP", "EB", "ErrorChar"
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


	public PitonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Piton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nb\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bj\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0092\b\u0013\n\u0013\f\u0013\u0095\t\u0013\u0001\u0014\u0004\u0014\u0098"+
		"\b\u0014\u000b\u0014\f\u0014\u0099\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u009e\b\u0014\u000b\u0014\f\u0014\u009f\u0003\u0014\u00a2\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0005\u0019\u00ad\b\u0019\n\u0019\f\u0019"+
		"\u00b0\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0000\u0000"+
		"\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0000"+
		"/\u00161\u00173\u00185\u0019\u0001\u0000\u0004\u0004\u0000##*+--//\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00bf\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000/\u0001\u0000"+
		"\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000"+
		"\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039"+
		"\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000"+
		"\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000"+
		"\rC\u0001\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011J\u0001"+
		"\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000"+
		"\u0000\u0017i\u0001\u0000\u0000\u0000\u0019k\u0001\u0000\u0000\u0000\u001b"+
		"q\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000\u001f\u007f\u0001"+
		"\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0083\u0001\u0000\u0000"+
		"\u0000%\u0086\u0001\u0000\u0000\u0000\'\u008e\u0001\u0000\u0000\u0000"+
		")\u0097\u0001\u0000\u0000\u0000+\u00a3\u0001\u0000\u0000\u0000-\u00a5"+
		"\u0001\u0000\u0000\u0000/\u00a7\u0001\u0000\u0000\u00001\u00a9\u0001\u0000"+
		"\u0000\u00003\u00ae\u0001\u0000\u0000\u00005\u00b3\u0001\u0000\u0000\u0000"+
		"78\u0005I\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005C\u0000\u0000"+
		":\u0004\u0001\u0000\u0000\u0000;<\u0005B\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005S\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005F"+
		"\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005:\u0000\u0000B\f\u0001"+
		"\u0000\u0000\u0000CD\u0007\u0000\u0000\u0000D\u000e\u0001\u0000\u0000"+
		"\u0000EF\u0005P\u0000\u0000FG\u0005A\u0000\u0000GH\u0005R\u0000\u0000"+
		"HI\u0005A\u0000\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005A\u0000\u0000"+
		"KL\u0005T\u0000\u0000LM\u0005E\u0000\u0000M\u0012\u0001\u0000\u0000\u0000"+
		"NO\u0005E\u0000\u0000OP\u0005N\u0000\u0000PQ\u0005Q\u0000\u0000QR\u0005"+
		"U\u0000\u0000RS\u0005A\u0000\u0000ST\u0005N\u0000\u0000TU\u0005T\u0000"+
		"\u0000UV\u0005O\u0000\u0000V\u0014\u0001\u0000\u0000\u0000Wb\u0005<\u0000"+
		"\u0000XY\u0005<\u0000\u0000Yb\u0005=\u0000\u0000Zb\u0005>\u0000\u0000"+
		"[\\\u0005>\u0000\u0000\\b\u0005=\u0000\u0000]^\u0005=\u0000\u0000^b\u0005"+
		"=\u0000\u0000_`\u0005!\u0000\u0000`b\u0005=\u0000\u0000aW\u0001\u0000"+
		"\u0000\u0000aX\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a[\u0001"+
		"\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"b\u0016\u0001\u0000\u0000\u0000cd\u0005O\u0000\u0000dj\u0005U\u0000\u0000"+
		"ej\u0005E\u0000\u0000fg\u0005N\u0000\u0000gh\u0005A\u0000\u0000hj\u0005"+
		"O\u0000\u0000ic\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001"+
		"\u0000\u0000\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0005V\u0000\u0000"+
		"lm\u0005A\u0000\u0000mn\u0005Z\u0000\u0000no\u0005I\u0000\u0000op\u0005"+
		"O\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005E\u0000\u0000rs\u0005"+
		"N\u0000\u0000st\u0005T\u0000\u0000tu\u0005R\u0000\u0000uv\u0005A\u0000"+
		"\u0000vw\u0005D\u0000\u0000wx\u0005A\u0000\u0000x\u001c\u0001\u0000\u0000"+
		"\u0000yz\u0005S\u0000\u0000z{\u0005A\u0000\u0000{|\u0005I\u0000\u0000"+
		"|}\u0005D\u0000\u0000}~\u0005A\u0000\u0000~\u001e\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005?\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005%\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"%\u0000\u0000\u0084\u0085\u0005?\u0000\u0000\u0085$\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005R\u0000\u0000\u0087\u0088\u0005E\u0000\u0000\u0088"+
		"\u0089\u0005T\u0000\u0000\u0089\u008a\u0005O\u0000\u0000\u008a\u008b\u0005"+
		"R\u0000\u0000\u008b\u008c\u0005N\u0000\u0000\u008c\u008d\u0005A\u0000"+
		"\u0000\u008d&\u0001\u0000\u0000\u0000\u008e\u0093\u0003+\u0015\u0000\u008f"+
		"\u0092\u0003-\u0016\u0000\u0090\u0092\u0003+\u0015\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094(\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0003-\u0016\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a1\u0001\u0000\u0000"+
		"\u0000\u009b\u009d\u0005.\u0000\u0000\u009c\u009e\u0003-\u0016\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2*\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0001\u0000\u0000\u00a4,\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007"+
		"\u0002\u0000\u0000\u00a6.\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005(\u0000"+
		"\u0000\u00a80\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005)\u0000\u0000\u00aa"+
		"2\u0001\u0000\u0000\u0000\u00ab\u00ad\u0007\u0003\u0000\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0006\u0019\u0000\u0000\u00b24\u0001\u0000\u0000\u0000\u00b3\u00b4\t"+
		"\u0000\u0000\u0000\u00b46\u0001\u0000\u0000\u0000\t\u0000ai\u0091\u0093"+
		"\u0099\u009f\u00a1\u00ae\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}