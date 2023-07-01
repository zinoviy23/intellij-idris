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

public class IdrPsiEscapedFunctionCallExpressionImpl extends IdrPsiExpressionImpl implements IdrPsiEscapedFunctionCallExpression {

  public IdrPsiEscapedFunctionCallExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitEscapedFunctionCallExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdrPsiVisitor) accept((IdrPsiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public IdrPsiEscapedNameId getEscapedNameId() {
    return findNotNullChildByClass(IdrPsiEscapedNameId.class);
  }

  @Override
  @NotNull
  public List<IdrPsiExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdrPsiExpression.class);
  }

}
