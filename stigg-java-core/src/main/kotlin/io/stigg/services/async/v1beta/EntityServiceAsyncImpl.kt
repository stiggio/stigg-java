// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1beta

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
import io.stigg.models.v1beta.entities.EntityArchiveParams
import io.stigg.models.v1beta.entities.EntityArchiveResponse
import io.stigg.models.v1beta.entities.EntityListPageAsync
import io.stigg.models.v1beta.entities.EntityListPageResponse
import io.stigg.models.v1beta.entities.EntityListParams
import io.stigg.models.v1beta.entities.EntityRetrieveParams
import io.stigg.models.v1beta.entities.EntityRetrieveResponse
import io.stigg.models.v1beta.entities.EntityUnarchiveParams
import io.stigg.models.v1beta.entities.EntityUnarchiveResponse
import io.stigg.models.v1beta.entities.EntityUpsertParams
import io.stigg.models.v1beta.entities.EntityUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityServiceAsync {

    private val withRawResponse: EntityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync =
        EntityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityRetrieveResponse> =
        // get /api/v1-beta/customers/{id}/entities/{entityId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EntityListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityListPageAsync> =
        // get /api/v1-beta/customers/{id}/entities
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityArchiveResponse> =
        // post /api/v1-beta/customers/{id}/entities/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun unarchive(
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityUnarchiveResponse> =
        // post /api/v1-beta/customers/{id}/entities/unarchive
        withRawResponse().unarchive(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: EntityUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityUpsertResponse> =
        // put /api/v1-beta/customers/{id}/entities
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityServiceAsync.WithRawResponse =
            EntityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EntityRetrieveResponse> =
            jsonHandler<EntityRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityId", params.entityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<EntityListPageResponse> =
            jsonHandler<EntityListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntityListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "entities",
                    )
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
                                EntityListPageAsync.builder()
                                    .service(EntityServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<EntityArchiveResponse> =
            jsonHandler<EntityArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityArchiveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "archive",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val unarchiveHandler: Handler<EntityUnarchiveResponse> =
            jsonHandler<EntityUnarchiveResponse>(clientOptions.jsonMapper)

        override fun unarchive(
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityUnarchiveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "unarchive",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val upsertHandler: Handler<EntityUpsertResponse> =
            jsonHandler<EntityUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntityUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityUpsertResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "entities",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { upsertHandler.handle(it) }
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
