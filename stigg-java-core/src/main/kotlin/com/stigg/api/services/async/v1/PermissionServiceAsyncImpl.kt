// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.JsonValue
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.handlers.withErrorHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepareAsync
import com.stigg.api.models.v1.permissions.PermissionCheckParams
import com.stigg.api.models.v1.permissions.PermissionCheckResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PermissionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PermissionServiceAsync {

    private val withRawResponse: PermissionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PermissionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PermissionServiceAsync =
        PermissionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun check(
        params: PermissionCheckParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionCheckResponse> =
        // post /api/v1/permissions/check
        withRawResponse().check(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PermissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PermissionServiceAsync.WithRawResponse =
            PermissionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHandler: Handler<PermissionCheckResponse> =
            jsonHandler<PermissionCheckResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun check(
            params: PermissionCheckParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionCheckResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "permissions", "check")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
