// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers.integrations

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.customers.IntegrationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see IntegrationService.list */
class IntegrationListPage
private constructor(
    private val service: IntegrationService,
    private val params: IntegrationListParams,
    private val response: IntegrationListPageResponse,
) : Page<IntegrationListResponse> {

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

    override fun nextPage(): IntegrationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IntegrationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntegrationListPage].
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

    /** A builder for [IntegrationListPage]. */
    class Builder internal constructor() {

        private var service: IntegrationService? = null
        private var params: IntegrationListParams? = null
        private var response: IntegrationListPageResponse? = null

        @JvmSynthetic
        internal fun from(integrationListPage: IntegrationListPage) = apply {
            service = integrationListPage.service
            params = integrationListPage.params
            response = integrationListPage.response
        }

        fun service(service: IntegrationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IntegrationListPage].
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
        fun build(): IntegrationListPage =
            IntegrationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegrationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "IntegrationListPage{service=$service, params=$params, response=$response}"
}
