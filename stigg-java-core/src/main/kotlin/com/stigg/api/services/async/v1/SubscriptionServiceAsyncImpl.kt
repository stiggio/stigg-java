// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
import com.stigg.api.core.handlers.errorBodyHandler
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepareAsync
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionCreateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionDelegateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionListParams
import com.stigg.api.models.v1.subscriptions.SubscriptionListResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateParams
import com.stigg.api.models.v1.subscriptions.SubscriptionMigrateResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewParams
import com.stigg.api.models.v1.subscriptions.SubscriptionPreviewResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveParams
import com.stigg.api.models.v1.subscriptions.SubscriptionRetrieveResponse
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferParams
import com.stigg.api.models.v1.subscriptions.SubscriptionTransferResponse
import com.stigg.api.services.async.v1.subscriptions.FutureUpdateServiceAsync
import com.stigg.api.services.async.v1.subscriptions.FutureUpdateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val futureUpdate: FutureUpdateServiceAsync by lazy {
        FutureUpdateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync =
        SubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun futureUpdate(): FutureUpdateServiceAsync = futureUpdate

    override fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionCreateResponse> =
        // post /api/v1/subscriptions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionRetrieveResponse> =
        // get /api/v1/subscriptions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        // get /api/v1/subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionDelegateResponse> =
        // post /api/v1/subscriptions/{id}/delegate
        withRawResponse().delegate(params, requestOptions).thenApply { it.parse() }

    override fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionMigrateResponse> =
        // post /api/v1/subscriptions/{id}/migrate
        withRawResponse().migrate(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionPreviewResponse> =
        // post /api/v1/subscriptions/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    override fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionTransferResponse> =
        // post /api/v1/subscriptions/{id}/transfer
        withRawResponse().transfer(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val futureUpdate: FutureUpdateServiceAsync.WithRawResponse by lazy {
            FutureUpdateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse =
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun futureUpdate(): FutureUpdateServiceAsync.WithRawResponse = futureUpdate

        private val createHandler: Handler<SubscriptionCreateResponse> =
            jsonHandler<SubscriptionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions")
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

        private val retrieveHandler: Handler<SubscriptionRetrieveResponse> =
            jsonHandler<SubscriptionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionListResponse> =
            jsonHandler<SubscriptionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions")
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
                    }
                }
        }

        private val delegateHandler: Handler<SubscriptionDelegateResponse> =
            jsonHandler<SubscriptionDelegateResponse>(clientOptions.jsonMapper)

        override fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionDelegateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "delegate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { delegateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val migrateHandler: Handler<SubscriptionMigrateResponse> =
            jsonHandler<SubscriptionMigrateResponse>(clientOptions.jsonMapper)

        override fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionMigrateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "migrate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { migrateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val previewHandler: Handler<SubscriptionPreviewResponse> =
            jsonHandler<SubscriptionPreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: SubscriptionPreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionPreviewResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { previewHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val transferHandler: Handler<SubscriptionTransferResponse> =
            jsonHandler<SubscriptionTransferResponse>(clientOptions.jsonMapper)

        override fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionTransferResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "transfer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { transferHandler.handle(it) }
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
