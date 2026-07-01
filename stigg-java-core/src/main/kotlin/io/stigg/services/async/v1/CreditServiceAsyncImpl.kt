// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

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
import io.stigg.core.prepareAsync
import io.stigg.models.v1.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.credits.CreditGetAutoRechargeResponse
import io.stigg.models.v1.credits.CreditGetUsageParams
import io.stigg.models.v1.credits.CreditGetUsageResponse
import io.stigg.models.v1.credits.CreditListLedgerPageAsync
import io.stigg.models.v1.credits.CreditListLedgerPageResponse
import io.stigg.models.v1.credits.CreditListLedgerParams
import io.stigg.services.async.v1.credits.ConsumptionServiceAsync
import io.stigg.services.async.v1.credits.ConsumptionServiceAsyncImpl
import io.stigg.services.async.v1.credits.CustomCurrencyServiceAsync
import io.stigg.services.async.v1.credits.CustomCurrencyServiceAsyncImpl
import io.stigg.services.async.v1.credits.GrantServiceAsync
import io.stigg.services.async.v1.credits.GrantServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CreditServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditServiceAsync {

    private val withRawResponse: CreditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val grants: GrantServiceAsync by lazy { GrantServiceAsyncImpl(clientOptions) }

    private val customCurrencies: CustomCurrencyServiceAsync by lazy {
        CustomCurrencyServiceAsyncImpl(clientOptions)
    }

    private val consumption: ConsumptionServiceAsync by lazy {
        ConsumptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CreditServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditServiceAsync =
        CreditServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Operations related to credit grants */
    override fun grants(): GrantServiceAsync = grants

    /** Operations related to custom currencies */
    override fun customCurrencies(): CustomCurrencyServiceAsync = customCurrencies

    override fun consumption(): ConsumptionServiceAsync = consumption

    override fun getAutoRecharge(
        params: CreditGetAutoRechargeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGetAutoRechargeResponse> =
        // get /api/v1/credits/auto-recharge
        withRawResponse().getAutoRecharge(params, requestOptions).thenApply { it.parse() }

    override fun getUsage(
        params: CreditGetUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditGetUsageResponse> =
        // get /api/v1/credits/usage
        withRawResponse().getUsage(params, requestOptions).thenApply { it.parse() }

    override fun listLedger(
        params: CreditListLedgerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditListLedgerPageAsync> =
        // get /api/v1/credits/ledger
        withRawResponse().listLedger(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val grants: GrantServiceAsync.WithRawResponse by lazy {
            GrantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customCurrencies: CustomCurrencyServiceAsync.WithRawResponse by lazy {
            CustomCurrencyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val consumption: ConsumptionServiceAsync.WithRawResponse by lazy {
            ConsumptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditServiceAsync.WithRawResponse =
            CreditServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Operations related to credit grants */
        override fun grants(): GrantServiceAsync.WithRawResponse = grants

        /** Operations related to custom currencies */
        override fun customCurrencies(): CustomCurrencyServiceAsync.WithRawResponse =
            customCurrencies

        override fun consumption(): ConsumptionServiceAsync.WithRawResponse = consumption

        private val getAutoRechargeHandler: Handler<CreditGetAutoRechargeResponse> =
            jsonHandler<CreditGetAutoRechargeResponse>(clientOptions.jsonMapper)

        override fun getAutoRecharge(
            params: CreditGetAutoRechargeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGetAutoRechargeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "auto-recharge")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAutoRechargeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getUsageHandler: Handler<CreditGetUsageResponse> =
            jsonHandler<CreditGetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: CreditGetUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditGetUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listLedgerHandler: Handler<CreditListLedgerPageResponse> =
            jsonHandler<CreditListLedgerPageResponse>(clientOptions.jsonMapper)

        override fun listLedger(
            params: CreditListLedgerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditListLedgerPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "credits", "ledger")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLedgerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CreditListLedgerPageAsync.builder()
                                    .service(CreditServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
