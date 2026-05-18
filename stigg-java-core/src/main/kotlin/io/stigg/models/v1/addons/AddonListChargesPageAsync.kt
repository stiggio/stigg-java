// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.addons

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.AddonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AddonServiceAsync.listCharges */
class AddonListChargesPageAsync
private constructor(
    private val service: AddonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AddonListChargesParams,
    private val response: AddonListChargesPageResponse,
) : PageAsync<AddonListChargesResponse> {

    /**
     * Delegates to [AddonListChargesPageResponse], but gracefully handles missing data.
     *
     * @see AddonListChargesPageResponse.data
     */
    fun data(): List<AddonListChargesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListChargesPageResponse], but gracefully handles missing data.
     *
     * @see AddonListChargesPageResponse.pagination
     */
    fun pagination(): Optional<AddonListChargesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListChargesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListChargesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AddonListChargesPageAsync> =
        service.listCharges(nextPageParams())

    fun autoPager(): AutoPagerAsync<AddonListChargesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AddonListChargesParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListChargesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListChargesPageAsync].
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

    /** A builder for [AddonListChargesPageAsync]. */
    class Builder internal constructor() {

        private var service: AddonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AddonListChargesParams? = null
        private var response: AddonListChargesPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListChargesPageAsync: AddonListChargesPageAsync) = apply {
            service = addonListChargesPageAsync.service
            streamHandlerExecutor = addonListChargesPageAsync.streamHandlerExecutor
            params = addonListChargesPageAsync.params
            response = addonListChargesPageAsync.response
        }

        fun service(service: AddonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListChargesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListChargesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListChargesPageAsync].
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
        fun build(): AddonListChargesPageAsync =
            AddonListChargesPageAsync(
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

        return other is AddonListChargesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AddonListChargesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
