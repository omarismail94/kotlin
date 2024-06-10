/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.jetbrains.kotlin.swiftexport.ExperimentalSwiftExportDsl
import javax.inject.Inject

@ExperimentalSwiftExportDsl
abstract class SwiftExportExtension @Inject constructor(private val project: Project) {

    /**
     * Configure name of the swift export built from this project.
     */
    var name: String? = null

    internal val nameProvider: Provider<String> = project.provider { name ?: project.name }
}