// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.customers

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.CustomerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CustomerServiceAsync.listInvoices */
class CustomerListInvoicesPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerListInvoicesParams,
    private val response: CustomerListInvoicesPageResponse,
) : PageAsync<CustomerListInvoicesResponse> {

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

    override fun nextPage(): CompletableFuture<CustomerListInvoicesPageAsync> =
        service.listInvoices(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerListInvoicesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListInvoicesParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListInvoicesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListInvoicesPageAsync].
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

    /** A builder for [CustomerListInvoicesPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerListInvoicesParams? = null
        private var response: CustomerListInvoicesPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListInvoicesPageAsync: CustomerListInvoicesPageAsync) = apply {
            service = customerListInvoicesPageAsync.service
            streamHandlerExecutor = customerListInvoicesPageAsync.streamHandlerExecutor
            params = customerListInvoicesPageAsync.params
            response = customerListInvoicesPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListInvoicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListInvoicesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListInvoicesPageAsync].
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
        fun build(): CustomerListInvoicesPageAsync =
            CustomerListInvoicesPageAsync(
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

        return other is CustomerListInvoicesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerListInvoicesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
