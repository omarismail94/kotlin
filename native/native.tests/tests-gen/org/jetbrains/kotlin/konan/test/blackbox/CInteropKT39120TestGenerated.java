/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/CInterop/KT-39120/defs")
@TestDataPath("$PROJECT_ROOT")
public class CInteropKT39120TestGenerated extends AbstractNativeCInteropKT39120Test {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInDefs() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CInterop/KT-39120/defs"), Pattern.compile("^([^_](.+))$"), null, false);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ForwardEnum")
  public void testForwardEnum() {
    runTest("native/native.tests/testData/CInterop/KT-39120/defs/ForwardEnum/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("interModuleImport")
  public void testInterModuleImport() {
    runTest("native/native.tests/testData/CInterop/KT-39120/defs/interModuleImport/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("KT-39120")
  public void testKT_39120() {
    runTest("native/native.tests/testData/CInterop/KT-39120/defs/KT-39120/");
  }
}
