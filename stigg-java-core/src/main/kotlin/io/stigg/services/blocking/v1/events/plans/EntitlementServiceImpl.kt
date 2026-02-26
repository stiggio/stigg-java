// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.plans

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
import io.stigg.models.v1.events.plans.entitlements.EntitlementCreateParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementCreateResponse
import io.stigg.models.v1.events.plans.entitlements.EntitlementDeleteParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementListParams
import io.stigg.models.v1.events.plans.entitlements.EntitlementListResponse
import io.stigg.models.v1.events.plans.entitlements.EntitlementUpdateParams
import io.stigg.models.v1.events.plans.entitlements.PlanEntitlement
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

    override fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions,
    ): EntitlementCreateResponse =
        // post /api/v1/plans/{planId}/entitlements
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions,
    ): PlanEntitlement =
        // patch /api/v1/plans/{planId}/entitlements/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions,
    ): EntitlementListResponse =
        // get /api/v1/plans/{planId}/entitlements
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: EntitlementDeleteParams,
        requestOptions: RequestOptions,
    ): PlanEntitlement =
        // delete /api/v1/plans/{planId}/entitlements/{id}
        withRawResponse().delete(params, requestOptions).parse()

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

        private val createHandler: Handler<EntitlementCreateResponse> =
            jsonHandler<EntitlementCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0), "entitlements")
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

        private val updateHandler: Handler<PlanEntitlement> =
            jsonHandler<PlanEntitlement>(clientOptions.jsonMapper)

        override fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanEntitlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "plans",
                        params._pathParam(0),
                        "entitlements",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<EntitlementListResponse> =
            jsonHandler<EntitlementListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0), "entitlements")
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
            }
        }

        private val deleteHandler: Handler<PlanEntitlement> =
            jsonHandler<PlanEntitlement>(clientOptions.jsonMapper)

        override fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanEntitlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "plans",
                        params._pathParam(0),
                        "entitlements",
                        params._pathParam(1),
                    )
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
