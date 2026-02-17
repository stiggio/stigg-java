// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageResponse
import io.stigg.models.v1.subscriptions.usage.UsageSyncUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageSyncUsageResponse
import java.util.function.Consumer

interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    /**
     * Immediately charges usage for a subscription via the billing integration. Calculates usage
     * since the last charge and creates an invoice.
     */
    fun chargeUsage(id: String): UsageChargeUsageResponse =
        chargeUsage(id, UsageChargeUsageParams.none())

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageChargeUsageResponse = chargeUsage(params.toBuilder().id(id).build(), requestOptions)

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
    ): UsageChargeUsageResponse = chargeUsage(id, params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(
        params: UsageChargeUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageChargeUsageResponse

    /** @see chargeUsage */
    fun chargeUsage(params: UsageChargeUsageParams): UsageChargeUsageResponse =
        chargeUsage(params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(id: String, requestOptions: RequestOptions): UsageChargeUsageResponse =
        chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)

    /**
     * Triggers a usage sync for a subscription, reporting current usage to the billing provider.
     */
    fun syncUsage(id: String): UsageSyncUsageResponse = syncUsage(id, UsageSyncUsageParams.none())

    /** @see syncUsage */
    fun syncUsage(
        id: String,
        params: UsageSyncUsageParams = UsageSyncUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageSyncUsageResponse = syncUsage(params.toBuilder().id(id).build(), requestOptions)

    /** @see syncUsage */
    fun syncUsage(
        id: String,
        params: UsageSyncUsageParams = UsageSyncUsageParams.none(),
    ): UsageSyncUsageResponse = syncUsage(id, params, RequestOptions.none())

    /** @see syncUsage */
    fun syncUsage(
        params: UsageSyncUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageSyncUsageResponse

    /** @see syncUsage */
    fun syncUsage(params: UsageSyncUsageParams): UsageSyncUsageResponse =
        syncUsage(params, RequestOptions.none())

    /** @see syncUsage */
    fun syncUsage(id: String, requestOptions: RequestOptions): UsageSyncUsageResponse =
        syncUsage(id, UsageSyncUsageParams.none(), requestOptions)

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/usage/charge`, but is
         * otherwise the same as [UsageService.chargeUsage].
         */
        @MustBeClosed
        fun chargeUsage(id: String): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, UsageChargeUsageParams.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(params.toBuilder().id(id).build(), requestOptions)

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, params, RequestOptions.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            params: UsageChargeUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageChargeUsageResponse>

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(params: UsageChargeUsageParams): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(params, RequestOptions.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/usage/sync`, but is
         * otherwise the same as [UsageService.syncUsage].
         */
        @MustBeClosed
        fun syncUsage(id: String): HttpResponseFor<UsageSyncUsageResponse> =
            syncUsage(id, UsageSyncUsageParams.none())

        /** @see syncUsage */
        @MustBeClosed
        fun syncUsage(
            id: String,
            params: UsageSyncUsageParams = UsageSyncUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageSyncUsageResponse> =
            syncUsage(params.toBuilder().id(id).build(), requestOptions)

        /** @see syncUsage */
        @MustBeClosed
        fun syncUsage(
            id: String,
            params: UsageSyncUsageParams = UsageSyncUsageParams.none(),
        ): HttpResponseFor<UsageSyncUsageResponse> = syncUsage(id, params, RequestOptions.none())

        /** @see syncUsage */
        @MustBeClosed
        fun syncUsage(
            params: UsageSyncUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageSyncUsageResponse>

        /** @see syncUsage */
        @MustBeClosed
        fun syncUsage(params: UsageSyncUsageParams): HttpResponseFor<UsageSyncUsageResponse> =
            syncUsage(params, RequestOptions.none())

        /** @see syncUsage */
        @MustBeClosed
        fun syncUsage(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageSyncUsageResponse> =
            syncUsage(id, UsageSyncUsageParams.none(), requestOptions)
    }
}
