// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v2

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v2.usage.UsageReportParams
import io.stigg.models.v2.usage.UsageReportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to usage & metering */
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
     * Reports usage measurements for metered features. The reported usage is used to track, limit,
     * and bill customer consumption. Credit balances are returned once per wallet in `credits`, not
     * on each measurement.
     */
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
         * Returns a raw HTTP response for `post /api/v2/usage`, but is otherwise the same as
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
