// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.zinoviy23.intellijIdris.lang.parser.psi.impl.*;

public interface IdrTokenTypes {

  IElementType ANONYMOUS_TYPE_SPECIFICATION_ELEMENT = new IdrElementType("ANONYMOUS_TYPE_SPECIFICATION_ELEMENT");
  IElementType BOUNDED_TYPE_SPECIFICATION_ELEMENT = new IdrElementType("BOUNDED_TYPE_SPECIFICATION_ELEMENT");
  IElementType CASE_EXPRESSION = new IdrElementType("CASE_EXPRESSION");
  IElementType EXPRESSION = new IdrElementType("EXPRESSION");
  IElementType FUNCTION_CALL_EXPRESSION = new IdrElementType("FUNCTION_CALL_EXPRESSION");
  IElementType FUNCTION_MATCH = new IdrElementType("FUNCTION_MATCH");
  IElementType FUNCTION_SPECIFICATION = new IdrElementType("FUNCTION_SPECIFICATION");
  IElementType ID_EXPRESSION = new IdrElementType("ID_EXPRESSION");
  IElementType IF_EXPRESSION = new IdrElementType("IF_EXPRESSION");
  IElementType INTEGER_LITERAL_EXPRESSION = new IdrElementType("INTEGER_LITERAL_EXPRESSION");
  IElementType LIST_LITERAL_EXPRESSION = new IdrElementType("LIST_LITERAL_EXPRESSION");
  IElementType OPERATOR_EXPRESSION = new IdrElementType("OPERATOR_EXPRESSION");
  IElementType PAREN_EXPRESSION = new IdrElementType("PAREN_EXPRESSION");
  IElementType TYPE_SPECIFICATION = new IdrElementType("TYPE_SPECIFICATION");
  IElementType TYPE_SPECIFICATION_ELEMENT = new IdrElementType("TYPE_SPECIFICATION_ELEMENT");

  IElementType ARROW_SIGN = new IdrTokenType("ARROW_SIGN");
  IElementType COLON_SIGN = new IdrTokenType("COLON_SIGN");
  IElementType COMMA = new IdrTokenType("COMMA");
  IElementType EOL = new IdrTokenType("EOL");
  IElementType EQ_SIGN = new IdrTokenType("EQ_SIGN");
  IElementType FILE_1_0 = new IdrTokenType("file_1_0");
  IElementType IDENTIFICATOR = new IdrTokenType("IDENTIFICATOR");
  IElementType INTEGER_LITERAL = new IdrTokenType("INTEGER_LITERAL");
  IElementType KW_CASE = new IdrTokenType("KW_CASE");
  IElementType KW_ELSE = new IdrTokenType("KW_ELSE");
  IElementType KW_IF = new IdrTokenType("KW_IF");
  IElementType KW_OF = new IdrTokenType("KW_OF");
  IElementType KW_THEN = new IdrTokenType("KW_THEN");
  IElementType LBRACKET = new IdrTokenType("LBRACKET");
  IElementType LPAR = new IdrTokenType("LPAR");
  IElementType OPERATOR = new IdrTokenType("OPERATOR");
  IElementType RBRACKET = new IdrTokenType("RBRACKET");
  IElementType RPAR = new IdrTokenType("RPAR");
  IElementType TYPE_SIGN = new IdrTokenType("TYPE_SIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANONYMOUS_TYPE_SPECIFICATION_ELEMENT) {
        return new IdrPsiAnonymousTypeSpecificationElementImpl(node);
      }
      else if (type == BOUNDED_TYPE_SPECIFICATION_ELEMENT) {
        return new IdrPsiBoundedTypeSpecificationElementImpl(node);
      }
      else if (type == CASE_EXPRESSION) {
        return new IdrPsiCaseExpressionImpl(node);
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
      else if (type == ID_EXPRESSION) {
        return new IdrPsiIdExpressionImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new IdrPsiIfExpressionImpl(node);
      }
      else if (type == INTEGER_LITERAL_EXPRESSION) {
        return new IdrPsiIntegerLiteralExpressionImpl(node);
      }
      else if (type == LIST_LITERAL_EXPRESSION) {
        return new IdrPsiListLiteralExpressionImpl(node);
      }
      else if (type == OPERATOR_EXPRESSION) {
        return new IdrPsiOperatorExpressionImpl(node);
      }
      else if (type == PAREN_EXPRESSION) {
        return new IdrPsiParenExpressionImpl(node);
      }
      else if (type == TYPE_SPECIFICATION) {
        return new IdrPsiTypeSpecificationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
