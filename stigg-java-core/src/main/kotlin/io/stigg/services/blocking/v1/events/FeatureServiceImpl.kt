// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

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
import io.stigg.models.v1.events.features.Feature
import io.stigg.models.v1.events.features.FeatureArchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureCreateFeatureParams
import io.stigg.models.v1.events.features.FeatureListFeaturesPage
import io.stigg.models.v1.events.features.FeatureListFeaturesPageResponse
import io.stigg.models.v1.events.features.FeatureListFeaturesParams
import io.stigg.models.v1.events.features.FeatureRetrieveFeatureParams
import io.stigg.models.v1.events.features.FeatureUnarchiveFeatureParams
import io.stigg.models.v1.events.features.FeatureUpdateFeatureParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeatureServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureService {

    private val withRawResponse: FeatureService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FeatureService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureService =
        FeatureServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun archiveFeature(
        params: FeatureArchiveFeatureParams,
        requestOptions: RequestOptions,
    ): Feature =
        // post /api/v1/features/{id}/archive
        withRawResponse().archiveFeature(params, requestOptions).parse()

    override fun createFeature(
        params: FeatureCreateFeatureParams,
        requestOptions: RequestOptions,
    ): Feature =
        // post /api/v1/features
        withRawResponse().createFeature(params, requestOptions).parse()

    override fun listFeatures(
        params: FeatureListFeaturesParams,
        requestOptions: RequestOptions,
    ): FeatureListFeaturesPage =
        // get /api/v1/features
        withRawResponse().listFeatures(params, requestOptions).parse()

    override fun retrieveFeature(
        params: FeatureRetrieveFeatureParams,
        requestOptions: RequestOptions,
    ): Feature =
        // get /api/v1/features/{id}
        withRawResponse().retrieveFeature(params, requestOptions).parse()

    override fun unarchiveFeature(
        params: FeatureUnarchiveFeatureParams,
        requestOptions: RequestOptions,
    ): Feature =
        // post /api/v1/features/{id}/unarchive
        withRawResponse().unarchiveFeature(params, requestOptions).parse()

    override fun updateFeature(
        params: FeatureUpdateFeatureParams,
        requestOptions: RequestOptions,
    ): Feature =
        // patch /api/v1/features/{id}
        withRawResponse().updateFeature(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureService.WithRawResponse =
            FeatureServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val archiveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun archiveFeature(
            params: FeatureArchiveFeatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Feature> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveFeatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun createFeature(
            params: FeatureCreateFeatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Feature> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createFeatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listFeaturesHandler: Handler<FeatureListFeaturesPageResponse> =
            jsonHandler<FeatureListFeaturesPageResponse>(clientOptions.jsonMapper)

        override fun listFeatures(
            params: FeatureListFeaturesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeatureListFeaturesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFeaturesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FeatureListFeaturesPage.builder()
                            .service(FeatureServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun retrieveFeature(
            params: FeatureRetrieveFeatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Feature> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "features", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveFeatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unarchiveFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun unarchiveFeature(
            params: FeatureUnarchiveFeatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Feature> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveFeatureHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFeatureHandler: Handler<Feature> =
            jsonHandler<Feature>(clientOptions.jsonMapper)

        override fun updateFeature(
            params: FeatureUpdateFeatureParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Feature> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
