// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

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
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenParams
import io.stigg.models.v1.events.dataexport.DataExportMintScopedTokenResponse
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncParams
import io.stigg.models.v1.events.dataexport.DataExportTriggerSyncResponse
import io.stigg.services.blocking.v1.events.dataexport.DestinationService
import io.stigg.services.blocking.v1.events.dataexport.DestinationServiceImpl
import java.util.function.Consumer

class DataExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DataExportService {

    private val withRawResponse: DataExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationService by lazy { DestinationServiceImpl(clientOptions) }

    override fun withRawResponse(): DataExportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataExportService =
        DataExportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun destinations(): DestinationService = destinations

    override fun mintScopedToken(
        params: DataExportMintScopedTokenParams,
        requestOptions: RequestOptions,
    ): DataExportMintScopedTokenResponse =
        // post /api/v1/data-export/scoped-token
        withRawResponse().mintScopedToken(params, requestOptions).parse()

    override fun triggerSync(
        params: DataExportTriggerSyncParams,
        requestOptions: RequestOptions,
    ): DataExportTriggerSyncResponse =
        // post /api/v1/data-export/sync
        withRawResponse().triggerSync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataExportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val destinations: DestinationService.WithRawResponse by lazy {
            DestinationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataExportService.WithRawResponse =
            DataExportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun destinations(): DestinationService.WithRawResponse = destinations

        private val mintScopedTokenHandler: Handler<DataExportMintScopedTokenResponse> =
            jsonHandler<DataExportMintScopedTokenResponse>(clientOptions.jsonMapper)

        override fun mintScopedToken(
            params: DataExportMintScopedTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportMintScopedTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "scoped-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mintScopedTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerSyncHandler: Handler<DataExportTriggerSyncResponse> =
            jsonHandler<DataExportTriggerSyncResponse>(clientOptions.jsonMapper)

        override fun triggerSync(
            params: DataExportTriggerSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportTriggerSyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-export", "sync")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { triggerSyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
