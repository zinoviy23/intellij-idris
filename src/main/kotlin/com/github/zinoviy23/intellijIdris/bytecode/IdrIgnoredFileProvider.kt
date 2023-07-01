package com.github.zinoviy23.intellijIdris.bytecode

import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.FilePath
import com.intellij.openapi.vcs.changes.IgnoredFileDescriptor
import com.intellij.openapi.vcs.changes.IgnoredFileProvider

@Suppress("UnstableApiUsage")
internal class IdrIgnoredFileProvider : IgnoredFileProvider {
    override fun isIgnoredFile(project: Project, filePath: FilePath): Boolean {
        return filePath.virtualFile?.extension == IDRIS_BYTECODE_FILE_EXT
    }

    override fun getIgnoredFiles(project: Project): Set<IgnoredFileDescriptor> {
        return emptySet()
    }

    override fun getIgnoredGroupDescription(): String = "Idris Byte Code files"
}