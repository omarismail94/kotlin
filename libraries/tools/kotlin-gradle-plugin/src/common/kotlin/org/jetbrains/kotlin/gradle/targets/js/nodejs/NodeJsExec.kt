/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.nodejs

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.*
import org.gradle.work.DisableCachingByDefault
import org.gradle.work.NormalizeLineEndings
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.targets.js.KotlinWasmTargetType
import org.jetbrains.kotlin.gradle.targets.js.RequiredKotlinJsDependency
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrTarget
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin.Companion.kotlinNodeJsExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.RequiresNpmDependencies
import org.jetbrains.kotlin.gradle.targets.js.npm.npmProject
import org.jetbrains.kotlin.gradle.tasks.registerTask
import org.jetbrains.kotlin.gradle.utils.newFileProperty
import javax.inject.Inject

@DisableCachingByDefault
open class NodeJsExec
@Inject
constructor(
    @Internal
    @Transient
    override val compilation: KotlinJsCompilation,
) : AbstractExecTask<NodeJsExec>(NodeJsExec::class.java), RequiresNpmDependencies {
    @Transient
    @get:Internal
    lateinit var nodeJs: NodeJsRootExtension

    @Internal
    val npmProject = compilation.npmProject

    init {
        onlyIf {
            !inputFileProperty.isPresent || inputFileProperty.asFile.map {
                it.exists()
            }.get()
        }
    }

    @Input
    var nodeArgs: MutableList<String> = mutableListOf()

    @Input
    var sourceMapStackTraces = true

    @Optional
    @PathSensitive(PathSensitivity.ABSOLUTE)
    @InputFile
    @NormalizeLineEndings
    val inputFileProperty: RegularFileProperty = project.newFileProperty()

    @get:Internal
    override val requiredNpmDependencies: Set<RequiredKotlinJsDependency> by lazy {
        mutableSetOf<RequiredKotlinJsDependency>().also {
            if (sourceMapStackTraces) {
                it.add(nodeJs.versions.sourceMapSupport)
            }
        }
    }

    override fun exec() {
        val newArgs = mutableListOf<String>()
        newArgs.addAll(nodeArgs)
        if (inputFileProperty.isPresent) {
            newArgs.add(inputFileProperty.asFile.get().normalize().absolutePath)
        }
        args?.let { newArgs.addAll(it) }
        args = newArgs

        if (sourceMapStackTraces) {
            val sourceMapSupportArgs = mutableListOf(
                "--require",
                npmProject.require("source-map-support/register.js")
            )

            args?.let { sourceMapSupportArgs.addAll(it) }

            args = sourceMapSupportArgs
        }

        super.exec()
    }

    companion object {
        fun create(
            compilation: KotlinJsCompilation,
            name: String,
            configuration: NodeJsExec.() -> Unit = {}
        ): TaskProvider<NodeJsExec> {
            val target = compilation.target
            val project = target.project
            NodeJsRootPlugin.apply(project.rootProject)
            val nodeJs = project.rootProject.kotlinNodeJsExtension
            val nodeJsTaskProviders = project.rootProject.kotlinNodeJsExtension
            val npmProject = compilation.npmProject

            return project.registerTask(
                name,
                listOf(compilation)
            ) {
                it.nodeJs = nodeJs
                it.executable = nodeJs.requireConfigured().nodeExecutable
                if ((compilation.target as? KotlinJsIrTarget)?.wasmTargetType != KotlinWasmTargetType.WASI) {
                    it.workingDir = npmProject.dir
                    it.dependsOn(
                        nodeJsTaskProviders.npmInstallTaskProvider,
                    )
                    it.dependsOn(nodeJs.packageManagerExtension.map { it.postInstallTasks })
                }
                it.dependsOn(nodeJsTaskProviders.nodeJsSetupTaskProvider)
                it.dependsOn(compilation.compileKotlinTaskProvider)
                it.configuration()
            }
        }
    }
}