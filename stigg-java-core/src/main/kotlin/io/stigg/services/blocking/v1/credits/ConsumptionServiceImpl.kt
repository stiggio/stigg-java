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
import io.stigg.core.http.json
import io.stigg.core.http.parseable
import io.stigg.core.prepare
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeAsyncResponse
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeParams
import io.stigg.models.v1.credits.consumption.ConsumptionConsumeResponse
import java.util.function.Consumer

class ConsumptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConsumptionService {

    private val withRawResponse: ConsumptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConsumptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsumptionService =
        ConsumptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun consume(
        params: ConsumptionConsumeParams,
        requestOptions: RequestOptions,
    ): ConsumptionConsumeResponse =
        // post /api/v1/credits/consumption
        withRawResponse().consume(params, requestOptions).parse()

    override fun consumeAsync(
        params: ConsumptionConsumeAsyncParams,
        requestOptions: RequestOptions,
    ): ConsumptionConsumeAsyncResponse =
        // post /api/v1/credits/consumption/async
        withRawResponse().consumeAsync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConsumptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConsumptionService.WithRawResponse =
            ConsumptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val consumeHandler: Handler<ConsumptionConsumeResponse> =
            jsonHandler<ConsumptionConsumeResponse>(clientOptions.jsonMapper)

        override fun consume(
            params: ConsumptionConsumeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConsumptionConsumeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "consumption")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { consumeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val consumeAsyncHandler: Handler<ConsumptionConsumeAsyncResponse> =
            jsonHandler<ConsumptionConsumeAsyncResponse>(clientOptions.jsonMapper)

        override fun consumeAsync(
            params: ConsumptionConsumeAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConsumptionConsumeAsyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "consumption", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { consumeAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
