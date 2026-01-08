// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateParams
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateResponse
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeParams
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeResponse
import java.util.function.Consumer

interface PromotionalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromotionalService

    /** Create a new Promotional Entitlements */
    fun create(customerId: String, params: PromotionalCreateParams): PromotionalCreateResponse =
        create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        customerId: String,
        params: PromotionalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalCreateResponse =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(params: PromotionalCreateParams): PromotionalCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromotionalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalCreateResponse

    /** Perform revocation on a Promotional Entitlement */
    fun revoke(featureId: String, params: PromotionalRevokeParams): PromotionalRevokeResponse =
        revoke(featureId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        featureId: String,
        params: PromotionalRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalRevokeResponse =
        revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: PromotionalRevokeParams): PromotionalRevokeResponse =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: PromotionalRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalRevokeResponse

    /**
     * A view of [PromotionalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{customerId}/promotional`, but is
         * otherwise the same as [PromotionalService.create].
         */
        @MustBeClosed
        fun create(
            customerId: String,
            params: PromotionalCreateParams,
        ): HttpResponseFor<PromotionalCreateResponse> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            customerId: String,
            params: PromotionalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalCreateResponse> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PromotionalCreateParams): HttpResponseFor<PromotionalCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PromotionalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalCreateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{customerId}/promotional/featureId/{featureId}`, but is otherwise the
         * same as [PromotionalService.revoke].
         */
        @MustBeClosed
        fun revoke(
            featureId: String,
            params: PromotionalRevokeParams,
        ): HttpResponseFor<PromotionalRevokeResponse> =
            revoke(featureId, params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            featureId: String,
            params: PromotionalRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalRevokeResponse> =
            revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(params: PromotionalRevokeParams): HttpResponseFor<PromotionalRevokeResponse> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: PromotionalRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalRevokeResponse>
    }
}
