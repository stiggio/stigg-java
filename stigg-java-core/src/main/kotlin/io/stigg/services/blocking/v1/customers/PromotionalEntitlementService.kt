// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementGrantResponse
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeParams
import io.stigg.models.v1.customers.promotionalentitlements.PromotionalEntitlementRevokeResponse
import java.util.function.Consumer

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

    /** Create a promotional entitlements */
    fun grant(
        customerId: String,
        params: PromotionalEntitlementGrantParams,
    ): PromotionalEntitlementGrantResponse = grant(customerId, params, RequestOptions.none())

    /** @see grant */
    fun grant(
        customerId: String,
        params: PromotionalEntitlementGrantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementGrantResponse =
        grant(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see grant */
    fun grant(params: PromotionalEntitlementGrantParams): PromotionalEntitlementGrantResponse =
        grant(params, RequestOptions.none())

    /** @see grant */
    fun grant(
        params: PromotionalEntitlementGrantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromotionalEntitlementGrantResponse

    /** Revoke promotional entitlement */
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
         * Returns a raw HTTP response for `post /api/v1/customers/{customerId}/promotional`, but is
         * otherwise the same as [PromotionalEntitlementService.grant].
         */
        @MustBeClosed
        fun grant(
            customerId: String,
            params: PromotionalEntitlementGrantParams,
        ): HttpResponseFor<PromotionalEntitlementGrantResponse> =
            grant(customerId, params, RequestOptions.none())

        /** @see grant */
        @MustBeClosed
        fun grant(
            customerId: String,
            params: PromotionalEntitlementGrantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementGrantResponse> =
            grant(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see grant */
        @MustBeClosed
        fun grant(
            params: PromotionalEntitlementGrantParams
        ): HttpResponseFor<PromotionalEntitlementGrantResponse> =
            grant(params, RequestOptions.none())

        /** @see grant */
        @MustBeClosed
        fun grant(
            params: PromotionalEntitlementGrantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromotionalEntitlementGrantResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{customerId}/promotional/{featureId}`, but is otherwise the same as
         * [PromotionalEntitlementService.revoke].
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
