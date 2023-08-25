package rivetmc.velocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(id = "rivet", name = "Rivet", version = "1.0.0")
class RivetVelocity @Inject constructor(
    val logger: Logger,
    val proxy: ProxyServer
) {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {

    }

}
