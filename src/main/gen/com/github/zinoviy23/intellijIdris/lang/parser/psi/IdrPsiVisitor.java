// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class IdrPsiVisitor extends PsiElementVisitor {

  public void visitAnonymousTypeSpecificationElement(@NotNull IdrPsiAnonymousTypeSpecificationElement o) {
    visitTypeSpecificationElement(o);
  }

  public void visitBoundedTypeSpecificationElement(@NotNull IdrPsiBoundedTypeSpecificationElement o) {
    visitTypeSpecificationElement(o);
  }

  public void visitCaseExpression(@NotNull IdrPsiCaseExpression o) {
    visitExpression(o);
  }

  public void visitExpression(@NotNull IdrPsiExpression o) {
    visitPsiElement(o);
  }

  public void visitFunctionCallExpression(@NotNull IdrPsiFunctionCallExpression o) {
    visitExpression(o);
  }

  public void visitFunctionMatch(@NotNull IdrPsiFunctionMatch o) {
    visitPsiElement(o);
  }

  public void visitFunctionSpecification(@NotNull IdrPsiFunctionSpecification o) {
    visitPsiElement(o);
  }

  public void visitIdExpression(@NotNull IdrPsiIdExpression o) {
    visitExpression(o);
  }

  public void visitIfExpression(@NotNull IdrPsiIfExpression o) {
    visitExpression(o);
  }

  public void visitIntegerLiteralExpression(@NotNull IdrPsiIntegerLiteralExpression o) {
    visitExpression(o);
  }

  public void visitListLiteralExpression(@NotNull IdrPsiListLiteralExpression o) {
    visitExpression(o);
  }

  public void visitOperatorExpression(@NotNull IdrPsiOperatorExpression o) {
    visitExpression(o);
  }

  public void visitParenExpression(@NotNull IdrPsiParenExpression o) {
    visitExpression(o);
  }

  public void visitTypeSpecification(@NotNull IdrPsiTypeSpecification o) {
    visitPsiElement(o);
  }

  public void visitTypeSpecificationElement(@NotNull IdrPsiTypeSpecificationElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
