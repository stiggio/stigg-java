// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.products.Product
import io.stigg.models.v1.products.ProductArchiveProductParams
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductListProductsPageAsync
import io.stigg.models.v1.products.ProductListProductsParams
import io.stigg.models.v1.products.ProductUnarchiveProductParams
import io.stigg.models.v1.products.ProductUpdateProductParams
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
    fun archiveProduct(id: String): CompletableFuture<Product> =
        archiveProduct(id, ProductArchiveProductParams.none())

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product> =
        archiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
    ): CompletableFuture<Product> = archiveProduct(id, params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(
        params: ProductArchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    /** @see archiveProduct */
    fun archiveProduct(params: ProductArchiveProductParams): CompletableFuture<Product> =
        archiveProduct(params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(id: String, requestOptions: RequestOptions): CompletableFuture<Product> =
        archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

    /** Creates a new product. */
    fun createProduct(params: ProductCreateProductParams): CompletableFuture<Product> =
        createProduct(params, RequestOptions.none())

    /** @see createProduct */
    fun createProduct(
        params: ProductCreateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    /** Duplicates an existing product, including its plans, addons, and configuration. */
    fun duplicateProduct(
        pathId: String,
        params: ProductDuplicateProductParams,
    ): CompletableFuture<Product> = duplicateProduct(pathId, params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        pathId: String,
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product> =
        duplicateProduct(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see duplicateProduct */
    fun duplicateProduct(params: ProductDuplicateProductParams): CompletableFuture<Product> =
        duplicateProduct(params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

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
    fun unarchiveProduct(id: String): CompletableFuture<Product> =
        unarchiveProduct(id, ProductUnarchiveProductParams.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product> =
        unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
    ): CompletableFuture<Product> = unarchiveProduct(id, params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        params: ProductUnarchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    /** @see unarchiveProduct */
    fun unarchiveProduct(params: ProductUnarchiveProductParams): CompletableFuture<Product> =
        unarchiveProduct(params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(id: String, requestOptions: RequestOptions): CompletableFuture<Product> =
        unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

    /** Updates an existing product's properties such as display name, description, and metadata. */
    fun updateProduct(id: String): CompletableFuture<Product> =
        updateProduct(id, ProductUpdateProductParams.none())

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product> = updateProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
    ): CompletableFuture<Product> = updateProduct(id, params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(
        params: ProductUpdateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    /** @see updateProduct */
    fun updateProduct(params: ProductUpdateProductParams): CompletableFuture<Product> =
        updateProduct(params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(id: String, requestOptions: RequestOptions): CompletableFuture<Product> =
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
        fun archiveProduct(id: String): CompletableFuture<HttpResponseFor<Product>> =
            archiveProduct(id, ProductArchiveProductParams.none())

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            archiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            archiveProduct(id, params, RequestOptions.none())

        /** @see archiveProduct */
        fun archiveProduct(
            params: ProductArchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /** @see archiveProduct */
        fun archiveProduct(
            params: ProductArchiveProductParams
        ): CompletableFuture<HttpResponseFor<Product>> =
            archiveProduct(params, RequestOptions.none())

        /** @see archiveProduct */
        fun archiveProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Product>> =
            archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/products`, but is otherwise the same as
         * [ProductServiceAsync.createProduct].
         */
        fun createProduct(
            params: ProductCreateProductParams
        ): CompletableFuture<HttpResponseFor<Product>> =
            createProduct(params, RequestOptions.none())

        /** @see createProduct */
        fun createProduct(
            params: ProductCreateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/duplicate`, but is otherwise
         * the same as [ProductServiceAsync.duplicateProduct].
         */
        fun duplicateProduct(
            pathId: String,
            params: ProductDuplicateProductParams,
        ): CompletableFuture<HttpResponseFor<Product>> =
            duplicateProduct(pathId, params, RequestOptions.none())

        /** @see duplicateProduct */
        fun duplicateProduct(
            pathId: String,
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            duplicateProduct(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see duplicateProduct */
        fun duplicateProduct(
            params: ProductDuplicateProductParams
        ): CompletableFuture<HttpResponseFor<Product>> =
            duplicateProduct(params, RequestOptions.none())

        /** @see duplicateProduct */
        fun duplicateProduct(
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

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
        fun unarchiveProduct(id: String): CompletableFuture<HttpResponseFor<Product>> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            unarchiveProduct(id, params, RequestOptions.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            params: ProductUnarchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            params: ProductUnarchiveProductParams
        ): CompletableFuture<HttpResponseFor<Product>> =
            unarchiveProduct(params, RequestOptions.none())

        /** @see unarchiveProduct */
        fun unarchiveProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Product>> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/products/{id}`, but is otherwise the same
         * as [ProductServiceAsync.updateProduct].
         */
        fun updateProduct(id: String): CompletableFuture<HttpResponseFor<Product>> =
            updateProduct(id, ProductUpdateProductParams.none())

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            updateProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            updateProduct(id, params, RequestOptions.none())

        /** @see updateProduct */
        fun updateProduct(
            params: ProductUpdateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /** @see updateProduct */
        fun updateProduct(
            params: ProductUpdateProductParams
        ): CompletableFuture<HttpResponseFor<Product>> =
            updateProduct(params, RequestOptions.none())

        /** @see updateProduct */
        fun updateProduct(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Product>> =
            updateProduct(id, ProductUpdateProductParams.none(), requestOptions)
    }
}
