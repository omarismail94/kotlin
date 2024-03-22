/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/multiModuleOrder")
@TestDataPath("$PROJECT_ROOT")
public class FirMultiModuleOrderTestGenerated extends AbstractFirMultiModuleOrderTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInMultiModuleOrder() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/multiModuleOrder"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("plain.kt")
  public void testPlain() {
    runTest("js/js.translator/testData/multiModuleOrder/plain.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("umd.kt")
  public void testUmd() {
    runTest("js/js.translator/testData/multiModuleOrder/umd.kt");
  }
}
