/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.codegen.inlineScopes;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/stepping")
@TestDataPath("$PROJECT_ROOT")
public class FirSteppingWithBytecodeInlinerTestWithInlineScopesGenerated extends AbstractFirSteppingWithBytecodeInlinerTestWithInlineScopes {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInStepping() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/stepping"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousFunction.kt")
  public void testAnonymousFunction() {
    runTest("compiler/testData/debug/stepping/anonymousFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousFunctionDirect.kt")
  public void testAnonymousFunctionDirect() {
    runTest("compiler/testData/debug/stepping/anonymousFunctionDirect.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("assertion.kt")
  public void testAssertion() {
    runTest("compiler/testData/debug/stepping/assertion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("beforeGotoToWhileStart.kt")
  public void testBeforeGotoToWhileStart() {
    runTest("compiler/testData/debug/stepping/beforeGotoToWhileStart.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callWithCallInArguments.kt")
  public void testCallWithCallInArguments() {
    runTest("compiler/testData/debug/stepping/callWithCallInArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callWithReceiver.kt")
  public void testCallWithReceiver() {
    runTest("compiler/testData/debug/stepping/callWithReceiver.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callableReference.kt")
  public void testCallableReference() {
    runTest("compiler/testData/debug/stepping/callableReference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("chainCall.kt")
  public void testChainCall() {
    runTest("compiler/testData/debug/stepping/chainCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("compiler/testData/debug/stepping/class.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classObject.kt")
  public void testClassObject() {
    runTest("compiler/testData/debug/stepping/classObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("closingBracketOfCrossinlineInsideCrossinline.kt")
  public void testClosingBracketOfCrossinlineInsideCrossinline() {
    runTest("compiler/testData/debug/stepping/closingBracketOfCrossinlineInsideCrossinline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("closingBracketOfLambdaOfInlineOnlyFunction.kt")
  public void testClosingBracketOfLambdaOfInlineOnlyFunction() {
    runTest("compiler/testData/debug/stepping/closingBracketOfLambdaOfInlineOnlyFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("closingBracketOfObjectInsideCrossinline.kt")
  public void testClosingBracketOfObjectInsideCrossinline() {
    runTest("compiler/testData/debug/stepping/closingBracketOfObjectInsideCrossinline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("commentBeforeClass.kt")
  public void testCommentBeforeClass() {
    runTest("compiler/testData/debug/stepping/commentBeforeClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("commentBeforeCompanionProperty.kt")
  public void testCommentBeforeCompanionProperty() {
    runTest("compiler/testData/debug/stepping/commentBeforeCompanionProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("commentBeforeFunctionWithDefault.kt")
  public void testCommentBeforeFunctionWithDefault() {
    runTest("compiler/testData/debug/stepping/commentBeforeFunctionWithDefault.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("comments.kt")
  public void testComments() {
    runTest("compiler/testData/debug/stepping/comments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("compileTimeConstant.kt")
  public void testCompileTimeConstant() {
    runTest("compiler/testData/debug/stepping/compileTimeConstant.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("conjunction.kt")
  public void testConjunction() {
    runTest("compiler/testData/debug/stepping/conjunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constantConditions.kt")
  public void testConstantConditions() {
    runTest("compiler/testData/debug/stepping/constantConditions.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorCall.kt")
  public void testConstructorCall() {
    runTest("compiler/testData/debug/stepping/constructorCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructors.kt")
  public void testConstructors() {
    runTest("compiler/testData/debug/stepping/constructors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("continue.kt")
  public void testContinue() {
    runTest("compiler/testData/debug/stepping/continue.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("dataClass.kt")
  public void testDataClass() {
    runTest("compiler/testData/debug/stepping/dataClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("defaultParameter.kt")
  public void testDefaultParameter() {
    runTest("compiler/testData/debug/stepping/defaultParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegation.kt")
  public void testDelegation() {
    runTest("compiler/testData/debug/stepping/delegation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enum.kt")
  public void testEnum() {
    runTest("compiler/testData/debug/stepping/enum.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("for.kt")
  public void testFor() {
    runTest("compiler/testData/debug/stepping/for.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionCallWithDefault.kt")
  public void testFunctionCallWithDefault() {
    runTest("compiler/testData/debug/stepping/functionCallWithDefault.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionCallWithInlinedLambdaParam.kt")
  public void testFunctionCallWithInlinedLambdaParam() {
    runTest("compiler/testData/debug/stepping/functionCallWithInlinedLambdaParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionCallWithLambdaParam.kt")
  public void testFunctionCallWithLambdaParam() {
    runTest("compiler/testData/debug/stepping/functionCallWithLambdaParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionInAnotherFile.kt")
  public void testFunctionInAnotherFile() {
    runTest("compiler/testData/debug/stepping/functionInAnotherFile.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("if.kt")
  public void testIf() {
    runTest("compiler/testData/debug/stepping/if.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("if2.kt")
  public void testIf2() {
    runTest("compiler/testData/debug/stepping/if2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifThen.kt")
  public void testIfThen() {
    runTest("compiler/testData/debug/stepping/ifThen.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifThenElse.kt")
  public void testIfThenElse() {
    runTest("compiler/testData/debug/stepping/ifThenElse.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifThenElseFalse.kt")
  public void testIfThenElseFalse() {
    runTest("compiler/testData/debug/stepping/ifThenElseFalse.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("IfTrueThenFalse.kt")
  public void testIfTrueThenFalse() {
    runTest("compiler/testData/debug/stepping/IfTrueThenFalse.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifWithInlineInCondition.kt")
  public void testIfWithInlineInCondition() {
    runTest("compiler/testData/debug/stepping/ifWithInlineInCondition.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("iincStepping.kt")
  public void testIincStepping() {
    runTest("compiler/testData/debug/stepping/iincStepping.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("implicitThis.kt")
  public void testImplicitThis() {
    runTest("compiler/testData/debug/stepping/implicitThis.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("implicitThisOnInvoke.kt")
  public void testImplicitThisOnInvoke() {
    runTest("compiler/testData/debug/stepping/implicitThisOnInvoke.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inTheEndOfLambdaArgumentOfInlineCall.kt")
  public void testInTheEndOfLambdaArgumentOfInlineCall() {
    runTest("compiler/testData/debug/stepping/inTheEndOfLambdaArgumentOfInlineCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("initBlocks.kt")
  public void testInitBlocks() {
    runTest("compiler/testData/debug/stepping/initBlocks.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("initBlocksCompanion.kt")
  public void testInitBlocksCompanion() {
    runTest("compiler/testData/debug/stepping/initBlocksCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineCallableReference.kt")
  public void testInlineCallableReference() {
    runTest("compiler/testData/debug/stepping/inlineCallableReference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineNamedCallableReference.kt")
  public void testInlineNamedCallableReference() {
    runTest("compiler/testData/debug/stepping/inlineNamedCallableReference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineSimpleCall.kt")
  public void testInlineSimpleCall() {
    runTest("compiler/testData/debug/stepping/inlineSimpleCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaSam.kt")
  public void testJavaSam() {
    runTest("compiler/testData/debug/stepping/javaSam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt15259.kt")
  public void testKt15259() {
    runTest("compiler/testData/debug/stepping/kt15259.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt29179.kt")
  public void testKt29179() {
    runTest("compiler/testData/debug/stepping/kt29179.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208.kt")
  public void testKt42208() {
    runTest("compiler/testData/debug/stepping/kt42208.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208b.kt")
  public void testKt42208b() {
    runTest("compiler/testData/debug/stepping/kt42208b.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208c.kt")
  public void testKt42208c() {
    runTest("compiler/testData/debug/stepping/kt42208c.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaStepInline.kt")
  public void testLambdaStepInline() {
    runTest("compiler/testData/debug/stepping/lambdaStepInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaStepInlineWithDefaults.kt")
  public void testLambdaStepInlineWithDefaults() {
    runTest("compiler/testData/debug/stepping/lambdaStepInlineWithDefaults.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lineNumberAfterInline.kt")
  public void testLineNumberAfterInline() {
    runTest("compiler/testData/debug/stepping/lineNumberAfterInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("linenumberForOneParametersArgumentCall.kt")
  public void testLinenumberForOneParametersArgumentCall() {
    runTest("compiler/testData/debug/stepping/linenumberForOneParametersArgumentCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFunction.kt")
  public void testLocalFunction() {
    runTest("compiler/testData/debug/stepping/localFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFunctionWIthOnelineExpressionBody.kt")
  public void testLocalFunctionWIthOnelineExpressionBody() {
    runTest("compiler/testData/debug/stepping/localFunctionWIthOnelineExpressionBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localProperty.kt")
  public void testLocalProperty() {
    runTest("compiler/testData/debug/stepping/localProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multiModule.kt")
  public void testMultiModule() {
    runTest("compiler/testData/debug/stepping/multiModule.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multilineExpression.kt")
  public void testMultilineExpression() {
    runTest("compiler/testData/debug/stepping/multilineExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multilineFunctionCall.kt")
  public void testMultilineFunctionCall() {
    runTest("compiler/testData/debug/stepping/multilineFunctionCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multilineInfixCall.kt")
  public void testMultilineInfixCall() {
    runTest("compiler/testData/debug/stepping/multilineInfixCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("namedCallableReference.kt")
  public void testNamedCallableReference() {
    runTest("compiler/testData/debug/stepping/namedCallableReference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedInline.kt")
  public void testNestedInline() {
    runTest("compiler/testData/debug/stepping/nestedInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("noLinenumberInInvokeOfSuspendLambda.kt")
  public void testNoLinenumberInInvokeOfSuspendLambda() {
    runTest("compiler/testData/debug/stepping/noLinenumberInInvokeOfSuspendLambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("noParametersArgumentCallInExpression.kt")
  public void testNoParametersArgumentCallInExpression() {
    runTest("compiler/testData/debug/stepping/noParametersArgumentCallInExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nullcheck.kt")
  public void testNullcheck() {
    runTest("compiler/testData/debug/stepping/nullcheck.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("overridenGetterSetter.kt")
  public void testOverridenGetterSetter() {
    runTest("compiler/testData/debug/stepping/overridenGetterSetter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("primitiveNullChecks.kt")
  public void testPrimitiveNullChecks() {
    runTest("compiler/testData/debug/stepping/primitiveNullChecks.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyAccessor.kt")
  public void testPropertyAccessor() {
    runTest("compiler/testData/debug/stepping/propertyAccessor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("psvm.kt")
  public void testPsvm() {
    runTest("compiler/testData/debug/stepping/psvm.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("recursion.kt")
  public void testRecursion() {
    runTest("compiler/testData/debug/stepping/recursion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("simpleDefaultArg.kt")
  public void testSimpleDefaultArg() {
    runTest("compiler/testData/debug/stepping/simpleDefaultArg.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("simpleDefaultArgWithInline.kt")
  public void testSimpleDefaultArgWithInline() {
    runTest("compiler/testData/debug/stepping/simpleDefaultArgWithInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("simpleInlineDefaultArg.kt")
  public void testSimpleInlineDefaultArg() {
    runTest("compiler/testData/debug/stepping/simpleInlineDefaultArg.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("simpleSmap.kt")
  public void testSimpleSmap() {
    runTest("compiler/testData/debug/stepping/simpleSmap.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smapInlineAsArgument.kt")
  public void testSmapInlineAsArgument() {
    runTest("compiler/testData/debug/stepping/smapInlineAsArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smapInlineAsInfixArgument.kt")
  public void testSmapInlineAsInfixArgument() {
    runTest("compiler/testData/debug/stepping/smapInlineAsInfixArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smapInlineAsInlineArgument.kt")
  public void testSmapInlineAsInlineArgument() {
    runTest("compiler/testData/debug/stepping/smapInlineAsInlineArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smapInlineInIntrinsicArgument.kt")
  public void testSmapInlineInIntrinsicArgument() {
    runTest("compiler/testData/debug/stepping/smapInlineInIntrinsicArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stringSwitches.kt")
  public void testStringSwitches() {
    runTest("compiler/testData/debug/stepping/stringSwitches.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stringSwitchesSmall.kt")
  public void testStringSwitchesSmall() {
    runTest("compiler/testData/debug/stepping/stringSwitchesSmall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("suspendFunWithLambdaParameter.kt")
  public void testSuspendFunWithLambdaParameter() {
    runTest("compiler/testData/debug/stepping/suspendFunWithLambdaParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("suspendFunWithSuspendLambdaParameter.kt")
  public void testSuspendFunWithSuspendLambdaParameter() {
    runTest("compiler/testData/debug/stepping/suspendFunWithSuspendLambdaParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("throwException.kt")
  public void testThrowException() {
    runTest("compiler/testData/debug/stepping/throwException.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevel.kt")
  public void testTopLevel() {
    runTest("compiler/testData/debug/stepping/topLevel.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("trait.kt")
  public void testTrait() {
    runTest("compiler/testData/debug/stepping/trait.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryCatch.kt")
  public void testTryCatch() {
    runTest("compiler/testData/debug/stepping/tryCatch.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryCatchExpression.kt")
  public void testTryCatchExpression() {
    runTest("compiler/testData/debug/stepping/tryCatchExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryCatchFinally.kt")
  public void testTryCatchFinally() {
    runTest("compiler/testData/debug/stepping/tryCatchFinally.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally.kt")
  public void testTryFinally() {
    runTest("compiler/testData/debug/stepping/tryFinally.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("variablesWithoutInitializer.kt")
  public void testVariablesWithoutInitializer() {
    runTest("compiler/testData/debug/stepping/variablesWithoutInitializer.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("voidLambdaStepInline.kt")
  public void testVoidLambdaStepInline() {
    runTest("compiler/testData/debug/stepping/voidLambdaStepInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("when.kt")
  public void testWhen() {
    runTest("compiler/testData/debug/stepping/when.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenComplicatedSubject.kt")
  public void testWhenComplicatedSubject() {
    runTest("compiler/testData/debug/stepping/whenComplicatedSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenConstant.kt")
  public void testWhenConstant() {
    runTest("compiler/testData/debug/stepping/whenConstant.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenExpr.kt")
  public void testWhenExpr() {
    runTest("compiler/testData/debug/stepping/whenExpr.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInConjunction.kt")
  public void testWhenInConjunction() {
    runTest("compiler/testData/debug/stepping/whenInConjunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInDisjunction.kt")
  public void testWhenInDisjunction() {
    runTest("compiler/testData/debug/stepping/whenInDisjunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInGeneralObjectComparison.kt")
  public void testWhenInGeneralObjectComparison() {
    runTest("compiler/testData/debug/stepping/whenInGeneralObjectComparison.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInNegation.kt")
  public void testWhenInNegation() {
    runTest("compiler/testData/debug/stepping/whenInNegation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInNullComparison.kt")
  public void testWhenInNullComparison() {
    runTest("compiler/testData/debug/stepping/whenInNullComparison.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInPrimitiveToObjectComparison.kt")
  public void testWhenInPrimitiveToObjectComparison() {
    runTest("compiler/testData/debug/stepping/whenInPrimitiveToObjectComparison.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenInZeroComparison.kt")
  public void testWhenInZeroComparison() {
    runTest("compiler/testData/debug/stepping/whenInZeroComparison.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenIsChecks.kt")
  public void testWhenIsChecks() {
    runTest("compiler/testData/debug/stepping/whenIsChecks.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenMultiLine.kt")
  public void testWhenMultiLine() {
    runTest("compiler/testData/debug/stepping/whenMultiLine.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenMultiLineSubject.kt")
  public void testWhenMultiLineSubject() {
    runTest("compiler/testData/debug/stepping/whenMultiLineSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenNullalbeSubject.kt")
  public void testWhenNullalbeSubject() {
    runTest("compiler/testData/debug/stepping/whenNullalbeSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenSubject.kt")
  public void testWhenSubject() {
    runTest("compiler/testData/debug/stepping/whenSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenSubject2.kt")
  public void testWhenSubject2() {
    runTest("compiler/testData/debug/stepping/whenSubject2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenWithInlineInCondition.kt")
  public void testWhenWithInlineInCondition() {
    runTest("compiler/testData/debug/stepping/whenWithInlineInCondition.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("while.kt")
  public void testWhile() {
    runTest("compiler/testData/debug/stepping/while.kt");
  }
}
