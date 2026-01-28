// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentResponse
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleResponse
import java.util.function.Consumer

interface FutureUpdateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FutureUpdateService

    /** Cancel pending payment update */
    fun cancelPendingPayment(id: String): FutureUpdateCancelPendingPaymentResponse =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FutureUpdateCancelPendingPaymentResponse =
        cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
    ): FutureUpdateCancelPendingPaymentResponse =
        cancelPendingPayment(id, params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FutureUpdateCancelPendingPaymentResponse

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams
    ): FutureUpdateCancelPendingPaymentResponse =
        cancelPendingPayment(params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        requestOptions: RequestOptions,
    ): FutureUpdateCancelPendingPaymentResponse =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

    /** Cancel scheduled update */
    fun cancelSchedule(id: String): FutureUpdateCancelScheduleResponse =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FutureUpdateCancelScheduleResponse =
        cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
    ): FutureUpdateCancelScheduleResponse = cancelSchedule(id, params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FutureUpdateCancelScheduleResponse

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams
    ): FutureUpdateCancelScheduleResponse = cancelSchedule(params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        requestOptions: RequestOptions,
    ): FutureUpdateCancelScheduleResponse =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)

    /**
     * A view of [FutureUpdateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FutureUpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/pending-payment`, but is otherwise the same as
         * [FutureUpdateService.cancelPendingPayment].
         */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> =
            cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> =
            cancelPendingPayment(id, params, RequestOptions.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> =
            cancelPendingPayment(params, RequestOptions.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FutureUpdateCancelPendingPaymentResponse> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/schedule`, but is otherwise the same as
         * [FutureUpdateService.cancelSchedule].
         */
        @MustBeClosed
        fun cancelSchedule(id: String): HttpResponseFor<FutureUpdateCancelScheduleResponse> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse> =
            cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse> =
            cancelSchedule(id, params, RequestOptions.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse>

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse> =
            cancelSchedule(params, RequestOptions.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FutureUpdateCancelScheduleResponse> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)
    }
}
