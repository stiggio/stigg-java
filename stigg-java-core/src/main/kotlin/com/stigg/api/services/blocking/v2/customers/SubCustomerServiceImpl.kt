// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2.customers

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.JsonValue
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.handlers.withErrorHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerRetrieveParams
import com.stigg.api.models.v2.customers.subcustomer.SubCustomerRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubCustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubCustomerService {

    private val withRawResponse: SubCustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubCustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubCustomerService =
        SubCustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SubCustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): SubCustomerRetrieveResponse =
        // get /api/v1/customers/{refId}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubCustomerService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubCustomerService.WithRawResponse =
            SubCustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SubCustomerRetrieveResponse> =
            jsonHandler<SubCustomerRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: SubCustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubCustomerRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("refId", params.refId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
}
