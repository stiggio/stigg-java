// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events.addons

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
import io.stigg.models.v1.events.addons.Addon
import io.stigg.models.v1.events.addons.draft.DraftCreateAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftParams
import io.stigg.models.v1.events.addons.draft.DraftRemoveAddonDraftResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DraftServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DraftService {

    private val withRawResponse: DraftService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DraftService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService =
        DraftServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAddonDraft(
        params: DraftCreateAddonDraftParams,
        requestOptions: RequestOptions,
    ): Addon =
        // post /api/v1/addons/{id}/draft
        withRawResponse().createAddonDraft(params, requestOptions).parse()

    override fun removeAddonDraft(
        params: DraftRemoveAddonDraftParams,
        requestOptions: RequestOptions,
    ): DraftRemoveAddonDraftResponse =
        // delete /api/v1/addons/{id}/draft
        withRawResponse().removeAddonDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DraftService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftService.WithRawResponse =
            DraftServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAddonDraftHandler: Handler<Addon> =
            jsonHandler<Addon>(clientOptions.jsonMapper)

        override fun createAddonDraft(
            params: DraftCreateAddonDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Addon> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "draft")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAddonDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeAddonDraftHandler: Handler<DraftRemoveAddonDraftResponse> =
            jsonHandler<DraftRemoveAddonDraftResponse>(clientOptions.jsonMapper)

        override fun removeAddonDraft(
            params: DraftRemoveAddonDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DraftRemoveAddonDraftResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "addons", params._pathParam(0), "draft")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeAddonDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
