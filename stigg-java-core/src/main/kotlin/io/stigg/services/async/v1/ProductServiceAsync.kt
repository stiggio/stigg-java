// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.products.ProductArchiveProductParams
import io.stigg.models.v1.products.ProductArchiveProductResponse
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductCreateProductResponse
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductResponse
import io.stigg.models.v1.products.ProductListProductsPageAsync
import io.stigg.models.v1.products.ProductListProductsParams
import io.stigg.models.v1.products.ProductUnarchiveProductParams
import io.stigg.models.v1.products.ProductUnarchiveProductResponse
import io.stigg.models.v1.products.ProductUpdateProductParams
import io.stigg.models.v1.products.ProductUpdateProductResponse
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

    /** Archives a product, preventing new subscriptions. All plans and addons are archived. */
    fun archiveProduct(id: String): CompletableFuture<ProductArchiveProductResponse> =
        archiveProduct(id, ProductArchiveProductParams.none())

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductArchiveProductResponse> =
        archiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
    ): CompletableFuture<ProductArchiveProductResponse> =
        archiveProduct(id, params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(
        params: ProductArchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductArchiveProductResponse>

    /** @see archiveProduct */
    fun archiveProduct(
        params: ProductArchiveProductParams
    ): CompletableFuture<ProductArchiveProductResponse> =
        archiveProduct(params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductArchiveProductResponse> =
        archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

    /** Creates a new product. */
    fun createProduct(
        params: ProductCreateProductParams
    ): CompletableFuture<ProductCreateProductResponse> =
        createProduct(params, RequestOptions.none())

    /** @see createProduct */
    fun createProduct(
        params: ProductCreateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCreateProductResponse>

    /** Duplicates an existing product, including its plans, addons, and configuration. */
    fun duplicateProduct(id: String): CompletableFuture<ProductDuplicateProductResponse> =
        duplicateProduct(id, ProductDuplicateProductParams.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        id: String,
        params: ProductDuplicateProductParams = ProductDuplicateProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductDuplicateProductResponse> =
        duplicateProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see duplicateProduct */
    fun duplicateProduct(
        id: String,
        params: ProductDuplicateProductParams = ProductDuplicateProductParams.none(),
    ): CompletableFuture<ProductDuplicateProductResponse> =
        duplicateProduct(id, params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductDuplicateProductResponse>

    /** @see duplicateProduct */
    fun duplicateProduct(
        params: ProductDuplicateProductParams
    ): CompletableFuture<ProductDuplicateProductResponse> =
        duplicateProduct(params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductDuplicateProductResponse> =
        duplicateProduct(id, ProductDuplicateProductParams.none(), requestOptions)

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

    /** Restores an archived product, allowing new subscriptions to be created. */
    fun unarchiveProduct(id: String): CompletableFuture<ProductUnarchiveProductResponse> =
        unarchiveProduct(id, ProductUnarchiveProductParams.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUnarchiveProductResponse> =
        unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
    ): CompletableFuture<ProductUnarchiveProductResponse> =
        unarchiveProduct(id, params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        params: ProductUnarchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUnarchiveProductResponse>

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        params: ProductUnarchiveProductParams
    ): CompletableFuture<ProductUnarchiveProductResponse> =
        unarchiveProduct(params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductUnarchiveProductResponse> =
        unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

    /** Updates an existing product's properties such as display name, description, and metadata. */
    fun updateProduct(id: String): CompletableFuture<ProductUpdateProductResponse> =
        updateProduct(id, ProductUpdateProductParams.none())

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUpdateProductResponse> =
        updateProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
    ): CompletableFuture<ProductUpdateProductResponse> =
        updateProduct(id, params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(
        params: ProductUpdateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUpdateProductResponse>

    /** @see updateProduct */
    fun updateProduct(
        params: ProductUpdateProductParams
    ): CompletableFuture<ProductUpdateProductResponse> =
        updateProduct(params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductUpdateProductResponse> =
        updateProduct(id, ProductUpdateProductParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/products/{id}/archive`, but is otherwise
         * the same as [ProductServiceAsync.archiveProduct].
         */
        fun archiveProduct(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>> =
            archiveProduct(id, ProductArchiveProductParams.none())

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>> =
            archiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>> =
            archiveProduct(id, params, RequestOptions.none())

        /** @see archiveProduct */
        fun archiveProduct(
            params: ProductArchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>>

        /** @see archiveProduct */
        fun archiveProduct(
            params: ProductArchiveProductParams
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>> =
            archiveProduct(params, RequestOptions.none())

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductArchiveProductResponse>> =
            archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/products`, but is otherwise the same as
         * [ProductServiceAsync.createProduct].
         */
        fun createProduct(
            params: ProductCreateProductParams
        ): CompletableFuture<HttpResponseFor<ProductCreateProductResponse>> =
            createProduct(params, RequestOptions.none())

        /** @see createProduct */
        fun createProduct(
            params: ProductCreateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCreateProductResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/duplicate`, but is otherwise
         * the same as [ProductServiceAsync.duplicateProduct].
         */
        fun duplicateProduct(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>> =
            duplicateProduct(id, ProductDuplicateProductParams.none())

        /** @see duplicateProduct */
        fun duplicateProduct(
            id: String,
            params: ProductDuplicateProductParams = ProductDuplicateProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>> =
            duplicateProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see duplicateProduct */
        fun duplicateProduct(
            id: String,
            params: ProductDuplicateProductParams = ProductDuplicateProductParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>> =
            duplicateProduct(id, params, RequestOptions.none())

        /** @see duplicateProduct */
        fun duplicateProduct(
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>>

        /** @see duplicateProduct */
        fun duplicateProduct(
            params: ProductDuplicateProductParams
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>> =
            duplicateProduct(params, RequestOptions.none())

        /** @see duplicateProduct */
        fun duplicateProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductDuplicateProductResponse>> =
            duplicateProduct(id, ProductDuplicateProductParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/unarchive`, but is otherwise
         * the same as [ProductServiceAsync.unarchiveProduct].
         */
        fun unarchiveProduct(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>> =
            unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>> =
            unarchiveProduct(id, params, RequestOptions.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            params: ProductUnarchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>>

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            params: ProductUnarchiveProductParams
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>> =
            unarchiveProduct(params, RequestOptions.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductUnarchiveProductResponse>> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/products/{id}`, but is otherwise the same
         * as [ProductServiceAsync.updateProduct].
         */
        fun updateProduct(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>> =
            updateProduct(id, ProductUpdateProductParams.none())

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>> =
            updateProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>> =
            updateProduct(id, params, RequestOptions.none())

        /** @see updateProduct */
        fun updateProduct(
            params: ProductUpdateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>>

        /** @see updateProduct */
        fun updateProduct(
            params: ProductUpdateProductParams
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>> =
            updateProduct(params, RequestOptions.none())

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductUpdateProductResponse>> =
            updateProduct(id, ProductUpdateProductParams.none(), requestOptions)
    }
}
