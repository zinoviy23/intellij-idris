package com.github.zinoviy23.intellijIdris.lang.parser

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.util.Key
import com.intellij.psi.tree.TokenSet

@Suppress("UNUSED_PARAMETER")
internal object IdrParserUtil : GeneratedParserUtilBase() {
    @JvmStatic
    fun PsiBuilder.myEol(level: Int): Boolean {
        if (!nextTokenIs(this, IdrTokenTypes.EOL)) return false
        val m = enter_section_(this)
        val offsetOfEol = currentOffset
        val r = consumeToken(this, IdrTokenTypes.EOL)
        exit_section_(this, m, null, r)

        currentLineStartOffset = offsetOfEol + 1 // consumeToken skips spaces

        return r
    }

    @JvmStatic
    fun PsiBuilder.parseIndentGt(level: Int): Boolean {
        val m = enter_section_(this)
        val r = currentColumn > indentationModel.lastIndent
        exit_section_(this, m, null, r)
        return r
    }
}

private val CURRENT_LINE_START_OFFSET = Key.create<Int>("idris.current.line.start.offset")
private val INDENTATION_MODEL = Key.create<IndentationModel>("idris.indentation.model")


private var PsiBuilder.currentLineStartOffset: Int
    get() = getUserData(CURRENT_LINE_START_OFFSET) ?: 0
    set(value) {
        putUserData(CURRENT_LINE_START_OFFSET, value)
    }

private val PsiBuilder.currentColumn: Int
    get() = currentOffset - currentLineStartOffset

private val PsiBuilder.indentationModel: IndentationModel
    get() {
        return when (val model = getUserData(INDENTATION_MODEL)) {
            null -> {
                val actualModel = IndentationModel(mutableListOf())
                putUserData(INDENTATION_MODEL, actualModel)
                actualModel
            }
            else -> model
        }
    }

private data class IndentationModel(private val indents: MutableList<Int?>) {
    val lastIndent: Int
        get() = indents.lastOrNull() ?: 1
}