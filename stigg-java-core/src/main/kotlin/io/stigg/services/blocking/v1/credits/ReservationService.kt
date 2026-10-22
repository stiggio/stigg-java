// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.credits

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.credits.reservations.ReservationReleaseParams
import io.stigg.models.v1.credits.reservations.ReservationReleaseResponse
import java.util.function.Consumer

interface ReservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReservationService

    /**
     * Releases a credit reservation, consuming the given amount and returning the rest of the held
     * credits to the balance. Retry a failed release with the same reservation ID; it is applied
     * once.
     */
    fun release(
        reservationId: String,
        params: ReservationReleaseParams,
    ): ReservationReleaseResponse = release(reservationId, params, RequestOptions.none())

    /** @see release */
    fun release(
        reservationId: String,
        params: ReservationReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReservationReleaseResponse =
        release(params.toBuilder().reservationId(reservationId).build(), requestOptions)

    /** @see release */
    fun release(params: ReservationReleaseParams): ReservationReleaseResponse =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(
        params: ReservationReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReservationReleaseResponse

    /**
     * A view of [ReservationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReservationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/credits/reservations/{reservationId}/release`, but is otherwise the same as
         * [ReservationService.release].
         */
        @MustBeClosed
        fun release(
            reservationId: String,
            params: ReservationReleaseParams,
        ): HttpResponseFor<ReservationReleaseResponse> =
            release(reservationId, params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            reservationId: String,
            params: ReservationReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReservationReleaseResponse> =
            release(params.toBuilder().reservationId(reservationId).build(), requestOptions)

        /** @see release */
        @MustBeClosed
        fun release(params: ReservationReleaseParams): HttpResponseFor<ReservationReleaseResponse> =
            release(params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            params: ReservationReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReservationReleaseResponse>
    }
}
