/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.annotations;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.configurators.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.annotations.AbstractAnalysisApiAnnotationsOnTypesTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/annotations/annotationsOnTypes")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleAnalysisApiAnnotationsOnTypesTestGenerated extends AbstractAnalysisApiAnnotationsOnTypesTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Standalone
      )
    );
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInAnnotationsOnTypes() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/annotations/annotationsOnTypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionOnType.kt")
  public void testAnnotaionOnType() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionOnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionOnTypeArgument.kt")
  public void testAnnotaionOnTypeArgument() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionOnTypeArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionOnTypeArgumentOfTypeArgument.kt")
  public void testAnnotaionOnTypeArgumentOfTypeArgument() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionOnTypeArgumentOfTypeArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionWithComplexArgumentOnType.kt")
  public void testAnnotaionWithComplexArgumentOnType() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionWithComplexArgumentOnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionWithComplexArgumentOnTypeArgument.kt")
  public void testAnnotaionWithComplexArgumentOnTypeArgument() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionWithComplexArgumentOnTypeArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionWithLiteralArgumentOnType.kt")
  public void testAnnotaionWithLiteralArgumentOnType() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionWithLiteralArgumentOnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotaionWithLiteralArgumentOnTypeArgument.kt")
  public void testAnnotaionWithLiteralArgumentOnTypeArgument() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnTypes/annotaionWithLiteralArgumentOnTypeArgument.kt");
  }
}
