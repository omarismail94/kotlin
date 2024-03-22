/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/gc")
@TestDataPath("$PROJECT_ROOT")
@Tag("gc")
@UseStandardTestCaseGroupProvider()
public class NativeGCTestGenerated extends AbstractNativeBlackBoxTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInGc() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/gc"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("basic0.kt")
  public void testBasic0() {
    runTest("native/native.tests/testData/gc/basic0.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cleaner_basic.kt")
  public void testCleaner_basic() {
    runTest("native/native.tests/testData/gc/cleaner_basic.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cleaner_in_tls_worker.kt")
  public void testCleaner_in_tls_worker() {
    runTest("native/native.tests/testData/gc/cleaner_in_tls_worker.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cleaner_workers.kt")
  public void testCleaner_workers() {
    runTest("native/native.tests/testData/gc/cleaner_workers.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("collect.kt")
  public void testCollect() {
    runTest("native/native.tests/testData/gc/collect.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cycles0.kt")
  public void testCycles0() {
    runTest("native/native.tests/testData/gc/cycles0.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cycles1.kt")
  public void testCycles1() {
    runTest("native/native.tests/testData/gc/cycles1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("escape0.kt")
  public void testEscape0() {
    runTest("native/native.tests/testData/gc/escape0.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("escape1.kt")
  public void testEscape1() {
    runTest("native/native.tests/testData/gc/escape1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("escape2.kt")
  public void testEscape2() {
    runTest("native/native.tests/testData/gc/escape2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("gcStats.kt")
  public void testGcStats() {
    runTest("native/native.tests/testData/gc/gcStats.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lazy2.kt")
  public void testLazy2() {
    runTest("native/native.tests/testData/gc/lazy2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lazy3.kt")
  public void testLazy3() {
    runTest("native/native.tests/testData/gc/lazy3.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("throwable.kt")
  public void testThrowable() {
    runTest("native/native.tests/testData/gc/throwable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("weak0.kt")
  public void testWeak0() {
    runTest("native/native.tests/testData/gc/weak0.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("weak1.kt")
  public void testWeak1() {
    runTest("native/native.tests/testData/gc/weak1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("worker10.kt")
  public void testWorker10() {
    runTest("native/native.tests/testData/gc/worker10.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("worker_bound_reference0.kt")
  public void testWorker_bound_reference0() {
    runTest("native/native.tests/testData/gc/worker_bound_reference0.kt");
  }
}
