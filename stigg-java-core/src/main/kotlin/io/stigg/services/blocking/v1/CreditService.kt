// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.CreditGetUsageParams
import io.stigg.models.v1.credits.CreditGetUsageResponse
import io.stigg.models.v1.credits.CreditListLedgerPage
import io.stigg.models.v1.credits.CreditListLedgerParams
import io.stigg.services.blocking.v1.credits.AutoRechargeService
import io.stigg.services.blocking.v1.credits.CustomCurrencyService
import io.stigg.services.blocking.v1.credits.GrantService
import java.util.function.Consumer

interface CreditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditService

    /** Operations related to credit grants */
    fun grants(): GrantService

    /** Operations related to custom currencies */
    fun customCurrencies(): CustomCurrencyService

    fun autoRecharge(): AutoRechargeService

    /**
     * Retrieves credit usage time-series data for a customer, grouped by feature, over a specified
     * time range.
     */
    fun getUsage(params: CreditGetUsageParams): CreditGetUsageResponse =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: CreditGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditGetUsageResponse

    /** Retrieves a paginated list of credit ledger events for a customer. */
    fun listLedger(params: CreditListLedgerParams): CreditListLedgerPage =
        listLedger(params, RequestOptions.none())

    /** @see listLedger */
    fun listLedger(
        params: CreditListLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditListLedgerPage

    /** A view of [CreditService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditService.WithRawResponse

        /** Operations related to credit grants */
        fun grants(): GrantService.WithRawResponse

        /** Operations related to custom currencies */
        fun customCurrencies(): CustomCurrencyService.WithRawResponse

        fun autoRecharge(): AutoRechargeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/usage`, but is otherwise the same as
         * [CreditService.getUsage].
         */
        @MustBeClosed
        fun getUsage(params: CreditGetUsageParams): HttpResponseFor<CreditGetUsageResponse> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: CreditGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditGetUsageResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/credits/ledger`, but is otherwise the same
         * as [CreditService.listLedger].
         */
        @MustBeClosed
        fun listLedger(params: CreditListLedgerParams): HttpResponseFor<CreditListLedgerPage> =
            listLedger(params, RequestOptions.none())

        /** @see listLedger */
        @MustBeClosed
        fun listLedger(
            params: CreditListLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditListLedgerPage>
    }
}
