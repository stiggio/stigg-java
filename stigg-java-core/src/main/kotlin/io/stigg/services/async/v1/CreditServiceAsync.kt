// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.CreditGetUsageParams
import io.stigg.models.v1.credits.CreditGetUsageResponse
import io.stigg.models.v1.credits.CreditListLedgerPageAsync
import io.stigg.models.v1.credits.CreditListLedgerParams
import io.stigg.services.async.v1.credits.AutoRechargeServiceAsync
import io.stigg.services.async.v1.credits.CustomCurrencyServiceAsync
import io.stigg.services.async.v1.credits.GrantServiceAsync
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

    fun autoRecharge(): AutoRechargeServiceAsync

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

        fun autoRecharge(): AutoRechargeServiceAsync.WithRawResponse

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
