// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

public class IdrPsiVisitor extends PsiElementVisitor {

  public void visitCaseEntry(@NotNull IdrPsiCaseEntry o) {
    visitPsiElement(o);
  }

  public void visitCaseExpression(@NotNull IdrPsiCaseExpression o) {
    visitExpression(o);
  }

  public void visitCharLiteralExpression(@NotNull IdrPsiCharLiteralExpression o) {
    visitSimpleExpression(o);
  }

  public void visitConstraintList(@NotNull IdrPsiConstraintList o) {
    visitPsiElement(o);
  }

  public void visitDataBody(@NotNull IdrPsiDataBody o) {
    visitPsiElement(o);
  }

  public void visitDataConstructorsBody(@NotNull IdrPsiDataConstructorsBody o) {
    visitDataBody(o);
  }

  public void visitDataDeclaration(@NotNull IdrPsiDataDeclaration o) {
    visitPsiElement(o);
  }

  public void visitDataDeclarationVariant(@NotNull IdrPsiDataDeclarationVariant o) {
    visitPsiElement(o);
  }

  public void visitDataVariantsBody(@NotNull IdrPsiDataVariantsBody o) {
    visitDataBody(o);
  }

  public void visitDefaultParenExpression(@NotNull IdrPsiDefaultParenExpression o) {
    visitParenExpression(o);
  }

  public void visitDirective(@NotNull IdrPsiDirective o) {
    visitPsiElement(o);
  }

  public void visitEmptyTupleParenExpression(@NotNull IdrPsiEmptyTupleParenExpression o) {
    visitParenExpression(o);
  }

  public void visitEscapedNameId(@NotNull IdrPsiEscapedNameId o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull IdrPsiExpression o) {
    visitPsiElement(o);
  }

  public void visitExpressionList(@NotNull IdrPsiExpressionList o) {
    visitPsiElement(o);
  }

  public void visitFunctionCallExpression(@NotNull IdrPsiFunctionCallExpression o) {
    visitExpression(o);
  }

  public void visitFunctionCallPattern(@NotNull IdrPsiFunctionCallPattern o) {
    visitPattern(o);
  }

  public void visitFunctionMatch(@NotNull IdrPsiFunctionMatch o) {
    visitPsiElement(o);
  }

  public void visitFunctionOptsList(@NotNull IdrPsiFunctionOptsList o) {
    visitPsiElement(o);
  }

  public void visitFunctionSpecification(@NotNull IdrPsiFunctionSpecification o) {
    visitPsiElement(o);
  }

  public void visitFunctionWhereBlock(@NotNull IdrPsiFunctionWhereBlock o) {
    visitPsiElement(o);
  }

  public void visitHoleExpression(@NotNull IdrPsiHoleExpression o) {
    visitSimpleExpression(o);
  }

  public void visitIdExpression(@NotNull IdrPsiIdExpression o) {
    visitSimpleExpression(o);
    // visitPsiNamedElement(o);
  }

  public void visitIdentificatorReference(@NotNull IdrPsiIdentificatorReference o) {
    visitPsiElement(o);
  }

  public void visitIfElseBranch(@NotNull IdrPsiIfElseBranch o) {
    visitPsiElement(o);
  }

  public void visitIfExpression(@NotNull IdrPsiIfExpression o) {
    visitExpression(o);
  }

  public void visitIfThenBranch(@NotNull IdrPsiIfThenBranch o) {
    visitPsiElement(o);
  }

  public void visitImplicitArgumentPattern(@NotNull IdrPsiImplicitArgumentPattern o) {
    visitPattern(o);
  }

  public void visitImportStatement(@NotNull IdrPsiImportStatement o) {
    visitPsiElement(o);
  }

  public void visitIntegerLiteralExpression(@NotNull IdrPsiIntegerLiteralExpression o) {
    visitSimpleExpression(o);
  }

  public void visitInterface(@NotNull IdrPsiInterface o) {
    visitPsiElement(o);
  }

  public void visitInterfaceArgument(@NotNull IdrPsiInterfaceArgument o) {
    visitPsiElement(o);
  }

  public void visitInterfaceBody(@NotNull IdrPsiInterfaceBody o) {
    visitPsiElement(o);
  }

  public void visitInterfaceImplementation(@NotNull IdrPsiInterfaceImplementation o) {
    visitPsiElement(o);
  }

  public void visitLambdaExpression(@NotNull IdrPsiLambdaExpression o) {
    visitExpression(o);
  }

  public void visitLetEntry(@NotNull IdrPsiLetEntry o) {
    visitPsiElement(o);
  }

  public void visitLetExpression(@NotNull IdrPsiLetExpression o) {
    visitExpression(o);
  }

  public void visitListLiteralExpression(@NotNull IdrPsiListLiteralExpression o) {
    visitSimpleExpression(o);
  }

  public void visitModuleStatement(@NotNull IdrPsiModuleStatement o) {
    visitPsiElement(o);
  }

  public void visitNameParenExpression(@NotNull IdrPsiNameParenExpression o) {
    visitParenExpression(o);
  }

  public void visitNamedPatternExpression(@NotNull IdrPsiNamedPatternExpression o) {
    visitExpression(o);
  }

  public void visitOperatorDeclaration(@NotNull IdrPsiOperatorDeclaration o) {
    visitPsiElement(o);
  }

  public void visitOperatorElement(@NotNull IdrPsiOperatorElement o) {
    visitPsiElement(o);
  }

  public void visitOperatorExpression(@NotNull IdrPsiOperatorExpression o) {
    visitExpression(o);
  }

  public void visitOperatorList(@NotNull IdrPsiOperatorList o) {
    visitPsiElement(o);
  }

  public void visitOperatorParenExpression(@NotNull IdrPsiOperatorParenExpression o) {
    visitParenExpression(o);
  }

  public void visitParenExpression(@NotNull IdrPsiParenExpression o) {
    visitSimpleExpression(o);
  }

  public void visitPattern(@NotNull IdrPsiPattern o) {
    visitPsiElement(o);
  }

  public void visitPlaceholderExpression(@NotNull IdrPsiPlaceholderExpression o) {
    visitSimpleExpression(o);
  }

  public void visitRecordConstructor(@NotNull IdrPsiRecordConstructor o) {
    visitPsiElement(o);
  }

  public void visitRecordDeclaration(@NotNull IdrPsiRecordDeclaration o) {
    visitPsiElement(o);
  }

  public void visitRecordField(@NotNull IdrPsiRecordField o) {
    visitPsiElement(o);
  }

  public void visitSimpleExpression(@NotNull IdrPsiSimpleExpression o) {
    visitExpression(o);
  }

  public void visitSimpleExpressionPattern(@NotNull IdrPsiSimpleExpressionPattern o) {
    visitPattern(o);
  }

  public void visitStringLiteralExpression(@NotNull IdrPsiStringLiteralExpression o) {
    visitSimpleExpression(o);
  }

  public void visitTupleParentExpression(@NotNull IdrPsiTupleParentExpression o) {
    visitExpression(o);
  }

  public void visitTypeExpression(@NotNull IdrPsiTypeExpression o) {
    visitExpression(o);
  }

  public void visitTypeSpecification(@NotNull IdrPsiTypeSpecification o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
