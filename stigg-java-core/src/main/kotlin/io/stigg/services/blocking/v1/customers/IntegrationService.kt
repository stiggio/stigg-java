// File generated from our OpenAPI spec by Stainless.

package io.stigg.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import io.stigg.core.ClientOptions
import io.stigg.core.RequestOptions
import io.stigg.core.http.HttpResponseFor
import io.stigg.models.v1.customers.CustomerIntegrationResponse
import io.stigg.models.v1.customers.integrations.IntegrationLinkParams
import io.stigg.models.v1.customers.integrations.IntegrationListPage
import io.stigg.models.v1.customers.integrations.IntegrationListParams
import io.stigg.models.v1.customers.integrations.IntegrationRetrieveParams
import io.stigg.models.v1.customers.integrations.IntegrationUnlinkParams
import io.stigg.models.v1.customers.integrations.IntegrationUpdateParams
import java.util.function.Consumer

interface IntegrationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationService

    /** Retrieves a specific integration for a customer by integration ID. */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams,
    ): CustomerIntegrationResponse = retrieve(integrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        integrationId: String,
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse =
        retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: IntegrationRetrieveParams): CustomerIntegrationResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse

    /** Updates a customer's integration link, such as changing the synced external entity ID. */
    fun update(
        integrationId: String,
        params: IntegrationUpdateParams,
    ): CustomerIntegrationResponse = update(integrationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        integrationId: String,
        params: IntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse =
        update(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see update */
    fun update(params: IntegrationUpdateParams): CustomerIntegrationResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse

    /** Retrieves a paginated list of a customer's external integrations (billing, CRM, etc.). */
    fun list(id: String): IntegrationListPage = list(id, IntegrationListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: IntegrationListParams = IntegrationListParams.none(),
    ): IntegrationListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationListPage

    /** @see list */
    fun list(params: IntegrationListParams): IntegrationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): IntegrationListPage =
        list(id, IntegrationListParams.none(), requestOptions)

    /**
     * Links a customer to an external integration by specifying the vendor and external entity ID.
     */
    fun link(pathId: String, params: IntegrationLinkParams): CustomerIntegrationResponse =
        link(pathId, params, RequestOptions.none())

    /** @see link */
    fun link(
        pathId: String,
        params: IntegrationLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse = link(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see link */
    fun link(params: IntegrationLinkParams): CustomerIntegrationResponse =
        link(params, RequestOptions.none())

    /** @see link */
    fun link(
        params: IntegrationLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse

    /** Removes the link between a customer and an external integration. */
    fun unlink(
        integrationId: String,
        params: IntegrationUnlinkParams,
    ): CustomerIntegrationResponse = unlink(integrationId, params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        integrationId: String,
        params: IntegrationUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse =
        unlink(params.toBuilder().integrationId(integrationId).build(), requestOptions)

    /** @see unlink */
    fun unlink(params: IntegrationUnlinkParams): CustomerIntegrationResponse =
        unlink(params, RequestOptions.none())

    /** @see unlink */
    fun unlink(
        params: IntegrationUnlinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerIntegrationResponse

    /**
     * A view of [IntegrationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams,
        ): HttpResponseFor<CustomerIntegrationResponse> =
            retrieve(integrationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            integrationId: String,
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse> =
            retrieve(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IntegrationRetrieveParams
        ): HttpResponseFor<CustomerIntegrationResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationService.update].
         */
        @MustBeClosed
        fun update(
            integrationId: String,
            params: IntegrationUpdateParams,
        ): HttpResponseFor<CustomerIntegrationResponse> =
            update(integrationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            integrationId: String,
            params: IntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse> =
            update(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: IntegrationUpdateParams): HttpResponseFor<CustomerIntegrationResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: IntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/customers/{id}/integrations`, but is
         * otherwise the same as [IntegrationService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<IntegrationListPage> =
            list(id, IntegrationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: IntegrationListParams = IntegrationListParams.none(),
        ): HttpResponseFor<IntegrationListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: IntegrationListParams): HttpResponseFor<IntegrationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<IntegrationListPage> =
            list(id, IntegrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/customers/{id}/integrations`, but is
         * otherwise the same as [IntegrationService.link].
         */
        @MustBeClosed
        fun link(
            pathId: String,
            params: IntegrationLinkParams,
        ): HttpResponseFor<CustomerIntegrationResponse> =
            link(pathId, params, RequestOptions.none())

        /** @see link */
        @MustBeClosed
        fun link(
            pathId: String,
            params: IntegrationLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse> =
            link(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see link */
        @MustBeClosed
        fun link(params: IntegrationLinkParams): HttpResponseFor<CustomerIntegrationResponse> =
            link(params, RequestOptions.none())

        /** @see link */
        @MustBeClosed
        fun link(
            params: IntegrationLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/customers/{id}/integrations/{integrationId}`, but is otherwise the same as
         * [IntegrationService.unlink].
         */
        @MustBeClosed
        fun unlink(
            integrationId: String,
            params: IntegrationUnlinkParams,
        ): HttpResponseFor<CustomerIntegrationResponse> =
            unlink(integrationId, params, RequestOptions.none())

        /** @see unlink */
        @MustBeClosed
        fun unlink(
            integrationId: String,
            params: IntegrationUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse> =
            unlink(params.toBuilder().integrationId(integrationId).build(), requestOptions)

        /** @see unlink */
        @MustBeClosed
        fun unlink(params: IntegrationUnlinkParams): HttpResponseFor<CustomerIntegrationResponse> =
            unlink(params, RequestOptions.none())

        /** @see unlink */
        @MustBeClosed
        fun unlink(
            params: IntegrationUnlinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerIntegrationResponse>
    }
}
