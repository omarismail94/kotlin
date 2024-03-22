/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.expressionTypeProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.expressionTypeProvider.AbstractHLExpressionTypeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleHLExpressionTypeTestGenerated extends AbstractHLExpressionTypeTest {
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
  public void testAllFilesPresentInExpressionType() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousFunction.kt")
  public void testAnonymousFunction() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/anonymousFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrayElement_arrayOfNulls.kt")
  public void testArrayElement_arrayOfNulls() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/arrayElement_arrayOfNulls.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("array_arrayOfNulls.kt")
  public void testArray_arrayOfNulls() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/array_arrayOfNulls.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("assignmentExpressionTarget.kt")
  public void testAssignmentExpressionTarget() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignmentExpressionTarget.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("binaryExpression.kt")
  public void testBinaryExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/binaryExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("breakExpression.kt")
  public void testBreakExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/breakExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("forExpression.kt")
  public void testForExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/forExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionCall.kt")
  public void testFunctionCall() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/functionCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inParens.kt")
  public void testInParens() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/inParens.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("incompleteGet.kt")
  public void testIncompleteGet() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/incompleteGet.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("insideStringTemplate.kt")
  public void testInsideStringTemplate() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/insideStringTemplate.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("insideStringTemplateWithBinrary.kt")
  public void testInsideStringTemplateWithBinrary() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/insideStringTemplateWithBinrary.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("intLiteral.kt")
  public void testIntLiteral() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/intLiteral.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaEnhancedType.kt")
  public void testJavaEnhancedType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/javaEnhancedType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("javaEnhancedTypeExternalAnnotation.kt")
  public void testJavaEnhancedTypeExternalAnnotation() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/javaEnhancedTypeExternalAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("listElement_listOf.kt")
  public void testListElement_listOf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/listElement_listOf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("listElement_mutableListOf.kt")
  public void testListElement_mutableListOf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/listElement_mutableListOf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("list_listOf.kt")
  public void testList_listOf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/list_listOf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("list_mutableListOf.kt")
  public void testList_mutableListOf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/list_mutableListOf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nameReference.kt")
  public void testNameReference() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nonExpression.kt")
  public void testNonExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nonExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("platformType.kt")
  public void testPlatformType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/platformType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("plusAssign.kt")
  public void testPlusAssign() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/plusAssign.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("postfixDec.kt")
  public void testPostfixDec() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/postfixDec.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("prefixInc.kt")
  public void testPrefixInc() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/prefixInc.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("property.kt")
  public void testProperty() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/property.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("resolvedSuper.kt")
  public void testResolvedSuper() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/resolvedSuper.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnExpression.kt")
  public void testReturnExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/returnExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("singleExpressionLambdaBody.kt")
  public void testSingleExpressionLambdaBody() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/singleExpressionLambdaBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smartcast_asCallArg.kt")
  public void testSmartcast_asCallArg() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/smartcast_asCallArg.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smartcast_asReceiver.kt")
  public void testSmartcast_asReceiver() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/smartcast_asReceiver.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smartcast_multi.kt")
  public void testSmartcast_multi() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/smartcast_multi.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smartcast_unused.kt")
  public void testSmartcast_unused() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/smartcast_unused.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("stringLiteral.kt")
  public void testStringLiteral() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/stringLiteral.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("underscoreTypeArgument.kt")
  public void testUnderscoreTypeArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/underscoreTypeArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedSuper_multipleSuperTypes.kt")
  public void testUnresolvedSuper_multipleSuperTypes() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/unresolvedSuper_multipleSuperTypes.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedSuper_noSuperType.kt")
  public void testUnresolvedSuper_noSuperType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/unresolvedSuper_noSuperType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("unresolvedSuper_singleSuperType.kt")
  public void testUnresolvedSuper_singleSuperType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/unresolvedSuper_singleSuperType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whileExpression.kt")
  public void testWhileExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/whileExpression.kt");
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment")
  @TestDataPath("$PROJECT_ROOT")
  public class Assignment {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInAssignment() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayAssignementTarget.kt")
    public void testArrayAssignementTarget() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/arrayAssignementTarget.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayAssignmentTargetUnresovledSet.kt")
    public void testArrayAssignmentTargetUnresovledSet() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/arrayAssignmentTargetUnresovledSet.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayAssignmentTargetWithTypeParameters.kt")
    public void testArrayAssignmentTargetWithTypeParameters() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/arrayAssignmentTargetWithTypeParameters.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayCompoundAssignementTarget.kt")
    public void testArrayCompoundAssignementTarget() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/arrayCompoundAssignementTarget.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("augmentedArrayAssigment.kt")
    public void testAugmentedArrayAssigment() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/augmentedArrayAssigment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("readArrayElement.kt")
    public void testReadArrayElement() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/assignment/readArrayElement.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference")
  @TestDataPath("$PROJECT_ROOT")
  public class NameReference {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInNameReference() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignment.kt")
    public void testAssignment() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/assignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignment_qualified.kt")
    public void testAssignment_qualified() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/assignment_qualified.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callableReference.kt")
    public void testCallableReference() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/callableReference.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("capturedBoundType.kt")
    public void testCapturedBoundType() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/capturedBoundType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCall.kt")
    public void testFunctionCall() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCall_invalid.kt")
    public void testFunctionCall_invalid() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionCall_invalid.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCall_safeAccess.kt")
    public void testFunctionCall_safeAccess() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionCall_safeAccess.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionalType.kt")
    public void testFunctionalType() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionalType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionalType_parens_1.kt")
    public void testFunctionalType_parens_1() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionalType_parens_1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionalType_parens_2.kt")
    public void testFunctionalType_parens_2() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionalType_parens_2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionalType_withReceiver.kt")
    public void testFunctionalType_withReceiver() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/functionalType_withReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("innerType_constructor.kt")
    public void testInnerType_constructor() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/innerType_constructor.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("innerType_constructor_invalid.kt")
    public void testInnerType_constructor_invalid() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/innerType_constructor_invalid.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("invokeCallOnObject1.kt")
    public void testInvokeCallOnObject1() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/invokeCallOnObject1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("invokeCallOnObject2.kt")
    public void testInvokeCallOnObject2() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/invokeCallOnObject2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedType_constructor.kt")
    public void testNestedType_constructor() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/nestedType_constructor.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedType_constructor_invalid.kt")
    public void testNestedType_constructor_invalid() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/nestedType_constructor_invalid.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedType_object.kt")
    public void testNestedType_object() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/nestedType_object.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedType_object_extensionInvoke.kt")
    public void testNestedType_object_extensionInvoke() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/nestedType_object_extensionInvoke.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("propertyCall.kt")
    public void testPropertyCall() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/propertyCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("propertyCall_genericExtension.kt")
    public void testPropertyCall_genericExtension() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/propertyCall_genericExtension.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("propertyCall_safeAccess.kt")
    public void testPropertyCall_safeAccess() {
      runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expressionType/nameReference/propertyCall_safeAccess.kt");
    }
  }
}
