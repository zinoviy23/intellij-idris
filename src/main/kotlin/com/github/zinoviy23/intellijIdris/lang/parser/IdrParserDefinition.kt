package com.github.zinoviy23.intellijIdris.lang.parser

import com.github.zinoviy23.intellijIdris.lang.IdrLanguage
import com.github.zinoviy23.intellijIdris.lang.parser.lexer.IdrLexer
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrParser
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrPsiFile
import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

internal class IdrParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer = IdrLexer()

    override fun createParser(project: Project?): PsiParser = IdrParser()

    override fun getFileNodeType(): IFileElementType = FILE_NODE

    override fun getCommentTokens(): TokenSet = TokenSet.create(
        IdrTokenTypes.LINE_COMMENT_TEXT,
        IdrTokenTypes.DOC_COMMENT_TEXT,
        IdrTokenTypes.DOC_COMMENT_START,
        IdrTokenTypes.LINE_COMMENT_START
    )

    override fun getStringLiteralElements(): TokenSet = TokenSet.create(IdrTokenTypes.STRING_CONTENT, IdrTokenTypes.STRING_QUOTE)

    override fun createElement(node: ASTNode?): PsiElement = IdrTokenTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = IdrPsiFile(viewProvider)
}

private val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)

private val FILE_NODE = IFileElementType(IdrLanguage)