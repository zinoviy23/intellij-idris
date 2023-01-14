package com.github.zinoviy23.intellijIdris.lang.parser.psi

import com.github.zinoviy23.intellijIdris.lang.IdrFileType
import com.github.zinoviy23.intellijIdris.lang.IdrLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class IdrPsiFile(fileViewProvider: FileViewProvider) : PsiFileBase(fileViewProvider, IdrLanguage) {
    override fun getFileType(): FileType = IdrFileType
}