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
import io.stigg.models.v1.subscriptions.Subscription
import io.stigg.models.v1.subscriptions.SubscriptionCancelParams
import io.stigg.models.v1.subscriptions.SubscriptionDelegateParams
import io.stigg.models.v1.subscriptions.SubscriptionImportParams
import io.stigg.models.v1.subscriptions.SubscriptionImportResponse
import io.stigg.models.v1.subscriptions.SubscriptionListPageAsync
import io.stigg.models.v1.subscriptions.SubscriptionListPageResponse
import io.stigg.models.v1.subscriptions.SubscriptionListParams
import io.stigg.models.v1.subscriptions.SubscriptionMigrateParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewParams
import io.stigg.models.v1.subscriptions.SubscriptionPreviewResponse
import io.stigg.models.v1.subscriptions.SubscriptionProvisionParams
import io.stigg.models.v1.subscriptions.SubscriptionProvisionResponse
import io.stigg.models.v1.subscriptions.SubscriptionRetrieveParams
import io.stigg.models.v1.subscriptions.SubscriptionTransferParams
import io.stigg.models.v1.subscriptions.SubscriptionUpdateParams
import io.stigg.services.async.v1.subscriptions.FutureUpdateServiceAsync
import io.stigg.services.async.v1.subscriptions.FutureUpdateServiceAsyncImpl
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

    override fun retrieve(
        params: SubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        // get /api/v1/subscriptions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        // patch /api/v1/subscriptions/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListPageAsync> =
        // get /api/v1/subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        // post /api/v1/subscriptions/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun delegate(
        params: SubscriptionDelegateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        // post /api/v1/subscriptions/{id}/delegate
        withRawResponse().delegate(params, requestOptions).thenApply { it.parse() }

    override fun import_(
        params: SubscriptionImportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionImportResponse> =
        // post /api/v1/subscriptions/import
        withRawResponse().import_(params, requestOptions).thenApply { it.parse() }

    override fun migrate(
        params: SubscriptionMigrateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
        // post /api/v1/subscriptions/{id}/migrate
        withRawResponse().migrate(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: SubscriptionPreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionPreviewResponse> =
        // post /api/v1/subscriptions/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    override fun provision(
        params: SubscriptionProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionProvisionResponse> =
        // post /api/v1/subscriptions
        withRawResponse().provision(params, requestOptions).thenApply { it.parse() }

    override fun transfer(
        params: SubscriptionTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Subscription> =
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

        private val retrieveHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
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

        private val updateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionListPageResponse> =
            jsonHandler<SubscriptionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> {
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
                            .let {
                                SubscriptionListPageAsync.builder()
                                    .service(SubscriptionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", params._pathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val delegateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun delegate(
            params: SubscriptionDelegateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
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

        private val importHandler: Handler<SubscriptionImportResponse> =
            jsonHandler<SubscriptionImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: SubscriptionImportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionImportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "subscriptions", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val migrateHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun migrate(
            params: SubscriptionMigrateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
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

        private val provisionHandler: Handler<SubscriptionProvisionResponse> =
            jsonHandler<SubscriptionProvisionResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: SubscriptionProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionProvisionResponse>> {
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
                            .use { provisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val transferHandler: Handler<Subscription> =
            jsonHandler<Subscription>(clientOptions.jsonMapper)

        override fun transfer(
            params: SubscriptionTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Subscription>> {
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
