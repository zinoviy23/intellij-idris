package com.github.zinoviy23.intellijIdris.highlighting

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiDataConstructorsBody
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiDataDeclarationVariant
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiFunctionMatch
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiFunctionSpecification
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiHoleExpression
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.project.DumbAware
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

internal class IdrSyntaxAnnotator : Annotator, DumbAware  {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is IdrPsiFunctionSpecification -> {
                if (element.parent is IdrPsiDataConstructorsBody) {
                    highlightDataConstructor(element, holder)
                }
                else {
                    highlightFunctionDeclarationName(element, holder)
                }
            }
            is IdrPsiFunctionMatch -> highlightFunctionDeclarationName(element, holder)
            is IdrPsiDataDeclarationVariant -> highlightDataConstructor(element, holder)
            is IdrPsiHoleExpression -> highlightHole(element, holder)
            else -> return
        }
    }

    private fun highlightDataConstructor(element: PsiElement, holder: AnnotationHolder) {
        val identifier = when (element) {
            is IdrPsiDataDeclarationVariant -> element.firstChild
            is IdrPsiFunctionSpecification -> {
                element.functionOptsList?.nextSibling?.let {
                    PsiTreeUtil.skipWhitespacesAndCommentsForward(it)
                } ?: element.firstChild
            }
            else -> null
        } ?: return

        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(identifier.textRange)
            .textAttributes(IdrSyntaxHighlighter.DATA_CONSTRUCTOR)
            .create()
    }

    private fun highlightFunctionDeclarationName(element: PsiElement, holder: AnnotationHolder) {
        val identifier = when (element) {
            is IdrPsiFunctionMatch -> element.firstChild
            is IdrPsiFunctionSpecification -> {
                element.functionOptsList?.nextSibling?.let {
                    PsiTreeUtil.skipWhitespacesAndCommentsForward(it)
                } ?: element.firstChild
            }
            else -> null
        } ?: return

        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(identifier.textRange)
            .textAttributes(IdrSyntaxHighlighter.FUNCTION_SPECIFICATION_NAME)
            .create()
    }

    private fun highlightHole(element: IdrPsiHoleExpression, holder: AnnotationHolder) {
        val id = element.firstChild?.nextSibling ?: return
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
            .range(id.textRange)
            .textAttributes(IdrSyntaxHighlighter.HOLE_EXPRESSION)
            .create()
    }
}