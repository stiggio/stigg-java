// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

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
import io.stigg.core.prepareAsync
import io.stigg.models.v1.customers.CustomerArchiveParams
import io.stigg.models.v1.customers.CustomerCreateParams
import io.stigg.models.v1.customers.CustomerListPageAsync
import io.stigg.models.v1.customers.CustomerListPageResponse
import io.stigg.models.v1.customers.CustomerListParams
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.CustomerRetrieveParams
import io.stigg.models.v1.customers.CustomerUnarchiveParams
import io.stigg.models.v1.customers.CustomerUpdateParams
import io.stigg.services.async.v1.customers.PaymentMethodServiceAsync
import io.stigg.services.async.v1.customers.PaymentMethodServiceAsyncImpl
import io.stigg.services.async.v1.customers.UsageServiceAsync
import io.stigg.services.async.v1.customers.UsageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val paymentMethod: PaymentMethodServiceAsync by lazy {
        PaymentMethodServiceAsyncImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun paymentMethod(): PaymentMethodServiceAsync = paymentMethod

    override fun usage(): UsageServiceAsync = usage

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // get /api/v1/customers/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // patch /api/v1/customers/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListPageAsync> =
        // get /api/v1/customers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers/{id}/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun unarchive(
        params: CustomerUnarchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val paymentMethod: PaymentMethodServiceAsync.WithRawResponse by lazy {
            PaymentMethodServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun paymentMethod(): PaymentMethodServiceAsync.WithRawResponse = paymentMethod

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        private val createHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerListPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: CustomerArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unarchiveHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: CustomerUnarchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "unarchive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unarchiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
