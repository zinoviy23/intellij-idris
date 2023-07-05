// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.zinoviy23.intellijIdris.lang.parser.psi.impl.*;

public interface IdrTokenTypes {

  IElementType CASE_ENTRY = new IdrElementType("CASE_ENTRY");
  IElementType CASE_EXPRESSION = new IdrElementType("CASE_EXPRESSION");
  IElementType CHAR_LITERAL_EXPRESSION = new IdrElementType("CHAR_LITERAL_EXPRESSION");
  IElementType CONSTRAINT_LIST = new IdrElementType("CONSTRAINT_LIST");
  IElementType DATA_DECLARATION = new IdrElementType("DATA_DECLARATION");
  IElementType DATA_DECLARATION_VARIANT = new IdrElementType("DATA_DECLARATION_VARIANT");
  IElementType DIRECTIVE = new IdrElementType("DIRECTIVE");
  IElementType ESCAPED_NAME_ID = new IdrElementType("ESCAPED_NAME_ID");
  IElementType EXPRESSION = new IdrElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new IdrElementType("EXPRESSION_LIST");
  IElementType FUNCTION_CALL_EXPRESSION = new IdrElementType("FUNCTION_CALL_EXPRESSION");
  IElementType FUNCTION_CALL_PATTERN = new IdrElementType("FUNCTION_CALL_PATTERN");
  IElementType FUNCTION_MATCH = new IdrElementType("FUNCTION_MATCH");
  IElementType FUNCTION_OPTS_LIST = new IdrElementType("FUNCTION_OPTS_LIST");
  IElementType FUNCTION_SPECIFICATION = new IdrElementType("FUNCTION_SPECIFICATION");
  IElementType FUNCTION_WHERE_BLOCK = new IdrElementType("FUNCTION_WHERE_BLOCK");
  IElementType HOLE_EXPRESSION = new IdrElementType("HOLE_EXPRESSION");
  IElementType IDENTIFICATOR_REFERENCE = new IdrElementType("IDENTIFICATOR_REFERENCE");
  IElementType ID_EXPRESSION = new IdrElementType("ID_EXPRESSION");
  IElementType IF_ELSE_BRANCH = new IdrElementType("IF_ELSE_BRANCH");
  IElementType IF_EXPRESSION = new IdrElementType("IF_EXPRESSION");
  IElementType IF_THEN_BRANCH = new IdrElementType("IF_THEN_BRANCH");
  IElementType IMPLICIT_ARGUMENT_PATTERN = new IdrElementType("IMPLICIT_ARGUMENT_PATTERN");
  IElementType IMPORT_STATEMENT = new IdrElementType("IMPORT_STATEMENT");
  IElementType INTEGER_LITERAL_EXPRESSION = new IdrElementType("INTEGER_LITERAL_EXPRESSION");
  IElementType LAMBDA_EXPRESSION = new IdrElementType("LAMBDA_EXPRESSION");
  IElementType LET_ENTRY = new IdrElementType("LET_ENTRY");
  IElementType LET_EXPRESSION = new IdrElementType("LET_EXPRESSION");
  IElementType LIST_LITERAL_EXPRESSION = new IdrElementType("LIST_LITERAL_EXPRESSION");
  IElementType MODULE_STATEMENT = new IdrElementType("MODULE_STATEMENT");
  IElementType NAMED_PATTERN_EXPRESSION = new IdrElementType("NAMED_PATTERN_EXPRESSION");
  IElementType OPERATOR_DECLARATION = new IdrElementType("OPERATOR_DECLARATION");
  IElementType OPERATOR_ELEMENT = new IdrElementType("OPERATOR_ELEMENT");
  IElementType OPERATOR_EXPRESSION = new IdrElementType("OPERATOR_EXPRESSION");
  IElementType OPERATOR_LIST = new IdrElementType("OPERATOR_LIST");
  IElementType PAREN_EXPRESSION = new IdrElementType("PAREN_EXPRESSION");
  IElementType PAREN_EXPRESSION_END = new IdrElementType("PAREN_EXPRESSION_END");
  IElementType PATTERN = new IdrElementType("PATTERN");
  IElementType PLACEHOLDER_EXPRESSION = new IdrElementType("PLACEHOLDER_EXPRESSION");
  IElementType SIMPLE_EXPRESSION = new IdrElementType("SIMPLE_EXPRESSION");
  IElementType SIMPLE_EXPRESSION_PATTERN = new IdrElementType("SIMPLE_EXPRESSION_PATTERN");
  IElementType STRING_LITERAL_EXPRESSION = new IdrElementType("STRING_LITERAL_EXPRESSION");
  IElementType TYPE_EXPRESSION = new IdrElementType("TYPE_EXPRESSION");
  IElementType TYPE_SPECIFICATION = new IdrElementType("TYPE_SPECIFICATION");

