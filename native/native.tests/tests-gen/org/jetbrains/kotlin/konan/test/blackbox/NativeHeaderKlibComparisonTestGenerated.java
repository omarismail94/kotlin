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
@TestMetadata("native/native.tests/testData/klib/header-klibs/comparison")
@TestDataPath("$PROJECT_ROOT")
public class NativeHeaderKlibComparisonTestGenerated extends AbstractNativeHeaderKlibComparisonTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInComparison() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/header-klibs/comparison"), Pattern.compile("^([^\\.]+)$"), null, false);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousObjects")
  public void testAnonymousObjects() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/anonymousObjects/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classFlags")
  public void testClassFlags() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/classFlags/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classPrivateMembers")
  public void testClassPrivateMembers() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/classPrivateMembers/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constant")
  public void testConstant() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/constant/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("declarationOrderInline")
  public void testDeclarationOrderInline() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/declarationOrderInline/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionBody")
  public void testFunctionBody() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/functionBody/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineFunInPrivateClass")
  public void testInlineFunInPrivateClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateClass/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineFunInPrivateNestedClass")
  public void testInlineFunInPrivateNestedClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateNestedClass/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineFunctionBody")
  public void testInlineFunctionBody() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunctionBody/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdas")
  public void testLambdas() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/lambdas/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("parameterName")
  public void testParameterName() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/parameterName/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("privateInterface")
  public void testPrivateInterface() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/privateInterface/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("privateTypealias")
  public void testPrivateTypealias() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/privateTypealias/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnType")
  public void testReturnType() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/returnType/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superClass")
  public void testSuperClass() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/superClass/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("syntheticAccessors")
  public void testSyntheticAccessors() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/syntheticAccessors/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelPrivateMembers")
  public void testTopLevelPrivateMembers() {
    runTest("native/native.tests/testData/klib/header-klibs/comparison/topLevelPrivateMembers/");
  }
}
