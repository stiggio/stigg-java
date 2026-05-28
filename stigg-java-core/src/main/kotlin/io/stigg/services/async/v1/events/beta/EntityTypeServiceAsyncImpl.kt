// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta

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
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeListPageAsync
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeListPageResponse
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeListParams
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1.events.beta.entitytypes.EntityTypeUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EntityTypeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityTypeServiceAsync {

    private val withRawResponse: EntityTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityTypeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityTypeServiceAsync =
        EntityTypeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EntityTypeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityTypeListPageAsync> =
        // get /api/v1-beta/entity-types
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: EntityTypeUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityTypeUpsertResponse> =
        // put /api/v1-beta/entity-types
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityTypeServiceAsync.WithRawResponse =
            EntityTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EntityTypeListPageResponse> =
            jsonHandler<EntityTypeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntityTypeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityTypeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1-beta", "entity-types")
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
                                EntityTypeListPageAsync.builder()
                                    .service(EntityTypeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val upsertHandler: Handler<EntityTypeUpsertResponse> =
            jsonHandler<EntityTypeUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntityTypeUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityTypeUpsertResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1-beta", "entity-types")
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
