// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.models.v1.customers

import com.stigg.api.core.AutoPager
import com.stigg.api.core.Page
import com.stigg.api.core.checkRequired
import com.stigg.api.services.blocking.v1.CustomerService
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** @see CustomerService.list */
class CustomerListPage
private constructor(
    private val service: CustomerService,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) : Page<CustomerListResponse> {

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerListPageResponse.data
     */
    fun data(): List<CustomerListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    override fun items(): List<CustomerListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CustomerListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CustomerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerListPage].
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

    /** A builder for [CustomerListPage]. */
    class Builder internal constructor() {

        private var service: CustomerService? = null
        private var params: CustomerListParams? = null
        private var response: CustomerListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListPage: CustomerListPage) = apply {
            service = customerListPage.service
            params = customerListPage.params
            response = customerListPage.response
        }

        fun service(service: CustomerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CustomerListPage].
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
        fun build(): CustomerListPage =
            CustomerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CustomerListPage{service=$service, params=$params, response=$response}"
}
