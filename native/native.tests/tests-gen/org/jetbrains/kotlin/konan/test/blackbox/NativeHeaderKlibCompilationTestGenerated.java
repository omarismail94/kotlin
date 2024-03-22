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
@TestMetadata("native/native.tests/testData/klib/header-klibs/compilation")
@TestDataPath("$PROJECT_ROOT")
public class NativeHeaderKlibCompilationTestGenerated extends AbstractNativeHeaderKlibCompilationTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInCompilation() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/header-klibs/compilation"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousObject")
  public void testAnonymousObject() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/anonymousObject/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classes")
  public void testClasses() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/classes/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("clinit")
  public void testClinit() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/clinit/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineAnnotationInstantiation")
  public void testInlineAnnotationInstantiation() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineAnnotationInstantiation/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineAnonymousObject")
  public void testInlineAnonymousObject() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineAnonymousObject/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineCapture")
  public void testInlineCapture() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineCapture/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineNoRegeneration")
  public void testInlineNoRegeneration() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineNoRegeneration/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineReifiedFunction")
  public void testInlineReifiedFunction() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineReifiedFunction/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineWhenMappings")
  public void testInlineWhenMappings() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/inlineWhenMappings/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("innerObjectRegeneration")
  public void testInnerObjectRegeneration() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/innerObjectRegeneration/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kt-40133")
  public void testKt_40133() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/kt-40133/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("privateOnlyConstructors")
  public void testPrivateOnlyConstructors() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/privateOnlyConstructors/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("privateValueClassConstructor")
  public void testPrivateValueClassConstructor() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/privateValueClassConstructor/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevel")
  public void testTopLevel() {
    runTest("native/native.tests/testData/klib/header-klibs/compilation/topLevel/");
  }
}
