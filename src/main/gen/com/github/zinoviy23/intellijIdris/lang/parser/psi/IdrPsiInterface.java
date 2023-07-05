// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdrPsiInterface extends PsiElement {

  @Nullable
  IdrPsiConstraintList getConstraintList();

  @Nullable
  IdrPsiFunctionOptsList getFunctionOptsList();

  @NotNull
  List<IdrPsiInterfaceArgument> getInterfaceArgumentList();

  @Nullable
  IdrPsiInterfaceBody getInterfaceBody();

}
