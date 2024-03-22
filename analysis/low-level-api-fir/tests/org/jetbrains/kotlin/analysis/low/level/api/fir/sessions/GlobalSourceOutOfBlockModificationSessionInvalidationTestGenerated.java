/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.sessions;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/sessionInvalidation")
@TestDataPath("$PROJECT_ROOT")
public class GlobalSourceOutOfBlockModificationSessionInvalidationTestGenerated extends AbstractGlobalSourceOutOfBlockModificationSessionInvalidationTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInSessionInvalidation() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/sessionInvalidation"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeAdditionalEdge.kt")
  public void testBinaryTreeAdditionalEdge() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeAdditionalEdge.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateA.kt")
  public void testBinaryTreeInvalidateA() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateA.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateCD.kt")
  public void testBinaryTreeInvalidateCD() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateCD.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateF.kt")
  public void testBinaryTreeInvalidateF() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateF.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateL1.kt")
  public void testBinaryTreeInvalidateL1() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateL1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateL2.kt")
  public void testBinaryTreeInvalidateL2() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateL2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryTreeInvalidateNone.kt")
  public void testBinaryTreeInvalidateNone() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/binaryTreeInvalidateNone.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("linearInvalidateC.kt")
  public void testLinearInvalidateC() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/linearInvalidateC.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("linearInvalidateL1.kt")
  public void testLinearInvalidateL1() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/linearInvalidateL1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("rhombusInvalidateBC.kt")
  public void testRhombusInvalidateBC() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/rhombusInvalidateBC.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("rhombusInvalidateCD.kt")
  public void testRhombusInvalidateCD() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/rhombusInvalidateCD.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("rhombusInvalidateD.kt")
  public void testRhombusInvalidateD() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/rhombusInvalidateD.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("rhombusInvalidateL1.kt")
  public void testRhombusInvalidateL1() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/rhombusInvalidateL1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("rhombusInvalidateL2.kt")
  public void testRhombusInvalidateL2() {
    runTest("analysis/low-level-api-fir/testData/sessionInvalidation/rhombusInvalidateL2.kt");
  }
}
