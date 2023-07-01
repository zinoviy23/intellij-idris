package com.github.zinoviy23.intellijIdris.editor

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.lang.Commenter

internal class IdrCommenter : Commenter {
    override fun getLineCommentPrefix(): String = LINE_COMMENT_START_WS

    override fun getLineCommentPrefixes(): List<String> = listOf(
        LINE_COMMENT_START_WS,
        LINE_COMMENT_START
    )

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null
}

private val LINE_COMMENT_START = IdrTokenTypes.LINE_COMMENT_START.toString()
private val LINE_COMMENT_START_WS = "$LINE_COMMENT_START "