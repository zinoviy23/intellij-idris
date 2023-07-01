// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.zinoviy23.intellijIdris.lang.parser.psi.*;

public class IdrPsiTypeSpecificationImpl extends ASTWrapperPsiElement implements IdrPsiTypeSpecification {

  public IdrPsiTypeSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitTypeSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdrPsiVisitor) accept((IdrPsiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdrPsiConstraintList getConstraintList() {
    return findChildByClass(IdrPsiConstraintList.class);
  }

  @Override
  @NotNull
  public IdrPsiExpression getExpression() {
    return findNotNullChildByClass(IdrPsiExpression.class);
  }

}
