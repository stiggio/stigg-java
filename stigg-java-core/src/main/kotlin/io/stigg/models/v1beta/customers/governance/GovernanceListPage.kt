// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1beta.customers.governance

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1beta.customers.GovernanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see GovernanceService.list */
class GovernanceListPage
private constructor(
    private val service: GovernanceService,
    private val params: GovernanceListParams,
    private val response: GovernanceListPageResponse,
) : Page<GovernanceListResponse> {

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

    override fun nextPage(): GovernanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GovernanceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GovernanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): GovernanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GovernanceListPage].
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

    /** A builder for [GovernanceListPage]. */
    class Builder internal constructor() {

        private var service: GovernanceService? = null
        private var params: GovernanceListParams? = null
        private var response: GovernanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(governanceListPage: GovernanceListPage) = apply {
            service = governanceListPage.service
            params = governanceListPage.params
            response = governanceListPage.response
        }

        fun service(service: GovernanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GovernanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GovernanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GovernanceListPage].
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
        fun build(): GovernanceListPage =
            GovernanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GovernanceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "GovernanceListPage{service=$service, params=$params, response=$response}"
}
