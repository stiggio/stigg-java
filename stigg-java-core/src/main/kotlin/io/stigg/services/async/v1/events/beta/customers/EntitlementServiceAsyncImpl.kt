// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events.beta.customers

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
import io.stigg.core.prepareAsync
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckParams
import io.stigg.models.v1.events.beta.customers.entitlements.EntitlementCheckResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntitlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementServiceAsync {

    private val withRawResponse: EntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntitlementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntitlementServiceAsync =
        EntitlementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun check(
        params: EntitlementCheckParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntitlementCheckResponse> =
        // get /api/v1-beta/customers/{id}/entitlements/check
        withRawResponse().check(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntitlementServiceAsync.WithRawResponse =
            EntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHandler: Handler<EntitlementCheckResponse> =
            jsonHandler<EntitlementCheckResponse>(clientOptions.jsonMapper)

        override fun check(
            params: EntitlementCheckParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntitlementCheckResponse>> {
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
                        "entitlements",
                        "check",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkHandler.handle(it) }
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
