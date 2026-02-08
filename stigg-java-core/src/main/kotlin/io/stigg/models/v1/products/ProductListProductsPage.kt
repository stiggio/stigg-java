// File generated from our OpenAPI spec by Stainless.

package io.stigg.models.v1.products

import io.stigg.core.AutoPager
import io.stigg.core.Page
import io.stigg.core.checkRequired
import io.stigg.services.blocking.v1.ProductService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ProductService.listProducts */
class ProductListProductsPage
private constructor(
    private val service: ProductService,
    private val params: ProductListProductsParams,
    private val response: ProductListProductsPageResponse,
) : Page<ProductListProductsResponse> {

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

    override fun nextPage(): ProductListProductsPage = service.listProducts(nextPageParams())

    fun autoPager(): AutoPager<ProductListProductsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductListProductsParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListProductsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListProductsPage].
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

    /** A builder for [ProductListProductsPage]. */
    class Builder internal constructor() {

        private var service: ProductService? = null
        private var params: ProductListProductsParams? = null
        private var response: ProductListProductsPageResponse? = null

        @JvmSynthetic
        internal fun from(productListProductsPage: ProductListProductsPage) = apply {
            service = productListProductsPage.service
            params = productListProductsPage.params
            response = productListProductsPage.response
        }

        fun service(service: ProductService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListProductsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListProductsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListProductsPage].
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
        fun build(): ProductListProductsPage =
            ProductListProductsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductListProductsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProductListProductsPage{service=$service, params=$params, response=$response}"
}
