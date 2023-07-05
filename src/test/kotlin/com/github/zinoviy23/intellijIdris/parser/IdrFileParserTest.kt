package com.github.zinoviy23.intellijIdris.parser

import com.github.zinoviy23.intellijIdris.lang.parser.IdrParserDefinition
import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath

@TestDataPath("${'$'}PROJECT_ROOT/src/test/testData/parser")
class IdrFileParserTest : ParsingTestCase("parser", "idr", true, IdrParserDefinition()) {
    fun testWithSimpleFunction() = doTest(true)

    fun testWithFunctionCall() = doTest(true)

    fun testWithIfExpressionInTypeSpec() = doTest(true)

    fun testImportsAndDirectives() = doTest(true)

    fun testFunctionWithTupleParameter() = doTest(true)

    fun testSimpleOperatorExpression() = doTest(true)

    fun testLiterals() = doTest(true)

    fun testHighLevelFunctionTypeSpecification() = doTest(true)

    fun testInnerIf() = doTest(true)

    fun testInnerIfWithWhitespaces() {
        doCodeTest(
            """
                c : Bool -> Bool -> Int
                c f1 f2 = if
                        f1
                        then
                        if
                        f2
                        then
                        10
                        else
                        13
                        else
                        
                        12
            """.trimIndent()
        )
    }

    fun testDataWithSpaces() = doTest(true)

    fun testWeirdIndentationExpression() = doTest(true)

    fun testLetWithManyBindings() = doTest(true)

    fun testFunctionWithWhere() = doTest(true)

    fun testRecord() = doTest(true)

    fun testImplementation() = doTest(true)

    fun testImplementationImpossible() = doTest(true)

    override fun getTestDataPath() = "src/test/testData"
}