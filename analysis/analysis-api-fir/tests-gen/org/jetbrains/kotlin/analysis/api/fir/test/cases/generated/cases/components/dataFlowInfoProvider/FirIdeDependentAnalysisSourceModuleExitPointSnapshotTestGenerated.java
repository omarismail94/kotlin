/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.dataFlowInfoProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.dataFlowInfoProvider.AbstractExitPointSnapshotTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleExitPointSnapshotTestGenerated extends AbstractExitPointSnapshotTest {
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
  public void testAllFilesPresentInExitPointSnapshot() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow")
  @TestDataPath("$PROJECT_ROOT")
  public class ControlFlow {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInControlFlow() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("breakContinue.kt")
    public void testBreakContinue() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/breakContinue.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("breakReturn.kt")
    public void testBreakReturn() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/breakReturn.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("breakReturn2.kt")
    public void testBreakReturn2() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/breakReturn2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("continueReturn.kt")
    public void testContinueReturn() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/continueReturn.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("continueReturn2.kt")
    public void testContinueReturn2() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/continueReturn2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("defaultTryCatch.kt")
    public void testDefaultTryCatch() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/defaultTryCatch.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("defaultTryCatch2.kt")
    public void testDefaultTryCatch2() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/defaultTryCatch2.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps")
    @TestDataPath("$PROJECT_ROOT")
    public class ConditionalJumps {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInConditionalJumps() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break.kt")
      public void testBreak() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/break.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break2.kt")
      public void testBreak2() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/break2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break3.kt")
      public void testBreak3() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/break3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break4.kt")
      public void testBreak4() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/break4.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break5.kt")
      public void testBreak5() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/break5.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return.kt")
      public void testReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/return.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return2.kt")
      public void testReturn2() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/return2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return3.kt")
      public void testReturn3() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/conditionalJumps/return3.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps")
    @TestDataPath("$PROJECT_ROOT")
    public class DefiniteJumps {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInDefiniteJumps() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return.kt")
      public void testReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps/return.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return2.kt")
      public void testReturn2() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps/return2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return3.kt")
      public void testReturn3() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps/return3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return4.kt")
      public void testReturn4() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/definiteJumps/return4.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/differentTargets")
    @TestDataPath("$PROJECT_ROOT")
    public class DifferentTargets {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInDifferentTargets() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/differentTargets"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break.kt")
      public void testBreak() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/differentTargets/break.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("return.kt")
      public void testReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/differentTargets/return.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence")
    @TestDataPath("$PROJECT_ROOT")
    public class ExitPointEquivalence {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInExitPointEquivalence() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("breakAndReturn.kt")
      public void testBreakAndReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/breakAndReturn.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("breakContinueAndDefault.kt")
      public void testBreakContinueAndDefault() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/breakContinueAndDefault.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("continueAndReturn.kt")
      public void testContinueAndReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/continueAndReturn.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("defaultAndBreak.kt")
      public void testDefaultAndBreak() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/defaultAndBreak.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("defaultAndContinue.kt")
      public void testDefaultAndContinue() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/defaultAndContinue.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("defaultAndReturn.kt")
      public void testDefaultAndReturn() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/defaultAndReturn.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("defaultAndReturnInWhen.kt")
      public void testDefaultAndReturnInWhen() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/defaultAndReturnInWhen.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("defaultAndReturnInWhen2.kt")
      public void testDefaultAndReturnInWhen2() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/defaultAndReturnInWhen2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("multipleBreaks.kt")
      public void testMultipleBreaks() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/exitPointEquivalence/multipleBreaks.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps")
    @TestDataPath("$PROJECT_ROOT")
    public class UnconditionalJumps {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInUnconditionalJumps() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break.kt")
      public void testBreak() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps/break.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break2.kt")
      public void testBreak2() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps/break2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break3.kt")
      public void testBreak3() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps/break3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("break4.kt")
      public void testBreak4() {
        runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/controlFlow/unconditionalJumps/break4.kt");
      }
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues")
  @TestDataPath("$PROJECT_ROOT")
  public class DefaultValues {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInDefaultValues() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("anonymousFunction.kt")
    public void testAnonymousFunction() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/anonymousFunction.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/anonymousObject.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentTarget.kt")
    public void testAssignmentTarget() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/assignmentTarget.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentValue.kt")
    public void testAssignmentValue() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/assignmentValue.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("calleeExpression.kt")
    public void testCalleeExpression() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/calleeExpression.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("errorDefaultType.kt")
    public void testErrorDefaultType() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/errorDefaultType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("expressionBlock.kt")
    public void testExpressionBlock() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/expressionBlock.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("flexibleDefaultType.kt")
    public void testFlexibleDefaultType() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/flexibleDefaultType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionBodyBlock.kt")
    public void testFunctionBodyBlock() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/functionBodyBlock.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCall.kt")
    public void testFunctionCall() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/functionCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("infixOperator.kt")
    public void testInfixOperator() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/infixOperator.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaExpression.kt")
    public void testLambdaExpression() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/lambdaExpression.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nullableDefaultType.kt")
    public void testNullableDefaultType() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/nullableDefaultType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("packageQualifier.kt")
    public void testPackageQualifier() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/packageQualifier.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("singleTypedExpression.kt")
    public void testSingleTypedExpression() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/singleTypedExpression.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("suspendFunctionCall.kt")
    public void testSuspendFunctionCall() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/suspendFunctionCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("typeQualifier.kt")
    public void testTypeQualifier() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/typeQualifier.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableDeclaration.kt")
    public void testVariableDeclaration() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/variableDeclaration.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("while.kt")
    public void testWhile() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/defaultValues/while.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs")
  @TestDataPath("$PROJECT_ROOT")
  public class LanguageConstructs {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInLanguageConstructs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayLiteral.kt")
    public void testArrayLiteral() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/arrayLiteral.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("labeledReturn.kt")
    public void testLabeledReturn() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/labeledReturn.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nonLocalReturn.kt")
    public void testNonLocalReturn() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/nonLocalReturn.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nonLocalReturn2.kt")
    public void testNonLocalReturn2() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/nonLocalReturn2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("parameter.kt")
    public void testParameter() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/parameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("parameterDefaultValue.kt")
    public void testParameterDefaultValue() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/parameterDefaultValue.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("return.kt")
    public void testReturn() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/return.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("trailingSemicolon.kt")
    public void testTrailingSemicolon() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/languageConstructs/trailingSemicolon.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables")
  @TestDataPath("$PROJECT_ROOT")
  public class Variables {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInVariables() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayElementAugmentedReassignment.kt")
    public void testArrayElementAugmentedReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/arrayElementAugmentedReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayElementIncrementPostfix.kt")
    public void testArrayElementIncrementPostfix() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/arrayElementIncrementPostfix.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayElementIncrementPrefix.kt")
    public void testArrayElementIncrementPrefix() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/arrayElementIncrementPrefix.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("augmentedReassignment.kt")
    public void testAugmentedReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/augmentedReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("classPropertyReassignment.kt")
    public void testClassPropertyReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/classPropertyReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("conditionalReassignment.kt")
    public void testConditionalReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/conditionalReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("destructuredReassignment.kt")
    public void testDestructuredReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/destructuredReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("errorTargetReassignment.kt")
    public void testErrorTargetReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/errorTargetReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("incrementPostfix.kt")
    public void testIncrementPostfix() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/incrementPostfix.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("incrementPrefix.kt")
    public void testIncrementPrefix() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/incrementPrefix.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaParameterReassignment.kt")
    public void testLambdaParameterReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/lambdaParameterReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("localVariable.kt")
    public void testLocalVariable() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/localVariable.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("parameterReassignment.kt")
    public void testParameterReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/parameterReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleReassignment.kt")
    public void testSimpleReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/simpleReassignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("topLevelPropertyReassignment.kt")
    public void testTopLevelPropertyReassignment() {
      runTest("analysis/analysis-api/testData/components/dataFlowInfoProvider/exitPointSnapshot/variables/topLevelPropertyReassignment.kt");
    }
  }
}
