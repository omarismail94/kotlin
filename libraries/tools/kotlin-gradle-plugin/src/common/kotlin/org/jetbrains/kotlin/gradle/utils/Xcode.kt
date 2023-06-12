/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.utils

import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.InternalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.plugin.mpp.BitcodeEmbeddingMode
import org.jetbrains.kotlin.konan.target.*
import org.jetbrains.kotlin.konan.target.Architecture.ARM32
import org.jetbrains.kotlin.konan.target.Architecture.ARM64
import org.jetbrains.kotlin.konan.target.Family.*
import org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly

@InternalKotlinGradlePluginApi
val Xcode = XcodeUtils.INSTANCE

@InternalKotlinGradlePluginApi
class XcodeUtils private constructor() {

    companion object {
        internal val INSTANCE: XcodeUtils? =
            if (HostManager.hostIsMac) XcodeUtils() else null

        fun bitcodeEmbeddingMode(
            outputKind: CompilerOutputKind,
            userMode: BitcodeEmbeddingMode?,
            xcodeVersion: Provider<RegularFile>,
            target: KonanTarget,
            debuggable: Boolean,
        ): BitcodeEmbeddingMode {
            return when {
                outputKind != CompilerOutputKind.FRAMEWORK -> BitcodeEmbeddingMode.DISABLE
                userMode != null -> userMode
                bitcodeSupported(xcodeVersion, target) -> when (debuggable) {
                    true -> BitcodeEmbeddingMode.MARKER
                    false -> BitcodeEmbeddingMode.BITCODE
                }
                else -> BitcodeEmbeddingMode.DISABLE
            }
        }

        private fun bitcodeSupported(xcodeVersion: Provider<RegularFile>, target: KonanTarget): Boolean {
            return XcodeVersion.parse(xcodeVersion).major < 14
                    && target.family in listOf(IOS, WATCHOS, TVOS)
                    && target.architecture in listOf(ARM32, ARM64)
        }
    }

    private val defaultTestDevices: Map<Family, String> by lazy {
        val osRegex = "-- .* --".toRegex()
        val deviceRegex = """[0-9A-F]{8}-([0-9A-F]{4}-){3}[0-9A-F]{12}""".toRegex()

        val out = runCommand(listOf("/usr/bin/xcrun", "simctl", "list", "devices", "available"))

        val result = mutableMapOf<Family, String>()
        var os: Family? = null
        out.lines().forEach { s ->
            val osFound = osRegex.find(s)?.value
            if (osFound != null) {
                val osName = osFound.split(" ")[1]
                os = try {
                    Family.valueOf(osName.toUpperCaseAsciiOnly())
                } catch (e: Exception) {
                    null
                }
            } else {
                val currentOs = os
                if (currentOs != null) {
                    val deviceFound = deviceRegex.find(s)?.value
                    if (deviceFound != null) {
                        result[currentOs] = deviceFound
                        os = null
                    }
                }
            }
        }
        result
    }

    fun getDefaultTestDeviceId(target: KonanTarget): String? = defaultTestDevices[target.family]

}

internal fun XcodeVersion.Companion.parse(file: Provider<RegularFile>): XcodeVersion {
    val version = file.getAsFile().readText()
    return parse(version) ?: error("Couldn't parse Xcode version from '$version'")
}