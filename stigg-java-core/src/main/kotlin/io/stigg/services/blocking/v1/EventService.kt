// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.EventReportParams
import io.stigg.models.v1.events.EventReportResponse
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /**
     * Reports raw usage events for event-based metering. Events are ingested asynchronously and
     * aggregated into usage totals.
     */
    fun report(params: EventReportParams): EventReportResponse =
        report(params, RequestOptions.none())

    /** @see report */
    fun report(
        params: EventReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventReportResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [EventService.report].
         */
        @MustBeClosed
        fun report(params: EventReportParams): HttpResponseFor<EventReportResponse> =
            report(params, RequestOptions.none())

        /** @see report */
        @MustBeClosed
        fun report(
            params: EventReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventReportResponse>
    }
}
