/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByFqNameTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByFqName")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleSymbolByFqNameTestGenerated extends AbstractSymbolByFqNameTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInSymbolByFqName() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByFqName"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/class.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classFromJdk.kt")
  public void testClassFromJdk() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/classFromJdk.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumEntry.kt")
  public void testEnumEntry() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/enumEntry.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("fileWalkDirectionEnum.kt")
  public void testFileWalkDirectionEnum() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/fileWalkDirectionEnum.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("iterator.kt")
  public void testIterator() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/iterator.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("kclass.kt")
  public void testKclass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/kclass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("listOf.kt")
  public void testListOf() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/listOf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberFunction.kt")
  public void testMemberFunction() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/memberFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberFunctionWithOverloads.kt")
  public void testMemberFunctionWithOverloads() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/memberFunctionWithOverloads.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedClass.kt")
  public void testNestedClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/nestedClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typealias.kt")
  public void testTypealias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/typealias.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/symbolByFqName/withTestCompilerPluginEnabled")
  @TestDataPath("$PROJECT_ROOT")
  public class WithTestCompilerPluginEnabled {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInWithTestCompilerPluginEnabled() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByFqName/withTestCompilerPluginEnabled"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("myInterfaceSupertype.kt")
    public void testMyInterfaceSupertype() {
      runTest("analysis/analysis-api/testData/symbols/symbolByFqName/withTestCompilerPluginEnabled/myInterfaceSupertype.kt");
    }
  }
}
