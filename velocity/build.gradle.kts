import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

group = "rivetmc.velocity"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("kapt")
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")
    kapt("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")
    implementation(project(":common"))
}