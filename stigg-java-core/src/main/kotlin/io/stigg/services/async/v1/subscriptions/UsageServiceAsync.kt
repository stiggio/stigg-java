// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /**
     * Immediately charges usage for a subscription via the billing integration. Calculates usage
     * since the last charge and creates an invoice.
     */
    fun chargeUsage(id: String): CompletableFuture<UsageChargeUsageResponse> =
        chargeUsage(id, UsageChargeUsageParams.none())

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageChargeUsageResponse> =
        chargeUsage(params.toBuilder().id(id).build(), requestOptions)

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
    ): CompletableFuture<UsageChargeUsageResponse> = chargeUsage(id, params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(
        params: UsageChargeUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageChargeUsageResponse>

    /** @see chargeUsage */
    fun chargeUsage(params: UsageChargeUsageParams): CompletableFuture<UsageChargeUsageResponse> =
        chargeUsage(params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageChargeUsageResponse> =
        chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/usage/charge`, but is
         * otherwise the same as [UsageServiceAsync.chargeUsage].
         */
        fun chargeUsage(id: String): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> =
            chargeUsage(id, UsageChargeUsageParams.none())

        /** @see chargeUsage */
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> =
            chargeUsage(params.toBuilder().id(id).build(), requestOptions)

        /** @see chargeUsage */
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> =
            chargeUsage(id, params, RequestOptions.none())

        /** @see chargeUsage */
        fun chargeUsage(
            params: UsageChargeUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>>

        /** @see chargeUsage */
        fun chargeUsage(
            params: UsageChargeUsageParams
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> =
            chargeUsage(params, RequestOptions.none())

        /** @see chargeUsage */
        fun chargeUsage(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageChargeUsageResponse>> =
            chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)
    }
}
