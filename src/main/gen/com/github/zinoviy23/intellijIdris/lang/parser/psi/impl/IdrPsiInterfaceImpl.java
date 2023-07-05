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

public class IdrPsiInterfaceImpl extends ASTWrapperPsiElement implements IdrPsiInterface {

  public IdrPsiInterfaceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull IdrPsiVisitor visitor) {
    visitor.visitInterface(this);
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
  @Nullable
  public IdrPsiFunctionOptsList getFunctionOptsList() {
    return findChildByClass(IdrPsiFunctionOptsList.class);
  }

  @Override
  @NotNull
  public List<IdrPsiInterfaceArgument> getInterfaceArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, IdrPsiInterfaceArgument.class);
  }

  @Override
  @Nullable
  public IdrPsiInterfaceBody getInterfaceBody() {
    return findChildByClass(IdrPsiInterfaceBody.class);
  }

}
