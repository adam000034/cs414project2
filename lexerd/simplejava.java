/* simplejava.java */
/* Generated By:JavaCC: Do not edit this line. simplejava.java */
public class simplejava implements simplejavaConstants {

  static final public void program() throws ParseException {
    expression();
    jj_consume_token(0);
  }

  static final public void statement() throws ParseException {
    jj_consume_token(LEFT_BRACE);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACE:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      statement();
    }
    jj_consume_token(RIGHT_BRACE);
  }

  static final public void expression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    case INTEGER_LITERAL:{
      jj_consume_token(INTEGER_LITERAL);
      break;
      }
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      followsvariablenames();
      break;
      }
    case NEW:{
      jj_consume_token(NEW);
      jj_consume_token(IDENTIFIER);
      followsnew();
      break;
      }
    case LEFT_BRACKET:{
      variable();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void incrementstatement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:{
      jj_consume_token(ADD);
      break;
      }
    case PLUS:{
      jj_consume_token(PLUS);
      jj_consume_token(ONEVALUE);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void decrementstatement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MINUSMINUS:{
      jj_consume_token(MINUSMINUS);
      break;
      }
    case MINUS:{
      jj_consume_token(MINUS);
      jj_consume_token(ONEVALUE);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void variable() throws ParseException {
    jj_consume_token(LEFT_BRACKET);
    followsbrackets();
  }

  static final public void expressionlist() throws ParseException {
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case NEW:
      case LEFT_BRACKET:
      case INTEGER_LITERAL:
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      expression();
      jj_consume_token(COMMA);
    }
    expression();
  }

  static final public void statementlist() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACE:{
        ;
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
      statement();
      jj_consume_token(SEMICOLON);
    }
    statement();
    jj_consume_token(SEMICOLON);
  }

  static final public void followsnew() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LEFT_BRACKET:{
      jj_consume_token(LEFT_BRACKET);
      followsbrackets();
      break;
      }
    case LEFT_PARENTHESIS:{
      jj_consume_token(LEFT_PARENTHESIS);
      jj_consume_token(RIGHT_PARENTHESIS);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void assignmentstatement() throws ParseException {
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEMICOLON:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_4;
      }
      jj_consume_token(SEMICOLON);
    }
  }

  static final public void followsvariablenames() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEMICOLON:{
        jj_consume_token(SEMICOLON);
        break;
        }
      case LEFT_BRACKET:{
        label_5:
        while (true) {
          jj_consume_token(LEFT_BRACKET);
          followsbrackets();
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LEFT_BRACKET:{
            ;
            break;
            }
          default:
            jj_la1[8] = jj_gen;
            break label_5;
          }
        }
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case PERIOD:{
      label_6:
      while (true) {
        jj_consume_token(PERIOD);
        jj_consume_token(IDENTIFIER);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PERIOD:{
          ;
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          break label_6;
        }
      }
      break;
      }
    case LEFT_PARENTHESIS:{
      jj_consume_token(LEFT_PARENTHESIS);
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case TRUE:
        case FALSE:
        case NEW:
        case LEFT_BRACKET:
        case INTEGER_LITERAL:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          break label_7;
        }
        expressionlist();
      }
      jj_consume_token(RIGHT_PARENTHESIS);
      break;
      }
    case PLUS:
    case MINUS:
    case TIMES:
    case DIVIDE:
    case EQUAL:
    case GREATER_THAN:
    case NOT:
    case GREATER_THAN_OR_EQUAL_TO:
    case LESS_THAN_OR_EQUAL_TO:
    case LESS_THAN:{
      arithimeticandlogic();
      break;
      }
    case GETS:{
      jj_consume_token(GETS);
      jj_consume_token(IDENTIFIER);
      assignmentstatement();
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void followsbrackets() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_LITERAL:
    case IDENTIFIER:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:
      case TIMES:
      case DIVIDE:
      case EQUAL:
      case GREATER_THAN:
      case NOT:
      case GREATER_THAN_OR_EQUAL_TO:
      case LESS_THAN_OR_EQUAL_TO:
      case LESS_THAN:{
        arithimeticandlogic();
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        ;
      }
      jj_consume_token(RIGHT_BRACKET);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEMICOLON:{
        jj_consume_token(SEMICOLON);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        ;
      }
      break;
      }
    case RIGHT_BRACKET:{
      jj_consume_token(RIGHT_BRACKET);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEMICOLON:{
        jj_consume_token(SEMICOLON);
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void arithimeticandlogic() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PLUS:{
      jj_consume_token(PLUS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case MINUS:{
      jj_consume_token(MINUS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case DIVIDE:{
      jj_consume_token(DIVIDE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case TIMES:{
      jj_consume_token(TIMES);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case GREATER_THAN:{
      jj_consume_token(GREATER_THAN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case LESS_THAN:{
      jj_consume_token(LESS_THAN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[23] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case LESS_THAN_OR_EQUAL_TO:{
      jj_consume_token(LESS_THAN_OR_EQUAL_TO);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case GREATER_THAN_OR_EQUAL_TO:{
      jj_consume_token(GREATER_THAN_OR_EQUAL_TO);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case EQUAL:{
      jj_consume_token(EQUAL);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[26] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case NOT:{
      jj_consume_token(NOT);
      jj_consume_token(GETS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        break;
        }
      case INTEGER_LITERAL:{
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operatorexpressionsvariables() throws ParseException {
    mathstuff();
  }

  static final public void mathstuff() throws ParseException {
    jj_consume_token(IDENTIFIER);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public simplejavaTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[29];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20000000,0x40160000,0x200000,0x800000,0x40160000,0x20000000,0x40000000,0x400000,0x40000000,0x40400000,0x0,0x40160000,0x1fa00000,0x0,0x1fa00000,0x400000,0x400000,0x80000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1fa00000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x18000,0x1000,0x2000,0x18000,0x0,0x20,0x0,0x0,0x0,0x1,0x18000,0x10725,0x18000,0x304,0x0,0x0,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x18000,0x304,};
   }

  /** Constructor with InputStream. */
  public simplejava(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public simplejava(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new simplejavaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public simplejava(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new simplejavaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public simplejava(simplejavaTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(simplejavaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 29; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[49];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 29; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 49; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
