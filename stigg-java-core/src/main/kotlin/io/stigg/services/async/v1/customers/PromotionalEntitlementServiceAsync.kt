// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantResponse
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PromotionalEntitlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromotionalEntitlementServiceAsync

    /** Create a promotional entitlements */
    fun grant(
        customerId: String,
        params: PromotionalEntitlementGrantParams,
    ): CompletableFuture<PromotionalEntitlementGrantResponse> =
        grant(customerId, params, RequestOptions.none())

    /** @see grant */
    fun grant(
        customerId: String,
        params: PromotionalEntitlementGrantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementGrantResponse> =
        grant(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see grant */
    fun grant(
        params: PromotionalEntitlementGrantParams
    ): CompletableFuture<PromotionalEntitlementGrantResponse> = grant(params, RequestOptions.none())

    /** @see grant */
    fun grant(
        params: PromotionalEntitlementGrantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementGrantResponse>

    /** Revoke promotional entitlement */
    fun revoke(
        featureId: String,
        params: PromotionalEntitlementRevokeParams,
    ): CompletableFuture<PromotionalEntitlementRevokeResponse> =
        revoke(featureId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        featureId: String,
        params: PromotionalEntitlementRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementRevokeResponse> =
        revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see revoke */
    fun revoke(
        params: PromotionalEntitlementRevokeParams
    ): CompletableFuture<PromotionalEntitlementRevokeResponse> =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: PromotionalEntitlementRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementRevokeResponse>

    /**
     * A view of [PromotionalEntitlementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromotionalEntitlementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{customerId}/promotional`, but is
         * otherwise the same as [PromotionalEntitlementServiceAsync.grant].
         */
        fun grant(
            customerId: String,
            params: PromotionalEntitlementGrantParams,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementGrantResponse>> =
            grant(customerId, params, RequestOptions.none())

        /** @see grant */
        fun grant(
            customerId: String,
            params: PromotionalEntitlementGrantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementGrantResponse>> =
            grant(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see grant */
        fun grant(
            params: PromotionalEntitlementGrantParams
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementGrantResponse>> =
            grant(params, RequestOptions.none())

        /** @see grant */
        fun grant(
            params: PromotionalEntitlementGrantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementGrantResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{customerId}/promotional/{featureId}`, but is otherwise the same as
         * [PromotionalEntitlementServiceAsync.revoke].
         */
        fun revoke(
            featureId: String,
            params: PromotionalEntitlementRevokeParams,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementRevokeResponse>> =
            revoke(featureId, params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            featureId: String,
            params: PromotionalEntitlementRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementRevokeResponse>> =
            revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see revoke */
        fun revoke(
            params: PromotionalEntitlementRevokeParams
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementRevokeResponse>> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            params: PromotionalEntitlementRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementRevokeResponse>>
    }
}
