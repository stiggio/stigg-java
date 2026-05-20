// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.events

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeParams
import io.stigg.models.v1.events.credits.CreditGetAutoRechargeResponse
import io.stigg.models.v1.events.credits.CreditGetUsageParams
import io.stigg.models.v1.events.credits.CreditGetUsageResponse
import io.stigg.models.v1.events.credits.CreditListLedgerPageAsync
import io.stigg.models.v1.events.credits.CreditListLedgerParams
import io.stigg.services.async.v1.events.credits.CustomCurrencyServiceAsync
import io.stigg.services.async.v1.events.credits.GrantServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditServiceAsync

    /** Operations related to credit grants */
    fun grants(): GrantServiceAsync

    /** Operations related to custom currencies */
    fun customCurrencies(): CustomCurrencyServiceAsync

    /**
     * Retrieves the automatic recharge configuration for a customer and currency. Returns default
     * settings if no configuration exists.
     */
    fun getAutoRecharge(
        params: CreditGetAutoRechargeParams
    ): CompletableFuture<CreditGetAutoRechargeResponse> =
        getAutoRecharge(params, RequestOptions.none())

    /** @see getAutoRecharge */
    fun getAutoRecharge(
        params: CreditGetAutoRechargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGetAutoRechargeResponse>

    /**
     * Retrieves credit usage time-series data for a customer, grouped by feature, over a specified
     * time range.
     */
    fun getUsage(params: CreditGetUsageParams): CompletableFuture<CreditGetUsageResponse> =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: CreditGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditGetUsageResponse>

    /** Retrieves a paginated list of credit ledger events for a customer. */
    fun listLedger(params: CreditListLedgerParams): CompletableFuture<CreditListLedgerPageAsync> =
        listLedger(params, RequestOptions.none())

    /** @see listLedger */
    fun listLedger(
        params: CreditListLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditListLedgerPageAsync>

    /**
     * A view of [CreditServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditServiceAsync.WithRawResponse

        /** Operations related to credit grants */
        fun grants(): GrantServiceAsync.WithRawResponse

        /** Operations related to custom currencies */
        fun customCurrencies(): CustomCurrencyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/auto-recharge`, but is otherwise the
         * same as [CreditServiceAsync.getAutoRecharge].
         */
        fun getAutoRecharge(
            params: CreditGetAutoRechargeParams
        ): CompletableFuture<HttpResponseFor<CreditGetAutoRechargeResponse>> =
            getAutoRecharge(params, RequestOptions.none())

        /** @see getAutoRecharge */
        fun getAutoRecharge(
            params: CreditGetAutoRechargeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGetAutoRechargeResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/usage`, but is otherwise the same as
         * [CreditServiceAsync.getUsage].
         */
        fun getUsage(
            params: CreditGetUsageParams
        ): CompletableFuture<HttpResponseFor<CreditGetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            params: CreditGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditGetUsageResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/ledger`, but is otherwise the same
         * as [CreditServiceAsync.listLedger].
         */
        fun listLedger(
            params: CreditListLedgerParams
        ): CompletableFuture<HttpResponseFor<CreditListLedgerPageAsync>> =
            listLedger(params, RequestOptions.none())

        /** @see listLedger */
        fun listLedger(
            params: CreditListLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditListLedgerPageAsync>>
    }
}
