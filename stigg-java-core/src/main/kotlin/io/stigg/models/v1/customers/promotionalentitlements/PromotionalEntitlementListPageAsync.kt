// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.customers.PromotionalEntitlementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PromotionalEntitlementServiceAsync.list */
class PromotionalEntitlementListPageAsync
private constructor(
    private val service: PromotionalEntitlementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PromotionalEntitlementListParams,
    private val response: PromotionalEntitlementListPageResponse,
) : PageAsync<PromotionalEntitlementListResponse> {

    /**
     * Delegates to [PromotionalEntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see PromotionalEntitlementListPageResponse.data
     */
    fun data(): List<PromotionalEntitlementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PromotionalEntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see PromotionalEntitlementListPageResponse.pagination
     */
    fun pagination(): Optional<PromotionalEntitlementListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<PromotionalEntitlementListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): PromotionalEntitlementListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PromotionalEntitlementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PromotionalEntitlementListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PromotionalEntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): PromotionalEntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PromotionalEntitlementListPageAsync].
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

    /** A builder for [PromotionalEntitlementListPageAsync]. */
    class Builder internal constructor() {

        private var service: PromotionalEntitlementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PromotionalEntitlementListParams? = null
        private var response: PromotionalEntitlementListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            promotionalEntitlementListPageAsync: PromotionalEntitlementListPageAsync
        ) = apply {
            service = promotionalEntitlementListPageAsync.service
            streamHandlerExecutor = promotionalEntitlementListPageAsync.streamHandlerExecutor
            params = promotionalEntitlementListPageAsync.params
            response = promotionalEntitlementListPageAsync.response
        }

        fun service(service: PromotionalEntitlementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PromotionalEntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PromotionalEntitlementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PromotionalEntitlementListPageAsync].
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
        fun build(): PromotionalEntitlementListPageAsync =
            PromotionalEntitlementListPageAsync(
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

        return other is PromotionalEntitlementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PromotionalEntitlementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
