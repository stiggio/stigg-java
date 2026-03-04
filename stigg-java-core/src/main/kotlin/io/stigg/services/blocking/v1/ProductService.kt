// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.products.Product
import io.stigg.models.v1.products.ProductArchiveProductParams
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductListProductsPage
import io.stigg.models.v1.products.ProductListProductsParams
import io.stigg.models.v1.products.ProductUnarchiveProductParams
import io.stigg.models.v1.products.ProductUpdateProductParams
import java.util.function.Consumer

/** Operations related to products */
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

    /** Archives a product, preventing new subscriptions. All plans and addons are archived. */
    fun archiveProduct(id: String): Product = archiveProduct(id, ProductArchiveProductParams.none())

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = archiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see archiveProduct */
    fun archiveProduct(
        id: String,
        params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
    ): Product = archiveProduct(id, params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(
        params: ProductArchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see archiveProduct */
    fun archiveProduct(params: ProductArchiveProductParams): Product =
        archiveProduct(params, RequestOptions.none())

    /** @see archiveProduct */
    fun archiveProduct(id: String, requestOptions: RequestOptions): Product =
        archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

    /** Creates a new product. */
    fun createProduct(params: ProductCreateProductParams): Product =
        createProduct(params, RequestOptions.none())

    /** @see createProduct */
    fun createProduct(
        params: ProductCreateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** Duplicates an existing product, including its plans, addons, and configuration. */
    fun duplicateProduct(pathId: String, params: ProductDuplicateProductParams): Product =
        duplicateProduct(pathId, params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        pathId: String,
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = duplicateProduct(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see duplicateProduct */
    fun duplicateProduct(params: ProductDuplicateProductParams): Product =
        duplicateProduct(params, RequestOptions.none())

    /** @see duplicateProduct */
    fun duplicateProduct(
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

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

    /** Restores an archived product, allowing new subscriptions to be created. */
    fun unarchiveProduct(id: String): Product =
        unarchiveProduct(id, ProductUnarchiveProductParams.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        id: String,
        params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
    ): Product = unarchiveProduct(id, params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(
        params: ProductUnarchiveProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see unarchiveProduct */
    fun unarchiveProduct(params: ProductUnarchiveProductParams): Product =
        unarchiveProduct(params, RequestOptions.none())

    /** @see unarchiveProduct */
    fun unarchiveProduct(id: String, requestOptions: RequestOptions): Product =
        unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

    /** Updates an existing product's properties such as display name, description, and metadata. */
    fun updateProduct(id: String): Product = updateProduct(id, ProductUpdateProductParams.none())

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = updateProduct(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateProduct */
    fun updateProduct(
        id: String,
        params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
    ): Product = updateProduct(id, params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(
        params: ProductUpdateProductParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see updateProduct */
    fun updateProduct(params: ProductUpdateProductParams): Product =
        updateProduct(params, RequestOptions.none())

    /** @see updateProduct */
    fun updateProduct(id: String, requestOptions: RequestOptions): Product =
        updateProduct(id, ProductUpdateProductParams.none(), requestOptions)

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/archive`, but is otherwise
         * the same as [ProductService.archiveProduct].
         */
        @MustBeClosed
        fun archiveProduct(id: String): HttpResponseFor<Product> =
            archiveProduct(id, ProductArchiveProductParams.none())

        /** @see archiveProduct */
        @MustBeClosed
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> =
            archiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see archiveProduct */
        @MustBeClosed
        fun archiveProduct(
            id: String,
            params: ProductArchiveProductParams = ProductArchiveProductParams.none(),
        ): HttpResponseFor<Product> = archiveProduct(id, params, RequestOptions.none())

        /** @see archiveProduct */
        @MustBeClosed
        fun archiveProduct(
            params: ProductArchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see archiveProduct */
        @MustBeClosed
        fun archiveProduct(params: ProductArchiveProductParams): HttpResponseFor<Product> =
            archiveProduct(params, RequestOptions.none())

        /** @see archiveProduct */
        @MustBeClosed
        fun archiveProduct(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            archiveProduct(id, ProductArchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/products`, but is otherwise the same as
         * [ProductService.createProduct].
         */
        @MustBeClosed
        fun createProduct(params: ProductCreateProductParams): HttpResponseFor<Product> =
            createProduct(params, RequestOptions.none())

        /** @see createProduct */
        @MustBeClosed
        fun createProduct(
            params: ProductCreateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/duplicate`, but is otherwise
         * the same as [ProductService.duplicateProduct].
         */
        @MustBeClosed
        fun duplicateProduct(
            pathId: String,
            params: ProductDuplicateProductParams,
        ): HttpResponseFor<Product> = duplicateProduct(pathId, params, RequestOptions.none())

        /** @see duplicateProduct */
        @MustBeClosed
        fun duplicateProduct(
            pathId: String,
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> =
            duplicateProduct(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see duplicateProduct */
        @MustBeClosed
        fun duplicateProduct(params: ProductDuplicateProductParams): HttpResponseFor<Product> =
            duplicateProduct(params, RequestOptions.none())

        /** @see duplicateProduct */
        @MustBeClosed
        fun duplicateProduct(
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

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

        /**
         * Returns a raw HTTP response for `post /api/v1/products/{id}/unarchive`, but is otherwise
         * the same as [ProductService.unarchiveProduct].
         */
        @MustBeClosed
        fun unarchiveProduct(id: String): HttpResponseFor<Product> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none())

        /** @see unarchiveProduct */
        @MustBeClosed
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> =
            unarchiveProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchiveProduct */
        @MustBeClosed
        fun unarchiveProduct(
            id: String,
            params: ProductUnarchiveProductParams = ProductUnarchiveProductParams.none(),
        ): HttpResponseFor<Product> = unarchiveProduct(id, params, RequestOptions.none())

        /** @see unarchiveProduct */
        @MustBeClosed
        fun unarchiveProduct(
            params: ProductUnarchiveProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see unarchiveProduct */
        @MustBeClosed
        fun unarchiveProduct(params: ProductUnarchiveProductParams): HttpResponseFor<Product> =
            unarchiveProduct(params, RequestOptions.none())

        /** @see unarchiveProduct */
        @MustBeClosed
        fun unarchiveProduct(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            unarchiveProduct(id, ProductUnarchiveProductParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/products/{id}`, but is otherwise the same
         * as [ProductService.updateProduct].
         */
        @MustBeClosed
        fun updateProduct(id: String): HttpResponseFor<Product> =
            updateProduct(id, ProductUpdateProductParams.none())

        /** @see updateProduct */
        @MustBeClosed
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> =
            updateProduct(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateProduct */
        @MustBeClosed
        fun updateProduct(
            id: String,
            params: ProductUpdateProductParams = ProductUpdateProductParams.none(),
        ): HttpResponseFor<Product> = updateProduct(id, params, RequestOptions.none())

        /** @see updateProduct */
        @MustBeClosed
        fun updateProduct(
            params: ProductUpdateProductParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see updateProduct */
        @MustBeClosed
        fun updateProduct(params: ProductUpdateProductParams): HttpResponseFor<Product> =
            updateProduct(params, RequestOptions.none())

        /** @see updateProduct */
        @MustBeClosed
        fun updateProduct(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            updateProduct(id, ProductUpdateProductParams.none(), requestOptions)
    }
}
