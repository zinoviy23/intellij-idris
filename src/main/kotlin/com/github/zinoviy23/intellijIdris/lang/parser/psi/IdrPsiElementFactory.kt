package com.github.zinoviy23.intellijIdris.lang.parser.psi

import com.github.zinoviy23.intellijIdris.lang.IdrFileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory

object IdrPsiElementFactory {
    fun createIdExpression(project: Project, name: String): IdrPsiIdExpression {
        val file = createFile(project, "a = $name")
        return (file.firstChild as IdrPsiFunctionMatch).expressionList.last() as IdrPsiIdExpression
    }

    fun createFile(project: Project, text: String): IdrPsiFile {
        return PsiFileFactory.getInstance(project)
            .createFileFromText("dummy.idr", IdrFileType, text) as IdrPsiFile
    }
}