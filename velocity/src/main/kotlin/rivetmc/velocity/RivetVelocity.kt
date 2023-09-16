package rivetmc.velocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger
import rivetmc.common.Rivet
import rivetmc.velocity.config.RivetConfig
import java.nio.file.Path

@Plugin(id = "rivet", name = "Rivet", version = "1.0.0")
class RivetVelocity @Inject constructor(
    val logger: Logger,
    val proxy: ProxyServer,
    @DataDirectory val directory: Path
) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        val file = directory.toFile()
        if (!file.exists()) file.mkdirs()

        // Load in configuration file
        // TODO: Implement self-hosted instance support
        val config = RivetConfig.load(file)

        if (Rivet.isRivet()) {
            logger.info("Running on Rivet!")
        } else {
            logger.info("Rivet wasn't found in the environment, skipping all Rivet related tasks.")
            return
        }

        Rivet.connect(config.source())
        Rivet.ready()
    }

}
