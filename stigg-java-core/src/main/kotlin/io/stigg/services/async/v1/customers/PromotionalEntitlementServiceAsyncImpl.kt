// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

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
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantResponse
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PromotionalEntitlementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PromotionalEntitlementServiceAsync {

    private val withRawResponse: PromotionalEntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromotionalEntitlementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PromotionalEntitlementServiceAsync =
        PromotionalEntitlementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun grant(
        params: PromotionalEntitlementGrantParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromotionalEntitlementGrantResponse> =
        // post /api/v1/customers/{customerId}/promotional
        withRawResponse().grant(params, requestOptions).thenApply { it.parse() }

    override fun revoke(
        params: PromotionalEntitlementRevokeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromotionalEntitlementRevokeResponse> =
        // delete /api/v1/customers/{customerId}/promotional/{featureId}
        withRawResponse().revoke(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromotionalEntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalEntitlementServiceAsync.WithRawResponse =
            PromotionalEntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val grantHandler: Handler<PromotionalEntitlementGrantResponse> =
            jsonHandler<PromotionalEntitlementGrantResponse>(clientOptions.jsonMapper)

        override fun grant(
            params: PromotionalEntitlementGrantParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementGrantResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "customers", params._pathParam(0), "promotional")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { grantHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val revokeHandler: Handler<PromotionalEntitlementRevokeResponse> =
            jsonHandler<PromotionalEntitlementRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: PromotionalEntitlementRevokeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementRevokeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("featureId", params.featureId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "promotional",
                        params._pathParam(1),
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
                            .use { revokeHandler.handle(it) }
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
