// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

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
import io.stigg.models.v1beta.customers.entities.EntityArchiveParams
import io.stigg.models.v1beta.customers.entities.EntityIdsActionResponseDto
import io.stigg.models.v1beta.customers.entities.EntityListPage
import io.stigg.models.v1beta.customers.entities.EntityListPageResponse
import io.stigg.models.v1beta.customers.entities.EntityListParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveParams
import io.stigg.models.v1beta.customers.entities.EntityRetrieveResponse
import io.stigg.models.v1beta.customers.entities.EntityUnarchiveParams
import io.stigg.models.v1beta.customers.entities.EntityUpsertParams
import io.stigg.models.v1beta.customers.entities.EntityUpsertResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityService {

    private val withRawResponse: EntityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService =
        EntityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions,
    ): EntityRetrieveResponse =
        // get /api/v1-beta/customers/{id}/entities/{entityId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EntityListParams, requestOptions: RequestOptions): EntityListPage =
        // get /api/v1-beta/customers/{id}/entities
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions,
    ): EntityIdsActionResponseDto =
        // post /api/v1-beta/customers/{id}/entities/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun unarchive(
        params: EntityUnarchiveParams,
        requestOptions: RequestOptions,
    ): EntityIdsActionResponseDto =
        // post /api/v1-beta/customers/{id}/entities/unarchive
        withRawResponse().unarchive(params, requestOptions).parse()

    override fun upsert(
        params: EntityUpsertParams,
        requestOptions: RequestOptions,
    ): EntityUpsertResponse =
        // put /api/v1-beta/customers/{id}/entities
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityService.WithRawResponse =
            EntityServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EntityRetrieveResponse> =
            jsonHandler<EntityRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityRetrieveResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EntityListPageResponse> =
            jsonHandler<EntityListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityListPage> {
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
                        EntityListPage.builder()
                            .service(EntityServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<EntityIdsActionResponseDto> =
            jsonHandler<EntityIdsActionResponseDto>(clientOptions.jsonMapper)

        override fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityIdsActionResponseDto> {
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

        private val unarchiveHandler: Handler<EntityIdsActionResponseDto> =
            jsonHandler<EntityIdsActionResponseDto>(clientOptions.jsonMapper)

        override fun unarchive(
            params: EntityUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityIdsActionResponseDto> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unarchiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<EntityUpsertResponse> =
            jsonHandler<EntityUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntityUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityUpsertResponse> {
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
