// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import com.github.zinoviy23.intellijIdris.lang.parser.psi.*;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.SearchScope;

public class IdrPsiIdExpressionImpl extends IdrPsiSimpleExpressionImpl implements IdrPsiIdExpression {

  public IdrPsiIdExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitIdExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdrPsiVisitor) accept((IdrPsiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiReference getReference() {
    return IdrPsiImplUtilKt.getReference(this);
  }

  @Override
  @Nullable
  public String getName() {
    return IdrPsiImplUtilKt.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@Nullable String name) {
    return IdrPsiImplUtilKt.setName(this, name);
  }

  @Override
  @NotNull
  public SearchScope getUseScope() {
    return IdrPsiImplUtilKt.getUseScope(this);
  }

}
