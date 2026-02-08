// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.products.ProductListProductsPageAsync
import io.stigg.models.v1.products.ProductListProductsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    /** Retrieves a paginated list of products in the environment. */
    fun listProducts(): CompletableFuture<ProductListProductsPageAsync> =
        listProducts(ProductListProductsParams.none())

    /** @see listProducts */
    fun listProducts(
        params: ProductListProductsParams = ProductListProductsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListProductsPageAsync>

    /** @see listProducts */
    fun listProducts(
        params: ProductListProductsParams = ProductListProductsParams.none()
    ): CompletableFuture<ProductListProductsPageAsync> = listProducts(params, RequestOptions.none())

    /** @see listProducts */
    fun listProducts(
        requestOptions: RequestOptions
    ): CompletableFuture<ProductListProductsPageAsync> =
        listProducts(ProductListProductsParams.none(), requestOptions)

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/products`, but is otherwise the same as
         * [ProductServiceAsync.listProducts].
         */
        fun listProducts(): CompletableFuture<HttpResponseFor<ProductListProductsPageAsync>> =
            listProducts(ProductListProductsParams.none())

        /** @see listProducts */
        fun listProducts(
            params: ProductListProductsParams = ProductListProductsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListProductsPageAsync>>

        /** @see listProducts */
        fun listProducts(
            params: ProductListProductsParams = ProductListProductsParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListProductsPageAsync>> =
            listProducts(params, RequestOptions.none())

        /** @see listProducts */
        fun listProducts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListProductsPageAsync>> =
            listProducts(ProductListProductsParams.none(), requestOptions)
    }
}
