/* simplejava.java */
/* Generated By:JavaCC: Do not edit this line. simplejava.java */
public class simplejava implements simplejavaConstants {

  static final public void incrementstatement() throws ParseException {
    jj_consume_token(ADD);
  }

  static final public void decrementstatement() throws ParseException {
    jj_consume_token(MINUSMINUS);
  }

  static final public void program() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      classdefinitions();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      functionprototypeordefinition();
    }
    jj_consume_token(0);
  }

  static final public void functionprototypeordefinition() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LEFT_PARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      formalparameterlist();
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(RIGHT_PARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEMICOLON:{
      jj_consume_token(SEMICOLON);
      break;
      }
    case LEFT_BRACE:{
      jj_consume_token(LEFT_BRACE);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case FOR:
        case IF:
        case WHILE:
        case DO:
        case RETURN:
        case SEMICOLON:
        case LEFT_BRACE:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
        statement();
      }
      jj_consume_token(RIGHT_BRACE);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void functionendingafterparen() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SEMICOLON:{
      jj_consume_token(SEMICOLON);
      break;
      }
    case LEFT_BRACE:{
      jj_consume_token(LEFT_BRACE);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case FOR:
        case IF:
        case WHILE:
        case DO:
        case RETURN:
        case SEMICOLON:
        case LEFT_BRACE:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        statement();
      }
      jj_consume_token(RIGHT_BRACE);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void formalparameterlist() throws ParseException {
    formalparameter();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      jj_consume_token(COMMA);
      formalparameter();
    }
  }

  static final public void formalparameter() throws ParseException {
    jj_consume_token(IDENTIFIER);
    jj_consume_token(IDENTIFIER);
    variabledeclarations();
  }

  static final public void variabledeclarations() throws ParseException {
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
      jj_consume_token(LEFT_BRACKET);
      jj_consume_token(RIGHT_BRACKET);
    }
  }

  static final public void variabledefinitions() throws ParseException {
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        break label_7;
      }
      jj_consume_token(IDENTIFIER);
      jj_consume_token(IDENTIFIER);
      variabledeclarations();
      jj_consume_token(SEMICOLON);
    }
  }

  static final public void expressionlist() throws ParseException {
    expression();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMMA:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_8;
      }
      jj_consume_token(COMMA);
      expression();
    }
  }

  static final public void statementlist() throws ParseException {
    statement();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FOR:
      case IF:
      case WHILE:
      case DO:
      case RETURN:
      case SEMICOLON:
      case LEFT_BRACE:
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        break label_9;
      }
      statement();
    }
  }

  static final public void variable() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LEFT_BRACKET:
    case PERIOD:{
      followsvariables();
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      ;
    }
  }

  static final public void followsclassdefinitionstypes() throws ParseException {
    jj_consume_token(LEFT_BRACKET);
    label_10:
    while (true) {
      followsbrackets();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case NEW:
      case MINUS:
      case LEFT_PARENTHESIS:
      case INTEGER_LITERAL:
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        break label_10;
      }
    }
  }

  static final public void classdefinitions() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LEFT_BRACE);
    variabledefinitions();
    jj_consume_token(RIGHT_BRACE);
  }

  static final public void statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DO:{
      dowhilestatement();
      break;
      }
    case RETURN:{
      jj_consume_token(RETURN);
      expression();
      jj_consume_token(SEMICOLON);
      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      jj_consume_token(LEFT_PARENTHESIS);
      test();
      jj_consume_token(RIGHT_PARENTHESIS);
      statement();
      break;
      }
    case IF:{
      jj_consume_token(IF);
      ifstatement();
      break;
      }
    case FOR:{
      forstatement();
      break;
      }
    case LEFT_BRACE:{
      jj_consume_token(LEFT_BRACE);
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case FOR:
        case IF:
        case WHILE:
        case DO:
        case RETURN:
        case SEMICOLON:
        case LEFT_BRACE:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[14] = jj_gen;
          break label_11;
        }
        statement();
      }
      jj_consume_token(RIGHT_BRACE);
      break;
      }
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        variabledeclarations();
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        variable();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_PARENTHESIS:
      case GETS:
      case ADD:
      case MINUSMINUS:{
        followsvariablenames();
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      break;
      }
    case SEMICOLON:{
      emptystatement();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void test() throws ParseException {
    expression();
  }

  static final public void ifstatement() throws ParseException {
    jj_consume_token(LEFT_PARENTHESIS);
    expression();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      expression();
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      ;
    }
    jj_consume_token(RIGHT_PARENTHESIS);
    statement();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ELSE:{
      jj_consume_token(ELSE);
      statement();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      ;
    }
  }

  static final public void emptystatement() throws ParseException {
    jj_consume_token(SEMICOLON);
  }

  static final public void dowhilestatement() throws ParseException {
    jj_consume_token(DO);
    statement();
    jj_consume_token(WHILE);
    jj_consume_token(LEFT_PARENTHESIS);
    expression();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      expression();
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      ;
    }
    jj_consume_token(RIGHT_PARENTHESIS);
  }

  static final public void initialization() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:{
      incrementstatement();
      break;
      }
    case MINUSMINUS:{
      decrementstatement();
      break;
      }
    case GETS:{
      assignmentstatement();
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void forstatement() throws ParseException {
    jj_consume_token(FOR);
    jj_consume_token(LEFT_PARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LEFT_PARENTHESIS:
        case GETS:
        case ADD:
        case MINUSMINUS:{
          ;
          break;
          }
        default:
          jj_la1[24] = jj_gen;
          break label_12;
        }
        followsvariablenames();
      }
      break;
      }
    default:
      jj_la1[25] = jj_gen;
      ;
    }
    jj_consume_token(SEMICOLON);
    test();
    jj_consume_token(SEMICOLON);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      initialization();
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      ;
    }
    jj_consume_token(RIGHT_PARENTHESIS);
    statement();
  }

  static final public void expression() throws ParseException {
    expone();
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case OR:{
        ;
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        break label_13;
      }
      jj_consume_token(OR);
      expone();
    }
  }

  static final public void expone() throws ParseException {
    exptwo();
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case AND:{
        ;
        break;
        }
      default:
        jj_la1[28] = jj_gen;
        break label_14;
      }
      jj_consume_token(AND);
      exptwo();
    }
  }

  static final public void exptwo() throws ParseException {
    expthree();
    label_15:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NOT:{
        ;
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        break label_15;
      }
      jj_consume_token(NOT);
      expthree();
    }
  }

  static final public void expthree() throws ParseException {
    expfour();
    label_16:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EQUAL:
      case GREATER_THAN:
      case GREATER_THAN_OR_EQUAL_TO:
      case NOT_EQUAL:
      case LESS_THAN_OR_EQUAL_TO:
      case LESS_THAN:{
        ;
        break;
        }
      default:
        jj_la1[30] = jj_gen;
        break label_16;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EQUAL:{
        jj_consume_token(EQUAL);
        break;
        }
      case NOT_EQUAL:{
        jj_consume_token(NOT_EQUAL);
        break;
        }
      case LESS_THAN:{
        jj_consume_token(LESS_THAN);
        break;
        }
      case LESS_THAN_OR_EQUAL_TO:{
        jj_consume_token(LESS_THAN_OR_EQUAL_TO);
        break;
        }
      case GREATER_THAN:{
        jj_consume_token(GREATER_THAN);
        break;
        }
      case GREATER_THAN_OR_EQUAL_TO:{
        jj_consume_token(GREATER_THAN_OR_EQUAL_TO);
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      expfour();
    }
  }

  static final public void expfour() throws ParseException {
    expfive();
    label_17:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        ;
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        break label_17;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[33] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      expfive();
    }
  }

  static final public void expfive() throws ParseException {
    F();
    label_18:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIMES:
      case DIVIDE:{
        ;
        break;
        }
      default:
        jj_la1[34] = jj_gen;
        break label_18;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TIMES:{
        jj_consume_token(TIMES);
        break;
        }
      case DIVIDE:{
        jj_consume_token(DIVIDE);
        break;
        }
      default:
        jj_la1[35] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      F();
    }
  }

  static final public void F() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MINUS:{
      jj_consume_token(MINUS);
      jj_consume_token(INTEGER_LITERAL);
      break;
      }
    case INTEGER_LITERAL:{
      jj_consume_token(INTEGER_LITERAL);
      break;
      }
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:
      case LEFT_PARENTHESIS:
      case ADD:
      case MINUSMINUS:
      case IDENTIFIER:{
        followsvariablenamesforexpressions();
        break;
        }
      default:
        jj_la1[36] = jj_gen;
        ;
      }
      break;
      }
    case NEW:{
      jj_consume_token(NEW);
      jj_consume_token(IDENTIFIER);
      followsnewandidentifier();
      break;
      }
    case LEFT_PARENTHESIS:{
      jj_consume_token(LEFT_PARENTHESIS);
      expression();
      jj_consume_token(RIGHT_PARENTHESIS);
      break;
      }
    default:
      jj_la1[37] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void assignmentstatement() throws ParseException {
    jj_consume_token(GETS);
    expression();
  }

  static final public void followsnewandidentifier() throws ParseException {
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
      jj_la1[38] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void incrementstatements() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ADD:{
      incrementstatement();
      break;
      }
    case MINUSMINUS:{
      decrementstatement();
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void followsvariables() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PERIOD:{
      label_19:
      while (true) {
        jj_consume_token(PERIOD);
        jj_consume_token(IDENTIFIER);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PERIOD:{
          ;
          break;
          }
        default:
          jj_la1[40] = jj_gen;
          break label_19;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:{
        followsvariables();
        break;
        }
      default:
        jj_la1[41] = jj_gen;
        ;
      }
      break;
      }
    case LEFT_BRACKET:{
      label_20:
      while (true) {
        jj_consume_token(LEFT_BRACKET);
        expression();
        jj_consume_token(RIGHT_BRACKET);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LEFT_BRACKET:{
          ;
          break;
          }
        default:
          jj_la1[42] = jj_gen;
          break label_20;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:{
        followsvariables();
        break;
        }
      default:
        jj_la1[43] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[44] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void followsvariablenames() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LEFT_PARENTHESIS:{
      jj_consume_token(LEFT_PARENTHESIS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case NEW:
      case MINUS:
      case LEFT_PARENTHESIS:
      case INTEGER_LITERAL:
      case IDENTIFIER:{
        expressionlist();
        break;
        }
      default:
        jj_la1[45] = jj_gen;
        ;
      }
      jj_consume_token(RIGHT_PARENTHESIS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_PARENTHESIS:
      case GETS:
      case ADD:
      case MINUSMINUS:{
        followsvariablenames();
        break;
        }
      default:
        jj_la1[46] = jj_gen;
        ;
      }
      break;
      }
    case GETS:{
      assignmentstatement();
      break;
      }
    case ADD:
    case MINUSMINUS:{
      incrementstatements();
      break;
      }
    default:
      jj_la1[47] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void followsvariablenamesforexpressions() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      label_21:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LEFT_BRACKET:
        case PERIOD:
        case LEFT_PARENTHESIS:
        case ADD:
        case MINUSMINUS:
        case IDENTIFIER:{
          ;
          break;
          }
        default:
          jj_la1[48] = jj_gen;
          break label_21;
        }
        followsvariablenamesforexpressions();
      }
      break;
      }
    case PERIOD:{
      label_22:
      while (true) {
        jj_consume_token(PERIOD);
        jj_consume_token(IDENTIFIER);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PERIOD:{
          ;
          break;
          }
        default:
          jj_la1[49] = jj_gen;
          break label_22;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:
      case LEFT_PARENTHESIS:
      case ADD:
      case MINUSMINUS:
      case IDENTIFIER:{
        followsvariablenamesforexpressions();
        break;
        }
      default:
        jj_la1[50] = jj_gen;
        ;
      }
      break;
      }
    case LEFT_PARENTHESIS:{
      jj_consume_token(LEFT_PARENTHESIS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case TRUE:
      case FALSE:
      case NEW:
      case MINUS:
      case LEFT_PARENTHESIS:
      case INTEGER_LITERAL:
      case IDENTIFIER:{
        expressionlist();
        break;
        }
      default:
        jj_la1[51] = jj_gen;
        ;
      }
      jj_consume_token(RIGHT_PARENTHESIS);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:
      case LEFT_PARENTHESIS:
      case ADD:
      case MINUSMINUS:
      case IDENTIFIER:{
        followsvariablenamesforexpressions();
        break;
        }
      default:
        jj_la1[52] = jj_gen;
        ;
      }
      break;
      }
    case LEFT_BRACKET:{
      label_23:
      while (true) {
        jj_consume_token(LEFT_BRACKET);
        expression();
        jj_consume_token(RIGHT_BRACKET);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LEFT_BRACKET:{
          ;
          break;
          }
        default:
          jj_la1[53] = jj_gen;
          break label_23;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:
      case PERIOD:
      case LEFT_PARENTHESIS:
      case ADD:
      case MINUSMINUS:
      case IDENTIFIER:{
        followsvariablenamesforexpressions();
        break;
        }
      default:
        jj_la1[54] = jj_gen;
        ;
      }
      break;
      }
    case ADD:
    case MINUSMINUS:{
      incrementstatements();
      break;
      }
    default:
      jj_la1[55] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void followsbrackets() throws ParseException {
    expression();
    jj_consume_token(RIGHT_BRACKET);
    label_24:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LEFT_BRACKET:{
        ;
        break;
        }
      default:
        jj_la1[56] = jj_gen;
        break label_24;
      }
      jj_consume_token(LEFT_BRACKET);
      jj_consume_token(RIGHT_BRACKET);
    }
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
  static final private int[] jj_la1 = new int[57];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x10000,0x0,0x0,0x2048f000,0x20400000,0x2048f000,0x20400000,0x0,0x40000000,0x0,0x0,0x2048f000,0x40000000,0x960000,0x2048f000,0x0,0x0,0x2048f000,0x0,0x0,0x800,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10000000,0xc000000,0xc000000,0xa00000,0xa00000,0x3000000,0x3000000,0x40000000,0x960000,0x40000000,0x0,0x0,0x40000000,0x40000000,0x40000000,0x40000000,0x960000,0x0,0x0,0x40000000,0x0,0x40000000,0x960000,0x40000000,0x40000000,0x40000000,0x40000000,0x40000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x8000,0x8000,0x8000,0x0,0x8000,0x0,0x2,0x0,0x8000,0x2,0x8000,0x1,0xc020,0x8000,0x8000,0x3420,0x8000,0x8,0x800,0x0,0x8,0x800,0x3400,0x3420,0x8000,0x8000,0x800,0x8,0x0,0x384,0x384,0x0,0x0,0x0,0x0,0xb021,0xc020,0x20,0x3000,0x1,0x1,0x0,0x1,0x1,0xc020,0x3420,0x3420,0xb021,0x1,0xb021,0xc020,0xb021,0x0,0xb021,0xb021,0x0,};
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
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(simplejavaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 57; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[48];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 57; i++) {
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
    for (int i = 0; i < 48; i++) {
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
