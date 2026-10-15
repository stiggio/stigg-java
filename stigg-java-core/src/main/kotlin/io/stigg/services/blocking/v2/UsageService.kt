// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v2

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v2.usage.UsageReportParams
import io.stigg.models.v2.usage.UsageReportResponse
import java.util.function.Consumer

/** Operations related to usage & metering */
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
     * Reports usage measurements for metered features. The reported usage is used to track, limit,
     * and bill customer consumption. Credit balances are returned once per wallet in `credits`, not
     * on each measurement.
     */
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
         * Returns a raw HTTP response for `post /api/v2/usage`, but is otherwise the same as
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
