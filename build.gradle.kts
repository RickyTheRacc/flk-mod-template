plugins {
    id("fabric-loom") version "1.1-SNAPSHOT"
    id("org.jetbrains.kotlin.jvm") version "1.8.21"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.21"
    id("org.jetbrains.kotlin.kapt") version "1.5.30"
    java
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

version = project.property("mod_version")!!
group = project.property("maven_group")!!
val targetJavaVersion = 17

dependencies {
    // Fabric
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.property("fkotlin_version")}")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filteringCharset = "UTF-8"

        filesMatching("fabric.mod.json") {
            expand(
                "version" to version,
                "mc_version" to project.property("minecraft_version"),
            )
        }
    }

    withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(targetJavaVersion)
    }

    compileKotlin {
        kotlinOptions.jvmTarget = targetJavaVersion.toString()
    }
}

java {
    val javaVersion = JavaVersion.toVersion(targetJavaVersion)
    if (JavaVersion.current() < javaVersion) {
        toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
    }
}
