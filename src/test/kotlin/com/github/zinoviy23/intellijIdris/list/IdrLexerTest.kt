package com.github.zinoviy23.intellijIdris.list

import com.github.zinoviy23.intellijIdris.lang.parser.lexer.IdrLexer
import com.intellij.lexer.Lexer
import com.intellij.testFramework.LexerTestCase
import com.intellij.testFramework.TestDataPath

@TestDataPath("${'$'}PROJECT_ROOT/src/test/testData/lexer")
class IdrLexerTest : LexerTestCase() {
    override fun createLexer(): Lexer = IdrLexer()

    override fun getDirPath(): String = error("Must not use that")

    override fun getPathToTestDataFile(extension: String?): String {
        return "src/test/testData/lexer/" + getTestName(true) + extension
    }

    private fun doTest() = doFileTest("idr")

    @Suppress("unused")
    fun xtestList() = doTest()

    fun testComment() = doTest()

    fun testSimpleDeclarations() = doTest()

    fun testSimpleOperatorExpression() = doTest()

    fun testLiterals() = doTest()

    fun testInnerIf() = doTest()
}