package com.github.zinoviy23.intellijIdris.editor

import com.github.zinoviy23.intellijIdris.lang.parser.psi.IdrTokenTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

internal class IdrQuoteHandler : SimpleTokenSetQuoteHandler(IdrTokenTypes.STRING_QUOTE)