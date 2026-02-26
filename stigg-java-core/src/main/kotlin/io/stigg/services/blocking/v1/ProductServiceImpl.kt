// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.checkRequired
import io.stigg.core.handlers.errorBodyHandler
import io.stigg.core.handlers.errorHandler
import io.stigg.core.handlers.jsonHandler
import io.stigg.core.http.HttpMethod
import io.stigg.core.http.HttpRequest
import io.stigg.core.http.HttpResponse
import io.stigg.core.http.HttpResponse.Handler
import io.stigg.core.http.HttpResponseFor
import io.stigg.core.http.json
import io.stigg.core.http.parseable
import io.stigg.core.prepare
import io.stigg.models.v1.products.Product
import io.stigg.models.v1.products.ProductArchiveProductParams
import io.stigg.models.v1.products.ProductCreateProductParams
import io.stigg.models.v1.products.ProductDuplicateProductParams
import io.stigg.models.v1.products.ProductListProductsPage
import io.stigg.models.v1.products.ProductListProductsPageResponse
import io.stigg.models.v1.products.ProductListProductsParams
import io.stigg.models.v1.products.ProductUnarchiveProductParams
import io.stigg.models.v1.products.ProductUpdateProductParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val withRawResponse: ProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService =
        ProductServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun archiveProduct(
        params: ProductArchiveProductParams,
        requestOptions: RequestOptions,
    ): Product =
        // post /api/v1/products/{id}/archive
        withRawResponse().archiveProduct(params, requestOptions).parse()

    override fun createProduct(
        params: ProductCreateProductParams,
        requestOptions: RequestOptions,
    ): Product =
        // post /api/v1/products
        withRawResponse().createProduct(params, requestOptions).parse()

    override fun duplicateProduct(
        params: ProductDuplicateProductParams,
        requestOptions: RequestOptions,
    ): Product =
        // post /api/v1/products/{id}/duplicate
        withRawResponse().duplicateProduct(params, requestOptions).parse()

    override fun listProducts(
        params: ProductListProductsParams,
        requestOptions: RequestOptions,
    ): ProductListProductsPage =
        // get /api/v1/products
        withRawResponse().listProducts(params, requestOptions).parse()

    override fun unarchiveProduct(
        params: ProductUnarchiveProductParams,
        requestOptions: RequestOptions,
    ): Product =
        // post /api/v1/products/{id}/unarchive
        withRawResponse().unarchiveProduct(params, requestOptions).parse()

    override fun updateProduct(
        params: ProductUpdateProductParams,
        requestOptions: RequestOptions,
    ): Product =
        // patch /api/v1/products/{id}
        withRawResponse().updateProduct(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductService.WithRawResponse =
            ProductServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val archiveProductHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper)

        override fun archiveProduct(
            params: ProductArchiveProductParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveProductHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createProductHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper)

        override fun createProduct(
            params: ProductCreateProductParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createProductHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val duplicateProductHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper)

        override fun duplicateProduct(
            params: ProductDuplicateProductParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products", params._pathParam(0), "duplicate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { duplicateProductHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listProductsHandler: Handler<ProductListProductsPageResponse> =
            jsonHandler<ProductListProductsPageResponse>(clientOptions.jsonMapper)

        override fun listProducts(
            params: ProductListProductsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListProductsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listProductsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ProductListProductsPage.builder()
                            .service(ProductServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val unarchiveProductHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper)

        override fun unarchiveProduct(
            params: ProductUnarchiveProductParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products", params._pathParam(0), "unarchive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveProductHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateProductHandler: Handler<Product> =
            jsonHandler<Product>(clientOptions.jsonMapper)

        override fun updateProduct(
            params: ProductUpdateProductParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Product> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "products", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateProductHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
