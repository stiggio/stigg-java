// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

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
import io.stigg.core.prepareAsync
import io.stigg.models.v1.customers.CustomerResponse
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodAttachParams
import io.stigg.models.v1.customers.paymentmethod.PaymentMethodDetachParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PaymentMethodServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentMethodServiceAsync {

    private val withRawResponse: PaymentMethodServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentMethodServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentMethodServiceAsync =
        PaymentMethodServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attach(
        params: PaymentMethodAttachParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // post /api/v1/customers/{id}/payment-method
        withRawResponse().attach(params, requestOptions).thenApply { it.parse() }

    override fun detach(
        params: PaymentMethodDetachParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerResponse> =
        // delete /api/v1/customers/{id}/payment-method
        withRawResponse().detach(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentMethodServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentMethodServiceAsync.WithRawResponse =
            PaymentMethodServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val attachHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun attach(
            params: PaymentMethodAttachParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "payment-method",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { attachHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val detachHandler: Handler<CustomerResponse> =
            jsonHandler<CustomerResponse>(clientOptions.jsonMapper)

        override fun detach(
            params: PaymentMethodDetachParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerResponse>> {
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
                        "customers",
                        params._pathParam(0),
                        "payment-method",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { detachHandler.handle(it) }
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
