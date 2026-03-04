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
import io.stigg.models.v1.features.Feature
import io.stigg.models.v1.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.features.FeatureCreateFeatureParams
import io.stigg.models.v1.features.FeatureListFeaturesPageAsync
import io.stigg.models.v1.features.FeatureListFeaturesPageResponse
import io.stigg.models.v1.features.FeatureListFeaturesParams
import io.stigg.models.v1.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.features.FeatureUpdateFeatureParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to features */
class FeatureServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureServiceAsync {

    private val withRawResponse: FeatureServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeatureServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureServiceAsync =
        FeatureServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Feature> =
        // post /api/v1/features/{id}/archive
        withRawResponse().archiveFeature(params, requestOptions).thenApply { it.parse() }

    override fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Feature> =
        // post /api/v1/features
        withRawResponse().createFeature(params, requestOptions).thenApply { it.parse() }

    override fun listFeatures(
        params: FeatureListFeaturesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeatureListFeaturesPageAsync> =
        // get /api/v1/features
        withRawResponse().listFeatures(params, requestOptions).thenApply { it.parse() }

    override fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Feature> =
        // get /api/v1/features/{id}
        withRawResponse().retrieveFeature(params, requestOptions).thenApply { it.parse() }

    override fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Feature> =
        // post /api/v1/features/{id}/unarchive
        withRawResponse().unarchiveFeature(params, requestOptions).thenApply { it.parse() }

    override fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Feature> =
        // patch /api/v1/features/{id}
        withRawResponse().updateFeature(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureServiceAsync.WithRawResponse =
            FeatureServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val archiveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archiveFeatureHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFeatureHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listFeaturesHandler: Handler<FeatureListFeaturesPageResponse> =
            jsonHandler<FeatureListFeaturesPageResponse>(clientOptions.jsonMapper)

        override fun listFeatures(
            params: FeatureListFeaturesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeatureListFeaturesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFeaturesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FeatureListFeaturesPageAsync.builder()
                                    .service(FeatureServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFeatureHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unarchiveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features", params._pathParam(0), "unarchive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unarchiveFeatureHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Feature>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateFeatureHandler.handle(it) }
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
