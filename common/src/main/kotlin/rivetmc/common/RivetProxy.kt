package rivetmc.common

import com.rivet.api.RivetApiClient

/**
 * This is an extendable class that is used to represent a minecraft proxy.
 */
abstract class RivetProxy {

    private lateinit var _client: RivetApiClient
    val client: RivetApiClient
        get() = _client

    fun connect(source: RivetSource, token: String) {
        _client = RivetApiClient.builder()
            .environment(source.environment)
            .token(token)
            .build()
    }

    /**
     * This method is called when the proxy is started and ready to accept connections, this will notify Rivet that we are ready for connections.
     */
    fun ready() {
        client.matchmaker().lobbies().ready()
    }

}