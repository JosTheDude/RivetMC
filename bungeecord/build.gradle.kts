group = "rivetmc.bungeecord"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("net.md-5:bungeecord-api:1.19-R0.1-SNAPSHOT")
    implementation(project(":common"))
}