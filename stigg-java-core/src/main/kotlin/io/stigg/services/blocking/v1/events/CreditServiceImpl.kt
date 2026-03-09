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
import io.stigg.core.http.parseable
import io.stigg.core.prepare
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeResponse
import io.stigg.models.v1.events.credits.CreditGetUsageParams
import io.stigg.models.v1.events.credits.CreditGetUsageResponse
import io.stigg.models.v1.events.credits.CreditListLedgerPage
import io.stigg.models.v1.events.credits.CreditListLedgerPageResponse
import io.stigg.models.v1.events.credits.CreditListLedgerParams
import io.stigg.services.blocking.v1.events.credits.GrantService
import io.stigg.services.blocking.v1.events.credits.GrantServiceImpl
import java.util.function.Consumer

class CreditServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditService {

    private val withRawResponse: CreditService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val grants: GrantService by lazy { GrantServiceImpl(clientOptions) }

    override fun withRawResponse(): CreditService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditService =
        CreditServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to credit grants */
    override fun grants(): GrantService = grants

    override fun getAutoRecharge(
        params: CreditGetAutoRechargeParams,
        requestOptions: RequestOptions,
    ): CreditGetAutoRechargeResponse =
        // get /api/v1/credits/auto-recharge
        withRawResponse().getAutoRecharge(params, requestOptions).parse()

    override fun getUsage(
        params: CreditGetUsageParams,
        requestOptions: RequestOptions,
    ): CreditGetUsageResponse =
        // get /api/v1/credits/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    override fun listLedger(
        params: CreditListLedgerParams,
        requestOptions: RequestOptions,
    ): CreditListLedgerPage =
        // get /api/v1/credits/ledger
        withRawResponse().listLedger(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val grants: GrantService.WithRawResponse by lazy {
            GrantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditService.WithRawResponse =
            CreditServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to credit grants */
        override fun grants(): GrantService.WithRawResponse = grants

        private val getAutoRechargeHandler: Handler<CreditGetAutoRechargeResponse> =
            jsonHandler<CreditGetAutoRechargeResponse>(clientOptions.jsonMapper)

        override fun getAutoRecharge(
            params: CreditGetAutoRechargeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGetAutoRechargeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "auto-recharge")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAutoRechargeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUsageHandler: Handler<CreditGetUsageResponse> =
            jsonHandler<CreditGetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: CreditGetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGetUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLedgerHandler: Handler<CreditListLedgerPageResponse> =
            jsonHandler<CreditListLedgerPageResponse>(clientOptions.jsonMapper)

        override fun listLedger(
            params: CreditListLedgerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditListLedgerPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "ledger")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLedgerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CreditListLedgerPage.builder()
                            .service(CreditServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
