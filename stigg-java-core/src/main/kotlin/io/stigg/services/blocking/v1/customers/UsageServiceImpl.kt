// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

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
import io.stigg.core.http.parseable
import io.stigg.core.prepare
import io.stigg.models.v1.customers.usage.UsageRetrieveParams
import io.stigg.models.v1.customers.usage.UsageRetrieveResponse
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

    override fun retrieve(
        params: UsageRetrieveParams,
        requestOptions: RequestOptions,
    ): UsageRetrieveResponse =
        // get /api/v1/customers/{customerId}/usage/features/{featureId}
        withRawResponse().retrieve(params, requestOptions).parse()

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

        private val retrieveHandler: Handler<UsageRetrieveResponse> =
            jsonHandler<UsageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UsageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageRetrieveResponse> {
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
                        "customers",
                        params._pathParam(0),
                        "usage",
                        "features",
                        params._pathParam(1),
                    )
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
