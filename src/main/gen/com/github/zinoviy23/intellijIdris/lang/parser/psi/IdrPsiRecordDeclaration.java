// This is a generated file. Not intended for manual editing.
package com.github.zinoviy23.intellijIdris.lang.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface IdrPsiRecordDeclaration extends PsiElement {

  @Nullable
  IdrPsiFunctionOptsList getFunctionOptsList();

  @Nullable
  IdrPsiRecordConstructor getRecordConstructor();

  @NotNull
  List<IdrPsiRecordField> getRecordFieldList();

  @Nullable
  IdrPsiTypeSpecification getTypeSpecification();

}
