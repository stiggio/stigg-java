// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

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
import com.stigg.api.core.prepareAsync
import com.stigg.api.models.v1.customers.CustomerGetCustomerParams
import com.stigg.api.models.v1.customers.CustomerGetCustomerResponse
import com.stigg.api.services.async.v1.customers.SubCustomerServiceAsync
import com.stigg.api.services.async.v1.customers.SubCustomerServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subCustomer: SubCustomerServiceAsync by lazy {
        SubCustomerServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun subCustomer(): SubCustomerServiceAsync = subCustomer

    override fun getCustomer(
        params: CustomerGetCustomerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerGetCustomerResponse> =
        // get /api/v1/customers/{refId}
        withRawResponse().getCustomer(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val subCustomer: SubCustomerServiceAsync.WithRawResponse by lazy {
            SubCustomerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun subCustomer(): SubCustomerServiceAsync.WithRawResponse = subCustomer

        private val getCustomerHandler: Handler<CustomerGetCustomerResponse> =
            jsonHandler<CustomerGetCustomerResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getCustomer(
            params: CustomerGetCustomerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerGetCustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("refId", params.refId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getCustomerHandler.handle(it) }
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
