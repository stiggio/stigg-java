// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async

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
import com.stigg.api.models.v1.V1RetrieveCustomerParams
import com.stigg.api.models.v1.V1RetrieveCustomerResponse
import com.stigg.api.services.async.v1.PermissionServiceAsync
import com.stigg.api.services.async.v1.PermissionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val permissions: PermissionServiceAsync by lazy {
        PermissionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun permissions(): PermissionServiceAsync = permissions

    override fun retrieveCustomer(
        params: V1RetrieveCustomerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveCustomerResponse> =
        // get /api/v1/customers/{refId}
        withRawResponse().retrieveCustomer(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val permissions: PermissionServiceAsync.WithRawResponse by lazy {
            PermissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun permissions(): PermissionServiceAsync.WithRawResponse = permissions

        private val retrieveCustomerHandler: Handler<V1RetrieveCustomerResponse> =
            jsonHandler<V1RetrieveCustomerResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveCustomer(
            params: V1RetrieveCustomerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveCustomerResponse>> {
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
                            .use { retrieveCustomerHandler.handle(it) }
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
