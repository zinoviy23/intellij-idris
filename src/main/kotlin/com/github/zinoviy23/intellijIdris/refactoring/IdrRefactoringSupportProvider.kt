package com.github.zinoviy23.intellijIdris.refactoring

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiIdExpression
import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement

internal class IdrRefactoringSupportProvider : RefactoringSupportProvider() {
    override fun isInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean {
        return element is IdrPsiIdExpression
    }
}