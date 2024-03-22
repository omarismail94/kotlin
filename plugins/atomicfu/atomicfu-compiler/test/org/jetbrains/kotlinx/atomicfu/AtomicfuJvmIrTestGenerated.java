/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlinx.atomicfu;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class AtomicfuJvmIrTestGenerated extends AbstractAtomicfuJvmIrTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInBox() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions")
  @TestDataPath("$PROJECT_ROOT")
  public class Atomic_extensions {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInAtomic_extensions() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ArrayInlineExtensionTest.kt")
    public void testArrayInlineExtensionTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ArrayInlineExtensionTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ArrayLoopTest.kt")
    public void testArrayLoopTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ArrayLoopTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ComplexLoopTest.kt")
    public void testComplexLoopTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ComplexLoopTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ExtensionLoopTest.kt")
    public void testExtensionLoopTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ExtensionLoopTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ExtensionsTest.kt")
    public void testExtensionsTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ExtensionsTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("InlineExtensionWithTypeParameterTest.kt")
    public void testInlineExtensionWithTypeParameterTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/InlineExtensionWithTypeParameterTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LambdaTest.kt")
    public void testLambdaTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LambdaTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LockFreeIntBitsTest.kt")
    public void testLockFreeIntBitsTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LockFreeIntBitsTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LockTest.kt")
    public void testLockTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/LockTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ParameterizedInlineFunExtensionTest.kt")
    public void testParameterizedInlineFunExtensionTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomic_extensions/ParameterizedInlineFunExtensionTest.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic")
  @TestDataPath("$PROJECT_ROOT")
  public class Atomics_basic {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInAtomics_basic() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ArithmeticTest.kt")
    public void testArithmeticTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/ArithmeticTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("AtomicArrayTest.kt")
    public void testAtomicArrayTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/AtomicArrayTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("IndexArrayElementGetterTest.kt")
    public void testIndexArrayElementGetterTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/IndexArrayElementGetterTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("InitializationOrderTest.kt")
    public void testInitializationOrderTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/InitializationOrderTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LateinitPropertiesTest.kt")
    public void testLateinitPropertiesTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LateinitPropertiesTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LockFreeLongCounterTest.kt")
    public void testLockFreeLongCounterTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeLongCounterTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LockFreeQueueTest.kt")
    public void testLockFreeQueueTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeQueueTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LockFreeStackTest.kt")
    public void testLockFreeStackTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LockFreeStackTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("LoopTest.kt")
    public void testLoopTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/LoopTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("MultiInitTest.kt")
    public void testMultiInitTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/MultiInitTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ScopeTest.kt")
    public void testScopeTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/ScopeTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("SimpleLockTest.kt")
    public void testSimpleLockTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/SimpleLockTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("UncheckedCastTest.kt")
    public void testUncheckedCastTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/atomics_basic/UncheckedCastTest.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/delegated")
  @TestDataPath("$PROJECT_ROOT")
  public class Delegated {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInDelegated() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/delegated"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("DelegatedPropertiesTest.kt")
    public void testDelegatedPropertiesTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/delegated/DelegatedPropertiesTest.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/locks")
  @TestDataPath("$PROJECT_ROOT")
  public class Locks {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInLocks() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/locks"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ReentrantLockTest.kt")
    public void testReentrantLockTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/locks/ReentrantLockTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("SynchronizedObjectTest.kt")
    public void testSynchronizedObjectTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/locks/SynchronizedObjectTest.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/top-level")
  @TestDataPath("$PROJECT_ROOT")
  public class Top_level {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInTop_level() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/top-level"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("FieldInObjectTest.kt")
    public void testFieldInObjectTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/top-level/FieldInObjectTest.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("TopLevelTest.kt")
    public void testTopLevelTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/top-level/TopLevelTest.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/atomicfu/atomicfu-compiler/testData/box/trace")
  @TestDataPath("$PROJECT_ROOT")
  public class Trace {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInTrace() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/atomicfu/atomicfu-compiler/testData/box/trace"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("TraceTest.kt")
    public void testTraceTest() {
      runTest("plugins/atomicfu/atomicfu-compiler/testData/box/trace/TraceTest.kt");
    }
  }
}
