// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageHistoryResponse
import io.stigg.models.v1.usage.UsageReportParams
import io.stigg.models.v1.usage.UsageReportResponse
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

    /** Get usage history */
    fun history(
        featureId: String,
        params: UsageHistoryParams,
    ): CompletableFuture<UsageHistoryResponse> = history(featureId, params, RequestOptions.none())

    /** @see history */
    fun history(
        featureId: String,
        params: UsageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageHistoryResponse> =
        history(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see history */
    fun history(params: UsageHistoryParams): CompletableFuture<UsageHistoryResponse> =
        history(params, RequestOptions.none())

    /** @see history */
    fun history(
        params: UsageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageHistoryResponse>

    /** Report usage measurements */
    fun report(params: UsageReportParams): CompletableFuture<UsageReportResponse> =
        report(params, RequestOptions.none())

    /** @see report */
    fun report(
        params: UsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageReportResponse>

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
         * Returns a raw HTTP response for `get /api/v1/usage/{customerId}/history/{featureId}`, but
         * is otherwise the same as [UsageServiceAsync.history].
         */
        fun history(
            featureId: String,
            params: UsageHistoryParams,
        ): CompletableFuture<HttpResponseFor<UsageHistoryResponse>> =
            history(featureId, params, RequestOptions.none())

        /** @see history */
        fun history(
            featureId: String,
            params: UsageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageHistoryResponse>> =
            history(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see history */
        fun history(
            params: UsageHistoryParams
        ): CompletableFuture<HttpResponseFor<UsageHistoryResponse>> =
            history(params, RequestOptions.none())

        /** @see history */
        fun history(
            params: UsageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageHistoryResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/usage`, but is otherwise the same as
         * [UsageServiceAsync.report].
         */
        fun report(
            params: UsageReportParams
        ): CompletableFuture<HttpResponseFor<UsageReportResponse>> =
            report(params, RequestOptions.none())

        /** @see report */
        fun report(
            params: UsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageReportResponse>>
    }
}
