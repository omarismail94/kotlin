/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/fileStructure")
@TestDataPath("$PROJECT_ROOT")
public class FirOutOfContentRootContextCollectionTestGenerated extends AbstractFirOutOfContentRootContextCollectionTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInFileStructure() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/fileStructure"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("annonymousClass.kt")
  public void testAnnonymousClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/annonymousClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callInsideLambdaInsideSuperCallAndExplicitConstructor.kt")
  public void testCallInsideLambdaInsideSuperCallAndExplicitConstructor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/callInsideLambdaInsideSuperCallAndExplicitConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callInsideLambdaInsideSuperCallAndImplicitConstructor.kt")
  public void testCallInsideLambdaInsideSuperCallAndImplicitConstructor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/callInsideLambdaInsideSuperCallAndImplicitConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callInsideLambdaInsideSuperCallFromSecondaryConstructor.kt")
  public void testCallInsideLambdaInsideSuperCallFromSecondaryConstructor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/callInsideLambdaInsideSuperCallFromSecondaryConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("callInsideLambdaInsideSuperCallFromSingleSecondaryConstructor.kt")
  public void testCallInsideLambdaInsideSuperCallFromSingleSecondaryConstructor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/callInsideLambdaInsideSuperCallFromSingleSecondaryConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/class.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("class2.kt")
  public void testClass2() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/class2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("classMemberProperty.kt")
  public void testClassMemberProperty() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/classMemberProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorParameter.kt")
  public void testConstructorParameter() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/constructorParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorParameter2.kt")
  public void testConstructorParameter2() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/constructorParameter2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructorParameterWithAnnotations.kt")
  public void testConstructorParameterWithAnnotations() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/constructorParameterWithAnnotations.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("constructors.kt")
  public void testConstructors() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/constructors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationClassLevel.kt")
  public void testDanglingAnnotationClassLevel() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/danglingAnnotationClassLevel.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationInMiddle.kt")
  public void testDanglingAnnotationInMiddle() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/danglingAnnotationInMiddle.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("danglingAnnotationTopLevel.kt")
  public void testDanglingAnnotationTopLevel() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/danglingAnnotationTopLevel.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("declarationsInPropertyInit.kt")
  public void testDeclarationsInPropertyInit() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/declarationsInPropertyInit.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enum.kt")
  public void testEnum() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/enum.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumClass.kt")
  public void testEnumClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/enumClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("enumClassWithBody.kt")
  public void testEnumClassWithBody() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/enumClassWithBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("funWithoutTypes.kt")
  public void testFunWithoutTypes() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/funWithoutTypes.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionValueParameter.kt")
  public void testFunctionValueParameter() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionValueParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitType.kt")
  public void testFunctionWithImplicitType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndFunctionInside.kt")
  public void testFunctionWithImplicitTypeAndFunctionInside() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndFunctionInside.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndFunctionInsideLocalClass.kt")
  public void testFunctionWithImplicitTypeAndFunctionInsideLocalClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndFunctionInsideLocalClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionWithImplicitTypeAndPropertyInside.kt")
  public void testFunctionWithImplicitTypeAndPropertyInside() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionWithImplicitTypeAndPropertyInside.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("functionalType.kt")
  public void testFunctionalType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/functionalType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("initBlock.kt")
  public void testInitBlock() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/initBlock.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambda.kt")
  public void testLambda() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/lambda.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaInImplicitFunBody.kt")
  public void testLambdaInImplicitFunBody() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/lambdaInImplicitFunBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaInImplicitPropertyBody.kt")
  public void testLambdaInImplicitPropertyBody() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/lambdaInImplicitPropertyBody.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdasInWithBodyFunction.kt")
  public void testLambdasInWithBodyFunction() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/lambdasInWithBodyFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClass.kt")
  public void testLocalClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClass2.kt")
  public void testLocalClass2() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localClass2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localDeclarationsInAccessor.kt")
  public void testLocalDeclarationsInAccessor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localDeclarationsInAccessor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFun.kt")
  public void testLocalFun() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localFun.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFunctionWithImplicitType.kt")
  public void testLocalFunctionWithImplicitType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localFunctionWithImplicitType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localProperty.kt")
  public void testLocalProperty() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localUnitFunction.kt")
  public void testLocalUnitFunction() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/localUnitFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberFunctions.kt")
  public void testMemberFunctions() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/memberFunctions.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberProperties.kt")
  public void testMemberProperties() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/memberProperties.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("memberTypeAlias.kt")
  public void testMemberTypeAlias() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/memberTypeAlias.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multipleTopLevelClasses.kt")
  public void testMultipleTopLevelClasses() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/multipleTopLevelClasses.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multipleTopLevelFunctionsWithImplicitTypes.kt")
  public void testMultipleTopLevelFunctionsWithImplicitTypes() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/multipleTopLevelFunctionsWithImplicitTypes.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("multipleTopLevelUnitFunctions.kt")
  public void testMultipleTopLevelUnitFunctions() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/multipleTopLevelUnitFunctions.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedClases.kt")
  public void testNestedClases() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/nestedClases.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedClasesWithFun.kt")
  public void testNestedClasesWithFun() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/nestedClasesWithFun.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nestedClasses.kt")
  public void testNestedClasses() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/nestedClasses.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyAccessors.kt")
  public void testPropertyAccessors() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyAccessors.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithGetterAndSetter.kt")
  public void testPropertyWithGetterAndSetter() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithGetterAndSetter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithImplicitTypeAndAnnotationsInsideLocalClass.kt")
  public void testPropertyWithImplicitTypeAndAnnotationsInsideLocalClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithImplicitTypeAndAnnotationsInsideLocalClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithImplicitTypeAndFieldAnnotationsInsideLocalClass.kt")
  public void testPropertyWithImplicitTypeAndFieldAnnotationsInsideLocalClass() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithImplicitTypeAndFieldAnnotationsInsideLocalClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("propertyWithSetter.kt")
  public void testPropertyWithSetter() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/propertyWithSetter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("qualifiedCallInsideSuperCall.kt")
  public void testQualifiedCallInsideSuperCall() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/qualifiedCallInsideSuperCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("secondaryConstructor.kt")
  public void testSecondaryConstructor() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/secondaryConstructor.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superCallAnnotation.kt")
  public void testSuperCallAnnotation() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/superCallAnnotation.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superCallAnnotation2.kt")
  public void testSuperCallAnnotation2() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/superCallAnnotation2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superClassCall.kt")
  public void testSuperClassCall() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/superClassCall.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("superType.kt")
  public void testSuperType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/superType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelExpressionBodyFunWithType.kt")
  public void testTopLevelExpressionBodyFunWithType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelExpressionBodyFunWithType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelExpressionBodyFunWithoutType.kt")
  public void testTopLevelExpressionBodyFunWithoutType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelExpressionBodyFunWithoutType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelFunWithType.kt")
  public void testTopLevelFunWithType() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelFunWithType.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelProperty.kt")
  public void testTopLevelProperty() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("topLevelUnitFun.kt")
  public void testTopLevelUnitFun() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/topLevelUnitFun.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("typeAlias.kt")
  public void testTypeAlias() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/typeAlias.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("withoutName.kt")
  public void testWithoutName() {
    runTest("analysis/low-level-api-fir/testData/fileStructure/withoutName.kt");
  }
}
