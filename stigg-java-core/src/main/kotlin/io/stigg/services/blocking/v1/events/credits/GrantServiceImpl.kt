// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.credits

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
import io.stigg.models.v1.events.credits.grants.CreditGrantResponse
import io.stigg.models.v1.events.credits.grants.GrantCreateParams
import io.stigg.models.v1.events.credits.grants.GrantListPage
import io.stigg.models.v1.events.credits.grants.GrantListPageResponse
import io.stigg.models.v1.events.credits.grants.GrantListParams
import io.stigg.models.v1.events.credits.grants.GrantVoidParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Operations related to credit grants */
class GrantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GrantService {

    private val withRawResponse: GrantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GrantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GrantService =
        GrantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GrantCreateParams,
        requestOptions: RequestOptions,
    ): CreditGrantResponse =
        // post /api/v1/credits/grants
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: GrantListParams, requestOptions: RequestOptions): GrantListPage =
        // get /api/v1/credits/grants
        withRawResponse().list(params, requestOptions).parse()

    override fun void_(
        params: GrantVoidParams,
        requestOptions: RequestOptions,
    ): CreditGrantResponse =
        // post /api/v1/credits/grants/{id}/void
        withRawResponse().void_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GrantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GrantService.WithRawResponse =
            GrantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditGrantResponse> =
            jsonHandler<CreditGrantResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GrantCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<GrantListPageResponse> =
            jsonHandler<GrantListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GrantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GrantListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants")
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
                        GrantListPage.builder()
                            .service(GrantServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val voidHandler: Handler<CreditGrantResponse> =
            jsonHandler<CreditGrantResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: GrantVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "grants", params._pathParam(0), "void")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { voidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
