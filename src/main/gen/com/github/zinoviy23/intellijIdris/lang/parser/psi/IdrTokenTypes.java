// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.zinoviy23.intellijIdris.lang.parser.psi.impl.*;

public interface IdrTokenTypes {

  IElementType CASE_EXPRESSION = new IdrElementType("CASE_EXPRESSION");
  IElementType DIRECTIVE = new IdrElementType("DIRECTIVE");
  IElementType EXPRESSION = new IdrElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new IdrElementType("EXPRESSION_LIST");
  IElementType FUNCTION_CALL_EXPRESSION = new IdrElementType("FUNCTION_CALL_EXPRESSION");
  IElementType FUNCTION_MATCH = new IdrElementType("FUNCTION_MATCH");
  IElementType FUNCTION_SPECIFICATION = new IdrElementType("FUNCTION_SPECIFICATION");
  IElementType IDENTIFICATOR_REFERENCE = new IdrElementType("IDENTIFICATOR_REFERENCE");
  IElementType ID_EXPRESSION = new IdrElementType("ID_EXPRESSION");
  IElementType IF_EXPRESSION = new IdrElementType("IF_EXPRESSION");
  IElementType IMPORT_STATEMENT = new IdrElementType("IMPORT_STATEMENT");
  IElementType INTEGER_LITERAL_EXPRESSION = new IdrElementType("INTEGER_LITERAL_EXPRESSION");
  IElementType LIST_LITERAL_EXPRESSION = new IdrElementType("LIST_LITERAL_EXPRESSION");
  IElementType MODULE_STATEMENT = new IdrElementType("MODULE_STATEMENT");
  IElementType OPERATOR_DECLARATION = new IdrElementType("OPERATOR_DECLARATION");
  IElementType OPERATOR_EXPRESSION = new IdrElementType("OPERATOR_EXPRESSION");
  IElementType OPERATOR_LIST = new IdrElementType("OPERATOR_LIST");
  IElementType PAREN_EXPRESSION = new IdrElementType("PAREN_EXPRESSION");
  IElementType PAREN_EXPRESSION_END = new IdrElementType("PAREN_EXPRESSION_END");
  IElementType PLACEHOLDER_EXPRESSION = new IdrElementType("PLACEHOLDER_EXPRESSION");
  IElementType SIMPLE_EXPRESSION = new IdrElementType("SIMPLE_EXPRESSION");
  IElementType STRING_LITERAL_EXPRESSION = new IdrElementType("STRING_LITERAL_EXPRESSION");
  IElementType TYPE_EXPRESSION = new IdrElementType("TYPE_EXPRESSION");
  IElementType TYPE_SPECIFICATION = new IdrElementType("TYPE_SPECIFICATION");

  IElementType ARROW_SIGN = new IdrTokenType("ARROW_SIGN");
  IElementType COLON_SIGN = new IdrTokenType("COLON_SIGN");
  IElementType COMMA = new IdrTokenType("COMMA");
  IElementType DIRECTIVE_CONTENT = new IdrTokenType("DIRECTIVE_CONTENT");
  IElementType DIRECTIVE_START = new IdrTokenType("DIRECTIVE_START");
  IElementType DIRECTIVE_TYPE = new IdrTokenType("DIRECTIVE_TYPE");
  IElementType DOC_COMMENT_START = new IdrTokenType("|||");
  IElementType DOC_COMMENT_TEXT = new IdrTokenType("DOC_COMMENT_TEXT");
  IElementType EOL = new IdrTokenType("EOL");
  IElementType EQ_SIGN = new IdrTokenType("EQ_SIGN");
  IElementType IDENTIFICATOR = new IdrTokenType("IDENTIFICATOR");
  IElementType IDENTIFICATOR_SEP = new IdrTokenType("IDENTIFICATOR_SEP");
  IElementType INTEGER_LITERAL = new IdrTokenType("INTEGER_LITERAL");
  IElementType KW_CASE = new IdrTokenType("KW_CASE");
  IElementType KW_ELSE = new IdrTokenType("KW_ELSE");
  IElementType KW_IF = new IdrTokenType("KW_IF");
  IElementType KW_IMPORT = new IdrTokenType("KW_IMPORT");
  IElementType KW_INFIX = new IdrTokenType("KW_INFIX");
  IElementType KW_INFIXL = new IdrTokenType("KW_INFIXL");
  IElementType KW_INFIXR = new IdrTokenType("KW_INFIXR");
  IElementType KW_MODULE = new IdrTokenType("KW_MODULE");
  IElementType KW_OF = new IdrTokenType("KW_OF");
  IElementType KW_PREFIX = new IdrTokenType("KW_PREFIX");
  IElementType KW_THEN = new IdrTokenType("KW_THEN");
  IElementType LBRACKET = new IdrTokenType("LBRACKET");
  IElementType LINE_COMMENT_START = new IdrTokenType("--");
  IElementType LINE_COMMENT_TEXT = new IdrTokenType("LINE_COMMENT_TEXT");
  IElementType LPAR = new IdrTokenType("LPAR");
  IElementType OPEN = new IdrTokenType("OPEN");
  IElementType OPERATOR = new IdrTokenType("OPERATOR");
  IElementType PLACEHOLDER = new IdrTokenType("PLACEHOLDER");
  IElementType RBRACKET = new IdrTokenType("RBRACKET");
  IElementType RPAR = new IdrTokenType("RPAR");
  IElementType STRING_CONTENT = new IdrTokenType("STRING_CONTENT");
  IElementType STRING_QUOTE = new IdrTokenType("STRING_QUOTE");
  IElementType TYPE_SIGN = new IdrTokenType("TYPE_SIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CASE_EXPRESSION) {
        return new IdrPsiCaseExpressionImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new IdrPsiDirectiveImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new IdrPsiExpressionListImpl(node);
      }
      else if (type == FUNCTION_CALL_EXPRESSION) {
        return new IdrPsiFunctionCallExpressionImpl(node);
      }
      else if (type == FUNCTION_MATCH) {
        return new IdrPsiFunctionMatchImpl(node);
      }
      else if (type == FUNCTION_SPECIFICATION) {
        return new IdrPsiFunctionSpecificationImpl(node);
      }
      else if (type == IDENTIFICATOR_REFERENCE) {
        return new IdrPsiIdentificatorReferenceImpl(node);
      }
      else if (type == ID_EXPRESSION) {
        return new IdrPsiIdExpressionImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new IdrPsiIfExpressionImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new IdrPsiImportStatementImpl(node);
      }
      else if (type == INTEGER_LITERAL_EXPRESSION) {
        return new IdrPsiIntegerLiteralExpressionImpl(node);
      }
      else if (type == LIST_LITERAL_EXPRESSION) {
        return new IdrPsiListLiteralExpressionImpl(node);
      }
      else if (type == MODULE_STATEMENT) {
        return new IdrPsiModuleStatementImpl(node);
      }
      else if (type == OPERATOR_DECLARATION) {
        return new IdrPsiOperatorDeclarationImpl(node);
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
