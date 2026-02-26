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

/** @see AddonServiceAsync.list */
class AddonListPageAsync
private constructor(
    private val service: AddonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AddonListParams,
    private val response: AddonListPageResponse,
) : PageAsync<AddonListResponse> {

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see AddonListPageResponse.data
     */
    fun data(): List<AddonListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AddonListPageResponse], but gracefully handles missing data.
     *
     * @see AddonListPageResponse.pagination
     */
    fun pagination(): Optional<AddonListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<AddonListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): AddonListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AddonListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AddonListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AddonListParams = params

    /** The response that this page was parsed from. */
    fun response(): AddonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddonListPageAsync].
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

    /** A builder for [AddonListPageAsync]. */
    class Builder internal constructor() {

        private var service: AddonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AddonListParams? = null
        private var response: AddonListPageResponse? = null

        @JvmSynthetic
        internal fun from(addonListPageAsync: AddonListPageAsync) = apply {
            service = addonListPageAsync.service
            streamHandlerExecutor = addonListPageAsync.streamHandlerExecutor
            params = addonListPageAsync.params
            response = addonListPageAsync.response
        }

        fun service(service: AddonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AddonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AddonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AddonListPageAsync].
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
        fun build(): AddonListPageAsync =
            AddonListPageAsync(
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

        return other is AddonListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AddonListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
