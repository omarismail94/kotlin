/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.RepeatedTest;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/lazyResolveScopes")
@TestDataPath("$PROJECT_ROOT")
public class SourceLazyDeclarationResolveScopeBasedTestGenerated extends AbstractSourceLazyDeclarationResolveScopeBasedTest {
  @RepeatedTest(value = 5)
  public void testAllFilesPresentInLazyResolveScopes() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveScopes"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
  }

  @RepeatedTest(value = 5)
  @TestMetadata("anonymousObject.kt")
  public void testAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/anonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/class.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testDelegateOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution.kt")
  public void testDelegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideAnonymousObjectWithSubstitution.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithImplicitTypeInsideClass.kt")
  public void testDelegateOverrideWithImplicitTypeInsideClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithImplicitTypeInsideClassWithSubstitution.kt")
  public void testDelegateOverrideWithImplicitTypeInsideClassWithSubstitution() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithImplicitTypeInsideClassWithSubstitution.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution.kt")
  public void testDelegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideAnonymousObjectWithSubstitution.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithoutImplicitTypeInsideClass.kt")
  public void testDelegateOverrideWithoutImplicitTypeInsideClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("delegateOverrideWithoutImplicitTypeInsideClassWithSubstitution.kt")
  public void testDelegateOverrideWithoutImplicitTypeInsideClassWithSubstitution() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/delegateOverrideWithoutImplicitTypeInsideClassWithSubstitution.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("intersectionOverride.kt")
  public void testIntersectionOverride() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverride.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("intersectionOverride2.kt")
  public void testIntersectionOverride2() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverride2.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testIntersectionOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testIntersectionOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/intersectionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("localClass.kt")
  public void testLocalClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/localClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt")
  public void testSubstitutionOverrideWithImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("substitutionOverrideWithImplicitTypeInsideClass.kt")
  public void testSubstitutionOverrideWithImplicitTypeInsideClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithImplicitTypeInsideClass.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt")
  public void testSubstitutionOverrideWithoutImplicitTypeInsideAnonymousObject() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithoutImplicitTypeInsideAnonymousObject.kt");
  }

  @RepeatedTest(value = 5)
  @TestMetadata("substitutionOverrideWithoutImplicitTypeInsideClass.kt")
  public void testSubstitutionOverrideWithoutImplicitTypeInsideClass() {
    runTest("analysis/low-level-api-fir/testData/lazyResolveScopes/substitutionOverrideWithoutImplicitTypeInsideClass.kt");
  }
}
