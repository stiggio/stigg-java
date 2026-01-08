// File generated from our OpenAPI spec by Stainless.

package com.stigg.api.services.async.v1.customers

import com.stigg.api.core.ClientOptions
import com.stigg.api.core.RequestOptions
import com.stigg.api.core.http.HttpResponseFor
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateParams
import com.stigg.api.models.v1.customers.promotional.PromotionalCreateResponse
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeParams
import com.stigg.api.models.v1.customers.promotional.PromotionalRevokeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PromotionalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromotionalServiceAsync

    /** Create a new Promotional Entitlements */
    fun create(
        customerId: String,
        params: PromotionalCreateParams,
    ): CompletableFuture<PromotionalCreateResponse> =
        create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        customerId: String,
        params: PromotionalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalCreateResponse> =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(params: PromotionalCreateParams): CompletableFuture<PromotionalCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromotionalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalCreateResponse>

    /** Perform revocation on a Promotional Entitlement */
    fun revoke(
        featureId: String,
        params: PromotionalRevokeParams,
    ): CompletableFuture<PromotionalRevokeResponse> =
        revoke(featureId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        featureId: String,
        params: PromotionalRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalRevokeResponse> =
        revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: PromotionalRevokeParams): CompletableFuture<PromotionalRevokeResponse> =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: PromotionalRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalRevokeResponse>

    /**
     * A view of [PromotionalServiceAsync] that provides access to raw HTTP responses for each
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
        ): PromotionalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{customerId}/promotional`, but is
         * otherwise the same as [PromotionalServiceAsync.create].
         */
        fun create(
            customerId: String,
            params: PromotionalCreateParams,
        ): CompletableFuture<HttpResponseFor<PromotionalCreateResponse>> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        fun create(
            customerId: String,
            params: PromotionalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalCreateResponse>> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PromotionalCreateParams
        ): CompletableFuture<HttpResponseFor<PromotionalCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PromotionalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{customerId}/promotional/featureId/{featureId}`, but is otherwise the
         * same as [PromotionalServiceAsync.revoke].
         */
        fun revoke(
            featureId: String,
            params: PromotionalRevokeParams,
        ): CompletableFuture<HttpResponseFor<PromotionalRevokeResponse>> =
            revoke(featureId, params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            featureId: String,
            params: PromotionalRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalRevokeResponse>> =
            revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see revoke */
        fun revoke(
            params: PromotionalRevokeParams
        ): CompletableFuture<HttpResponseFor<PromotionalRevokeResponse>> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            params: PromotionalRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalRevokeResponse>>
    }
}
