// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.handlers.errorBodyHandler
import io.stigg.core.handlers.errorHandler
import io.stigg.core.handlers.jsonHandler
import io.stigg.core.http.HttpMethod
import io.stigg.core.http.HttpRequest
import io.stigg.core.http.HttpResponse
import io.stigg.core.http.HttpResponse.Handler
import io.stigg.core.http.HttpResponseFor
import io.stigg.core.http.parseable
import io.stigg.core.prepareAsync
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AutoRechargeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoRechargeServiceAsync {

    private val withRawResponse: AutoRechargeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoRechargeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargeServiceAsync =
        AutoRechargeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutoRechargeGetAutoRechargeResponse> =
        // get /api/v1/credits/auto-recharge
        withRawResponse().getAutoRecharge(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoRechargeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoRechargeServiceAsync.WithRawResponse =
            AutoRechargeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAutoRechargeHandler: Handler<AutoRechargeGetAutoRechargeResponse> =
            jsonHandler<AutoRechargeGetAutoRechargeResponse>(clientOptions.jsonMapper)

        override fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutoRechargeGetAutoRechargeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "auto-recharge")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAutoRechargeHandler.handle(it) }
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
