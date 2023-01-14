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
    create_token_set_(ANONYMOUS_TYPE_SPECIFICATION_ELEMENT, BOUNDED_TYPE_SPECIFICATION_ELEMENT, TYPE_SPECIFICATION_ELEMENT),
    create_token_set_(CASE_EXPRESSION, EXPRESSION, FUNCTION_CALL_EXPRESSION, ID_EXPRESSION,
      IF_EXPRESSION, INTEGER_LITERAL_EXPRESSION, LIST_LITERAL_EXPRESSION, OPERATOR_EXPRESSION,
      PAREN_EXPRESSION),
  };

  /* ********************************************************** */
  // expression
  public static boolean anonymous_type_specification_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_type_specification_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANONYMOUS_TYPE_SPECIFICATION_ELEMENT, "<anonymous type specification element>");
    r = expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAR IDENTIFICATOR COLON_SIGN expression RPAR
  public static boolean bounded_type_specification_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bounded_type_specification_element")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BOUNDED_TYPE_SPECIFICATION_ELEMENT, null);
    r = consumeTokens(b, 3, LPAR, IDENTIFICATOR, COLON_SIGN);
    p = r; // pin = 3
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && consumeToken(b, RPAR) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // top_level (EOL+ top_level)* |
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    if (!r) r = consumeToken(b, FILE_1_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // top_level (EOL+ top_level)*
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = top_level(b, l + 1);
    r = r && file_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EOL+ top_level)*
  private static boolean file_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_0_1", c)) break;
    }
    return true;
  }

  // EOL+ top_level
  private static boolean file_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0_1_0_0(b, l + 1);
    r = r && top_level(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean file_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "file_0_1_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATOR (expression)* EQ_SIGN expression
  public static boolean function_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_MATCH, "<function match>");
    r = consumeToken(b, IDENTIFICATOR);
    r = r && function_match_1(b, l + 1);
    r = r && consumeToken(b, EQ_SIGN);
    p = r; // pin = 3
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, IdrParser::function_match_recover);
    return r || p;
  }

  // (expression)*
  private static boolean function_match_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_match_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_match_1", c)) break;
    }
    return true;
  }

  // (expression)
  private static boolean function_match_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !EOL
  static boolean function_match_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, EOL);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // function_specification | function_match
  static boolean top_level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_specification(b, l + 1);
    if (!r) r = function_match(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_specification_element (TYPE_SIGN type_specification_element)*
  public static boolean type_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFICATION, "<type specification>");
    r = type_specification_element(b, l + 1);
    r = r && type_specification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TYPE_SIGN type_specification_element)*
  private static boolean type_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_specification_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_specification_1", c)) break;
    }
    return true;
  }

  // TYPE_SIGN type_specification_element
  private static boolean type_specification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_SIGN);
    r = r && type_specification_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bounded_type_specification_element | anonymous_type_specification_element
  public static boolean type_specification_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_SPECIFICATION_ELEMENT, "<type specification element>");
    r = bounded_type_specification_element(b, l + 1);
    if (!r) r = anonymous_type_specification_element(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: BINARY(operator_expression)
  // 1: POSTFIX(function_call_expression)
  // 2: ATOM(list_literal_expression)
  // 3: ATOM(if_expression)
  // 4: ATOM(case_expression)
  // 5: ATOM(integer_literal_expression)
  // 6: ATOM(id_expression)
  // 7: ATOM(paren_expression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = list_literal_expression(b, l + 1);
    if (!r) r = if_expression(b, l + 1);
    if (!r) r = case_expression(b, l + 1);
    if (!r) r = integer_literal_expression(b, l + 1);
    if (!r) r = id_expression(b, l + 1);
    if (!r) r = paren_expression(b, l + 1);
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
      if (g < 0 && consumeTokenSmart(b, OPERATOR)) {
        r = report_error_(b, expression(b, l, 0));
        r = operator_expression_1(b, l + 1) && r;
        exit_section_(b, l, m, OPERATOR_EXPRESSION, r, true, null);
      }
      else if (g < 1 && function_call_expression_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FUNCTION_CALL_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // (OPERATOR expression)*
  private static boolean operator_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operator_expression_1", c)) break;
    }
    return true;
  }

  // OPERATOR expression
  private static boolean operator_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression)+
  private static boolean function_call_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_expression_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!function_call_expression_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_expression_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression)
  private static boolean function_call_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET expression (COMMA expression)* RBRACKET
  public static boolean list_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression")) return false;
    if (!nextTokenIsSmart(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_LITERAL_EXPRESSION, null);
    r = consumeTokenSmart(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && report_error_(b, list_literal_expression_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COMMA expression)*
  private static boolean list_literal_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_literal_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_2", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean list_literal_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_IF expression KW_THEN expression KW_ELSE expression
  public static boolean if_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression")) return false;
    if (!nextTokenIsSmart(b, KW_IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPRESSION, null);
    r = consumeTokenSmart(b, KW_IF);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && report_error_(b, consumeToken(b, KW_THEN)) && r;
    r = p && report_error_(b, expression(b, l + 1, -1)) && r;
    r = p && report_error_(b, consumeToken(b, KW_ELSE)) && r;
    r = p && expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  // INTEGER_LITERAL
  public static boolean integer_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_expression")) return false;
    if (!nextTokenIsSmart(b, INTEGER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INTEGER_LITERAL);
    exit_section_(b, m, INTEGER_LITERAL_EXPRESSION, r);
    return r;
  }

  // IDENTIFICATOR
  public static boolean id_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_expression")) return false;
    if (!nextTokenIsSmart(b, IDENTIFICATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFICATOR);
    exit_section_(b, m, ID_EXPRESSION, r);
    return r;
  }

  // LPAR expression RPAR
  public static boolean paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression")) return false;
    if (!nextTokenIsSmart(b, LPAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPRESSION, null);
    r = consumeTokenSmart(b, LPAR);
    p = r; // pin = 1
    r = r && report_error_(b, expression(b, l + 1, -1));
    r = p && consumeToken(b, RPAR) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

}
