// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.beta

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
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceParams
import io.stigg.models.v1.events.beta.customers.CustomerRetrieveGovernanceResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerService {

    private val withRawResponse: CustomerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService =
        CustomerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveGovernance(
        params: CustomerRetrieveGovernanceParams,
        requestOptions: RequestOptions,
    ): CustomerRetrieveGovernanceResponse =
        // get /api/v1-beta/customers/{id}/governance
        withRawResponse().retrieveGovernance(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerService.WithRawResponse =
            CustomerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveGovernanceHandler: Handler<CustomerRetrieveGovernanceResponse> =
            jsonHandler<CustomerRetrieveGovernanceResponse>(clientOptions.jsonMapper)

        override fun retrieveGovernance(
            params: CustomerRetrieveGovernanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrieveGovernanceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "governance",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveGovernanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
