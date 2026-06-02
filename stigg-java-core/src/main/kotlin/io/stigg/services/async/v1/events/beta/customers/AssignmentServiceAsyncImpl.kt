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
import io.stigg.core.http.json
import io.stigg.core.http.parseable
import io.stigg.core.prepareAsync
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentListPageAsync
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentListPageResponse
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentListParams
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentUpsertParams
import io.stigg.models.v1.events.beta.customers.assignments.AssignmentUpsertResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssignmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssignmentServiceAsync {

    private val withRawResponse: AssignmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssignmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssignmentServiceAsync =
        AssignmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AssignmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssignmentListPageAsync> =
        // get /api/v1-beta/customers/{id}/assignments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: AssignmentUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssignmentUpsertResponse> =
        // put /api/v1-beta/customers/{id}/assignments
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssignmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssignmentServiceAsync.WithRawResponse =
            AssignmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AssignmentListPageResponse> =
            jsonHandler<AssignmentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AssignmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssignmentListPageAsync>> {
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
                        "assignments",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AssignmentListPageAsync.builder()
                                    .service(AssignmentServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val upsertHandler: Handler<AssignmentUpsertResponse> =
            jsonHandler<AssignmentUpsertResponse>(clientOptions.jsonMapper)

        override fun upsert(
            params: AssignmentUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssignmentUpsertResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1-beta",
                        "customers",
                        params._pathParam(0),
                        "assignments",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { upsertHandler.handle(it) }
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
