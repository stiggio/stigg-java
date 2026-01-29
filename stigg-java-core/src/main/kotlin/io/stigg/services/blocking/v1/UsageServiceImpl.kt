// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

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
import io.stigg.core.prepare
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageHistoryResponse
import io.stigg.models.v1.usage.UsageReportParams
import io.stigg.models.v1.usage.UsageReportResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageService {

    private val withRawResponse: UsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService =
        UsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun history(
        params: UsageHistoryParams,
        requestOptions: RequestOptions,
    ): UsageHistoryResponse =
        // get /api/v1/usage/{customerId}/history/{featureId}
        withRawResponse().history(params, requestOptions).parse()

    override fun report(
        params: UsageReportParams,
        requestOptions: RequestOptions,
    ): UsageReportResponse =
        // post /api/v1/usage
        withRawResponse().report(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageService.WithRawResponse =
            UsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val historyHandler: Handler<UsageHistoryResponse> =
            jsonHandler<UsageHistoryResponse>(clientOptions.jsonMapper)

        override fun history(
            params: UsageHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageHistoryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("featureId", params.featureId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "usage",
                        params._pathParam(0),
                        "history",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { historyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reportHandler: Handler<UsageReportResponse> =
            jsonHandler<UsageReportResponse>(clientOptions.jsonMapper)

        override fun report(
            params: UsageReportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageReportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { reportHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
