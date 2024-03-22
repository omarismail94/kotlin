/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class CInteropFModulesTestGenerated extends AbstractNativeCInteropFModulesTest {
  @Nested
  @TestMetadata("native/native.tests/testData/CInterop/simple/simpleDefs")
  @TestDataPath("$PROJECT_ROOT")
  public class SimpleDefs {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSimpleDefs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CInterop/simple/simpleDefs"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterA")
    public void testFilterA() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterA/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterAB")
    public void testFilterAB() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterAB/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterABC")
    public void testFilterABC() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterABC/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterAC")
    public void testFilterAC() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterAC/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterB")
    public void testFilterB() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterB/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterBC")
    public void testFilterBC() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterBC/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterC")
    public void testFilterC() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/filterC/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("full")
    public void testFull() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/full/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesA")
    public void testModulesA() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/modulesA/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesAB")
    public void testModulesAB() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/modulesAB/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesB")
    public void testModulesB() {
      runTest("native/native.tests/testData/CInterop/simple/simpleDefs/modulesB/");
    }
  }

  @Nested
  @TestMetadata("native/native.tests/testData/CInterop/framework/frameworkDefs")
  @TestDataPath("$PROJECT_ROOT")
  public class FrameworkDefs {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInFrameworkDefs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CInterop/framework/frameworkDefs"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("childImportFModules")
    public void testChildImportFModules() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/childImportFModules/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("excludePod1")
    public void testExcludePod1() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/excludePod1/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("excludePod1Umbrella")
    public void testExcludePod1Umbrella() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/excludePod1Umbrella/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("explicitSubmodule")
    public void testExplicitSubmodule() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/explicitSubmodule/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterPod1")
    public void testFilterPod1() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/filterPod1/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterPod1A")
    public void testFilterPod1A() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/filterPod1A/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterPod1Umbrella")
    public void testFilterPod1Umbrella() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/filterPod1Umbrella/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterPod1UmbrellaPod1A")
    public void testFilterPod1UmbrellaPod1A() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/filterPod1UmbrellaPod1A/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("forwardEnum")
    public void testForwardEnum() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/forwardEnum/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("full")
    public void testFull() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/full/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("importsAngleAngle")
    public void testImportsAngleAngle() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/importsAngleAngle/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("importsAngleQuote")
    public void testImportsAngleQuote() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/importsAngleQuote/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("importsQuoteAngle")
    public void testImportsQuoteAngle() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/importsQuoteAngle/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("importsQuoteQuote")
    public void testImportsQuoteQuote() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/importsQuoteQuote/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesPod1")
    public void testModulesPod1() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/modulesPod1/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("protocolDefs")
    public void testProtocolDefs() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/protocolDefs/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("twoChildren")
    public void testTwoChildren() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/twoChildren/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("visitOtherModules")
    public void testVisitOtherModules() {
      runTest("native/native.tests/testData/CInterop/framework/frameworkDefs/visitOtherModules/");
    }
  }

  @Nested
  @TestMetadata("native/native.tests/testData/CInterop/framework.macros/macrosDefs")
  @TestDataPath("$PROJECT_ROOT")
  public class MacrosDefs {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInMacrosDefs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CInterop/framework.macros/macrosDefs"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesPod1")
    public void testModulesPod1() {
      runTest("native/native.tests/testData/CInterop/framework.macros/macrosDefs/modulesPod1/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("myMacroType")
    public void testMyMacroType() {
      runTest("native/native.tests/testData/CInterop/framework.macros/macrosDefs/myMacroType/");
    }
  }

  @Nested
  @TestMetadata("native/native.tests/testData/CInterop/builtins/builtinsDefs")
  @TestDataPath("$PROJECT_ROOT")
  public class BuiltinsDefs {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInBuiltinsDefs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CInterop/builtins/builtinsDefs"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterA")
    public void testFilterA() {
      runTest("native/native.tests/testData/CInterop/builtins/builtinsDefs/filterA/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("filterStdargH")
    public void testFilterStdargH() {
      runTest("native/native.tests/testData/CInterop/builtins/builtinsDefs/filterStdargH/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("fullA")
    public void testFullA() {
      runTest("native/native.tests/testData/CInterop/builtins/builtinsDefs/fullA/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("fullStdargH")
    public void testFullStdargH() {
      runTest("native/native.tests/testData/CInterop/builtins/builtinsDefs/fullStdargH/");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("modulesA")
    public void testModulesA() {
      runTest("native/native.tests/testData/CInterop/builtins/builtinsDefs/modulesA/");
    }
  }
}
