/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/lineNumbers")
@TestDataPath("$PROJECT_ROOT")
public class FirJsLineNumberTestGenerated extends AbstractFirJsLineNumberTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInLineNumbers() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/lineNumbers"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("andAndWithSideEffect.kt")
  public void testAndAndWithSideEffect() {
    runTest("js/js.translator/testData/lineNumbers/andAndWithSideEffect.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("backingField.kt")
  public void testBackingField() {
    runTest("js/js.translator/testData/lineNumbers/backingField.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("catch.kt")
  public void testCatch() {
    runTest("js/js.translator/testData/lineNumbers/catch.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("chainedCall.kt")
  public void testChainedCall() {
    runTest("js/js.translator/testData/lineNumbers/chainedCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classCapturingLocals.kt")
  public void testClassCapturingLocals() {
    runTest("js/js.translator/testData/lineNumbers/classCapturingLocals.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("closure.kt")
  public void testClosure() {
    runTest("js/js.translator/testData/lineNumbers/closure.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("complexExpressionAsDefaultArgument.kt")
  public void testComplexExpressionAsDefaultArgument() {
    runTest("js/js.translator/testData/lineNumbers/complexExpressionAsDefaultArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("conditionalDecomposed.kt")
  public void testConditionalDecomposed() {
    runTest("js/js.translator/testData/lineNumbers/conditionalDecomposed.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("coroutine.kt")
  public void testCoroutine() {
    runTest("js/js.translator/testData/lineNumbers/coroutine.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("coroutineNullAssertion.kt")
  public void testCoroutineNullAssertion() {
    runTest("js/js.translator/testData/lineNumbers/coroutineNullAssertion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("dataClass.kt")
  public void testDataClass() {
    runTest("js/js.translator/testData/lineNumbers/dataClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateMemberVal.kt")
  public void testDelegateMemberVal() {
    runTest("js/js.translator/testData/lineNumbers/delegateMemberVal.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegatedProperty.kt")
  public void testDelegatedProperty() {
    runTest("js/js.translator/testData/lineNumbers/delegatedProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegation.kt")
  public void testDelegation() {
    runTest("js/js.translator/testData/lineNumbers/delegation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("destructuring.kt")
  public void testDestructuring() {
    runTest("js/js.translator/testData/lineNumbers/destructuring.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("destructuringInline.kt")
  public void testDestructuringInline() {
    runTest("js/js.translator/testData/lineNumbers/destructuringInline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("doWhileWithComplexCondition.kt")
  public void testDoWhileWithComplexCondition() {
    runTest("js/js.translator/testData/lineNumbers/doWhileWithComplexCondition.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("elvis.kt")
  public void testElvis() {
    runTest("js/js.translator/testData/lineNumbers/elvis.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumCompanionObject.kt")
  public void testEnumCompanionObject() {
    runTest("js/js.translator/testData/lineNumbers/enumCompanionObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumObject.kt")
  public void testEnumObject() {
    runTest("js/js.translator/testData/lineNumbers/enumObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("expressionAsFunctionBody.kt")
  public void testExpressionAsFunctionBody() {
    runTest("js/js.translator/testData/lineNumbers/expressionAsFunctionBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("for.kt")
  public void testFor() {
    runTest("js/js.translator/testData/lineNumbers/for.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("increment.kt")
  public void testIncrement() {
    runTest("js/js.translator/testData/lineNumbers/increment.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineArguments.kt")
  public void testInlineArguments() {
    runTest("js/js.translator/testData/lineNumbers/inlineArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineLocalVarsRef.kt")
  public void testInlineLocalVarsRef() {
    runTest("js/js.translator/testData/lineNumbers/inlineLocalVarsRef.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineReturn.kt")
  public void testInlineReturn() {
    runTest("js/js.translator/testData/lineNumbers/inlineReturn.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlining.kt")
  public void testInlining() {
    runTest("js/js.translator/testData/lineNumbers/inlining.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inliningWithLambda.kt")
  public void testInliningWithLambda() {
    runTest("js/js.translator/testData/lineNumbers/inliningWithLambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("innerClass.kt")
  public void testInnerClass() {
    runTest("js/js.translator/testData/lineNumbers/innerClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("isOperator.kt")
  public void testIsOperator() {
    runTest("js/js.translator/testData/lineNumbers/isOperator.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("jsCode.kt")
  public void testJsCode() {
    runTest("js/js.translator/testData/lineNumbers/jsCode.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaWithClosure.kt")
  public void testLambdaWithClosure() {
    runTest("js/js.translator/testData/lineNumbers/lambdaWithClosure.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastExpressionInInlineLambda.kt")
  public void testLastExpressionInInlineLambda() {
    runTest("js/js.translator/testData/lineNumbers/lastExpressionInInlineLambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("literals.kt")
  public void testLiterals() {
    runTest("js/js.translator/testData/lineNumbers/literals.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("longLiteral.kt")
  public void testLongLiteral() {
    runTest("js/js.translator/testData/lineNumbers/longLiteral.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberFunWithDefaultParam.kt")
  public void testMemberFunWithDefaultParam() {
    runTest("js/js.translator/testData/lineNumbers/memberFunWithDefaultParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multipleReferences.kt")
  public void testMultipleReferences() {
    runTest("js/js.translator/testData/lineNumbers/multipleReferences.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objectInstanceFunction.kt")
  public void testObjectInstanceFunction() {
    runTest("js/js.translator/testData/lineNumbers/objectInstanceFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("optionalArgs.kt")
  public void testOptionalArgs() {
    runTest("js/js.translator/testData/lineNumbers/optionalArgs.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithoutInitializer.kt")
  public void testPropertyWithoutInitializer() {
    runTest("js/js.translator/testData/lineNumbers/propertyWithoutInitializer.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("js/js.translator/testData/lineNumbers/simple.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stringLiteral.kt")
  public void testStringLiteral() {
    runTest("js/js.translator/testData/lineNumbers/stringLiteral.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("syntheticCodeInConstructors.kt")
  public void testSyntheticCodeInConstructors() {
    runTest("js/js.translator/testData/lineNumbers/syntheticCodeInConstructors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("syntheticCodeInEnums.kt")
  public void testSyntheticCodeInEnums() {
    runTest("js/js.translator/testData/lineNumbers/syntheticCodeInEnums.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("valParameter.kt")
  public void testValParameter() {
    runTest("js/js.translator/testData/lineNumbers/valParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenEntryWithMultipleConditions.kt")
  public void testWhenEntryWithMultipleConditions() {
    runTest("js/js.translator/testData/lineNumbers/whenEntryWithMultipleConditions.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenEntryWithMultipleConditionsNonOptimized.kt")
  public void testWhenEntryWithMultipleConditionsNonOptimized() {
    runTest("js/js.translator/testData/lineNumbers/whenEntryWithMultipleConditionsNonOptimized.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenIn.kt")
  public void testWhenIn() {
    runTest("js/js.translator/testData/lineNumbers/whenIn.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whenIs.kt")
  public void testWhenIs() {
    runTest("js/js.translator/testData/lineNumbers/whenIs.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whileWithComplexCondition.kt")
  public void testWhileWithComplexCondition() {
    runTest("js/js.translator/testData/lineNumbers/whileWithComplexCondition.kt");
  }

  @Nested
  @TestMetadata("js/js.translator/testData/lineNumbers/inlineMultiModule")
  @TestDataPath("$PROJECT_ROOT")
  public class InlineMultiModule {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInInlineMultiModule() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/lineNumbers/inlineMultiModule"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("js/js.translator/testData/lineNumbers/inlineMultiModule/simple.kt");
    }
  }
}
