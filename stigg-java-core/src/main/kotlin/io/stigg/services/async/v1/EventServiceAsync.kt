// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.events.EventEstimateParams
import io.stigg.models.v1.events.EventEstimateResponse
import io.stigg.models.v1.events.EventReportParams
import io.stigg.models.v1.events.EventReportResponse
import io.stigg.services.async.v1.events.BetaServiceAsync
import io.stigg.services.async.v1.events.DataExportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations related to usage & metering */
interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    fun dataExport(): DataExportServiceAsync

    fun beta(): BetaServiceAsync

    /**
     * Estimates the credit cost of a usage event without ingesting it. Returns the estimated cost
     * per credit currency, the current balance, and the balance after the estimated consumption.
     */
    fun estimate(params: EventEstimateParams): CompletableFuture<EventEstimateResponse> =
        estimate(params, RequestOptions.none())

    /** @see estimate */
    fun estimate(
        params: EventEstimateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventEstimateResponse>

    /**
     * Reports raw usage events for event-based metering. Events are ingested asynchronously and
     * aggregated into usage totals.
     */
    fun report(params: EventReportParams): CompletableFuture<EventReportResponse> =
        report(params, RequestOptions.none())

    /** @see report */
    fun report(
        params: EventReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventReportResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        fun dataExport(): DataExportServiceAsync.WithRawResponse

        fun beta(): BetaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/events/estimate`, but is otherwise the same
         * as [EventServiceAsync.estimate].
         */
        fun estimate(
            params: EventEstimateParams
        ): CompletableFuture<HttpResponseFor<EventEstimateResponse>> =
            estimate(params, RequestOptions.none())

        /** @see estimate */
        fun estimate(
            params: EventEstimateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventEstimateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/events`, but is otherwise the same as
         * [EventServiceAsync.report].
         */
        fun report(
            params: EventReportParams
        ): CompletableFuture<HttpResponseFor<EventReportResponse>> =
            report(params, RequestOptions.none())

        /** @see report */
        fun report(
            params: EventReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventReportResponse>>
    }
}
