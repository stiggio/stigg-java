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
import io.stigg.models.v1.entitytypes.EntityTypeArchiveParams
import io.stigg.models.v1.entitytypes.EntityTypeArchiveResponse
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesParams
import io.stigg.models.v1.entitytypes.EntityTypeCheckActiveEntitiesResponse
import io.stigg.models.v1.entitytypes.EntityTypeListPage
import io.stigg.models.v1.entitytypes.EntityTypeListPageResponse
import io.stigg.models.v1.entitytypes.EntityTypeListParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertParams
import io.stigg.models.v1.entitytypes.EntityTypeUpsertResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityTypeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityTypeService {

    private val withRawResponse: EntityTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityTypeService =
        EntityTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EntityTypeListParams,
        requestOptions: RequestOptions,
    ): EntityTypeListPage =
        // get /api/v1/entity-types
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: EntityTypeArchiveParams,
        requestOptions: RequestOptions,
    ): EntityTypeArchiveResponse =
        // post /api/v1/entity-types/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun checkActiveEntities(
        params: EntityTypeCheckActiveEntitiesParams,
        requestOptions: RequestOptions,
    ): EntityTypeCheckActiveEntitiesResponse =
        // get /api/v1/entity-types/{id}/has-active-entities
        withRawResponse().checkActiveEntities(params, requestOptions).parse()

    override fun upsert(
        params: EntityTypeUpsertParams,
        requestOptions: RequestOptions,
    ): EntityTypeUpsertResponse =
        // put /api/v1/entity-types
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityTypeService.WithRawResponse =
            EntityTypeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EntityTypeListPageResponse> =
            jsonHandler<EntityTypeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntityTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityTypeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "entity-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EntityTypeListPage.builder()
                            .service(EntityTypeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<EntityTypeArchiveResponse> =
            jsonHandler<EntityTypeArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: EntityTypeArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityTypeArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "entity-types", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkActiveEntitiesHandler: Handler<EntityTypeCheckActiveEntitiesResponse> =
            jsonHandler<EntityTypeCheckActiveEntitiesResponse>(clientOptions.jsonMapper)

        override fun checkActiveEntities(
            params: EntityTypeCheckActiveEntitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityTypeCheckActiveEntitiesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "entity-types",
                        params._pathParam(0),
                        "has-active-entities",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkActiveEntitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<EntityTypeUpsertResponse> =
            jsonHandler<EntityTypeUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntityTypeUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityTypeUpsertResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "entity-types")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
