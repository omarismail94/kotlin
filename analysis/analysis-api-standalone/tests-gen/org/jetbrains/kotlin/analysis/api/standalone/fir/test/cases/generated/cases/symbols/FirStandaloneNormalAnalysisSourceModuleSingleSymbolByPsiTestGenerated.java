/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.symbols;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSingleSymbolByPsiTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/singleSymbolByPsi")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleSingleSymbolByPsiTestGenerated extends AbstractSingleSymbolByPsiTest {
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
  public void testAllFilesPresentInSingleSymbolByPsi() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/singleSymbolByPsi"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ExpandedParameterType.kt")
  public void testExpandedParameterType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/ExpandedParameterType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ExpandedReturnType.kt")
  public void testExpandedReturnType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/ExpandedReturnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithReceiverAnnotation.kt")
  public void testFunctionWithReceiverAnnotation() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/functionWithReceiverAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("getterWithAnnotations.kt")
  public void testGetterWithAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/getterWithAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("getterWithReceiverAndAnnotations.kt")
  public void testGetterWithReceiverAndAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/getterWithReceiverAndAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedTypeAnnotationWithTypeAlias.kt")
  public void testNestedTypeAnnotationWithTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/nestedTypeAnnotationWithTypeAlias.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedTypeAnnotationWithTypeAliasAsAnnotation.kt")
  public void testNestedTypeAnnotationWithTypeAliasAsAnnotation() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/nestedTypeAnnotationWithTypeAliasAsAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithAnnotations.kt")
  public void testPropertyWithAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/propertyWithAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithAnnotationsAndAccessors.kt")
  public void testPropertyWithAnnotationsAndAccessors() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/propertyWithAnnotationsAndAccessors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithDelegateAndAnnotations.kt")
  public void testPropertyWithDelegateAndAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/propertyWithDelegateAndAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithReceiverAnnotation.kt")
  public void testPropertyWithReceiverAnnotation() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/propertyWithReceiverAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("setterWithAnnotations.kt")
  public void testSetterWithAnnotations() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/setterWithAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationWithArgument.kt")
  public void testTypeAnnotationWithArgument() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationWithArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnFunctionParameterType.kt")
  public void testTypeAnnotationsOnFunctionParameterType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnFunctionParameterType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnFunctionReceiverType.kt")
  public void testTypeAnnotationsOnFunctionReceiverType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnFunctionReceiverType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnFunctionalTypeWithTypeAlias.kt")
  public void testTypeAnnotationsOnFunctionalTypeWithTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnFunctionalTypeWithTypeAlias.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnPropertyGetterReturnType.kt")
  public void testTypeAnnotationsOnPropertyGetterReturnType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnPropertyGetterReturnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnPropertyReceiverType.kt")
  public void testTypeAnnotationsOnPropertyReceiverType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnPropertyReceiverType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnPropertyReturnType.kt")
  public void testTypeAnnotationsOnPropertyReturnType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnPropertyReturnType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnPropertySetterParameterType.kt")
  public void testTypeAnnotationsOnPropertySetterParameterType() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnPropertySetterParameterType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnPropertySetterParameterTypeWithAnotherAnnotation.kt")
  public void testTypeAnnotationsOnPropertySetterParameterTypeWithAnotherAnnotation() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnPropertySetterParameterTypeWithAnotherAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnSuperClassCall.kt")
  public void testTypeAnnotationsOnSuperClassCall() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnSuperClassCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnSuperClassCallOnAnonymousObject.kt")
  public void testTypeAnnotationsOnSuperClassCallOnAnonymousObject() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnSuperClassCallOnAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnSuperInterface.kt")
  public void testTypeAnnotationsOnSuperInterface() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnSuperInterface.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsOnSuperInterfaceOnAnonymousObject.kt")
  public void testTypeAnnotationsOnSuperInterfaceOnAnonymousObject() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsOnSuperInterfaceOnAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAnnotationsWithTypeAlias.kt")
  public void testTypeAnnotationsWithTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/typeAnnotationsWithTypeAlias.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("valueClass.kt")
  public void testValueClass() {
    runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/valueClass.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts")
  @TestDataPath("$PROJECT_ROOT")
  public class Contracts {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInContracts() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("booleanConstReferenceInImplies.kt")
    public void testBooleanConstReferenceInImplies() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/booleanConstReferenceInImplies.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("booleanExprContract.kt")
    public void testBooleanExprContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/booleanExprContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callsInPlaceAtLeastOnceContract.kt")
    public void testCallsInPlaceAtLeastOnceContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/callsInPlaceAtLeastOnceContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callsInPlaceAtMostOnceContract.kt")
    public void testCallsInPlaceAtMostOnceContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/callsInPlaceAtMostOnceContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callsInPlaceExactlyOnceContract.kt")
    public void testCallsInPlaceExactlyOnceContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/callsInPlaceExactlyOnceContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callsInPlaceUnknownContract.kt")
    public void testCallsInPlaceUnknownContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/callsInPlaceUnknownContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("invalidContractParameterPassedToReturns.kt")
    public void testInvalidContractParameterPassedToReturns() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/invalidContractParameterPassedToReturns.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("isInstancePredicateContract.kt")
    public void testIsInstancePredicateContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/isInstancePredicateContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("logicalNotContract.kt")
    public void testLogicalNotContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/logicalNotContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("referenceBooleanReceiverInContract.kt")
    public void testReferenceBooleanReceiverInContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/referenceBooleanReceiverInContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("referenceReceiverInContract.kt")
    public void testReferenceReceiverInContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/referenceReceiverInContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("returnsContract.kt")
    public void testReturnsContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/returnsContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("returnsFalseContract.kt")
    public void testReturnsFalseContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/returnsFalseContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("returnsNotNullContract.kt")
    public void testReturnsNotNullContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/returnsNotNullContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("returnsNullContract.kt")
    public void testReturnsNullContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/returnsNullContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("returnsTrueContract.kt")
    public void testReturnsTrueContract() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/returnsTrueContract.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("twoContracts.kt")
    public void testTwoContracts() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/contracts/twoContracts.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring")
  @TestDataPath("$PROJECT_ROOT")
  public class Destructuring {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInDestructuring() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("destructuringDeclaration.kt")
    public void testDestructuringDeclaration() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/destructuringDeclaration.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("destructuringDeclarationInLambda.kt")
    public void testDestructuringDeclarationInLambda() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/destructuringDeclarationInLambda.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("destructuringDeclarationParameterInLambda.kt")
    public void testDestructuringDeclarationParameterInLambda() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/destructuringDeclarationParameterInLambda.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("entryInDestructuringDeclaration.kt")
    public void testEntryInDestructuringDeclaration() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/entryInDestructuringDeclaration.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("entryInDestructuringDeclarationParameterInLambda.kt")
    public void testEntryInDestructuringDeclarationParameterInLambda() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/entryInDestructuringDeclarationParameterInLambda.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("entryUnderscoreInDestructuringDeclaration.kt")
    public void testEntryUnderscoreInDestructuringDeclaration() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/entryUnderscoreInDestructuringDeclaration.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("entryUnderscoreInDestructuringDeclarationParameterInLambda.kt")
    public void testEntryUnderscoreInDestructuringDeclarationParameterInLambda() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/destructuring/entryUnderscoreInDestructuringDeclarationParameterInLambda.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/symbols/singleSymbolByPsi/errors")
  @TestDataPath("$PROJECT_ROOT")
  public class Errors {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInErrors() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/singleSymbolByPsi/errors"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("anonymousObjectInInvalidPosition.kt")
    public void testAnonymousObjectInInvalidPosition() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/errors/anonymousObjectInInvalidPosition.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("incompleteFunctionTypeParameter.kt")
    public void testIncompleteFunctionTypeParameter() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/errors/incompleteFunctionTypeParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("objectWithTypeArgsAsExpression.kt")
    public void testObjectWithTypeArgsAsExpression() {
      runTest("analysis/analysis-api/testData/symbols/singleSymbolByPsi/errors/objectWithTypeArgsAsExpression.kt");
    }
  }
}
