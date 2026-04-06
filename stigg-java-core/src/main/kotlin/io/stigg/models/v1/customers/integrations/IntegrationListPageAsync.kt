// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.customers.IntegrationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IntegrationServiceAsync.list */
class IntegrationListPageAsync
private constructor(
    private val service: IntegrationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IntegrationListParams,
    private val response: IntegrationListPageResponse,
) : PageAsync<IntegrationListResponse> {

    /**
     * Delegates to [IntegrationListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationListPageResponse.data
     */
    fun data(): List<IntegrationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationListPageResponse.pagination
     */
    fun pagination(): Optional<IntegrationListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<IntegrationListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): IntegrationListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IntegrationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IntegrationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntegrationListPageAsync].
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

    /** A builder for [IntegrationListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntegrationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IntegrationListParams? = null
        private var response: IntegrationListPageResponse? = null

        @JvmSynthetic
        internal fun from(integrationListPageAsync: IntegrationListPageAsync) = apply {
            service = integrationListPageAsync.service
            streamHandlerExecutor = integrationListPageAsync.streamHandlerExecutor
            params = integrationListPageAsync.params
            response = integrationListPageAsync.response
        }

        fun service(service: IntegrationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IntegrationListPageAsync].
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
        fun build(): IntegrationListPageAsync =
            IntegrationListPageAsync(
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

        return other is IntegrationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IntegrationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
