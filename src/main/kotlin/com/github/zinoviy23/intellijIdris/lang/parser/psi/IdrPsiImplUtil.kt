package com.github.zinoviy23.intellijIdris.lang.parser.psi

import com.intellij.lang.PsiBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.search.LocalSearchScope
import com.intellij.psi.search.SearchScope
import com.intellij.psi.util.elementType
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings

internal fun getReference(idExpression: IdrPsiIdExpression): PsiReference {
    return SimpleReference(idExpression)
}

internal fun getName(idExpression: IdrPsiIdExpression): String? {
    return idExpression.text
}

internal fun setName(idExpression: IdrPsiIdExpression, name: String?): PsiElement {
    if (name == null) {
        throw UnsupportedOperationException()
    }

    val newId = IdrPsiElementFactory.createIdExpression(idExpression.project, name)
    idExpression.firstChild.replace(newId.firstChild)
    return idExpression
}

internal fun getUseScope(idExpression: IdrPsiIdExpression): SearchScope {
    val parent = idExpression.parent as? IdrPsiFunctionMatch ?: return LocalSearchScope.EMPTY
    return LocalSearchScope(parent)
}

private class SimpleReference(element: IdrPsiIdExpression) : PsiReferenceBase<IdrPsiIdExpression>(element, TextRange.create(0, element.textLength)) {
    override fun resolve(): PsiElement? {
        for (parent in myElement.parents(false)) {
            when (parent) {
                is IdrPsiLetExpression -> {
                    for (entry in parent.letEntryList) {
                        if (entry.firstChild.text == myElement.text) return entry.firstChild
                    }
                }
                is IdrPsiFunctionMatch -> {
                    val params = parent.patternList

                    for (param in params) {
                        if (param is IdrPsiSimpleExpressionPattern) {
                            val paramExpr = param.simpleExpression
                            if (paramExpr is IdrPsiIdExpression) {
                                if (paramExpr.name == myElement.name && param != myElement) return paramExpr
                            }
                        }
                    }
                }
                is IdrPsiFile -> {
                    for (functionSpecification in parent.children.filterIsInstance<IdrPsiFunctionSpecification>()) {
                        val id = functionSpecification.firstChild.siblings()
                            .firstOrNull() { it.elementType == IdrTokenTypes.IDENTIFICATOR }

                        if (id != null && id.text == myElement.name) {
                            return id
                        }
                    }
                }
            }
        }

        return myElement
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        return myElement.setName(newElementName)
    }
}