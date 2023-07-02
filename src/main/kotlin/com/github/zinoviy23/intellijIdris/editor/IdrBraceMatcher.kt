package com.github.zinoviy23.intellijIdris.editor

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

internal class IdrBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
        BracePair(IdrTokenTypes.LPAR, IdrTokenTypes.RPAR, true),
        BracePair(IdrTokenTypes.LBRACKET, IdrTokenTypes.RBRACKET, true),
        BracePair(IdrTokenTypes.LBRACE, IdrTokenTypes.RBRACE, true),
    )

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset
}