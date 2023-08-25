import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    kotlin("jvm") version "1.8.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "rivetmc"
version = "1.0"

dependencies {
    implementation(project(":common"))
    implementation(project(":velocity"))
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "com.github.johnrengelman.shadow")
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        mavenLocal()
    }

    dependencies {
        compileOnly(kotlin("stdlib-jdk8"))
        implementation("com.github.rivet-gg:rivet-java:cf2dde7401")
        implementation("com.fasterxml.jackson.core:jackson-core:2.12.3")
    }

    tasks {
        named<ShadowJar>("shadowJar") {
            archiveClassifier.set("")
            archiveVersion.set("")
            archiveBaseName.set(project.name)
        }
    }
}