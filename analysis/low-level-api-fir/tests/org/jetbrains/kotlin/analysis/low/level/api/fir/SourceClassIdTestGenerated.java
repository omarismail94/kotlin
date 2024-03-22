/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/classId")
@TestDataPath("$PROJECT_ROOT")
public class SourceClassIdTestGenerated extends AbstractSourceClassIdTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInClassId() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/classId"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classWithMembers.kt")
  public void testClassWithMembers() {
    runTest("analysis/low-level-api-fir/testData/classId/classWithMembers.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enum.kt")
  public void testEnum() {
    runTest("analysis/low-level-api-fir/testData/classId/enum.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumEntry.kt")
  public void testEnumEntry() {
    runTest("analysis/low-level-api-fir/testData/classId/enumEntry.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("invalidForJvmClassName.kt")
  public void testInvalidForJvmClassName() {
    runTest("analysis/low-level-api-fir/testData/classId/invalidForJvmClassName.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassInsideAnnotationArgument.kt")
  public void testLocalClassInsideAnnotationArgument() {
    runTest("analysis/low-level-api-fir/testData/classId/localClassInsideAnnotationArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassInsideFunctionLiteral.kt")
  public void testLocalClassInsideFunctionLiteral() {
    runTest("analysis/low-level-api-fir/testData/classId/localClassInsideFunctionLiteral.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassInsideLambdaCallInsideStringTemplate.kt")
  public void testLocalClassInsideLambdaCallInsideStringTemplate() {
    runTest("analysis/low-level-api-fir/testData/classId/localClassInsideLambdaCallInsideStringTemplate.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassInsideSuperEntryCall.kt")
  public void testLocalClassInsideSuperEntryCall() {
    runTest("analysis/low-level-api-fir/testData/classId/localClassInsideSuperEntryCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassInsideUnclosedAnnotation.kt")
  public void testLocalClassInsideUnclosedAnnotation() {
    runTest("analysis/low-level-api-fir/testData/classId/localClassInsideUnclosedAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("namelessClasses.kt")
  public void testNamelessClasses() {
    runTest("analysis/low-level-api-fir/testData/classId/namelessClasses.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("namelessInsideNamelessClasses.kt")
  public void testNamelessInsideNamelessClasses() {
    runTest("analysis/low-level-api-fir/testData/classId/namelessInsideNamelessClasses.kt");
  }
}
