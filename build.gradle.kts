import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    kotlin("jvm") version "1.8.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "rivetmc"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":common"))
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "com.github.johnrengelman.shadow")
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        compileOnly(kotlin("stdlib-jdk8"))
    }

    tasks {
        named<ShadowJar>("shadowJar") {
            archiveClassifier.set("")
            archiveVersion.set("")
            archiveBaseName.set(project.name)
        }
    }
}