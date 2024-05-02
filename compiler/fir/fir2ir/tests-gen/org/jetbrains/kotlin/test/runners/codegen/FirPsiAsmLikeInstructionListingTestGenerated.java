/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/asmLike")
@TestDataPath("$PROJECT_ROOT")
public class FirPsiAsmLikeInstructionListingTestGenerated extends AbstractFirPsiAsmLikeInstructionListingTest {
  @Test
  public void testAllFilesPresentInAsmLike() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Nested
  @TestMetadata("compiler/testData/codegen/asmLike/receiverMangling")
  @TestDataPath("$PROJECT_ROOT")
  public class ReceiverMangling {
    @Test
    public void testAllFilesPresentInReceiverMangling() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/receiverMangling"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("deepInline.kt")
    public void testDeepInline() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInline.kt");
    }

    @Test
    @TestMetadata("deepInlineWithLabels.kt")
    public void testDeepInlineWithLabels() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/deepInlineWithLabels.kt");
    }

    @Test
    @TestMetadata("deepNoinline.kt")
    public void testDeepNoinline() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinline.kt");
    }

    @Test
    @TestMetadata("deepNoinlineWithLabels.kt")
    public void testDeepNoinlineWithLabels() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/deepNoinlineWithLabels.kt");
    }

    @Test
    @TestMetadata("inlineClassCapture.kt")
    public void testInlineClassCapture() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineClassCapture.kt");
    }

    @Test
    @TestMetadata("inlineReceivers.kt")
    public void testInlineReceivers() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/inlineReceivers.kt");
    }

    @Test
    @TestMetadata("localFunctions.kt")
    public void testLocalFunctions() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/localFunctions.kt");
    }

    @Test
    @TestMetadata("mangledNames.kt")
    public void testMangledNames() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/mangledNames.kt");
    }

    @Test
    @TestMetadata("nonInlineReceivers.kt")
    public void testNonInlineReceivers() {
      runTest("compiler/testData/codegen/asmLike/receiverMangling/nonInlineReceivers.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/codegen/asmLike/typeAnnotations")
  @TestDataPath("$PROJECT_ROOT")
  public class TypeAnnotations {
    @Test
    public void testAllFilesPresentInTypeAnnotations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/typeAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("classTypeParameter.kt")
    public void testClassTypeParameter() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/classTypeParameter.kt");
    }

    @Test
    @TestMetadata("complex.kt")
    public void testComplex() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/complex.kt");
    }

    @Test
    @TestMetadata("constructor.kt")
    public void testConstructor() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/constructor.kt");
    }

    @Test
    @TestMetadata("defaultArgs.kt")
    public void testDefaultArgs() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/defaultArgs.kt");
    }

    @Test
    @TestMetadata("dontEmit.kt")
    public void testDontEmit() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/dontEmit.kt");
    }

    @Test
    @TestMetadata("enumClassConstructor.kt")
    public void testEnumClassConstructor() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/enumClassConstructor.kt");
    }

    @Test
    @TestMetadata("extension.kt")
    public void testExtension() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/extension.kt");
    }

    @Test
    @TestMetadata("functionTypeParameter.kt")
    public void testFunctionTypeParameter() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/functionTypeParameter.kt");
    }

    @Test
    @TestMetadata("implicit.kt")
    public void testImplicit() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/implicit.kt");
    }

    @Test
    @TestMetadata("innerClassConstructor.kt")
    public void testInnerClassConstructor() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/innerClassConstructor.kt");
    }

    @Test
    @TestMetadata("jvmOverload.kt")
    public void testJvmOverload() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmOverload.kt");
    }

    @Test
    @TestMetadata("jvmStatic.kt")
    public void testJvmStatic() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/jvmStatic.kt");
    }

    @Test
    @TestMetadata("notYetSupported.kt")
    public void testNotYetSupported() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/notYetSupported.kt");
    }

    @Test
    @TestMetadata("property.kt")
    public void testProperty() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/property.kt");
    }

    @Test
    @TestMetadata("propertyTypeParameter.kt")
    public void testPropertyTypeParameter() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/propertyTypeParameter.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple.kt");
    }

    @Test
    @TestMetadata("simple2Params.kt")
    public void testSimple2Params() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/simple2Params.kt");
    }

    @Test
    @TestMetadata("staticNested.kt")
    public void testStaticNested() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/staticNested.kt");
    }

    @Test
    @TestMetadata("syntheticAccessors.kt")
    public void testSyntheticAccessors() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/syntheticAccessors.kt");
    }

    @Test
    @TestMetadata("typeParameter.kt")
    public void testTypeParameter() {
      runTest("compiler/testData/codegen/asmLike/typeAnnotations/typeParameter.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/codegen/asmLike/typeAnnotations/generics")
    @TestDataPath("$PROJECT_ROOT")
    public class Generics {
      @Test
      public void testAllFilesPresentInGenerics() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/asmLike/typeAnnotations/generics"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
      }

      @Test
      @TestMetadata("parameter.kt")
      public void testParameter() {
        runTest("compiler/testData/codegen/asmLike/typeAnnotations/generics/parameter.kt");
      }

      @Test
      @TestMetadata("returnType.kt")
      public void testReturnType() {
        runTest("compiler/testData/codegen/asmLike/typeAnnotations/generics/returnType.kt");
      }

      @Test
      @TestMetadata("typeParameterBound.kt")
      public void testTypeParameterBound() {
        runTest("compiler/testData/codegen/asmLike/typeAnnotations/generics/typeParameterBound.kt");
      }

      @Test
      @TestMetadata("val.kt")
      public void testVal() {
        runTest("compiler/testData/codegen/asmLike/typeAnnotations/generics/val.kt");
      }

      @Test
      @TestMetadata("var.kt")
      public void testVar() {
        runTest("compiler/testData/codegen/asmLike/typeAnnotations/generics/var.kt");
      }
    }
  }
}
