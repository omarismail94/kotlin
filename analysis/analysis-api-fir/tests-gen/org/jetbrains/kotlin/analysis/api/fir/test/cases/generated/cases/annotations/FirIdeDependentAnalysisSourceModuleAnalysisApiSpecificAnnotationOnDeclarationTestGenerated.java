/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.annotations;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.annotations.AbstractAnalysisApiSpecificAnnotationOnDeclarationTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/annotations/specificAnnotations")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleAnalysisApiSpecificAnnotationOnDeclarationTestGenerated extends AbstractAnalysisApiSpecificAnnotationOnDeclarationTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Dependent,
        AnalysisApiMode.Ide
      )
    );
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInSpecificAnnotations() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/annotations/specificAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaTargetAnnotationWithEmptyArguments.kt")
  public void testJavaTargetAnnotationWithEmptyArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/javaTargetAnnotationWithEmptyArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaTargetAnnotationWithOneArgument.kt")
  public void testJavaTargetAnnotationWithOneArgument() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/javaTargetAnnotationWithOneArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaTargetAnnotationWithOneArgumentAsImport.kt")
  public void testJavaTargetAnnotationWithOneArgumentAsImport() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/javaTargetAnnotationWithOneArgumentAsImport.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaTargetAnnotationWithSeveralArguments.kt")
  public void testJavaTargetAnnotationWithSeveralArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/javaTargetAnnotationWithSeveralArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaTargetAnnotationWithoutArguments.kt")
  public void testJavaTargetAnnotationWithoutArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/javaTargetAnnotationWithoutArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("targetAnnotationWithEmptyArguments.kt")
  public void testTargetAnnotationWithEmptyArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/targetAnnotationWithEmptyArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("targetAnnotationWithOneArgument.kt")
  public void testTargetAnnotationWithOneArgument() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/targetAnnotationWithOneArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("targetAnnotationWithOneArgumentAsImport.kt")
  public void testTargetAnnotationWithOneArgumentAsImport() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/targetAnnotationWithOneArgumentAsImport.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("targetAnnotationWithSeveralArguments.kt")
  public void testTargetAnnotationWithSeveralArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/targetAnnotationWithSeveralArguments.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("targetAnnotationWithoutArguments.kt")
  public void testTargetAnnotationWithoutArguments() {
    runTest("analysis/analysis-api/testData/annotations/specificAnnotations/targetAnnotationWithoutArguments.kt");
  }
}
