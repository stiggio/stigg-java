// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.coupons

import com.stigg.api.core.AutoPagerAsync
import com.stigg.api.core.PageAsync
import com.stigg.api.core.checkRequired
import com.stigg.api.services.async.v1.CouponServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CouponServiceAsync.list */
class CouponListPageAsync
private constructor(
    private val service: CouponServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) : PageAsync<CouponListResponse> {

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see CouponListPageResponse.data
     */
    fun data(): List<CouponListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see CouponListPageResponse.pagination
     */
    fun pagination(): Optional<CouponListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CouponListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CouponListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CouponListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CouponListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CouponListParams = params

    /** The response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponListPageAsync].
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

    /** A builder for [CouponListPageAsync]. */
    class Builder internal constructor() {

        private var service: CouponServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CouponListParams? = null
        private var response: CouponListPageResponse? = null

        @JvmSynthetic
        internal fun from(couponListPageAsync: CouponListPageAsync) = apply {
            service = couponListPageAsync.service
            streamHandlerExecutor = couponListPageAsync.streamHandlerExecutor
            params = couponListPageAsync.params
            response = couponListPageAsync.response
        }

        fun service(service: CouponServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CouponListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CouponListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CouponListPageAsync].
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
        fun build(): CouponListPageAsync =
            CouponListPageAsync(
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

        return other is CouponListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CouponListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
