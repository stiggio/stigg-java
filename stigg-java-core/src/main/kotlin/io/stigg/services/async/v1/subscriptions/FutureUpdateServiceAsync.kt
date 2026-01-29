// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.subscriptions

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.futureupdate.CancelSubscription
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import io.stigg.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FutureUpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FutureUpdateServiceAsync

    /** Cancel pending payment update */
    fun cancelPendingPayment(id: String): CompletableFuture<CancelSubscription> =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelSubscription> =
        cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
    ): CompletableFuture<CancelSubscription> =
        cancelPendingPayment(id, params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelSubscription>

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams
    ): CompletableFuture<CancelSubscription> = cancelPendingPayment(params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelSubscription> =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

    /** Cancel scheduled update */
    fun cancelSchedule(id: String): CompletableFuture<CancelSubscription> =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelSubscription> =
        cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
    ): CompletableFuture<CancelSubscription> = cancelSchedule(id, params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelSubscription>

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams
    ): CompletableFuture<CancelSubscription> = cancelSchedule(params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelSubscription> =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)

    /**
     * A view of [FutureUpdateServiceAsync] that provides access to raw HTTP responses for each
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
        ): FutureUpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/pending-payment`, but is otherwise the same as
         * [FutureUpdateServiceAsync.cancelPendingPayment].
         */
        fun cancelPendingPayment(
            id: String
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelPendingPayment(id, params, RequestOptions.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>>

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelPendingPayment(params, RequestOptions.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/schedule`, but is otherwise the same as
         * [FutureUpdateServiceAsync.cancelSchedule].
         */
        fun cancelSchedule(id: String): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelSchedule(id, params, RequestOptions.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelSubscription>>

        /** @see cancelSchedule */
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelSchedule(params, RequestOptions.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelSubscription>> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)
    }
}
