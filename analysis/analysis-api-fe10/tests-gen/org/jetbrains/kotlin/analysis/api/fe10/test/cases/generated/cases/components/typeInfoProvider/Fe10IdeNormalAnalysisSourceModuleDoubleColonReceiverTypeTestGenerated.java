/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.typeInfoProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.typeInfoProvider.AbstractDoubleColonReceiverTypeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleDoubleColonReceiverTypeTestGenerated extends AbstractDoubleColonReceiverTypeTest {
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
  public void testAllFilesPresentInDoubleColonReceiverType() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("getClass_primitive.kt")
  public void testGetClass_primitive() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/getClass_primitive.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("getClass_type.kt")
  public void testGetClass_type() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/getClass_type.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("getClass_variable.kt")
  public void testGetClass_variable() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/getClass_variable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("methodReference_java.kt")
  public void testMethodReference_java() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/methodReference_java.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("methodReference_type.kt")
  public void testMethodReference_type() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/methodReference_type.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("methodReference_typeArgument.kt")
  public void testMethodReference_typeArgument() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/methodReference_typeArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("methodReference_typeArgument_startProjection.kt")
  public void testMethodReference_typeArgument_startProjection() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/methodReference_typeArgument_startProjection.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("methodReference_variable.kt")
  public void testMethodReference_variable() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/methodReference_variable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nullableType.kt")
  public void testNullableType() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/nullableType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("outerThisReceiver.kt")
  public void testOuterThisReceiver() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/outerThisReceiver.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("thisReceiver.kt")
  public void testThisReceiver() {
    runTest("analysis/analysis-api/testData/components/typeInfoProvider/doubleColonReceiverType/thisReceiver.kt");
  }
}
