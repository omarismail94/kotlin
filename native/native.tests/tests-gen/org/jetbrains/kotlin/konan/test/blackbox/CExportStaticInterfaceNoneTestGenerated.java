/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.konan.test.blackbox.support.EnforcedProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.ClassLevelProperty;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/CExport/InterfaceNone")
@TestDataPath("$PROJECT_ROOT")
@EnforcedProperty(property = ClassLevelProperty.BINARY_LIBRARY_KIND, propertyValue = "STATIC")
@EnforcedProperty(property = ClassLevelProperty.C_INTERFACE_MODE, propertyValue = "NONE")
public class CExportStaticInterfaceNoneTestGenerated extends AbstractNativeCExportTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInInterfaceNone() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/CExport/InterfaceNone"), Pattern.compile("^([^_](.+))$"), null, false);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("nativeRefs")
  public void testNativeRefs() {
    runTest("native/native.tests/testData/CExport/InterfaceNone/nativeRefs/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("primitiveTypes")
  public void testPrimitiveTypes() {
    runTest("native/native.tests/testData/CExport/InterfaceNone/primitiveTypes/");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("smoke0")
  public void testSmoke0() {
    runTest("native/native.tests/testData/CExport/InterfaceNone/smoke0/");
  }
}
