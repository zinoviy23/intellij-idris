package com.github.zinoviy23.intellijIdris.parser

import com.github.zinoviy23.intellijIdris.lang.parser.IdrParserDefinition
import com.intellij.testFramework.ParsingTestCase

class IdrFileParserTest : ParsingTestCase("parser", "idr", true, IdrParserDefinition()) {
    fun testWithSimpleFunction() = doTest(true)

    fun testWithFunctionCall() = doTest(true)

    fun testWithIfExpressionInTypeSpec() = doTest(true)

    override fun getTestDataPath() = "src/test/testData"
}