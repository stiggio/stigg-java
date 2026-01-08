// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.customers

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
import com.stigg.api.core.handlers.errorBodyHandler
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateParams
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateResponse
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeParams
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PromotionalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromotionalService {

    private val withRawResponse: PromotionalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromotionalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromotionalService =
        PromotionalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PromotionalCreateParams,
        requestOptions: RequestOptions,
    ): PromotionalCreateResponse =
        // post /api/v1/customers/{customerId}/promotional
        withRawResponse().create(params, requestOptions).parse()

    override fun revoke(
        params: PromotionalRevokeParams,
        requestOptions: RequestOptions,
    ): PromotionalRevokeResponse =
        // delete /api/v1/customers/{customerId}/promotional/featureId/{featureId}
        withRawResponse().revoke(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromotionalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalService.WithRawResponse =
            PromotionalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PromotionalCreateResponse> =
            jsonHandler<PromotionalCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PromotionalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromotionalCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "promotional")
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

        private val revokeHandler: Handler<PromotionalRevokeResponse> =
            jsonHandler<PromotionalRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: PromotionalRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromotionalRevokeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("featureId", params.featureId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "promotional",
                        "featureId",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
