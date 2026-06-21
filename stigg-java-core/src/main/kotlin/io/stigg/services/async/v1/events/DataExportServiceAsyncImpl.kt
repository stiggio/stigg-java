// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
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
import io.stigg.models.v1.events.dataexport.DataExportListModelsParams
import io.stigg.models.v1.events.dataexport.DataExportListModelsResponse
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenResponse
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncResponse
import io.stigg.services.async.v1.events.dataexport.DestinationServiceAsync
import io.stigg.services.async.v1.events.dataexport.DestinationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DataExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataExportServiceAsync {

    private val withRawResponse: DataExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationServiceAsync by lazy {
        DestinationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DataExportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataExportServiceAsync =
        DataExportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun destinations(): DestinationServiceAsync = destinations

    override fun listModels(
        params: DataExportListModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportListModelsResponse> =
        // get /api/v1/data-export/models
        withRawResponse().listModels(params, requestOptions).thenApply { it.parse() }

    override fun mintScopedToken(
        params: DataExportMintScopedTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportMintScopedTokenResponse> =
        // post /api/v1/data-export/scoped-token
        withRawResponse().mintScopedToken(params, requestOptions).thenApply { it.parse() }

    override fun triggerSync(
        params: DataExportTriggerSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportTriggerSyncResponse> =
        // post /api/v1/data-export/sync
        withRawResponse().triggerSync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val destinations: DestinationServiceAsync.WithRawResponse by lazy {
            DestinationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataExportServiceAsync.WithRawResponse =
            DataExportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun destinations(): DestinationServiceAsync.WithRawResponse = destinations

        private val listModelsHandler: Handler<DataExportListModelsResponse> =
            jsonHandler<DataExportListModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: DataExportListModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportListModelsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "models")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listModelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val mintScopedTokenHandler: Handler<DataExportMintScopedTokenResponse> =
            jsonHandler<DataExportMintScopedTokenResponse>(clientOptions.jsonMapper)

        override fun mintScopedToken(
            params: DataExportMintScopedTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportMintScopedTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "scoped-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { mintScopedTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerSyncHandler: Handler<DataExportTriggerSyncResponse> =
            jsonHandler<DataExportTriggerSyncResponse>(clientOptions.jsonMapper)

        override fun triggerSync(
            params: DataExportTriggerSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportTriggerSyncResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "sync")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerSyncHandler.handle(it) }
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
