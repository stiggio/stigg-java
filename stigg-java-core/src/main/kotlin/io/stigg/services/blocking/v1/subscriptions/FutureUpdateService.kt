// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.futureupdate.CancelSubscription
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
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
    fun cancelPendingPayment(id: String): CancelSubscription =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelSubscription = cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
    ): CancelSubscription = cancelPendingPayment(id, params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelSubscription

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(params: FutureUpdateCancelPendingPaymentParams): CancelSubscription =
        cancelPendingPayment(params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(id: String, requestOptions: RequestOptions): CancelSubscription =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

    /** Cancel scheduled update */
    fun cancelSchedule(id: String): CancelSubscription =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelSubscription = cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
    ): CancelSubscription = cancelSchedule(id, params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelSubscription

    /** @see cancelSchedule */
    fun cancelSchedule(params: FutureUpdateCancelScheduleParams): CancelSubscription =
        cancelSchedule(params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(id: String, requestOptions: RequestOptions): CancelSubscription =
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
        fun cancelPendingPayment(id: String): HttpResponseFor<CancelSubscription> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelSubscription> =
            cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
        ): HttpResponseFor<CancelSubscription> =
            cancelPendingPayment(id, params, RequestOptions.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelSubscription>

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams
        ): HttpResponseFor<CancelSubscription> = cancelPendingPayment(params, RequestOptions.none())

        /** @see cancelPendingPayment */
        @MustBeClosed
        fun cancelPendingPayment(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CancelSubscription> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/schedule`, but is otherwise the same as
         * [FutureUpdateService.cancelSchedule].
         */
        @MustBeClosed
        fun cancelSchedule(id: String): HttpResponseFor<CancelSubscription> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelSubscription> =
            cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        ): HttpResponseFor<CancelSubscription> = cancelSchedule(id, params, RequestOptions.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelSubscription>

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams
        ): HttpResponseFor<CancelSubscription> = cancelSchedule(params, RequestOptions.none())

        /** @see cancelSchedule */
        @MustBeClosed
        fun cancelSchedule(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CancelSubscription> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)
    }
}
