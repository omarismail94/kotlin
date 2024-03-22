/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.annotations;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.annotations.AbstractAnalysisApiAnnotationsOnDeclarationsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/annotations/annotationsOnDeclaration")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleAnalysisApiAnnotationsOnDeclarationsTestGenerated extends AbstractAnalysisApiAnnotationsOnDeclarationsTest {
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
  public void testAllFilesPresentInAnnotationsOnDeclaration() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/annotations/annotationsOnDeclaration"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("deprecated.kt")
  public void testDeprecated() {
    runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/deprecated.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct")
  @TestDataPath("$PROJECT_ROOT")
  public class Direct {
    @RepeatedTest(value = 5)
    @TestMetadata("aliasedThrowsOnFunction.kt")
    public void testAliasedThrowsOnFunction() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/aliasedThrowsOnFunction.kt");
    }

    @RepeatedTest(value = 5)
    public void testAllFilesPresentInDirect() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("emptyJavaSpreadParameter.kt")
    public void testEmptyJavaSpreadParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/emptyJavaSpreadParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onClass.kt")
    public void testOnClass() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onClass.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onFunction.kt")
    public void testOnFunction() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onFunction.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onFunction_unresolvedClassReference.kt")
    public void testOnFunction_unresolvedClassReference() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onFunction_unresolvedClassReference.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onProperty.kt")
    public void testOnProperty() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onProperty.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onProperty_javaAnnotation_targets.kt")
    public void testOnProperty_javaAnnotation_targets() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onProperty_javaAnnotation_targets.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onTypeAlias.kt")
    public void testOnTypeAlias() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/onTypeAlias.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unsignedParameter.kt")
    public void testUnsignedParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/unsignedParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("varargComplexParameter.kt")
    public void testVarargComplexParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/varargComplexParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("varargNamedParameter.kt")
    public void testVarargNamedParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/varargNamedParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("varargParameter.kt")
    public void testVarargParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/varargParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("varargSpreadParameter.kt")
    public void testVarargSpreadParameter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/direct/varargSpreadParameter.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite")
  @TestDataPath("$PROJECT_ROOT")
  public class UseSite {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInUseSite() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onGetter.kt")
    public void testOnGetter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite/onGetter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onParam.kt")
    public void testOnParam() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite/onParam.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onProperty.kt")
    public void testOnProperty() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite/onProperty.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("onSetter.kt")
    public void testOnSetter() {
      runTest("analysis/analysis-api/testData/annotations/annotationsOnDeclaration/useSite/onSetter.kt");
    }
  }
}
