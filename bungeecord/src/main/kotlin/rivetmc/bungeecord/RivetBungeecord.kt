package rivetmc.bungeecord

import net.md_5.bungee.api.plugin.Plugin
import rivetmc.common.RivetProxy
import rivetmc.common.RivetSource

class RivetBungeecord(): Plugin() {

    private val rivet = RivetProxy()

    override fun onEnable() {
        try {
            rivet.connect(RivetSource.PRODUCTION, "")
            rivet.ready()
        } catch (e: Exception) {
            logger.severe("Failed to connect to Rivet; is your config.yml set up correctly?")
            e.printStackTrace()
        }


    }



}