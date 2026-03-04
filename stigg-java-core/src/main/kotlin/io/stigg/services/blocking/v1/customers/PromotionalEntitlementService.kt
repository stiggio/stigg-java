// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementCreateParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementCreateResponse
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementListPage
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementListParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeResponse
import java.util.function.Consumer

/** Operations related to promotional entitlements */
interface PromotionalEntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromotionalEntitlementService

    /**
     * Grants promotional entitlements to a customer, providing feature access outside their
     * subscription. Entitlements can be time-limited or permanent.
     */
    fun create(
        id: String,
        params: PromotionalEntitlementCreateParams,
    ): PromotionalEntitlementCreateResponse = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: PromotionalEntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementCreateResponse =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: PromotionalEntitlementCreateParams): PromotionalEntitlementCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromotionalEntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementCreateResponse

    /** Retrieves a paginated list of a customer's promotional entitlements. */
    fun list(id: String): PromotionalEntitlementListPage =
        list(id, PromotionalEntitlementListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
    ): PromotionalEntitlementListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PromotionalEntitlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementListPage

    /** @see list */
    fun list(params: PromotionalEntitlementListParams): PromotionalEntitlementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): PromotionalEntitlementListPage =
        list(id, PromotionalEntitlementListParams.none(), requestOptions)

    /**
     * Revokes a previously granted promotional entitlement from a customer for a specific feature.
     */
    fun revoke(
        featureId: String,
        params: PromotionalEntitlementRevokeParams,
    ): PromotionalEntitlementRevokeResponse = revoke(featureId, params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        featureId: String,
        params: PromotionalEntitlementRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementRevokeResponse =
        revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: PromotionalEntitlementRevokeParams): PromotionalEntitlementRevokeResponse =
        revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(
        params: PromotionalEntitlementRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementRevokeResponse

    /**
     * A view of [PromotionalEntitlementService] that provides access to raw HTTP responses for each
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
        ): PromotionalEntitlementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/promotional-entitlements`,
         * but is otherwise the same as [PromotionalEntitlementService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: PromotionalEntitlementCreateParams,
        ): HttpResponseFor<PromotionalEntitlementCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: PromotionalEntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: PromotionalEntitlementCreateParams
        ): HttpResponseFor<PromotionalEntitlementCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PromotionalEntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/promotional-entitlements`,
         * but is otherwise the same as [PromotionalEntitlementService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<PromotionalEntitlementListPage> =
            list(id, PromotionalEntitlementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PromotionalEntitlementListParams = PromotionalEntitlementListParams.none(),
        ): HttpResponseFor<PromotionalEntitlementListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PromotionalEntitlementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PromotionalEntitlementListParams
        ): HttpResponseFor<PromotionalEntitlementListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromotionalEntitlementListPage> =
            list(id, PromotionalEntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{id}/promotional-entitlements/{featureId}`, but is otherwise the same
         * as [PromotionalEntitlementService.revoke].
         */
        @MustBeClosed
        fun revoke(
            featureId: String,
            params: PromotionalEntitlementRevokeParams,
        ): HttpResponseFor<PromotionalEntitlementRevokeResponse> =
            revoke(featureId, params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            featureId: String,
            params: PromotionalEntitlementRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementRevokeResponse> =
            revoke(params.toBuilder().featureId(featureId).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: PromotionalEntitlementRevokeParams
        ): HttpResponseFor<PromotionalEntitlementRevokeResponse> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: PromotionalEntitlementRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementRevokeResponse>
    }
}
