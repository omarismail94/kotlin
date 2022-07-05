plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    api(project(":compiler:ir.psi2ir"))
    api(project(":compiler:ir.serialization.common"))
    api(project(":js:js.frontend"))

    implementation(project(":compiler:ir.backend.common"))
    implementation(project(":compiler:fir:fir-serialization"))
    compileOnly(project(":kotlin-reflect-api"))

    compileOnly(intellijCore())
}

sourceSets {
    "main" { projectDefault() }
}
