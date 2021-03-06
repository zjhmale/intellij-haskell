/* The following code was generated by JFlex 1.4.3 on 4/20/16 5:59 PM */

package intellij.haskell;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static intellij.haskell.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/20/16 5:59 PM from the specification file
 * <tt>/Users/rik/idea/intellij-haskell/src/main/scala/intellij/haskell/_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int TEX = 4;
  public static final int NCOMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\1\4\0\1\1\3\0\1\1\1\3\1\0\1\1\1\2\21\0"+
    "\1\1\1\4\1\70\1\67\1\5\1\71\1\71\1\40\1\66\1\106"+
    "\1\107\1\71\1\72\1\110\1\25\1\73\1\71\1\30\1\62\1\62"+
    "\1\62\1\62\3\33\2\24\1\102\1\111\1\74\1\76\1\75\1\71"+
    "\1\77\1\52\1\55\1\53\1\27\1\35\1\56\1\65\1\47\1\61"+
    "\1\23\1\54\1\45\1\64\1\43\1\34\1\61\1\51\1\60\1\46"+
    "\1\50\1\44\1\57\1\23\1\32\1\63\1\23\1\112\1\21\1\36"+
    "\1\42\1\37\1\113\1\26\1\120\1\17\1\10\1\11\1\7\1\121"+
    "\1\125\1\6\2\22\1\13\1\123\1\12\1\16\1\117\1\22\1\15"+
    "\1\14\1\116\1\20\1\41\1\124\1\31\1\122\1\22\1\114\1\100"+
    "\1\115\1\101\u2111\0\1\103\1\0\1\104\77\0\1\105\ude2d\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\2\4\1\5\11\6\1\7"+
    "\1\10\1\11\1\5\1\11\1\12\1\13\1\5\1\14"+
    "\1\2\1\5\1\15\1\5\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\3\6\4\36\2\1\5\0"+
    "\2\5\1\6\1\37\1\40\3\6\1\41\4\6\1\42"+
    "\2\6\1\0\1\5\3\0\1\10\2\0\1\5\1\43"+
    "\1\24\1\44\4\0\1\45\1\0\1\46\1\0\1\23"+
    "\1\25\1\47\1\45\1\50\3\0\1\51\2\0\1\52"+
    "\4\6\1\53\1\54\1\1\1\0\1\3\6\0\1\55"+
    "\1\56\11\6\1\57\2\6\1\60\3\0\1\60\1\0"+
    "\2\43\1\61\1\62\1\63\37\0\1\64\1\65\1\66"+
    "\1\67\2\70\1\71\4\6\2\53\1\0\1\3\7\0"+
    "\6\6\1\72\1\73\2\6\1\74\32\0\1\75\1\76"+
    "\2\6\1\0\1\3\3\0\1\77\6\6\1\100\4\0"+
    "\1\6\1\101\2\0\1\102\1\103\1\6\1\104\4\6"+
    "\5\0\1\105\1\0\2\6\1\106\1\6\1\107\6\0"+
    "\1\110\1\0\1\111\1\0\1\112\25\0\1\113\3\0"+
    "\1\43\1\0\1\114\2\0\1\115\1\116\1\117";

  private static int [] zzUnpackAction() {
    int [] result = new int[327];
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
    "\0\0\0\126\0\254\0\u0102\0\u0158\0\u01ae\0\u0102\0\u0204"+
    "\0\u025a\0\u02b0\0\u0306\0\u035c\0\u03b2\0\u0408\0\u045e\0\u04b4"+
    "\0\u050a\0\u0560\0\u05b6\0\u060c\0\u0662\0\u06b8\0\u0102\0\u045e"+
    "\0\u070e\0\u0764\0\u07ba\0\u0810\0\u070e\0\u0866\0\u08bc\0\u070e"+
    "\0\u0912\0\u070e\0\u0968\0\u0102\0\u0102\0\u0102\0\u0102\0\u0102"+
    "\0\u0102\0\u0102\0\u09be\0\u0102\0\u0a14\0\u0102\0\u0a6a\0\u0ac0"+
    "\0\u0b16\0\u0102\0\u0b6c\0\u0bc2\0\u0c18\0\u0c6e\0\u0cc4\0\u0d1a"+
    "\0\u0d70\0\u0dc6\0\u0e1c\0\u0e72\0\u0ec8\0\u0f1e\0\u0f74\0\u045e"+
    "\0\u0fca\0\u1020\0\u1076\0\u10cc\0\u045e\0\u1122\0\u1178\0\u11ce"+
    "\0\u1224\0\u045e\0\u127a\0\u12d0\0\u1326\0\u137c\0\u13d2\0\u1428"+
    "\0\u147e\0\u14d4\0\u152a\0\u1580\0\u15d6\0\u162c\0\u070e\0\u0102"+
    "\0\u1682\0\u16d8\0\u172e\0\u1784\0\u17da\0\u07ba\0\u0102\0\u1830"+
    "\0\u070e\0\u070e\0\u0102\0\u1886\0\u1886\0\u18dc\0\u1932\0\u1988"+
    "\0\u0102\0\u19de\0\u1a34\0\u1a8a\0\u1ae0\0\u1b36\0\u1b8c\0\u1be2"+
    "\0\u1c38\0\u0102\0\u1c8e\0\u1ce4\0\u1d3a\0\u1d90\0\u1de6\0\u1e3c"+
    "\0\u1e92\0\u1ee8\0\u1f3e\0\u0102\0\u1f94\0\u1fea\0\u2040\0\u2096"+
    "\0\u20ec\0\u2142\0\u2198\0\u21ee\0\u2244\0\u229a\0\u045e\0\u22f0"+
    "\0\u2346\0\u239c\0\u23f2\0\u2448\0\u249e\0\u24f4\0\u24f4\0\u254a"+
    "\0\u0102\0\u1682\0\u16d8\0\u0102\0\u25a0\0\u25f6\0\u264c\0\u26a2"+
    "\0\u26f8\0\u274e\0\u27a4\0\u27fa\0\u2850\0\u28a6\0\u28fc\0\u2952"+
    "\0\u29a8\0\u29fe\0\u2a54\0\u2aaa\0\u2b00\0\u2b56\0\u2bac\0\u2c02"+
    "\0\u2c58\0\u2cae\0\u2d04\0\u2d5a\0\u2db0\0\u2e06\0\u2e5c\0\u2eb2"+
    "\0\u2f08\0\u2f5e\0\u2fb4\0\u0102\0\u0102\0\u0102\0\u0102\0\u0102"+
    "\0\u300a\0\u0102\0\u3060\0\u30b6\0\u310c\0\u3162\0\u31b8\0\u0102"+
    "\0\u320e\0\u3264\0\u32ba\0\u3310\0\u3366\0\u33bc\0\u3412\0\u3468"+
    "\0\u34be\0\u3514\0\u356a\0\u35c0\0\u3616\0\u366c\0\u36c2\0\u045e"+
    "\0\u045e\0\u3718\0\u376e\0\u045e\0\u37c4\0\u381a\0\u3870\0\u38c6"+
    "\0\u391c\0\u3972\0\u39c8\0\u3a1e\0\u3a74\0\u3aca\0\u3b20\0\u3b76"+
    "\0\u3bcc\0\u3c22\0\u3c78\0\u3cce\0\u3d24\0\u3d7a\0\u3dd0\0\u3e26"+
    "\0\u3e7c\0\u3ed2\0\u3f28\0\u3f7e\0\u3fd4\0\u402a\0\u4080\0\u045e"+
    "\0\u40d6\0\u412c\0\u4182\0\u41d8\0\u422e\0\u4284\0\u42da\0\u4330"+
    "\0\u4386\0\u43dc\0\u4432\0\u4488\0\u44de\0\u4534\0\u045e\0\u458a"+
    "\0\u45e0\0\u4636\0\u468c\0\u46e2\0\u045e\0\u4738\0\u478e\0\u045e"+
    "\0\u045e\0\u47e4\0\u045e\0\u483a\0\u4890\0\u48e6\0\u493c\0\u4992"+
    "\0\u49e8\0\u4a3e\0\u4a94\0\u4aea\0\u045e\0\u4b40\0\u4b96\0\u4bec"+
    "\0\u045e\0\u4c42\0\u045e\0\u4c98\0\u4cee\0\u4d44\0\u4d9a\0\u4df0"+
    "\0\u4e46\0\u045e\0\u4e9c\0\u045e\0\u4ef2\0\u0102\0\u4f48\0\u4f9e"+
    "\0\u4ff4\0\u504a\0\u50a0\0\u50f6\0\u514c\0\u51a2\0\u51f8\0\u524e"+
    "\0\u52a4\0\u52fa\0\u5350\0\u53a6\0\u53fc\0\u5452\0\u54a8\0\u54fe"+
    "\0\u5554\0\u55aa\0\u5600\0\u0102\0\u5656\0\u56ac\0\u5702\0\u5758"+
    "\0\u57ae\0\u0102\0\u5804\0\u585a\0\u0102\0\u0102\0\u0102";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[327];
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
    "\1\4\1\5\1\6\1\7\1\5\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\2\17\1\20\1\21\1\17"+
    "\1\22\1\17\1\23\1\24\1\25\1\17\1\23\1\26"+
    "\1\17\1\23\1\24\2\23\1\27\1\30\1\31\1\17"+
    "\1\31\17\23\1\24\3\23\1\32\1\33\2\31\1\34"+
    "\1\35\1\36\1\31\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\4\17\1\60\1\61\1\17"+
    "\2\62\1\63\22\62\1\64\66\62\1\65\11\62\21\66"+
    "\1\67\104\66\127\0\1\5\2\0\1\5\124\0\1\7"+
    "\123\0\1\70\2\0\1\70\1\31\1\71\1\0\1\72"+
    "\1\73\6\0\1\74\1\31\3\0\1\75\12\0\1\31"+
    "\1\0\1\31\25\0\1\76\12\31\30\0\1\77\1\17"+
    "\1\100\2\17\1\101\6\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\5\17"+
    "\1\102\2\17\5\0\1\77\10\17\1\103\2\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\3\17\1\104\4\17"+
    "\1\105\2\17\1\0\3\17\1\0\1\106\7\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\5\17\1\107\5\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\3\17\1\110\7\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\5\0\1\77\3\17\1\111\7\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\13\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\5\0\1\77\1\17\1\112\11\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\5\17\1\113\5\17\1\0"+
    "\3\17\1\0\1\114\7\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\3\115\1\0\1\115\1\116"+
    "\3\115\1\117\2\115\1\120\4\115\1\116\3\115\1\116"+
    "\12\115\1\116\1\115\1\116\25\115\13\116\15\115\1\121"+
    "\5\115\5\0\1\122\13\23\1\0\3\23\1\0\10\23"+
    "\1\0\1\23\1\0\1\23\1\0\24\23\27\0\10\23"+
    "\11\0\1\123\7\0\1\124\2\0\1\24\3\0\1\24"+
    "\2\0\1\24\1\0\1\123\24\0\1\24\50\0\1\31"+
    "\13\0\1\125\2\0\1\24\1\126\2\0\1\24\2\0"+
    "\1\24\4\0\1\31\1\0\1\31\17\0\1\24\5\0"+
    "\5\31\1\127\5\31\12\0\1\130\21\0\1\123\4\0"+
    "\1\131\2\0\1\124\2\0\1\24\3\0\1\24\2\132"+
    "\1\24\1\131\1\123\24\0\1\24\50\0\1\31\13\0"+
    "\1\31\3\0\1\31\12\0\1\31\1\0\1\31\25\0"+
    "\13\31\23\0\3\133\1\0\15\133\1\134\44\133\1\0"+
    "\13\133\1\135\23\133\3\136\1\137\15\136\1\140\45\136"+
    "\1\137\36\136\5\0\1\31\13\0\1\125\2\0\1\24"+
    "\1\31\2\0\1\24\2\0\1\24\4\0\1\31\1\0"+
    "\1\31\17\0\1\24\5\0\13\31\30\0\1\31\13\0"+
    "\1\31\3\0\1\141\12\0\1\31\1\0\1\31\25\0"+
    "\13\31\30\0\1\31\13\0\1\31\3\0\1\31\12\0"+
    "\1\31\1\0\1\31\25\0\5\31\1\142\5\31\30\0"+
    "\1\31\13\0\1\31\3\0\1\31\10\0\1\143\1\0"+
    "\1\31\1\0\1\31\25\0\13\31\30\0\1\144\13\0"+
    "\1\144\3\0\1\144\12\0\1\144\1\0\1\144\25\0"+
    "\12\144\1\145\31\0\2\146\1\147\1\150\7\146\1\0"+
    "\1\146\3\0\1\146\2\0\1\146\5\0\1\146\1\0"+
    "\1\146\36\0\1\151\15\0\1\152\1\153\6\146\25\0"+
    "\1\154\105\0\1\77\13\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\4\17"+
    "\1\155\2\17\1\156\5\0\1\77\10\17\1\157\2\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\5\0\1\77\13\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\7\17\1\160\3\0\1\62\237\0\1\161"+
    "\35\0\1\162\100\0\21\66\1\0\104\66\21\0\1\163"+
    "\76\0\1\164\6\0\1\70\2\0\1\70\1\0\1\71"+
    "\1\0\1\72\1\73\6\0\1\74\114\0\1\165\2\0"+
    "\1\166\124\0\1\167\126\0\1\170\1\171\1\0\1\172"+
    "\122\0\1\173\120\0\1\31\13\0\1\31\3\0\1\31"+
    "\12\0\1\31\1\0\1\31\25\0\13\31\12\0\1\174"+
    "\10\0\2\175\2\0\1\175\1\76\13\175\1\76\3\175"+
    "\1\76\12\175\1\76\1\175\1\76\25\175\13\76\23\175"+
    "\5\0\1\77\125\0\1\77\1\17\1\176\4\17\1\177"+
    "\4\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\10\17\5\0\1\77\13\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\1\17\1\200\6\17\5\0\1\77"+
    "\7\17\1\201\3\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\1\17\1\202\5\17\1\203\3\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\13\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\1\204\7\17\5\0\1\77\6\17\1\205\4\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\13\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\6\17\1\206\1\17\5\0\1\77\13\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\1\207\7\17\5\0\1\77\13\17\1\0"+
    "\3\17\1\0\1\210\7\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\5\0\1\77\6\17\1\211"+
    "\4\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\10\17\24\0\1\212\3\0"+
    "\1\212\2\0\1\212\26\0\1\212\50\0\1\31\13\0"+
    "\1\31\2\0\1\212\1\31\2\0\1\212\2\0\1\212"+
    "\4\0\1\31\1\0\1\31\17\0\1\212\5\0\13\31"+
    "\35\0\1\213\11\0\1\212\3\0\1\212\2\0\1\212"+
    "\26\0\1\212\54\0\1\214\12\0\1\212\3\0\1\212"+
    "\2\0\1\212\26\0\1\212\54\0\1\215\12\0\1\212"+
    "\3\0\1\212\2\0\1\212\26\0\1\212\50\0\1\122"+
    "\144\0\1\216\1\217\2\0\1\216\2\0\1\216\26\0"+
    "\1\216\7\0\1\217\33\0\3\212\1\0\122\212\3\115"+
    "\1\0\1\115\1\116\13\115\1\116\3\115\1\116\12\115"+
    "\1\116\1\115\1\116\25\115\13\116\23\115\2\126\1\220"+
    "\1\221\122\126\30\0\1\222\2\0\1\222\26\0\1\222"+
    "\52\0\3\223\5\0\1\223\4\0\1\223\1\0\3\223"+
    "\2\0\1\223\1\0\1\223\14\0\2\223\1\0\2\223"+
    "\3\0\1\223\35\0\1\223\73\0\1\224\46\0\1\133"+
    "\2\0\1\133\2\0\1\133\1\225\2\0\1\133\2\0"+
    "\1\226\1\0\1\133\1\227\1\226\1\230\1\0\1\226"+
    "\1\0\1\231\2\0\2\133\1\232\1\233\1\234\1\235"+
    "\1\236\1\237\2\0\1\240\1\241\1\0\1\242\1\243"+
    "\1\237\1\234\1\0\1\226\2\0\1\234\2\133\26\0"+
    "\1\133\1\0\1\133\12\0\1\144\13\0\1\144\3\0"+
    "\1\144\12\0\1\144\1\0\1\144\23\0\1\224\1\0"+
    "\13\144\24\0\4\244\2\0\1\136\2\0\1\136\2\0"+
    "\1\136\1\245\2\0\1\136\2\0\1\136\1\0\1\136"+
    "\1\246\1\136\1\247\1\0\1\136\1\0\1\250\2\0"+
    "\2\136\1\251\1\252\1\253\1\254\1\255\1\256\2\0"+
    "\1\257\1\260\1\0\1\261\1\262\1\256\1\253\1\0"+
    "\1\136\2\0\1\253\2\136\26\0\1\136\1\0\1\136"+
    "\12\0\1\144\13\0\1\144\3\0\1\144\12\0\1\144"+
    "\1\0\1\144\25\0\13\144\30\0\1\263\13\146\1\0"+
    "\3\146\1\0\10\146\1\0\1\146\1\0\1\146\1\0"+
    "\24\146\11\0\1\264\15\0\10\146\5\0\1\263\13\146"+
    "\1\0\3\146\1\0\10\146\1\0\1\146\1\0\1\146"+
    "\1\0\24\146\11\0\1\265\15\0\10\146\5\0\1\263"+
    "\13\146\1\0\3\146\1\0\10\146\1\0\1\146\1\0"+
    "\1\146\1\0\24\146\11\0\1\151\15\0\10\146\5\0"+
    "\1\263\13\146\1\0\3\146\1\0\10\146\1\0\1\146"+
    "\1\0\1\146\1\0\24\146\11\0\1\266\15\0\10\146"+
    "\5\0\1\263\13\146\1\0\3\146\1\0\10\146\1\0"+
    "\1\146\1\0\1\146\1\0\24\146\11\0\1\267\15\0"+
    "\10\146\2\270\1\271\2\270\1\272\17\270\1\0\67\270"+
    "\1\0\10\270\5\0\1\77\13\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\1\17\1\273\6\17\5\0\1\77\3\17\1\274\7\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\5\0\1\77\2\17\1\275"+
    "\10\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\10\17\5\0\1\77\3\17"+
    "\1\276\7\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\2\0\1\277"+
    "\1\300\143\0\1\163\115\0\1\301\114\0\2\165\2\0"+
    "\15\165\1\302\104\165\17\0\1\303\115\0\1\304\126\0"+
    "\1\305\123\0\1\306\5\0\1\307\126\0\1\310\120\0"+
    "\1\311\115\0\2\175\2\0\122\175\5\0\1\77\1\312"+
    "\12\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\10\17\5\0\1\77\13\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\1\313\7\17\5\0\1\77\10\17"+
    "\1\314\2\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\5\0\1\77"+
    "\3\17\1\315\7\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\13\17\1\0\3\17\1\0\1\316\7\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\1\317\12\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\13\17\1\0\3\17\1\0\1\320\7\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\3\17\1\321\7\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\13\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\1\322\7\17"+
    "\5\0\1\77\6\17\1\323\4\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\5\0\1\77\3\17\1\324\7\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\11\0\1\123\12\0\1\212\3\0\1\212"+
    "\2\0\1\212\1\0\1\123\24\0\1\212\53\0\1\325"+
    "\134\0\1\326\227\0\1\327\30\0\1\216\3\0\1\216"+
    "\2\0\1\216\26\0\1\216\46\0\1\221\152\0\1\330"+
    "\2\0\1\330\26\0\1\330\67\0\1\226\3\0\1\226"+
    "\2\0\1\226\26\0\1\226\3\0\1\224\74\0\1\331"+
    "\7\0\1\332\5\0\1\333\61\0\3\334\5\0\1\334"+
    "\4\0\1\334\1\0\3\334\2\0\1\334\1\0\1\334"+
    "\14\0\2\334\1\0\2\334\3\0\1\334\35\0\1\334"+
    "\41\0\1\237\6\0\1\335\2\0\1\336\1\0\1\337"+
    "\13\0\1\133\62\0\1\133\1\0\1\133\3\0\1\133"+
    "\2\0\1\133\1\0\4\133\2\0\20\133\1\0\3\133"+
    "\11\0\1\133\12\0\1\133\57\0\1\331\5\0\1\340"+
    "\121\0\1\133\135\0\1\133\103\0\1\341\7\0\1\342"+
    "\3\0\1\343\10\0\1\133\1\0\1\344\112\0\1\133"+
    "\130\0\1\340\124\0\1\344\5\0\1\133\102\0\1\331"+
    "\10\0\1\133\125\0\1\133\7\0\1\133\50\0\4\244"+
    "\14\0\1\136\134\0\1\136\2\0\1\136\26\0\1\136"+
    "\100\0\1\345\7\0\1\346\5\0\1\347\61\0\3\136"+
    "\5\0\1\136\4\0\1\136\1\0\3\136\2\0\1\136"+
    "\1\0\1\136\14\0\2\136\1\0\2\136\3\0\1\136"+
    "\35\0\1\136\41\0\1\256\6\0\1\350\2\0\1\351"+
    "\1\0\1\352\13\0\1\136\62\0\1\136\1\0\1\136"+
    "\3\0\1\136\2\0\1\136\1\0\4\136\2\0\20\136"+
    "\1\0\3\136\11\0\1\136\12\0\1\136\57\0\1\345"+
    "\5\0\1\353\121\0\1\136\135\0\1\136\103\0\1\136"+
    "\7\0\1\354\3\0\1\355\10\0\1\136\1\0\1\356"+
    "\112\0\1\136\130\0\1\353\124\0\1\356\5\0\1\136"+
    "\102\0\1\345\10\0\1\136\125\0\1\136\7\0\1\136"+
    "\54\0\1\263\72\0\1\264\30\0\1\270\127\0\1\77"+
    "\3\17\1\357\7\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\4\17\1\360\6\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\12\17\1\361\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\7\17\1\362\3\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\3\0\1\300\243\0\1\363\4\0\2\165\1\364"+
    "\16\165\1\302\104\165\13\0\1\365\120\0\1\366\125\0"+
    "\1\306\126\0\1\165\127\0\1\165\132\0\1\367\120\0"+
    "\1\306\121\0\1\77\13\17\1\0\3\17\1\0\3\17"+
    "\1\370\4\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\13\17\1\0\3\17\1\0"+
    "\1\371\7\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\7\17\1\372\3\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\1\373\12\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\12\17\1\374\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\13\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\375\1\0\24\17"+
    "\27\0\10\17\5\0\1\77\13\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\4\17\1\376\3\17\5\0\1\77\6\17\1\377\4\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\114\0\1\u0100\127\0\1\u0101"+
    "\15\0\1\u0102\147\0\1\330\2\0\1\330\26\0\1\330"+
    "\3\0\1\224\104\0\1\133\115\0\1\133\152\0\1\133"+
    "\52\0\3\334\5\0\1\334\4\0\1\334\1\0\3\334"+
    "\2\0\1\334\1\0\1\334\14\0\2\334\1\0\2\334"+
    "\3\0\1\334\3\0\1\224\31\0\1\334\56\0\1\133"+
    "\127\0\1\133\104\0\1\133\22\0\1\133\124\0\1\133"+
    "\120\0\1\133\16\0\1\224\114\0\1\133\102\0\1\133"+
    "\136\0\1\133\127\0\1\136\115\0\1\136\152\0\1\136"+
    "\114\0\1\136\127\0\1\136\104\0\1\136\22\0\1\136"+
    "\124\0\1\136\126\0\1\136\102\0\1\136\136\0\1\136"+
    "\66\0\1\u0103\1\77\13\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\5\17\1\u0104\5\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\5\0\1\77\3\17\1\u0105\7\17\1\0\3\17"+
    "\1\0\10\17\1\0\1\17\1\0\1\17\1\0\24\17"+
    "\27\0\10\17\6\0\1\u0106\117\0\2\165\1\0\16\165"+
    "\1\302\104\165\20\0\1\u0107\117\0\1\307\130\0\1\165"+
    "\115\0\1\77\5\17\1\u0108\1\17\1\u0109\3\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\10\17\5\0\1\77\4\17\1\u010a\6\17"+
    "\1\0\3\17\1\0\10\17\1\0\1\17\1\0\1\17"+
    "\1\0\24\17\27\0\10\17\5\0\1\77\13\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\1\u010b\7\17\5\0\1\77\13\17\1\0"+
    "\3\17\1\0\10\17\1\0\1\17\1\0\1\17\1\0"+
    "\24\17\27\0\3\17\1\u010c\4\17\5\0\1\77\5\17"+
    "\1\u010d\5\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\5\0\1\77"+
    "\1\u010e\12\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\5\0\1\77"+
    "\13\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\1\17\1\u010f\6\17\17\0"+
    "\1\u0110\114\0\1\u0111\131\0\1\u0112\121\0\1\u0113\1\u0114"+
    "\123\0\1\77\3\17\1\u0115\7\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\12\0\1\u0116\123\0\1\307\122\0\1\77\11\17"+
    "\1\u0117\1\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\5\0\1\77"+
    "\4\17\1\u0118\6\17\1\0\3\17\1\0\10\17\1\0"+
    "\1\17\1\0\1\17\1\0\24\17\27\0\10\17\5\0"+
    "\1\77\13\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\1\u0119\7\17\5\0"+
    "\1\77\4\17\1\u011a\6\17\1\0\3\17\1\0\10\17"+
    "\1\0\1\17\1\0\1\17\1\0\24\17\27\0\10\17"+
    "\5\0\1\77\3\17\1\u011b\7\17\1\0\3\17\1\0"+
    "\10\17\1\0\1\17\1\0\1\17\1\0\24\17\27\0"+
    "\10\17\16\0\1\u011c\125\0\1\u011d\223\0\1\u011e\23\0"+
    "\1\u011f\141\0\1\u0120\213\0\1\u0121\16\0\1\77\3\17"+
    "\1\u0122\7\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\4\0\1\u0123"+
    "\1\77\13\17\1\0\3\17\1\0\10\17\1\0\1\17"+
    "\1\0\1\17\1\0\24\17\27\0\10\17\5\0\1\77"+
    "\13\17\1\0\3\17\1\0\10\17\1\0\1\17\1\0"+
    "\1\17\1\0\24\17\27\0\3\17\1\u0124\4\17\10\0"+
    "\1\u0125\127\0\1\u0126\132\0\1\u0127\122\0\1\u0128\234\0"+
    "\1\u0129\21\0\1\u012a\114\0\1\u012b\2\0\1\u012c\125\0"+
    "\1\u012d\132\0\1\u012e\225\0\1\u012f\15\0\1\u0130\135\0"+
    "\1\u0131\232\0\1\u0132\33\0\1\u0133\211\0\1\u0126\20\0"+
    "\1\u0134\143\0\1\u0135\112\0\1\u0136\122\0\1\u0137\234\0"+
    "\1\u0138\125\0\1\u0139\17\0\1\u013a\126\0\1\u013b\235\0"+
    "\1\u013c\14\0\1\u013d\132\0\1\u013e\125\0\1\u013f\224\0"+
    "\1\u0140\27\0\1\u0141\223\0\1\u0142\25\0\1\u0143\125\0"+
    "\1\u0144\112\0\1\220\1\221\133\0\1\u0145\232\0\1\u0146"+
    "\125\0\1\u0147\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[22704];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\1\1\11\2\1\1\11\17\1\1\11\14\1"+
    "\7\11\1\1\1\11\1\1\1\11\3\1\1\11\5\1"+
    "\5\0\20\1\1\0\1\1\3\0\1\1\2\0\3\1"+
    "\1\11\4\0\1\1\1\0\1\11\1\0\2\1\1\11"+
    "\2\1\3\0\1\11\2\0\6\1\1\11\1\1\1\0"+
    "\1\1\6\0\1\11\16\1\3\0\1\1\1\0\1\1"+
    "\1\11\2\1\1\11\37\0\5\11\1\1\1\11\5\1"+
    "\1\11\1\0\1\1\7\0\13\1\32\0\4\1\1\0"+
    "\1\1\3\0\10\1\4\0\2\1\2\0\10\1\5\0"+
    "\1\1\1\0\5\1\6\0\1\1\1\0\1\1\1\0"+
    "\1\11\25\0\1\11\3\0\1\1\1\0\1\11\2\0"+
    "\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[327];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }
    private int commentStart;
    private int commentDepth;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 218) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 60: 
          { return HS_CASE;
          }
        case 80: break;
        case 50: 
          { return HS_HEXADECIMAL;
          }
        case 81: break;
        case 35: 
          { return HS_COMMENT;
          }
        case 82: break;
        case 40: 
          { return HS_COLON_COLON;
          }
        case 83: break;
        case 64: 
          { return HS_CLASS;
          }
        case 84: break;
        case 71: 
          { return HS_NEWTYPE;
          }
        case 85: break;
        case 41: 
          { return HS_QUASI_QUOTE_E_START;
          }
        case 86: break;
        case 45: 
          { return HS_PRAGMA_END;
          }
        case 87: break;
        case 6: 
          { return HS_VARID_ID;
          }
        case 88: break;
        case 15: 
          { return HS_AT;
          }
        case 89: break;
        case 46: 
          { return HS_SHEBANG_LINE;
          }
        case 90: break;
        case 31: 
          { return HS_IF;
          }
        case 91: break;
        case 39: 
          { return HS_QUASI_QUOTE_END;
          }
        case 92: break;
        case 12: 
          { return HS_QUOTE;
          }
        case 93: break;
        case 75: 
          { return HS_TYPE_FAMILY;
          }
        case 94: break;
        case 55: 
          { return HS_QUASI_QUOTE_P_START;
          }
        case 95: break;
        case 56: 
          { yybegin(NCOMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
          }
        case 96: break;
        case 4: 
          { return HS_NEWLINE;
          }
        case 97: break;
        case 25: 
          { return HS_SEMICOLON;
          }
        case 98: break;
        case 63: 
          { return HS_INFIX;
          }
        case 99: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 100: break;
        case 37: 
          { return HS_CONSYM_ID;
          }
        case 101: break;
        case 48: 
          { return HS_FLOAT;
          }
        case 102: break;
        case 23: 
          { return HS_RIGHT_PAREN;
          }
        case 103: break;
        case 1: 
          { return HS_NCOMMENT;
          }
        case 104: break;
        case 17: 
          { return HS_TILDE;
          }
        case 105: break;
        case 74: 
          { yybegin(TEX); return HS_NCOMMENT;
          }
        case 106: break;
        case 9: 
          { return HS_DECIMAL;
          }
        case 107: break;
        case 43: 
          { if (commentDepth > 0) {
            commentDepth--;
        }
        else {
             int state = yystate();
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return HS_NCOMMENT;
        }
          }
        case 108: break;
        case 47: 
          { return HS_LET;
          }
        case 109: break;
        case 65: 
          { return HS_WHERE;
          }
        case 110: break;
        case 8: 
          { return HS_CONID_ID;
          }
        case 111: break;
        case 38: 
          { return HS_STRING_LITERAL;
          }
        case 112: break;
        case 19: 
          { return HS_LEFT_ARROW;
          }
        case 113: break;
        case 69: 
          { return HS_MODULE;
          }
        case 114: break;
        case 28: 
          { return HS_LEFT_BRACE;
          }
        case 115: break;
        case 58: 
          { return HS_DATA;
          }
        case 116: break;
        case 51: 
          { return HS_CHARACTER_LITERAL;
          }
        case 117: break;
        case 57: 
          { return HS_PRAGMA_START;
          }
        case 118: break;
        case 11: 
          { return HS_UNDERSCORE;
          }
        case 119: break;
        case 36: 
          { return HS_NCOMMENT_END;
          }
        case 120: break;
        case 78: 
          { return HS_FOREIGN_IMPORT;
          }
        case 121: break;
        case 53: 
          { return HS_QUASI_QUOTE_D_START;
          }
        case 122: break;
        case 16: 
          { return HS_VERTICAL_BAR;
          }
        case 123: break;
        case 61: 
          { return HS_TYPE;
          }
        case 124: break;
        case 5: 
          { return HS_VARSYM_ID;
          }
        case 125: break;
        case 14: 
          { return HS_EQUAL;
          }
        case 126: break;
        case 42: 
          { return HS_NCOMMENT_START;
          }
        case 127: break;
        case 18: 
          { return HS_COLON;
          }
        case 128: break;
        case 72: 
          { return HS_INSTANCE;
          }
        case 129: break;
        case 10: 
          { return HS_RIGHT_BRACKET;
          }
        case 130: break;
        case 22: 
          { return HS_LEFT_PAREN;
          }
        case 131: break;
        case 27: 
          { return HS_BACKQUOTE;
          }
        case 132: break;
        case 26: 
          { return HS_LEFT_BRACKET;
          }
        case 133: break;
        case 66: 
          { return HS_INFIXL;
          }
        case 134: break;
        case 68: 
          { return HS_IMPORT;
          }
        case 135: break;
        case 73: 
          { return HS_DERIVING;
          }
        case 136: break;
        case 33: 
          { return HS_DO;
          }
        case 137: break;
        case 13: 
          { return HS_DOT;
          }
        case 138: break;
        case 32: 
          { return HS_IN;
          }
        case 139: break;
        case 49: 
          { return HS_OCTAL;
          }
        case 140: break;
        case 67: 
          { return HS_INFIXR;
          }
        case 141: break;
        case 77: 
          { return HS_TYPE_INSTANCE;
          }
        case 142: break;
        case 44: 
          { commentDepth++;
          }
        case 143: break;
        case 2: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 144: break;
        case 70: 
          { return HS_DEFAULT;
          }
        case 145: break;
        case 21: 
          { return HS_DOUBLE_RIGHT_ARROW;
          }
        case 146: break;
        case 59: 
          { return HS_ELSE;
          }
        case 147: break;
        case 24: 
          { return HS_COMMA;
          }
        case 148: break;
        case 7: 
          { return HS_BACKSLASH;
          }
        case 149: break;
        case 34: 
          { return HS_OF;
          }
        case 150: break;
        case 62: 
          { return HS_THEN;
          }
        case 151: break;
        case 20: 
          { return HS_RIGHT_ARROW;
          }
        case 152: break;
        case 29: 
          { return HS_RIGHT_BRACE;
          }
        case 153: break;
        case 54: 
          { return HS_QUASI_QUOTE_T_START;
          }
        case 154: break;
        case 52: 
          { return HS_QUASI_QUOTE_V_START;
          }
        case 155: break;
        case 79: 
          { return HS_FOREIGN_EXPORT;
          }
        case 156: break;
        case 76: 
          { yybegin(YYINITIAL); return HS_NCOMMENT;
          }
        case 157: break;
        case 30: 
          { 
          }
        case 158: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case NCOMMENT: {
              int state = yystate();
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return HS_NCOMMENT;
            }
            case 328: break;
            default:
            return null;
            }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
