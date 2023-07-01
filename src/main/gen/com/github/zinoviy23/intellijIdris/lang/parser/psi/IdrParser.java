// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class IdrParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(CASE_EXPRESSION, EXPRESSION, FUNCTION_CALL_EXPRESSION, ID_EXPRESSION,
      IF_EXPRESSION, INTEGER_LITERAL_EXPRESSION, LIST_LITERAL_EXPRESSION, OPERATOR_EXPRESSION,
      PAREN_EXPRESSION, PLACEHOLDER_EXPRESSION, SIMPLE_EXPRESSION, STRING_LITERAL_EXPRESSION,
      TYPE_EXPRESSION),
  };

  /* ********************************************************** */
  // DIRECTIVE_START DIRECTIVE_TYPE DIRECTIVE_CONTENT
  public static boolean directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive")) return false;
    if (!nextTokenIs(b, DIRECTIVE_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE, null);
    r = consumeTokens(b, 1, DIRECTIVE_START, DIRECTIVE_TYPE, DIRECTIVE_CONTENT);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // expression (COMMA expression)+
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1, -1);
    r = r && expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)+
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_list_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA expression
  private static boolean expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (module_statement EOL+)? top_level ((EOL+ top_level) | EOL+ <<eof>> | indent)*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && top_level(b, l + 1);
    r = r && file_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (module_statement EOL+)?
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    file_0_0(b, l + 1);
    return true;
  }

  // module_statement EOL+
  private static boolean file_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_statement(b, l + 1);
    r = r && file_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean file_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "file_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ((EOL+ top_level) | EOL+ <<eof>> | indent)*
  private static boolean file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_2", c)) break;
    }
    return true;
  }

  // (EOL+ top_level) | EOL+ <<eof>> | indent
  private static boolean file_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_2_0_0(b, l + 1);
    if (!r) r = file_2_0_1(b, l + 1);
    if (!r) r = indent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+ top_level
  private static boolean file_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_2_0_0_0(b, l + 1);
    r = r && top_level(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean file_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "file_2_0_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+ <<eof>>
  private static boolean file_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_2_0_1_0(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean file_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "file_2_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id_expression | paren_expression
  static boolean function_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_element")) return false;
    if (!nextTokenIs(b, "", IDENTIFICATOR, LPAR)) return false;
    boolean r;
    r = id_expression(b, l + 1);
    if (!r) r = paren_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATOR (simple_expression)* EQ_SIGN indent? expression {
  // //    recoverWhile = function_match_recover
  // }
  public static boolean function_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFICATOR);
    r = r && function_match_1(b, l + 1);
    r = r && consumeToken(b, EQ_SIGN);
    r = r && function_match_3(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && function_match_5(b, l + 1);
    exit_section_(b, m, FUNCTION_MATCH, r);
    return r;
  }

  // (simple_expression)*
  private static boolean function_match_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_match_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_match_1", c)) break;
    }
    return true;
  }

  // (simple_expression)
  private static boolean function_match_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean function_match_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_3")) return false;
    indent(b, l + 1);
    return true;
  }

  // {
  // //    recoverWhile = function_match_recover
  // }
  private static boolean function_match_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // IDENTIFICATOR COLON_SIGN type_specification
  public static boolean function_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SPECIFICATION, null);
    r = consumeTokens(b, 2, IDENTIFICATOR, COLON_SIGN);
    p = r; // pin = 2
    r = r && type_specification(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IDENTIFICATOR
  public static boolean id_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_expression")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFICATOR);
    exit_section_(b, m, ID_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATOR (IDENTIFICATOR_SEP IDENTIFICATOR)*
  public static boolean identificator_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificator_reference")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFICATOR_REFERENCE, null);
    r = consumeToken(b, IDENTIFICATOR);
    p = r; // pin = 1
    r = r && identificator_reference_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (IDENTIFICATOR_SEP IDENTIFICATOR)*
  private static boolean identificator_reference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificator_reference_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identificator_reference_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identificator_reference_1", c)) break;
    }
    return true;
  }

  // IDENTIFICATOR_SEP IDENTIFICATOR
  private static boolean identificator_reference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificator_reference_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATOR_SEP, IDENTIFICATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT identificator_reference
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, null);
    r = consumeToken(b, KW_IMPORT);
    p = r; // pin = 1
    r = r && identificator_reference(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // EOL+ OPEN
  static boolean indent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indent")) return false;
    if (!nextTokenIs(b, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indent_0(b, l + 1);
    r = r && consumeToken(b, OPEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean indent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "indent_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  public static boolean integer_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_expression")) return false;
    if (!nextTokenIs(b, INTEGER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, INTEGER_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET [expression (COMMA expression)*] RBRACKET
  public static boolean list_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_LITERAL_EXPRESSION, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, list_literal_expression_1(b, l + 1));
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [expression (COMMA expression)*]
  private static boolean list_literal_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1")) return false;
    list_literal_expression_1_0(b, l + 1);
    return true;
  }

  // expression (COMMA expression)*
  private static boolean list_literal_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && list_literal_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean list_literal_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_literal_expression_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean list_literal_expression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MODULE identificator_reference
  public static boolean module_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_statement")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODULE_STATEMENT, null);
    r = consumeToken(b, KW_MODULE);
    p = r; // pin = 1
    r = r && identificator_reference(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (KW_INFIX | KW_PREFIX | KW_INFIXL | KW_INFIXR) INTEGER_LITERAL operator_list
  public static boolean operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_DECLARATION, "<operator declaration>");
    r = operator_declaration_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, INTEGER_LITERAL));
    r = p && operator_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // KW_INFIX | KW_PREFIX | KW_INFIXL | KW_INFIXR
  private static boolean operator_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declaration_0")) return false;
    boolean r;
    r = consumeToken(b, KW_INFIX);
    if (!r) r = consumeToken(b, KW_PREFIX);
    if (!r) r = consumeToken(b, KW_INFIXL);
    if (!r) r = consumeToken(b, KW_INFIXR);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR (COMMA OPERATOR)*
  public static boolean operator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_list")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    r = r && operator_list_1(b, l + 1);
    exit_section_(b, m, OPERATOR_LIST, r);
    return r;
  }

  // (COMMA OPERATOR)*
  private static boolean operator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operator_list_1", c)) break;
    }
    return true;
  }

  // COMMA OPERATOR
  private static boolean operator_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAR EOL* paren_expression_end
  public static boolean paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPRESSION, null);
    r = consumeToken(b, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, paren_expression_1(b, l + 1));
    r = p && paren_expression_end(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // EOL*
  private static boolean paren_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "paren_expression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RPAR |
  //                          IDENTIFICATOR COLON_SIGN expression RPAR |
  //                          expression RPAR |
  //                          expression_list RPAR
  public static boolean paren_expression_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression_end")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPRESSION_END, "<paren expression end>");
    r = consumeToken(b, RPAR);
    if (!r) r = paren_expression_end_1(b, l + 1);
    if (!r) r = paren_expression_end_2(b, l + 1);
    if (!r) r = paren_expression_end_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFICATOR COLON_SIGN expression RPAR
  private static boolean paren_expression_end_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression_end_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATOR, COLON_SIGN);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression RPAR
  private static boolean paren_expression_end_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression_end_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression_list RPAR
  private static boolean paren_expression_end_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression_end_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_list(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PLACEHOLDER
  public static boolean placeholder_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "placeholder_expression")) return false;
    if (!nextTokenIs(b, PLACEHOLDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLACEHOLDER);
    exit_section_(b, m, PLACEHOLDER_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_QUOTE STRING_CONTENT? STRING_QUOTE
  public static boolean string_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_expression")) return false;
    if (!nextTokenIs(b, STRING_QUOTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL_EXPRESSION, null);
    r = consumeToken(b, STRING_QUOTE);
    p = r; // pin = 1
    r = r && report_error_(b, string_literal_expression_1(b, l + 1));
    r = p && consumeToken(b, STRING_QUOTE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // STRING_CONTENT?
  private static boolean string_literal_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal_expression_1")) return false;
    consumeToken(b, STRING_CONTENT);
    return true;
  }

  /* ********************************************************** */
  // directive | import_statement | operator_declaration | function_specification | function_match
  static boolean top_level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level")) return false;
    boolean r;
    r = directive(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = operator_declaration(b, l + 1);
    if (!r) r = function_specification(b, l + 1);
    if (!r) r = function_match(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean type_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFICATION, "<type specification>");
    r = expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: BINARY(type_expression)
  // 1: BINARY(operator_expression)
  // 2: ATOM(if_expression) ATOM(case_expression)
  // 3: ATOM(function_call_expression)
  // 4: ATOM(simple_expression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = if_expression(b, l + 1);
    if (!r) r = case_expression(b, l + 1);
    if (!r) r = function_call_expression(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, TYPE_SIGN)) {
        r = report_error_(b, expression(b, l, 0));
        r = type_expression_1(b, l + 1) && r;
        exit_section_(b, l, m, TYPE_EXPRESSION, r, true, null);
      }
      else if (g < 1 && operator_expression_0(b, l + 1)) {
        r = report_error_(b, expression(b, l, 1));
        r = operator_expression_1(b, l + 1) && r;
        exit_section_(b, l, m, OPERATOR_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // (TYPE_SIGN expression)*
  private static boolean type_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_expression_1", c)) break;
    }
    return true;
  }

  // TYPE_SIGN expression
  private static boolean type_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_SIGN);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR indent?
  private static boolean operator_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPERATOR);
    r = r && operator_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean operator_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_0_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // (OPERATOR indent? expression)*
  private static boolean operator_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operator_expression_1", c)) break;
    }
    return true;
  }

  // OPERATOR indent? expression
  private static boolean operator_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    r = r && operator_expression_1_0_1(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean operator_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1_0_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // KW_IF indent* expression indent* KW_THEN indent* expression indent* KW_ELSE indent* expression [indent | EOL]
  public static boolean if_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression")) return false;
    if (!nextTokenIsSmart(b, KW_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPRESSION, null);
    r = consumeTokenSmart(b, KW_IF);
    p = r; // pin = 1
    r = r && report_error_(b, if_expression_1(b, l + 1));
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, if_expression_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, KW_THEN)) && r;
    r = p && report_error_(b, if_expression_5(b, l + 1)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, if_expression_7(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, KW_ELSE)) && r;
    r = p && report_error_(b, if_expression_9(b, l + 1)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && if_expression_11(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // indent*
  private static boolean if_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_1", c)) break;
    }
    return true;
  }

  // indent*
  private static boolean if_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_3", c)) break;
    }
    return true;
  }

  // indent*
  private static boolean if_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_5", c)) break;
    }
    return true;
  }

  // indent*
  private static boolean if_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_7", c)) break;
    }
    return true;
  }

  // indent*
  private static boolean if_expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!indent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_9", c)) break;
    }
    return true;
  }

  // [indent | EOL]
  private static boolean if_expression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_11")) return false;
    if_expression_11_0(b, l + 1);
    return true;
  }

  // indent | EOL
  private static boolean if_expression_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_11_0")) return false;
    boolean r;
    r = indent(b, l + 1);
    if (!r) r = consumeTokenSmart(b, EOL);
    return r;
  }

  // KW_CASE expression KW_OF expression expression ARROW_SIGN expression
  public static boolean case_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression")) return false;
    if (!nextTokenIsSmart(b, KW_CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CASE_EXPRESSION, null);
    r = consumeTokenSmart(b, KW_CASE);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, KW_OF)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, consumeToken(b, ARROW_SIGN)) && r;
    r = p && expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // function_element (simple_expression)*
  public static boolean function_call_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFICATOR, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, FUNCTION_CALL_EXPRESSION, "<function call expression>");
    r = function_element(b, l + 1);
    r = r && function_call_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simple_expression)*
  private static boolean function_call_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_call_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_expression_1", c)) break;
    }
    return true;
  }

  // (simple_expression)
  private static boolean function_call_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // list_literal_expression |
  //                       paren_expression |
  //                       id_expression |
  //                       integer_literal_expression |
  //                       string_literal_expression |
  //                       placeholder_expression
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = list_literal_expression(b, l + 1);
    if (!r) r = paren_expression(b, l + 1);
    if (!r) r = id_expression(b, l + 1);
    if (!r) r = integer_literal_expression(b, l + 1);
    if (!r) r = string_literal_expression(b, l + 1);
    if (!r) r = placeholder_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}