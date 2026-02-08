// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.CustomerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomerService.listResources */
class CustomerListResourcesPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListResourcesParams,
    private val response: CustomerListResourcesPageResponse,
) : Page<CustomerListResourcesResponse> {

    /**
     * Delegates to [CustomerListResourcesPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListResourcesPageResponse.data
     */
    fun data(): List<CustomerListResourcesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerListResourcesPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListResourcesPageResponse.pagination
     */
    fun pagination(): Optional<CustomerListResourcesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CustomerListResourcesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CustomerListResourcesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CustomerListResourcesPage = service.listResources(nextPageParams())

    fun autoPager(): AutoPager<CustomerListResourcesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListResourcesParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListResourcesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListResourcesPage].
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

    /** A builder for [CustomerListResourcesPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListResourcesParams? = null
        private var response: CustomerListResourcesPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListResourcesPage: CustomerListResourcesPage) = apply {
            service = customerListResourcesPage.service
            params = customerListResourcesPage.params
            response = customerListResourcesPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListResourcesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListResourcesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListResourcesPage].
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
        fun build(): CustomerListResourcesPage =
            CustomerListResourcesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListResourcesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListResourcesPage{service=$service, params=$params, response=$response}"
}
