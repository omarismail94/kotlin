/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/incremental/invalidationWithPL")
@TestDataPath("$PROJECT_ROOT")
public class JsIrInvalidationPerFileWithPLTestGenerated extends AbstractJsIrInvalidationPerFileWithPLTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInInvalidationWithPL() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/incremental/invalidationWithPL"), Pattern.compile("^([^_](.+))$"), null, TargetBackend.JS_IR, false);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("changeFunctionSignature")
  public void testChangeFunctionSignature() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/changeFunctionSignature/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("interfaceBecomeClass")
  public void testInterfaceBecomeClass() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/interfaceBecomeClass/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeFunction")
  public void testRemoveFunction() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunction/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeFunctionFromBlock")
  public void testRemoveFunctionFromBlock() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromBlock/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeFunctionFromChainCall")
  public void testRemoveFunctionFromChainCall() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromChainCall/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeFunctionFromElvis")
  public void testRemoveFunctionFromElvis() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromElvis/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeFunctionFromInline")
  public void testRemoveFunctionFromInline() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromInline/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("removeInlineFunction")
  public void testRemoveInlineFunction() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeInlineFunction/");
  }
}
