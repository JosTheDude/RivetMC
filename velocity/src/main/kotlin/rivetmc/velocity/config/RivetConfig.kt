package rivetmc.velocity.config

import ninja.leaping.configurate.ConfigurationNode
import rivetmc.common.RivetSource
import java.io.File

object RivetConfig {

    private lateinit var config: ConfigurationNode

    /**
     * Loads the config from the given directory.
     * @param dir The directory to load the config from.
     * @return This RivetConfig instance to allow for chaining.
     */
    fun load(dir: File): RivetConfig {
        config = ConfigLoader.loadConfig(dir)
        return this
    }

    /**
     * Fetches the source from the config.
     */
    fun source(): RivetSource {
        return RivetSource.PRODUCTION
//        val node = config.getNode("source")
//        if (node.isVirtual) return RivetSource.PRODUCTION
//
//        return RivetSource.custom(
//            node.getNode("host").string,
//            node.getNode("port").int,
//            node.getNode("ssl").boolean
//        )
    }

}