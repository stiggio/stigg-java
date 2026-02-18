// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.promotionalentitlements

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.customers.PromotionalEntitlementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PromotionalEntitlementService.list */
class PromotionalEntitlementListPage
private constructor(
    private val service: PromotionalEntitlementService,
    private val params: PromotionalEntitlementListParams,
    private val response: PromotionalEntitlementListPageResponse,
) : Page<PromotionalEntitlementListResponse> {

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

    override fun nextPage(): PromotionalEntitlementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PromotionalEntitlementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PromotionalEntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): PromotionalEntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PromotionalEntitlementListPage].
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

    /** A builder for [PromotionalEntitlementListPage]. */
    class Builder internal constructor() {

        private var service: PromotionalEntitlementService? = null
        private var params: PromotionalEntitlementListParams? = null
        private var response: PromotionalEntitlementListPageResponse? = null

        @JvmSynthetic
        internal fun from(promotionalEntitlementListPage: PromotionalEntitlementListPage) = apply {
            service = promotionalEntitlementListPage.service
            params = promotionalEntitlementListPage.params
            response = promotionalEntitlementListPage.response
        }

        fun service(service: PromotionalEntitlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PromotionalEntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PromotionalEntitlementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PromotionalEntitlementListPage].
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
        fun build(): PromotionalEntitlementListPage =
            PromotionalEntitlementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromotionalEntitlementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PromotionalEntitlementListPage{service=$service, params=$params, response=$response}"
}
