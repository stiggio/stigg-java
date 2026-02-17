// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.async.v1.customers

import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementCreateParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementCreateResponse
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementListPageAsync
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementListParams
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

    /**
     * Grants promotional entitlements to a customer, providing feature access outside their
     * subscription. Entitlements can be time-limited or permanent.
     */
    fun create(
        id: String,
        params: PromotionalEntitlementCreateParams,
    ): CompletableFuture<PromotionalEntitlementCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: PromotionalEntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        params: PromotionalEntitlementCreateParams
    ): CompletableFuture<PromotionalEntitlementCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromotionalEntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementCreateResponse>

    /** Retrieves a paginated list of a customer's promotional entitlements. */
    fun list(id: String): CompletableFuture<PromotionalEntitlementListPageAsync> =
        list(id, PromotionalEntitlementListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
    ): CompletableFuture<PromotionalEntitlementListPageAsync> =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PromotionalEntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromotionalEntitlementListPageAsync>

    /** @see list */
    fun list(
        params: PromotionalEntitlementListParams
    ): CompletableFuture<PromotionalEntitlementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromotionalEntitlementListPageAsync> =
        list(id, PromotionalEntitlementListParams.none(), requestOptions)

    /**
     * Revokes a previously granted promotional entitlement from a customer for a specific feature.
     */
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
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/promotional-entitlements`,
         * but is otherwise the same as [PromotionalEntitlementServiceAsync.create].
         */
        fun create(
            id: String,
            params: PromotionalEntitlementCreateParams,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: PromotionalEntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: PromotionalEntitlementCreateParams
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PromotionalEntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/promotional-entitlements`,
         * but is otherwise the same as [PromotionalEntitlementServiceAsync.list].
         */
        fun list(
            id: String
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>> =
            list(id, PromotionalEntitlementListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PromotionalEntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>>

        /** @see list */
        fun list(
            params: PromotionalEntitlementListParams
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromotionalEntitlementListPageAsync>> =
            list(id, PromotionalEntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{id}/promotional-entitlements/{featureId}`, but is otherwise the same
         * as [PromotionalEntitlementServiceAsync.revoke].
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
