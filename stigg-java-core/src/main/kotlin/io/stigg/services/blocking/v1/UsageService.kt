// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.usage.UsageHistoryParams
import io.stigg.models.v1.usage.UsageHistoryResponse
import io.stigg.models.v1.usage.UsageReportParams
import io.stigg.models.v1.usage.UsageReportResponse
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

    /** Get usage history */
    fun history(featureId: String, params: UsageHistoryParams): UsageHistoryResponse =
        history(featureId, params, RequestOptions.none())

    /** @see history */
    fun history(
        featureId: String,
        params: UsageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageHistoryResponse =
        history(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see history */
    fun history(params: UsageHistoryParams): UsageHistoryResponse =
        history(params, RequestOptions.none())

    /** @see history */
    fun history(
        params: UsageHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageHistoryResponse

    /** Report usage measurements */
    fun report(params: UsageReportParams): UsageReportResponse =
        report(params, RequestOptions.none())

    /** @see report */
    fun report(
        params: UsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageReportResponse

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/usage/{customerId}/history/{featureId}`, but
         * is otherwise the same as [UsageService.history].
         */
        @MustBeClosed
        fun history(
            featureId: String,
            params: UsageHistoryParams,
        ): HttpResponseFor<UsageHistoryResponse> = history(featureId, params, RequestOptions.none())

        /** @see history */
        @MustBeClosed
        fun history(
            featureId: String,
            params: UsageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageHistoryResponse> =
            history(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see history */
        @MustBeClosed
        fun history(params: UsageHistoryParams): HttpResponseFor<UsageHistoryResponse> =
            history(params, RequestOptions.none())

        /** @see history */
        @MustBeClosed
        fun history(
            params: UsageHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageHistoryResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/usage`, but is otherwise the same as
         * [UsageService.report].
         */
        @MustBeClosed
        fun report(params: UsageReportParams): HttpResponseFor<UsageReportResponse> =
            report(params, RequestOptions.none())

        /** @see report */
        @MustBeClosed
        fun report(
            params: UsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageReportResponse>
    }
}
