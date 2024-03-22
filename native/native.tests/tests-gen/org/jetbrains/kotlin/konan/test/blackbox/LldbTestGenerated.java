/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.konan.test.blackbox.support.EnforcedProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.ClassLevelProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.EnforcedHostTarget;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/lldb")
@TestDataPath("$PROJECT_ROOT")
@Tag("debugger")
@UseStandardTestCaseGroupProvider()
@EnforcedProperty(property = ClassLevelProperty.OPTIMIZATION_MODE, propertyValue = "DEBUG")
@EnforcedHostTarget()
public class LldbTestGenerated extends AbstractNativeBlackBoxTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInLldb() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/lldb"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectArrayChildren.kt")
  public void testCanInspectArrayChildren() {
    runTest("native/native.tests/testData/lldb/canInspectArrayChildren.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectArrays.kt")
  public void testCanInspectArrays() {
    runTest("native/native.tests/testData/lldb/canInspectArrays.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectCatchParameter.kt")
  public void testCanInspectCatchParameter() {
    runTest("native/native.tests/testData/lldb/canInspectCatchParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectClasses.kt")
  public void testCanInspectClasses() {
    runTest("native/native.tests/testData/lldb/canInspectClasses.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectStrings.kt")
  public void testCanInspectStrings() {
    runTest("native/native.tests/testData/lldb/canInspectStrings.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canInspectValuesOfPrimitiveTypes.kt")
  public void testCanInspectValuesOfPrimitiveTypes() {
    runTest("native/native.tests/testData/lldb/canInspectValuesOfPrimitiveTypes.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("canStepThroughCode.kt")
  public void testCanStepThroughCode() {
    runTest("native/native.tests/testData/lldb/canStepThroughCode.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt33055.kt")
  public void testKt33055() {
    runTest("native/native.tests/testData/lldb/kt33055.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt33364.kt")
  public void testKt33364() {
    runTest("native/native.tests/testData/lldb/kt33364.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208.kt")
  public void testKt42208() {
    runTest("native/native.tests/testData/lldb/kt42208.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208WithPassingLambdaToAnotherFunction.kt")
  public void testKt42208WithPassingLambdaToAnotherFunction() {
    runTest("native/native.tests/testData/lldb/kt42208WithPassingLambdaToAnotherFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt42208WithVariable.kt")
  public void testKt42208WithVariable() {
    runTest("native/native.tests/testData/lldb/kt42208WithVariable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt47198.kt")
  public void testKt47198() {
    runTest("native/native.tests/testData/lldb/kt47198.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt47198WithBody.kt")
  public void testKt47198WithBody() {
    runTest("native/native.tests/testData/lldb/kt47198WithBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt61131.kt")
  public void testKt61131() {
    runTest("native/native.tests/testData/lldb/kt61131.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stepThroughInlineArguments.kt")
  public void testStepThroughInlineArguments() {
    runTest("native/native.tests/testData/lldb/stepThroughInlineArguments.kt");
  }
}
