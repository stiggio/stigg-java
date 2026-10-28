// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.governance

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1beta.customers.GovernanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see GovernanceServiceAsync.list */
class GovernanceListPageAsync
private constructor(
    private val service: GovernanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GovernanceListParams,
    private val response: GovernanceListPageResponse,
) : PageAsync<GovernanceListResponse> {

    /**
     * Delegates to [GovernanceListPageResponse], but gracefully handles missing data.
     *
     * @see GovernanceListPageResponse.data
     */
    fun data(): List<GovernanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GovernanceListPageResponse], but gracefully handles missing data.
     *
     * @see GovernanceListPageResponse.pagination
     */
    fun pagination(): Optional<GovernanceListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<GovernanceListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): GovernanceListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<GovernanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GovernanceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GovernanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): GovernanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GovernanceListPageAsync].
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

    /** A builder for [GovernanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: GovernanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GovernanceListParams? = null
        private var response: GovernanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(governanceListPageAsync: GovernanceListPageAsync) = apply {
            service = governanceListPageAsync.service
            streamHandlerExecutor = governanceListPageAsync.streamHandlerExecutor
            params = governanceListPageAsync.params
            response = governanceListPageAsync.response
        }

        fun service(service: GovernanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GovernanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GovernanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GovernanceListPageAsync].
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
        fun build(): GovernanceListPageAsync =
            GovernanceListPageAsync(
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

        return other is GovernanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "GovernanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
