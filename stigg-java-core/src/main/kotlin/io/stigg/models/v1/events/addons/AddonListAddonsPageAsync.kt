// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.events.addons

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.events.AddonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AddonServiceAsync.listAddons */
class AddonListAddonsPageAsync
private constructor(
    private val service: AddonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AddonListAddonsParams,
    private val response: AddonListAddonsPageResponse,
) : PageAsync<AddonListAddonsResponse> {

    /**
     * Delegates to [AddonListAddonsPageResponse], but gracefully handles missing data.
     *
     * @see AddonListAddonsPageResponse.data
     */
    fun data(): List<AddonListAddonsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListAddonsPageResponse], but gracefully handles missing data.
     *
     * @see AddonListAddonsPageResponse.pagination
     */
    fun pagination(): Optional<AddonListAddonsPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListAddonsResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListAddonsParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AddonListAddonsPageAsync> =
        service.listAddons(nextPageParams())

    fun autoPager(): AutoPagerAsync<AddonListAddonsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AddonListAddonsParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListAddonsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListAddonsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AddonListAddonsPageAsync]. */
    class Builder internal constructor() {

        private var service: AddonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AddonListAddonsParams? = null
        private var response: AddonListAddonsPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListAddonsPageAsync: AddonListAddonsPageAsync) = apply {
            service = addonListAddonsPageAsync.service
            streamHandlerExecutor = addonListAddonsPageAsync.streamHandlerExecutor
            params = addonListAddonsPageAsync.params
            response = addonListAddonsPageAsync.response
        }

        fun service(service: AddonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListAddonsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListAddonsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListAddonsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AddonListAddonsPageAsync =
            AddonListAddonsPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AddonListAddonsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AddonListAddonsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
