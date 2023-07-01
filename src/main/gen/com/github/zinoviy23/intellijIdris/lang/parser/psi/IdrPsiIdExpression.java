// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.SearchScope;

public interface IdrPsiIdExpression extends IdrPsiExpression, PsiNamedElement {

  @NotNull
  PsiReference getReference();

  @Nullable
  String getName();

  @NotNull
  PsiElement setName(@Nullable String name);

  @NotNull
  SearchScope getUseScope();

}
