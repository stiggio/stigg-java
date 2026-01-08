// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.checkRequired
import com.stigg.api.core.handlers.errorBodyHandler
import com.stigg.api.core.handlers.errorHandler
import com.stigg.api.core.handlers.jsonHandler
import com.stigg.api.core.http.HttpMethod
import com.stigg.api.core.http.HttpRequest
import com.stigg.api.core.http.HttpResponse
import com.stigg.api.core.http.HttpResponse.Handler
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.core.http.json
import com.stigg.api.core.http.parseable
import com.stigg.api.core.prepare
import com.stigg.api.models.v1.coupons.CouponCreateParams
import com.stigg.api.models.v1.coupons.CouponCreateResponse
import com.stigg.api.models.v1.coupons.CouponListParams
import com.stigg.api.models.v1.coupons.CouponListResponse
import com.stigg.api.models.v1.coupons.CouponRetrieveParams
import com.stigg.api.models.v1.coupons.CouponRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CouponServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponService {

    private val withRawResponse: CouponService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CouponService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CouponService =
        CouponServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions,
    ): CouponCreateResponse =
        // post /api/v1/coupons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CouponRetrieveParams,
        requestOptions: RequestOptions,
    ): CouponRetrieveResponse =
        // get /api/v1/coupons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CouponListParams,
        requestOptions: RequestOptions,
    ): CouponListResponse =
        // get /api/v1/coupons
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CouponService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CouponService.WithRawResponse =
            CouponServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CouponCreateResponse> =
            jsonHandler<CouponCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons")
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

        private val retrieveHandler: Handler<CouponRetrieveResponse> =
            jsonHandler<CouponRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CouponRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons", params._pathParam(0))
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

        private val listHandler: Handler<CouponListResponse> =
            jsonHandler<CouponListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CouponListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CouponListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "coupons")
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
            }
        }
    }
}
