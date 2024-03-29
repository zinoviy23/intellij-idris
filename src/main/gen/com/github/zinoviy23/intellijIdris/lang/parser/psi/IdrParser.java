// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import static com.github.zinoviy23.intellijIdris.lang.parser.IdrParserUtil.*;
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
    create_token_set_(DATA_BODY, DATA_CONSTRUCTORS_BODY, DATA_VARIANTS_BODY),
    create_token_set_(FUNCTION_CALL_PATTERN, IMPLICIT_ARGUMENT_PATTERN, PATTERN, SIMPLE_EXPRESSION_PATTERN),
    create_token_set_(CASE_EXPRESSION, CHAR_LITERAL_EXPRESSION, DEFAULT_PAREN_EXPRESSION, EMPTY_TUPLE_PAREN_EXPRESSION,
      EXPRESSION, FUNCTION_CALL_EXPRESSION, HOLE_EXPRESSION, ID_EXPRESSION,
      IF_EXPRESSION, INTEGER_LITERAL_EXPRESSION, LAMBDA_EXPRESSION, LET_EXPRESSION,
      LIST_LITERAL_EXPRESSION, NAMED_PATTERN_EXPRESSION, NAME_PAREN_EXPRESSION, OPERATOR_EXPRESSION,
      OPERATOR_PAREN_EXPRESSION, PAREN_EXPRESSION, PLACEHOLDER_EXPRESSION, SIMPLE_EXPRESSION,
      STRING_LITERAL_EXPRESSION, TUPLE_PARENT_EXPRESSION, TYPE_EXPRESSION),
  };

  /* ********************************************************** */
  // open (indented_start case_entry indented_end)* close
  static boolean case_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open(b, l + 1);
    r = r && case_body_1(b, l + 1);
    r = r && close(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (indented_start case_entry indented_end)*
  private static boolean case_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!case_body_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_body_1", c)) break;
    }
    return true;
  }

  // indented_start case_entry indented_end
  private static boolean case_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && case_entry(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (function_call_pattern | pattern) ARROW_SIGN expression
  public static boolean case_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_ENTRY, "<case entry>");
    r = case_entry_0(b, l + 1);
    r = r && consumeToken(b, ARROW_SIGN);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function_call_pattern | pattern
  private static boolean case_entry_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_entry_0")) return false;
    boolean r;
    r = function_call_pattern(b, l + 1);
    if (!r) r = pattern(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CHAR_QUOTE CHAR_CONTENT CHAR_QUOTE
  public static boolean char_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "char_literal_expression")) return false;
    if (!nextTokenIs(b, CHAR_QUOTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CHAR_LITERAL_EXPRESSION, null);
    r = consumeTokens(b, 1, CHAR_QUOTE, CHAR_CONTENT, CHAR_QUOTE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<popIndent>> <<closeBlock>>
  static boolean close(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "close")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = popIndent(b, l + 1);
    r = r && closeBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression indent? ARROW_SIGN indent?
  public static boolean constraint_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT_LIST, "<constraint list>");
    r = expression(b, l + 1, -1);
    r = r && constraint_list_1(b, l + 1);
    r = r && consumeToken(b, ARROW_SIGN);
    r = r && constraint_list_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // indent?
  private static boolean constraint_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean constraint_list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_3")) return false;
    indent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // data_variants_body | data_constructors_body
  public static boolean data_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, DATA_BODY, "<data body>");
    r = data_variants_body(b, l + 1);
    if (!r) r = data_constructors_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // open (indented_start function_specification indented_end)* close
  static boolean data_constructors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_constructors")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open(b, l + 1);
    r = r && data_constructors_1(b, l + 1);
    r = r && close(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (indented_start function_specification indented_end)*
  private static boolean data_constructors_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_constructors_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_constructors_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_constructors_1", c)) break;
    }
    return true;
  }

  // indented_start function_specification indented_end
  private static boolean data_constructors_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_constructors_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && function_specification(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLON_SIGN type_specification KW_WHERE data_constructors
  public static boolean data_constructors_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_constructors_body")) return false;
    if (!nextTokenIs(b, COLON_SIGN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DATA_CONSTRUCTORS_BODY, null);
    r = consumeToken(b, COLON_SIGN);
    p = r; // pin = 1
    r = r && report_error_(b, type_specification(b, l + 1));
    r = p && report_error_(b, consumeToken(b, KW_WHERE)) && r;
    r = p && data_constructors(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // [function_opts_list eol*] KW_DATA IDENTIFICATOR (IDENTIFICATOR)* data_body
  public static boolean data_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DATA_DECLARATION, "<data declaration>");
    r = data_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 1, KW_DATA, IDENTIFICATOR);
    p = r; // pin = 2
    r = r && report_error_(b, data_declaration_3(b, l + 1));
    r = p && data_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [function_opts_list eol*]
  private static boolean data_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_0")) return false;
    data_declaration_0_0(b, l + 1);
    return true;
  }

  // function_opts_list eol*
  private static boolean data_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list(b, l + 1);
    r = r && data_declaration_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean data_declaration_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_declaration_0_0_1", c)) break;
    }
    return true;
  }

  // (IDENTIFICATOR)*
  private static boolean data_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, IDENTIFICATOR)) break;
      if (!empty_element_parsed_guard_(b, "data_declaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (IDENTIFICATOR | operator_paren_expression) (simple_expression)*
  public static boolean data_declaration_variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_variant")) return false;
    if (!nextTokenIs(b, "<data declaration variant>", IDENTIFICATOR, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_DECLARATION_VARIANT, "<data declaration variant>");
    r = data_declaration_variant_0(b, l + 1);
    r = r && data_declaration_variant_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFICATOR | operator_paren_expression
  private static boolean data_declaration_variant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_variant_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFICATOR);
    if (!r) r = operator_paren_expression(b, l + 1);
    return r;
  }

  // (simple_expression)*
  private static boolean data_declaration_variant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_variant_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_declaration_variant_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_declaration_variant_1", c)) break;
    }
    return true;
  }

  // (simple_expression)
  private static boolean data_declaration_variant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_declaration_variant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // indent? EQ_SIGN indent? data_declaration_variant (indent? OPT_SEP indent? data_declaration_variant)*
  public static boolean data_variants_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DATA_VARIANTS_BODY, "<data variants body>");
    r = data_variants_body_0(b, l + 1);
    r = r && consumeToken(b, EQ_SIGN);
    p = r; // pin = 2
    r = r && report_error_(b, data_variants_body_2(b, l + 1));
    r = p && report_error_(b, data_declaration_variant(b, l + 1)) && r;
    r = p && data_variants_body_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // indent?
  private static boolean data_variants_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_0")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean data_variants_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_2")) return false;
    indent(b, l + 1);
    return true;
  }

  // (indent? OPT_SEP indent? data_declaration_variant)*
  private static boolean data_variants_body_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_variants_body_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_variants_body_4", c)) break;
    }
    return true;
  }

  // indent? OPT_SEP indent? data_declaration_variant
  private static boolean data_variants_body_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_variants_body_4_0_0(b, l + 1);
    r = r && consumeToken(b, OPT_SEP);
    r = r && data_variants_body_4_0_2(b, l + 1);
    r = r && data_declaration_variant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean data_variants_body_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_4_0_0")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean data_variants_body_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_variants_body_4_0_2")) return false;
    indent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAR eol* expression RPAR
  public static boolean default_paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && default_paren_expression_1(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, DEFAULT_PAREN_EXPRESSION, r);
    return r;
  }

  // eol*
  private static boolean default_paren_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_paren_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "default_paren_expression_1", c)) break;
    }
    return true;
  }

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
  // LPAR RPAR
  public static boolean empty_tuple_paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_tuple_paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAR, RPAR);
    exit_section_(b, m, EMPTY_TUPLE_PAREN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // <<myEol>>
  static boolean eol(PsiBuilder b, int l) {
    return myEol(b, l + 1);
  }

  /* ********************************************************** */
  // ESCAPED_NAME_QUOTE ESCAPED_NAME ESCAPED_NAME_QUOTE
  public static boolean escaped_name_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escaped_name_id")) return false;
    if (!nextTokenIs(b, ESCAPED_NAME_QUOTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ESCAPED_NAME_ID, null);
    r = consumeTokens(b, 1, ESCAPED_NAME_QUOTE, ESCAPED_NAME, ESCAPED_NAME_QUOTE);
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
  // !(eol+ IDENTIFICATOR)
  static boolean expression_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !expression_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // eol+ IDENTIFICATOR
  private static boolean expression_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_recover_0_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFICATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+
  private static boolean expression_recover_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_recover_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_recover_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // eol* (module_statement eol+)? top_level ((eol+ top_level) | eol+ <<eof>>)*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && file_1(b, l + 1);
    r = r && top_level(b, l + 1);
    r = r && file_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_0", c)) break;
    }
    return true;
  }

  // (module_statement eol+)?
  private static boolean file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1")) return false;
    file_1_0(b, l + 1);
    return true;
  }

  // module_statement eol+
  private static boolean file_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_statement(b, l + 1);
    r = r && file_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+
  private static boolean file_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ((eol+ top_level) | eol+ <<eof>>)*
  private static boolean file_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3", c)) break;
    }
    return true;
  }

  // (eol+ top_level) | eol+ <<eof>>
  private static boolean file_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_3_0_0(b, l + 1);
    if (!r) r = file_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+ top_level
  private static boolean file_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_3_0_0_0(b, l + 1);
    r = r && top_level(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+
  private static boolean file_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3_0_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+ <<eof>>
  private static boolean file_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_3_0_1_0(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol+
  private static boolean file_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eol(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3_0_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function_call_expression
  public static boolean function_call_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_pattern")) return false;
    if (!nextTokenIs(b, "<function call pattern>", IDENTIFICATOR, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL_PATTERN, "<function call pattern>");
    r = function_call_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // (IDENTIFICATOR | operator_paren_expression ) (pattern)* indent? match_body
  public static boolean function_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match")) return false;
    if (!nextTokenIs(b, "<function match>", IDENTIFICATOR, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_MATCH, "<function match>");
    r = function_match_0(b, l + 1);
    r = r && function_match_1(b, l + 1);
    r = r && function_match_2(b, l + 1);
    r = r && match_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFICATOR | operator_paren_expression
  private static boolean function_match_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFICATOR);
    if (!r) r = operator_paren_expression(b, l + 1);
    return r;
  }

  // (pattern)*
  private static boolean function_match_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_match_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_match_1", c)) break;
    }
    return true;
  }

  // (pattern)
  private static boolean function_match_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean function_match_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_match_2")) return false;
    indent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_EXPORT | KW_TOTAL | KW_PARTIAL | KW_PRIVATE | KW_PUBLIC
  static boolean function_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_opt")) return false;
    boolean r;
    r = consumeToken(b, KW_EXPORT);
    if (!r) r = consumeToken(b, KW_TOTAL);
    if (!r) r = consumeToken(b, KW_PARTIAL);
    if (!r) r = consumeToken(b, KW_PRIVATE);
    if (!r) r = consumeToken(b, KW_PUBLIC);
    return r;
  }

  /* ********************************************************** */
  // function_opt (indent? function_opt)*
  public static boolean function_opts_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_opts_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_OPTS_LIST, "<function opts list>");
    r = function_opt(b, l + 1);
    r = r && function_opts_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (indent? function_opt)*
  private static boolean function_opts_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_opts_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_opts_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_opts_list_1", c)) break;
    }
    return true;
  }

  // indent? function_opt
  private static boolean function_opts_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_opts_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list_1_0_0(b, l + 1);
    r = r && function_opt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean function_opts_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_opts_list_1_0_0")) return false;
    indent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [function_opts_list eol*] (IDENTIFICATOR | operator_paren_expression) COLON_SIGN type_specification
  public static boolean function_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SPECIFICATION, "<function specification>");
    r = function_specification_0(b, l + 1);
    r = r && function_specification_1(b, l + 1);
    r = r && consumeToken(b, COLON_SIGN);
    p = r; // pin = 3
    r = r && type_specification(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [function_opts_list eol*]
  private static boolean function_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_0")) return false;
    function_specification_0_0(b, l + 1);
    return true;
  }

  // function_opts_list eol*
  private static boolean function_specification_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list(b, l + 1);
    r = r && function_specification_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean function_specification_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_specification_0_0_1", c)) break;
    }
    return true;
  }

  // IDENTIFICATOR | operator_paren_expression
  private static boolean function_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_specification_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFICATOR);
    if (!r) r = operator_paren_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_WHERE open (indented_start (function_specification | function_match) indented_end)* close
  public static boolean function_where_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_where_block")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_WHERE_BLOCK, "<function where block>");
    r = consumeToken(b, KW_WHERE);
    p = r; // pin = 1
    r = r && report_error_(b, open(b, l + 1));
    r = p && report_error_(b, function_where_block_2(b, l + 1)) && r;
    r = p && close(b, l + 1) && r;
    exit_section_(b, l, m, r, p, IdrParser::where_recover);
    return r || p;
  }

  // (indented_start (function_specification | function_match) indented_end)*
  private static boolean function_where_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_where_block_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_where_block_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_where_block_2", c)) break;
    }
    return true;
  }

  // indented_start (function_specification | function_match) indented_end
  private static boolean function_where_block_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_where_block_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && function_where_block_2_0_1(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_specification | function_match
  private static boolean function_where_block_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_where_block_2_0_1")) return false;
    boolean r;
    r = function_specification(b, l + 1);
    if (!r) r = function_match(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // HOLE_MARKER IDENTIFICATOR
  public static boolean hole_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hole_expression")) return false;
    if (!nextTokenIs(b, HOLE_MARKER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HOLE_EXPRESSION, null);
    r = consumeTokens(b, 1, HOLE_MARKER, IDENTIFICATOR);
    p = r; // pin = 1
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
  // KW_ELSE eol* expression
  public static boolean if_else_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_branch")) return false;
    if (!nextTokenIs(b, KW_ELSE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_ELSE_BRANCH, null);
    r = consumeToken(b, KW_ELSE);
    p = r; // pin = 1
    r = r && report_error_(b, if_else_branch_1(b, l + 1));
    r = p && expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // eol*
  private static boolean if_else_branch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_branch_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_else_branch_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_THEN eol* expression
  public static boolean if_then_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_branch")) return false;
    if (!nextTokenIs(b, KW_THEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_THEN_BRANCH, null);
    r = consumeToken(b, KW_THEN);
    p = r; // pin = 1
    r = r && report_error_(b, if_then_branch_1(b, l + 1));
    r = p && expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // eol*
  private static boolean if_then_branch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_then_branch_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_then_branch_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFICATOR [EQ_SIGN (function_call_expression | simple_expression)] RBRACE
  public static boolean implicit_argument_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_argument_pattern")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPLICIT_ARGUMENT_PATTERN, null);
    r = consumeTokens(b, 1, LBRACE, IDENTIFICATOR);
    p = r; // pin = 1
    r = r && report_error_(b, implicit_argument_pattern_2(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [EQ_SIGN (function_call_expression | simple_expression)]
  private static boolean implicit_argument_pattern_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_argument_pattern_2")) return false;
    implicit_argument_pattern_2_0(b, l + 1);
    return true;
  }

  // EQ_SIGN (function_call_expression | simple_expression)
  private static boolean implicit_argument_pattern_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_argument_pattern_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ_SIGN);
    r = r && implicit_argument_pattern_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_call_expression | simple_expression
  private static boolean implicit_argument_pattern_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_argument_pattern_2_0_1")) return false;
    boolean r;
    r = function_call_expression(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT KW_PUBLIC? identificator_reference
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, null);
    r = consumeToken(b, KW_IMPORT);
    p = r; // pin = 1
    r = r && report_error_(b, import_statement_1(b, l + 1));
    r = p && identificator_reference(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // KW_PUBLIC?
  private static boolean import_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_1")) return false;
    consumeToken(b, KW_PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // eol* indent_gt
  static boolean indent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indent")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indent_0(b, l + 1);
    r = r && indent_gt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean indent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indent_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indent_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<parseIndentGt>>
  static boolean indent_gt(PsiBuilder b, int l) {
    return parseIndentGt(b, l + 1);
  }

  /* ********************************************************** */
  // <<keepTerminator>>
  static boolean indented_end(PsiBuilder b, int l) {
    return keepTerminator(b, l + 1);
  }

  /* ********************************************************** */
  // eol* <<notEndBlock>>
  static boolean indented_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indented_start")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start_0(b, l + 1);
    r = r && notEndBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean indented_start_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indented_start_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indented_start_0", c)) break;
    }
    return true;
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
  // [function_opts_list eol*] KW_INTERFACE constraint_list? IDENTIFICATOR interface_argument* KW_WHERE interface_body
  public static boolean interface_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_$")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE, "<interface $>");
    r = interface_0(b, l + 1);
    r = r && consumeToken(b, KW_INTERFACE);
    p = r; // pin = 2
    r = r && report_error_(b, interface_2(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IDENTIFICATOR)) && r;
    r = p && report_error_(b, interface_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, KW_WHERE)) && r;
    r = p && interface_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [function_opts_list eol*]
  private static boolean interface_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_0")) return false;
    interface_0_0(b, l + 1);
    return true;
  }

  // function_opts_list eol*
  private static boolean interface_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list(b, l + 1);
    r = r && interface_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean interface_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_0_0_1", c)) break;
    }
    return true;
  }

  // constraint_list?
  private static boolean interface_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_2")) return false;
    constraint_list(b, l + 1);
    return true;
  }

  // interface_argument*
  private static boolean interface_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_argument(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFICATOR | LPAR IDENTIFICATOR COLON_SIGN type_specification RPAR
  public static boolean interface_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_argument")) return false;
    if (!nextTokenIs(b, "<interface argument>", IDENTIFICATOR, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_ARGUMENT, "<interface argument>");
    r = consumeToken(b, IDENTIFICATOR);
    if (!r) r = interface_argument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAR IDENTIFICATOR COLON_SIGN type_specification RPAR
  private static boolean interface_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_argument_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAR, IDENTIFICATOR, COLON_SIGN);
    r = r && type_specification(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // open (indented_start (function_specification | function_match) indented_end)* close
  public static boolean interface_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_BODY, "<interface body>");
    r = open(b, l + 1);
    r = r && interface_body_1(b, l + 1);
    r = r && close(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (indented_start (function_specification | function_match) indented_end)*
  private static boolean interface_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_body_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_body_1", c)) break;
    }
    return true;
  }

  // indented_start (function_specification | function_match) indented_end
  private static boolean interface_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && interface_body_1_0_1(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_specification | function_match
  private static boolean interface_body_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body_1_0_1")) return false;
    boolean r;
    r = function_specification(b, l + 1);
    if (!r) r = function_match(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [function_opts_list eol*] KW_IMPLEMENTATION? type_specification KW_WHERE open (indented_start function_match indented_end)* close
  public static boolean interface_implementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_IMPLEMENTATION, "<interface implementation>");
    r = interface_implementation_0(b, l + 1);
    r = r && interface_implementation_1(b, l + 1);
    r = r && type_specification(b, l + 1);
    r = r && consumeToken(b, KW_WHERE);
    r = r && open(b, l + 1);
    r = r && interface_implementation_5(b, l + 1);
    r = r && close(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [function_opts_list eol*]
  private static boolean interface_implementation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_0")) return false;
    interface_implementation_0_0(b, l + 1);
    return true;
  }

  // function_opts_list eol*
  private static boolean interface_implementation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list(b, l + 1);
    r = r && interface_implementation_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean interface_implementation_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_implementation_0_0_1", c)) break;
    }
    return true;
  }

  // KW_IMPLEMENTATION?
  private static boolean interface_implementation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_1")) return false;
    consumeToken(b, KW_IMPLEMENTATION);
    return true;
  }

  // (indented_start function_match indented_end)*
  private static boolean interface_implementation_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_implementation_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_implementation_5", c)) break;
    }
    return true;
  }

  // indented_start function_match indented_end
  private static boolean interface_implementation_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_implementation_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && function_match(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATOR EQ_SIGN expression
  public static boolean let_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_entry")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_ENTRY, null);
    r = consumeTokens(b, 2, IDENTIFICATOR, EQ_SIGN);
    p = r; // pin = 2
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LBRACKET [eol* expression (eol* COMMA eol* expression)*] eol* RBRACKET
  public static boolean list_literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIST_LITERAL_EXPRESSION, null);
    r = consumeToken(b, LBRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, list_literal_expression_1(b, l + 1));
    r = p && report_error_(b, list_literal_expression_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [eol* expression (eol* COMMA eol* expression)*]
  private static boolean list_literal_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1")) return false;
    list_literal_expression_1_0(b, l + 1);
    return true;
  }

  // eol* expression (eol* COMMA eol* expression)*
  private static boolean list_literal_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_literal_expression_1_0_0(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && list_literal_expression_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean list_literal_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_1_0_0", c)) break;
    }
    return true;
  }

  // (eol* COMMA eol* expression)*
  private static boolean list_literal_expression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_literal_expression_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_1_0_2", c)) break;
    }
    return true;
  }

  // eol* COMMA eol* expression
  private static boolean list_literal_expression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list_literal_expression_1_0_2_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && list_literal_expression_1_0_2_0_2(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean list_literal_expression_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_1_0_2_0_0", c)) break;
    }
    return true;
  }

  // eol*
  private static boolean list_literal_expression_1_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_1_0_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_1_0_2_0_2", c)) break;
    }
    return true;
  }

  // eol*
  private static boolean list_literal_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_literal_expression_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_literal_expression_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_IMPOSSIBLE eol? | EQ_SIGN indent? expression [eol* function_where_block]
  static boolean match_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body")) return false;
    if (!nextTokenIs(b, "", EQ_SIGN, KW_IMPOSSIBLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_body_0(b, l + 1);
    if (!r) r = match_body_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_IMPOSSIBLE eol?
  private static boolean match_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPOSSIBLE);
    r = r && match_body_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol?
  private static boolean match_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_0_1")) return false;
    eol(b, l + 1);
    return true;
  }

  // EQ_SIGN indent? expression [eol* function_where_block]
  private static boolean match_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ_SIGN);
    r = r && match_body_1_1(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && match_body_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean match_body_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_1_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // [eol* function_where_block]
  private static boolean match_body_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_1_3")) return false;
    match_body_1_3_0(b, l + 1);
    return true;
  }

  // eol* function_where_block
  private static boolean match_body_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = match_body_1_3_0_0(b, l + 1);
    r = r && function_where_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean match_body_1_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "match_body_1_3_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "match_body_1_3_0_0", c)) break;
    }
    return true;
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
  // LPAR IDENTIFICATOR COLON_SIGN eol* expression RPAR
  public static boolean name_paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAR, IDENTIFICATOR, COLON_SIGN);
    r = r && name_paren_expression_3(b, l + 1);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, NAME_PAREN_EXPRESSION, r);
    return r;
  }

  // eol*
  private static boolean name_paren_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_paren_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "name_paren_expression_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFICATOR PATTERN_NAME_SEP simple_expression
  public static boolean named_pattern_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_pattern_expression")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMED_PATTERN_EXPRESSION, null);
    r = consumeTokens(b, 2, IDENTIFICATOR, PATTERN_NAME_SEP);
    p = r; // pin = 2
    r = r && simple_expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // eol* <<openBlock>> <<pushIndent>>
  static boolean open(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = open_0(b, l + 1);
    r = r && openBlock(b, l + 1);
    r = r && pushIndent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean open_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "open_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "open_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // function_call_expression | simple_expression
  static boolean operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operand")) return false;
    boolean r;
    r = function_call_expression(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    return r;
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
  // OPERATOR | escaped_name_id
  public static boolean operator_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_element")) return false;
    if (!nextTokenIs(b, "<operator element>", ESCAPED_NAME_QUOTE, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_ELEMENT, "<operator element>");
    r = consumeToken(b, OPERATOR);
    if (!r) r = escaped_name_id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // LPAR OPERATOR RPAR
  public static boolean operator_paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAR, OPERATOR, RPAR);
    exit_section_(b, m, OPERATOR_PAREN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // empty_tuple_paren_expression | operator_paren_expression | name_paren_expression | default_paren_expression | tuple_parent_expression
  public static boolean paren_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PAREN_EXPRESSION, null);
    r = empty_tuple_paren_expression(b, l + 1);
    if (!r) r = operator_paren_expression(b, l + 1);
    if (!r) r = name_paren_expression(b, l + 1);
    if (!r) r = default_paren_expression(b, l + 1);
    if (!r) r = tuple_parent_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_expression_pattern | implicit_argument_pattern
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATTERN, "<pattern>");
    r = simple_expression_pattern(b, l + 1);
    if (!r) r = implicit_argument_pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // KW_CONSTRUCTOR IDENTIFICATOR
  public static boolean record_constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_constructor")) return false;
    if (!nextTokenIs(b, KW_CONSTRUCTOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_CONSTRUCTOR, null);
    r = consumeTokens(b, 1, KW_CONSTRUCTOR, IDENTIFICATOR);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // [function_opts_list eol*] KW_RECORD IDENTIFICATOR type_specification KW_WHERE open
  //  record_constructor
  //  (indented_start record_field indented_end)*
  // close
  public static boolean record_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD_DECLARATION, "<record declaration>");
    r = record_declaration_0(b, l + 1);
    r = r && consumeTokens(b, 1, KW_RECORD, IDENTIFICATOR);
    p = r; // pin = 2
    r = r && report_error_(b, type_specification(b, l + 1));
    r = p && report_error_(b, consumeToken(b, KW_WHERE)) && r;
    r = p && report_error_(b, open(b, l + 1)) && r;
    r = p && report_error_(b, record_constructor(b, l + 1)) && r;
    r = p && report_error_(b, record_declaration_7(b, l + 1)) && r;
    r = p && close(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [function_opts_list eol*]
  private static boolean record_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration_0")) return false;
    record_declaration_0_0(b, l + 1);
    return true;
  }

  // function_opts_list eol*
  private static boolean record_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_opts_list(b, l + 1);
    r = r && record_declaration_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean record_declaration_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_declaration_0_0_1", c)) break;
    }
    return true;
  }

  // (indented_start record_field indented_end)*
  private static boolean record_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_declaration_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_declaration_7", c)) break;
    }
    return true;
  }

  // indented_start record_field indented_end
  private static boolean record_declaration_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_declaration_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && record_field(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATOR (COMMA IDENTIFICATOR)* COLON_SIGN type_specification
  public static boolean record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field")) return false;
    if (!nextTokenIs(b, IDENTIFICATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFICATOR);
    r = r && record_field_1(b, l + 1);
    r = r && consumeToken(b, COLON_SIGN);
    r = r && type_specification(b, l + 1);
    exit_section_(b, m, RECORD_FIELD, r);
    return r;
  }

  // (COMMA IDENTIFICATOR)*
  private static boolean record_field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_field_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_field_1", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFICATOR
  private static boolean record_field_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFICATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_expression
  public static boolean simple_expression_pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPRESSION_PATTERN, "<simple expression pattern>");
    r = simple_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // directive |
  //                       import_statement |
  //                       data_declaration |
  //                       operator_declaration |
  //                       function_specification |
  //                       interface_implementation |
  //                       record_declaration |
  //                       interface |
  //                       function_match
  static boolean top_level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level")) return false;
    boolean r;
    r = directive(b, l + 1);
    if (!r) r = import_statement(b, l + 1);
    if (!r) r = data_declaration(b, l + 1);
    if (!r) r = operator_declaration(b, l + 1);
    if (!r) r = function_specification(b, l + 1);
    if (!r) r = interface_implementation(b, l + 1);
    if (!r) r = record_declaration(b, l + 1);
    if (!r) r = interface_$(b, l + 1);
    if (!r) r = function_match(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LPAR eol* expression_list RPAR
  public static boolean tuple_parent_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parent_expression")) return false;
    if (!nextTokenIs(b, LPAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && tuple_parent_expression_1(b, l + 1);
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, TUPLE_PARENT_EXPRESSION, r);
    return r;
  }

  // eol*
  private static boolean tuple_parent_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parent_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_parent_expression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // constraint_list? expression
  public static boolean type_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFICATION, "<type specification>");
    r = type_specification_0(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // constraint_list?
  private static boolean type_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specification_0")) return false;
    constraint_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !(<<keepTerminator>>)
  static boolean where_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !where_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<keepTerminator>>
  private static boolean where_recover_0(PsiBuilder b, int l) {
    return keepTerminator(b, l + 1);
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: BINARY(type_expression)
  // 1: ATOM(operator_expression)
  // 2: ATOM(if_expression) PREFIX(case_expression) ATOM(let_expression)
  // 3: ATOM(function_call_expression)
  // 4: ATOM(simple_expression)
  // 5: ATOM(lambda_expression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = operator_expression(b, l + 1);
    if (!r) r = if_expression(b, l + 1);
    if (!r) r = case_expression(b, l + 1);
    if (!r) r = let_expression(b, l + 1);
    if (!r) r = function_call_expression(b, l + 1);
    if (!r) r = simple_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
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
      if (g < 0 && type_expression_0(b, l + 1)) {
        r = report_error_(b, expression(b, l, 0));
        r = type_expression_1(b, l + 1) && r;
        exit_section_(b, l, m, TYPE_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // indent? TYPE_SIGN indent?
  private static boolean type_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_expression_0_0(b, l + 1);
    r = r && consumeToken(b, TYPE_SIGN);
    r = r && type_expression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean type_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_0_0")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean type_expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_0_2")) return false;
    indent(b, l + 1);
    return true;
  }

  // (TYPE_SIGN indent? expression)*
  private static boolean type_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_expression_1", c)) break;
    }
    return true;
  }

  // TYPE_SIGN indent? expression
  private static boolean type_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_SIGN);
    r = r && type_expression_1_0_1(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean type_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_expression_1_0_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // operand indent? operator_element indent? operand (indent? operator_element indent? operand)*
  public static boolean operator_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OPERATOR_EXPRESSION, "<operator expression>");
    r = operand(b, l + 1);
    r = r && operator_expression_1(b, l + 1);
    r = r && operator_element(b, l + 1);
    r = r && operator_expression_3(b, l + 1);
    r = r && operand(b, l + 1);
    r = r && operator_expression_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // indent?
  private static boolean operator_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_1")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean operator_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_3")) return false;
    indent(b, l + 1);
    return true;
  }

  // (indent? operator_element indent? operand)*
  private static boolean operator_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!operator_expression_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operator_expression_5", c)) break;
    }
    return true;
  }

  // indent? operator_element indent? operand
  private static boolean operator_expression_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operator_expression_5_0_0(b, l + 1);
    r = r && operator_element(b, l + 1);
    r = r && operator_expression_5_0_2(b, l + 1);
    r = r && operand(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean operator_expression_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_5_0_0")) return false;
    indent(b, l + 1);
    return true;
  }

  // indent?
  private static boolean operator_expression_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression_5_0_2")) return false;
    indent(b, l + 1);
    return true;
  }

  // KW_IF eol* expression eol* if_then_branch eol* if_else_branch
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
    r = p && report_error_(b, if_then_branch(b, l + 1)) && r;
    r = p && report_error_(b, if_expression_5(b, l + 1)) && r;
    r = p && if_else_branch(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // eol*
  private static boolean if_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_1", c)) break;
    }
    return true;
  }

  // eol*
  private static boolean if_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_3", c)) break;
    }
    return true;
  }

  // eol*
  private static boolean if_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expression_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expression_5", c)) break;
    }
    return true;
  }

  public static boolean case_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression")) return false;
    if (!nextTokenIsSmart(b, KW_CASE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = case_expression_0(b, l + 1);
    p = r;
    r = p && expression(b, l, 2);
    r = p && report_error_(b, case_expression_1(b, l + 1)) && r;
    exit_section_(b, l, m, CASE_EXPRESSION, r, p, null);
    return r || p;
  }

  // KW_CASE eol*
  private static boolean case_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, KW_CASE);
    r = r && case_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean case_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_expression_0_1", c)) break;
    }
    return true;
  }

  // eol* KW_OF case_body
  private static boolean case_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_expression_1_0(b, l + 1);
    r = r && consumeToken(b, KW_OF);
    r = r && case_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean case_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_expression_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_expression_1_0", c)) break;
    }
    return true;
  }

  // KW_LET open (indented_start let_entry indented_end)+ close eol* KW_IN eol* expression
  public static boolean let_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_expression")) return false;
    if (!nextTokenIsSmart(b, KW_LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_EXPRESSION, null);
    r = consumeTokenSmart(b, KW_LET);
    p = r; // pin = 1
    r = r && report_error_(b, open(b, l + 1));
    r = p && report_error_(b, let_expression_2(b, l + 1)) && r;
    r = p && report_error_(b, close(b, l + 1)) && r;
    r = p && report_error_(b, let_expression_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, KW_IN)) && r;
    r = p && report_error_(b, let_expression_6(b, l + 1)) && r;
    r = p && expression(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (indented_start let_entry indented_end)+
  private static boolean let_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = let_expression_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!let_expression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_expression_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // indented_start let_entry indented_end
  private static boolean let_expression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_expression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = indented_start(b, l + 1);
    r = r && let_entry(b, l + 1);
    r = r && indented_end(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // eol*
  private static boolean let_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_expression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_expression_4", c)) break;
    }
    return true;
  }

  // eol*
  private static boolean let_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_expression_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!eol(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "let_expression_6", c)) break;
    }
    return true;
  }

  // function_element (indent? simple_expression)*
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

  // (indent? simple_expression)*
  private static boolean function_call_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_call_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_call_expression_1", c)) break;
    }
    return true;
  }

  // indent? simple_expression
  private static boolean function_call_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_call_expression_1_0_0(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // indent?
  private static boolean function_call_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_expression_1_0_0")) return false;
    indent(b, l + 1);
    return true;
  }

  // list_literal_expression |
  //                       paren_expression |
  //                       named_pattern_expression |
  //                       id_expression |
  //                       hole_expression |
  //                       integer_literal_expression |
  //                       char_literal_expression |
  //                       string_literal_expression |
  //                       placeholder_expression
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = list_literal_expression(b, l + 1);
    if (!r) r = paren_expression(b, l + 1);
    if (!r) r = named_pattern_expression(b, l + 1);
    if (!r) r = id_expression(b, l + 1);
    if (!r) r = hole_expression(b, l + 1);
    if (!r) r = integer_literal_expression(b, l + 1);
    if (!r) r = char_literal_expression(b, l + 1);
    if (!r) r = string_literal_expression(b, l + 1);
    if (!r) r = placeholder_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BACKSLASH IDENTIFICATOR ARROW_SIGN expression
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    if (!nextTokenIsSmart(b, BACKSLASH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_EXPRESSION, null);
    r = consumeTokensSmart(b, 2, BACKSLASH, IDENTIFICATOR, ARROW_SIGN);
    p = r; // pin = 2
    r = r && expression(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

}
