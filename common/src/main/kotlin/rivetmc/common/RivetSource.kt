package rivetmc.common

import com.rivet.api.core.Environment

/**
 * This is essentially an enum that represents the environment of the Rivet proxy.
 */
class RivetSource private constructor(val environment: Environment) {

    companion object {
        /**
         * Use the default environment (Rivet Cloud), if you want to use a self-hosted instance of Rivet, use [custom].
         */
        @JvmStatic
        val PRODUCTION = RivetSource(Environment.PRODUCTION)

        /**
         * A self-hosted instance of Rivet, for cloud usage see [PRODUCTION].
         */
        @JvmStatic
        @JvmName("custom")
        fun custom(environment: Environment) = RivetSource(environment)
    }

}