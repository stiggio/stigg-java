// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v2

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
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v2.customers.CustomerRetrieveParams
import com.stigg.api.models.v2.customers.CustomerRetrieveResponse
import com.stigg.api.services.blocking.v2.customers.SubCustomerService
import com.stigg.api.services.blocking.v2.customers.SubCustomerServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subCustomer: SubCustomerService by lazy { SubCustomerServiceImpl(clientOptions) }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun subCustomer(): SubCustomerService = subCustomer

    override fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomerRetrieveResponse =
        // get /api/v1/customers/{refId}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val subCustomer: SubCustomerService.WithRawResponse by lazy {
            SubCustomerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun subCustomer(): SubCustomerService.WithRawResponse = subCustomer

        private val retrieveHandler: Handler<CustomerRetrieveResponse> =
            jsonHandler<CustomerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrieveResponse> {
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
    }
}
