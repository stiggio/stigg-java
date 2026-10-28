// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1beta.customers

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
import io.stigg.models.v1beta.customers.governance.GovernanceListPage
import io.stigg.models.v1beta.customers.governance.GovernanceListPageResponse
import io.stigg.models.v1beta.customers.governance.GovernanceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GovernanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GovernanceService {

    private val withRawResponse: GovernanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GovernanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceService =
        GovernanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: GovernanceListParams,
        requestOptions: RequestOptions,
    ): GovernanceListPage =
        // get /api/v1-beta/customers/{id}/governance
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GovernanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceService.WithRawResponse =
            GovernanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<GovernanceListPageResponse> =
            jsonHandler<GovernanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GovernanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GovernanceListPage> {
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
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        GovernanceListPage.builder()
                            .service(GovernanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
