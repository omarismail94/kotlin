/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.frontend.api.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/testData/components/importOptimizer")
@TestDataPath("$PROJECT_ROOT")
public class HLImportOptimizerTestGenerated extends AbstractHLImportOptimizerTest {
    @Test
    public void testAllFilesPresentInImportOptimizer() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-frontend-fir/testData/components/importOptimizer"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("unusedAliasedTypeImport.kt")
    public void testUnusedAliasedTypeImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/unusedAliasedTypeImport.kt");
    }

    @Test
    @TestMetadata("unusedFunctionImports.kt")
    public void testUnusedFunctionImports() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/unusedFunctionImports.kt");
    }

    @Test
    @TestMetadata("unusedInvokeOperatorImport.kt")
    public void testUnusedInvokeOperatorImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/unusedInvokeOperatorImport.kt");
    }

    @Test
    @TestMetadata("usedAliasedTypeImport.kt")
    public void testUsedAliasedTypeImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/usedAliasedTypeImport.kt");
    }

    @Test
    @TestMetadata("usedFunctionImport.kt")
    public void testUsedFunctionImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/usedFunctionImport.kt");
    }

    @Test
    @TestMetadata("usedInvokeOperatorAliasedImport.kt")
    public void testUsedInvokeOperatorAliasedImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/usedInvokeOperatorAliasedImport.kt");
    }

    @Test
    @TestMetadata("usedInvokeOperatorExplicitImport.kt")
    public void testUsedInvokeOperatorExplicitImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/usedInvokeOperatorExplicitImport.kt");
    }

    @Test
    @TestMetadata("usedInvokeOperatorImport.kt")
    public void testUsedInvokeOperatorImport() throws Exception {
        runTest("idea/idea-frontend-fir/testData/components/importOptimizer/usedInvokeOperatorImport.kt");
    }
}
