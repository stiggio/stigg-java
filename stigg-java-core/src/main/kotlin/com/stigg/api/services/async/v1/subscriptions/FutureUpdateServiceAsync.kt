// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.subscriptions

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentParams
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelPendingPaymentResponse
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleParams
import com.stigg.api.models.v1.subscriptions.futureupdate.FutureUpdateCancelScheduleResponse
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

    /** Perform cancel future update on a Subscription */
    fun cancelPendingPayment(
        id: String
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        params: FutureUpdateCancelPendingPaymentParams =
            FutureUpdateCancelPendingPaymentParams.none(),
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        cancelPendingPayment(id, params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse>

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        params: FutureUpdateCancelPendingPaymentParams
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        cancelPendingPayment(params, RequestOptions.none())

    /** @see cancelPendingPayment */
    fun cancelPendingPayment(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FutureUpdateCancelPendingPaymentResponse> =
        cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

    /** Perform cancel future update on a Subscription */
    fun cancelSchedule(id: String): CompletableFuture<FutureUpdateCancelScheduleResponse> =
        cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FutureUpdateCancelScheduleResponse> =
        cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
    ): CompletableFuture<FutureUpdateCancelScheduleResponse> =
        cancelSchedule(id, params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FutureUpdateCancelScheduleResponse>

    /** @see cancelSchedule */
    fun cancelSchedule(
        params: FutureUpdateCancelScheduleParams
    ): CompletableFuture<FutureUpdateCancelScheduleResponse> =
        cancelSchedule(params, RequestOptions.none())

    /** @see cancelSchedule */
    fun cancelSchedule(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FutureUpdateCancelScheduleResponse> =
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
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> =
            cancelPendingPayment(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            params: FutureUpdateCancelPendingPaymentParams =
                FutureUpdateCancelPendingPaymentParams.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> =
            cancelPendingPayment(id, params, RequestOptions.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>>

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            params: FutureUpdateCancelPendingPaymentParams
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> =
            cancelPendingPayment(params, RequestOptions.none())

        /** @see cancelPendingPayment */
        fun cancelPendingPayment(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelPendingPaymentResponse>> =
            cancelPendingPayment(id, FutureUpdateCancelPendingPaymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/subscriptions/{id}/future-update/schedule`, but is otherwise the same as
         * [FutureUpdateServiceAsync.cancelSchedule].
         */
        fun cancelSchedule(
            id: String
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> =
            cancelSchedule(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            params: FutureUpdateCancelScheduleParams = FutureUpdateCancelScheduleParams.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> =
            cancelSchedule(id, params, RequestOptions.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>>

        /** @see cancelSchedule */
        fun cancelSchedule(
            params: FutureUpdateCancelScheduleParams
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> =
            cancelSchedule(params, RequestOptions.none())

        /** @see cancelSchedule */
        fun cancelSchedule(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FutureUpdateCancelScheduleResponse>> =
            cancelSchedule(id, FutureUpdateCancelScheduleParams.none(), requestOptions)
    }
}
