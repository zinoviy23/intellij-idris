package com.github.zinoviy23.intellijIdris.highlighting

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiFunctionMatch
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiFunctionSpecification
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.project.DumbAware
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

internal class IdrSyntaxAnnotator : Annotator, DumbAware  {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
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
}