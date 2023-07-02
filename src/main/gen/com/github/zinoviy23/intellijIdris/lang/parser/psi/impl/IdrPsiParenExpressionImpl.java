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

public class IdrPsiParenExpressionImpl extends IdrPsiSimpleExpressionImpl implements IdrPsiParenExpression {

  public IdrPsiParenExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitParenExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdrPsiVisitor) accept((IdrPsiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdrPsiParenExpressionEnd getParenExpressionEnd() {
    return findChildByClass(IdrPsiParenExpressionEnd.class);
  }

}
