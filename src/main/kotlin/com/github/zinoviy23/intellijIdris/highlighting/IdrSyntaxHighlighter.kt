package com.github.zinoviy23.intellijIdris.highlighting

import com.github.zinoviy23.intellijIdris.lang.parser.lexer.IdrLexer
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
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
        val NUMBER_LITERAL = createTextAttributesKey("IDRIS_NUMBER_LITERAL", DefaultLanguageHighlighterColors.NUMBER)
        val FUNCTION_SPECIFICATION_NAME = createTextAttributesKey("IDRIS_FUNCTION_SPECIFICATION_NAME", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        val KEYWORD = createTextAttributesKey("IDRIS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

        private val map = mutableMapOf<IElementType, TextAttributesKey>()

        init {
            fillMap(map, NUMBER_LITERAL, IdrTokenTypes.INTEGER_LITERAL)
            fillMap(map, KEYWORD, IdrTokenTypes.KW_CASE, IdrTokenTypes.KW_ELSE, IdrTokenTypes.KW_IF, IdrTokenTypes.KW_OF, IdrTokenTypes.KW_THEN)
        }
    }
}