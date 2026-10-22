// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.credits

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import io.stigg.models.v1.credits.reservations.ReservationReleaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReservationServiceAsync

    /**
     * Releases a credit reservation, consuming the given amount and returning the rest of the held
     * credits to the balance. Retry a failed release with the same reservation ID; it is applied
     * once.
     */
    fun release(
        reservationId: String,
        params: ReservationReleaseParams,
    ): CompletableFuture<ReservationReleaseResponse> =
        release(reservationId, params, RequestOptions.none())

    /** @see release */
    fun release(
        reservationId: String,
        params: ReservationReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReservationReleaseResponse> =
        release(params.toBuilder().reservationId(reservationId).build(), requestOptions)

    /** @see release */
    fun release(params: ReservationReleaseParams): CompletableFuture<ReservationReleaseResponse> =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(
        params: ReservationReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReservationReleaseResponse>

    /**
     * A view of [ReservationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReservationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/reservations/{reservationId}/release`, but is otherwise the same as
         * [ReservationServiceAsync.release].
         */
        fun release(
            reservationId: String,
            params: ReservationReleaseParams,
        ): CompletableFuture<HttpResponseFor<ReservationReleaseResponse>> =
            release(reservationId, params, RequestOptions.none())

        /** @see release */
        fun release(
            reservationId: String,
            params: ReservationReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReservationReleaseResponse>> =
            release(params.toBuilder().reservationId(reservationId).build(), requestOptions)

        /** @see release */
        fun release(
            params: ReservationReleaseParams
        ): CompletableFuture<HttpResponseFor<ReservationReleaseResponse>> =
            release(params, RequestOptions.none())

        /** @see release */
        fun release(
            params: ReservationReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReservationReleaseResponse>>
    }
}
