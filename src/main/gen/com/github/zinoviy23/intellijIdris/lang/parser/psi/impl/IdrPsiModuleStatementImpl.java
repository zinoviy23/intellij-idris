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

public class IdrPsiModuleStatementImpl extends ASTWrapperPsiElement implements IdrPsiModuleStatement {

  public IdrPsiModuleStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitModuleStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof IdrPsiVisitor) accept((IdrPsiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public IdrPsiIdentificatorReference getIdentificatorReference() {
    return findChildByClass(IdrPsiIdentificatorReference.class);
  }

}
