package com.github.zinoviy23.intellijIdris.highlighting

import com.github.zinoviy23.intellijIdris.lang.parser.lexer.IdrLexer
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

internal class IdrSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return IdrLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(map[tokenType])
    }

    companion object {
        private val NUMBER_LITERAL = createTextAttributesKey("IDRIS_NUMBER_LITERAL", DefaultLanguageHighlighterColors.NUMBER)
        val FUNCTION_SPECIFICATION_NAME = createTextAttributesKey("IDRIS_FUNCTION_SPECIFICATION_NAME", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        private val KEYWORD = createTextAttributesKey("IDRIS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        private val LINE_COMMENT = createTextAttributesKey("IDRIS_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        private val DOC_COMMENT = createTextAttributesKey("IDRIS_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
        private val DIRECTIVE = createTextAttributesKey("IDRIS_DIRECTIVE", DefaultLanguageHighlighterColors.METADATA)
        private val STRING_LITERAL = createTextAttributesKey("IDRIS_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING)

        private val map = mutableMapOf<IElementType, TextAttributesKey>()

        init {
            fillMap(map, NUMBER_LITERAL, INTEGER_LITERAL)
            fillMap(
                map,
                KEYWORD,
                KW_CASE,
                KW_ELSE,
                KW_IF,
                KW_OF,
                KW_THEN,
                KW_IMPORT,
                KW_MODULE,
                KW_INFIX,
                KW_PREFIX,
                KW_INFIXL,
                KW_INFIXR,
                KW_WHERE,
                KW_LET,
                KW_IN,
                KW_EXPORT,
                KW_TOTAL,
                KW_PARTIAL,
            )
            fillMap(map, LINE_COMMENT, LINE_COMMENT_START, LINE_COMMENT_TEXT)
            fillMap(map, DOC_COMMENT, DOC_COMMENT_TEXT, DOC_COMMENT_START)
            fillMap(map, DIRECTIVE, DIRECTIVE_START, DIRECTIVE_TYPE)
            fillMap(map, STRING_LITERAL, STRING_QUOTE, STRING_CONTENT)
        }
    }
}