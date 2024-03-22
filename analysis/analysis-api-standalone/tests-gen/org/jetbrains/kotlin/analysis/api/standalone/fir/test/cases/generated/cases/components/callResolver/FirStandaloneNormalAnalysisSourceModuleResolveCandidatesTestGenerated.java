/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.components.callResolver;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.callResolver.AbstractResolveCandidatesTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleResolveCandidatesTestGenerated extends AbstractResolveCandidatesTest {
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
  public void testAllFilesPresentInResolveCandidates() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates")
  @TestDataPath("$PROJECT_ROOT")
  public class MultipleCandidates {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInMultipleCandidates() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ambiguous.kt")
    public void testAmbiguous() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/ambiguous.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ambiguousImplicitInvoke.kt")
    public void testAmbiguousImplicitInvoke() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/ambiguousImplicitInvoke.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ambiguousWithExplicitTypeParameters.kt")
    public void testAmbiguousWithExplicitTypeParameters() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/ambiguousWithExplicitTypeParameters.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ambiguousWithInferredTypeParameters.kt")
    public void testAmbiguousWithInferredTypeParameters() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/ambiguousWithInferredTypeParameters.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("delegatedConstructor.kt")
    public void testDelegatedConstructor() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/delegatedConstructor.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("forEach.kt")
    public void testForEach() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/forEach.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("groupBy.kt")
    public void testGroupBy() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/groupBy.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("implicitInvoke.kt")
    public void testImplicitInvoke() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/implicitInvoke.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("implicitInvokeWithReceiver.kt")
    public void testImplicitInvokeWithReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates/implicitInvokeWithReceiver.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates")
  @TestDataPath("$PROJECT_ROOT")
  public class NoCandidates {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInNoCandidates() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("hiddenDeprecated.kt")
    public void testHiddenDeprecated() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/hiddenDeprecated.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_elvis_1.kt")
    public void testUnresolvableOperator_elvis_1() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_elvis_1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_elvis_2.kt")
    public void testUnresolvableOperator_elvis_2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_elvis_2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_eqeqeq_1.kt")
    public void testUnresolvableOperator_eqeqeq_1() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_eqeqeq_1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_eqeqeq_2.kt")
    public void testUnresolvableOperator_eqeqeq_2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_eqeqeq_2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_excleqeq_1.kt")
    public void testUnresolvableOperator_excleqeq_1() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_excleqeq_1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvableOperator_excleqeq_2.kt")
    public void testUnresolvableOperator_excleqeq_2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvableOperator_excleqeq_2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("unresolvedReference.kt")
    public void testUnresolvedReference() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates/unresolvedReference.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate")
  @TestDataPath("$PROJECT_ROOT")
  public class SingleCandidate {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSingleCandidate() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("arrayOfInAnnotation.kt")
    public void testArrayOfInAnnotation() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/arrayOfInAnnotation.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("builderInference.kt")
    public void testBuilderInference() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/builderInference.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("checkNotNullCall.kt")
    public void testCheckNotNullCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/checkNotNullCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("checkNotNullCallAsCallee.kt")
    public void testCheckNotNullCallAsCallee() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/checkNotNullCallAsCallee.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("comparisonCall.kt")
    public void testComparisonCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/comparisonCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("consecutiveImplicitInvoke1.kt")
    public void testConsecutiveImplicitInvoke1() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/consecutiveImplicitInvoke1.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("consecutiveImplicitInvoke2.kt")
    public void testConsecutiveImplicitInvoke2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/consecutiveImplicitInvoke2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("consecutiveImplicitInvoke3.kt")
    public void testConsecutiveImplicitInvoke3() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/consecutiveImplicitInvoke3.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("delegatedConstructorApplicable.kt")
    public void testDelegatedConstructorApplicable() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/delegatedConstructorApplicable.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("delegatedConstructorInapplicable.kt")
    public void testDelegatedConstructorInapplicable() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/delegatedConstructorInapplicable.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("delegatedConstructorInapplicableDifferentParametersCount.kt")
    public void testDelegatedConstructorInapplicableDifferentParametersCount() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/delegatedConstructorInapplicableDifferentParametersCount.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("eqEqCall_fromAny.kt")
    public void testEqEqCall_fromAny() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/eqEqCall_fromAny.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("eqEqCall_fromSuperType.kt")
    public void testEqEqCall_fromSuperType() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/eqEqCall_fromSuperType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("eqEqCall_overridden.kt")
    public void testEqEqCall_overridden() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/eqEqCall_overridden.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallInTheSameFile.kt")
    public void testFunctionCallInTheSameFile() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallInTheSameFile.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithExtensionReceiverAndTypeArgument.kt")
    public void testFunctionCallWithExtensionReceiverAndTypeArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithExtensionReceiverAndTypeArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithLambdaArgument.kt")
    public void testFunctionCallWithLambdaArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithLambdaArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithNamedArgument.kt")
    public void testFunctionCallWithNamedArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithNamedArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithNonTrailingLambdaArgument.kt")
    public void testFunctionCallWithNonTrailingLambdaArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithNonTrailingLambdaArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithSpreadArgument.kt")
    public void testFunctionCallWithSpreadArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithSpreadArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithTooFewTypeArguments.kt")
    public void testFunctionCallWithTooFewTypeArguments() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithTooFewTypeArguments.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithTooFewTypeArguments2.kt")
    public void testFunctionCallWithTooFewTypeArguments2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithTooFewTypeArguments2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithTooManyTypeArguments.kt")
    public void testFunctionCallWithTooManyTypeArguments() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithTooManyTypeArguments.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithTooManyTypeArguments2.kt")
    public void testFunctionCallWithTooManyTypeArguments2() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithTooManyTypeArguments2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithTypeArgument.kt")
    public void testFunctionCallWithTypeArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithTypeArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionCallWithVarargArgument.kt")
    public void testFunctionCallWithVarargArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionCallWithVarargArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionTypeVariableCall_dispatchReceiver.kt")
    public void testFunctionTypeVariableCall_dispatchReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionTypeVariableCall_dispatchReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionTypeVariableCall_extensionReceiver.kt")
    public void testFunctionTypeVariableCall_extensionReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionTypeVariableCall_extensionReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionWithReceiverCall.kt")
    public void testFunctionWithReceiverCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionWithReceiverCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("functionWithReceiverSafeCall.kt")
    public void testFunctionWithReceiverSafeCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/functionWithReceiverSafeCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("hiddenConstructor.kt")
    public void testHiddenConstructor() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/hiddenConstructor.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("implicitConstructorDelegationCall.kt")
    public void testImplicitConstructorDelegationCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/implicitConstructorDelegationCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("implicitConstuctorCall.kt")
    public void testImplicitConstuctorCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/implicitConstuctorCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("implicitJavaConstuctorCall.kt")
    public void testImplicitJavaConstuctorCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/implicitJavaConstuctorCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedGet.kt")
    public void testIndexedGet() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedGet.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedGetWithNotEnoughArgs.kt")
    public void testIndexedGetWithNotEnoughArgs() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedGetWithNotEnoughArgs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedGetWithTooManyArgs.kt")
    public void testIndexedGetWithTooManyArgs() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedGetWithTooManyArgs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedSet.kt")
    public void testIndexedSet() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedSet.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedSetWithNotEnoughArgs.kt")
    public void testIndexedSetWithNotEnoughArgs() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedSetWithNotEnoughArgs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("indexedSetWithTooManyArgs.kt")
    public void testIndexedSetWithTooManyArgs() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/indexedSetWithTooManyArgs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("intArrayOfInAnnotation.kt")
    public void testIntArrayOfInAnnotation() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/intArrayOfInAnnotation.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("javaFunctionCall.kt")
    public void testJavaFunctionCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/javaFunctionCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("memberFunctionCallWithTypeArgument.kt")
    public void testMemberFunctionCallWithTypeArgument() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/memberFunctionCallWithTypeArgument.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("memberFunctionVsTopLevel.kt")
    public void testMemberFunctionVsTopLevel() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/memberFunctionVsTopLevel.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("overloadWithReceiver.kt")
    public void testOverloadWithReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/overloadWithReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("privateMember.kt")
    public void testPrivateMember() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/privateMember.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("resolveCallInSuperConstructorParam.kt")
    public void testResolveCallInSuperConstructorParam() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/resolveCallInSuperConstructorParam.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("samConstructorCall.kt")
    public void testSamConstructorCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/samConstructorCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleCallWithNonMatchingArgs.kt")
    public void testSimpleCallWithNonMatchingArgs() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/simpleCallWithNonMatchingArgs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("smartCastExplicitExtensionReceiver.kt")
    public void testSmartCastExplicitExtensionReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/smartCastExplicitExtensionReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunction.kt")
    public void testVariableAsFunction() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunction.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionLikeCall.kt")
    public void testVariableAsFunctionLikeCall() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionLikeCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterName.kt")
    public void testVariableAsFunctionWithParameterName() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterName.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterNameAnnotation.kt")
    public void testVariableAsFunctionWithParameterNameAnnotation() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterNameAnnotation.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterNameAnnotationConflict.kt")
    public void testVariableAsFunctionWithParameterNameAnnotationConflict() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterNameAnnotationConflict.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterNameGeneric.kt")
    public void testVariableAsFunctionWithParameterNameGeneric() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterNameGeneric.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterNameInNonFunctionType.kt")
    public void testVariableAsFunctionWithParameterNameInNonFunctionType() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterNameInNonFunctionType.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableAsFunctionWithParameterNameMixed.kt")
    public void testVariableAsFunctionWithParameterNameMixed() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableAsFunctionWithParameterNameMixed.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableWithExtensionInvoke.kt")
    public void testVariableWithExtensionInvoke() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableWithExtensionInvoke.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableWithInvokeFunctionCall_dispatchReceiver.kt")
    public void testVariableWithInvokeFunctionCall_dispatchReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableWithInvokeFunctionCall_dispatchReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableWithInvokeFunctionCall_extensionReceiver.kt")
    public void testVariableWithInvokeFunctionCall_extensionReceiver() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableWithInvokeFunctionCall_extensionReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("variableWithMemberInvoke.kt")
    public void testVariableWithMemberInvoke() {
      runTest("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate/variableWithMemberInvoke.kt");
    }
  }
}
