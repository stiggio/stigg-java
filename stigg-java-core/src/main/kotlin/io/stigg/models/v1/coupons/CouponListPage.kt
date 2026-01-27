// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.coupons

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.CouponService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CouponService.list */
class CouponListPage
private constructor(
    private val service: CouponService,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) : Page<CouponListResponse> {

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

    override fun nextPage(): CouponListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CouponListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CouponListParams = params

    /** The response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CouponListPage]. */
    class Builder internal constructor() {

        private var service: CouponService? = null
        private var params: CouponListParams? = null
        private var response: CouponListPageResponse? = null

        @JvmSynthetic
        internal fun from(couponListPage: CouponListPage) = apply {
            service = couponListPage.service
            params = couponListPage.params
            response = couponListPage.response
        }

        fun service(service: CouponService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CouponListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CouponListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CouponListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CouponListPage =
            CouponListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CouponListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CouponListPage{service=$service, params=$params, response=$response}"
}
