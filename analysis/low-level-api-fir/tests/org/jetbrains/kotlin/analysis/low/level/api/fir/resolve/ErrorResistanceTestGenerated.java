/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/errorResistance")
@TestDataPath("$PROJECT_ROOT")
public class ErrorResistanceTestGenerated extends AbstractErrorResistanceTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInErrorResistance() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/errorResistance"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("builderInference.kt")
  public void testBuilderInference() {
    runTest("analysis/low-level-api-fir/testData/errorResistance/builderInference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDelegate.kt")
  public void testPropertyDelegate() {
    runTest("analysis/low-level-api-fir/testData/errorResistance/propertyDelegate.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyInitializer.kt")
  public void testPropertyInitializer() {
    runTest("analysis/low-level-api-fir/testData/errorResistance/propertyInitializer.kt");
  }
}
