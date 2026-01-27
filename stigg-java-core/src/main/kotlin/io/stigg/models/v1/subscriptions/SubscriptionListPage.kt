// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.subscriptions

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.SubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionService.list */
class SubscriptionListPage
private constructor(
    private val service: SubscriptionService,
    private val params: SubscriptionListParams,
    private val response: SubscriptionListPageResponse,
) : Page<SubscriptionListResponse> {

    /**
     * Delegates to [SubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListPageResponse.data
     */
    fun data(): List<SubscriptionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListPageResponse.pagination
     */
    fun pagination(): Optional<SubscriptionListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<SubscriptionListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): SubscriptionListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): SubscriptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SubscriptionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListPage].
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

    /** A builder for [SubscriptionListPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: SubscriptionListParams? = null
        private var response: SubscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionListPage: SubscriptionListPage) = apply {
            service = subscriptionListPage.service
            params = subscriptionListPage.params
            response = subscriptionListPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubscriptionListPage].
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
        fun build(): SubscriptionListPage =
            SubscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionListPage{service=$service, params=$params, response=$response}"
}
