// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.entities.entitlements

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.customers.entities.EntitlementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EntitlementService.list */
class EntitlementListPage
private constructor(
    private val service: EntitlementService,
    private val params: EntitlementListParams,
    private val response: EntitlementListPageResponse,
) : Page<EntitlementListResponse> {

    /**
     * Delegates to [EntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see EntitlementListPageResponse.data
     */
    fun data(): List<EntitlementListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see EntitlementListPageResponse.pagination
     */
    fun pagination(): Optional<EntitlementListPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<EntitlementListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): EntitlementListParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): EntitlementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntitlementListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementListPage].
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

    /** A builder for [EntitlementListPage]. */
    class Builder internal constructor() {

        private var service: EntitlementService? = null
        private var params: EntitlementListParams? = null
        private var response: EntitlementListPageResponse? = null

        @JvmSynthetic
        internal fun from(entitlementListPage: EntitlementListPage) = apply {
            service = entitlementListPage.service
            params = entitlementListPage.params
            response = entitlementListPage.response
        }

        fun service(service: EntitlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntitlementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntitlementListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntitlementListPage].
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
        fun build(): EntitlementListPage =
            EntitlementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EntitlementListPage{service=$service, params=$params, response=$response}"
}
