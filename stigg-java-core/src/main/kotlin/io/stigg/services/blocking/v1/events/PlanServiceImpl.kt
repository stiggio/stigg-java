// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.events

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
import io.stigg.models.v1.events.addons.SetPackagePricingResponse
import io.stigg.models.v1.events.plans.Plan
import io.stigg.models.v1.events.plans.PlanArchiveParams
import io.stigg.models.v1.events.plans.PlanCreateParams
import io.stigg.models.v1.events.plans.PlanListPage
import io.stigg.models.v1.events.plans.PlanListPageResponse
import io.stigg.models.v1.events.plans.PlanListParams
import io.stigg.models.v1.events.plans.PlanPublishParams
import io.stigg.models.v1.events.plans.PlanPublishResponse
import io.stigg.models.v1.events.plans.PlanRetrieveParams
import io.stigg.models.v1.events.plans.PlanSetPricingParams
import io.stigg.models.v1.events.plans.PlanUpdateParams
import io.stigg.services.blocking.v1.events.plans.DraftService
import io.stigg.services.blocking.v1.events.plans.DraftServiceImpl
import io.stigg.services.blocking.v1.events.plans.EntitlementService
import io.stigg.services.blocking.v1.events.plans.EntitlementServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val draft: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService =
        PlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun draft(): DraftService = draft

    override fun entitlements(): EntitlementService = entitlements

    override fun create(params: PlanCreateParams, requestOptions: RequestOptions): Plan =
        // post /api/v1/plans
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PlanRetrieveParams, requestOptions: RequestOptions): Plan =
        // get /api/v1/plans/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PlanUpdateParams, requestOptions: RequestOptions): Plan =
        // patch /api/v1/plans/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage =
        // get /api/v1/plans
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: PlanArchiveParams, requestOptions: RequestOptions): Plan =
        // post /api/v1/plans/{id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun publish(
        params: PlanPublishParams,
        requestOptions: RequestOptions,
    ): PlanPublishResponse =
        // post /api/v1/plans/{id}/publish
        withRawResponse().publish(params, requestOptions).parse()

    override fun setPricing(
        params: PlanSetPricingParams,
        requestOptions: RequestOptions,
    ): SetPackagePricingResponse =
        // put /api/v1/plans/{id}/charges
        withRawResponse().setPricing(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val draft: DraftService.WithRawResponse by lazy {
            DraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanService.WithRawResponse =
            PlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun draft(): DraftService.WithRawResponse = draft

        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        private val createHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans")
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

        private val retrieveHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0))
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

        private val updateHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PlanListPageResponse> =
            jsonHandler<PlanListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans")
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
                        PlanListPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun archive(
            params: PlanArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val publishHandler: Handler<PlanPublishResponse> =
            jsonHandler<PlanPublishResponse>(clientOptions.jsonMapper)

        override fun publish(
            params: PlanPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanPublishResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0), "publish")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setPricingHandler: Handler<SetPackagePricingResponse> =
            jsonHandler<SetPackagePricingResponse>(clientOptions.jsonMapper)

        override fun setPricing(
            params: PlanSetPricingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SetPackagePricingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "plans", params._pathParam(0), "charges")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setPricingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
