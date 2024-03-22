/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/fileStructure")
@TestDataPath("$PROJECT_ROOT")
public class ScriptDiagnosticTraversalCounterTestGenerated extends AbstractScriptDiagnosticTraversalCounterTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInFileStructure() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/fileStructure"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classMemberPropertyScript.kts")
  public void testClassMemberPropertyScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/classMemberPropertyScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classScript.kts")
  public void testClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/classScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorsScript.kts")
  public void testConstructorsScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/constructorsScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationClassLevelScript.kts")
  public void testDanglingAnnotationClassLevelScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/danglingAnnotationClassLevelScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("declarationsInPropertyInitScript.kts")
  public void testDeclarationsInPropertyInitScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/declarationsInPropertyInitScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("destructuring.kts")
  public void testDestructuring() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/destructuring.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumClassScript.kts")
  public void testEnumClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/enumClassScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumClassWithBodyScript.kts")
  public void testEnumClassWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/enumClassWithBodyScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndFunctionInsideLocalClassScript.kts")
  public void testFunctionWithImplicitTypeAndFunctionInsideLocalClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndFunctionInsideLocalClassScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndFunctionInsideScript.kts")
  public void testFunctionWithImplicitTypeAndFunctionInsideScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndFunctionInsideScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndPropertyInsideScript.kts")
  public void testFunctionWithImplicitTypeAndPropertyInsideScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndPropertyInsideScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("initBlockScript.kts")
  public void testInitBlockScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/initBlockScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClassScript.kts")
  public void testLocalClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localClassScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFunScript.kts")
  public void testLocalFunScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localFunScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localPropertyScript.kts")
  public void testLocalPropertyScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localPropertyScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberTypeAliasScript.kts")
  public void testMemberTypeAliasScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/memberTypeAliasScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedClassesScript.kts")
  public void testNestedClassesScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/nestedClassesScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyAccessorsScript.kts")
  public void testPropertyAccessorsScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyAccessorsScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithImplicitTypeAndAnnotationsInsideLocalClassScript.kts")
  public void testPropertyWithImplicitTypeAndAnnotationsInsideLocalClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithImplicitTypeAndAnnotationsInsideLocalClassScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithImplicitTypeAndFieldAnnotationsInsideLocalClassScript.kts")
  public void testPropertyWithImplicitTypeAndFieldAnnotationsInsideLocalClassScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithImplicitTypeAndFieldAnnotationsInsideLocalClassScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("script.kts")
  public void testScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/script.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("secondLevelFunction.kts")
  public void testSecondLevelFunction() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/secondLevelFunction.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("secondLevelFunction2.kts")
  public void testSecondLevelFunction2() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/secondLevelFunction2.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superClassCallScript.kts")
  public void testSuperClassCallScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/superClassCallScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelExpressionBodyFunWithTypeScript.kts")
  public void testTopLevelExpressionBodyFunWithTypeScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelExpressionBodyFunWithTypeScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelExpressionBodyFunWithoutTypeScript.kts")
  public void testTopLevelExpressionBodyFunWithoutTypeScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelExpressionBodyFunWithoutTypeScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelFunWithTypeScript.kts")
  public void testTopLevelFunWithTypeScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelFunWithTypeScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelPropertyScript.kts")
  public void testTopLevelPropertyScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelPropertyScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelUnitFunScript.kts")
  public void testTopLevelUnitFunScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelUnitFunScript.kts");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("withoutNameScript.kts")
  public void testWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/withoutNameScript.kts");
  }
}
