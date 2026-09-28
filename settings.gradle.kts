pluginManagement {
    repositories {
        // Prism's maven MUST be first.
        maven { url = uri("https://maven.leclowndu93150.dev/releases") }
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.fabricmc.net/") }
        maven { url = uri("https://maven.neoforged.net/releases") }
        maven { url = uri("https://repo.spongepowered.org/repository/maven-public/") }
    }
}

plugins {
    // Lets Gradle auto-download JDK 21 and 25 per target. Without this,
    // toolchain resolution fails on any machine that lacks them.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
    // Pinned to the version this build was verified against. A dynamic
    // "+" here would silently change the build for anyone cloning later.
    //
    // Loom and ModDevGradle are not listed explicitly because they are already
    // pinned by this line. Verified rather than assumed:
    // dev.prism.settings 0.6.0 -> prism-gradle-plugin 0.6.0, whose
    // published Gradle module metadata declares every runtime dependency at an
    // exact version and contains no dynamic selector anywhere:
    //
    //     net.fabricmc:fabric-loom        1.18.2
    //     net.neoforged:moddev-gradle     2.0.147
    //     com.gtnewhorizons:retrofuturagradle  2.0.4
    //     net.minecraftforge:forgegradle  7.0.40
    //     net.minecraftforge.gradle:ForgeGradle 6.0.54
    //     com.gradleup.shadow:shadow-gradle-plugin 9.6.1
    //     org.ow2.asm:asm / asm-tree      9.10.1
    //     org.jetbrains.kotlin:kotlin-stdlib 2.4.20
    //     org.jetbrains.kotlinx:kotlinx-serialization-json 1.11.0
    //
    // `./gradlew :26.1:fabric:buildEnvironment` confirms Loom 1.18.2 in use. So
    // no resolutionStrategy force is needed, and adding one would only risk
    // fighting Prism's own wiring. Re-check after bumping this version:
    //
    //   ./gradlew :26.1:fabric:buildEnvironment | grep "Fabric Loom"
    id("dev.prism.settings") version "0.6.0"
}

rootProject.name = "compress-em"

prism {
    // Root common/ is for code shared across ALL versions. It must not touch
    // Minecraft classes. See common/README.md.
    sharedCommon()

    // 26.1 also covers 26.1.1 and 26.1.2 -- one pack format, one target.
    // Do not add a 26.1.2 target.
    version("1.21.11") { common(); fabric(); neoforge() }
    version("26.1") { common(); fabric(); neoforge() }
}
