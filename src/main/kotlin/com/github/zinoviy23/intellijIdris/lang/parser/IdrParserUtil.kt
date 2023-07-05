package com.github.zinoviy23.intellijIdris.lang.parser

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.util.Key

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

    @JvmStatic
    fun PsiBuilder.openBlock(level: Int): Boolean {
        val indent = currentColumn
        val braceStack = indentationModel.braceStack

        val braceLevel = when {
            braceStack.isEmpty() -> if (indent == 0) 1 else indent
            braceStack.last() != null -> if (indent <= braceStack.last()!!) braceStack.last()!! + 1 else indent
            else -> indent
        }

        braceStack += braceLevel

        return true
    }

    @JvmStatic
    fun PsiBuilder.pushIndent(level: Int): Boolean {
        indentationModel.indents += currentColumn
        return true
    }

    @JvmStatic
    fun PsiBuilder.notEndBlock(level: Int): Boolean {
        val braceStack = indentationModel.braceStack

        when {
            braceStack.isEmpty() || braceStack.last() == null -> {}
            else -> {
                val last = braceStack.last()!!
                val indent = currentColumn
                val isParen = nextTokenIs(this, IdrTokenTypes.RPAR)
                if (indent < last || isParen) {
                    return false
                }
            }
        }

        return true
    }

    @JvmStatic
    fun PsiBuilder.keepTerminator(level: Int): Boolean {
        var r = indentationTerminator()
        r = r || syntaxTerminator()
        r = r || eof()
        return r
    }

    @JvmStatic
    fun PsiBuilder.popIndent(level: Int): Boolean {
        val indents = indentationModel.indents
        check(indents.isNotEmpty())

        indents.removeLast()

        return true
    }

    @JvmStatic
    fun PsiBuilder.closeBlock(level: Int): Boolean {
        val braceStack = indentationModel.braceStack
        when {
            braceStack.isEmpty() -> {
                if (!eof()) {
                    error("End of block")
                }
            }
            else -> {
                val lvl = braceStack.last()!!
                val indent = currentColumn
                val isParen = nextTokenIs(this, IdrTokenTypes.RPAR)
                val isIn = nextTokenIs(this, IdrTokenTypes.KW_IN)
                if (indent >= lvl && !(isParen || isIn)) {
                    if (!eof()) error("Not end of block")
                }
                braceStack.removeLast()
            }
        }

        return true
    }

    private fun PsiBuilder.indentationTerminator(): Boolean {
        val lastIndent = indentationModel.lastIndent
        val indent = currentColumn
        return indent <= lastIndent
    }

    private fun PsiBuilder.syntaxTerminator(): Boolean {
        return nextTokenIs(this, IdrTokenTypes.RPAR) || nextTokenIs(this, IdrTokenTypes.KW_IN)
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
                val actualModel = IndentationModel(mutableListOf(), mutableListOf())
                putUserData(INDENTATION_MODEL, actualModel)
                actualModel
            }
            else -> model
        }
    }

private data class IndentationModel(
    val indents: MutableList<Int?>,
    val braceStack: MutableList<Int?>,
) {
    val lastIndent: Int
        get() = indents.lastOrNull() ?: 1
}