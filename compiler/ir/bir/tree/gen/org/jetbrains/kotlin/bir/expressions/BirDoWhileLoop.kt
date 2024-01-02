/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// This file was generated automatically. See compiler/ir/bir.tree/tree-generator/ReadMe.md.
// DO NOT MODIFY IT MANUALLY.

package org.jetbrains.kotlin.bir.expressions

import org.jetbrains.kotlin.bir.BirElement
import org.jetbrains.kotlin.bir.BirElementClass
import org.jetbrains.kotlin.bir.BirElementVisitor
import org.jetbrains.kotlin.bir.accept

/**
 * A leaf IR tree element.
 *
 * Generated from: [org.jetbrains.kotlin.bir.generator.BirTree.doWhileLoop]
 */
abstract class BirDoWhileLoop(elementClass: BirElementClass<*>) : BirLoop(elementClass), BirElement {
    override fun <D> acceptChildren(visitor: BirElementVisitor<D>, data: D) {
        body?.accept(data, visitor)
        condition?.accept(data, visitor)
    }

    companion object : BirElementClass<BirDoWhileLoop>(BirDoWhileLoop::class.java, 19, true)
}
