/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

package rocks.blackcat.vcl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static rocks.blackcat.vcl.psi.VCLTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/home/blckct/workspace/varnish_jetbrains_plugin/src/rocks/blackcat/vcl/VCL.flex</tt>
 */
class VCLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INLINE_C = 2;
  public static final int LONG_STRING = 4;
  public static final int LONG_STRING_END = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\4\3\5\22\0\1\1\1\24\1\20\1\3\1\0\1\27\1\30\1\16\1\37\1\40\1\23"+
    "\1\34\1\43\1\33\1\7\1\2\12\6\1\0\1\36\1\31\1\25\1\32\2\0\2\21\1\63\27\21\1"+
    "\0\1\17\2\0\1\22\1\0\1\46\1\45\1\47\1\13\1\51\1\61\1\21\1\12\1\55\1\21\1\53"+
    "\1\50\1\10\1\54\1\57\1\56\1\21\1\60\1\11\1\52\1\44\1\62\1\14\1\21\1\15\1\21"+
    "\1\41\1\35\1\42\1\26\6\0\1\5\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\5\5\0\1"+
    "\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\6\3\7"+
    "\2\1\2\3\1\10\4\3\1\1\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\11\7\3\17\1\1\1\0\1\5"+
    "\2\20\1\21\4\7\1\0\1\22\3\0\1\23\1\24"+
    "\1\25\10\7\1\26\2\7\1\27\1\30\1\31\1\32"+
    "\1\0\1\7\1\33\1\34\3\7\1\35\3\7\1\36"+
    "\5\7\1\37\4\7\1\40\1\7\1\41\10\7\1\42"+
    "\2\7\1\43\1\44\2\7\1\45\5\7\1\46\1\47"+
    "\1\7\1\50\1\51\2\7\1\52\1\53\1\7\1\54"+
    "\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u030c\0\320\0\u0374\0\u03a8\0\u03dc\0\u0410\0\320"+
    "\0\320\0\320\0\u0444\0\u0478\0\320\0\u04ac\0\u04e0\0\u0514"+
    "\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c\0\320\0\u0680"+
    "\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\320\0\u07b8\0\u07ec"+
    "\0\u0820\0\u0854\0\u0888\0\u02a4\0\320\0\u08bc\0\u08f0\0\u0924"+
    "\0\u08f0\0\320\0\320\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0ac4\0\u0208\0\u0af8\0\u0b2c\0\320\0\320"+
    "\0\320\0\320\0\u0b60\0\u0b94\0\u0208\0\u0208\0\u0bc8\0\u0bfc"+
    "\0\u0c30\0\u0208\0\u0c64\0\u0c98\0\u0ccc\0\u0208\0\u0d00\0\u0d34"+
    "\0\u0d68\0\u0d9c\0\u0dd0\0\320\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0"+
    "\0\u0ed4\0\u0f08\0\u0208\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c"+
    "\0\u1040\0\u1074\0\u10a8\0\u0208\0\u10dc\0\u1110\0\u0208\0\u0208"+
    "\0\u1144\0\u1178\0\u0208\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c"+
    "\0\u0208\0\u0208\0\u12b0\0\u0208\0\u0208\0\u12e4\0\u1318\0\u0208"+
    "\0\u0208\0\u134c\0\u0208\0\u0208";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\2\6\1\11\1\12\1\13"+
    "\1\14\1\13\1\15\2\13\1\16\1\5\1\17\1\13"+
    "\1\5\1\20\1\21\1\22\1\20\1\23\1\24\1\25"+
    "\1\26\2\20\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\2\13\1\41\2\13\1\42"+
    "\1\43\1\44\1\13\1\45\2\13\1\46\5\47\1\5"+
    "\34\47\1\50\26\47\1\5\12\47\1\51\43\47\20\5"+
    "\1\52\43\5\65\0\1\6\2\0\2\6\60\0\1\10"+
    "\20\0\1\53\1\0\1\23\36\0\4\10\2\0\56\10"+
    "\6\0\1\11\1\54\1\55\5\56\56\0\6\57\3\0"+
    "\1\57\22\0\20\57\6\0\1\13\1\0\6\13\3\0"+
    "\2\13\10\0\1\13\10\0\20\13\6\0\1\13\1\0"+
    "\5\13\1\60\3\0\2\13\10\0\1\13\10\0\1\61"+
    "\4\13\1\62\12\13\6\0\1\13\1\0\6\13\3\0"+
    "\2\13\10\0\1\13\10\0\11\13\1\63\6\13\4\64"+
    "\1\0\11\64\1\65\1\66\44\64\4\67\1\0\12\67"+
    "\1\70\1\65\21\67\1\71\21\67\25\0\1\23\63\0"+
    "\2\23\65\0\1\23\60\0\1\23\3\0\1\23\57\0"+
    "\1\23\4\0\1\23\66\0\1\23\46\0\1\72\126\0"+
    "\1\73\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\10\13\1\74\7\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\2\13\1\75"+
    "\15\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\3\13\1\76\14\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\4\13\1\77"+
    "\7\13\1\100\3\13\6\0\1\13\1\0\6\13\3\0"+
    "\2\13\10\0\1\13\10\0\5\13\1\101\12\13\6\0"+
    "\1\13\1\0\1\102\5\13\3\0\2\13\10\0\1\13"+
    "\10\0\10\13\1\103\4\13\1\104\2\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\14\13"+
    "\1\105\3\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\5\13\1\106\12\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\5\0\1\107"+
    "\2\0\20\13\63\0\1\110\42\0\1\111\63\0\1\112"+
    "\21\0\23\53\1\113\40\53\6\0\1\54\1\0\1\55"+
    "\5\56\57\0\1\56\60\0\1\57\1\0\6\57\3\0"+
    "\2\57\10\0\1\57\10\0\20\57\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\10\13\1\114"+
    "\7\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\1\13\1\115\16\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\6\13\1\116"+
    "\11\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\14\13\1\117\3\13\4\64\2\0\56\64"+
    "\4\67\1\0\12\67\1\70\1\65\47\67\2\0\56\67"+
    "\6\0\1\13\1\0\1\13\1\120\4\13\3\0\2\13"+
    "\10\0\1\13\10\0\20\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\3\13\1\121\14\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\4\13\1\122\13\13\6\0\1\13\1\0\1\13"+
    "\1\123\4\13\3\0\2\13\10\0\1\13\10\0\11\13"+
    "\1\124\6\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\14\13\1\125\3\13\6\0\1\13"+
    "\1\0\4\13\1\126\1\13\3\0\2\13\10\0\1\13"+
    "\10\0\20\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\12\13\1\127\5\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\3\13"+
    "\1\130\14\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\13\13\1\131\4\13\6\0\1\13"+
    "\1\0\1\132\5\13\3\0\2\13\10\0\1\13\10\0"+
    "\6\13\1\133\11\13\2\53\1\134\20\53\1\113\40\53"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\135\11\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\5\13\1\136\12\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\137\12\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\7\13\1\140\10\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\141\3\13\1\142\6\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\15\13"+
    "\1\143\2\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\13\13\1\144\4\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\13\13"+
    "\1\145\4\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\4\13\1\146\13\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\1\13"+
    "\1\147\16\13\6\0\1\13\1\0\6\13\3\0\2\13"+
    "\10\0\1\13\10\0\13\13\1\150\4\13\6\0\1\13"+
    "\1\0\6\13\3\0\2\13\10\0\1\13\10\0\1\151"+
    "\17\13\6\0\1\13\1\0\2\13\1\152\3\13\3\0"+
    "\2\13\10\0\1\13\10\0\20\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\3\13\1\153"+
    "\14\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\6\13\1\154\11\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\5\13\1\155"+
    "\12\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\11\13\1\156\6\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\15\13\1\157"+
    "\2\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\14\13\1\160\3\13\6\0\1\13\1\0"+
    "\6\13\3\0\2\13\10\0\1\13\10\0\14\13\1\161"+
    "\3\13\6\0\1\13\1\0\6\13\3\0\2\13\10\0"+
    "\1\13\10\0\1\162\17\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\5\13\1\163\12\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\16\13\1\164\1\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\14\13\1\165\3\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\166\12\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\6\13\1\167\11\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\10\13\1\170\7\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\15\13\1\171\2\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\172\11\13\6\0\1\13\1\0\3\13"+
    "\1\173\2\13\3\0\2\13\10\0\1\13\10\0\20\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\5\13\1\174\12\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\10\13\1\175\7\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\6\13\1\176\11\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\13\13\1\177\4\13"+
    "\6\0\1\13\1\0\3\13\1\200\2\13\3\0\2\13"+
    "\10\0\1\13\10\0\20\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\5\13\1\201\12\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\11\13\1\202\6\13\6\0\1\13\1\0\6\13"+
    "\3\0\2\13\10\0\1\13\10\0\14\13\1\203\3\13"+
    "\6\0\1\13\1\0\6\13\3\0\2\13\10\0\1\13"+
    "\10\0\3\13\1\204\14\13";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4992];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\15\1\1\11\4\1\3\11\2\1\1\11"+
    "\11\1\1\11\3\1\1\0\2\1\1\11\5\1\1\0"+
    "\1\11\3\0\1\1\2\11\13\1\4\11\1\0\20\1"+
    "\1\11\50\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int c_start;
  private int s_start;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  VCLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        switch (zzLexicalState) {
            case INLINE_C: {
              yybegin(YYINITIAL); return C_CONTENT;
            }  // fall though
            case 133: break;
            case LONG_STRING: {
              yybegin(YYINITIAL); return STRING_CONTENT;
            }  // fall though
            case 134: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 46: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 47: break;
          case 3: 
            { return OPERATOR;
            } 
            // fall through
          case 48: break;
          case 4: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 49: break;
          case 5: 
            { return NUMBER;
            } 
            // fall through
          case 50: break;
          case 6: 
            { return DOT;
            } 
            // fall through
          case 51: break;
          case 7: 
            { return IDENTIFIER;
            } 
            // fall through
          case 52: break;
          case 8: 
            { return EQ;
            } 
            // fall through
          case 53: break;
          case 9: 
            { return SEMI;
            } 
            // fall through
          case 54: break;
          case 10: 
            { return LP;
            } 
            // fall through
          case 55: break;
          case 11: 
            { return RP;
            } 
            // fall through
          case 56: break;
          case 12: 
            { return LC;
            } 
            // fall through
          case 57: break;
          case 13: 
            { return RC;
            } 
            // fall through
          case 58: break;
          case 14: 
            { return COMMA;
            } 
            // fall through
          case 59: break;
          case 15: 
            { 
            } 
            // fall through
          case 60: break;
          case 16: 
            { return DURATION;
            } 
            // fall through
          case 61: break;
          case 17: 
            { return PROPERTY;
            } 
            // fall through
          case 62: break;
          case 18: 
            { return STRING;
            } 
            // fall through
          case 63: break;
          case 19: 
            { return R_LSTRING;
            } 
            // fall through
          case 64: break;
          case 20: 
            { yybegin(LONG_STRING); s_start = getTokenStart()+2; return L_LSTRING;
            } 
            // fall through
          case 65: break;
          case 21: 
            { return R_CBRACE;
            } 
            // fall through
          case 66: break;
          case 22: 
            { return KEYWORD_IF;
            } 
            // fall through
          case 67: break;
          case 23: 
            { yybegin(INLINE_C); c_start = getTokenStart()+2; return L_CBRACE;
            } 
            // fall through
          case 68: break;
          case 24: 
            { yybegin(YYINITIAL); yypushback(2); zzStartRead = c_start; return C_CONTENT;
            } 
            // fall through
          case 69: break;
          case 25: 
            { yybegin(LONG_STRING_END); yypushback(2); zzStartRead = s_start; return STRING_CONTENT;
            } 
            // fall through
          case 70: break;
          case 26: 
            { yybegin(YYINITIAL); return R_LSTRING;
            } 
            // fall through
          case 71: break;
          case 27: 
            { return KEYWORD_SUB;
            } 
            // fall through
          case 72: break;
          case 28: 
            { return KEYWORD_SET;
            } 
            // fall through
          case 73: break;
          case 29: 
            { return KEYWORD_ACL;
            } 
            // fall through
          case 74: break;
          case 30: 
            { return KEYWORD_NEW;
            } 
            // fall through
          case 75: break;
          case 31: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 76: break;
          case 32: 
            { return KEYWORD_ELSE;
            } 
            // fall through
          case 77: break;
          case 33: 
            { return KEYWORD_ELIF;
            } 
            // fall through
          case 78: break;
          case 34: 
            { return KEYWORD_UNSET;
            } 
            // fall through
          case 79: break;
          case 35: 
            { return KEYWORD_ELSIF;
            } 
            // fall through
          case 80: break;
          case 36: 
            { return KEYWORD_ERROR;
            } 
            // fall through
          case 81: break;
          case 37: 
            { return KEYWORD_PROBE;
            } 
            // fall through
          case 82: break;
          case 38: 
            { return KEYWORD_ELSEIF;
            } 
            // fall through
          case 83: break;
          case 39: 
            { return KEYWORD_IMPORT;
            } 
            // fall through
          case 84: break;
          case 40: 
            { return KEYWORD_REMOVE;
            } 
            // fall through
          case 85: break;
          case 41: 
            { return KEYWORD_RETURN;
            } 
            // fall through
          case 86: break;
          case 42: 
            { return KEYWORD_BACKEND;
            } 
            // fall through
          case 87: break;
          case 43: 
            { return KEYWORD_INCLUDE;
            } 
            // fall through
          case 88: break;
          case 44: 
            { return KEYWORD_DIRECTOR;
            } 
            // fall through
          case 89: break;
          case 45: 
            { return KEYWORD_SYNTHETIC;
            } 
            // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
