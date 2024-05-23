/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.descriptors.types

import org.jetbrains.kotlin.analysis.api.KaTypeProjection
import org.jetbrains.kotlin.analysis.api.descriptors.Fe10AnalysisContext
import org.jetbrains.kotlin.analysis.api.descriptors.symbols.descriptorBased.base.ktNullability
import org.jetbrains.kotlin.analysis.api.descriptors.symbols.descriptorBased.base.toKtTypeProjection
import org.jetbrains.kotlin.analysis.api.descriptors.types.base.KaFe10Type
import org.jetbrains.kotlin.analysis.api.descriptors.types.base.renderForDebugging
import org.jetbrains.kotlin.analysis.api.lifetime.withValidityAssertion
import org.jetbrains.kotlin.analysis.api.types.KaCapturedType
import org.jetbrains.kotlin.analysis.api.types.KaTypeNullability
import org.jetbrains.kotlin.analysis.api.types.KaUsualClassType
import org.jetbrains.kotlin.resolve.calls.inference.CapturedType

internal class KaFe10CapturedType(
    override val fe10Type: CapturedType,
    override val analysisContext: Fe10AnalysisContext
) : KaCapturedType(), KaFe10Type {
    override val nullability: KaTypeNullability
        get() = withValidityAssertion { fe10Type.ktNullability }

    override val projection: KaTypeProjection
        get() = withValidityAssertion { fe10Type.typeProjection.toKtTypeProjection(analysisContext) }

    override val abbreviatedType: KaUsualClassType?
        get() = withValidityAssertion { null }

    override fun toString(): String {
        return fe10Type.renderForDebugging(analysisContext)
    }
}