  IElementType ARROW_SIGN = new IdrTokenType("ARROW_SIGN");
  IElementType BACKSLASH = new IdrTokenType("BACKSLASH");
  IElementType CHAR_CONTENT = new IdrTokenType("CHAR_CONTENT");
  IElementType CHAR_QUOTE = new IdrTokenType("CHAR_QUOTE");
  IElementType COLON_SIGN = new IdrTokenType("COLON_SIGN");
  IElementType COMMA = new IdrTokenType("COMMA");
  IElementType DIRECTIVE_CONTENT = new IdrTokenType("DIRECTIVE_CONTENT");
  IElementType DIRECTIVE_START = new IdrTokenType("DIRECTIVE_START");
  IElementType DIRECTIVE_TYPE = new IdrTokenType("DIRECTIVE_TYPE");
  IElementType DOC_COMMENT_START = new IdrTokenType("|||");
  IElementType DOC_COMMENT_TEXT = new IdrTokenType("DOC_COMMENT_TEXT");
  IElementType EOL = new IdrTokenType("EOL");
  IElementType EQ_SIGN = new IdrTokenType("EQ_SIGN");
  IElementType ESCAPED_NAME = new IdrTokenType("ESCAPED_NAME");
  IElementType ESCAPED_NAME_QUOTE = new IdrTokenType("ESCAPED_NAME_QUOTE");
  IElementType HOLE_MARKER = new IdrTokenType("HOLE_MARKER");
  IElementType IDENTIFICATOR = new IdrTokenType("IDENTIFICATOR");
  IElementType IDENTIFICATOR_SEP = new IdrTokenType("IDENTIFICATOR_SEP");
  IElementType INTEGER_LITERAL = new IdrTokenType("INTEGER_LITERAL");
  IElementType KW_CASE = new IdrTokenType("KW_CASE");
  IElementType KW_DATA = new IdrTokenType("KW_DATA");
  IElementType KW_ELSE = new IdrTokenType("KW_ELSE");
  IElementType KW_EXPORT = new IdrTokenType("KW_EXPORT");
  IElementType KW_IF = new IdrTokenType("KW_IF");
  IElementType KW_IMPORT = new IdrTokenType("KW_IMPORT");
  IElementType KW_IN = new IdrTokenType("KW_IN");
  IElementType KW_INFIX = new IdrTokenType("KW_INFIX");
  IElementType KW_INFIXL = new IdrTokenType("KW_INFIXL");
  IElementType KW_INFIXR = new IdrTokenType("KW_INFIXR");
  IElementType KW_LET = new IdrTokenType("KW_LET");
  IElementType KW_MODULE = new IdrTokenType("KW_MODULE");
  IElementType KW_OF = new IdrTokenType("KW_OF");
  IElementType KW_PARTIAL = new IdrTokenType("KW_PARTIAL");
  IElementType KW_PREFIX = new IdrTokenType("KW_PREFIX");
  IElementType KW_PRIVATE = new IdrTokenType("KW_PRIVATE");
  IElementType KW_PUBLIC = new IdrTokenType("KW_PUBLIC");
  IElementType KW_THEN = new IdrTokenType("KW_THEN");
  IElementType KW_TOTAL = new IdrTokenType("KW_TOTAL");
  IElementType KW_WHERE = new IdrTokenType("KW_WHERE");
  IElementType LBRACE = new IdrTokenType("LBRACE");
  IElementType LBRACKET = new IdrTokenType("LBRACKET");
  IElementType LINE_COMMENT_START = new IdrTokenType("--");
  IElementType LINE_COMMENT_TEXT = new IdrTokenType("LINE_COMMENT_TEXT");
  IElementType LPAR = new IdrTokenType("LPAR");
  IElementType OPERATOR = new IdrTokenType("OPERATOR");
  IElementType OPT_SEP = new IdrTokenType("OPT_SEP");
  IElementType PATTERN_NAME_SEP = new IdrTokenType("PATTERN_NAME_SEP");
  IElementType PLACEHOLDER = new IdrTokenType("PLACEHOLDER");
  IElementType RBRACE = new IdrTokenType("RBRACE");
  IElementType RBRACKET = new IdrTokenType("RBRACKET");
  IElementType RPAR = new IdrTokenType("RPAR");
  IElementType STRING_CONTENT = new IdrTokenType("STRING_CONTENT");
  IElementType STRING_QUOTE = new IdrTokenType("STRING_QUOTE");
  IElementType TYPE_SIGN = new IdrTokenType("TYPE_SIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CASE_ENTRY) {
        return new IdrPsiCaseEntryImpl(node);
      }
      else if (type == CASE_EXPRESSION) {
        return new IdrPsiCaseExpressionImpl(node);
      }
      else if (type == CHAR_LITERAL_EXPRESSION) {
        return new IdrPsiCharLiteralExpressionImpl(node);
      }
      else if (type == CONSTRAINT_LIST) {
        return new IdrPsiConstraintListImpl(node);
      }
      else if (type == DATA_DECLARATION) {
        return new IdrPsiDataDeclarationImpl(node);
      }
      else if (type == DATA_DECLARATION_VARIANT) {
        return new IdrPsiDataDeclarationVariantImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new IdrPsiDirectiveImpl(node);
      }
      else if (type == ESCAPED_NAME_ID) {
        return new IdrPsiEscapedNameIdImpl(node);
      }
      else if (type == EXPRESSION) {
        return new IdrPsiExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new IdrPsiExpressionListImpl(node);
      }
      else if (type == FUNCTION_CALL_EXPRESSION) {
        return new IdrPsiFunctionCallExpressionImpl(node);
      }
      else if (type == FUNCTION_CALL_PATTERN) {
        return new IdrPsiFunctionCallPatternImpl(node);
      }
      else if (type == FUNCTION_MATCH) {
        return new IdrPsiFunctionMatchImpl(node);
      }
      else if (type == FUNCTION_OPTS_LIST) {
        return new IdrPsiFunctionOptsListImpl(node);
      }
      else if (type == FUNCTION_SPECIFICATION) {
        return new IdrPsiFunctionSpecificationImpl(node);
      }
      else if (type == FUNCTION_WHERE_BLOCK) {
        return new IdrPsiFunctionWhereBlockImpl(node);
      }
      else if (type == HOLE_EXPRESSION) {
        return new IdrPsiHoleExpressionImpl(node);
      }
      else if (type == IDENTIFICATOR_REFERENCE) {
        return new IdrPsiIdentificatorReferenceImpl(node);
      }
      else if (type == ID_EXPRESSION) {
        return new IdrPsiIdExpressionImpl(node);
      }
      else if (type == IF_ELSE_BRANCH) {
        return new IdrPsiIfElseBranchImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new IdrPsiIfExpressionImpl(node);
      }
      else if (type == IF_THEN_BRANCH) {
        return new IdrPsiIfThenBranchImpl(node);
      }
      else if (type == IMPLICIT_ARGUMENT_PATTERN) {
        return new IdrPsiImplicitArgumentPatternImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new IdrPsiImportStatementImpl(node);
      }
      else if (type == INTEGER_LITERAL_EXPRESSION) {
        return new IdrPsiIntegerLiteralExpressionImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new IdrPsiLambdaExpressionImpl(node);
      }
      else if (type == LET_ENTRY) {
        return new IdrPsiLetEntryImpl(node);
      }
      else if (type == LET_EXPRESSION) {
        return new IdrPsiLetExpressionImpl(node);
      }
      else if (type == LIST_LITERAL_EXPRESSION) {
        return new IdrPsiListLiteralExpressionImpl(node);
      }
      else if (type == MODULE_STATEMENT) {
        return new IdrPsiModuleStatementImpl(node);
      }
      else if (type == NAMED_PATTERN_EXPRESSION) {
        return new IdrPsiNamedPatternExpressionImpl(node);
      }
      else if (type == OPERATOR_DECLARATION) {
        return new IdrPsiOperatorDeclarationImpl(node);
      }
      else if (type == OPERATOR_ELEMENT) {
        return new IdrPsiOperatorElementImpl(node);
      }
      else if (type == OPERATOR_EXPRESSION) {
        return new IdrPsiOperatorExpressionImpl(node);
      }
      else if (type == OPERATOR_LIST) {
        return new IdrPsiOperatorListImpl(node);
      }
      else if (type == PAREN_EXPRESSION) {
        return new IdrPsiParenExpressionImpl(node);
      }
      else if (type == PAREN_EXPRESSION_END) {
        return new IdrPsiParenExpressionEndImpl(node);
      }
      else if (type == PLACEHOLDER_EXPRESSION) {
        return new IdrPsiPlaceholderExpressionImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION_PATTERN) {
        return new IdrPsiSimpleExpressionPatternImpl(node);
      }
      else if (type == STRING_LITERAL_EXPRESSION) {
        return new IdrPsiStringLiteralExpressionImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new IdrPsiTypeExpressionImpl(node);
      }
      else if (type == TYPE_SPECIFICATION) {
        return new IdrPsiTypeSpecificationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
