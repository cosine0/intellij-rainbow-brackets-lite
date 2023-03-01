import org.jetbrains.intellij.tasks.RunPluginVerifierTask.FailureLevel.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val name: String by project
val ideaVersion: String by project
val kotlinVersion: String by project
val javaVersion: String by project
val kotlinLanguageVersion: String by project
val kotlinTargetVersion: String by project
val pluginVerifierIdeVersions: String by project
val publishChannels: String by project

plugins {
    id("org.jetbrains.intellij") version "1.13.0"
    id("com.adarshr.test-logger") version "3.2.0"
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    id("idea")
}

repositories {
    mavenLocal()
    mavenCentral()
    maven(url = "https://maven-central.storage-download.googleapis.com/repos/central/data/")
    maven(url = "https://maven.aliyun.com/nexus/content/groups/public/")
    maven(url = "https://www.jetbrains.com/intellij-repository/releases")
    maven(url = "https://www.jetbrains.com/intellij-repository/snapshots")
}

intellij {
    pluginName.set("intellij-rainbow-brackets-lite")

    version.set(ideaVersion)
    updateSinceUntilBuild.set(false)

    plugins.set(
        listOf(
            "java",
            "java-i18n",
            "JavaScript",
            "DatabaseTools",
            "com.intellij.css",
            "platform-images",
            "Groovy",
            "properties",
            "yaml",
            "org.jetbrains.kotlin",
            "com.jetbrains.sh",

            "com.jetbrains.php:223.8617.59",
            "com.jetbrains.plugins.jade:223.7571.117",
            "Dart:223.8617.8",
            "org.intellij.scala:2022.3.18",
            "org.jetbrains.plugins.ruby:223.8617.56",
            "org.jetbrains.plugins.go-template:223.7571.203",
            "PythonCore:223.8617.56",
        )
    )
}

tasks {
    runIde {
        systemProperties["idea.auto.reload.plugins"] = false
        jvmArgs = listOf(
            "-Xms512m",
            "-Xmx2048m",
        )
    }

    publishPlugin {
        token.set(System.getenv("token"))
        channels.set(publishChannels.split(",").map { it.trim() }.toList())
    }

    runPluginVerifier {
        ideVersions.set(pluginVerifierIdeVersions.split(",").map { it.trim() }.toList())
        failureLevel.set(listOf(COMPATIBILITY_PROBLEMS))
    }

    testlogger {
        theme = com.adarshr.gradle.testlogger.theme.ThemeType.MOCHA
    }

    jar {
        archiveBaseName.set("intellij-rainbow-brackets-lite")
    }
}

dependencies {
    compileOnly(fileTree("libs"))
    testImplementation("io.kotest:kotest-assertions-core:5.5.5")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile> {
    kotlinOptions.languageVersion = kotlinLanguageVersion
    kotlinOptions.apiVersion = kotlinTargetVersion
    kotlinOptions.jvmTarget = javaVersion
    kotlinOptions.freeCompilerArgs = listOf("-Xjsr305=strict")
}
