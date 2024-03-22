/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.diagnosticProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.diagnosticProvider.AbstractCollectDiagnosticsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleCollectDiagnosticsTestGenerated extends AbstractCollectDiagnosticsTest {
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
  public void testAllFilesPresentInDiagnostics() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotationWithEnumFromDuplicatedLibrary.kt")
  public void testAnnotationWithEnumFromDuplicatedLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/annotationWithEnumFromDuplicatedLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationInMiddle.kt")
  public void testDanglingAnnotationInMiddle() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/danglingAnnotationInMiddle.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationInMiddleWithComment.kt")
  public void testDanglingAnnotationInMiddleWithComment() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/danglingAnnotationInMiddleWithComment.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("declarationErrors.kt")
  public void testDeclarationErrors() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/declarationErrors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegationToLibraryInterface.kt")
  public void testDelegationToLibraryInterface() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/delegationToLibraryInterface.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("deprecationFromLibrary.kt")
  public void testDeprecationFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/deprecationFromLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("duplicatedCallableWithImplicitType.kt")
  public void testDuplicatedCallableWithImplicitType() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/duplicatedCallableWithImplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("errorsInFunctionalInterfacesInstances.kt")
  public void testErrorsInFunctionalInterfacesInstances() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/errorsInFunctionalInterfacesInstances.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("incompleteDelegation.kt")
  public void testIncompleteDelegation() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteDelegation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("incompleteFor.kt")
  public void testIncompleteFor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteFor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inferTypeFromGetValueDelegate.kt")
  public void testInferTypeFromGetValueDelegate() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegate.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inferTypeFromGetValueDelegateLibrary.kt")
  public void testInferTypeFromGetValueDelegateLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegateLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaInnerClass.kt")
  public void testJavaInnerClass() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaInnerClassFromAnotherModule.kt")
  public void testJavaInnerClassFromAnotherModule() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromAnotherModule.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaInnerClassFromLibrary.kt")
  public void testJavaInnerClassFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaNestedClass.kt")
  public void testJavaNestedClass() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaNestedClassFromAnotherModule.kt")
  public void testJavaNestedClassFromAnotherModule() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromAnotherModule.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaNestedClassFromLibrary.kt")
  public void testJavaNestedClassFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("libraryDataClassCopy.kt")
  public void testLibraryDataClassCopy() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/libraryDataClassCopy.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("libraryDataClassCopyReversedOrder.kt")
  public void testLibraryDataClassCopyReversedOrder() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/libraryDataClassCopyReversedOrder.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("overrideProtectedClassReturnFromLibrary.kt")
  public void testOverrideProtectedClassReturnFromLibrary() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/overrideProtectedClassReturnFromLibrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("resolutionErrors.kt")
  public void testResolutionErrors() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/resolutionErrors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeMismatches.kt")
  public void testTypeMismatches() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/typeMismatches.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolved.kt")
  public void testUnresolved() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolved.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedAnnotationsOnPropertyFromParameter.kt")
  public void testUnresolvedAnnotationsOnPropertyFromParameter() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedAnnotationsOnPropertyFromParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCall.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCall() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithLocalFunction() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt")
  public void testUnresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt")
  public void testUnresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedSuperConstructorCall.kt")
  public void testUnresolvedSuperConstructorCall() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedSuperConstructorCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unusedDestructuring.kt")
  public void testUnusedDestructuring() {
    runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unusedDestructuring.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression")
  @TestDataPath("$PROJECT_ROOT")
  public class Suppression {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSuppression() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conflictingOverloadsAtTopLevel.kt")
    public void testConflictingOverloadsAtTopLevel() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conflictingOverloadsAtTopLevel2.kt")
    public void testConflictingOverloadsAtTopLevel2() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conflictingOverloadsAtTopLevelWithFileSuppression.kt")
    public void testConflictingOverloadsAtTopLevelWithFileSuppression() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevelWithFileSuppression.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conflictingOverloadsInClass.kt")
    public void testConflictingOverloadsInClass() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInClass.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conflictingOverloadsInNestedClass.kt")
    public void testConflictingOverloadsInNestedClass() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInNestedClass.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("deprecationAtTopLevel.kt")
    public void testDeprecationAtTopLevel() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/deprecationAtTopLevel.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when")
  @TestDataPath("$PROJECT_ROOT")
  public class When {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInWhen() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassFromDependencyExhaustive.kt")
    public void testSealedClassFromDependencyExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassFromDependencyMissingCase.kt")
    public void testSealedClassFromDependencyMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyMissingCase.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassFromLibraryExhaustive.kt")
    public void testSealedClassFromLibraryExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassFromLibraryMissingCase.kt")
    public void testSealedClassFromLibraryMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryMissingCase.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassSameModuleExhaustive.kt")
    public void testSealedClassSameModuleExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedClassSameModuleMissingCase.kt")
    public void testSealedClassSameModuleMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleMissingCase.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceFromDependencyExhaustive.kt")
    public void testSealedInterfaceFromDependencyExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceFromDependencyMissingCase.kt")
    public void testSealedInterfaceFromDependencyMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyMissingCase.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceFromLibraryExhaustive.kt")
    public void testSealedInterfaceFromLibraryExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceFromLibraryMissingCase.kt")
    public void testSealedInterfaceFromLibraryMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryMissingCase.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceSameModuleExhaustive.kt")
    public void testSealedInterfaceSameModuleExhaustive() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleExhaustive.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("sealedInterfaceSameModuleMissingCase.kt")
    public void testSealedInterfaceSameModuleMissingCase() {
      runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleMissingCase.kt");
    }
  }
}
