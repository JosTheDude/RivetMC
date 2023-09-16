package rivetmc.velocity.config

import ninja.leaping.configurate.yaml.YAMLConfigurationLoader
import java.io.File
import java.nio.file.Files
import java.nio.file.Path

object ConfigLoader {

    private fun getConfig(dir: File): Path {
        val file = File(dir, "config.yml")
        val resource = javaClass.classLoader.getResourceAsStream("config.yml") ?: throw IllegalStateException("Could not find config.yml in resources")

        if (!file.exists()) Files.copy(resource, file.toPath())
        return file.toPath()
    }

    fun loadConfig(dir: File) = YAMLConfigurationLoader.builder().setPath(getConfig(dir)).build().load()

}