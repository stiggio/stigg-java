// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

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
import io.stigg.models.v1.events.addons.AddonArchiveAddonParams
import io.stigg.models.v1.events.addons.AddonArchiveAddonResponse
import io.stigg.models.v1.events.addons.AddonCreateAddonParams
import io.stigg.models.v1.events.addons.AddonCreateAddonResponse
import io.stigg.models.v1.events.addons.AddonListAddonsPageAsync
import io.stigg.models.v1.events.addons.AddonListAddonsPageResponse
import io.stigg.models.v1.events.addons.AddonListAddonsParams
import io.stigg.models.v1.events.addons.AddonPublishAddonParams
import io.stigg.models.v1.events.addons.AddonPublishAddonResponse
import io.stigg.models.v1.events.addons.AddonRetrieveAddonParams
import io.stigg.models.v1.events.addons.AddonRetrieveAddonResponse
import io.stigg.models.v1.events.addons.AddonUpdateAddonParams
import io.stigg.models.v1.events.addons.AddonUpdateAddonResponse
import io.stigg.services.async.v1.events.addons.DraftServiceAsync
import io.stigg.services.async.v1.events.addons.DraftServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AddonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AddonServiceAsync {

    private val withRawResponse: AddonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val draft: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AddonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddonServiceAsync =
        AddonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun draft(): DraftServiceAsync = draft

    override fun archiveAddon(
        params: AddonArchiveAddonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonArchiveAddonResponse> =
        // post /api/v1/addons/{id}/archive
        withRawResponse().archiveAddon(params, requestOptions).thenApply { it.parse() }

    override fun createAddon(
        params: AddonCreateAddonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonCreateAddonResponse> =
        // post /api/v1/addons
        withRawResponse().createAddon(params, requestOptions).thenApply { it.parse() }

    override fun listAddons(
        params: AddonListAddonsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonListAddonsPageAsync> =
        // get /api/v1/addons
        withRawResponse().listAddons(params, requestOptions).thenApply { it.parse() }

    override fun publishAddon(
        params: AddonPublishAddonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonPublishAddonResponse> =
        // post /api/v1/addons/{id}/publish
        withRawResponse().publishAddon(params, requestOptions).thenApply { it.parse() }

    override fun retrieveAddon(
        params: AddonRetrieveAddonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonRetrieveAddonResponse> =
        // get /api/v1/addons/{id}
        withRawResponse().retrieveAddon(params, requestOptions).thenApply { it.parse() }

    override fun updateAddon(
        params: AddonUpdateAddonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonUpdateAddonResponse> =
        // patch /api/v1/addons/{id}
        withRawResponse().updateAddon(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val draft: DraftServiceAsync.WithRawResponse by lazy {
            DraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddonServiceAsync.WithRawResponse =
            AddonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun draft(): DraftServiceAsync.WithRawResponse = draft

        private val archiveAddonHandler: Handler<AddonArchiveAddonResponse> =
            jsonHandler<AddonArchiveAddonResponse>(clientOptions.jsonMapper)

        override fun archiveAddon(
            params: AddonArchiveAddonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonArchiveAddonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveAddonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createAddonHandler: Handler<AddonCreateAddonResponse> =
            jsonHandler<AddonCreateAddonResponse>(clientOptions.jsonMapper)

        override fun createAddon(
            params: AddonCreateAddonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonCreateAddonResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAddonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listAddonsHandler: Handler<AddonListAddonsPageResponse> =
            jsonHandler<AddonListAddonsPageResponse>(clientOptions.jsonMapper)

        override fun listAddons(
            params: AddonListAddonsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonListAddonsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAddonsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AddonListAddonsPageAsync.builder()
                                    .service(AddonServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val publishAddonHandler: Handler<AddonPublishAddonResponse> =
            jsonHandler<AddonPublishAddonResponse>(clientOptions.jsonMapper)

        override fun publishAddon(
            params: AddonPublishAddonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonPublishAddonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "publish")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { publishAddonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveAddonHandler: Handler<AddonRetrieveAddonResponse> =
            jsonHandler<AddonRetrieveAddonResponse>(clientOptions.jsonMapper)

        override fun retrieveAddon(
            params: AddonRetrieveAddonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonRetrieveAddonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAddonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateAddonHandler: Handler<AddonUpdateAddonResponse> =
            jsonHandler<AddonUpdateAddonResponse>(clientOptions.jsonMapper)

        override fun updateAddon(
            params: AddonUpdateAddonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonUpdateAddonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateAddonHandler.handle(it) }
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
