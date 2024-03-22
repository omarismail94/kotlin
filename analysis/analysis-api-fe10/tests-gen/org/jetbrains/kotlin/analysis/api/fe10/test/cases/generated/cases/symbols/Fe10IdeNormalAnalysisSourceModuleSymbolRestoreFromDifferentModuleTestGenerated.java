/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolRestoreFromDifferentModuleTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleSymbolRestoreFromDifferentModuleTestGenerated extends AbstractSymbolRestoreFromDifferentModuleTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fe10,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInSymbolRestoreFromDifferentModule() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("noDependency.kt")
  public void testNoDependency() {
    runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/noDependency.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("withDependency.kt")
  public void testWithDependency() {
    runTest("analysis/analysis-api/testData/symbols/symbolRestoreFromDifferentModule/withDependency.kt");
  }
}
