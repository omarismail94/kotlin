/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class FirInfrastructureTestGenerated extends AbstractNativeBlackBoxTest {
  @Nested
  @TestMetadata("native/native.tests/testData/samples")
  @TestDataPath("$PROJECT_ROOT")
  @Tag("infrastructure")
  @Tag("frontend-fir")
  @FirPipeline()
  @UseStandardTestCaseGroupProvider()
  public class Samples {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSamples() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_custom_args.kt")
    public void testRegular_custom_args() {
      runTest("native/native.tests/testData/samples/regular_custom_args.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multifile.kt")
    public void testRegular_multifile() {
      runTest("native/native.tests/testData/samples/regular_multifile.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multifile_with_explicit_packages.kt")
    public void testRegular_multifile_with_explicit_packages() {
      runTest("native/native.tests/testData/samples/regular_multifile_with_explicit_packages.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule.kt")
    public void testRegular_multimodule() {
      runTest("native/native.tests/testData/samples/regular_multimodule.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule_implicit_first_module.kt")
    public void testRegular_multimodule_implicit_first_module() {
      runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule_implicit_first_module_with_header_comment.kt")
    public void testRegular_multimodule_implicit_first_module_with_header_comment() {
      runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module_with_header_comment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule_implicit_first_module_with_header_statement.kt")
    public void testRegular_multimodule_implicit_first_module_with_header_statement() {
      runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module_with_header_statement.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule_with_header_comment.kt")
    public void testRegular_multimodule_with_header_comment() {
      runTest("native/native.tests/testData/samples/regular_multimodule_with_header_comment.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_multimodule_with_header_statement.kt")
    public void testRegular_multimodule_with_header_statement() {
      runTest("native/native.tests/testData/samples/regular_multimodule_with_header_statement.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple.kt")
    public void testRegular_simple() {
      runTest("native/native.tests/testData/samples/regular_simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple_default_tr.kt")
    public void testRegular_simple_default_tr() {
      runTest("native/native.tests/testData/samples/regular_simple_default_tr.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple_explicit_kind.kt")
    public void testRegular_simple_explicit_kind() {
      runTest("native/native.tests/testData/samples/regular_simple_explicit_kind.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple_noexit_tr.kt")
    public void testRegular_simple_noexit_tr() {
      runTest("native/native.tests/testData/samples/regular_simple_noexit_tr.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple_with_output.kt")
    public void testRegular_simple_with_output() {
      runTest("native/native.tests/testData/samples/regular_simple_with_output.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple_worker_tr.kt")
    public void testRegular_simple_worker_tr() {
      runTest("native/native.tests/testData/samples/regular_simple_worker_tr.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_lldb_stepping.kt")
    public void testStandalone_lldb_stepping() {
      runTest("native/native.tests/testData/samples/standalone_lldb_stepping.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_multifile.kt")
    public void testStandalone_multifile() {
      runTest("native/native.tests/testData/samples/standalone_multifile.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_long_running.kt")
    public void testStandalone_notr_long_running() {
      runTest("native/native.tests/testData/samples/standalone_notr_long_running.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_long_running_and_verbose.kt")
    public void testStandalone_notr_long_running_and_verbose() {
      runTest("native/native.tests/testData/samples/standalone_notr_long_running_and_verbose.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_multifile_entry_point.kt")
    public void testStandalone_notr_multifile_entry_point() {
      runTest("native/native.tests/testData/samples/standalone_notr_multifile_entry_point.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_nonzero_exit_code.kt")
    public void testStandalone_notr_nonzero_exit_code() {
      runTest("native/native.tests/testData/samples/standalone_notr_nonzero_exit_code.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_nonzero_exit_code2.kt")
    public void testStandalone_notr_nonzero_exit_code2() {
      runTest("native/native.tests/testData/samples/standalone_notr_nonzero_exit_code2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple.kt")
    public void testStandalone_notr_simple() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple2.kt")
    public void testStandalone_notr_simple2() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple_entry_point.kt")
    public void testStandalone_notr_simple_entry_point() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple_entry_point.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple_entry_point2.kt")
    public void testStandalone_notr_simple_entry_point2() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple_entry_point2.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple_with_input_and_output.kt")
    public void testStandalone_notr_simple_with_input_and_output() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple_with_input_and_output.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_simple_with_output.kt")
    public void testStandalone_notr_simple_with_output() {
      runTest("native/native.tests/testData/samples/standalone_notr_simple_with_output.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_too_verbose.kt")
    public void testStandalone_notr_too_verbose() {
      runTest("native/native.tests/testData/samples/standalone_notr_too_verbose.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_notr_zero_exit_code.kt")
    public void testStandalone_notr_zero_exit_code() {
      runTest("native/native.tests/testData/samples/standalone_notr_zero_exit_code.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_simple.kt")
    public void testStandalone_simple() {
      runTest("native/native.tests/testData/samples/standalone_simple.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_simple_default_tr.kt")
    public void testStandalone_simple_default_tr() {
      runTest("native/native.tests/testData/samples/standalone_simple_default_tr.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_simple_noexit_tr.kt")
    public void testStandalone_simple_noexit_tr() {
      runTest("native/native.tests/testData/samples/standalone_simple_noexit_tr.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_simple_with_output.kt")
    public void testStandalone_simple_with_output() {
      runTest("native/native.tests/testData/samples/standalone_simple_with_output.kt");
    }

    @RepeatedTest(value = 5)
    @TestMetadata("standalone_simple_worker_tr.kt")
    public void testStandalone_simple_worker_tr() {
      runTest("native/native.tests/testData/samples/standalone_simple_worker_tr.kt");
    }

    @Nested
    @TestMetadata("native/native.tests/testData/samples/inner")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("infrastructure")
    @Tag("frontend-fir")
    @FirPipeline()
    @UseStandardTestCaseGroupProvider()
    public class Inner {
      @RepeatedTest(value = 5)
      public void testAllFilesPresentInInner() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples/inner"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @RepeatedTest(value = 5)
      @TestMetadata("regular_simple.kt")
      public void testRegular_simple() {
        runTest("native/native.tests/testData/samples/inner/regular_simple.kt");
      }
    }
  }

  @Nested
  @TestMetadata("native/native.tests/testData/samples2")
  @TestDataPath("$PROJECT_ROOT")
  @Tag("infrastructure")
  @Tag("frontend-fir")
  @FirPipeline()
  @UseStandardTestCaseGroupProvider()
  public class Samples2 {
    @RepeatedTest(value = 5)
    public void testAllFilesPresentInSamples2() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples2"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @RepeatedTest(value = 5)
    @TestMetadata("regular_simple.kt")
    public void testRegular_simple() {
      runTest("native/native.tests/testData/samples2/regular_simple.kt");
    }
  }
}
