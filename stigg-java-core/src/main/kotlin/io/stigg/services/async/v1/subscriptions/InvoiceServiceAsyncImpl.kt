// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

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
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidParams
import io.stigg.models.v1.subscriptions.invoice.InvoiceMarkAsPaidResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to subscriptions */
class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val withRawResponse: InvoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync =
        InvoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun markAsPaid(
        params: InvoiceMarkAsPaidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceMarkAsPaidResponse> =
        // post /api/v1/subscriptions/{id}/invoice/paid
        withRawResponse().markAsPaid(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse =
            InvoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val markAsPaidHandler: Handler<InvoiceMarkAsPaidResponse> =
            jsonHandler<InvoiceMarkAsPaidResponse>(clientOptions.jsonMapper)

        override fun markAsPaid(
            params: InvoiceMarkAsPaidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceMarkAsPaidResponse>> {
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
                        "subscriptions",
                        params._pathParam(0),
                        "invoice",
                        "paid",
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
                            .use { markAsPaidHandler.handle(it) }
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
