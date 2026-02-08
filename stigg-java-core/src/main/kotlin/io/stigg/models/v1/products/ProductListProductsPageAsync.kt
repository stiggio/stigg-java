// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.AutoPagerAsync
import io.stigg.core.PageAsync
import io.stigg.core.checkRequired
import io.stigg.services.async.v1.ProductServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ProductServiceAsync.listProducts */
class ProductListProductsPageAsync
private constructor(
    private val service: ProductServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProductListProductsParams,
    private val response: ProductListProductsPageResponse,
) : PageAsync<ProductListProductsResponse> {

    /**
     * Delegates to [ProductListProductsPageResponse], but gracefully handles missing data.
     *
     * @see ProductListProductsPageResponse.data
     */
    fun data(): List<ProductListProductsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProductListProductsPageResponse], but gracefully handles missing data.
     *
     * @see ProductListProductsPageResponse.pagination
     */
    fun pagination(): Optional<ProductListProductsPageResponse.Pagination> =
        response._pagination().getOptional("pagination")

    override fun items(): List<ProductListProductsResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && pagination().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): ProductListProductsParams {
        val nextCursor =
            pagination().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ProductListProductsPageAsync> =
        service.listProducts(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductListProductsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProductListProductsParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListProductsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListProductsPageAsync].
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

    /** A builder for [ProductListProductsPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProductListProductsParams? = null
        private var response: ProductListProductsPageResponse? = null

        @JvmSynthetic
        internal fun from(productListProductsPageAsync: ProductListProductsPageAsync) = apply {
            service = productListProductsPageAsync.service
            streamHandlerExecutor = productListProductsPageAsync.streamHandlerExecutor
            params = productListProductsPageAsync.params
            response = productListProductsPageAsync.response
        }

        fun service(service: ProductServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListProductsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListProductsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListProductsPageAsync].
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
        fun build(): ProductListProductsPageAsync =
            ProductListProductsPageAsync(
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

        return other is ProductListProductsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ProductListProductsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
