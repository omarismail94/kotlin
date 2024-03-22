/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.referenceResolveProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.referenceResolveProvider.AbstractIsImplicitCompanionReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleIsImplicitCompanionReferenceTestGenerated extends AbstractIsImplicitCompanionReferenceTest {
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
  public void testAllFilesPresentInIsImplicitReferenceToCompanion() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classAccessWithExplicitReferenceToCompanion.kt")
  public void testClassAccessWithExplicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/classAccessWithExplicitReferenceToCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classAccessWithExplicitReferenceToNamedCompanion.kt")
  public void testClassAccessWithExplicitReferenceToNamedCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/classAccessWithExplicitReferenceToNamedCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorCall.kt")
  public void testConstructorCall() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/constructorCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorCallWithInvokeInCompanion.kt")
  public void testConstructorCallWithInvokeInCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/constructorCallWithInvokeInCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("explicitReferenceToCompanion.kt")
  public void testExplicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/explicitReferenceToCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("explicitReferenceToNamedCompanion.kt")
  public void testExplicitReferenceToNamedCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/explicitReferenceToNamedCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("impicitReferenceToCompanion.kt")
  public void testImpicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/impicitReferenceToCompanion.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("qualifierReferenceToClassWithCompanion.kt")
  public void testQualifierReferenceToClassWithCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/qualifierReferenceToClassWithCompanion.kt");
  }
}
