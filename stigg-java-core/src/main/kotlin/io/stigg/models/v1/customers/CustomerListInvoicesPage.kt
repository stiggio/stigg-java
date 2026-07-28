// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.CustomerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CustomerService.listInvoices */
class CustomerListInvoicesPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListInvoicesParams,
    private val response: CustomerListInvoicesPageResponse,
) : Page<CustomerListInvoicesResponse> {

    /**
     * Delegates to [CustomerListInvoicesPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListInvoicesPageResponse.data
     */
    fun data(): List<CustomerListInvoicesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerListInvoicesPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListInvoicesPageResponse.pagination
     */
    fun pagination(): Optional<CustomerListInvoicesPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<CustomerListInvoicesResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): CustomerListInvoicesParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CustomerListInvoicesPage = service.listInvoices(nextPageParams())

    fun autoPager(): AutoPager<CustomerListInvoicesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListInvoicesParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListInvoicesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListInvoicesPage].
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

    /** A builder for [CustomerListInvoicesPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListInvoicesParams? = null
        private var response: CustomerListInvoicesPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListInvoicesPage: CustomerListInvoicesPage) = apply {
            service = customerListInvoicesPage.service
            params = customerListInvoicesPage.params
            response = customerListInvoicesPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListInvoicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListInvoicesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListInvoicesPage].
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
        fun build(): CustomerListInvoicesPage =
            CustomerListInvoicesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListInvoicesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListInvoicesPage{service=$service, params=$params, response=$response}"
}
