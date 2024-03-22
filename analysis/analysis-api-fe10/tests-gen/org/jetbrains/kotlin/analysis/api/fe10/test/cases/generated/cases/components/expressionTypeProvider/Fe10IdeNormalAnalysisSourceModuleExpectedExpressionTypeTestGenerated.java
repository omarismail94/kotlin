/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.expressionTypeProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.expressionTypeProvider.AbstractExpectedExpressionTypeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleExpectedExpressionTypeTestGenerated extends AbstractExpectedExpressionTypeTest {
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
  @TestMetadata("afterExclOperand.kt")
  public void testAfterExclOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/afterExclOperand.kt");
  }

  @RepeatedTest(value = 5)
  public void testAllFilesPresentInExpectedExpressionType() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annotationPositionalArgument.kt")
  public void testAnnotationPositionalArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/annotationPositionalArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrayAccessExpressionGet.kt")
  public void testArrayAccessExpressionGet() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionGet.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrayAccessExpressionGetWithTypeParameters.kt")
  public void testArrayAccessExpressionGetWithTypeParameters() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionGetWithTypeParameters.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrayAccessExpressionSet.kt")
  public void testArrayAccessExpressionSet() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionSet.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("arrayAccessExpressionSetWithTypeParameters.kt")
  public void testArrayAccessExpressionSetWithTypeParameters() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/arrayAccessExpressionSetWithTypeParameters.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("conditionInWhenWithSubject.kt")
  public void testConditionInWhenWithSubject() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/conditionInWhenWithSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("conditionInWhenWithoutSubject.kt")
  public void testConditionInWhenWithoutSubject() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/conditionInWhenWithoutSubject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegatedConstructorCall.kt")
  public void testDelegatedConstructorCall() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/delegatedConstructorCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("elvisExpressionLeftOperand.kt")
  public void testElvisExpressionLeftOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionLeftOperand.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("elvisExpressionLeftOperandWithoutExplicitType.kt")
  public void testElvisExpressionLeftOperandWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionLeftOperandWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("elvisExpressionRightOperand.kt")
  public void testElvisExpressionRightOperand() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionRightOperand.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("elvisExpressionRightOperandWithoutExplicitType.kt")
  public void testElvisExpressionRightOperandWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/elvisExpressionRightOperandWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionExpressionBody.kt")
  public void testFunctionExpressionBody() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionExpressionBodyBlockExpression.kt")
  public void testFunctionExpressionBodyBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyBlockExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionExpressionBodyQualified.kt")
  public void testFunctionExpressionBodyQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionExpressionBodyWithTypeFromRHS.kt")
  public void testFunctionExpressionBodyWithTypeFromRHS() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyWithTypeFromRHS.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionExpressionBodyWithoutExplicitType.kt")
  public void testFunctionExpressionBodyWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionExpressionBodyWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionLambdaParam.kt")
  public void testFunctionLambdaParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionLambdaParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionNamedlParam.kt")
  public void testFunctionNamedlParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionNamedlParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionParamWithTypeParam.kt")
  public void testFunctionParamWithTypeParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionParamWithTypeParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionPositionalParam.kt")
  public void testFunctionPositionalParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionPositionalParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionPositionalParamQualified.kt")
  public void testFunctionPositionalParamQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionPositionalParamQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionalTypeSubstitution.kt")
  public void testFunctionalTypeSubstitution() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/functionalTypeSubstitution.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifCondition.kt")
  public void testIfCondition() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/ifCondition.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("ifConditionQualified.kt")
  public void testIfConditionQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/ifConditionQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("infixFunctionAsRegularCallParam.kt")
  public void testInfixFunctionAsRegularCallParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionAsRegularCallParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("infixFunctionParam.kt")
  public void testInfixFunctionParam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionParam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("infixFunctionParamQualified.kt")
  public void testInfixFunctionParamQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionParamQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("infixFunctionTypeParameter.kt")
  public void testInfixFunctionTypeParameter() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/infixFunctionTypeParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaWithExplicitTypeFromVariable.kt")
  public void testLambdaWithExplicitTypeFromVariable() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lambdaWithExplicitTypeFromVariable.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaWithoutReturnNorExplicitType.kt")
  public void testLambdaWithoutReturnNorExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lambdaWithoutReturnNorExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInFunctionBlockBody.kt")
  public void testLastStatementInFunctionBlockBody() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInFunctionBlockBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInLambda.kt")
  public void testLastStatementInLambda() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInLambdaWithTypeMismatch.kt")
  public void testLastStatementInLambdaWithTypeMismatch() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambdaWithTypeMismatch.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInLambdaWithoutExplicitType.kt")
  public void testLastStatementInLambdaWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInLambdaWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInTry.kt")
  public void testLastStatementInTry() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInTry.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lastStatementInTryWithoutExplicitType.kt")
  public void testLastStatementInTryWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/lastStatementInTryWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclaration.kt")
  public void testPropertyDeclaration() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclaration.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationNoExplicitType.kt")
  public void testPropertyDeclarationNoExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationNoExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationQualified.kt")
  public void testPropertyDeclarationQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationWithSafeCast.kt")
  public void testPropertyDeclarationWithSafeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithSafeCast.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationWithTypeCast.kt")
  public void testPropertyDeclarationWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithTypeCast.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationWithTypeFromRHS.kt")
  public void testPropertyDeclarationWithTypeFromRHS() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithTypeFromRHS.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyDeclarationWithoutExplicitType.kt")
  public void testPropertyDeclarationWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/propertyDeclarationWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnFromFunction.kt")
  public void testReturnFromFunction() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnFromFunctionQualifiedReceiver.kt")
  public void testReturnFromFunctionQualifiedReceiver() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunctionQualifiedReceiver.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnFromFunctionQualifiedSelector.kt")
  public void testReturnFromFunctionQualifiedSelector() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromFunctionQualifiedSelector.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("returnFromLambda.kt")
  public void testReturnFromLambda() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/returnFromLambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("safeCallArgument.kt")
  public void testSafeCallArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/safeCallArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("sam.kt")
  public void testSam() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/sam.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samAsArgument.kt")
  public void testSamAsArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samAsConstructorArgument.kt")
  public void testSamAsConstructorArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsConstructorArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samAsReturn.kt")
  public void testSamAsReturn() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samAsReturn.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samReferenceAsArgument.kt")
  public void testSamReferenceAsArgument() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceAsArgument.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samReferenceAsVararg.kt")
  public void testSamReferenceAsVararg() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceAsVararg.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samReferenceWithTypeCast.kt")
  public void testSamReferenceWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samReferenceWithTypeCast.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samWithExplicitTypeFromProperty.kt")
  public void testSamWithExplicitTypeFromProperty() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithExplicitTypeFromProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samWithReturnToExplicitLabel.kt")
  public void testSamWithReturnToExplicitLabel() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithReturnToExplicitLabel.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samWithReturnToImplicitLabel.kt")
  public void testSamWithReturnToImplicitLabel() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithReturnToImplicitLabel.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("samWithTypeCast.kt")
  public void testSamWithTypeCast() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/samWithTypeCast.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInIf.kt")
  public void testStatementInIf() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIf.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInIfBlockExpression.kt")
  public void testStatementInIfBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIfBlockExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInIfWithoutExplicitType.kt")
  public void testStatementInIfWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInIfWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInWhen.kt")
  public void testStatementInWhen() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhen.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInWhenBlockExpression.kt")
  public void testStatementInWhenBlockExpression() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhenBlockExpression.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("statementInWhenWithoutExplicitType.kt")
  public void testStatementInWhenWithoutExplicitType() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/statementInWhenWithoutExplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("variableAssignment.kt")
  public void testVariableAssignment() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/variableAssignment.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("variableAssignmentQualified.kt")
  public void testVariableAssignmentQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/variableAssignmentQualified.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whileCondition.kt")
  public void testWhileCondition() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/whileCondition.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("whileConditionQualified.kt")
  public void testWhileConditionQualified() {
    runTest("analysis/analysis-api/testData/components/expressionTypeProvider/expectedExpressionType/whileConditionQualified.kt");
  }
}
