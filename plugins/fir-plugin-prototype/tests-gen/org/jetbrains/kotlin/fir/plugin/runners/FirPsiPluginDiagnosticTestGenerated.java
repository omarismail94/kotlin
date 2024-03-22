/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirPsiPluginDiagnosticTestGenerated extends AbstractFirPsiPluginDiagnosticTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInDiagnostics() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/checkers")
  @TestDataPath("$PROJECT_ROOT")
  public class Checkers {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInCheckers() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/checkers"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("dependencyWithoutAttributePlugin.kt")
    public void testDependencyWithoutAttributePlugin() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/dependencyWithoutAttributePlugin.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("importsWithGeneratedDeclarations.kt")
    public void testImportsWithGeneratedDeclarations() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/importsWithGeneratedDeclarations.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("mixingComposableAndNormalFunctions.kt")
    public void testMixingComposableAndNormalFunctions() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/mixingComposableAndNormalFunctions.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("signedNumbersCheckers.kt")
    public void testSignedNumbersCheckers() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/signedNumbersCheckers.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ValueOfCustomFunctionTypeAsArgumentOfInlineFunction.kt")
    public void testValueOfCustomFunctionTypeAsArgumentOfInlineFunction() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/checkers/ValueOfCustomFunctionTypeAsArgumentOfInlineFunction.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes")
  @TestDataPath("$PROJECT_ROOT")
  public class FunctionalTypes {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInFunctionalTypes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("ambigousKinds.kt")
    public void testAmbigousKinds() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/ambigousKinds.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("dependencyWithoutFunctionalKindPlugin.kt")
    public void testDependencyWithoutFunctionalKindPlugin() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/dependencyWithoutFunctionalKindPlugin.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("inference.kt")
    public void testInference() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/inference.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/functionalTypes/simple.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/memberGen")
  @TestDataPath("$PROJECT_ROOT")
  public class MemberGen {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInMemberGen() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/memberGen"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("classWithCompanionObject.kt")
    public void testClassWithCompanionObject() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/classWithCompanionObject.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("classWithGeneratedMembersAndNestedClass.kt")
    public void testClassWithGeneratedMembersAndNestedClass() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/classWithGeneratedMembersAndNestedClass.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("generatedClassWithMembersAndNestedClasses.kt")
    public void testGeneratedClassWithMembersAndNestedClasses() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/generatedClassWithMembersAndNestedClasses.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("localClassWithCompanionObject.kt")
    public void testLocalClassWithCompanionObject() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/localClassWithCompanionObject.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("topLevelCallables.kt")
    public void testTopLevelCallables() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/memberGen/topLevelCallables.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/receivers")
  @TestDataPath("$PROJECT_ROOT")
  public class Receivers {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInReceivers() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/receivers"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("callShapeBasedInjector.kt")
    public void testCallShapeBasedInjector() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/receivers/callShapeBasedInjector.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("receiverInjection.kt")
    public void testReceiverInjection() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/receivers/receiverInjection.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/status")
  @TestDataPath("$PROJECT_ROOT")
  public class Status {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInStatus() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/status"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("metaAnnotation.kt")
    public void testMetaAnnotation() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/metaAnnotation.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("metaAnnotationClashesWithSupertype.kt")
    public void testMetaAnnotationClashesWithSupertype() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/metaAnnotationClashesWithSupertype.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleAnnotation.kt")
    public void testSimpleAnnotation() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/simpleAnnotation.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("visibilityTransformation.kt")
    public void testVisibilityTransformation() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/status/visibilityTransformation.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/fir-plugin-prototype/testData/diagnostics/supertypes")
  @TestDataPath("$PROJECT_ROOT")
  public class Supertypes {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSupertypes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/diagnostics/supertypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("metaAnnotationOrder.kt")
    public void testMetaAnnotationOrder() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/metaAnnotationOrder.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("supertypeWithArgument.kt")
    public void testSupertypeWithArgument() {
      runTest("plugins/fir-plugin-prototype/testData/diagnostics/supertypes/supertypeWithArgument.kt");
    }
  }
}
