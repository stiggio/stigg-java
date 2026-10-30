// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers.entities

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
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPage
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListPageResponse
import io.stigg.models.v1.customers.entities.entitlements.EntitlementListParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertParams
import io.stigg.models.v1.customers.entities.entitlements.EntitlementUpsertResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntitlementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementService {

    private val withRawResponse: EntitlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementService =
        EntitlementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions,
    ): EntitlementListPage =
        // get /api/v1/customers/{id}/entities/entitlements
        withRawResponse().list(params, requestOptions).parse()

    override fun upsert(
        params: EntitlementUpsertParams,
        requestOptions: RequestOptions,
    ): EntitlementUpsertResponse =
        // put /api/v1/customers/{id}/entities/entitlements
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementService.WithRawResponse =
            EntitlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EntitlementListPageResponse> =
            jsonHandler<EntitlementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListPage> {
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
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "entitlements",
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
                        EntitlementListPage.builder()
                            .service(EntitlementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val upsertHandler: Handler<EntitlementUpsertResponse> =
            jsonHandler<EntitlementUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: EntitlementUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementUpsertResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "entities",
                        "entitlements",
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
