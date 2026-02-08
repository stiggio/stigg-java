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

/** @see CustomerServiceAsync.listResources */
class CustomerListResourcesPageAsync
private constructor(
    private val service: CustomerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerListResourcesParams,
    private val response: CustomerListResourcesPageResponse,
) : PageAsync<CustomerListResourcesResponse> {

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

    override fun nextPage(): CompletableFuture<CustomerListResourcesPageAsync> =
        service.listResources(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerListResourcesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerListResourcesParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerListResourcesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerListResourcesPageAsync].
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

    /** A builder for [CustomerListResourcesPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerListResourcesParams? = null
        private var response: CustomerListResourcesPageResponse? = null

        @JvmSynthetic
        internal fun from(customerListResourcesPageAsync: CustomerListResourcesPageAsync) = apply {
            service = customerListResourcesPageAsync.service
            streamHandlerExecutor = customerListResourcesPageAsync.streamHandlerExecutor
            params = customerListResourcesPageAsync.params
            response = customerListResourcesPageAsync.response
        }

        fun service(service: CustomerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerListResourcesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerListResourcesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerListResourcesPageAsync].
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
        fun build(): CustomerListResourcesPageAsync =
            CustomerListResourcesPageAsync(
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

        return other is CustomerListResourcesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerListResourcesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
