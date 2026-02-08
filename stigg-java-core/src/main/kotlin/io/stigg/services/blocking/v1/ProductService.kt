// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.products.ProductListProductsPage
import io.stigg.models.v1.products.ProductListProductsParams
import java.util.function.Consumer

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService

    /** Retrieves a paginated list of products in the environment. */
    fun listProducts(): ProductListProductsPage = listProducts(ProductListProductsParams.none())

    /** @see listProducts */
    fun listProducts(
        params: ProductListProductsParams = ProductListProductsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListProductsPage

    /** @see listProducts */
    fun listProducts(
        params: ProductListProductsParams = ProductListProductsParams.none()
    ): ProductListProductsPage = listProducts(params, RequestOptions.none())

    /** @see listProducts */
    fun listProducts(requestOptions: RequestOptions): ProductListProductsPage =
        listProducts(ProductListProductsParams.none(), requestOptions)

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/products`, but is otherwise the same as
         * [ProductService.listProducts].
         */
        @MustBeClosed
        fun listProducts(): HttpResponseFor<ProductListProductsPage> =
            listProducts(ProductListProductsParams.none())

        /** @see listProducts */
        @MustBeClosed
        fun listProducts(
            params: ProductListProductsParams = ProductListProductsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListProductsPage>

        /** @see listProducts */
        @MustBeClosed
        fun listProducts(
            params: ProductListProductsParams = ProductListProductsParams.none()
        ): HttpResponseFor<ProductListProductsPage> = listProducts(params, RequestOptions.none())

        /** @see listProducts */
        @MustBeClosed
        fun listProducts(requestOptions: RequestOptions): HttpResponseFor<ProductListProductsPage> =
            listProducts(ProductListProductsParams.none(), requestOptions)
    }
}
