package rivetmc.common

import com.rivet.api.RivetApiClient
import com.rivet.api.core.ApiError

/**
 * This is a wrapper for the rivet api client, used to easily interact with the Rivet SDK.
 */
@Suppress("MemberVisibilityCanBePrivate")
object Rivet {

    private lateinit var _client: RivetApiClient
    private val token: String? = System.getenv("RIVET_LOBBY_TOKEN")

    val client: RivetApiClient
        get() = _client

    fun connect(source: RivetSource) {
        _client = RivetApiClient.builder()
            .environment(source.environment)
            .token(token)
            .build()
    }

    /**
     * Checks if we're running on Rivet
     * @return if the lobby token is set
     */
    fun isRivet(): Boolean {
        return token != null
    }

    /**
     * This method is called when the proxy is started and ready to accept connections, this will notify Rivet that we are ready for connections.
     */
    fun ready() {
        if (!isRivet()) return

        try {
            client.matchmaker().lobbies().ready()
        } catch(e: ApiError) {
            println(e.statusCode())
            println(e.body())
        }
    }

}