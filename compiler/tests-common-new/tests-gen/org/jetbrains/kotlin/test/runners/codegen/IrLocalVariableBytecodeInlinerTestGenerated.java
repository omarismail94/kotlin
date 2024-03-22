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
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/debug/localVariables")
@TestDataPath("$PROJECT_ROOT")
public class IrLocalVariableBytecodeInlinerTestGenerated extends AbstractIrLocalVariableBytecodeInlinerTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInLocalVariables() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("assignment.kt")
  public void testAssignment() {
    runTest("compiler/testData/debug/localVariables/assignment.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("catchClause.kt")
  public void testCatchClause() {
    runTest("compiler/testData/debug/localVariables/catchClause.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("copyFunction.kt")
  public void testCopyFunction() {
    runTest("compiler/testData/debug/localVariables/copyFunction.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("directInvoke.kt")
  public void testDirectInvoke() {
    runTest("compiler/testData/debug/localVariables/directInvoke.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("doWhile.kt")
  public void testDoWhile() {
    runTest("compiler/testData/debug/localVariables/doWhile.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("emptyFun.kt")
  public void testEmptyFun() {
    runTest("compiler/testData/debug/localVariables/emptyFun.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("forLoopMultiline.kt")
  public void testForLoopMultiline() {
    runTest("compiler/testData/debug/localVariables/forLoopMultiline.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineFunInObject.kt")
  public void testInlineFunInObject() {
    runTest("compiler/testData/debug/localVariables/inlineFunInObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("inlineProperty.kt")
  public void testInlineProperty() {
    runTest("compiler/testData/debug/localVariables/inlineProperty.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("jvmOverloads.kt")
  public void testJvmOverloads() {
    runTest("compiler/testData/debug/localVariables/jvmOverloads.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaInObject.kt")
  public void testLambdaInObject() {
    runTest("compiler/testData/debug/localVariables/lambdaInObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("lambdaWithLambdaParameter.kt")
  public void testLambdaWithLambdaParameter() {
    runTest("compiler/testData/debug/localVariables/lambdaWithLambdaParameter.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFun.kt")
  public void testLocalFun() {
    runTest("compiler/testData/debug/localVariables/localFun.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localFunUnused.kt")
  public void testLocalFunUnused() {
    runTest("compiler/testData/debug/localVariables/localFunUnused.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("manyInlineFunsInObject.kt")
  public void testManyInlineFunsInObject() {
    runTest("compiler/testData/debug/localVariables/manyInlineFunsInObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally.kt")
  public void testTryFinally() {
    runTest("compiler/testData/debug/localVariables/tryFinally.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally10.kt")
  public void testTryFinally10() {
    runTest("compiler/testData/debug/localVariables/tryFinally10.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally11.kt")
  public void testTryFinally11() {
    runTest("compiler/testData/debug/localVariables/tryFinally11.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally12.kt")
  public void testTryFinally12() {
    runTest("compiler/testData/debug/localVariables/tryFinally12.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally13.kt")
  public void testTryFinally13() {
    runTest("compiler/testData/debug/localVariables/tryFinally13.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally14.kt")
  public void testTryFinally14() {
    runTest("compiler/testData/debug/localVariables/tryFinally14.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally15.kt")
  public void testTryFinally15() {
    runTest("compiler/testData/debug/localVariables/tryFinally15.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally16.kt")
  public void testTryFinally16() {
    runTest("compiler/testData/debug/localVariables/tryFinally16.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally17.kt")
  public void testTryFinally17() {
    runTest("compiler/testData/debug/localVariables/tryFinally17.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally2.kt")
  public void testTryFinally2() {
    runTest("compiler/testData/debug/localVariables/tryFinally2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally3.kt")
  public void testTryFinally3() {
    runTest("compiler/testData/debug/localVariables/tryFinally3.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally4.kt")
  public void testTryFinally4() {
    runTest("compiler/testData/debug/localVariables/tryFinally4.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally5.kt")
  public void testTryFinally5() {
    runTest("compiler/testData/debug/localVariables/tryFinally5.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally6_1.kt")
  public void testTryFinally6_1() {
    runTest("compiler/testData/debug/localVariables/tryFinally6_1.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally6_2.kt")
  public void testTryFinally6_2() {
    runTest("compiler/testData/debug/localVariables/tryFinally6_2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally7.kt")
  public void testTryFinally7() {
    runTest("compiler/testData/debug/localVariables/tryFinally7.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally8.kt")
  public void testTryFinally8() {
    runTest("compiler/testData/debug/localVariables/tryFinally8.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("tryFinally9.kt")
  public void testTryFinally9() {
    runTest("compiler/testData/debug/localVariables/tryFinally9.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("underscoreNames.kt")
  public void testUnderscoreNames() {
    runTest("compiler/testData/debug/localVariables/underscoreNames.kt");
  }

  @Nested
  @TestMetadata("compiler/testData/debug/localVariables/constructors")
  @TestDataPath("$PROJECT_ROOT")
  public class Constructors {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInConstructors() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/constructors"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("multipleConstructors.kt")
    public void testMultipleConstructors() {
      runTest("compiler/testData/debug/localVariables/constructors/multipleConstructors.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("property.kt")
    public void testProperty() {
      runTest("compiler/testData/debug/localVariables/constructors/property.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/debug/localVariables/destructuring")
  @TestDataPath("$PROJECT_ROOT")
  public class Destructuring {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInDestructuring() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/destructuring"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignment.kt")
    public void testAssignment() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentCustomComponentNs.kt")
    public void testAssignmentCustomComponentNs() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignmentCustomComponentNs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentCustomComponentNsMultiline.kt")
    public void testAssignmentCustomComponentNsMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignmentCustomComponentNsMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentMultiline.kt")
    public void testAssignmentMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignmentMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentUnderscoreNames.kt")
    public void testAssignmentUnderscoreNames() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignmentUnderscoreNames.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("assignmentUnderscoreNamesMultiline.kt")
    public void testAssignmentUnderscoreNamesMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/assignmentUnderscoreNamesMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("forLoop.kt")
    public void testForLoop() {
      runTest("compiler/testData/debug/localVariables/destructuring/forLoop.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("forLoopMultiline.kt")
    public void testForLoopMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/forLoopMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambda.kt")
    public void testLambda() {
      runTest("compiler/testData/debug/localVariables/destructuring/lambda.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaCustomComponentNs.kt")
    public void testLambdaCustomComponentNs() {
      runTest("compiler/testData/debug/localVariables/destructuring/lambdaCustomComponentNs.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaCustomComponentNsMultiline.kt")
    public void testLambdaCustomComponentNsMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/lambdaCustomComponentNsMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaMultiline.kt")
    public void testLambdaMultiline() {
      runTest("compiler/testData/debug/localVariables/destructuring/lambdaMultiline.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaMultipleDestructs.kt")
    public void testLambdaMultipleDestructs() {
      runTest("compiler/testData/debug/localVariables/destructuring/lambdaMultipleDestructs.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/debug/localVariables/inlineScopes")
  @TestDataPath("$PROJECT_ROOT")
  public class InlineScopes {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInInlineScopes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/inlineScopes"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld")
    @TestDataPath("$PROJECT_ROOT")
    public class NewFormatToOld {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInNewFormatToOld() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes1.kt")
      public void testInlineScopes1() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes1.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes10.kt")
      public void testInlineScopes10() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes10.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes2.kt")
      public void testInlineScopes2() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes3.kt")
      public void testInlineScopes3() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes4.kt")
      public void testInlineScopes4() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes4.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes5.kt")
      public void testInlineScopes5() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes5.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes6.kt")
      public void testInlineScopes6() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes6.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes7.kt")
      public void testInlineScopes7() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes7.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes8.kt")
      public void testInlineScopes8() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes8.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes9.kt")
      public void testInlineScopes9() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/newFormatToOld/inlineScopes9.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew")
    @TestDataPath("$PROJECT_ROOT")
    public class OldFormatToNew {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInOldFormatToNew() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes1.kt")
      public void testInlineScopes1() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes1.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes10.kt")
      public void testInlineScopes10() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes10.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes2.kt")
      public void testInlineScopes2() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes2.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes3.kt")
      public void testInlineScopes3() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes3.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes4.kt")
      public void testInlineScopes4() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes4.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes5.kt")
      public void testInlineScopes5() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes5.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes6.kt")
      public void testInlineScopes6() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes6.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes7.kt")
      public void testInlineScopes7() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes7.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes8.kt")
      public void testInlineScopes8() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes8.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("inlineScopes9.kt")
      public void testInlineScopes9() {
        runTest("compiler/testData/debug/localVariables/inlineScopes/oldFormatToNew/inlineScopes9.kt");
      }
    }
  }

  @Nested
  @TestMetadata("compiler/testData/debug/localVariables/receiverMangling")
  @TestDataPath("$PROJECT_ROOT")
  public class ReceiverMangling {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInReceiverMangling() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/receiverMangling"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("capturedThisField.kt")
    public void testCapturedThisField() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/capturedThisField.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("labeledThisParameterLabel.kt")
    public void testLabeledThisParameterLabel() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/labeledThisParameterLabel.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("lambdaWithExtensionReceiver.kt")
    public void testLambdaWithExtensionReceiver() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/lambdaWithExtensionReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("receiverParameter.kt")
    public void testReceiverParameter() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/receiverParameter.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleCapturedReceiver.kt")
    public void testSimpleCapturedReceiver() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiver.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleCapturedReceiverWithLabel.kt")
    public void testSimpleCapturedReceiverWithLabel() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiverWithLabel.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simpleCapturedReceiverWithParenthesis.kt")
    public void testSimpleCapturedReceiverWithParenthesis() {
      runTest("compiler/testData/debug/localVariables/receiverMangling/simpleCapturedReceiverWithParenthesis.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/debug/localVariables/suspend")
  @TestDataPath("$PROJECT_ROOT")
  public class Suspend {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSuspend() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/suspend"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("inlineLocalsStateMachineTransform.kt")
    public void testInlineLocalsStateMachineTransform() {
      runTest("compiler/testData/debug/localVariables/suspend/inlineLocalsStateMachineTransform.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("localsStateMachineTransform.kt")
    public void testLocalsStateMachineTransform() {
      runTest("compiler/testData/debug/localVariables/suspend/localsStateMachineTransform.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("mergeLvt.kt")
    public void testMergeLvt() {
      runTest("compiler/testData/debug/localVariables/suspend/mergeLvt.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedInsideSuspendUnintercepted.kt")
    public void testNestedInsideSuspendUnintercepted() {
      runTest("compiler/testData/debug/localVariables/suspend/nestedInsideSuspendUnintercepted.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedSuspendUnintercepted.kt")
    public void testNestedSuspendUnintercepted() {
      runTest("compiler/testData/debug/localVariables/suspend/nestedSuspendUnintercepted.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("nestedSuspendUninterceptedWithDeepLambdaCall.kt")
    public void testNestedSuspendUninterceptedWithDeepLambdaCall() {
      runTest("compiler/testData/debug/localVariables/suspend/nestedSuspendUninterceptedWithDeepLambdaCall.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/debug/localVariables/suspend/simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("underscoreNames.kt")
    public void testUnderscoreNames() {
      runTest("compiler/testData/debug/localVariables/suspend/underscoreNames.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/debug/localVariables/suspend/completion")
    @TestDataPath("$PROJECT_ROOT")
    public class Completion {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInCompletion() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/debug/localVariables/suspend/completion"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("nonStaticSimple.kt")
      public void testNonStaticSimple() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/nonStaticSimple.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("nonStaticStateMachine.kt")
      public void testNonStaticStateMachine() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/nonStaticStateMachine.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("staticSimple.kt")
      public void testStaticSimple() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/staticSimple.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("staticSimpleReceiver.kt")
      public void testStaticSimpleReceiver() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/staticSimpleReceiver.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("staticStateMachine.kt")
      public void testStaticStateMachine() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/staticStateMachine.kt");
      }

      @RepeatedTest(value = 5)
      @TestMetadata("staticStateMachineReceiver.kt")
      public void testStaticStateMachineReceiver() {
        runTest("compiler/testData/debug/localVariables/suspend/completion/staticStateMachineReceiver.kt");
      }
    }
  }
}
