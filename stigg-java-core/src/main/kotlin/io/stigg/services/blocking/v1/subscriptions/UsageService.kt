// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.subscriptions

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageParams
import io.stigg.models.v1.subscriptions.usage.UsageChargeUsageResponse
import io.stigg.models.v1.subscriptions.usage.UsageSyncParams
import io.stigg.models.v1.subscriptions.usage.UsageSyncResponse
import java.util.function.Consumer

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
     * Immediately charges usage for a subscription via the billing integration. Calculates usage
     * since the last charge and creates an invoice.
     */
    fun chargeUsage(id: String): UsageChargeUsageResponse =
        chargeUsage(id, UsageChargeUsageParams.none())

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageChargeUsageResponse = chargeUsage(params.toBuilder().id(id).build(), requestOptions)

    /** @see chargeUsage */
    fun chargeUsage(
        id: String,
        params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
    ): UsageChargeUsageResponse = chargeUsage(id, params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(
        params: UsageChargeUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageChargeUsageResponse

    /** @see chargeUsage */
    fun chargeUsage(params: UsageChargeUsageParams): UsageChargeUsageResponse =
        chargeUsage(params, RequestOptions.none())

    /** @see chargeUsage */
    fun chargeUsage(id: String, requestOptions: RequestOptions): UsageChargeUsageResponse =
        chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)

    /**
     * Triggers a usage sync for a subscription, reporting current usage to the billing provider.
     */
    fun sync(id: String): UsageSyncResponse = sync(id, UsageSyncParams.none())

    /** @see sync */
    fun sync(
        id: String,
        params: UsageSyncParams = UsageSyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageSyncResponse = sync(params.toBuilder().id(id).build(), requestOptions)

    /** @see sync */
    fun sync(id: String, params: UsageSyncParams = UsageSyncParams.none()): UsageSyncResponse =
        sync(id, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: UsageSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageSyncResponse

    /** @see sync */
    fun sync(params: UsageSyncParams): UsageSyncResponse = sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(id: String, requestOptions: RequestOptions): UsageSyncResponse =
        sync(id, UsageSyncParams.none(), requestOptions)

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/usage/charge`, but is
         * otherwise the same as [UsageService.chargeUsage].
         */
        @MustBeClosed
        fun chargeUsage(id: String): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, UsageChargeUsageParams.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(params.toBuilder().id(id).build(), requestOptions)

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            params: UsageChargeUsageParams = UsageChargeUsageParams.none(),
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, params, RequestOptions.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            params: UsageChargeUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageChargeUsageResponse>

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(params: UsageChargeUsageParams): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(params, RequestOptions.none())

        /** @see chargeUsage */
        @MustBeClosed
        fun chargeUsage(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageChargeUsageResponse> =
            chargeUsage(id, UsageChargeUsageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/subscriptions/{id}/usage/sync`, but is
         * otherwise the same as [UsageService.sync].
         */
        @MustBeClosed
        fun sync(id: String): HttpResponseFor<UsageSyncResponse> = sync(id, UsageSyncParams.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            id: String,
            params: UsageSyncParams = UsageSyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageSyncResponse> =
            sync(params.toBuilder().id(id).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        fun sync(
            id: String,
            params: UsageSyncParams = UsageSyncParams.none(),
        ): HttpResponseFor<UsageSyncResponse> = sync(id, params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(
            params: UsageSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageSyncResponse>

        /** @see sync */
        @MustBeClosed
        fun sync(params: UsageSyncParams): HttpResponseFor<UsageSyncResponse> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @MustBeClosed
        fun sync(id: String, requestOptions: RequestOptions): HttpResponseFor<UsageSyncResponse> =
            sync(id, UsageSyncParams.none(), requestOptions)
    }
}
