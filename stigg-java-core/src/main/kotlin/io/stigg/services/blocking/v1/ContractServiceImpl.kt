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
import io.stigg.models.v1.contracts.ContractCreateParams
import io.stigg.models.v1.contracts.ContractCreateResponse
import io.stigg.models.v1.contracts.ContractDeleteParams
import io.stigg.models.v1.contracts.ContractDeleteResponse
import io.stigg.models.v1.contracts.ContractListPage
import io.stigg.models.v1.contracts.ContractListPageResponse
import io.stigg.models.v1.contracts.ContractListParams
import io.stigg.models.v1.contracts.ContractRetrieveParams
import io.stigg.models.v1.contracts.ContractRetrieveResponse
import io.stigg.models.v1.contracts.ContractUpdateParams
import io.stigg.models.v1.contracts.ContractUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ContractServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContractService {

    private val withRawResponse: ContractService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContractService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService =
        ContractServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions,
    ): ContractCreateResponse =
        // post /api/v1/contracts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions,
    ): ContractRetrieveResponse =
        // get /api/v1/contracts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions,
    ): ContractUpdateResponse =
        // patch /api/v1/contracts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ContractListParams,
        requestOptions: RequestOptions,
    ): ContractListPage =
        // get /api/v1/contracts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions,
    ): ContractDeleteResponse =
        // post /api/v1/contracts/{id}/archive
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContractService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContractService.WithRawResponse =
            ContractServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ContractCreateResponse> =
            jsonHandler<ContractCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "contracts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ContractRetrieveResponse> =
            jsonHandler<ContractRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "contracts", params._pathParam(0))
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

        private val updateHandler: Handler<ContractUpdateResponse> =
            jsonHandler<ContractUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "contracts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ContractListPageResponse> =
            jsonHandler<ContractListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContractListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "contracts")
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
                        ContractListPage.builder()
                            .service(ContractServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ContractDeleteResponse> =
            jsonHandler<ContractDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "contracts", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
