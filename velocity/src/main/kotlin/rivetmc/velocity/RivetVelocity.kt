package rivetmc.velocity

import com.google.inject.Inject
import com.rivet.api.core.Environment
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger
import rivetmc.common.RivetProxy
import rivetmc.common.RivetSource

@Plugin(id = "rivet", name = "Rivet", version = "1.0.0")
class RivetVelocity @Inject constructor(
    val logger: Logger,
    val proxy: ProxyServer
): RivetProxy() {

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        this.connect(RivetSource.PRODUCTION, "")
        this.ready()
    }

}
