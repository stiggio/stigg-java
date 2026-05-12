// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

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
import io.stigg.core.prepare
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeParams
import io.stigg.models.v1.credits.autorecharge.AutoRechargeGetAutoRechargeResponse
import java.util.function.Consumer

class AutoRechargeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoRechargeService {

    private val withRawResponse: AutoRechargeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoRechargeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoRechargeService =
        AutoRechargeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAutoRecharge(
        params: AutoRechargeGetAutoRechargeParams,
        requestOptions: RequestOptions,
    ): AutoRechargeGetAutoRechargeResponse =
        // get /api/v1/credits/auto-recharge
        withRawResponse().getAutoRecharge(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoRechargeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoRechargeService.WithRawResponse =
            AutoRechargeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAutoRechargeHandler: Handler<AutoRechargeGetAutoRechargeResponse> =
            jsonHandler<AutoRechargeGetAutoRechargeResponse>(clientOptions.jsonMapper)

        override fun getAutoRecharge(
            params: AutoRechargeGetAutoRechargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutoRechargeGetAutoRechargeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "auto-recharge")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
