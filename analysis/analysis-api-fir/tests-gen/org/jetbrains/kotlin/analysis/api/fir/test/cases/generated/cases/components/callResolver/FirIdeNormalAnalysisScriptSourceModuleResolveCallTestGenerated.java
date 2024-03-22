/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.callResolver;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.callResolver.AbstractResolveCallTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisScriptSourceModuleResolveCallTestGenerated extends AbstractResolveCallTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.ScriptSource,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInResolveCall() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall"), Pattern.compile("^(.+)\\.kts$"), null, true);
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/assignments")
  @TestDataPath("$PROJECT_ROOT")
  public class Assignments {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInAssignments() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/assignments"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/callableReferences")
  @TestDataPath("$PROJECT_ROOT")
  public class CallableReferences {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInCallableReferences() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/callableReferences"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/invalidCode")
  @TestDataPath("$PROJECT_ROOT")
  public class InvalidCode {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInInvalidCode() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/invalidCode"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/invokeOnObjects")
  @TestDataPath("$PROJECT_ROOT")
  public class InvokeOnObjects {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInInvokeOnObjects() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/invokeOnObjects"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/nonCalls")
  @TestDataPath("$PROJECT_ROOT")
  public class NonCalls {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInNonCalls() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/nonCalls"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCall/withTestCompilerPluginEnabled")
  @TestDataPath("$PROJECT_ROOT")
  public class WithTestCompilerPluginEnabled {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInWithTestCompilerPluginEnabled() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCall/withTestCompilerPluginEnabled"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }
  }
}
