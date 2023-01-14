package com.github.zinoviy23.intellijIdris.lang

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object IdrFileType : LanguageFileType(IdrLanguage) {
    override fun getName(): String = "Idris File"

    override fun getDescription(): String = "Idris Source File"

    override fun getDefaultExtension(): String = "idr"

    override fun getIcon(): Icon = AllIcons.FileTypes.Text
}