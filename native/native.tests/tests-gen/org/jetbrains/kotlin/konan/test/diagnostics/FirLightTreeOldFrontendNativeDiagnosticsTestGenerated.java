/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.diagnostics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/nativeTests")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirLightTreeOldFrontendNativeDiagnosticsTestGenerated extends AbstractFirLightTreeNativeDiagnosticsTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInNativeTests() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrays_after.kt")
  public void testArrays_after() {
    runTest("compiler/testData/diagnostics/nativeTests/arrays_after.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("cloneableInNative.kt")
  public void testCloneableInNative() {
    runTest("compiler/testData/diagnostics/nativeTests/cloneableInNative.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("forwardDeclarations.kt")
  public void testForwardDeclarations() {
    runTest("compiler/testData/diagnostics/nativeTests/forwardDeclarations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("identifiers.kt")
  public void testIdentifiers() {
    runTest("compiler/testData/diagnostics/nativeTests/identifiers.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("isInitialized.kt")
  public void testIsInitialized() {
    runTest("compiler/testData/diagnostics/nativeTests/isInitialized.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("isInitializedError.kt")
  public void testIsInitializedError() {
    runTest("compiler/testData/diagnostics/nativeTests/isInitializedError.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nativeProtectedFunCall.kt")
  public void testNativeProtectedFunCall() {
    runTest("compiler/testData/diagnostics/nativeTests/nativeProtectedFunCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("noObjcOverrideConflictingOverloadsDisabled.kt")
  public void testNoObjcOverrideConflictingOverloadsDisabled() {
    runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsDisabled.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("noObjcOverrideConflictingOverloadsEnabled.kt")
  public void testNoObjcOverrideConflictingOverloadsEnabled() {
    runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsEnabled.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName.kt")
  public void testObjCName() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName2.kt")
  public void testObjCName2() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName3.kt")
  public void testObjCName3() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName3.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName4.kt")
  public void testObjCName4() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName4.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName5.kt")
  public void testObjCName5() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName5.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCName6.kt")
  public void testObjCName6() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName6.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCNameWIthDifferentSwiftName.kt")
  public void testObjCNameWIthDifferentSwiftName() {
    runTest("compiler/testData/diagnostics/nativeTests/objCNameWIthDifferentSwiftName.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCNameWithTwoModules.kt")
  public void testObjCNameWithTwoModules() {
    runTest("compiler/testData/diagnostics/nativeTests/objCNameWithTwoModules.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objCRefinement.kt")
  public void testObjCRefinement() {
    runTest("compiler/testData/diagnostics/nativeTests/objCRefinement.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("objcOverrideApplicability.kt")
  public void testObjcOverrideApplicability() {
    runTest("compiler/testData/diagnostics/nativeTests/objcOverrideApplicability.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("resolveToDelegatedProperty.kt")
  public void testResolveToDelegatedProperty() {
    runTest("compiler/testData/diagnostics/nativeTests/resolveToDelegatedProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("sharedImmutable.kt")
  public void testSharedImmutable() {
    runTest("compiler/testData/diagnostics/nativeTests/sharedImmutable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stdClassAndTypealiasAmbiguity.kt")
  public void testStdClassAndTypealiasAmbiguity() {
    runTest("compiler/testData/diagnostics/nativeTests/stdClassAndTypealiasAmbiguity.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("threadLocal.kt")
  public void testThreadLocal() {
    runTest("compiler/testData/diagnostics/nativeTests/threadLocal.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("throws.kt")
  public void testThrows() {
    runTest("compiler/testData/diagnostics/nativeTests/throws.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("throwsClash.kt")
  public void testThrowsClash() {
    runTest("compiler/testData/diagnostics/nativeTests/throwsClash.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelSingleton.kt")
  public void testTopLevelSingleton() {
    runTest("compiler/testData/diagnostics/nativeTests/topLevelSingleton.kt");
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks")
  @TestDataPath("$PROJECT_ROOT")
  @Tag("frontend-fir")
  @FirPipeline()
  public class SpecialBackendChecks {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSpecialBackendChecks() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class CInterop {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInCInterop() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t1.kt")
      public void testT1() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t1.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t10.kt")
      public void testT10() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t10.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t11.kt")
      public void testT11() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t11.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t12.kt")
      public void testT12() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t12.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t13.kt")
      public void testT13() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t13.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t14.kt")
      public void testT14() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t14.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t37.kt")
      public void testT37() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t37.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t38.kt")
      public void testT38() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t38.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t40.kt")
      public void testT40() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t40.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t41.kt")
      public void testT41() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t41.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t42.kt")
      public void testT42() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t42.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t43.kt")
      public void testT43() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t43.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t44.kt")
      public void testT44() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t44.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t45.kt")
      public void testT45() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t45.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t46.kt")
      public void testT46() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t46.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t47.kt")
      public void testT47() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t47.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t60.kt")
      public void testT60() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t60.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t63.kt")
      public void testT63() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t63.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t64.kt")
      public void testT64() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t64.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t8.kt")
      public void testT8() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t8.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t9.kt")
      public void testT9() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/cInterop/t9.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class Concurrent {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInConcurrent() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t48.kt")
      public void testT48() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t48.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t49.kt")
      public void testT49() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t49.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t50.kt")
      public void testT50() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t50.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t51.kt")
      public void testT51() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/concurrent/t51.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class ImmutableBlobOf {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInImmutableBlobOf() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t54.kt")
      public void testT54() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t54.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t55.kt")
      public void testT55() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t55.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t56.kt")
      public void testT56() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t56.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t57.kt")
      public void testT57() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/immutableBlobOf/t57.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class NativeRef {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInNativeRef() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t52.kt")
      public void testT52() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef/t52.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t53.kt")
      public void testT53() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/nativeRef/t53.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class ObjCInterop {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInObjCInterop() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t15.kt")
      public void testT15() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t15.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t16.kt")
      public void testT16() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t16.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t17.kt")
      public void testT17() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t17.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t18.kt")
      public void testT18() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t18.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t2.kt")
      public void testT2() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t20.kt")
      public void testT20() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t20.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t21.kt")
      public void testT21() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t21.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t22.kt")
      public void testT22() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t22.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t23.kt")
      public void testT23() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t23.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t24.kt")
      public void testT24() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t24.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t25.kt")
      public void testT25() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t25.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t26.kt")
      public void testT26() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t26.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t27.kt")
      public void testT27() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t27.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t28.kt")
      public void testT28() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t28.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t29.kt")
      public void testT29() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t29.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t30.kt")
      public void testT30() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t30.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t31.kt")
      public void testT31() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t31.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t32.kt")
      public void testT32() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t32.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t33.kt")
      public void testT33() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t33.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t34.kt")
      public void testT34() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t34.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t35.kt")
      public void testT35() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t35.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t4.kt")
      public void testT4() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t4.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t5.kt")
      public void testT5() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t5.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t6.kt")
      public void testT6() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t6.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t61.kt")
      public void testT61() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t61.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t62.kt")
      public void testT62() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t62.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t7.kt")
      public void testT7() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/objCInterop/t7.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class Posix {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInPosix() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t3.kt")
      public void testT3() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix/t3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t36.kt")
      public void testT36() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/posix/t36.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class Reflect {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInReflect() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t58.kt")
      public void testT58() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect/t58.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("t59.kt")
      public void testT59() {
        runTest("compiler/testData/diagnostics/nativeTests/specialBackendChecks/reflect/t59.kt");
      }
    }
  }
}
