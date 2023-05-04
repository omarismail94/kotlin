/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.buildtools.api.compilation

import org.jetbrains.kotlin.buildtools.api.ExperimentalBuildToolsApi

/**
 * An exception that indicates an error occurred while parsing compilation arguments.
 */
@ExperimentalBuildToolsApi
class ParseCompilationArgumentsException(message: String) : KotlinBuildToolsException(message)